package org.telegram.ui;

import android.graphics.Bitmap;
import android.location.Location;
import android.location.LocationManager;
import android.os.Parcel;
import android.os.RemoteException;
import android.widget.ImageView;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class fa0 implements q0.a {
    public final int f45674a;
    public final ra0 f45675b;

    public fa0(ra0 ra0Var, int i7) {
        this.f45674a = i7;
        this.f45675b = ra0Var;
    }

    @Override
    public final void accept(Object obj) {
        int i7;
        float e10;
        ImageView imageView;
        org.telegram.messenger.rd h;
        int i10;
        switch (this.f45674a) {
            case 0:
                ra0 ra0Var = this.f45675b;
                ra0Var.E = (org.telegram.messenger.fa) obj;
                if (org.telegram.messenger.g0.B(ra0Var.getThemedColor(org.telegram.ui.ActionBar.l6.f27865d6)) < 0.721f) {
                    i7 = 2131624085;
                } else {
                    i7 = 0;
                }
                if (i7 != 0) {
                    ra0Var.f49370h0 = true;
                    ra0Var.E.i(((nb.a) org.telegram.messenger.t0.k()).loadRawResourceStyle(org.telegram.messenger.t0.f25566b, i7));
                }
                ra0Var.E.o(org.telegram.messenger.g0.L(70.0f), 0, org.telegram.messenger.g0.L(70.0f), ra0Var.t0());
                if (ra0Var.E != null) {
                    ((bi.x5) ((a8.r7) ra0Var.G).f614b).animate().alpha(1.0f).setStartDelay(200L).setDuration(100L).setUpdateListener(new a3(ra0Var, 15)).start();
                    if (ra0Var.O0) {
                        e10 = ra0Var.E.f() + 4.0f;
                    } else {
                        e10 = ra0Var.E.e() - 4.0f;
                    }
                    TLRPC.TL_channelLocation tL_channelLocation = ra0Var.B0;
                    if (tL_channelLocation != null) {
                        TLRPC.GeoPoint geoPoint = tL_channelLocation.geo_point;
                        double d = geoPoint.lat;
                        double d2 = geoPoint._long;
                        ?? obj2 = new Object();
                        if (org.telegram.messenger.m5.E(ra0Var.f49374l0)) {
                            obj2.f48141c = ra0Var.getMessagesController().a2(Long.valueOf(ra0Var.f49374l0));
                        } else {
                            obj2.d = ra0Var.getMessagesController().M0(Long.valueOf(-ra0Var.f49374l0));
                        }
                        obj2.f48139a = ra0Var.f49374l0;
                        ra0Var.H0(obj2);
                        try {
                            gf.g gVar = (gf.g) ((nb.a) org.telegram.messenger.t0.k()).onCreateMarkerOptions();
                            ((m8.g) gVar.f13889b).f19943a = new LatLng(d, d2);
                            Bitmap n02 = ra0Var.n0(obj2);
                            if (n02 != null) {
                                ((m8.g) gVar.f13889b).d = c8.q9.a(n02);
                                m8.g gVar2 = (m8.g) gVar.f13889b;
                                gVar2.f19946e = 0.5f;
                                gVar2.f19947f = 0.907f;
                                obj2.f48142e = ra0Var.E.a(gVar);
                                if (!org.telegram.messenger.t10.B(obj2.f48141c)) {
                                    gf.g gVar3 = (gf.g) ((nb.a) org.telegram.messenger.t0.k()).onCreateMarkerOptions();
                                    ((m8.g) gVar3.f13889b).f19943a = new LatLng(d, d2);
                                    m8.g gVar4 = (m8.g) gVar3.f13889b;
                                    gVar4.f19949r = true;
                                    gVar4.d = c8.q9.b(2131231649);
                                    m8.g gVar5 = (m8.g) gVar3.f13889b;
                                    gVar5.f19946e = 0.5f;
                                    gVar5.f19947f = 0.5f;
                                    obj2.f48143f = ra0Var.E.a(gVar3);
                                }
                                ra0Var.f49376n0.add(obj2);
                                ra0Var.f49377o0.k(obj2, obj2.f48139a);
                            }
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        ra0Var.E.h(((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(obj2.f48142e.a(), e10));
                    } else {
                        org.telegram.messenger.ij ijVar = ra0Var.D0;
                        if (ijVar != null) {
                            if (ijVar.C3()) {
                                na0 i02 = ra0Var.i0(ra0Var.D0.f23262k);
                                if (!ra0Var.v0()) {
                                    ra0Var.E.h(((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(i02.f48142e.a(), e10));
                                }
                            } else {
                                double latitude = ra0Var.f49393z0.getLatitude();
                                double longitude = ra0Var.f49393z0.getLongitude();
                                org.telegram.messenger.cb cbVar = new org.telegram.messenger.cb(latitude, longitude);
                                try {
                                    org.telegram.messenger.fa faVar = ra0Var.E;
                                    gf.g gVar6 = (gf.g) ((nb.a) org.telegram.messenger.t0.k()).onCreateMarkerOptions();
                                    ((m8.g) gVar6.f13889b).f19943a = new LatLng(latitude, longitude);
                                    ((m8.g) gVar6.f13889b).d = c8.q9.b(2131231647);
                                    faVar.a(gVar6);
                                } catch (Exception e12) {
                                    org.telegram.messenger.a8.g(e12, true);
                                }
                                ra0Var.E.h(((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(cbVar, e10));
                                ra0Var.m0 = false;
                                ra0Var.v0();
                            }
                        } else {
                            Location location = new Location("network");
                            ra0Var.f49393z0 = location;
                            TLRPC.TL_channelLocation tL_channelLocation2 = ra0Var.C0;
                            if (tL_channelLocation2 != null) {
                                TLRPC.GeoPoint geoPoint2 = tL_channelLocation2.geo_point;
                                ra0Var.E.h(((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(new org.telegram.messenger.cb(geoPoint2.lat, geoPoint2._long), e10));
                                ra0Var.f49393z0.setLatitude(ra0Var.C0.geo_point.lat);
                                ra0Var.f49393z0.setLongitude(ra0Var.C0.geo_point._long);
                                ra0Var.f49393z0.setAccuracy(ra0Var.C0.geo_point.accuracy_radius);
                                ra0Var.P.L(ra0Var.f49393z0);
                            } else {
                                location.setLatitude(20.659322d);
                                ra0Var.f49393z0.setLongitude(-11.40625d);
                            }
                        }
                    }
                    try {
                        ra0Var.E.k(true);
                    } catch (Exception e13) {
                        org.telegram.messenger.a8.g(e13, false);
                    }
                    ra0Var.E.g().Z1();
                    ra0Var.E.g().d2();
                    ra0Var.E.g().X1();
                    ra0Var.E.l(new ca0(ra0Var, 5));
                    ra0Var.E.n(new fa0(ra0Var, 1));
                    ra0Var.E.m(new org.telegram.ui.Components.jl0(26));
                    org.telegram.messenger.fa faVar2 = ra0Var.E;
                    z90 z90Var = new z90(ra0Var, 6);
                    wf.b bVar = faVar2.f22390a;
                    org.telegram.messenger.j1 j1Var = new org.telegram.messenger.j1(z90Var, 6);
                    l8.e eVar = (l8.e) bVar.f57667b;
                    try {
                        k8.c cVar = new k8.c(j1Var, (char) 0);
                        Parcel p12 = eVar.p1();
                        v7.b.c(p12, cVar);
                        eVar.t1(p12, 97);
                        LocationManager locationManager = (LocationManager) org.telegram.messenger.t0.f25566b.getSystemService("location");
                        List<String> providers = locationManager.getProviders(true);
                        Location location2 = null;
                        for (int size = providers.size() - 1; size >= 0; size--) {
                            location2 = locationManager.getLastKnownLocation(providers.get(size));
                            if (location2 != null) {
                                ra0Var.f49392y0 = location2;
                                ra0Var.E0(location2);
                                if (ra0Var.f49371i0 && ra0Var.getParentActivity() != null) {
                                    ra0Var.f49371i0 = false;
                                    ra0Var.l0();
                                }
                                imageView = ra0Var.f49362c;
                                if (imageView != null && imageView.getVisibility() == 0 && (h = ra0Var.getLocationController().h(ra0Var.f49374l0)) != null && (i10 = h.f25280f) > 0) {
                                    ra0Var.m0(i10);
                                }
                            }
                        }
                        ra0Var.f49392y0 = location2;
                        ra0Var.E0(location2);
                        if (ra0Var.f49371i0) {
                            ra0Var.f49371i0 = false;
                            ra0Var.l0();
                        }
                        imageView = ra0Var.f49362c;
                        if (imageView != null) {
                            ra0Var.m0(i10);
                        }
                    } catch (RemoteException e14) {
                        throw new RuntimeException(e14);
                    }
                }
                org.telegram.messenger.g0.h3(new z90(ra0Var, 5));
                return;
            default:
                ra0 ra0Var2 = this.f45675b;
                Location location3 = (Location) obj;
                ra0Var2.E0(location3);
                ra0Var2.getLocationController().n(location3, ra0Var2.f49373k0);
                ra0Var2.f49373k0 = false;
                return;
        }
    }
}
