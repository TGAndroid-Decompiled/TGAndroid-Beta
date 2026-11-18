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
public class nd0 implements ly0, t0.h, q5.b, oa.a {
    public final int f50147a;
    public Object f50148b;
    public Object f50149c;
    public Object d;

    public nd0(int i7, boolean z10) {
        this.f50147a = i7;
    }

    public static void G(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (!file.renameTo(file2)) {
            Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
        }
    }

    public static q2.e o(e2.d0 d0Var) {
        String uri;
        boolean z10;
        boolean z11;
        j2.o oVar = new j2.o();
        byte[] bArr = null;
        oVar.f17202c = null;
        Uri uri2 = d0Var.f10360b;
        if (uri2 == null) {
            uri = null;
        } else {
            uri = uri2.toString();
        }
        boolean z12 = d0Var.f10363f;
        ?? obj = new Object();
        if (z12 && TextUtils.isEmpty(uri)) {
            z10 = false;
        } else {
            z10 = true;
        }
        a8.la.f(z10);
        obj.f988b = oVar;
        obj.f989c = uri;
        obj.f987a = z12;
        obj.d = new HashMap();
        h9.l0 l0Var = d0Var.f10361c;
        h9.t0 t0Var = l0Var.f14016a;
        if (t0Var == null) {
            t0Var = l0Var.c();
            l0Var.f14016a = t0Var;
        }
        h9.h2 it = t0Var.iterator();
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
        int i7 = e2.l.f10489a;
        qb.a aVar = new qb.a(4);
        UUID uuid = d0Var.f10359a;
        uuid.getClass();
        boolean z13 = d0Var.d;
        boolean z14 = d0Var.f10362e;
        int[] f10 = c8.k1.f(d0Var.f10364g);
        for (int i10 : f10) {
            if (i10 != 2 && i10 != 1) {
                z11 = false;
            } else {
                z11 = true;
            }
            a8.la.f(z11);
        }
        q2.e eVar = new q2.e(uuid, obj, hashMap, z13, (int[]) f10.clone(), z14, aVar);
        byte[] bArr2 = d0Var.h;
        if (bArr2 != null) {
            bArr = Arrays.copyOf(bArr2, bArr2.length);
        }
        a8.la.p(eVar.f55751x.isEmpty());
        eVar.L = bArr;
        return eVar;
    }

    public boolean A() {
        String trim;
        ArrayDeque arrayDeque = (ArrayDeque) this.f50149c;
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
            String readLine = ((BufferedReader) this.f50148b).readLine();
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
        org.telegram.ui.Components.of ofVar = (org.telegram.ui.Components.of) this.f50148b;
        v4.f1 U = RecyclerView.U(view);
        if (U != null) {
            View view2 = U.f59123a;
            RecyclerView recyclerView = (RecyclerView) ofVar.f38076b;
            int i7 = U.f59139s;
            if (i7 != -1) {
                U.f59138r = i7;
            } else {
                WeakHashMap weakHashMap = r0.i0.f56244a;
                U.f59138r = view2.getImportantForAccessibility();
            }
            if (recyclerView.c0()) {
                U.f59139s = 4;
                recyclerView.L0.add(U);
                return;
            }
            WeakHashMap weakHashMap2 = r0.i0.f56244a;
            view2.setImportantForAccessibility(4);
        }
    }

    public void C(j2.h r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, x2.w0 r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nd0.C(j2.h, android.net.Uri, java.util.Map, long, long, x2.w0):void");
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
        RecyclerView recyclerView = (RecyclerView) ((org.telegram.ui.Components.of) this.f50148b).f38076b;
        ((a8.va) this.f50149c).J();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            v4.f1 U = RecyclerView.U((View) arrayList.get(size));
            if (U != null) {
                int i10 = U.f59138r;
                if (recyclerView.c0()) {
                    U.f59139s = i10;
                    recyclerView.L0.add(U);
                } else {
                    View view = U.f59123a;
                    WeakHashMap weakHashMap = r0.i0.f56244a;
                    view.setImportantForAccessibility(i10);
                }
                U.f59138r = 0;
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

    public void F(oi.y3 y3Var) {
        if (((wf.d) this.f50148b) != null) {
            for (int i7 = 0; i7 < y3Var.f22503a.size(); i7++) {
                wf.d dVar = (wf.d) this.f50148b;
                dVar.h.remove(y3Var.j(i7).d);
                dVar.h();
            }
        }
    }

    public void H(o5.i iVar, int i7, boolean z10) {
        Long l10;
        char c10;
        u5.a aVar = (u5.a) this.d;
        Context context = (Context) this.f50148b;
        ComponentName componentName = new ComponentName(context, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = iVar.f21711a;
        String str2 = iVar.f21711a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        l5.d dVar = iVar.f21713c;
        adler32.update(allocate.putInt(y5.a.a(dVar)).array());
        byte[] bArr = iVar.f21712b;
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
                        c8.gc.a(iVar, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((v5.g) ((v5.d) this.f50149c)).a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str2, String.valueOf(y5.a.a(dVar))});
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
            Set set = ((u5.b) aVar.f58419b.get(dVar)).f58422c;
            if (set.contains(u5.c.f58423a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(u5.c.f58425c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(u5.c.f58424b)) {
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
            String c11 = c8.gc.c("JobInfoScheduler");
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
        oi.y3 y3Var;
        oi.y3 y3Var2 = (oi.y3) this.f50149c;
        if (y3Var2 != null && ((wf.a) this.d) == null && aVar != null) {
            j(y3Var2);
        }
        if (((wf.a) this.d) != null && (y3Var = (oi.y3) this.f50149c) != null && aVar == null) {
            F(y3Var);
        }
        wf.a aVar2 = (wf.a) this.d;
        if (aVar2 != null) {
            h6.h hVar = aVar2.f59666a;
            q6.m.e("Must be called from the main thread.");
            hVar.f13925i.remove(aVar2);
        }
        if (aVar != null) {
            aVar.f59666a.p(aVar);
            oi.y3 y3Var3 = (oi.y3) this.f50149c;
            if (y3Var3 != null) {
                aVar.d = y3Var3;
                aVar.f59671g = 0;
                aVar.h = 0;
                aVar.p();
            }
        }
        this.d = aVar;
    }

    public FileOutputStream J() {
        File file = (File) this.f50149c;
        File file2 = (File) this.d;
        if (file2.exists()) {
            G(file2, (File) this.f50148b);
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
            org.telegram.ui.Components.of ofVar = (org.telegram.ui.Components.of) this.f50148b;
            v4.f1 U = RecyclerView.U(view);
            if (U != null) {
                RecyclerView recyclerView = (RecyclerView) ofVar.f38076b;
                int i7 = U.f59138r;
                if (recyclerView.c0()) {
                    U.f59139s = i7;
                    recyclerView.L0.add(U);
                } else {
                    View view2 = U.f59123a;
                    WeakHashMap weakHashMap = r0.i0.f56244a;
                    view2.setImportantForAccessibility(i7);
                }
                U.f59138r = 0;
            }
        }
    }

    public void L(Object obj, String str) {
        nd0 nd0Var = new nd0(9, false);
        ((nd0) this.f50149c).f50149c = nd0Var;
        this.f50149c = nd0Var;
        nd0Var.f50148b = obj;
        nd0Var.d = str;
    }

    @Override
    public void a() {
        org.telegram.messenger.x10 x10Var;
        boolean[] zArr = (boolean[]) this.f50148b;
        if (!zArr[0] && (x10Var = (org.telegram.messenger.x10) this.f50149c) != null) {
            zArr[0] = true;
            x10Var.a(Boolean.TRUE);
        }
        org.telegram.messenger.g0.h3(new ru0((org.telegram.ui.Components.lc) this.d, 9), 200L);
    }

    @Override
    public oa.a b(Class cls, na.d dVar) {
        ((HashMap) this.f50148b).put(cls, dVar);
        ((HashMap) this.f50149c).remove(cls);
        return this;
    }

    @Override
    public Uri c() {
        return (Uri) this.f50148b;
    }

    @Override
    public Uri f() {
        return (Uri) this.d;
    }

    @Override
    public Object g() {
        return null;
    }

    @Override
    public Object mo24get() {
        return new nd0((Context) ((fd.a) this.f50148b).mo24get(), (v5.d) ((fd.a) this.f50149c).mo24get(), (u5.a) ((pb.b) this.d).mo24get(), 20);
    }

    @Override
    public ClipDescription getDescription() {
        return (ClipDescription) this.f50149c;
    }

    public void j(oi.y3 y3Var) {
        if (((wf.d) this.f50148b) == null) {
            this.f50148b = new wf.d();
        }
        for (int i7 = 0; i7 < y3Var.f22503a.size(); i7++) {
            wf.d dVar = (wf.d) this.f50148b;
            wf.e j3 = y3Var.j(i7);
            dVar.h.put(j3.d, j3);
            dVar.h();
        }
    }

    public void k(int i7, View view, boolean z10) {
        int x10;
        RecyclerView recyclerView = (RecyclerView) ((org.telegram.ui.Components.of) this.f50148b).f38076b;
        if (i7 < 0) {
            x10 = recyclerView.getChildCount();
        } else {
            x10 = x(i7);
        }
        ((a8.va) this.f50149c).H(x10, z10);
        if (z10) {
            B(view);
        }
        recyclerView.addView(view, x10);
        v4.f1 U = RecyclerView.U(view);
        recyclerView.g0(view);
        v4.i0 i0Var = recyclerView.f2820x;
        if (i0Var != null && U != null) {
            i0Var.y(U);
        }
        ArrayList arrayList = recyclerView.Q;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((v4.r0) recyclerView.Q.get(size)).b();
            }
        }
    }

    public void l(View view, int i7, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int x10;
        RecyclerView recyclerView = (RecyclerView) ((org.telegram.ui.Components.of) this.f50148b).f38076b;
        if (i7 < 0) {
            x10 = recyclerView.getChildCount();
        } else {
            x10 = x(i7);
        }
        ((a8.va) this.f50149c).H(x10, z10);
        if (z10) {
            B(view);
        }
        v4.f1 U = RecyclerView.U(view);
        if (U != null) {
            if (!U.l() && !U.r()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + U + recyclerView.C());
            }
            U.f59132l &= -257;
        }
        recyclerView.attachViewToParent(view, x10, layoutParams);
    }

    public String m(int i7, long j3, long j10, String str) {
        ArrayList arrayList = (ArrayList) this.f50148b;
        ArrayList arrayList2 = (ArrayList) this.d;
        ArrayList arrayList3 = (ArrayList) this.f50149c;
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
        android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) this.f50148b;
        if (a0Var != null) {
            int i7 = ((s4.e) this.d).f56938n.d;
            android.support.v4.media.session.u uVar = (android.support.v4.media.session.u) a0Var.f1705b;
            uVar.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i7);
            uVar.f1735a.setPlaybackToLocal(builder.build());
            this.f50149c = null;
        }
    }

    public void p(int i7) {
        v4.f1 U;
        int x10 = x(i7);
        ((a8.va) this.f50149c).I(x10);
        RecyclerView recyclerView = (RecyclerView) ((org.telegram.ui.Components.of) this.f50148b).f38076b;
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
        HashMap hashMap = (HashMap) this.f50148b;
        qa.e eVar = new qa.e(byteArrayOutputStream, hashMap, (HashMap) this.f50149c, (na.d) this.d);
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
        int i7 = fVar.f57702c;
        InputStream inputStream = (uf.a) this.f50148b;
        if (fVar.d) {
            org.telegram.ui.Components.hn hnVar = (org.telegram.ui.Components.hn) this.d;
            hnVar.getClass();
            byte[] bArr = new byte[i7];
            int i10 = 0;
            while (i10 < i7) {
                int read = ((ab.d) hnVar.f35933b).read(bArr, i10, i7 - i10);
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
        if (!fVar.f57704f) {
            if (fVar.f57703e) {
                i7 = fVar.f57705g;
                inflaterInputStream = new InflaterInputStream(inputStream);
            } else {
                inflaterInputStream = inputStream;
            }
            return new tf.e(inflaterInputStream, fVar.f57701b, i7, (tf.h) this.f50149c, fVar);
        }
        throw new Exception("Frame encryption is not supported");
    }

    public q2.m s(e2.l0 l0Var) {
        q2.e eVar;
        l0Var.f10501b.getClass();
        e2.d0 d0Var = l0Var.f10501b.f10412c;
        if (d0Var == null) {
            return q2.m.A;
        }
        synchronized (this.f50148b) {
            try {
                if (!d0Var.equals((e2.d0) this.f50149c)) {
                    this.f50149c = d0Var;
                    this.d = o(d0Var);
                }
                eVar = (q2.e) this.d;
                eVar.getClass();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    public View t(int i7) {
        return ((RecyclerView) ((org.telegram.ui.Components.of) this.f50148b).f38076b).getChildAt(x(i7));
    }

    public String toString() {
        String str = "";
        switch (this.f50147a) {
            case 10:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.d);
                sb2.append('{');
                nd0 nd0Var = (nd0) ((nd0) this.f50148b).f50149c;
                while (nd0Var != null) {
                    Object obj = nd0Var.f50148b;
                    sb2.append(str);
                    String str2 = (String) nd0Var.d;
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
                    nd0Var = (nd0) nd0Var.f50149c;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 19:
                StringBuilder sb3 = new StringBuilder("id3v2tag[pos=");
                uf.a aVar = (uf.a) this.f50148b;
                sb3.append(aVar.f912b);
                sb3.append(", ");
                sb3.append(aVar.e());
                sb3.append(" left]");
                return sb3.toString();
            case 22:
                return ((a8.va) this.f50149c).toString() + ", hidden list:" + ((ArrayList) this.d).size();
            case 28:
                StringBuilder sb4 = new StringBuilder(32);
                sb4.append((String) this.d);
                sb4.append('{');
                nd0 nd0Var2 = (nd0) ((nd0) this.f50148b).f50149c;
                while (nd0Var2 != null) {
                    Object obj2 = nd0Var2.f50148b;
                    sb4.append(str);
                    String str3 = (String) nd0Var2.d;
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
                    nd0Var2 = (nd0) nd0Var2.f50149c;
                    str = ", ";
                }
                sb4.append('}');
                return sb4.toString();
            default:
                return super.toString();
        }
    }

    public int u() {
        return ((RecyclerView) ((org.telegram.ui.Components.of) this.f50148b).f38076b).getChildCount() - ((ArrayList) this.d).size();
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
        return (ByteBuffer) this.f50149c;
    }

    public int x(int i7) {
        a8.va vaVar = (a8.va) this.f50149c;
        if (i7 < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) ((org.telegram.ui.Components.of) this.f50148b).f38076b).getChildCount();
        int i10 = i7;
        while (i10 < childCount) {
            int D = i7 - (i10 - vaVar.D(i10));
            if (D == 0) {
                while (vaVar.G(i10)) {
                    i10++;
                }
                return i10;
            }
            i10 += D;
        }
        return -1;
    }

    public View y(int i7) {
        return ((RecyclerView) ((org.telegram.ui.Components.of) this.f50148b).f38076b).getChildAt(i7);
    }

    public int z() {
        return ((RecyclerView) ((org.telegram.ui.Components.of) this.f50148b).f38076b).getChildCount();
    }

    public nd0(Object obj, Object obj2, Object obj3, int i7) {
        this.f50147a = i7;
        this.f50148b = obj;
        this.f50149c = obj2;
        this.d = obj3;
    }

    public nd0(String str, int i7) {
        this.f50147a = i7;
        switch (i7) {
            case 28:
                nd0 nd0Var = new nd0(27, false);
                this.f50148b = nd0Var;
                this.f50149c = nd0Var;
                this.d = str;
                return;
            default:
                nd0 nd0Var2 = new nd0(9, false);
                this.f50148b = nd0Var2;
                this.f50149c = nd0Var2;
                this.d = str;
                return;
        }
    }

    public nd0(InputStream inputStream, long j3, int i7, tf.h hVar) {
        this.f50147a = 19;
        uf.a aVar = new uf.a(inputStream, j3, i7);
        this.f50148b = aVar;
        this.d = new org.telegram.ui.Components.hn(aVar, 19);
        this.f50149c = hVar;
    }

    public nd0(String str, Boolean bool, uc.a aVar, String str2) {
        this.f50147a = 21;
        this.d = str;
        this.f50148b = str2;
        this.f50149c = aVar;
    }

    public nd0(int i7) {
        this.f50147a = i7;
        switch (i7) {
            case 18:
                this.f50148b = new Object();
                this.f50149c = null;
                this.d = null;
                return;
            case 26:
                this.f50148b = new HashMap();
                this.f50149c = new HashMap();
                this.d = y7.i.f60843c;
                return;
            default:
                this.f50148b = new Object();
                return;
        }
    }

    public nd0(org.telegram.ui.Components.of ofVar, char c10) {
        this.f50147a = 22;
        this.f50148b = ofVar;
        this.f50149c = new a8.va(8);
        this.d = new ArrayList();
    }

    @Override
    public void d() {
    }

    @Override
    public void e() {
    }

    @Override
    public void h() {
    }

    @Override
    public void i() {
    }

    public nd0(File file) {
        this.f50147a = 6;
        this.f50148b = file;
        this.f50149c = new File(file.getPath() + ".new");
        this.d = new File(file.getPath() + ".bak");
    }

    public nd0(f3.r rVar) {
        this.f50147a = 24;
        this.f50148b = rVar;
    }

    public nd0(Runnable runnable) {
        this.f50147a = 12;
        this.f50149c = new CopyOnWriteArrayList();
        this.d = new HashMap();
        this.f50148b = runnable;
    }

    public nd0(byte[] bArr, m9.y yVar) {
        this.f50147a = 4;
        this.f50148b = bArr;
        this.f50149c = null;
        this.d = yVar;
    }

    public nd0(e2.o0 o0Var, m9.y yVar) {
        this.f50147a = 4;
        this.f50148b = o0Var.f10586k;
        this.f50149c = o0Var.f10589n;
        this.d = yVar;
    }

    public nd0(org.telegram.ui.Components.of ofVar) {
        this.f50147a = 13;
        this.f50147a = 13;
        this.f50148b = ofVar;
        this.f50149c = Choreographer.getInstance();
        this.d = new org.telegram.ui.Components.gz0(this, 1);
    }

    public nd0(String str, String str2) {
        this.f50147a = 25;
        this.d = str;
        this.f50148b = str2;
        this.f50149c = str2.isEmpty() ? str : a8.p0.E(str, "/", str2);
    }

    public nd0(s4.e eVar, android.support.v4.media.session.a0 a0Var) {
        this.f50147a = 15;
        this.d = eVar;
        this.f50148b = a0Var;
    }

    public nd0(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.f50147a = 14;
        this.f50149c = arrayDeque;
        this.f50148b = bufferedReader;
    }
}
