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
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.CheckBox;
public final class in0 implements View.OnClickListener {
    public final int f48859a;
    public final PhotoViewer f48860b;

    public in0(PhotoViewer photoViewer, int i7) {
        this.f48859a = i7;
        this.f48860b = photoViewer;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        int i10;
        org.telegram.ui.Components.h61 h61Var;
        int i11;
        Bitmap bitmap;
        Bitmap bitmap2;
        iq0 iq0Var;
        fi.n2 n2Var;
        org.telegram.messenger.fj fjVar;
        org.telegram.messenger.kj b10;
        uq0 uq0Var;
        float f10 = 1.0f;
        boolean z10 = true;
        switch (this.f48859a) {
            case 0:
                PhotoViewer photoViewer = this.f48860b;
                Activity activity = photoViewer.E;
                if (activity != null) {
                    photoViewer.Z3 = false;
                    photoViewer.Y3 = 1;
                    if (photoViewer.X3 == -10) {
                        photoViewer.X3 = activity.getRequestedOrientation();
                    }
                    if (((WindowManager) photoViewer.E.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                        photoViewer.E.setRequestedOrientation(8);
                    } else {
                        photoViewer.E.setRequestedOrientation(0);
                    }
                    photoViewer.i3(false, false);
                    return;
                }
                return;
            case 1:
                PhotoViewer photoViewer2 = this.f48860b;
                Drawable[] drawableArr = PhotoViewer.f43272f9;
                photoViewer2.f0();
                photoViewer2.d3(0);
                return;
            case 2:
                PhotoViewer photoViewer3 = this.f48860b;
                if (photoViewer3.J1.a()) {
                    Activity activity2 = photoViewer3.E;
                    if (activity2 != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity2, photoViewer3.f43484w2);
                        alertDialog$Builder.f28835a.U = org.telegram.messenger.gd.N0(2131751393, "DiscardChanges");
                        alertDialog$Builder.f28835a.S = org.telegram.messenger.gd.N0(2131689472, "AppName");
                        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747637, "OK"), new qn0(photoViewer3));
                        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, "Cancel"), null);
                        photoViewer3.R2(alertDialog$Builder);
                        return;
                    }
                    return;
                }
                photoViewer3.d3(0);
                return;
            case 3:
                PhotoViewer photoViewer4 = this.f48860b;
                photoViewer4.f43331e8 = photoViewer4.f43351g8;
                photoViewer4.L0();
                photoViewer4.X2(false);
                photoViewer4.o2(2);
                return;
            case 4:
                PhotoViewer photoViewer5 = this.f48860b;
                Object obj = photoViewer5.f43350g7.get(photoViewer5.P4);
                if (obj instanceof org.telegram.messenger.xe) {
                    ((org.telegram.messenger.xe) obj).f27978s = photoViewer5.j1();
                }
                photoViewer5.X2(false);
                photoViewer5.o2(2);
                return;
            case 5:
                PhotoViewer photoViewer6 = this.f48860b;
                photoViewer6.f43477v5.m(false, true);
                photoViewer6.f43487w5.m(false, true);
                photoViewer6.d3(0);
                return;
            case 6:
                PhotoViewer photoViewer7 = this.f48860b;
                photoViewer7.f43477v5.m(false, true);
                photoViewer7.f43487w5.m(false, true);
                photoViewer7.f0();
                photoViewer7.d3(0);
                return;
            case 7:
                PhotoViewer photoViewer8 = this.f48860b;
                Drawable[] drawableArr2 = PhotoViewer.f43272f9;
                photoViewer8.v2(false, 0, 0, false, false, false);
                return;
            case 8:
                PhotoViewer photoViewer9 = this.f48860b;
                Drawable[] drawableArr3 = PhotoViewer.f43272f9;
                photoViewer9.d3(5);
                return;
            case 9:
                PhotoViewer photoViewer10 = this.f48860b;
                Drawable[] drawableArr4 = PhotoViewer.f43272f9;
                photoViewer10.y0();
                return;
            case 10:
                PhotoViewer photoViewer11 = this.f48860b;
                if (!photoViewer11.f43432q5.f34696b.R && (i7 = photoViewer11.P4) >= 0 && i7 < photoViewer11.f43350g7.size() && (photoViewer11.f43350g7.get(photoViewer11.P4) instanceof org.telegram.messenger.ef)) {
                    org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) photoViewer11.f43350g7.get(photoViewer11.P4);
                    long time = photoViewer11.f43432q5.getTime();
                    String v12 = PhotoViewer.v1();
                    photoViewer11.f43432q5.f34696b.setLoading(true);
                    Utilities.f22877e.c(new di.j2(photoViewer11, v12, efVar, time, 22));
                    return;
                }
                return;
            case 11:
                final PhotoViewer photoViewer12 = this.f48860b;
                Drawable[] drawableArr5 = PhotoViewer.f43272f9;
                if (!photoViewer12.F1()) {
                    photoViewer12.f43436r = !photoViewer12.f43436r;
                    ArrayList arrayList = photoViewer12.f43361i1;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj2 = arrayList.get(i12);
                            i12++;
                            ((hi.u3) obj2).f(true);
                        }
                    }
                    if (photoViewer12.f43436r) {
                        final hi.u3 u3Var = new hi.u3(photoViewer12.E, 3);
                        u3Var.r(true);
                        u3Var.v(org.telegram.messenger.gd.N0(2131751197, null));
                        u3Var.h = hi.u3.a(u3Var.getText(), u3Var.getTextPaint());
                        u3Var.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
                        u3Var.o(0.0f, 22.0f);
                        u3Var.f15506r0 = new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        ArrayList arrayList2 = photoViewer12.f43361i1;
                                        if (arrayList2 != null) {
                                            arrayList2.remove(u3Var);
                                            return;
                                        }
                                        return;
                                    default:
                                        PhotoViewer photoViewer13 = photoViewer12;
                                        ArrayList arrayList3 = photoViewer13.f43361i1;
                                        hi.u3 u3Var2 = u3Var;
                                        if (arrayList3 != null) {
                                            arrayList3.remove(u3Var2);
                                        }
                                        ArrayList arrayList4 = photoViewer13.f43369j1;
                                        if (arrayList4 != null) {
                                            arrayList4.remove(u3Var2);
                                            return;
                                        }
                                        return;
                                }
                            }
                        };
                        if (photoViewer12.f43361i1 == null) {
                            photoViewer12.f43361i1 = new ArrayList();
                        }
                        photoViewer12.f43334f0.addView(u3Var, c8.na.e(-1, 200, 83));
                        photoViewer12.f43361i1.add(u3Var);
                        u3Var.x();
                    }
                    photoViewer12.w3();
                    photoViewer12.C3();
                    if (photoViewer12.f43436r) {
                        CheckBox checkBox = photoViewer12.O0;
                        if (!checkBox.f32923y) {
                            checkBox.callOnClick();
                            return;
                        }
                    }
                    Object obj3 = photoViewer12.f43350g7.get(photoViewer12.P4);
                    if (obj3 instanceof org.telegram.messenger.xe) {
                        ((org.telegram.messenger.xe) obj3).f27978s = photoViewer12.j1();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                final PhotoViewer photoViewer13 = this.f48860b;
                Drawable[] drawableArr6 = PhotoViewer.f43272f9;
                boolean P1 = photoViewer13.P1();
                boolean z11 = !P1;
                int i13 = photoViewer13.P4;
                if (i13 >= 0 && i13 < photoViewer13.f43350g7.size()) {
                    Object obj4 = photoViewer13.f43350g7.get(photoViewer13.P4);
                    if (obj4 instanceof org.telegram.messenger.ef) {
                        ((org.telegram.messenger.ef) obj4).O = Boolean.valueOf(z11);
                        SharedPreferences.Editor edit = org.telegram.messenger.t0.f27013b.getSharedPreferences("mainconfig", 0).edit();
                        org.telegram.messenger.bz.f23294i1 = P1;
                        edit.putBoolean("photoLiveDefault", P1).apply();
                        uq0 uq0Var2 = photoViewer13.d;
                        if (uq0Var2 != null) {
                            uq0Var2.m();
                        }
                    }
                }
                photoViewer13.f43344g1.a(!photoViewer13.P1(), true);
                ViewPropertyAnimator animate = photoViewer13.Y7.animate();
                if (photoViewer13.P1()) {
                    f10 = 0.45f;
                }
                animate.alpha(f10).start();
                if (photoViewer13.P1() && (h61Var = photoViewer13.G2) != null) {
                    h61Var.g0();
                }
                photoViewer13.f43334f0.invalidate();
                if (photoViewer13.f43361i1 == null) {
                    photoViewer13.f43361i1 = new ArrayList();
                }
                if (photoViewer13.f43369j1 == null) {
                    photoViewer13.f43369j1 = new ArrayList();
                }
                ArrayList arrayList2 = photoViewer13.f43361i1;
                int size2 = arrayList2.size();
                int i14 = 0;
                while (i14 < size2) {
                    Object obj5 = arrayList2.get(i14);
                    i14++;
                    ((hi.u3) obj5).f(true);
                }
                final hi.u3 u3Var2 = new hi.u3(photoViewer13.E, 3);
                if (photoViewer13.P1()) {
                    i10 = 2131748643;
                } else {
                    i10 = 2131748642;
                }
                u3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(i10, null)));
                u3Var2.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
                u3Var2.o(0.0f, 28.0f);
                u3Var2.f15506r0 = new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                ArrayList arrayList22 = photoViewer13.f43361i1;
                                if (arrayList22 != null) {
                                    arrayList22.remove(u3Var2);
                                    return;
                                }
                                return;
                            default:
                                PhotoViewer photoViewer132 = photoViewer13;
                                ArrayList arrayList3 = photoViewer132.f43361i1;
                                hi.u3 u3Var22 = u3Var2;
                                if (arrayList3 != null) {
                                    arrayList3.remove(u3Var22);
                                }
                                ArrayList arrayList4 = photoViewer132.f43369j1;
                                if (arrayList4 != null) {
                                    arrayList4.remove(u3Var22);
                                    return;
                                }
                                return;
                        }
                    }
                };
                photoViewer13.f43334f0.addView(u3Var2, c8.na.e(-1, 200, 83));
                photoViewer13.f43361i1.add(u3Var2);
                photoViewer13.f43369j1.add(u3Var2);
                u3Var2.x();
                return;
            case 13:
                PhotoViewer photoViewer14 = this.f48860b;
                if (photoViewer14.d != null && !photoViewer14.F1()) {
                    photoViewer14.d.n();
                    photoViewer14.z0(true, false);
                    return;
                }
                return;
            case 14:
                PhotoViewer photoViewer15 = this.f48860b;
                if (photoViewer15.d != null && !photoViewer15.F1()) {
                    photoViewer15.d.n();
                    photoViewer15.z0(true, false);
                    return;
                }
                return;
            case 15:
                PhotoViewer photoViewer16 = this.f48860b;
                ArrayList arrayList3 = photoViewer16.f43350g7;
                if (!photoViewer16.B7) {
                    iq0 iq0Var2 = photoViewer16.f43460t5;
                    if (!iq0Var2.R && iq0Var2.f58293o0 != 1 && (i11 = photoViewer16.P4) >= 0 && i11 < arrayList3.size() && !photoViewer16.f43423p5.W) {
                        org.telegram.messenger.xe xeVar = (org.telegram.messenger.xe) arrayList3.get(photoViewer16.P4);
                        boolean isEmpty = TextUtils.isEmpty(xeVar.f27968i);
                        boolean z12 = !isEmpty;
                        iq0 iq0Var3 = photoViewer16.f43460t5;
                        int i15 = iq0Var3.f58293o0;
                        if (i15 == 0) {
                            iq0Var3.setCancelState(true);
                            tg.i2 i2Var = photoViewer16.f43423p5;
                            hi.fc fcVar = new hi.fc(photoViewer16, z12, xeVar, 3);
                            i2Var.getClass();
                            i2Var.setOnClickListener(new ig0(27, i2Var, fcVar));
                            TextView textView = i2Var.N;
                            textView.setText(org.telegram.messenger.gd.N0(2131745479, null));
                            textView.animate().cancel();
                            textView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(240L).setInterpolator(org.telegram.ui.Components.kr.h).start();
                            ValueAnimator valueAnimator = i2Var.O;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            i2Var.R = i2Var.S;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            i2Var.O = ofFloat;
                            ofFloat.addUpdateListener(new tg.c2(i2Var, 0));
                            i2Var.O.setRepeatCount(-1);
                            i2Var.O.setRepeatMode(1);
                            i2Var.O.setDuration(2400L);
                            i2Var.O.setInterpolator(new LinearInterpolator());
                            i2Var.O.start();
                            photoViewer16.f43334f0.invalidate();
                            return;
                        } else if (i15 == 2) {
                            iq0Var3.setCutOutState(true);
                            photoViewer16.W2(false, true);
                            photoViewer16.f43423p5.f();
                            photoViewer16.f43334f0.invalidate();
                            return;
                        } else {
                            photoViewer16.f43423p5.l();
                            photoViewer16.f43423p5.getThanosEffect();
                            tg.i2 i2Var2 = photoViewer16.f43423p5;
                            i2Var2.M = false;
                            i2Var2.F = null;
                            ImageReceiver imageReceiver = photoViewer16.C4;
                            if (isEmpty || (bitmap = i2Var2.L) == null) {
                                bitmap = i2Var2.J;
                            }
                            imageReceiver.w0(bitmap);
                            photoViewer16.f43460t5.setCutOutState(true);
                            photoViewer16.W2(false, true);
                            photoViewer16.f0();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 16:
                PhotoViewer photoViewer17 = this.f48860b;
                photoViewer17.f43477v5.m(true, true);
                photoViewer17.f43487w5.m(false, true);
                tg.i2 i2Var3 = photoViewer17.f43423p5;
                if (i2Var3 != null) {
                    i2Var3.setOutlineVisible(false);
                }
                photoViewer17.N1 = true;
                up0 up0Var = photoViewer17.O1;
                if (up0Var != null) {
                    up0Var.setEraser(true);
                }
                photoViewer17.d3(4);
                return;
            case 17:
                PhotoViewer photoViewer18 = this.f48860b;
                photoViewer18.f43477v5.m(false, true);
                photoViewer18.f43487w5.m(true, true);
                tg.i2 i2Var4 = photoViewer18.f43423p5;
                if (i2Var4 != null) {
                    i2Var4.setOutlineVisible(false);
                }
                photoViewer18.N1 = false;
                up0 up0Var2 = photoViewer18.O1;
                if (up0Var2 != null) {
                    up0Var2.setEraser(false);
                }
                photoViewer18.d3(4);
                return;
            case 18:
                PhotoViewer photoViewer19 = this.f48860b;
                up0 up0Var3 = photoViewer19.O1;
                if (up0Var3 != null) {
                    sg.j1 j1Var = up0Var3.f58234b;
                    if (j1Var.a()) {
                        j1Var.c();
                        return;
                    }
                }
                photoViewer19.d3(0);
                photoViewer19.f43423p5.l();
                boolean isEmpty2 = TextUtils.isEmpty(((org.telegram.messenger.xe) photoViewer19.f43350g7.get(photoViewer19.P4)).f27968i);
                tg.i2 i2Var5 = photoViewer19.f43423p5;
                if (i2Var5 != null && !i2Var5.H) {
                    i2Var5.M = false;
                    i2Var5.F = null;
                }
                ImageReceiver imageReceiver2 = photoViewer19.C4;
                if (isEmpty2 || (bitmap2 = i2Var5.L) == null) {
                    bitmap2 = i2Var5.J;
                }
                imageReceiver2.w0(bitmap2);
                tg.i2 i2Var6 = photoViewer19.f43423p5;
                if (i2Var6 == null || !i2Var6.H) {
                    photoViewer19.f43460t5.setCutOutState(true);
                }
                photoViewer19.Z2(true, true);
                return;
            case 19:
                PhotoViewer photoViewer20 = this.f48860b;
                if (photoViewer20.f43423p5 != null) {
                    photoViewer20.f43507y5.m(!iq0Var.f48903u0, true);
                    tg.i2 i2Var7 = photoViewer20.f43423p5;
                    if (!photoViewer20.f43507y5.f48903u0 || photoViewer20.f43477v5.f48903u0 || photoViewer20.f43487w5.f48903u0) {
                        z10 = false;
                    }
                    i2Var7.setOutlineVisible(z10);
                    return;
                }
                return;
            case 20:
                PhotoViewer photoViewer21 = this.f48860b;
                bn bnVar = photoViewer21.f43388l4;
                if (bnVar != null && (fjVar = bnVar.H5) != null && fjVar.p5() && !org.telegram.messenger.v3.z(photoViewer21.U, 24, org.telegram.messenger.fj.B0(photoViewer21.f43388l4.H5.f24073k))) {
                    if (photoViewer21.f43396m4 == null || (b10 = photoViewer21.f43388l4.f46436y5) == null) {
                        b10 = org.telegram.messenger.kj.b(photoViewer21.f43388l4.H5.f24073k.suggested_post);
                    }
                    if (!di.y8.S(photoViewer21.U, b10.f25139a)) {
                        bn bnVar2 = photoViewer21.f43388l4;
                        if (bnVar2 != null) {
                            bnVar2.Ac(b10);
                            return;
                        }
                        return;
                    }
                }
                if (photoViewer21.V1.o()) {
                    org.telegram.ui.Components.n6 n6Var = photoViewer21.V1.f14956w;
                    float f11 = -photoViewer21.X1;
                    photoViewer21.X1 = f11;
                    org.telegram.messenger.g0.E3(f11, n6Var, null);
                    org.telegram.messenger.q2.APP_ERROR.a();
                    if (!org.telegram.messenger.mp.u1(photoViewer21.U).K3() && org.telegram.messenger.mp.u1(photoViewer21.U).X4 > photoViewer21.V1.getCodePointCount()) {
                        photoViewer21.S2(photoViewer21.f43334f0);
                        return;
                    }
                    return;
                }
                bn bnVar3 = photoViewer21.f43388l4;
                if (bnVar3 != null && bnVar3.c() && ((n2Var = photoViewer21.f43388l4.Y1) == null || n2Var.F3 == null)) {
                    photoViewer21.Y2();
                    return;
                } else {
                    photoViewer21.v2(true, 0, 0, false, false, false);
                    return;
                }
            case 21:
                this.f48860b.f43280a.a(false, true);
                return;
            case 22:
                PhotoViewer photoViewer22 = this.f48860b;
                if (photoViewer22.E != null && (uq0Var = photoViewer22.d) != null) {
                    uq0Var.W();
                    photoViewer22.z0(true, false);
                    return;
                }
                return;
            case 23:
                PhotoViewer photoViewer23 = this.f48860b;
                Drawable[] drawableArr7 = PhotoViewer.f43272f9;
                photoViewer23.m0();
                if (!photoViewer23.F1()) {
                    if (photoViewer23.f43448s1) {
                        if (photoViewer23.f43435q8) {
                            TextureView textureView = photoViewer23.C2;
                            if (textureView instanceof org.telegram.ui.Components.x51) {
                                org.telegram.ui.Components.x51 x51Var = (org.telegram.ui.Components.x51) textureView;
                                if (x51Var.getVideoWidth() <= 0 || x51Var.getVideoHeight() <= 0) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    photoViewer23.d3(1);
                    return;
                }
                return;
            case 24:
                PhotoViewer photoViewer24 = this.f48860b;
                Drawable[] drawableArr8 = PhotoViewer.f43272f9;
                photoViewer24.I0(-90.0f, false, null);
                return;
            case 25:
                PhotoViewer photoViewer25 = this.f48860b;
                Drawable[] drawableArr9 = PhotoViewer.f43272f9;
                photoViewer25.H0();
                return;
            case 26:
                PhotoViewer photoViewer26 = this.f48860b;
                Drawable[] drawableArr10 = PhotoViewer.f43272f9;
                photoViewer26.m0();
                if (!photoViewer26.F1()) {
                    if (photoViewer26.f43448s1) {
                        if (photoViewer26.f43435q8) {
                            TextureView textureView2 = photoViewer26.C2;
                            if (textureView2 instanceof org.telegram.ui.Components.x51) {
                                org.telegram.ui.Components.x51 x51Var2 = (org.telegram.ui.Components.x51) textureView2;
                                if (x51Var2.getVideoWidth() <= 0 || x51Var2.getVideoHeight() <= 0) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    photoViewer26.d3(3);
                    return;
                }
                return;
            case 27:
                PhotoViewer photoViewer27 = this.f48860b;
                Drawable[] drawableArr11 = PhotoViewer.f43272f9;
                if (view.getAlpha() >= 0.9f) {
                    photoViewer27.m0();
                    if (!photoViewer27.F1()) {
                        if (photoViewer27.f43448s1) {
                            if (photoViewer27.f43435q8) {
                                TextureView textureView3 = photoViewer27.C2;
                                if (textureView3 instanceof org.telegram.ui.Components.x51) {
                                    org.telegram.ui.Components.x51 x51Var3 = (org.telegram.ui.Components.x51) textureView3;
                                    if (x51Var3.getVideoWidth() <= 0 || x51Var3.getVideoHeight() <= 0) {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        photoViewer27.d3(2);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                PhotoViewer photoViewer28 = this.f48860b;
                if (photoViewer28.f43424p6 == null) {
                    kn0 kn0Var = new kn0(photoViewer28, 4);
                    if (!photoViewer28.J2) {
                        float stateOrientation = photoViewer28.R2 - photoViewer28.D1.f38811b.getStateOrientation();
                        if (Math.abs(stateOrientation) > 180.0f) {
                            if (stateOrientation < 0.0f) {
                                stateOrientation += 360.0f;
                            } else {
                                stateOrientation = -(360.0f - stateOrientation);
                            }
                        }
                        photoViewer28.I0(stateOrientation, photoViewer28.D1.f38811b.getStateMirror(), kn0Var);
                        return;
                    }
                    kn0Var.run();
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer29 = this.f48860b;
                if (photoViewer29.f43467u4 == 1) {
                    og.o oVar = photoViewer29.D1.f38811b;
                    og.c cVar = oVar.H;
                    if (cVar.f21923a.isInProgress() || cVar.h || oVar.f21987a.f32983f0) {
                        return;
                    }
                }
                photoViewer29.f0();
                photoViewer29.d3(0);
                return;
        }
    }
}
