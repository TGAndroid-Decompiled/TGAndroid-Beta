package org.telegram.ui.ActionBar;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import ci.pc;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bd0;
import org.telegram.ui.Components.dz0;
import org.telegram.ui.Components.jp0;
import org.telegram.ui.Components.k81;
import org.telegram.ui.Components.lg0;
import org.telegram.ui.Components.pu;
import org.telegram.ui.Components.qa;
import org.telegram.ui.Components.ru;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bn0;
import org.telegram.ui.e31;
import org.telegram.ui.h7;
import org.telegram.ui.hv;
import org.telegram.ui.iv;
import org.telegram.ui.nn0;
import org.telegram.ui.r6;
import org.telegram.ui.tk0;
import org.telegram.ui.vm0;
public class b5 implements e6, jp0, pu, pc, h7, bn0, fh.a, me.d, com.google.android.gms.common.api.internal.s, n5.b, SuccessContinuation {
    public final int f20460a;
    public Object f20461b;
    public Object f20462c;

    public b5(int i10, byte b10) {
        this.f20460a = i10;
    }

    @Override
    public void A(float r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.b5.A(float, int):void");
    }

    @Override
    public void B(float f7, boolean z10) {
        bd0 bd0Var = (bd0) this.f20461b;
        lg0 lg0Var = (lg0) this.f20462c;
        k81 k81Var = lg0Var.d;
        if (k81Var != null) {
            long p5 = k81Var.p();
            float max = 2.8f / ((float) Math.max(60L, p5));
            long j3 = (((f7 / (1.0f - max)) * max) + f7) * ((float) p5);
            lg0Var.f28455e = j3;
            lg0Var.d.L(j3, !z10);
            if (!z10) {
                AndroidUtilities.cancelRunOnUIThread(bd0Var);
                AndroidUtilities.runOnUIThread(bd0Var, 120L);
            }
        }
    }

    @Override
    public Paint F(String str) {
        switch (this.f20460a) {
            case 0:
                return i6.T0(str);
            case 7:
                return i6.T0(str);
            default:
                e6 e6Var = (e6) this.f20462c;
                if (e6Var == null) {
                    return i6.T0(str);
                }
                return e6Var.F(str);
        }
    }

    @Override
    public void I0(int i10, int i11) {
        switch (this.f20460a) {
            case 0:
            case 7:
                return;
            default:
                e6 e6Var = (e6) this.f20462c;
                if (e6Var != null) {
                    e6Var.I0(i10, i11);
                    return;
                }
                return;
        }
    }

    @Override
    public void X(float f7, boolean z10) {
        ((TextView) this.f20461b).setText("Alpha " + org.telegram.ui.i5.f38526e);
        org.telegram.ui.i5.f38526e = f7;
        ((org.telegram.ui.i5) this.f20462c).f38527b.M();
    }

    @Override
    public boolean a() {
        switch (this.f20460a) {
            case 0:
            case 7:
            default:
                return i6.I.q();
        }
    }

    @Override
    public int a1(int i10) {
        switch (this.f20460a) {
            case 0:
                return ((SparseIntArray) this.f20461b).get(i10);
            case 7:
                return x0(i10);
            default:
                e6 e6Var = (e6) this.f20462c;
                if (e6Var == null) {
                    return i6.x0(null, i10, false);
                }
                return e6Var.a1(i10);
        }
    }

    @Override
    public void accept(java.lang.Object r53, java.lang.Object r54) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.b5.accept(java.lang.Object, java.lang.Object):void");
    }

    @Override
    public void c(String str, String str2) {
        nn0 nn0Var = ((vm0) this.f20462c).f42903a;
        if ("PHONE_VERIFICATION_NEEDED".equals(str)) {
            nn0Var.N1(true, str2, (tk0) this.f20461b, this, nn0Var.B1);
        } else {
            nn0Var.M1(true, false);
        }
    }

    @Override
    public int c0(int i10) {
        switch (this.f20460a) {
            case 0:
                return x0(i10);
            case 7:
                return x0(i10);
            default:
                e6 e6Var = (e6) this.f20462c;
                if (e6Var == null) {
                    return i6.x0(null, i10, false);
                }
                return e6Var.c0(i10);
        }
    }

    @Override
    public void dismiss() {
        ((iv) this.f20462c).dismiss();
    }

    @Override
    public Object mo27get() {
        ob.a aVar = new ob.a(24);
        na.d dVar = new na.d(24);
        Object mo27get = ((gd.a) this.f20461b).mo27get();
        gd.a aVar2 = (gd.a) this.f20462c;
        return new s5.g(aVar, dVar, s5.a.f47831f, (s5.i) mo27get, aVar2);
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public Drawable getDrawable(String str) {
        switch (this.f20460a) {
            case 0:
                return null;
            case 7:
                return null;
            default:
                e6 e6Var = (e6) this.f20462c;
                if (e6Var == null) {
                    return i6.P0(str);
                }
                return e6Var.getDrawable(str);
        }
    }

    @Override
    public void i() {
        ((ru) this.f20461b).getText();
        ((org.telegram.ui.Cells.g3) this.f20462c).b();
    }

    @Override
    public int i0() {
        return 0;
    }

    public ArrayList j() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        Context context = (Context) this.f20461b;
        Class cls = (Class) ((m.f3) this.f20462c).f15668b;
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, cls), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", cls + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
        }
        for (String str2 : arrayList) {
            arrayList2.add(new q9.c(str2, 0));
        }
        return arrayList2;
    }

    public View k(int i10, int i11, int i12, int i13) {
        int i14;
        s4.i1 i1Var = (s4.i1) this.f20462c;
        s4.j1 j1Var = (s4.j1) this.f20461b;
        int c10 = j1Var.c();
        int c02 = j1Var.c0();
        if (i11 > i10) {
            i14 = 1;
        } else {
            i14 = -1;
        }
        View view = null;
        while (i10 != i11) {
            View u02 = j1Var.u0(i10);
            int b10 = j1Var.b(u02);
            int w02 = j1Var.w0(u02);
            i1Var.f47713b = c10;
            i1Var.f47714c = c02;
            i1Var.d = b10;
            i1Var.f47715e = w02;
            if (i12 != 0) {
                i1Var.f47712a = i12;
                if (i1Var.a()) {
                    return u02;
                }
            }
            if (i13 != 0) {
                i1Var.f47712a = i13;
                if (i1Var.a()) {
                    view = u02;
                }
            }
            i10 += i14;
        }
        return view;
    }

    @Override
    public boolean k0() {
        switch (this.f20460a) {
            case 0:
                return false;
            case 7:
                return false;
            default:
                e6 e6Var = (e6) this.f20462c;
                if (e6Var == null) {
                    return i6.b1();
                }
                return e6Var.k0();
        }
    }

    @Override
    public ch.d l() {
        if (Build.VERSION.SDK_INT >= 29) {
            ch.e eVar = new ch.e(this);
            ((PhotoViewer) this.f20462c).Z.add(eVar);
            return eVar;
        }
        return new ch.f(this);
    }

    @Override
    public void m(float f7, float f10, int i10, int i11) {
        switch (this.f20460a) {
            case 0:
                i6.q(f7, f10, i10, i11);
                return;
            case 7:
                i6.q(f7, f10, i10, i11);
                return;
            default:
                e6 e6Var = (e6) this.f20462c;
                if (e6Var == null) {
                    i6.q(f7, f10, i10, i11);
                    return;
                } else {
                    e6Var.m(f7, f10, i10, i11);
                    return;
                }
        }
    }

    @Override
    public void n(int i10, float f7, float f10, me.e eVar) {
        ph.i iVar = (ph.i) this.f20462c;
        iVar.f45872c.a(f7);
        iVar.d.a(f7);
        iVar.f45871b.a(f7);
        ((Runnable) this.f20461b).run();
    }

    public boolean r(View view) {
        s4.i1 i1Var = (s4.i1) this.f20462c;
        s4.j1 j1Var = (s4.j1) this.f20461b;
        int c10 = j1Var.c();
        int c02 = j1Var.c0();
        int b10 = j1Var.b(view);
        int w02 = j1Var.w0(view);
        i1Var.f47713b = c10;
        i1Var.f47714c = c02;
        i1Var.d = b10;
        i1Var.f47715e = w02;
        i1Var.f47712a = 24579;
        return i1Var.a();
    }

    @Override
    public Task then(Object obj) {
        switch (this.f20460a) {
            case 20:
                da.b bVar = (da.b) obj;
                w9.m mVar = ((w9.k) this.f20462c).f50239e;
                if (bVar == null) {
                    Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
                    return Tasks.forResult(null);
                }
                return Tasks.whenAll(w9.m.b(mVar), mVar.f50253m.y((Executor) this.f20461b, null));
            default:
                return ((w9.m) this.f20462c).f50246e.l(new u4.f(1, this, (Boolean) obj));
        }
    }

    public String toString() {
        switch (this.f20460a) {
            case 12:
                return "Bounds{lower=" + ((i0.b) this.f20461b) + " upper=" + ((i0.b) this.f20462c) + "}";
            default:
                return super.toString();
        }
    }

    @Override
    public void v(Canvas canvas, float f7, float f10, float f11, float f12) {
        canvas.save();
        canvas.clipRect(f7, f10, f11, f12);
        ((PhotoViewer) this.f20462c).T0(canvas, (qa) this.f20461b, -14277082, 855638016, false, true, true);
        canvas.drawColor(637534208);
        canvas.restore();
    }

    public c3.h0 w(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = (int[]) this.f20462c;
            if (i11 < iArr.length) {
                if (i10 == iArr[i11]) {
                    return ((u2.a1[]) this.f20461b)[i11];
                }
                i11++;
            } else {
                e2.a.e("BaseMediaChunkOutput", "Unmatched track of type: " + i10);
                return new c3.n();
            }
        }
    }

    @Override
    public ColorFilter x() {
        switch (this.f20460a) {
            case 0:
                return i6.f21125v3;
            case 7:
                return i6.f21125v3;
            default:
                e6 e6Var = (e6) this.f20462c;
                if (e6Var == null) {
                    return i6.f21125v3;
                }
                return e6Var.x();
        }
    }

    @Override
    public int x0(int i10) {
        switch (this.f20460a) {
            case 0:
                SparseIntArray sparseIntArray = (SparseIntArray) this.f20461b;
                int indexOfKey = sparseIntArray.indexOfKey(i10);
                if (indexOfKey >= 0) {
                    return sparseIntArray.valueAt(indexOfKey);
                }
                return i6.x0(null, i10, false);
            case 7:
                SparseIntArray sparseIntArray2 = (SparseIntArray) this.f20461b;
                if (sparseIntArray2 != null) {
                    return sparseIntArray2.get(i10);
                }
                return i6.x0(null, i10, false);
            default:
                SparseIntArray sparseIntArray3 = (SparseIntArray) this.f20461b;
                int indexOfKey2 = sparseIntArray3.indexOfKey(i10);
                if (indexOfKey2 >= 0) {
                    return sparseIntArray3.valueAt(indexOfKey2);
                }
                e6 e6Var = (e6) this.f20462c;
                if (e6Var == null) {
                    return i6.x0(null, i10, false);
                }
                return e6Var.x0(i10);
        }
    }

    @Override
    public void y0(r6 r6Var, zh.a aVar, boolean z10) {
        iv ivVar = (iv) this.f20462c;
        hv hvVar = ivVar.X;
        if (aVar != null) {
            ((zh.b) this.f20461b).i(aVar);
            ivVar.f38763e0.d();
            zh.b bVar = ivVar.f38765g0;
            dz0[] dz0VarArr = ivVar.f38760b0;
            org.telegram.ui.Cells.a2[] a2VarArr = ivVar.f38761c0;
            org.telegram.ui.Cells.a2 a2Var = a2VarArr[0];
            if (a2Var != null) {
                dz0 dz0Var = dz0VarArr[0];
                boolean z11 = bVar.f54708m;
                dz0Var.f25858c = z11;
                a2Var.c(z11, true);
            }
            org.telegram.ui.Cells.a2 a2Var2 = a2VarArr[1];
            if (a2Var2 != null) {
                dz0 dz0Var2 = dz0VarArr[1];
                boolean z12 = bVar.f54709n;
                dz0Var2.f25858c = z12;
                a2Var2.c(z12, true);
            }
            org.telegram.ui.Cells.a2 a2Var3 = a2VarArr[2];
            if (a2Var3 != null) {
                dz0 dz0Var3 = dz0VarArr[2];
                boolean z13 = bVar.f54710o;
                dz0Var3.f25858c = z13;
                a2Var3.c(z13, true);
            }
            org.telegram.ui.Cells.a2 a2Var4 = a2VarArr[3];
            if (a2Var4 != null) {
                dz0 dz0Var4 = dz0VarArr[3];
                boolean z14 = bVar.f54711p;
                dz0Var4.f25858c = z14;
                a2Var4.c(z14, true);
            }
            org.telegram.ui.Cells.a2 a2Var5 = a2VarArr[4];
            if (a2Var5 != null) {
                dz0 dz0Var5 = dz0VarArr[4];
                boolean z15 = bVar.f54712q;
                dz0Var5.f25858c = z15;
                a2Var5.c(z15, true);
            }
            ivVar.f38759a0.a(hvVar.d(), true);
            hvVar.c(true);
        }
    }

    public b5(int i10, Object obj, Object obj2) {
        this.f20460a = i10;
        this.f20462c = obj;
        this.f20461b = obj2;
    }

    public b5(Object obj, Object obj2, boolean z10, int i10) {
        this.f20460a = i10;
        this.f20461b = obj;
        this.f20462c = obj2;
    }

    public b5(e6 e6Var) {
        this.f20460a = 8;
        this.f20461b = new SparseIntArray();
        this.f20462c = e6Var;
        f();
    }

    public b5() {
        this.f20460a = 22;
        this.f20461b = new AtomicInteger();
        this.f20462c = new AtomicInteger();
    }

    public b5(pg.i0 i0Var) {
        this.f20460a = 9;
        this.f20461b = i0Var;
    }

    public b5(lg0 lg0Var) {
        this.f20460a = 3;
        this.f20462c = lg0Var;
        this.f20461b = new bd0(this, 9);
    }

    public b5(s4.j1 j1Var) {
        this.f20460a = 14;
        this.f20461b = j1Var;
        ?? obj = new Object();
        obj.f47712a = 0;
        this.f20462c = obj;
    }

    public b5(int i10) {
        this.f20460a = 18;
        Bitmap createBitmap = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
        this.f20461b = createBitmap;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        this.f20462c = new BitmapShader(createBitmap, tileMode, tileMode);
    }

    public b5(w9.k kVar, Executor executor, String str) {
        this.f20460a = 20;
        this.f20462c = kVar;
        this.f20461b = executor;
    }

    public b5(e31 e31Var) {
        this.f20460a = 7;
        this.f20462c = e31Var;
    }

    public b5(PhotoViewer photoViewer) {
        this.f20460a = 6;
        this.f20462c = photoViewer;
        this.f20461b = new qa(photoViewer.f33875b0, photoViewer.f33904e0, 0, false);
    }

    @Override
    public void C(long j3) {
    }

    @Override
    public void G(boolean z10) {
    }

    @Override
    public void K(float f7) {
    }

    @Override
    public void M(float f7) {
    }

    @Override
    public void Q(float f7) {
    }

    @Override
    public void R() {
    }

    @Override
    public void T(float f7) {
    }

    @Override
    public void V(long j3) {
    }

    @Override
    public void b(int i10) {
    }

    @Override
    public void clear() {
    }

    @Override
    public void d() {
    }

    @Override
    public void e(float f7) {
    }

    public void f() {
    }

    @Override
    public void g(float f7) {
    }

    @Override
    public void g1() {
    }

    @Override
    public void o() {
    }

    @Override
    public void p(float f7) {
    }

    @Override
    public void q(boolean z10) {
    }

    @Override
    public void y(float f7) {
    }

    @Override
    public void z() {
    }

    private final void s(int i10, int i11) {
    }

    private final void t(int i10, int i11) {
    }

    @Override
    public void I(float f7, int i10) {
    }

    @Override
    public void O(float f7, int i10) {
    }

    @Override
    public void U(int i10, long j3) {
    }

    @Override
    public void h(long j3, boolean z10) {
    }

    @Override
    public void u(float f7, int i10) {
    }
}
