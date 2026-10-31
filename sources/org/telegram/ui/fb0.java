package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.location.Location;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class fb0 implements zf.b, org.telegram.ui.ActionBar.u1, org.telegram.messenger.db, org.telegram.messenger.bb {
    public final int f37221a;
    public final yb0 f37222b;

    public fb0(yb0 yb0Var, int i10) {
        this.f37221a = i10;
        this.f37222b = yb0Var;
    }

    @Override
    public void b(ArrayList arrayList) {
        switch (this.f37221a) {
            case 0:
                yb0 yb0Var = this.f37222b;
                ArrayList arrayList2 = yb0Var.f43805t0;
                if (arrayList != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((xb0) arrayList2.get(i10)).f43531b.c();
                    }
                    arrayList2.clear();
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        try {
                            org.telegram.messenger.ab onCreateMarkerOptions = ((t7.u) org.telegram.messenger.w0.k()).onCreateMarkerOptions();
                            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                            l2.f fVar = (l2.f) onCreateMarkerOptions;
                            ((j8.f) fVar.f11587b).f9716a = new LatLng(geoPoint.lat, geoPoint._long);
                            ((j8.f) fVar.f11587b).d = v7.n8.a(yb0Var.m0(i11));
                            fVar.e(0.5f);
                            String str = tL_messageMediaVenue.title;
                            j8.f fVar2 = (j8.f) fVar.f11587b;
                            fVar2.f9717b = str;
                            fVar2.f9718c = tL_messageMediaVenue.address;
                            ?? obj = new Object();
                            obj.f43530a = i11;
                            org.telegram.messenger.fa a2 = yb0Var.G.a(fVar);
                            obj.f43531b = a2;
                            obj.f43532c = tL_messageMediaVenue;
                            a2.f(obj);
                            arrayList2.add(obj);
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                        }
                    }
                    return;
                }
                return;
            default:
                yb0 yb0Var2 = this.f37222b;
                yb0Var2.B0 = false;
                yb0Var2.P0();
                return;
        }
    }

    @Override
    public boolean c(MotionEvent motionEvent, org.telegram.messenger.ja jaVar) {
        MotionEvent motionEvent2;
        Location location;
        int i10 = this.f37221a;
        yb0 yb0Var = this.f37222b;
        switch (i10) {
            case 5:
                yb0Var.E0();
                if (yb0Var.L != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-yb0Var.L) / 2.0f);
                    motionEvent2 = motionEvent;
                } else {
                    motionEvent2 = null;
                }
                boolean booleanValue = jaVar.a(motionEvent).booleanValue();
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                return booleanValue;
            default:
                if (yb0Var.J0 == null && yb0Var.H0 == null) {
                    if (motionEvent.getAction() == 0) {
                        AnimatorSet animatorSet = yb0Var.f43806u0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        yb0Var.f43806u0 = animatorSet2;
                        animatorSet2.setDuration(200L);
                        yb0Var.f43806u0.playTogether(ObjectAnimator.ofFloat(yb0Var.V, View.TRANSLATION_Y, yb0Var.G0 - org.telegram.messenger.i0.L(10.0f)));
                        yb0Var.f43806u0.start();
                    } else if (motionEvent.getAction() == 1) {
                        AnimatorSet animatorSet3 = yb0Var.f43806u0;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                        }
                        yb0Var.L = 0.0f;
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        yb0Var.f43806u0 = animatorSet4;
                        animatorSet4.setDuration(200L);
                        yb0Var.f43806u0.playTogether(ObjectAnimator.ofFloat(yb0Var.V, View.TRANSLATION_Y, yb0Var.G0));
                        yb0Var.f43806u0.start();
                        yb0Var.R.I();
                    }
                    if (motionEvent.getAction() == 2) {
                        if (!yb0Var.K0) {
                            ImageView imageView = yb0Var.f43780a;
                            int i11 = org.telegram.ui.ActionBar.t6.ij;
                            org.telegram.ui.ActionBar.a7.t(imageView, i11, yb0Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                            yb0Var.f43780a.setTag(Integer.valueOf(i11));
                            yb0Var.K0 = true;
                        }
                        org.telegram.messenger.ga gaVar = yb0Var.G;
                        if (gaVar != null && (location = yb0Var.F0) != null) {
                            location.setLatitude(((org.telegram.messenger.cb) gaVar.d().f9902b).f14971a);
                            yb0Var.F0.setLongitude(((org.telegram.messenger.cb) yb0Var.G.d().f9902b).f14972b);
                        }
                        yb0Var.R.M(yb0Var.F0);
                    }
                }
                return jaVar.a(motionEvent).booleanValue();
        }
    }

    @Override
    public void d(int i10) {
        View childAt;
        s4.c1 T;
        int L;
        yb0 yb0Var = this.f37222b;
        int i11 = yb0Var.O0;
        if (i10 == 1) {
            yb0Var.M0(true);
            if (yb0Var.f43807v0 != null) {
                yb0Var.V.setVisibility(0);
                ub0 ub0Var = yb0Var.f43808w;
                org.telegram.messenger.fa faVar = yb0Var.f43807v0;
                HashMap hashMap = ub0Var.f42110a;
                View view = (View) hashMap.get(faVar);
                if (view != null) {
                    ub0Var.removeView(view);
                    hashMap.remove(faVar);
                }
                yb0Var.f43807v0 = null;
                yb0Var.f43809w0 = null;
                yb0Var.f43811x0 = null;
            }
            yb0Var.f43802r0 = -1L;
            if (yb0Var.f43804s0) {
                yb0Var.f43804s0 = false;
                yb0Var.R0();
            }
            if (!yb0Var.O) {
                if ((i11 == 0 || i11 == 1) && yb0Var.S.getChildCount() > 0 && (childAt = yb0Var.S.getChildAt(0)) != null) {
                    nb0 nb0Var = yb0Var.S;
                    View F = nb0Var.F(childAt);
                    if (F == null) {
                        T = null;
                    } else {
                        T = nb0Var.T(F);
                    }
                    if (T != null && T.b() == 0) {
                        if (i11 == 0) {
                            L = 0;
                        } else {
                            L = org.telegram.messenger.i0.L(66.0f);
                        }
                        int top = childAt.getTop();
                        if (top < (-L)) {
                            jg.c0 d = yb0Var.G.d();
                            yb0Var.J = ((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLngZoom((org.telegram.messenger.cb) d.f9902b, d.f9903c);
                            yb0Var.S.w0(0, top + L, null);
                        }
                    }
                }
            }
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f37221a) {
            case 1:
                yb0 yb0Var = this.f37222b;
                if (yb0Var.getParentActivity() != null) {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + org.telegram.messenger.w0.f19025b.getPackageName()));
                        yb0Var.getParentActivity().startActivity(intent);
                        return;
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                        return;
                    }
                }
                return;
            default:
                yb0 yb0Var2 = this.f37222b;
                if (yb0Var2.getParentActivity() != null) {
                    try {
                        yb0Var2.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
        }
    }
}
