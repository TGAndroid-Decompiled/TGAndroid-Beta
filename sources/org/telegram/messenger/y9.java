package org.telegram.messenger;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
public final class y9 {
    public final l8.f f26557a;

    public y9(l8.f fVar) {
        this.f26557a = fVar;
    }

    public final va a() {
        LatLng createFromParcel;
        l8.f fVar = this.f26557a;
        fVar.getClass();
        try {
            u7.i iVar = (u7.i) fVar.f18110a;
            Parcel O0 = iVar.O0(iVar.P0(), 4);
            Parcelable.Creator<LatLng> creator = LatLng.CREATOR;
            int i3 = u7.b.f55736a;
            if (O0.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = creator.createFromParcel(O0);
            }
            LatLng latLng = createFromParcel;
            O0.recycle();
            return new va(latLng.f7751a, latLng.f7752b);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void b(va vaVar) {
        LatLng latLng = new LatLng(vaVar.f25843a, vaVar.f25844b);
        l8.f fVar = this.f26557a;
        fVar.getClass();
        try {
            u7.i iVar = (u7.i) fVar.f18110a;
            Parcel P0 = iVar.P0();
            u7.b.b(P0, latLng);
            iVar.T0(P0, 3);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void c(int i3) {
        float f10 = i3;
        l8.f fVar = this.f26557a;
        fVar.getClass();
        try {
            u7.i iVar = (u7.i) fVar.f18110a;
            Parcel P0 = iVar.P0();
            P0.writeFloat(f10);
            iVar.T0(P0, 22);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }
}
