package org.telegram.ui.Components;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;
public final class nd0 implements og.n, f61, org.telegram.ui.nm0, o2.i, zm0, com.google.android.gms.common.api.internal.q, tg.g, tg.q1, v4.k1, y51, z2.d {
    public final int f37765a;
    public final Object f37766b;

    public nd0(Object obj, int i7) {
        this.f37765a = i7;
        this.f37766b = obj;
    }

    public static void u(String str, TreeMap treeMap) {
        String[] split = str.split(":", 2);
        if (split.length < 2) {
            return;
        }
        String trim = split[0].trim();
        String trim2 = split[1].trim();
        List list = (List) treeMap.get(trim);
        if (list == null) {
            list = new ArrayList();
            treeMap.put(trim, list);
        }
        list.add(trim2);
    }

    public int A() {
        return ((v() & Byte.MAX_VALUE) << 21) | ((v() & Byte.MAX_VALUE) << 14) | ((v() & Byte.MAX_VALUE) << 7) | (v() & Byte.MAX_VALUE);
    }

    public void B(long j3) {
        long j10 = 0;
        while (j10 < j3) {
            long skip = ((ab.d) this.f37766b).skip(j3 - j10);
            if (skip > 0) {
                j10 += skip;
            } else {
                throw new EOFException();
            }
        }
    }

    public void C(com.google.android.gms.internal.clearcut.y0 y0Var, TreeMap treeMap) {
        String str;
        List list = (List) treeMap.get("Sec-WebSocket-Protocol");
        if (list != null && (str = (String) list.get(0)) != null && str.length() != 0) {
            synchronized (((rc.u) this.f37766b).f56667c) {
            }
            throw new rc.n(19, "The protocol contained in the Sec-WebSocket-Protocol header is not supported: ".concat(str), y0Var);
        }
    }

    @Override
    public void G() {
        pd0 pd0Var = ((qd0) this.f37766b).f38810a;
        if (pd0Var != null) {
            ((org.telegram.ui.fo0) pd0Var).f47939a.f43334f0.invalidate();
        }
    }

    @Override
    public void R(boolean z10) {
        ((qd0) this.f37766b).f38812c.setAspectLock(z10);
    }

    @Override
    public long a(long j3) {
        return 0L;
    }

    @Override
    public int a0() {
        return 0;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        int i7 = this.f37765a;
        Object obj3 = this.f37766b;
        switch (i7) {
            case 13:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                s6.b bVar = (s6.b) ((s6.a) obj).n();
                Parcel j12 = bVar.j1();
                n7.a.b(j12, (q6.r) obj3);
                try {
                    bVar.f306b.transact(1, j12, null, 1);
                    j12.recycle();
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Throwable th2) {
                    j12.recycle();
                    throw th2;
                }
            case 20:
                u7.x xVar = (u7.x) ((u7.k) obj).n();
                u7.f fVar = new u7.f(1, (TaskCompletionSource) obj2);
                Parcel p12 = xVar.p1();
                int i10 = u7.d.f58564a;
                p12.writeInt(1);
                ((j8.c) obj3).writeToParcel(p12, 0);
                u7.d.c(p12, fVar);
                p12.writeString(null);
                xVar.t1(p12, 63);
                return;
            default:
                y8.j jVar = (y8.j) obj3;
                h8.b bVar2 = (h8.b) obj;
                Bundle B = bVar2.B();
                B.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
                h8.a aVar = new h8.a(0, (TaskCompletionSource) obj2);
                try {
                    h8.i iVar = (h8.i) bVar2.n();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i11 = h8.c.f13947a;
                    obtain.writeInt(1);
                    jVar.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    B.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(aVar);
                    iVar.f13955a.transact(19, obtain, null, 1);
                    obtain.recycle();
                    return;
                } catch (RemoteException e10) {
                    Log.e("WalletClientImpl", "RemoteException getting payment data", e10);
                    Bundle bundle = Bundle.EMPTY;
                    aVar.d0(Status.h, null);
                    return;
                }
        }
    }

    @Override
    public void b(ArrayList arrayList) {
        a8.r7 r7Var = (a8.r7) this.f37766b;
        try {
            if (!arrayList.isEmpty()) {
                org.telegram.messenger.yy yyVar = (org.telegram.messenger.yy) arrayList.get(0);
                if (yyVar.f28311c != null) {
                    File z10 = org.telegram.messenger.w7.z(4);
                    r7Var.f619f = new File(z10, Utilities.f22875b.nextInt() + ".jpg");
                    Point c12 = org.telegram.messenger.g0.c1();
                    Bitmap K = org.telegram.messenger.ec.K(yyVar.f28311c, null, (float) c12.x, (float) c12.y, true);
                    K.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream((File) r7Var.f619f));
                    ((p71) r7Var.f618e).b((File) r7Var.f619f, K, true);
                }
            }
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
    }

    @Override
    public int d(View view) {
        return v4.p0.z(view) - ((ViewGroup.MarginLayoutParams) ((v4.q0) view.getLayoutParams())).topMargin;
    }

    @Override
    public long e(long j3, long j10) {
        return 0L;
    }

    @Override
    public long f(long j3, long j10) {
        return -9223372036854775807L;
    }

    @Override
    public p2.j g(long j3) {
        return (p2.j) this.f37766b;
    }

    @Override
    public float get() {
        return ((tg.i2) this.f37766b).G;
    }

    @Override
    public CharSequence getContentDescription() {
        pg.h hVar = (pg.h) this.f37766b;
        float f10 = hVar.f55734b;
        return String.valueOf(Math.round((hVar.f55733a.getProgress() * (hVar.f55735c - f10)) + f10));
    }

    @Override
    public void h() {
        ((org.telegram.ui.vp0) this.f37766b).u0(null, true);
    }

    @Override
    public void h2(float f10) {
        ((tg.i2) this.f37766b).setOutlineWidth(f10);
    }

    @Override
    public int i() {
        return ((v4.p0) this.f37766b).G();
    }

    @Override
    public void invalidate() {
        ((wi.h) this.f37766b).f60084m.invalidate();
    }

    @Override
    public void j(boolean z10, float f10) {
        pg.h hVar = (pg.h) this.f37766b;
        float f11 = hVar.f55734b;
        float z11 = com.google.android.gms.internal.vision.e2.z(hVar.f55735c, f11, f10, f11);
        hVar.d = z11;
        if (z10) {
            p6 p6Var = hVar.f55736e;
            p6Var.getClass();
            p6Var.c(null, z11);
        }
        hVar.invalidate();
    }

    @Override
    public int k() {
        v4.p0 p0Var = (v4.p0) this.f37766b;
        return p0Var.f59342n - p0Var.C();
    }

    @Override
    public View l(int i7) {
        return ((v4.p0) this.f37766b).q(i7);
    }

    @Override
    public int m(View view) {
        return v4.p0.v(view) + ((ViewGroup.MarginLayoutParams) ((v4.q0) view.getLayoutParams())).bottomMargin;
    }

    @Override
    public long n(long j3, long j10) {
        return 0L;
    }

    @Override
    public tg.n o() {
        return ((org.telegram.ui.vp0) this.f37766b).C0;
    }

    @Override
    public void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i7) {
        zi0 zi0Var = (zi0) this.f37766b;
        if (z10 && zi0Var.f42890n.S() >= 0) {
            zi0Var.f42904x = true;
        }
        ve0 ve0Var = zi0Var.f42880f;
        eb0 eb0Var = zi0Var.f42906y;
        ve0Var.a(z10, true);
        org.telegram.messenger.g0.r(eb0Var);
        if (z10) {
            org.telegram.messenger.g0.h3(eb0Var, 16L);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    public void p() {
        sg.r0 r0Var = ((sg.t0) this.f37766b).d;
        if (r0Var != null) {
            sg.q0 q0Var = r0Var.f57460s;
            if (q0Var != null) {
                r0Var.cancelRunnable(q0Var);
                r0Var.f57460s = null;
            }
            sg.q0 q0Var2 = new sg.q0(r0Var, 1);
            r0Var.f57460s = q0Var2;
            r0Var.postRunnable(q0Var2, 1L);
        }
    }

    public void q(s4.p pVar, s4.m mVar, Collection collection) {
        s4.e eVar = (s4.e) this.f37766b;
        if (pVar == eVar.f57074y && mVar != null) {
            s4.u uVar = eVar.f57073x.f57166a;
            String d = mVar.d();
            s4.v vVar = new s4.v(uVar, d, eVar.b(uVar, d), false);
            vVar.i(mVar);
            if (eVar.d != vVar) {
                eVar.h(eVar, vVar, eVar.f57074y, 3, eVar.f57073x, collection);
                eVar.f57073x = null;
                eVar.f57074y = null;
            }
        } else if (pVar == eVar.f57056e) {
            if (mVar != null) {
                eVar.n(eVar.d, mVar);
            }
            eVar.d.n(collection);
        }
    }

    @Override
    public void q0(boolean z10) {
        qd0 qd0Var = (qd0) this.f37766b;
        qd0Var.getClass();
        pd0 pd0Var = qd0Var.f38810a;
        if (pd0Var != null) {
            ((org.telegram.ui.fo0) pd0Var).k(z10);
        }
    }

    @Override
    public boolean r() {
        return true;
    }

    @Override
    public long s() {
        return 0L;
    }

    @Override
    public void t() {
        try {
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setType("image/*");
            ((Activity) ((a8.r7) this.f37766b).f617c).startActivityForResult(intent, 11);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public String toString() {
        switch (this.f37765a) {
            case 12:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.f37766b).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    public byte v() {
        int read = ((ab.d) this.f37766b).read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override
    public void v0() {
        pd0 pd0Var = ((qd0) this.f37766b).f38810a;
        if (pd0Var != null) {
            PhotoViewer photoViewer = ((org.telegram.ui.fo0) pd0Var).f47939a;
            if (photoViewer.d2 == 1) {
                photoViewer.H2 = true;
                photoViewer.p3();
            }
        }
    }

    @Override
    public long x(long j3) {
        return 1L;
    }

    public int y() {
        return ((v() & 255) << 24) | ((v() & 255) << 16) | ((v() & 255) << 8) | (v() & 255);
    }

    @Override
    public long z(long j3, long j10) {
        return 1L;
    }

    public nd0(int i7) {
        this.f37765a = i7;
        switch (i7) {
            case 28:
                this.f37766b = new nb.a(6);
                return;
            default:
                this.f37766b = new org.telegram.utils.twidget.w(1.0f, 5, 1, false);
                return;
        }
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public nd0(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.f37765a = 8;
        this.f37766b = new GestureDetector(context, onGestureListener, null);
    }

    public nd0(TextView textView) {
        this.f37765a = 15;
        this.f37766b = new t1.h(textView);
    }

    @Override
    public void onSeekFinished(m2.a aVar) {
    }

    @Override
    public void onSeekStarted(m2.a aVar) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public void w() {
    }

    @Override
    public long c(long j3, long j10) {
        return j10;
    }

    @Override
    public void onError(h61 h61Var, Exception exc) {
    }

    @Override
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
    }
}
