package org.telegram.ui;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.zip.Adler32;
import java.util.zip.InflaterInputStream;
public class ld0 implements hy0, t0.h, q5.b, oa.a {
    public final int f48975a;
    public Object f48976b;
    public Object f48977c;
    public Object d;

    public ld0(int i7, boolean z10) {
        this.f48975a = i7;
    }

    public static void G(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (!file.renameTo(file2)) {
            Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
        }
    }

    public static q2.f o(e2.d0 d0Var) {
        String uri;
        boolean z10;
        boolean z11;
        j2.o oVar = new j2.o();
        byte[] bArr = null;
        oVar.f16820c = null;
        Uri uri2 = d0Var.f10045b;
        if (uri2 == null) {
            uri = null;
        } else {
            uri = uri2.toString();
        }
        boolean z12 = d0Var.f10048f;
        ?? obj = new Object();
        if (z12 && TextUtils.isEmpty(uri)) {
            z10 = false;
        } else {
            z10 = true;
        }
        a8.ja.f(z10);
        obj.f989b = oVar;
        obj.f990c = uri;
        obj.f988a = z12;
        obj.d = new HashMap();
        h9.l0 l0Var = d0Var.f10046c;
        h9.t0 t0Var = l0Var.f13699a;
        if (t0Var == null) {
            t0Var = l0Var.c();
            l0Var.f13699a = t0Var;
        }
        h9.g2 it = t0Var.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            str2.getClass();
            synchronized (((HashMap) obj.d)) {
                ((HashMap) obj.d).put(str, str2);
            }
        }
        HashMap hashMap = new HashMap();
        int i7 = e2.l.f10174a;
        qb.a aVar = new qb.a(4);
        UUID uuid = d0Var.f10044a;
        uuid.getClass();
        boolean z13 = d0Var.d;
        boolean z14 = d0Var.f10047e;
        int[] f10 = c8.g1.f(d0Var.f10049g);
        for (int i10 : f10) {
            if (i10 != 2 && i10 != 1) {
                z11 = false;
            } else {
                z11 = true;
            }
            a8.ja.f(z11);
        }
        q2.f fVar = new q2.f(uuid, obj, hashMap, z13, (int[]) f10.clone(), z14, aVar);
        byte[] bArr2 = d0Var.h;
        if (bArr2 != null) {
            bArr = Arrays.copyOf(bArr2, bArr2.length);
        }
        a8.ja.p(fVar.f55177x.isEmpty());
        fVar.L = bArr;
        return fVar;
    }

    public boolean A() {
        String trim;
        ArrayDeque arrayDeque = (ArrayDeque) this.f48977c;
        if (((String) this.d) != null) {
            return true;
        }
        if (!arrayDeque.isEmpty()) {
            String str = (String) arrayDeque.poll();
            str.getClass();
            this.d = str;
            return true;
        }
        do {
            String readLine = ((BufferedReader) this.f48976b).readLine();
            this.d = readLine;
            if (readLine != null) {
                trim = readLine.trim();
                this.d = trim;
            } else {
                return false;
            }
        } while (trim.isEmpty());
        return true;
    }

    public void B(View view) {
        ((ArrayList) this.d).add(view);
        org.telegram.ui.Components.ff ffVar = (org.telegram.ui.Components.ff) this.f48976b;
        v4.e1 U = RecyclerView.U(view);
        if (U != null) {
            View view2 = U.f58535a;
            RecyclerView recyclerView = (RecyclerView) ffVar.f34586b;
            int i7 = U.f58551s;
            if (i7 != -1) {
                U.f58550r = i7;
            } else {
                WeakHashMap weakHashMap = r0.i0.f55671a;
                U.f58550r = view2.getImportantForAccessibility();
            }
            if (recyclerView.c0()) {
                U.f58551s = 4;
                recyclerView.L0.add(U);
                return;
            }
            WeakHashMap weakHashMap2 = r0.i0.f55671a;
            view2.setImportantForAccessibility(4);
        }
    }

    public void C(j2.h r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, x2.v0 r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ld0.C(j2.h, android.net.Uri, java.util.Map, long, long, x2.v0):void");
    }

    public String D() {
        if (A()) {
            String str = (String) this.d;
            this.d = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    public void E() {
        int i7;
        RecyclerView recyclerView = (RecyclerView) ((org.telegram.ui.Components.ff) this.f48976b).f34586b;
        ((a8.va) this.f48977c).z();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            v4.e1 U = RecyclerView.U((View) arrayList.get(size));
            if (U != null) {
                int i10 = U.f58550r;
                if (recyclerView.c0()) {
                    U.f58551s = i10;
                    recyclerView.L0.add(U);
                } else {
                    View view = U.f58535a;
                    WeakHashMap weakHashMap = r0.i0.f55671a;
                    view.setImportantForAccessibility(i10);
                }
                U.f58550r = 0;
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (i7 = 0; i7 < childCount; i7++) {
            View childAt = recyclerView.getChildAt(i7);
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
    }

    public void F(f5.k kVar) {
        if (((wf.d) this.f48976b) != null) {
            for (int i7 = 0; i7 < kVar.f10991a.size(); i7++) {
                wf.d dVar = (wf.d) this.f48976b;
                dVar.h.remove(kVar.h(i7).d);
                dVar.h();
            }
        }
    }

    public void H(o5.i iVar, int i7, boolean z10) {
        Long l10;
        char c10;
        u5.a aVar = (u5.a) this.d;
        Context context = (Context) this.f48976b;
        ComponentName componentName = new ComponentName(context, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = iVar.f21347a;
        String str2 = iVar.f21347a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        l5.d dVar = iVar.f21349c;
        adler32.update(allocate.putInt(y5.a.a(dVar)).array());
        byte[] bArr = iVar.f21348b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z10) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i10 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i10 >= i7) {
                        c8.dc.a(iVar, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((v5.g) ((v5.d) this.f48977c)).a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str2, String.valueOf(y5.a.a(dVar))});
        try {
            if (rawQuery.moveToNext()) {
                l10 = Long.valueOf(rawQuery.getLong(0));
            } else {
                l10 = 0L;
            }
            rawQuery.close();
            long longValue = l10.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(aVar.a(dVar, longValue, i7));
            Set set = ((u5.b) aVar.f57851b.get(dVar)).f57854c;
            if (set.contains(u5.c.f57855a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(u5.c.f57857c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(u5.c.f57856b)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i7);
            persistableBundle.putString("backendName", str2);
            persistableBundle.putInt("priority", y5.a.a(dVar));
            if (bArr != null) {
                c10 = 0;
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            } else {
                c10 = 0;
            }
            builder.setExtras(persistableBundle);
            Integer valueOf = Integer.valueOf(value);
            Long valueOf2 = Long.valueOf(aVar.a(dVar, longValue, i7));
            Integer valueOf3 = Integer.valueOf(i7);
            Object[] objArr = new Object[5];
            objArr[c10] = iVar;
            objArr[1] = valueOf;
            objArr[2] = valueOf2;
            objArr[3] = l10;
            objArr[4] = valueOf3;
            String c11 = c8.dc.c("JobInfoScheduler");
            if (Log.isLoggable(c11, 3)) {
                Log.d(c11, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th2) {
            rawQuery.close();
            throw th2;
        }
    }

    public void I(wf.a aVar) {
        f5.k kVar;
        f5.k kVar2 = (f5.k) this.f48977c;
        if (kVar2 != null && ((wf.a) this.d) == null && aVar != null) {
            j(kVar2);
        }
        if (((wf.a) this.d) != null && (kVar = (f5.k) this.f48977c) != null && aVar == null) {
            F(kVar);
        }
        wf.a aVar2 = (wf.a) this.d;
        if (aVar2 != null) {
            h6.h hVar = aVar2.f59100a;
            q6.m.d("Must be called from the main thread.");
            hVar.f13613i.remove(aVar2);
        }
        if (aVar != null) {
            aVar.f59100a.p(aVar);
            f5.k kVar3 = (f5.k) this.f48977c;
            if (kVar3 != null) {
                aVar.d = kVar3;
                aVar.f59105g = 0;
                aVar.h = 0;
                aVar.p();
            }
        }
        this.d = aVar;
    }

    public FileOutputStream J() {
        File file = (File) this.f48977c;
        File file2 = (File) this.d;
        if (file2.exists()) {
            G(file2, (File) this.f48976b);
        }
        try {
            return new FileOutputStream(file);
        } catch (FileNotFoundException unused) {
            if (file.getParentFile().mkdirs()) {
                try {
                    return new FileOutputStream(file);
                } catch (FileNotFoundException e10) {
                    throw new IOException("Failed to create new file " + file, e10);
                }
            }
            throw new IOException("Failed to create directory for " + file);
        }
    }

    public void K(View view) {
        if (((ArrayList) this.d).remove(view)) {
            org.telegram.ui.Components.ff ffVar = (org.telegram.ui.Components.ff) this.f48976b;
            v4.e1 U = RecyclerView.U(view);
            if (U != null) {
                RecyclerView recyclerView = (RecyclerView) ffVar.f34586b;
                int i7 = U.f58550r;
                if (recyclerView.c0()) {
                    U.f58551s = i7;
                    recyclerView.L0.add(U);
                } else {
                    View view2 = U.f58535a;
                    WeakHashMap weakHashMap = r0.i0.f55671a;
                    view2.setImportantForAccessibility(i7);
                }
                U.f58550r = 0;
            }
        }
    }

    public void L(Object obj, String str) {
        ld0 ld0Var = new ld0(9, false);
        ((ld0) this.f48977c).f48977c = ld0Var;
        this.f48977c = ld0Var;
        ld0Var.f48976b = obj;
        ld0Var.d = str;
    }

    @Override
    public void a() {
        org.telegram.messenger.z10 z10Var;
        boolean[] zArr = (boolean[]) this.f48976b;
        if (!zArr[0] && (z10Var = (org.telegram.messenger.z10) this.f48977c) != null) {
            zArr[0] = true;
            z10Var.a(Boolean.TRUE);
        }
        org.telegram.messenger.g0.i3(new pu0((org.telegram.ui.Components.cc) this.d, 9), 200L);
    }

    @Override
    public oa.a b(Class cls, na.d dVar) {
        ((HashMap) this.f48976b).put(cls, dVar);
        ((HashMap) this.f48977c).remove(cls);
        return this;
    }

    @Override
    public Uri c() {
        return (Uri) this.f48976b;
    }

    @Override
    public Uri f() {
        return (Uri) this.d;
    }

    @Override
    public Object mo24get() {
        return new ld0((Context) ((fd.a) this.f48976b).mo24get(), (v5.d) ((fd.a) this.f48977c).mo24get(), (u5.a) ((pb.b) this.d).mo24get(), 20);
    }

    @Override
    public ClipDescription getDescription() {
        return (ClipDescription) this.f48977c;
    }

    @Override
    public Object h() {
        return null;
    }

    public void j(f5.k kVar) {
        if (((wf.d) this.f48976b) == null) {
            this.f48976b = new wf.d();
        }
        for (int i7 = 0; i7 < kVar.f10991a.size(); i7++) {
            wf.d dVar = (wf.d) this.f48976b;
            wf.e h = kVar.h(i7);
            dVar.h.put(h.d, h);
            dVar.h();
        }
    }

    public void k(int i7, View view, boolean z10) {
        int x10;
        RecyclerView recyclerView = (RecyclerView) ((org.telegram.ui.Components.ff) this.f48976b).f34586b;
        if (i7 < 0) {
            x10 = recyclerView.getChildCount();
        } else {
            x10 = x(i7);
        }
        ((a8.va) this.f48977c).w(x10, z10);
        if (z10) {
            B(view);
        }
        recyclerView.addView(view, x10);
        v4.e1 U = RecyclerView.U(view);
        recyclerView.g0(view);
        v4.h0 h0Var = recyclerView.f2825x;
        if (h0Var != null && U != null) {
            h0Var.y(U);
        }
        ArrayList arrayList = recyclerView.Q;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((v4.q0) recyclerView.Q.get(size)).b();
            }
        }
    }

    public void l(View view, int i7, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int x10;
        RecyclerView recyclerView = (RecyclerView) ((org.telegram.ui.Components.ff) this.f48976b).f34586b;
        if (i7 < 0) {
            x10 = recyclerView.getChildCount();
        } else {
            x10 = x(i7);
        }
        ((a8.va) this.f48977c).w(x10, z10);
        if (z10) {
            B(view);
        }
        v4.e1 U = RecyclerView.U(view);
        if (U != null) {
            if (!U.l() && !U.r()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + U + recyclerView.C());
            }
            U.f58544l &= -257;
        }
        recyclerView.attachViewToParent(view, x10, layoutParams);
    }

    public String m(int i7, long j3, long j10, String str) {
        ArrayList arrayList = (ArrayList) this.f48976b;
        ArrayList arrayList2 = (ArrayList) this.d;
        ArrayList arrayList3 = (ArrayList) this.f48977c;
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            sb2.append((String) arrayList.get(i10));
            if (((Integer) arrayList3.get(i10)).intValue() == 1) {
                sb2.append(str);
            } else if (((Integer) arrayList3.get(i10)).intValue() == 2) {
                sb2.append(String.format(Locale.US, (String) arrayList2.get(i10), Long.valueOf(j3)));
            } else if (((Integer) arrayList3.get(i10)).intValue() == 3) {
                sb2.append(String.format(Locale.US, (String) arrayList2.get(i10), Integer.valueOf(i7)));
            } else if (((Integer) arrayList3.get(i10)).intValue() == 4) {
                sb2.append(String.format(Locale.US, (String) arrayList2.get(i10), Long.valueOf(j10)));
            }
        }
        sb2.append((String) arrayList.get(arrayList3.size()));
        return sb2.toString();
    }

    public void n() {
        android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) this.f48976b;
        if (a0Var != null) {
            int i7 = ((s4.e) this.d).f56364n.d;
            android.support.v4.media.session.u uVar = (android.support.v4.media.session.u) a0Var.f1706b;
            uVar.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i7);
            uVar.f1736a.setPlaybackToLocal(builder.build());
            this.f48977c = null;
        }
    }

    public void p(int i7) {
        v4.e1 U;
        int x10 = x(i7);
        ((a8.va) this.f48977c).x(x10);
        RecyclerView recyclerView = (RecyclerView) ((org.telegram.ui.Components.ff) this.f48976b).f34586b;
        View childAt = recyclerView.getChildAt(x10);
        if (childAt != null && (U = RecyclerView.U(childAt)) != null) {
            if (U.l() && !U.r()) {
                throw new IllegalArgumentException("called detach on an already detached child " + U + recyclerView.C());
            }
            U.a(256);
        }
        recyclerView.detachViewFromParent(x10);
    }

    public void q(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.f48976b;
        qa.e eVar = new qa.e(byteArrayOutputStream, hashMap, (HashMap) this.f48977c, (na.d) this.d);
        if (obj == null) {
            return;
        }
        na.d dVar = (na.d) hashMap.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, eVar);
            return;
        }
        throw new RuntimeException("No encoder for " + obj.getClass());
    }

    public tf.e r(tf.f fVar) {
        InflaterInputStream inflaterInputStream;
        int i7 = fVar.f57126c;
        InputStream inputStream = (uf.a) this.f48976b;
        if (fVar.d) {
            org.telegram.messenger.ou ouVar = (org.telegram.messenger.ou) this.d;
            ouVar.getClass();
            byte[] bArr = new byte[i7];
            int i10 = 0;
            while (i10 < i7) {
                int read = ((ab.d) ouVar.f25804b).read(bArr, i10, i7 - i10);
                if (read > 0) {
                    i10 += read;
                } else {
                    throw new EOFException();
                }
            }
            int i11 = 0;
            boolean z10 = false;
            for (int i12 = 0; i12 < i7; i12++) {
                byte b10 = bArr[i12];
                if (!z10 || b10 != 0) {
                    bArr[i11] = b10;
                    i11++;
                }
                if (b10 == -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            inputStream = new ByteArrayInputStream(bArr, 0, i11);
            i7 = i11;
        }
        if (!fVar.f57128f) {
            if (fVar.f57127e) {
                i7 = fVar.f57129g;
                inflaterInputStream = new InflaterInputStream(inputStream);
            } else {
                inflaterInputStream = inputStream;
            }
            return new tf.e(inflaterInputStream, fVar.f57125b, i7, (tf.h) this.f48977c, fVar);
        }
        throw new Exception("Frame encryption is not supported");
    }

    public q2.n s(e2.l0 l0Var) {
        q2.f fVar;
        l0Var.f10186b.getClass();
        e2.d0 d0Var = l0Var.f10186b.f10097c;
        if (d0Var == null) {
            return q2.n.A;
        }
        synchronized (this.f48976b) {
            try {
                if (!d0Var.equals((e2.d0) this.f48977c)) {
                    this.f48977c = d0Var;
                    this.d = o(d0Var);
                }
                fVar = (q2.f) this.d;
                fVar.getClass();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    public View t(int i7) {
        return ((RecyclerView) ((org.telegram.ui.Components.ff) this.f48976b).f34586b).getChildAt(x(i7));
    }

    public String toString() {
        String str = "";
        switch (this.f48975a) {
            case 10:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.d);
                sb2.append('{');
                ld0 ld0Var = (ld0) ((ld0) this.f48976b).f48977c;
                while (ld0Var != null) {
                    Object obj = ld0Var.f48976b;
                    sb2.append(str);
                    String str2 = (String) ld0Var.d;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    if (obj != null && obj.getClass().isArray()) {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    } else {
                        sb2.append(obj);
                    }
                    ld0Var = (ld0) ld0Var.f48977c;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 19:
                StringBuilder sb3 = new StringBuilder("id3v2tag[pos=");
                uf.a aVar = (uf.a) this.f48976b;
                sb3.append(aVar.f913b);
                sb3.append(", ");
                sb3.append(aVar.e());
                sb3.append(" left]");
                return sb3.toString();
            case 22:
                return ((a8.va) this.f48977c).toString() + ", hidden list:" + ((ArrayList) this.d).size();
            case 28:
                StringBuilder sb4 = new StringBuilder(32);
                sb4.append((String) this.d);
                sb4.append('{');
                ld0 ld0Var2 = (ld0) ((ld0) this.f48976b).f48977c;
                while (ld0Var2 != null) {
                    Object obj2 = ld0Var2.f48976b;
                    sb4.append(str);
                    String str3 = (String) ld0Var2.d;
                    if (str3 != null) {
                        sb4.append(str3);
                        sb4.append('=');
                    }
                    if (obj2 != null && obj2.getClass().isArray()) {
                        String deepToString2 = Arrays.deepToString(new Object[]{obj2});
                        sb4.append((CharSequence) deepToString2, 1, deepToString2.length() - 1);
                    } else {
                        sb4.append(obj2);
                    }
                    ld0Var2 = (ld0) ld0Var2.f48977c;
                    str = ", ";
                }
                sb4.append('}');
                return sb4.toString();
            default:
                return super.toString();
        }
    }

    public int u() {
        return ((RecyclerView) ((org.telegram.ui.Components.ff) this.f48976b).f34586b).getChildCount() - ((ArrayList) this.d).size();
    }

    public long v() {
        f3.l lVar = (f3.l) this.d;
        if (lVar != null) {
            return lVar.d;
        }
        return -1L;
    }

    public ByteBuffer w() {
        Bitmap bitmap = (Bitmap) this.d;
        if (bitmap != null) {
            if (bitmap == null) {
                return null;
            }
            int width = bitmap.getWidth();
            int height = ((Bitmap) this.d).getHeight();
            int i7 = width * height;
            int[] iArr = new int[i7];
            ((Bitmap) this.d).getPixels(iArr, 0, width, 0, 0, width, height);
            byte[] bArr = new byte[i7];
            for (int i10 = 0; i10 < i7; i10++) {
                bArr[i10] = (byte) ((Color.blue(iArr[i10]) * 0.114f) + (Color.green(iArr[i10]) * 0.587f) + (Color.red(iArr[i10]) * 0.299f));
            }
            return ByteBuffer.wrap(bArr);
        }
        return (ByteBuffer) this.f48977c;
    }

    public int x(int i7) {
        a8.va vaVar = (a8.va) this.f48977c;
        if (i7 < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) ((org.telegram.ui.Components.ff) this.f48976b).f34586b).getChildCount();
        int i10 = i7;
        while (i10 < childCount) {
            int q10 = i7 - (i10 - vaVar.q(i10));
            if (q10 == 0) {
                while (vaVar.v(i10)) {
                    i10++;
                }
                return i10;
            }
            i10 += q10;
        }
        return -1;
    }

    public View y(int i7) {
        return ((RecyclerView) ((org.telegram.ui.Components.ff) this.f48976b).f34586b).getChildAt(i7);
    }

    public int z() {
        return ((RecyclerView) ((org.telegram.ui.Components.ff) this.f48976b).f34586b).getChildCount();
    }

    public ld0(Object obj, Object obj2, Object obj3, int i7) {
        this.f48975a = i7;
        this.f48976b = obj;
        this.f48977c = obj2;
        this.d = obj3;
    }

    public ld0(String str, int i7) {
        this.f48975a = i7;
        switch (i7) {
            case 28:
                ld0 ld0Var = new ld0(27, false);
                this.f48976b = ld0Var;
                this.f48977c = ld0Var;
                this.d = str;
                return;
            default:
                ld0 ld0Var2 = new ld0(9, false);
                this.f48976b = ld0Var2;
                this.f48977c = ld0Var2;
                this.d = str;
                return;
        }
    }

    public ld0(InputStream inputStream, long j3, int i7, tf.h hVar) {
        this.f48975a = 19;
        uf.a aVar = new uf.a(inputStream, j3, i7);
        this.f48976b = aVar;
        this.d = new org.telegram.messenger.ou(aVar, 26);
        this.f48977c = hVar;
    }

    public ld0(String str, Boolean bool, uc.a aVar, String str2) {
        this.f48975a = 21;
        this.d = str;
        this.f48976b = str2;
        this.f48977c = aVar;
    }

    public ld0(int i7) {
        this.f48975a = i7;
        switch (i7) {
            case 18:
                this.f48976b = new Object();
                this.f48977c = null;
                this.d = null;
                return;
            case 26:
                this.f48976b = new HashMap();
                this.f48977c = new HashMap();
                this.d = y7.i.f60277c;
                return;
            default:
                this.f48976b = new Object();
                return;
        }
    }

    public ld0(org.telegram.ui.Components.ff ffVar, char c10) {
        this.f48975a = 22;
        this.f48976b = ffVar;
        this.f48977c = new a8.va(8);
        this.d = new ArrayList();
    }

    @Override
    public void d() {
    }

    @Override
    public void e() {
    }

    @Override
    public void g() {
    }

    @Override
    public void i() {
    }

    public ld0(File file) {
        this.f48975a = 6;
        this.f48976b = file;
        this.f48977c = new File(file.getPath() + ".new");
        this.d = new File(file.getPath() + ".bak");
    }

    public ld0(f3.r rVar) {
        this.f48975a = 24;
        this.f48976b = rVar;
    }

    public ld0(Runnable runnable) {
        this.f48975a = 12;
        this.f48977c = new CopyOnWriteArrayList();
        this.d = new HashMap();
        this.f48976b = runnable;
    }

    public ld0(byte[] bArr, m9.y yVar) {
        this.f48975a = 4;
        this.f48976b = bArr;
        this.f48977c = null;
        this.d = yVar;
    }

    public ld0(e2.o0 o0Var, m9.y yVar) {
        this.f48975a = 4;
        this.f48976b = o0Var.f10271k;
        this.f48977c = o0Var.f10274n;
        this.d = yVar;
    }

    public ld0(org.telegram.ui.Components.ff ffVar) {
        this.f48975a = 13;
        this.f48975a = 13;
        this.f48976b = ffVar;
        this.f48977c = Choreographer.getInstance();
        this.d = new org.telegram.ui.Components.zy0(this, 1);
    }

    public ld0(String str, String str2) {
        this.f48975a = 25;
        this.d = str;
        this.f48976b = str2;
        this.f48977c = str2.isEmpty() ? str : a8.p0.E(str, "/", str2);
    }

    public ld0(s4.e eVar, android.support.v4.media.session.a0 a0Var) {
        this.f48975a = 15;
        this.d = eVar;
        this.f48976b = a0Var;
    }

    public ld0(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.f48975a = 14;
        this.f48977c = arrayDeque;
        this.f48976b = bufferedReader;
    }
}
