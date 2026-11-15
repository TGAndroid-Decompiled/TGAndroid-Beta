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
public final class ea0 implements q0.a {
    public final int f46648a;
    public final pa0 f46649b;

    public ea0(pa0 pa0Var, int i7) {
        this.f46648a = i7;
        this.f46649b = pa0Var;
    }

    @Override
    public final void accept(Object obj) {
        int i7;
        float e10;
        ImageView imageView;
        org.telegram.messenger.qd h;
        int i10;
        switch (this.f46648a) {
            case 0:
                pa0 pa0Var = this.f46649b;
                pa0Var.F = (org.telegram.messenger.ea) obj;
                if (org.telegram.messenger.g0.B(pa0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6)) < 0.721f) {
                    i7 = 2131624086;
                } else {
                    i7 = 0;
                }
                if (i7 != 0) {
                    pa0Var.f50182i0 = true;
                    pa0Var.F.i(((pb.b) org.telegram.messenger.t0.k()).loadRawResourceStyle(org.telegram.messenger.t0.f26609b, i7));
                }
                pa0Var.F.o(org.telegram.messenger.g0.L(70.0f), 0, org.telegram.messenger.g0.L(70.0f), pa0Var.t0());
                if (pa0Var.F != null) {
                    ((ai.k0) ((a8.r7) pa0Var.H).f617b).animate().alpha(1.0f).setStartDelay(200L).setDuration(100L).setUpdateListener(new a3(pa0Var, 15)).start();
                    if (pa0Var.P0) {
                        e10 = pa0Var.F.f() + 4.0f;
                    } else {
                        e10 = pa0Var.F.e() - 4.0f;
                    }
                    TLRPC.TL_channelLocation tL_channelLocation = pa0Var.C0;
                    if (tL_channelLocation != null) {
                        TLRPC.GeoPoint geoPoint = tL_channelLocation.geo_point;
                        double d = geoPoint.lat;
                        double d2 = geoPoint._long;
                        ?? obj2 = new Object();
                        if (org.telegram.messenger.m5.E(pa0Var.m0)) {
                            obj2.f48919c = pa0Var.getMessagesController().a2(Long.valueOf(pa0Var.m0));
                        } else {
                            obj2.d = pa0Var.getMessagesController().M0(Long.valueOf(-pa0Var.m0));
                        }
                        obj2.f48917a = pa0Var.m0;
                        pa0Var.H0(obj2);
                        try {
                            hi.l0 l0Var = (hi.l0) ((pb.b) org.telegram.messenger.t0.k()).onCreateMarkerOptions();
                            ((m8.g) l0Var.f14544b).f20540a = new LatLng(d, d2);
                            Bitmap n02 = pa0Var.n0(obj2);
                            if (n02 != null) {
                                ((m8.g) l0Var.f14544b).d = c8.p9.a(n02);
                                m8.g gVar = (m8.g) l0Var.f14544b;
                                gVar.f20543e = 0.5f;
                                gVar.f20544f = 0.907f;
                                obj2.f48920e = pa0Var.F.a(l0Var);
                                if (!org.telegram.messenger.q10.B(obj2.f48919c)) {
                                    hi.l0 l0Var2 = (hi.l0) ((pb.b) org.telegram.messenger.t0.k()).onCreateMarkerOptions();
                                    ((m8.g) l0Var2.f14544b).f20540a = new LatLng(d, d2);
                                    m8.g gVar2 = (m8.g) l0Var2.f14544b;
                                    gVar2.f20546r = true;
                                    gVar2.d = c8.p9.b(2131231649);
                                    m8.g gVar3 = (m8.g) l0Var2.f14544b;
                                    gVar3.f20543e = 0.5f;
                                    gVar3.f20544f = 0.5f;
                                    obj2.f48921f = pa0Var.F.a(l0Var2);
                                }
                                pa0Var.f50188o0.add(obj2);
                                pa0Var.f50189p0.k(obj2, obj2.f48917a);
                            }
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        pa0Var.F.h(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(obj2.f48920e.a(), e10));
                    } else {
                        org.telegram.messenger.gj gjVar = pa0Var.E0;
                        if (gjVar != null) {
                            if (gjVar.C3()) {
                                la0 i02 = pa0Var.i0(pa0Var.E0.f23819k);
                                if (!pa0Var.v0()) {
                                    pa0Var.F.h(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(i02.f48920e.a(), e10));
                                }
                            } else {
                                double latitude = pa0Var.A0.getLatitude();
                                double longitude = pa0Var.A0.getLongitude();
                                org.telegram.messenger.bb bbVar = new org.telegram.messenger.bb(latitude, longitude);
                                try {
                                    org.telegram.messenger.ea eaVar = pa0Var.F;
                                    hi.l0 l0Var3 = (hi.l0) ((pb.b) org.telegram.messenger.t0.k()).onCreateMarkerOptions();
                                    ((m8.g) l0Var3.f14544b).f20540a = new LatLng(latitude, longitude);
                                    ((m8.g) l0Var3.f14544b).d = c8.p9.b(2131231647);
                                    eaVar.a(l0Var3);
                                } catch (Exception e12) {
                                    org.telegram.messenger.a8.g(e12, true);
                                }
                                pa0Var.F.h(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(bbVar, e10));
                                pa0Var.f50187n0 = false;
                                pa0Var.v0();
                            }
                        } else {
                            Location location = new Location("network");
                            pa0Var.A0 = location;
                            TLRPC.TL_channelLocation tL_channelLocation2 = pa0Var.D0;
                            if (tL_channelLocation2 != null) {
                                TLRPC.GeoPoint geoPoint2 = tL_channelLocation2.geo_point;
                                pa0Var.F.h(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(new org.telegram.messenger.bb(geoPoint2.lat, geoPoint2._long), e10));
                                pa0Var.A0.setLatitude(pa0Var.D0.geo_point.lat);
                                pa0Var.A0.setLongitude(pa0Var.D0.geo_point._long);
                                pa0Var.A0.setAccuracy(pa0Var.D0.geo_point.accuracy_radius);
                                pa0Var.Q.L(pa0Var.A0);
                            } else {
                                location.setLatitude(20.659322d);
                                pa0Var.A0.setLongitude(-11.40625d);
                            }
                        }
                    }
                    try {
                        pa0Var.F.k(true);
                    } catch (Exception e13) {
                        org.telegram.messenger.a8.g(e13, false);
                    }
                    pa0Var.F.g().C0();
                    pa0Var.F.g().D0();
                    pa0Var.F.g().B0();
                    pa0Var.F.l(new ba0(pa0Var, 5));
                    pa0Var.F.n(new ea0(pa0Var, 1));
                    pa0Var.F.m(new t70(2));
                    org.telegram.messenger.ea eaVar2 = pa0Var.F;
                    y90 y90Var = new y90(pa0Var, 6);
                    k8.a aVar = eaVar2.f23288a;
                    org.telegram.messenger.j1 j1Var = new org.telegram.messenger.j1(y90Var, 6);
                    l8.e eVar = (l8.e) aVar.f17788b;
                    try {
                        k8.c cVar = new k8.c(j1Var, (char) 0);
                        Parcel p12 = eVar.p1();
                        v7.b.c(p12, cVar);
                        eVar.t1(p12, 97);
                        LocationManager locationManager = (LocationManager) org.telegram.messenger.t0.f26609b.getSystemService("location");
                        List<String> providers = locationManager.getProviders(true);
                        Location location2 = null;
                        for (int size = providers.size() - 1; size >= 0; size--) {
                            location2 = locationManager.getLastKnownLocation(providers.get(size));
                            if (location2 != null) {
                                pa0Var.f50204z0 = location2;
                                pa0Var.E0(location2);
                                if (pa0Var.f50183j0 && pa0Var.getParentActivity() != null) {
                                    pa0Var.f50183j0 = false;
                                    pa0Var.l0();
                                }
                                imageView = pa0Var.f50173c;
                                if (imageView != null && imageView.getVisibility() == 0 && (h = pa0Var.getLocationController().h(pa0Var.m0)) != null && (i10 = h.f26082f) > 0) {
                                    pa0Var.m0(i10);
                                }
                            }
                        }
                        pa0Var.f50204z0 = location2;
                        pa0Var.E0(location2);
                        if (pa0Var.f50183j0) {
                            pa0Var.f50183j0 = false;
                            pa0Var.l0();
                        }
                        imageView = pa0Var.f50173c;
                        if (imageView != null) {
                            pa0Var.m0(i10);
                        }
                    } catch (RemoteException e14) {
                        throw new RuntimeException(e14);
                    }
                }
                org.telegram.messenger.g0.h3(new y90(pa0Var, 5));
                return;
            default:
                pa0 pa0Var2 = this.f46649b;
                Location location3 = (Location) obj;
                pa0Var2.E0(location3);
                pa0Var2.getLocationController().n(location3, pa0Var2.f50185l0);
                pa0Var2.f50185l0 = false;
                return;
        }
    }
}
