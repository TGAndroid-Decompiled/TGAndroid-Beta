package org.telegram.ui;

import android.graphics.Bitmap;
import android.location.Location;
import android.location.LocationManager;
import android.widget.ImageView;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class jb0 implements q0.a {
    public final int f38484a;
    public final yb0 f38485b;

    public jb0(yb0 yb0Var, int i10) {
        this.f38484a = i10;
        this.f38485b = yb0Var;
    }

    @Override
    public final void accept(Object obj) {
        int i10;
        float e;
        ImageView imageView;
        org.telegram.messenger.md h;
        int i11;
        switch (this.f38484a) {
            case 0:
                yb0 yb0Var = this.f38485b;
                yb0Var.G = (org.telegram.messenger.ga) obj;
                if (org.telegram.messenger.i0.B(yb0Var.getThemedColor(org.telegram.ui.ActionBar.t6.f20929d6)) < 0.721f) {
                    i10 = 2131624083;
                } else {
                    i10 = 0;
                }
                if (i10 != 0) {
                    yb0Var.f43793j0 = true;
                    yb0Var.G.j(((t7.u) org.telegram.messenger.w0.k()).loadRawResourceStyle(org.telegram.messenger.w0.f19025b, i10));
                }
                yb0Var.G.q(org.telegram.messenger.i0.L(70.0f), 0, org.telegram.messenger.i0.L(70.0f), yb0Var.u0());
                if (yb0Var.G != null) {
                    ((fg.i) ((bh.d) yb0Var.I).f2777a).animate().alpha(1.0f).setStartDelay(200L).setDuration(100L).setUpdateListener(new a3(yb0Var, 15)).start();
                    if (yb0Var.V0) {
                        e = yb0Var.G.f() + 4.0f;
                    } else {
                        e = yb0Var.G.e() - 4.0f;
                    }
                    TLRPC.TL_channelLocation tL_channelLocation = yb0Var.H0;
                    if (tL_channelLocation != null) {
                        TLRPC.GeoPoint geoPoint = tL_channelLocation.geo_point;
                        double d = geoPoint.lat;
                        double d10 = geoPoint._long;
                        ?? obj2 = new Object();
                        if (org.telegram.messenger.o5.E(yb0Var.f43797n0)) {
                            obj2.f41462c = yb0Var.getMessagesController().Z1(Long.valueOf(yb0Var.f43797n0));
                        } else {
                            obj2.d = yb0Var.getMessagesController().L0(Long.valueOf(-yb0Var.f43797n0));
                        }
                        obj2.f41460a = yb0Var.f43797n0;
                        yb0Var.J0(obj2);
                        try {
                            l2.f fVar = (l2.f) ((t7.u) org.telegram.messenger.w0.k()).onCreateMarkerOptions();
                            ((j8.f) fVar.f11587b).f9716a = new LatLng(d, d10);
                            Bitmap n02 = yb0Var.n0(obj2);
                            if (n02 != null) {
                                ((j8.f) fVar.f11587b).d = v7.n8.a(n02);
                                fVar.e(0.907f);
                                obj2.e = yb0Var.G.a(fVar);
                                if (!org.telegram.messenger.h20.B(obj2.f41462c)) {
                                    l2.f fVar2 = (l2.f) ((t7.u) org.telegram.messenger.w0.k()).onCreateMarkerOptions();
                                    ((j8.f) fVar2.f11587b).f9716a = new LatLng(d, d10);
                                    j8.f fVar3 = (j8.f) fVar2.f11587b;
                                    fVar3.f9721r = true;
                                    fVar3.d = v7.n8.b(2131231648);
                                    fVar2.e(0.5f);
                                    obj2.f41463f = yb0Var.G.a(fVar2);
                                }
                                yb0Var.f43799p0.add(obj2);
                                yb0Var.f43800q0.k(obj2, obj2.f41460a);
                            }
                        } catch (Exception e7) {
                            org.telegram.messenger.f8.g(e7, true);
                        }
                        yb0Var.G.i(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLngZoom(obj2.e.a(), e));
                    } else {
                        org.telegram.messenger.jj jjVar = yb0Var.J0;
                        if (jjVar != null) {
                            if (jjVar.C3()) {
                                sb0 h02 = yb0Var.h0(yb0Var.J0.f16337k);
                                if (!yb0Var.w0()) {
                                    yb0Var.G.i(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLngZoom(h02.e.a(), e));
                                }
                            } else {
                                double latitude = yb0Var.F0.getLatitude();
                                double longitude = yb0Var.F0.getLongitude();
                                org.telegram.messenger.cb cbVar = new org.telegram.messenger.cb(latitude, longitude);
                                try {
                                    org.telegram.messenger.ga gaVar = yb0Var.G;
                                    l2.f fVar4 = (l2.f) ((t7.u) org.telegram.messenger.w0.k()).onCreateMarkerOptions();
                                    ((j8.f) fVar4.f11587b).f9716a = new LatLng(latitude, longitude);
                                    ((j8.f) fVar4.f11587b).d = v7.n8.b(2131231646);
                                    gaVar.a(fVar4);
                                } catch (Exception e10) {
                                    org.telegram.messenger.f8.g(e10, true);
                                }
                                yb0Var.G.i(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLngZoom(cbVar, e));
                                yb0Var.f43798o0 = false;
                                yb0Var.w0();
                            }
                        } else {
                            Location location = new Location("network");
                            yb0Var.F0 = location;
                            TLRPC.TL_channelLocation tL_channelLocation2 = yb0Var.I0;
                            if (tL_channelLocation2 != null) {
                                TLRPC.GeoPoint geoPoint2 = tL_channelLocation2.geo_point;
                                yb0Var.G.i(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLngZoom(new org.telegram.messenger.cb(geoPoint2.lat, geoPoint2._long), e));
                                yb0Var.F0.setLatitude(yb0Var.I0.geo_point.lat);
                                yb0Var.F0.setLongitude(yb0Var.I0.geo_point._long);
                                yb0Var.F0.setAccuracy(yb0Var.I0.geo_point.accuracy_radius);
                                yb0Var.R.M(yb0Var.F0);
                            } else {
                                location.setLatitude(20.659322d);
                                yb0Var.F0.setLongitude(-11.40625d);
                            }
                        }
                    }
                    try {
                        yb0Var.G.l(true);
                    } catch (Exception e11) {
                        org.telegram.messenger.f8.g(e11, false);
                    }
                    yb0Var.G.h().u0();
                    yb0Var.G.h().v0();
                    yb0Var.G.h().t0();
                    yb0Var.G.n(new fb0(yb0Var, 4));
                    yb0Var.G.p(new jb0(yb0Var, 1));
                    yb0Var.G.o(new m4.l0(yb0Var, e));
                    yb0Var.G.m(new cb0(yb0Var, 6));
                    LocationManager locationManager = (LocationManager) org.telegram.messenger.w0.f19025b.getSystemService("location");
                    List<String> providers = locationManager.getProviders(true);
                    Location location2 = null;
                    for (int size = providers.size() - 1; size >= 0; size--) {
                        location2 = locationManager.getLastKnownLocation(providers.get(size));
                        if (location2 != null) {
                            yb0Var.E0 = location2;
                            yb0Var.F0(location2);
                            if (yb0Var.f43794k0 && yb0Var.getParentActivity() != null) {
                                yb0Var.f43794k0 = false;
                                yb0Var.k0();
                            }
                            imageView = yb0Var.f43784c;
                            if (imageView != null && imageView.getVisibility() == 0 && (h = yb0Var.getLocationController().h(yb0Var.f43797n0)) != null && (i11 = h.f16943f) > 0) {
                                yb0Var.l0(i11);
                            }
                        }
                    }
                    yb0Var.E0 = location2;
                    yb0Var.F0(location2);
                    if (yb0Var.f43794k0) {
                        yb0Var.f43794k0 = false;
                        yb0Var.k0();
                    }
                    imageView = yb0Var.f43784c;
                    if (imageView != null) {
                        yb0Var.l0(i11);
                    }
                }
                org.telegram.messenger.i0.g3(new cb0(yb0Var, 5));
                return;
            default:
                yb0 yb0Var2 = this.f38485b;
                Location location3 = (Location) obj;
                yb0Var2.F0(location3);
                yb0Var2.getLocationController().n(location3, yb0Var2.m0);
                yb0Var2.m0 = false;
                return;
        }
    }
}
