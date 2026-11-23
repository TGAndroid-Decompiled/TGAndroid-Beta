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
public final class in0 implements View.OnClickListener {
    public final int f48775a;
    public final PhotoViewer f48776b;

    public in0(PhotoViewer photoViewer, int i7) {
        this.f48775a = i7;
        this.f48776b = photoViewer;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        int i10;
        org.telegram.ui.Components.i61 i61Var;
        int i11;
        Bitmap bitmap;
        Bitmap bitmap2;
        jq0 jq0Var;
        fi.n2 n2Var;
        org.telegram.messenger.gj gjVar;
        org.telegram.messenger.lj b10;
        vq0 vq0Var;
        float f10 = 1.0f;
        boolean z10 = true;
        switch (this.f48775a) {
            case 0:
                PhotoViewer photoViewer = this.f48776b;
                Drawable[] drawableArr = PhotoViewer.Z8;
                photoViewer.f0();
                photoViewer.c3(0);
                return;
            case 1:
                PhotoViewer photoViewer2 = this.f48776b;
                if (photoViewer2.J1.a()) {
                    Activity activity = photoViewer2.E;
                    if (activity != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, photoViewer2.f43368w2);
                        alertDialog$Builder.f28743a.U = org.telegram.messenger.hd.N0(2131751393, "DiscardChanges");
                        alertDialog$Builder.f28743a.S = org.telegram.messenger.hd.N0(2131689472, "AppName");
                        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131747637, "OK"), new qn0(photoViewer2));
                        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, "Cancel"), null);
                        photoViewer2.Q2(alertDialog$Builder);
                        return;
                    }
                    return;
                }
                photoViewer2.c3(0);
                return;
            case 2:
                PhotoViewer photoViewer3 = this.f48776b;
                photoViewer3.Y7 = photoViewer3.f43178a8;
                photoViewer3.L0();
                photoViewer3.W2(false);
                photoViewer3.n2(2);
                return;
            case 3:
                PhotoViewer photoViewer4 = this.f48776b;
                Object obj = photoViewer4.f43234g7.get(photoViewer4.P4);
                if (obj instanceof org.telegram.messenger.ye) {
                    ((org.telegram.messenger.ye) obj).f28038s = photoViewer4.j1();
                }
                photoViewer4.W2(false);
                photoViewer4.n2(2);
                return;
            case 4:
                PhotoViewer photoViewer5 = this.f48776b;
                Drawable[] drawableArr2 = PhotoViewer.Z8;
                photoViewer5.u2(false, 0, 0, false, false, false);
                return;
            case 5:
                PhotoViewer photoViewer6 = this.f48776b;
                photoViewer6.f43361v5.m(false, true);
                photoViewer6.f43371w5.m(false, true);
                photoViewer6.c3(0);
                return;
            case 6:
                PhotoViewer photoViewer7 = this.f48776b;
                photoViewer7.f43361v5.m(false, true);
                photoViewer7.f43371w5.m(false, true);
                photoViewer7.f0();
                photoViewer7.c3(0);
                return;
            case 7:
                PhotoViewer photoViewer8 = this.f48776b;
                Drawable[] drawableArr3 = PhotoViewer.Z8;
                photoViewer8.c3(5);
                return;
            case 8:
                PhotoViewer photoViewer9 = this.f48776b;
                Drawable[] drawableArr4 = PhotoViewer.Z8;
                photoViewer9.y0();
                return;
            case 9:
                PhotoViewer photoViewer10 = this.f48776b;
                if (!photoViewer10.f43316q5.f35186b.R && (i7 = photoViewer10.P4) >= 0 && i7 < photoViewer10.f43234g7.size() && (photoViewer10.f43234g7.get(photoViewer10.P4) instanceof org.telegram.messenger.ff)) {
                    org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) photoViewer10.f43234g7.get(photoViewer10.P4);
                    long time = photoViewer10.f43316q5.getTime();
                    String v12 = PhotoViewer.v1();
                    photoViewer10.f43316q5.f35186b.setLoading(true);
                    Utilities.f22774e.c(new di.i2(photoViewer10, v12, ffVar, time, 22));
                    return;
                }
                return;
            case 10:
                final PhotoViewer photoViewer11 = this.f48776b;
                Drawable[] drawableArr5 = PhotoViewer.Z8;
                if (!photoViewer11.F1()) {
                    photoViewer11.f43320r = !photoViewer11.f43320r;
                    ArrayList arrayList = photoViewer11.f43245i1;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj2 = arrayList.get(i12);
                            i12++;
                            ((hi.l3) obj2).f(true);
                        }
                    }
                    if (photoViewer11.f43320r) {
                        final hi.l3 l3Var = new hi.l3(photoViewer11.E, 3);
                        l3Var.r(true);
                        l3Var.v(org.telegram.messenger.hd.N0(2131751197, null));
                        l3Var.h = hi.l3.a(l3Var.getText(), l3Var.getTextPaint());
                        l3Var.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
                        l3Var.o(0.0f, 22.0f);
                        l3Var.f14868r0 = new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        ArrayList arrayList2 = photoViewer11.f43245i1;
                                        if (arrayList2 != null) {
                                            arrayList2.remove(l3Var);
                                            return;
                                        }
                                        return;
                                    default:
                                        PhotoViewer photoViewer12 = photoViewer11;
                                        ArrayList arrayList3 = photoViewer12.f43245i1;
                                        hi.l3 l3Var2 = l3Var;
                                        if (arrayList3 != null) {
                                            arrayList3.remove(l3Var2);
                                        }
                                        ArrayList arrayList4 = photoViewer12.f43253j1;
                                        if (arrayList4 != null) {
                                            arrayList4.remove(l3Var2);
                                            return;
                                        }
                                        return;
                                }
                            }
                        };
                        if (photoViewer11.f43245i1 == null) {
                            photoViewer11.f43245i1 = new ArrayList();
                        }
                        photoViewer11.f43218f0.addView(l3Var, c8.na.e(-1, 200, 83));
                        photoViewer11.f43245i1.add(l3Var);
                        l3Var.x();
                    }
                    photoViewer11.v3();
                    photoViewer11.A3();
                    if (photoViewer11.f43320r) {
                        CheckBox checkBox = photoViewer11.O0;
                        if (!checkBox.f32825y) {
                            checkBox.callOnClick();
                            return;
                        }
                    }
                    Object obj3 = photoViewer11.f43234g7.get(photoViewer11.P4);
                    if (obj3 instanceof org.telegram.messenger.ye) {
                        ((org.telegram.messenger.ye) obj3).f28038s = photoViewer11.j1();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                final PhotoViewer photoViewer12 = this.f48776b;
                Drawable[] drawableArr6 = PhotoViewer.Z8;
                boolean O1 = photoViewer12.O1();
                boolean z11 = !O1;
                int i13 = photoViewer12.P4;
                if (i13 >= 0 && i13 < photoViewer12.f43234g7.size()) {
                    Object obj4 = photoViewer12.f43234g7.get(photoViewer12.P4);
                    if (obj4 instanceof org.telegram.messenger.ff) {
                        ((org.telegram.messenger.ff) obj4).O = Boolean.valueOf(z11);
                        SharedPreferences.Editor edit = org.telegram.messenger.t0.f26895b.getSharedPreferences("mainconfig", 0).edit();
                        org.telegram.messenger.cz.f23378i1 = O1;
                        edit.putBoolean("photoLiveDefault", O1).apply();
                        vq0 vq0Var2 = photoViewer12.d;
                        if (vq0Var2 != null) {
                            vq0Var2.m();
                        }
                    }
                }
                photoViewer12.f43228g1.a(!photoViewer12.O1(), true);
                ViewPropertyAnimator animate = photoViewer12.S7.animate();
                if (photoViewer12.O1()) {
                    f10 = 0.45f;
                }
                animate.alpha(f10).start();
                if (photoViewer12.O1() && (i61Var = photoViewer12.G2) != null) {
                    i61Var.g0();
                }
                photoViewer12.f43218f0.invalidate();
                if (photoViewer12.f43245i1 == null) {
                    photoViewer12.f43245i1 = new ArrayList();
                }
                if (photoViewer12.f43253j1 == null) {
                    photoViewer12.f43253j1 = new ArrayList();
                }
                ArrayList arrayList2 = photoViewer12.f43245i1;
                int size2 = arrayList2.size();
                int i14 = 0;
                while (i14 < size2) {
                    Object obj5 = arrayList2.get(i14);
                    i14++;
                    ((hi.l3) obj5).f(true);
                }
                final hi.l3 l3Var2 = new hi.l3(photoViewer12.E, 3);
                if (photoViewer12.O1()) {
                    i10 = 2131748643;
                } else {
                    i10 = 2131748642;
                }
                l3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(i10, null)));
                l3Var2.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
                l3Var2.o(0.0f, 28.0f);
                l3Var2.f14868r0 = new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                ArrayList arrayList22 = photoViewer12.f43245i1;
                                if (arrayList22 != null) {
                                    arrayList22.remove(l3Var2);
                                    return;
                                }
                                return;
                            default:
                                PhotoViewer photoViewer122 = photoViewer12;
                                ArrayList arrayList3 = photoViewer122.f43245i1;
                                hi.l3 l3Var22 = l3Var2;
                                if (arrayList3 != null) {
                                    arrayList3.remove(l3Var22);
                                }
                                ArrayList arrayList4 = photoViewer122.f43253j1;
                                if (arrayList4 != null) {
                                    arrayList4.remove(l3Var22);
                                    return;
                                }
                                return;
                        }
                    }
                };
                photoViewer12.f43218f0.addView(l3Var2, c8.na.e(-1, 200, 83));
                photoViewer12.f43245i1.add(l3Var2);
                photoViewer12.f43253j1.add(l3Var2);
                l3Var2.x();
                return;
            case 12:
                PhotoViewer photoViewer13 = this.f48776b;
                if (photoViewer13.d != null && !photoViewer13.F1()) {
                    photoViewer13.d.n();
                    photoViewer13.z0(true, false);
                    return;
                }
                return;
            case 13:
                PhotoViewer photoViewer14 = this.f48776b;
                if (photoViewer14.d != null && !photoViewer14.F1()) {
                    photoViewer14.d.n();
                    photoViewer14.z0(true, false);
                    return;
                }
                return;
            case 14:
                PhotoViewer photoViewer15 = this.f48776b;
                ArrayList arrayList3 = photoViewer15.f43234g7;
                if (!photoViewer15.f43363v7) {
                    jq0 jq0Var2 = photoViewer15.f43344t5;
                    if (!jq0Var2.R && jq0Var2.f58159o0 != 1 && (i11 = photoViewer15.P4) >= 0 && i11 < arrayList3.size() && !photoViewer15.f43307p5.W) {
                        org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) arrayList3.get(photoViewer15.P4);
                        boolean isEmpty = TextUtils.isEmpty(yeVar.f28028i);
                        boolean z12 = !isEmpty;
                        jq0 jq0Var3 = photoViewer15.f43344t5;
                        int i15 = jq0Var3.f58159o0;
                        if (i15 == 0) {
                            jq0Var3.setCancelState(true);
                            tg.f2 f2Var = photoViewer15.f43307p5;
                            hi.lb lbVar = new hi.lb(photoViewer15, z12, yeVar, 3);
                            f2Var.getClass();
                            f2Var.setOnClickListener(new jg0(27, f2Var, lbVar));
                            TextView textView = f2Var.N;
                            textView.setText(org.telegram.messenger.hd.N0(2131745479, null));
                            textView.animate().cancel();
                            textView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(240L).setInterpolator(org.telegram.ui.Components.nr.h).start();
                            ValueAnimator valueAnimator = f2Var.O;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            f2Var.R = f2Var.S;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            f2Var.O = ofFloat;
                            ofFloat.addUpdateListener(new tg.z1(f2Var, 0));
                            f2Var.O.setRepeatCount(-1);
                            f2Var.O.setRepeatMode(1);
                            f2Var.O.setDuration(2400L);
                            f2Var.O.setInterpolator(new LinearInterpolator());
                            f2Var.O.start();
                            photoViewer15.f43218f0.invalidate();
                            return;
                        } else if (i15 == 2) {
                            jq0Var3.setCutOutState(true);
                            photoViewer15.V2(false, true);
                            photoViewer15.f43307p5.f();
                            photoViewer15.f43218f0.invalidate();
                            return;
                        } else {
                            photoViewer15.f43307p5.l();
                            photoViewer15.f43307p5.getThanosEffect();
                            tg.f2 f2Var2 = photoViewer15.f43307p5;
                            f2Var2.M = false;
                            f2Var2.F = null;
                            ImageReceiver imageReceiver = photoViewer15.C4;
                            if (isEmpty || (bitmap = f2Var2.L) == null) {
                                bitmap = f2Var2.J;
                            }
                            imageReceiver.v0(bitmap);
                            photoViewer15.f43344t5.setCutOutState(true);
                            photoViewer15.V2(false, true);
                            photoViewer15.f0();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 15:
                PhotoViewer photoViewer16 = this.f48776b;
                photoViewer16.f43361v5.m(true, true);
                photoViewer16.f43371w5.m(false, true);
                tg.f2 f2Var3 = photoViewer16.f43307p5;
                if (f2Var3 != null) {
                    f2Var3.setOutlineVisible(false);
                }
                photoViewer16.N1 = true;
                vp0 vp0Var = photoViewer16.O1;
                if (vp0Var != null) {
                    vp0Var.setEraser(true);
                }
                photoViewer16.c3(4);
                return;
            case 16:
                PhotoViewer photoViewer17 = this.f48776b;
                photoViewer17.f43361v5.m(false, true);
                photoViewer17.f43371w5.m(true, true);
                tg.f2 f2Var4 = photoViewer17.f43307p5;
                if (f2Var4 != null) {
                    f2Var4.setOutlineVisible(false);
                }
                photoViewer17.N1 = false;
                vp0 vp0Var2 = photoViewer17.O1;
                if (vp0Var2 != null) {
                    vp0Var2.setEraser(false);
                }
                photoViewer17.c3(4);
                return;
            case 17:
                PhotoViewer photoViewer18 = this.f48776b;
                vp0 vp0Var3 = photoViewer18.O1;
                if (vp0Var3 != null) {
                    sg.k1 k1Var = vp0Var3.f58080b;
                    if (k1Var.a()) {
                        k1Var.c();
                        return;
                    }
                }
                photoViewer18.c3(0);
                photoViewer18.f43307p5.l();
                boolean isEmpty2 = TextUtils.isEmpty(((org.telegram.messenger.ye) photoViewer18.f43234g7.get(photoViewer18.P4)).f28028i);
                tg.f2 f2Var5 = photoViewer18.f43307p5;
                if (f2Var5 != null && !f2Var5.H) {
                    f2Var5.M = false;
                    f2Var5.F = null;
                }
                ImageReceiver imageReceiver2 = photoViewer18.C4;
                if (isEmpty2 || (bitmap2 = f2Var5.L) == null) {
                    bitmap2 = f2Var5.J;
                }
                imageReceiver2.v0(bitmap2);
                tg.f2 f2Var6 = photoViewer18.f43307p5;
                if (f2Var6 == null || !f2Var6.H) {
                    photoViewer18.f43344t5.setCutOutState(true);
                }
                photoViewer18.Y2(true, true);
                return;
            case 18:
                PhotoViewer photoViewer19 = this.f48776b;
                if (photoViewer19.f43307p5 != null) {
                    photoViewer19.f43391y5.m(!jq0Var.f49044u0, true);
                    tg.f2 f2Var7 = photoViewer19.f43307p5;
                    if (!photoViewer19.f43391y5.f49044u0 || photoViewer19.f43361v5.f49044u0 || photoViewer19.f43371w5.f49044u0) {
                        z10 = false;
                    }
                    f2Var7.setOutlineVisible(z10);
                    return;
                }
                return;
            case 19:
                PhotoViewer photoViewer20 = this.f48776b;
                bn bnVar = photoViewer20.f43272l4;
                if (bnVar != null && (gjVar = bnVar.H5) != null && gjVar.p5() && !org.telegram.messenger.v3.z(photoViewer20.U, 24, org.telegram.messenger.gj.B0(photoViewer20.f43272l4.H5.f24177k))) {
                    if (photoViewer20.f43280m4 == null || (b10 = photoViewer20.f43272l4.f46221y5) == null) {
                        b10 = org.telegram.messenger.lj.b(photoViewer20.f43272l4.H5.f24177k.suggested_post);
                    }
                    if (!di.y8.S(photoViewer20.U, b10.f25198a)) {
                        bn bnVar2 = photoViewer20.f43272l4;
                        if (bnVar2 != null) {
                            bnVar2.Ac(b10);
                            return;
                        }
                        return;
                    }
                }
                if (photoViewer20.V1.o()) {
                    org.telegram.ui.Components.o6 o6Var = photoViewer20.V1.f14991w;
                    float f11 = -photoViewer20.X1;
                    photoViewer20.X1 = f11;
                    org.telegram.messenger.g0.E3(f11, o6Var, null);
                    org.telegram.messenger.q2.APP_ERROR.a();
                    if (!org.telegram.messenger.np.u1(photoViewer20.U).K3() && org.telegram.messenger.np.u1(photoViewer20.U).X4 > photoViewer20.V1.getCodePointCount()) {
                        photoViewer20.R2(photoViewer20.f43218f0);
                        return;
                    }
                    return;
                }
                bn bnVar3 = photoViewer20.f43272l4;
                if (bnVar3 != null && bnVar3.c() && ((n2Var = photoViewer20.f43272l4.Y1) == null || n2Var.F3 == null)) {
                    photoViewer20.X2();
                    return;
                } else {
                    photoViewer20.u2(true, 0, 0, false, false, false);
                    return;
                }
            case 20:
                this.f48776b.f43169a.a(false, true);
                return;
            case 21:
                PhotoViewer photoViewer21 = this.f48776b;
                if (photoViewer21.E != null && (vq0Var = photoViewer21.d) != null) {
                    vq0Var.W();
                    photoViewer21.z0(true, false);
                    return;
                }
                return;
            case 22:
                PhotoViewer photoViewer22 = this.f48776b;
                Drawable[] drawableArr7 = PhotoViewer.Z8;
                photoViewer22.m0();
                if (!photoViewer22.F1()) {
                    if (photoViewer22.f43332s1) {
                        if (photoViewer22.f43268k8) {
                            TextureView textureView = photoViewer22.C2;
                            if (textureView instanceof org.telegram.ui.Components.y51) {
                                org.telegram.ui.Components.y51 y51Var = (org.telegram.ui.Components.y51) textureView;
                                if (y51Var.getVideoWidth() <= 0 || y51Var.getVideoHeight() <= 0) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    photoViewer22.c3(1);
                    return;
                }
                return;
            case 23:
                PhotoViewer photoViewer23 = this.f48776b;
                Drawable[] drawableArr8 = PhotoViewer.Z8;
                photoViewer23.I0(-90.0f, false, null);
                return;
            case 24:
                PhotoViewer photoViewer24 = this.f48776b;
                Drawable[] drawableArr9 = PhotoViewer.Z8;
                photoViewer24.H0();
                return;
            case 25:
                PhotoViewer photoViewer25 = this.f48776b;
                Drawable[] drawableArr10 = PhotoViewer.Z8;
                photoViewer25.m0();
                if (!photoViewer25.F1()) {
                    if (photoViewer25.f43332s1) {
                        if (photoViewer25.f43268k8) {
                            TextureView textureView2 = photoViewer25.C2;
                            if (textureView2 instanceof org.telegram.ui.Components.y51) {
                                org.telegram.ui.Components.y51 y51Var2 = (org.telegram.ui.Components.y51) textureView2;
                                if (y51Var2.getVideoWidth() <= 0 || y51Var2.getVideoHeight() <= 0) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    photoViewer25.c3(3);
                    return;
                }
                return;
            case 26:
                PhotoViewer photoViewer26 = this.f48776b;
                Drawable[] drawableArr11 = PhotoViewer.Z8;
                if (view.getAlpha() >= 0.9f) {
                    photoViewer26.m0();
                    if (!photoViewer26.F1()) {
                        if (photoViewer26.f43332s1) {
                            if (photoViewer26.f43268k8) {
                                TextureView textureView3 = photoViewer26.C2;
                                if (textureView3 instanceof org.telegram.ui.Components.y51) {
                                    org.telegram.ui.Components.y51 y51Var3 = (org.telegram.ui.Components.y51) textureView3;
                                    if (y51Var3.getVideoWidth() <= 0 || y51Var3.getVideoHeight() <= 0) {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        photoViewer26.c3(2);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                PhotoViewer photoViewer27 = this.f48776b;
                if (photoViewer27.f43308p6 == null) {
                    ao0 ao0Var = new ao0(photoViewer27, 2);
                    if (!photoViewer27.J2) {
                        float stateOrientation = photoViewer27.R2 - photoViewer27.D1.f39118b.getStateOrientation();
                        if (Math.abs(stateOrientation) > 180.0f) {
                            if (stateOrientation < 0.0f) {
                                stateOrientation += 360.0f;
                            } else {
                                stateOrientation = -(360.0f - stateOrientation);
                            }
                        }
                        photoViewer27.I0(stateOrientation, photoViewer27.D1.f39118b.getStateMirror(), ao0Var);
                        return;
                    }
                    ao0Var.run();
                    return;
                }
                return;
            case 28:
                PhotoViewer photoViewer28 = this.f48776b;
                if (photoViewer28.f43351u4 == 1) {
                    og.o oVar = photoViewer28.D1.f39118b;
                    og.c cVar = oVar.H;
                    if (cVar.f21823a.isInProgress() || cVar.h || oVar.f21887a.f32885f0) {
                        return;
                    }
                }
                photoViewer28.f0();
                photoViewer28.c3(0);
                return;
            default:
                PhotoViewer photoViewer29 = this.f48776b;
                float f12 = -photoViewer29.D1.f39118b.getStateOrientation();
                if (Math.abs(f12) > 180.0f) {
                    if (f12 < 0.0f) {
                        f12 += 360.0f;
                    } else {
                        f12 = -(360.0f - f12);
                    }
                }
                photoViewer29.I0(f12, photoViewer29.D1.f39118b.getStateMirror(), new hn0(photoViewer29, 8));
                return;
        }
    }
}
