package org.telegram.ui;

import android.graphics.Bitmap;
import android.location.Location;
import android.location.LocationManager;
import android.widget.ImageView;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class ib0 implements q0.a {
    public final int f37990a;
    public final xb0 f37991b;

    public ib0(xb0 xb0Var, int i10) {
        this.f37990a = i10;
        this.f37991b = xb0Var;
    }

    @Override
    public final void accept(Object obj) {
        int i10;
        float e;
        ImageView imageView;
        org.telegram.messenger.nd h;
        int i11;
        switch (this.f37990a) {
            case 0:
                xb0 xb0Var = this.f37991b;
                xb0Var.G = (org.telegram.messenger.ha) obj;
                if (org.telegram.messenger.i0.B(xb0Var.getThemedColor(org.telegram.ui.ActionBar.t6.f20930d6)) < 0.721f) {
                    i10 = 2131624083;
                } else {
                    i10 = 0;
                }
                if (i10 != 0) {
                    xb0Var.f43313j0 = true;
                    xb0Var.G.j(((t7.u) org.telegram.messenger.w0.k()).loadRawResourceStyle(org.telegram.messenger.w0.f18945b, i10));
                }
                xb0Var.G.q(org.telegram.messenger.i0.L(70.0f), 0, org.telegram.messenger.i0.L(70.0f), xb0Var.v0());
                if (xb0Var.G != null) {
                    ((fg.i) ((bh.d) xb0Var.I).f2777a).animate().alpha(1.0f).setStartDelay(200L).setDuration(100L).setUpdateListener(new a3(xb0Var, 15)).start();
                    if (xb0Var.V0) {
                        e = xb0Var.G.f() + 4.0f;
                    } else {
                        e = xb0Var.G.e() - 4.0f;
                    }
                    TLRPC.TL_channelLocation tL_channelLocation = xb0Var.H0;
                    if (tL_channelLocation != null) {
                        TLRPC.GeoPoint geoPoint = tL_channelLocation.geo_point;
                        double d = geoPoint.lat;
                        double d10 = geoPoint._long;
                        ?? obj2 = new Object();
                        if (org.telegram.messenger.o5.E(xb0Var.f43317n0)) {
                            obj2.f41031c = xb0Var.getMessagesController().Z1(Long.valueOf(xb0Var.f43317n0));
                        } else {
                            obj2.d = xb0Var.getMessagesController().L0(Long.valueOf(-xb0Var.f43317n0));
                        }
                        obj2.f41029a = xb0Var.f43317n0;
                        xb0Var.K0(obj2);
                        try {
                            l2.f fVar = (l2.f) ((t7.u) org.telegram.messenger.w0.k()).onCreateMarkerOptions();
                            ((j8.f) fVar.f11588b).f9717a = new LatLng(d, d10);
                            Bitmap o02 = xb0Var.o0(obj2);
                            if (o02 != null) {
                                ((j8.f) fVar.f11588b).d = v7.n8.a(o02);
                                fVar.e(0.907f);
                                obj2.e = xb0Var.G.a(fVar);
                                if (!org.telegram.messenger.i20.B(obj2.f41031c)) {
                                    l2.f fVar2 = (l2.f) ((t7.u) org.telegram.messenger.w0.k()).onCreateMarkerOptions();
                                    ((j8.f) fVar2.f11588b).f9717a = new LatLng(d, d10);
                                    j8.f fVar3 = (j8.f) fVar2.f11588b;
                                    fVar3.f9722r = true;
                                    fVar3.d = v7.n8.b(2131231648);
                                    fVar2.e(0.5f);
                                    obj2.f41032f = xb0Var.G.a(fVar2);
                                }
                                xb0Var.f43319p0.add(obj2);
                                xb0Var.f43320q0.k(obj2, obj2.f41029a);
                            }
                        } catch (Exception e7) {
                            org.telegram.messenger.f8.g(e7, true);
                        }
                        xb0Var.G.i(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLngZoom(obj2.e.a(), e));
                    } else {
                        org.telegram.messenger.kj kjVar = xb0Var.J0;
                        if (kjVar != null) {
                            if (kjVar.C3()) {
                                rb0 i02 = xb0Var.i0(xb0Var.J0.f16690k);
                                if (!xb0Var.x0()) {
                                    xb0Var.G.i(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLngZoom(i02.e.a(), e));
                                }
                            } else {
                                double latitude = xb0Var.F0.getLatitude();
                                double longitude = xb0Var.F0.getLongitude();
                                org.telegram.messenger.db dbVar = new org.telegram.messenger.db(latitude, longitude);
                                try {
                                    org.telegram.messenger.ha haVar = xb0Var.G;
                                    l2.f fVar4 = (l2.f) ((t7.u) org.telegram.messenger.w0.k()).onCreateMarkerOptions();
                                    ((j8.f) fVar4.f11588b).f9717a = new LatLng(latitude, longitude);
                                    ((j8.f) fVar4.f11588b).d = v7.n8.b(2131231646);
                                    haVar.a(fVar4);
                                } catch (Exception e10) {
                                    org.telegram.messenger.f8.g(e10, true);
                                }
                                xb0Var.G.i(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLngZoom(dbVar, e));
                                xb0Var.f43318o0 = false;
                                xb0Var.x0();
                            }
                        } else {
                            Location location = new Location("network");
                            xb0Var.F0 = location;
                            TLRPC.TL_channelLocation tL_channelLocation2 = xb0Var.I0;
                            if (tL_channelLocation2 != null) {
                                TLRPC.GeoPoint geoPoint2 = tL_channelLocation2.geo_point;
                                xb0Var.G.i(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLngZoom(new org.telegram.messenger.db(geoPoint2.lat, geoPoint2._long), e));
                                xb0Var.F0.setLatitude(xb0Var.I0.geo_point.lat);
                                xb0Var.F0.setLongitude(xb0Var.I0.geo_point._long);
                                xb0Var.F0.setAccuracy(xb0Var.I0.geo_point.accuracy_radius);
                                xb0Var.R.M(xb0Var.F0);
                            } else {
                                location.setLatitude(20.659322d);
                                xb0Var.F0.setLongitude(-11.40625d);
                            }
                        }
                    }
                    try {
                        xb0Var.G.l(true);
                    } catch (Exception e11) {
                        org.telegram.messenger.f8.g(e11, false);
                    }
                    xb0Var.G.h().u0();
                    xb0Var.G.h().v0();
                    xb0Var.G.h().t0();
                    xb0Var.G.n(new eb0(xb0Var, 4));
                    xb0Var.G.p(new ib0(xb0Var, 1));
                    xb0Var.G.o(new m4.l0(xb0Var, e));
                    xb0Var.G.m(new bb0(xb0Var, 6));
                    LocationManager locationManager = (LocationManager) org.telegram.messenger.w0.f18945b.getSystemService("location");
                    List<String> providers = locationManager.getProviders(true);
                    Location location2 = null;
                    for (int size = providers.size() - 1; size >= 0; size--) {
                        location2 = locationManager.getLastKnownLocation(providers.get(size));
                        if (location2 != null) {
                            xb0Var.E0 = location2;
                            xb0Var.G0(location2);
                            if (xb0Var.f43314k0 && xb0Var.getParentActivity() != null) {
                                xb0Var.f43314k0 = false;
                                xb0Var.l0();
                            }
                            imageView = xb0Var.f43304c;
                            if (imageView != null && imageView.getVisibility() == 0 && (h = xb0Var.getLocationController().h(xb0Var.f43317n0)) != null && (i11 = h.f17285f) > 0) {
                                xb0Var.m0(i11);
                            }
                        }
                    }
                    xb0Var.E0 = location2;
                    xb0Var.G0(location2);
                    if (xb0Var.f43314k0) {
                        xb0Var.f43314k0 = false;
                        xb0Var.l0();
                    }
                    imageView = xb0Var.f43304c;
                    if (imageView != null) {
                        xb0Var.m0(i11);
                    }
                }
                org.telegram.messenger.i0.g3(new bb0(xb0Var, 5));
                return;
            default:
                xb0 xb0Var2 = this.f37991b;
                Location location3 = (Location) obj;
                xb0Var2.G0(location3);
                xb0Var2.getLocationController().n(location3, xb0Var2.m0);
                xb0Var2.m0 = false;
                return;
        }
    }
}
