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
public final class da0 implements q0.a {
    public final int f45034a;
    public final pa0 f45035b;

    public da0(pa0 pa0Var, int i7) {
        this.f45034a = i7;
        this.f45035b = pa0Var;
    }

    @Override
    public final void accept(Object obj) {
        int i7;
        float e10;
        ImageView imageView;
        org.telegram.messenger.rd h;
        int i10;
        switch (this.f45034a) {
            case 0:
                pa0 pa0Var = this.f45035b;
                pa0Var.E = (org.telegram.messenger.fa) obj;
                if (org.telegram.messenger.g0.B(pa0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f27852d6)) < 0.721f) {
                    i7 = 2131624085;
                } else {
                    i7 = 0;
                }
                if (i7 != 0) {
                    pa0Var.f48735h0 = true;
                    pa0Var.E.i(((nb.a) org.telegram.messenger.t0.k()).loadRawResourceStyle(org.telegram.messenger.t0.f25566b, i7));
                }
                pa0Var.E.o(org.telegram.messenger.g0.L(70.0f), 0, org.telegram.messenger.g0.L(70.0f), pa0Var.t0());
                if (pa0Var.E != null) {
                    ((bi.x5) ((a8.r7) pa0Var.G).f614b).animate().alpha(1.0f).setStartDelay(200L).setDuration(100L).setUpdateListener(new a3(pa0Var, 15)).start();
                    if (pa0Var.O0) {
                        e10 = pa0Var.E.f() + 4.0f;
                    } else {
                        e10 = pa0Var.E.e() - 4.0f;
                    }
                    TLRPC.TL_channelLocation tL_channelLocation = pa0Var.B0;
                    if (tL_channelLocation != null) {
                        TLRPC.GeoPoint geoPoint = tL_channelLocation.geo_point;
                        double d = geoPoint.lat;
                        double d2 = geoPoint._long;
                        ?? obj2 = new Object();
                        if (org.telegram.messenger.m5.E(pa0Var.f48739l0)) {
                            obj2.f47490c = pa0Var.getMessagesController().a2(Long.valueOf(pa0Var.f48739l0));
                        } else {
                            obj2.d = pa0Var.getMessagesController().M0(Long.valueOf(-pa0Var.f48739l0));
                        }
                        obj2.f47488a = pa0Var.f48739l0;
                        pa0Var.H0(obj2);
                        try {
                            gf.g gVar = (gf.g) ((nb.a) org.telegram.messenger.t0.k()).onCreateMarkerOptions();
                            ((m8.g) gVar.f13889b).f19943a = new LatLng(d, d2);
                            Bitmap n02 = pa0Var.n0(obj2);
                            if (n02 != null) {
                                ((m8.g) gVar.f13889b).d = c8.q9.a(n02);
                                m8.g gVar2 = (m8.g) gVar.f13889b;
                                gVar2.f19946e = 0.5f;
                                gVar2.f19947f = 0.907f;
                                obj2.f47491e = pa0Var.E.a(gVar);
                                if (!org.telegram.messenger.t10.B(obj2.f47490c)) {
                                    gf.g gVar3 = (gf.g) ((nb.a) org.telegram.messenger.t0.k()).onCreateMarkerOptions();
                                    ((m8.g) gVar3.f13889b).f19943a = new LatLng(d, d2);
                                    m8.g gVar4 = (m8.g) gVar3.f13889b;
                                    gVar4.f19949r = true;
                                    gVar4.d = c8.q9.b(2131231649);
                                    m8.g gVar5 = (m8.g) gVar3.f13889b;
                                    gVar5.f19946e = 0.5f;
                                    gVar5.f19947f = 0.5f;
                                    obj2.f47492f = pa0Var.E.a(gVar3);
                                }
                                pa0Var.f48741n0.add(obj2);
                                pa0Var.f48742o0.k(obj2, obj2.f47488a);
                            }
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        pa0Var.E.h(((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(obj2.f47491e.a(), e10));
                    } else {
                        org.telegram.messenger.ij ijVar = pa0Var.D0;
                        if (ijVar != null) {
                            if (ijVar.D3()) {
                                la0 i02 = pa0Var.i0(pa0Var.D0.f23262k);
                                if (!pa0Var.v0()) {
                                    pa0Var.E.h(((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(i02.f47491e.a(), e10));
                                }
                            } else {
                                double latitude = pa0Var.f48758z0.getLatitude();
                                double longitude = pa0Var.f48758z0.getLongitude();
                                org.telegram.messenger.cb cbVar = new org.telegram.messenger.cb(latitude, longitude);
                                try {
                                    org.telegram.messenger.fa faVar = pa0Var.E;
                                    gf.g gVar6 = (gf.g) ((nb.a) org.telegram.messenger.t0.k()).onCreateMarkerOptions();
                                    ((m8.g) gVar6.f13889b).f19943a = new LatLng(latitude, longitude);
                                    ((m8.g) gVar6.f13889b).d = c8.q9.b(2131231647);
                                    faVar.a(gVar6);
                                } catch (Exception e12) {
                                    org.telegram.messenger.a8.g(e12, true);
                                }
                                pa0Var.E.h(((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(cbVar, e10));
                                pa0Var.m0 = false;
                                pa0Var.v0();
                            }
                        } else {
                            Location location = new Location("network");
                            pa0Var.f48758z0 = location;
                            TLRPC.TL_channelLocation tL_channelLocation2 = pa0Var.C0;
                            if (tL_channelLocation2 != null) {
                                TLRPC.GeoPoint geoPoint2 = tL_channelLocation2.geo_point;
                                pa0Var.E.h(((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(new org.telegram.messenger.cb(geoPoint2.lat, geoPoint2._long), e10));
                                pa0Var.f48758z0.setLatitude(pa0Var.C0.geo_point.lat);
                                pa0Var.f48758z0.setLongitude(pa0Var.C0.geo_point._long);
                                pa0Var.f48758z0.setAccuracy(pa0Var.C0.geo_point.accuracy_radius);
                                pa0Var.P.L(pa0Var.f48758z0);
                            } else {
                                location.setLatitude(20.659322d);
                                pa0Var.f48758z0.setLongitude(-11.40625d);
                            }
                        }
                    }
                    try {
                        pa0Var.E.k(true);
                    } catch (Exception e13) {
                        org.telegram.messenger.a8.g(e13, false);
                    }
                    pa0Var.E.g().Z1();
                    pa0Var.E.g().d2();
                    pa0Var.E.g().X1();
                    pa0Var.E.l(new aa0(pa0Var, 5));
                    pa0Var.E.n(new da0(pa0Var, 1));
                    pa0Var.E.m(new org.telegram.ui.Components.il0(26));
                    org.telegram.messenger.fa faVar2 = pa0Var.E;
                    x90 x90Var = new x90(pa0Var, 6);
                    wf.b bVar = faVar2.f22390a;
                    org.telegram.messenger.j1 j1Var = new org.telegram.messenger.j1(x90Var, 6);
                    l8.e eVar = (l8.e) bVar.f57655b;
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
                                pa0Var.f48757y0 = location2;
                                pa0Var.E0(location2);
                                if (pa0Var.f48736i0 && pa0Var.getParentActivity() != null) {
                                    pa0Var.f48736i0 = false;
                                    pa0Var.l0();
                                }
                                imageView = pa0Var.f48727c;
                                if (imageView != null && imageView.getVisibility() == 0 && (h = pa0Var.getLocationController().h(pa0Var.f48739l0)) != null && (i10 = h.f25280f) > 0) {
                                    pa0Var.m0(i10);
                                }
                            }
                        }
                        pa0Var.f48757y0 = location2;
                        pa0Var.E0(location2);
                        if (pa0Var.f48736i0) {
                            pa0Var.f48736i0 = false;
                            pa0Var.l0();
                        }
                        imageView = pa0Var.f48727c;
                        if (imageView != null) {
                            pa0Var.m0(i10);
                        }
                    } catch (RemoteException e14) {
                        throw new RuntimeException(e14);
                    }
                }
                org.telegram.messenger.g0.h3(new x90(pa0Var, 5));
                return;
            default:
                pa0 pa0Var2 = this.f45035b;
                Location location3 = (Location) obj;
                pa0Var2.E0(location3);
                pa0Var2.getLocationController().n(location3, pa0Var2.f48738k0);
                pa0Var2.f48738k0 = false;
                return;
        }
    }
}
