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
public final class ga0 implements q0.a {
    public final int f46056a;
    public final sa0 f46057b;

    public ga0(sa0 sa0Var, int i7) {
        this.f46056a = i7;
        this.f46057b = sa0Var;
    }

    @Override
    public final void accept(Object obj) {
        int i7;
        float e10;
        ImageView imageView;
        org.telegram.messenger.rd h;
        int i10;
        switch (this.f46056a) {
            case 0:
                sa0 sa0Var = this.f46057b;
                sa0Var.E = (org.telegram.messenger.fa) obj;
                if (org.telegram.messenger.g0.B(sa0Var.getThemedColor(org.telegram.ui.ActionBar.m6.f27890d6)) < 0.721f) {
                    i7 = 2131624085;
                } else {
                    i7 = 0;
                }
                if (i7 != 0) {
                    sa0Var.f49779h0 = true;
                    sa0Var.E.i(((nb.a) org.telegram.messenger.t0.k()).loadRawResourceStyle(org.telegram.messenger.t0.f25570b, i7));
                }
                sa0Var.E.o(org.telegram.messenger.g0.L(70.0f), 0, org.telegram.messenger.g0.L(70.0f), sa0Var.t0());
                if (sa0Var.E != null) {
                    ((bi.x5) ((a8.r7) sa0Var.G).f614b).animate().alpha(1.0f).setStartDelay(200L).setDuration(100L).setUpdateListener(new a3(sa0Var, 15)).start();
                    if (sa0Var.O0) {
                        e10 = sa0Var.E.f() + 4.0f;
                    } else {
                        e10 = sa0Var.E.e() - 4.0f;
                    }
                    TLRPC.TL_channelLocation tL_channelLocation = sa0Var.B0;
                    if (tL_channelLocation != null) {
                        TLRPC.GeoPoint geoPoint = tL_channelLocation.geo_point;
                        double d = geoPoint.lat;
                        double d2 = geoPoint._long;
                        ?? obj2 = new Object();
                        if (org.telegram.messenger.m5.E(sa0Var.f49783l0)) {
                            obj2.f48480c = sa0Var.getMessagesController().a2(Long.valueOf(sa0Var.f49783l0));
                        } else {
                            obj2.d = sa0Var.getMessagesController().M0(Long.valueOf(-sa0Var.f49783l0));
                        }
                        obj2.f48478a = sa0Var.f49783l0;
                        sa0Var.H0(obj2);
                        try {
                            gf.g gVar = (gf.g) ((nb.a) org.telegram.messenger.t0.k()).onCreateMarkerOptions();
                            ((m8.g) gVar.f13891b).f19948a = new LatLng(d, d2);
                            Bitmap n02 = sa0Var.n0(obj2);
                            if (n02 != null) {
                                ((m8.g) gVar.f13891b).d = c8.q9.a(n02);
                                m8.g gVar2 = (m8.g) gVar.f13891b;
                                gVar2.f19951e = 0.5f;
                                gVar2.f19952f = 0.907f;
                                obj2.f48481e = sa0Var.E.a(gVar);
                                if (!org.telegram.messenger.t10.B(obj2.f48480c)) {
                                    gf.g gVar3 = (gf.g) ((nb.a) org.telegram.messenger.t0.k()).onCreateMarkerOptions();
                                    ((m8.g) gVar3.f13891b).f19948a = new LatLng(d, d2);
                                    m8.g gVar4 = (m8.g) gVar3.f13891b;
                                    gVar4.f19954r = true;
                                    gVar4.d = c8.q9.b(2131231649);
                                    m8.g gVar5 = (m8.g) gVar3.f13891b;
                                    gVar5.f19951e = 0.5f;
                                    gVar5.f19952f = 0.5f;
                                    obj2.f48482f = sa0Var.E.a(gVar3);
                                }
                                sa0Var.f49785n0.add(obj2);
                                sa0Var.f49786o0.k(obj2, obj2.f48478a);
                            }
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        sa0Var.E.h(((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(obj2.f48481e.a(), e10));
                    } else {
                        org.telegram.messenger.ij ijVar = sa0Var.D0;
                        if (ijVar != null) {
                            if (ijVar.C3()) {
                                oa0 i02 = sa0Var.i0(sa0Var.D0.f23266k);
                                if (!sa0Var.v0()) {
                                    sa0Var.E.h(((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(i02.f48481e.a(), e10));
                                }
                            } else {
                                double latitude = sa0Var.f49802z0.getLatitude();
                                double longitude = sa0Var.f49802z0.getLongitude();
                                org.telegram.messenger.cb cbVar = new org.telegram.messenger.cb(latitude, longitude);
                                try {
                                    org.telegram.messenger.fa faVar = sa0Var.E;
                                    gf.g gVar6 = (gf.g) ((nb.a) org.telegram.messenger.t0.k()).onCreateMarkerOptions();
                                    ((m8.g) gVar6.f13891b).f19948a = new LatLng(latitude, longitude);
                                    ((m8.g) gVar6.f13891b).d = c8.q9.b(2131231647);
                                    faVar.a(gVar6);
                                } catch (Exception e12) {
                                    org.telegram.messenger.a8.g(e12, true);
                                }
                                sa0Var.E.h(((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(cbVar, e10));
                                sa0Var.m0 = false;
                                sa0Var.v0();
                            }
                        } else {
                            Location location = new Location("network");
                            sa0Var.f49802z0 = location;
                            TLRPC.TL_channelLocation tL_channelLocation2 = sa0Var.C0;
                            if (tL_channelLocation2 != null) {
                                TLRPC.GeoPoint geoPoint2 = tL_channelLocation2.geo_point;
                                sa0Var.E.h(((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(new org.telegram.messenger.cb(geoPoint2.lat, geoPoint2._long), e10));
                                sa0Var.f49802z0.setLatitude(sa0Var.C0.geo_point.lat);
                                sa0Var.f49802z0.setLongitude(sa0Var.C0.geo_point._long);
                                sa0Var.f49802z0.setAccuracy(sa0Var.C0.geo_point.accuracy_radius);
                                sa0Var.P.L(sa0Var.f49802z0);
                            } else {
                                location.setLatitude(20.659322d);
                                sa0Var.f49802z0.setLongitude(-11.40625d);
                            }
                        }
                    }
                    try {
                        sa0Var.E.k(true);
                    } catch (Exception e13) {
                        org.telegram.messenger.a8.g(e13, false);
                    }
                    sa0Var.E.g().Z1();
                    sa0Var.E.g().d2();
                    sa0Var.E.g().X1();
                    sa0Var.E.l(new da0(sa0Var, 5));
                    sa0Var.E.n(new ga0(sa0Var, 1));
                    sa0Var.E.m(new org.telegram.ui.Components.il0(26));
                    org.telegram.messenger.fa faVar2 = sa0Var.E;
                    aa0 aa0Var = new aa0(sa0Var, 6);
                    wf.b bVar = faVar2.f22394a;
                    org.telegram.messenger.j1 j1Var = new org.telegram.messenger.j1(aa0Var, 6);
                    l8.e eVar = (l8.e) bVar.f57666b;
                    try {
                        k8.c cVar = new k8.c(j1Var, (char) 0);
                        Parcel p12 = eVar.p1();
                        v7.b.c(p12, cVar);
                        eVar.t1(p12, 97);
                        LocationManager locationManager = (LocationManager) org.telegram.messenger.t0.f25570b.getSystemService("location");
                        List<String> providers = locationManager.getProviders(true);
                        Location location2 = null;
                        for (int size = providers.size() - 1; size >= 0; size--) {
                            location2 = locationManager.getLastKnownLocation(providers.get(size));
                            if (location2 != null) {
                                sa0Var.f49801y0 = location2;
                                sa0Var.E0(location2);
                                if (sa0Var.f49780i0 && sa0Var.getParentActivity() != null) {
                                    sa0Var.f49780i0 = false;
                                    sa0Var.l0();
                                }
                                imageView = sa0Var.f49771c;
                                if (imageView != null && imageView.getVisibility() == 0 && (h = sa0Var.getLocationController().h(sa0Var.f49783l0)) != null && (i10 = h.f25284f) > 0) {
                                    sa0Var.m0(i10);
                                }
                            }
                        }
                        sa0Var.f49801y0 = location2;
                        sa0Var.E0(location2);
                        if (sa0Var.f49780i0) {
                            sa0Var.f49780i0 = false;
                            sa0Var.l0();
                        }
                        imageView = sa0Var.f49771c;
                        if (imageView != null) {
                            sa0Var.m0(i10);
                        }
                    } catch (RemoteException e14) {
                        throw new RuntimeException(e14);
                    }
                }
                org.telegram.messenger.g0.h3(new aa0(sa0Var, 5));
                return;
            default:
                sa0 sa0Var2 = this.f46057b;
                Location location3 = (Location) obj;
                sa0Var2.E0(location3);
                sa0Var2.getLocationController().n(location3, sa0Var2.f49782k0);
                sa0Var2.f49782k0 = false;
                return;
        }
    }
}
