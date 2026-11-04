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
public final class aa0 implements q0.a {
    public final int f43698a;
    public final la0 f43699b;

    public aa0(la0 la0Var, int i3) {
        this.f43698a = i3;
        this.f43699b = la0Var;
    }

    @Override
    public final void accept(Object obj) {
        int i3;
        float e10;
        ImageView imageView;
        org.telegram.messenger.kd h;
        int i10;
        switch (this.f43698a) {
            case 0:
                la0 la0Var = this.f43699b;
                la0Var.F = (org.telegram.messenger.z9) obj;
                if (org.telegram.messenger.g0.B(la0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6)) < 0.721f) {
                    i3 = 2131624085;
                } else {
                    i3 = 0;
                }
                if (i3 != 0) {
                    la0Var.f47252i0 = true;
                    la0Var.F.i(((mb.b) org.telegram.messenger.t0.k()).loadRawResourceStyle(org.telegram.messenger.t0.f25457b, i3));
                }
                la0Var.F.o(org.telegram.messenger.g0.L(70.0f), 0, org.telegram.messenger.g0.L(70.0f), la0Var.t0());
                if (la0Var.F != null) {
                    ((ai.c0) ((b8.ke) la0Var.H).f2716b).animate().alpha(1.0f).setStartDelay(200L).setDuration(100L).setUpdateListener(new b3(la0Var, 15)).start();
                    if (la0Var.P0) {
                        e10 = la0Var.F.f() + 4.0f;
                    } else {
                        e10 = la0Var.F.e() - 4.0f;
                    }
                    TLRPC.TL_channelLocation tL_channelLocation = la0Var.C0;
                    if (tL_channelLocation != null) {
                        TLRPC.GeoPoint geoPoint = tL_channelLocation.geo_point;
                        double d = geoPoint.lat;
                        double d10 = geoPoint._long;
                        ?? obj2 = new Object();
                        if (org.telegram.messenger.m5.E(la0Var.m0)) {
                            obj2.f45882c = la0Var.getMessagesController().a2(Long.valueOf(la0Var.m0));
                        } else {
                            obj2.d = la0Var.getMessagesController().M0(Long.valueOf(-la0Var.m0));
                        }
                        obj2.f45880a = la0Var.m0;
                        la0Var.H0(obj2);
                        try {
                            gi.v5 v5Var = (gi.v5) ((mb.b) org.telegram.messenger.t0.k()).onCreateMarkerOptions();
                            ((l8.g) v5Var.f13688b).f18111a = new LatLng(d, d10);
                            Bitmap n02 = la0Var.n0(obj2);
                            if (n02 != null) {
                                ((l8.g) v5Var.f13688b).d = b8.wd.a(n02);
                                l8.g gVar = (l8.g) v5Var.f13688b;
                                gVar.f18114e = 0.5f;
                                gVar.f18115f = 0.907f;
                                obj2.f45883e = la0Var.F.a(v5Var);
                                if (!org.telegram.messenger.l10.B(obj2.f45882c)) {
                                    gi.v5 v5Var2 = (gi.v5) ((mb.b) org.telegram.messenger.t0.k()).onCreateMarkerOptions();
                                    ((l8.g) v5Var2.f13688b).f18111a = new LatLng(d, d10);
                                    l8.g gVar2 = (l8.g) v5Var2.f13688b;
                                    gVar2.f18117r = true;
                                    gVar2.d = b8.wd.b(2131231649);
                                    l8.g gVar3 = (l8.g) v5Var2.f13688b;
                                    gVar3.f18114e = 0.5f;
                                    gVar3.f18115f = 0.5f;
                                    obj2.f45884f = la0Var.F.a(v5Var2);
                                }
                                la0Var.f47258o0.add(obj2);
                                la0Var.f47259p0.k(obj2, obj2.f45880a);
                            }
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        la0Var.F.h(((mb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(obj2.f45883e.a(), e10));
                    } else {
                        org.telegram.messenger.zi ziVar = la0Var.E0;
                        if (ziVar != null) {
                            if (ziVar.D3()) {
                                ha0 i02 = la0Var.i0(la0Var.E0.f26868k);
                                if (!la0Var.v0()) {
                                    la0Var.F.h(((mb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(i02.f45883e.a(), e10));
                                }
                            } else {
                                double latitude = la0Var.A0.getLatitude();
                                double longitude = la0Var.A0.getLongitude();
                                org.telegram.messenger.va vaVar = new org.telegram.messenger.va(latitude, longitude);
                                try {
                                    org.telegram.messenger.z9 z9Var = la0Var.F;
                                    gi.v5 v5Var3 = (gi.v5) ((mb.b) org.telegram.messenger.t0.k()).onCreateMarkerOptions();
                                    ((l8.g) v5Var3.f13688b).f18111a = new LatLng(latitude, longitude);
                                    ((l8.g) v5Var3.f13688b).d = b8.wd.b(2131231647);
                                    z9Var.a(v5Var3);
                                } catch (Exception e12) {
                                    org.telegram.messenger.a8.g(e12, true);
                                }
                                la0Var.F.h(((mb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(vaVar, e10));
                                la0Var.f47257n0 = false;
                                la0Var.v0();
                            }
                        } else {
                            Location location = new Location("network");
                            la0Var.A0 = location;
                            TLRPC.TL_channelLocation tL_channelLocation2 = la0Var.D0;
                            if (tL_channelLocation2 != null) {
                                TLRPC.GeoPoint geoPoint2 = tL_channelLocation2.geo_point;
                                la0Var.F.h(((mb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(new org.telegram.messenger.va(geoPoint2.lat, geoPoint2._long), e10));
                                la0Var.A0.setLatitude(la0Var.D0.geo_point.lat);
                                la0Var.A0.setLongitude(la0Var.D0.geo_point._long);
                                la0Var.A0.setAccuracy(la0Var.D0.geo_point.accuracy_radius);
                                la0Var.Q.L(la0Var.A0);
                            } else {
                                location.setLatitude(20.659322d);
                                la0Var.A0.setLongitude(-11.40625d);
                            }
                        }
                    }
                    try {
                        la0Var.F.k(true);
                    } catch (Exception e13) {
                        org.telegram.messenger.a8.g(e13, false);
                    }
                    la0Var.F.g().n2();
                    la0Var.F.g().s2();
                    la0Var.F.g().k2();
                    la0Var.F.l(new x90(la0Var, 5));
                    la0Var.F.n(new aa0(la0Var, 1));
                    la0Var.F.m(new u70(1));
                    org.telegram.messenger.z9 z9Var2 = la0Var.F;
                    u90 u90Var = new u90(la0Var, 6);
                    p4.q qVar = z9Var2.f26754a;
                    org.telegram.messenger.p1 p1Var = new org.telegram.messenger.p1(u90Var, 5);
                    k8.e eVar = (k8.e) qVar.f53181a;
                    try {
                        j8.b bVar = new j8.b(p1Var, (char) 0);
                        Parcel P0 = eVar.P0();
                        u7.b.c(P0, bVar);
                        eVar.T0(P0, 97);
                        LocationManager locationManager = (LocationManager) org.telegram.messenger.t0.f25457b.getSystemService("location");
                        List<String> providers = locationManager.getProviders(true);
                        Location location2 = null;
                        for (int size = providers.size() - 1; size >= 0; size--) {
                            location2 = locationManager.getLastKnownLocation(providers.get(size));
                            if (location2 != null) {
                                la0Var.f47274z0 = location2;
                                la0Var.E0(location2);
                                if (la0Var.f47253j0 && la0Var.getParentActivity() != null) {
                                    la0Var.f47253j0 = false;
                                    la0Var.l0();
                                }
                                imageView = la0Var.f47243c;
                                if (imageView != null && imageView.getVisibility() == 0 && (h = la0Var.getLocationController().h(la0Var.m0)) != null && (i10 = h.f23814f) > 0) {
                                    la0Var.m0(i10);
                                }
                            }
                        }
                        la0Var.f47274z0 = location2;
                        la0Var.E0(location2);
                        if (la0Var.f47253j0) {
                            la0Var.f47253j0 = false;
                            la0Var.l0();
                        }
                        imageView = la0Var.f47243c;
                        if (imageView != null) {
                            la0Var.m0(i10);
                        }
                    } catch (RemoteException e14) {
                        throw new RuntimeException(e14);
                    }
                }
                org.telegram.messenger.g0.h3(new u90(la0Var, 5));
                return;
            default:
                la0 la0Var2 = this.f43699b;
                Location location3 = (Location) obj;
                la0Var2.E0(location3);
                la0Var2.getLocationController().n(location3, la0Var2.f47255l0);
                la0Var2.f47255l0 = false;
                return;
        }
    }
}
