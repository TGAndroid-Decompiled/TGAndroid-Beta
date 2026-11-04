package org.telegram.messenger;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import java.util.HashMap;
public final class z9 {
    public p4.q f26754a;
    public HashMap f26755b;
    public HashMap f26756c;

    public final y9 a(gi.v5 v5Var) {
        u7.a aVar;
        p4.q qVar = this.f26754a;
        l8.g gVar = (l8.g) v5Var.f13688b;
        qVar.getClass();
        try {
            p6.m.h(gVar, "MarkerOptions must not be null.");
            k8.e eVar = (k8.e) qVar.f53181a;
            Parcel P0 = eVar.P0();
            u7.b.b(P0, gVar);
            Parcel O0 = eVar.O0(P0, 11);
            IBinder readStrongBinder = O0.readStrongBinder();
            int i3 = u7.j.f55739b;
            l8.f fVar = null;
            if (readStrongBinder == null) {
                aVar = 0;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                if (queryLocalInterface instanceof u7.a) {
                    aVar = (u7.a) queryLocalInterface;
                } else {
                    aVar = new b8.a(readStrongBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate", 10);
                }
            }
            O0.recycle();
            if (aVar != 0) {
                fVar = new l8.f(aVar);
            }
            y9 y9Var = new y9(fVar);
            this.f26755b.put(fVar, y9Var);
            return y9Var;
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void b(na naVar) {
        p4.q qVar = this.f26754a;
        gi.w5 w5Var = ((w9) naVar).f26180a;
        qVar.getClass();
        try {
            k8.e eVar = (k8.e) qVar.f53181a;
            Parcel P0 = eVar.P0();
            u7.b.c(P0, (z6.a) w5Var.f13798b);
            eVar.T0(P0, 5);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void c(na naVar) {
        p4.q qVar = this.f26754a;
        gi.w5 w5Var = ((w9) naVar).f26180a;
        qVar.getClass();
        try {
            k8.e eVar = (k8.e) qVar.f53181a;
            Parcel P0 = eVar.P0();
            u7.b.c(P0, (z6.a) w5Var.f13798b);
            P0.writeInt(500);
            u7.b.c(P0, null);
            eVar.T0(P0, 7);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final gi.w4 d() {
        CameraPosition createFromParcel;
        p4.q qVar = this.f26754a;
        qVar.getClass();
        try {
            k8.e eVar = (k8.e) qVar.f53181a;
            Parcel O0 = eVar.O0(eVar.P0(), 1);
            Parcelable.Creator<CameraPosition> creator = CameraPosition.CREATOR;
            int i3 = u7.b.f55736a;
            if (O0.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = creator.createFromParcel(O0);
            }
            CameraPosition cameraPosition = createFromParcel;
            O0.recycle();
            LatLng latLng = cameraPosition.f7748a;
            return new gi.w4(new va(latLng.f7751a, latLng.f7752b), cameraPosition.f7749b, 2);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final float e() {
        p4.q qVar = this.f26754a;
        qVar.getClass();
        try {
            k8.e eVar = (k8.e) qVar.f53181a;
            Parcel O0 = eVar.O0(eVar.P0(), 2);
            float readFloat = O0.readFloat();
            O0.recycle();
            return readFloat;
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final float f() {
        p4.q qVar = this.f26754a;
        qVar.getClass();
        try {
            k8.e eVar = (k8.e) qVar.f53181a;
            Parcel O0 = eVar.O0(eVar.P0(), 3);
            float readFloat = O0.readFloat();
            O0.recycle();
            return readFloat;
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final hi.d g() {
        b8.a aVar;
        p4.q qVar = this.f26754a;
        qVar.getClass();
        try {
            if (((gi.v5) qVar.f53182b) == null) {
                k8.e eVar = (k8.e) qVar.f53181a;
                Parcel O0 = eVar.O0(eVar.P0(), 25);
                IBinder readStrongBinder = O0.readStrongBinder();
                if (readStrongBinder == null) {
                    aVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    if (queryLocalInterface instanceof k8.b) {
                        aVar = (k8.b) queryLocalInterface;
                    } else {
                        aVar = new b8.a(readStrongBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate", 10);
                    }
                }
                O0.recycle();
                qVar.f53182b = new gi.v5(aVar, 5);
            }
            gi.v5 v5Var = (gi.v5) qVar.f53182b;
            hi.d dVar = new hi.d(24, false);
            dVar.f14429b = v5Var;
            return dVar;
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void h(na naVar) {
        p4.q qVar = this.f26754a;
        gi.w5 w5Var = ((w9) naVar).f26180a;
        qVar.getClass();
        try {
            k8.e eVar = (k8.e) qVar.f53181a;
            Parcel P0 = eVar.P0();
            u7.b.c(P0, (z6.a) w5Var.f13798b);
            eVar.T0(P0, 4);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void i(ra raVar) {
        l8.e eVar;
        p4.q qVar = this.f26754a;
        if (raVar == null) {
            eVar = null;
        } else {
            eVar = ((aa) raVar).f21483a;
        }
        qVar.getClass();
        try {
            k8.e eVar2 = (k8.e) qVar.f53181a;
            Parcel P0 = eVar2.P0();
            u7.b.b(P0, eVar);
            Parcel O0 = eVar2.O0(P0, 91);
            O0.readInt();
            O0.recycle();
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void j(int i3) {
        p4.q qVar = this.f26754a;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    return;
                }
                qVar.E(4);
                return;
            }
            qVar.E(2);
            return;
        }
        qVar.E(1);
    }

    public final void k(boolean z10) {
        p4.q qVar = this.f26754a;
        qVar.getClass();
        try {
            k8.e eVar = (k8.e) qVar.f53181a;
            Parcel P0 = eVar.P0();
            int i3 = u7.b.f55736a;
            P0.writeInt(z10 ? 1 : 0);
            eVar.T0(P0, 22);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void l(wa waVar) {
        p4.q qVar = this.f26754a;
        p1 p1Var = new p1(waVar, 7);
        k8.e eVar = (k8.e) qVar.f53181a;
        try {
            j8.b bVar = new j8.b(p1Var, (byte) 0);
            Parcel P0 = eVar.P0();
            u7.b.c(P0, bVar);
            eVar.T0(P0, 96);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void m(xa xaVar) {
        p4.q qVar = this.f26754a;
        o oVar = new o(3, this, xaVar);
        k8.e eVar = (k8.e) qVar.f53181a;
        try {
            j8.b bVar = new j8.b(oVar);
            Parcel P0 = eVar.P0();
            u7.b.c(P0, bVar);
            eVar.T0(P0, 30);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void n(q0.a aVar) {
        p4.q qVar = this.f26754a;
        s9 s9Var = new s9(aVar, 2);
        k8.e eVar = (k8.e) qVar.f53181a;
        try {
            j8.b bVar = new j8.b(s9Var);
            Parcel P0 = eVar.P0();
            u7.b.c(P0, bVar);
            eVar.T0(P0, 36);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void o(int i3, int i10, int i11, int i12) {
        p4.q qVar = this.f26754a;
        qVar.getClass();
        try {
            k8.e eVar = (k8.e) qVar.f53181a;
            Parcel P0 = eVar.P0();
            P0.writeInt(i3);
            P0.writeInt(i10);
            P0.writeInt(i11);
            P0.writeInt(i12);
            eVar.T0(P0, 39);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }
}
