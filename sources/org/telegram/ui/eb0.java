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
public final class eb0 implements zf.b, org.telegram.ui.ActionBar.u1, org.telegram.messenger.eb, org.telegram.messenger.cb {
    public final int f36788a;
    public final xb0 f36789b;

    public eb0(xb0 xb0Var, int i10) {
        this.f36788a = i10;
        this.f36789b = xb0Var;
    }

    @Override
    public void b(ArrayList arrayList) {
        switch (this.f36788a) {
            case 0:
                xb0 xb0Var = this.f36789b;
                ArrayList arrayList2 = xb0Var.f43325t0;
                if (arrayList != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((wb0) arrayList2.get(i10)).f42749b.c();
                    }
                    arrayList2.clear();
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        try {
                            org.telegram.messenger.bb onCreateMarkerOptions = ((t7.u) org.telegram.messenger.w0.k()).onCreateMarkerOptions();
                            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                            l2.f fVar = (l2.f) onCreateMarkerOptions;
                            ((j8.f) fVar.f11588b).f9717a = new LatLng(geoPoint.lat, geoPoint._long);
                            ((j8.f) fVar.f11588b).d = v7.n8.a(xb0Var.n0(i11));
                            fVar.e(0.5f);
                            String str = tL_messageMediaVenue.title;
                            j8.f fVar2 = (j8.f) fVar.f11588b;
                            fVar2.f9718b = str;
                            fVar2.f9719c = tL_messageMediaVenue.address;
                            ?? obj = new Object();
                            obj.f42748a = i11;
                            org.telegram.messenger.ga a2 = xb0Var.G.a(fVar);
                            obj.f42749b = a2;
                            obj.f42750c = tL_messageMediaVenue;
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
                xb0 xb0Var2 = this.f36789b;
                xb0Var2.B0 = false;
                xb0Var2.Q0();
                return;
        }
    }

    @Override
    public boolean c(MotionEvent motionEvent, org.telegram.messenger.ka kaVar) {
        MotionEvent motionEvent2;
        Location location;
        int i10 = this.f36788a;
        xb0 xb0Var = this.f36789b;
        switch (i10) {
            case 5:
                xb0Var.F0();
                if (xb0Var.L != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-xb0Var.L) / 2.0f);
                    motionEvent2 = motionEvent;
                } else {
                    motionEvent2 = null;
                }
                boolean booleanValue = kaVar.a(motionEvent).booleanValue();
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                return booleanValue;
            default:
                if (xb0Var.J0 == null && xb0Var.H0 == null) {
                    if (motionEvent.getAction() == 0) {
                        AnimatorSet animatorSet = xb0Var.f43326u0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        xb0Var.f43326u0 = animatorSet2;
                        animatorSet2.setDuration(200L);
                        xb0Var.f43326u0.playTogether(ObjectAnimator.ofFloat(xb0Var.V, View.TRANSLATION_Y, xb0Var.G0 - org.telegram.messenger.i0.L(10.0f)));
                        xb0Var.f43326u0.start();
                    } else if (motionEvent.getAction() == 1) {
                        AnimatorSet animatorSet3 = xb0Var.f43326u0;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                        }
                        xb0Var.L = 0.0f;
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        xb0Var.f43326u0 = animatorSet4;
                        animatorSet4.setDuration(200L);
                        xb0Var.f43326u0.playTogether(ObjectAnimator.ofFloat(xb0Var.V, View.TRANSLATION_Y, xb0Var.G0));
                        xb0Var.f43326u0.start();
                        xb0Var.R.I();
                    }
                    if (motionEvent.getAction() == 2) {
                        if (!xb0Var.K0) {
                            ImageView imageView = xb0Var.f43300a;
                            int i11 = org.telegram.ui.ActionBar.t6.ij;
                            org.telegram.ui.ActionBar.a7.t(imageView, i11, xb0Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                            xb0Var.f43300a.setTag(Integer.valueOf(i11));
                            xb0Var.K0 = true;
                        }
                        org.telegram.messenger.ha haVar = xb0Var.G;
                        if (haVar != null && (location = xb0Var.F0) != null) {
                            location.setLatitude(((org.telegram.messenger.db) haVar.d().f9903b).f15333a);
                            xb0Var.F0.setLongitude(((org.telegram.messenger.db) xb0Var.G.d().f9903b).f15334b);
                        }
                        xb0Var.R.M(xb0Var.F0);
                    }
                }
                return kaVar.a(motionEvent).booleanValue();
        }
    }

    @Override
    public void d(int i10) {
        View childAt;
        s4.c1 T;
        int L;
        xb0 xb0Var = this.f36789b;
        int i11 = xb0Var.O0;
        if (i10 == 1) {
            xb0Var.N0(true);
            if (xb0Var.f43327v0 != null) {
                xb0Var.V.setVisibility(0);
                tb0 tb0Var = xb0Var.f43328w;
                org.telegram.messenger.ga gaVar = xb0Var.f43327v0;
                HashMap hashMap = tb0Var.f41609a;
                View view = (View) hashMap.get(gaVar);
                if (view != null) {
                    tb0Var.removeView(view);
                    hashMap.remove(gaVar);
                }
                xb0Var.f43327v0 = null;
                xb0Var.f43329w0 = null;
                xb0Var.f43331x0 = null;
            }
            xb0Var.f43322r0 = -1L;
            if (xb0Var.f43324s0) {
                xb0Var.f43324s0 = false;
                xb0Var.S0();
            }
            if (!xb0Var.O) {
                if ((i11 == 0 || i11 == 1) && xb0Var.S.getChildCount() > 0 && (childAt = xb0Var.S.getChildAt(0)) != null) {
                    mb0 mb0Var = xb0Var.S;
                    View F = mb0Var.F(childAt);
                    if (F == null) {
                        T = null;
                    } else {
                        T = mb0Var.T(F);
                    }
                    if (T != null && T.b() == 0) {
                        if (i11 == 0) {
                            L = 0;
                        } else {
                            L = org.telegram.messenger.i0.L(66.0f);
                        }
                        int top = childAt.getTop();
                        if (top < (-L)) {
                            jg.c0 d = xb0Var.G.d();
                            xb0Var.J = ((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLngZoom((org.telegram.messenger.db) d.f9903b, d.f9904c);
                            xb0Var.S.w0(0, top + L, null);
                        }
                    }
                }
            }
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f36788a) {
            case 1:
                xb0 xb0Var = this.f36789b;
                if (xb0Var.getParentActivity() != null) {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + org.telegram.messenger.w0.f18945b.getPackageName()));
                        xb0Var.getParentActivity().startActivity(intent);
                        return;
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                        return;
                    }
                }
                return;
            default:
                xb0 xb0Var2 = this.f36789b;
                if (xb0Var2.getParentActivity() != null) {
                    try {
                        xb0Var2.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
        }
    }
}
