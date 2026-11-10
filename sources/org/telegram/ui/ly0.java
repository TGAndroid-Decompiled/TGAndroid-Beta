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
import android.media.MediaCodec;
import android.media.MediaFormat;
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
public class ly0 implements ny0, t0.h, q5.b, wi.w0, oa.a {
    public final int f47745a;
    public Object f47746b;
    public Object f47747c;
    public Object d;

    public ly0(int i7, boolean z9) {
        this.f47745a = i7;
    }

    public static void I(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (!file.renameTo(file2)) {
            Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
        }
    }

    public static q2.e o(e2.d0 d0Var) {
        String uri;
        boolean z9;
        boolean z10;
        j2.p pVar = new j2.p();
        byte[] bArr = null;
        pVar.f16469c = null;
        Uri uri2 = d0Var.f10214b;
        if (uri2 == null) {
            uri = null;
        } else {
            uri = uri2.toString();
        }
        boolean z11 = d0Var.f10217f;
        ?? obj = new Object();
        if (z11 && TextUtils.isEmpty(uri)) {
            z9 = false;
        } else {
            z9 = true;
        }
        a8.ia.f(z9);
        obj.f990b = pVar;
        obj.f991c = uri;
        obj.f989a = z11;
        obj.d = new HashMap();
        h9.l0 l0Var = d0Var.f10215c;
        h9.t0 t0Var = l0Var.f14344a;
        if (t0Var == null) {
            t0Var = l0Var.c();
            l0Var.f14344a = t0Var;
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
        int i7 = e2.l.f10343a;
        pb.b bVar = new pb.b(4);
        UUID uuid = d0Var.f10213a;
        uuid.getClass();
        boolean z12 = d0Var.d;
        boolean z13 = d0Var.f10216e;
        int[] f10 = c8.e1.f(d0Var.f10218g);
        for (int i10 : f10) {
            if (i10 != 2 && i10 != 1) {
                z10 = false;
            } else {
                z10 = true;
            }
            a8.ia.f(z10);
        }
        q2.e eVar = new q2.e(uuid, obj, hashMap, z12, (int[]) f10.clone(), z13, bVar);
        byte[] bArr2 = d0Var.h;
        if (bArr2 != null) {
            bArr = Arrays.copyOf(bArr2, bArr2.length);
        }
        a8.ia.p(eVar.f53740x.isEmpty());
        eVar.K = bArr;
        return eVar;
    }

    public View A(int i7) {
        return ((RecyclerView) ((org.telegram.ui.Components.uy) this.f47746b).f38776b).getChildAt(i7);
    }

    public int B() {
        return ((RecyclerView) ((org.telegram.ui.Components.uy) this.f47746b).f38776b).getChildCount();
    }

    public boolean C() {
        String trim;
        ArrayDeque arrayDeque = (ArrayDeque) this.f47747c;
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
            String readLine = ((BufferedReader) this.f47746b).readLine();
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

    public void D(View view) {
        ((ArrayList) this.d).add(view);
        org.telegram.ui.Components.uy uyVar = (org.telegram.ui.Components.uy) this.f47746b;
        v4.d1 U = RecyclerView.U(view);
        if (U != null) {
            View view2 = U.f57052a;
            RecyclerView recyclerView = (RecyclerView) uyVar.f38776b;
            int i7 = U.f57068s;
            if (i7 != -1) {
                U.f57067r = i7;
            } else {
                WeakHashMap weakHashMap = r0.i0.f54202a;
                U.f57067r = view2.getImportantForAccessibility();
            }
            if (recyclerView.c0()) {
                U.f57068s = 4;
                recyclerView.K0.add(U);
                return;
            }
            WeakHashMap weakHashMap2 = r0.i0.f54202a;
            view2.setImportantForAccessibility(4);
        }
    }

    public void E(j2.h r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, x2.v0 r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ly0.E(j2.h, android.net.Uri, java.util.Map, long, long, x2.v0):void");
    }

    public String F() {
        if (C()) {
            String str = (String) this.d;
            this.d = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    public void G() {
        int i7;
        RecyclerView recyclerView = (RecyclerView) ((org.telegram.ui.Components.uy) this.f47746b).f38776b;
        ((a8.ua) this.f47747c).H();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            v4.d1 U = RecyclerView.U((View) arrayList.get(size));
            if (U != null) {
                int i10 = U.f57067r;
                if (recyclerView.c0()) {
                    U.f57068s = i10;
                    recyclerView.K0.add(U);
                } else {
                    View view = U.f57052a;
                    WeakHashMap weakHashMap = r0.i0.f54202a;
                    view.setImportantForAccessibility(i10);
                }
                U.f57067r = 0;
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

    public void H(g7.c cVar) {
        if (((wf.d) this.f47746b) != null) {
            for (int i7 = 0; i7 < cVar.f13575a.size(); i7++) {
                wf.d dVar = (wf.d) this.f47746b;
                dVar.h.remove(cVar.a(i7).d);
                dVar.h();
            }
        }
    }

    public void J(o5.i iVar, int i7, boolean z9) {
        Long l10;
        char c10;
        u5.a aVar = (u5.a) this.d;
        Context context = (Context) this.f47746b;
        ComponentName componentName = new ComponentName(context, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = iVar.f20831a;
        String str2 = iVar.f20831a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        l5.d dVar = iVar.f20833c;
        adler32.update(allocate.putInt(y5.a.a(dVar)).array());
        byte[] bArr = iVar.f20832b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z9) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i10 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i10 >= i7) {
                        c8.cc.a(iVar, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((v5.g) ((v5.d) this.f47747c)).a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str2, String.valueOf(y5.a.a(dVar))});
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
            Set set = ((u5.b) aVar.f56352b.get(dVar)).f56355c;
            if (set.contains(u5.c.f56356a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(u5.c.f56358c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(u5.c.f56357b)) {
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
            String c11 = c8.cc.c("JobInfoScheduler");
            if (Log.isLoggable(c11, 3)) {
                Log.d(c11, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th2) {
            rawQuery.close();
            throw th2;
        }
    }

    public void K(wf.a aVar) {
        g7.c cVar;
        g7.c cVar2 = (g7.c) this.f47747c;
        if (cVar2 != null && ((wf.a) this.d) == null && aVar != null) {
            j(cVar2);
        }
        if (((wf.a) this.d) != null && (cVar = (g7.c) this.f47747c) != null && aVar == null) {
            H(cVar);
        }
        wf.a aVar2 = (wf.a) this.d;
        if (aVar2 != null) {
            h6.h hVar = aVar2.f57659a;
            q6.m.d("Must be called from the main thread.");
            hVar.f14255i.remove(aVar2);
        }
        if (aVar != null) {
            aVar.f57659a.p(aVar);
            g7.c cVar3 = (g7.c) this.f47747c;
            if (cVar3 != null) {
                aVar.d = cVar3;
                aVar.f57664g = 0;
                aVar.h = 0;
                aVar.p();
            }
        }
        this.d = aVar;
    }

    public FileOutputStream L() {
        File file = (File) this.f47747c;
        File file2 = (File) this.d;
        if (file2.exists()) {
            I(file2, (File) this.f47746b);
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

    public void M(View view) {
        if (((ArrayList) this.d).remove(view)) {
            org.telegram.ui.Components.uy uyVar = (org.telegram.ui.Components.uy) this.f47746b;
            v4.d1 U = RecyclerView.U(view);
            if (U != null) {
                RecyclerView recyclerView = (RecyclerView) uyVar.f38776b;
                int i7 = U.f57067r;
                if (recyclerView.c0()) {
                    U.f57068s = i7;
                    recyclerView.K0.add(U);
                } else {
                    View view2 = U.f57052a;
                    WeakHashMap weakHashMap = r0.i0.f54202a;
                    view2.setImportantForAccessibility(i7);
                }
                U.f57067r = 0;
            }
        }
    }

    public void N(Object obj, String str) {
        ly0 ly0Var = new ly0(8, false);
        ((ly0) this.d).d = ly0Var;
        this.d = ly0Var;
        ly0Var.f47747c = obj;
        ly0Var.f47746b = str;
    }

    @Override
    public void a() {
        org.telegram.messenger.c20 c20Var;
        boolean[] zArr = (boolean[]) this.f47746b;
        if (!zArr[0] && (c20Var = (org.telegram.messenger.c20) this.f47747c) != null) {
            zArr[0] = true;
            c20Var.a(Boolean.TRUE);
        }
        org.telegram.messenger.g0.i3(new uu0((org.telegram.ui.Components.gc) this.d, 9), 200L);
    }

    @Override
    public oa.a b(Class cls, na.d dVar) {
        ((HashMap) this.f47746b).put(cls, dVar);
        ((HashMap) this.f47747c).remove(cls);
        return this;
    }

    @Override
    public Uri c() {
        return (Uri) this.f47746b;
    }

    @Override
    public Uri f() {
        return (Uri) this.d;
    }

    @Override
    public Object mo24get() {
        return new ly0((Context) ((fd.a) this.f47746b).mo24get(), (v5.d) ((fd.a) this.f47747c).mo24get(), (u5.a) ((sa.d) this.d).mo24get(), 19);
    }

    @Override
    public ClipDescription getDescription() {
        return (ClipDescription) this.f47747c;
    }

    @Override
    public Object h() {
        return null;
    }

    public void j(g7.c cVar) {
        if (((wf.d) this.f47746b) == null) {
            this.f47746b = new wf.d();
        }
        for (int i7 = 0; i7 < cVar.f13575a.size(); i7++) {
            wf.d dVar = (wf.d) this.f47746b;
            wf.e a10 = cVar.a(i7);
            dVar.h.put(a10.d, a10);
            dVar.h();
        }
    }

    public void k(int i7, View view, boolean z9) {
        int z10;
        RecyclerView recyclerView = (RecyclerView) ((org.telegram.ui.Components.uy) this.f47746b).f38776b;
        if (i7 < 0) {
            z10 = recyclerView.getChildCount();
        } else {
            z10 = z(i7);
        }
        ((a8.ua) this.f47747c).F(z10, z9);
        if (z9) {
            D(view);
        }
        recyclerView.addView(view, z10);
        v4.d1 U = RecyclerView.U(view);
        recyclerView.g0(view);
        v4.g0 g0Var = recyclerView.f2871x;
        if (g0Var != null && U != null) {
            g0Var.y(U);
        }
        ArrayList arrayList = recyclerView.P;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((v4.p0) recyclerView.P.get(size)).b();
            }
        }
    }

    public void l(View view, int i7, ViewGroup.LayoutParams layoutParams, boolean z9) {
        int z10;
        RecyclerView recyclerView = (RecyclerView) ((org.telegram.ui.Components.uy) this.f47746b).f38776b;
        if (i7 < 0) {
            z10 = recyclerView.getChildCount();
        } else {
            z10 = z(i7);
        }
        ((a8.ua) this.f47747c).F(z10, z9);
        if (z9) {
            D(view);
        }
        v4.d1 U = RecyclerView.U(view);
        if (U != null) {
            if (!U.l() && !U.r()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + U + recyclerView.C());
            }
            U.f57061l &= -257;
        }
        recyclerView.attachViewToParent(view, z10, layoutParams);
    }

    public String m(int i7, long j3, long j10, String str) {
        ArrayList arrayList = (ArrayList) this.f47746b;
        ArrayList arrayList2 = (ArrayList) this.d;
        ArrayList arrayList3 = (ArrayList) this.f47747c;
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
        android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) this.f47746b;
        if (a0Var != null) {
            int i7 = ((s4.e) this.d).f54810n.d;
            android.support.v4.media.session.u uVar = (android.support.v4.media.session.u) a0Var.f1763b;
            uVar.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i7);
            uVar.f1793a.setPlaybackToLocal(builder.build());
            this.f47747c = null;
        }
    }

    public void p(int i7) {
        v4.d1 U;
        int z9 = z(i7);
        ((a8.ua) this.f47747c).G(z9);
        RecyclerView recyclerView = (RecyclerView) ((org.telegram.ui.Components.uy) this.f47746b).f38776b;
        View childAt = recyclerView.getChildAt(z9);
        if (childAt != null && (U = RecyclerView.U(childAt)) != null) {
            if (U.l() && !U.r()) {
                throw new IllegalArgumentException("called detach on an already detached child " + U + recyclerView.C());
            }
            U.a(256);
        }
        recyclerView.detachViewFromParent(z9);
    }

    public void q(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.f47746b;
        qa.e eVar = new qa.e(byteArrayOutputStream, hashMap, (HashMap) this.f47747c, (na.d) this.d);
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

    @Override
    public void r(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
        byteBuffer.position(bufferInfo.offset);
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        allocateDirect.put(byteBuffer).flip();
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        bufferInfo2.set(0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
        ((ArrayList) this.f47746b).add(allocateDirect);
        ((ArrayList) this.f47747c).add(bufferInfo2);
    }

    public tf.e s(tf.f fVar) {
        InflaterInputStream inflaterInputStream;
        int i7 = fVar.f55543c;
        InputStream inputStream = (uf.a) this.f47746b;
        if (fVar.d) {
            org.telegram.ui.Components.uy uyVar = (org.telegram.ui.Components.uy) this.d;
            uyVar.getClass();
            byte[] bArr = new byte[i7];
            int i10 = 0;
            while (i10 < i7) {
                int read = ((ab.d) uyVar.f38776b).read(bArr, i10, i7 - i10);
                if (read > 0) {
                    i10 += read;
                } else {
                    throw new EOFException();
                }
            }
            int i11 = 0;
            boolean z9 = false;
            for (int i12 = 0; i12 < i7; i12++) {
                byte b10 = bArr[i12];
                if (!z9 || b10 != 0) {
                    bArr[i11] = b10;
                    i11++;
                }
                if (b10 == -1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
            }
            inputStream = new ByteArrayInputStream(bArr, 0, i11);
            i7 = i11;
        }
        if (!fVar.f55545f) {
            if (fVar.f55544e) {
                i7 = fVar.f55546g;
                inflaterInputStream = new InflaterInputStream(inputStream);
            } else {
                inflaterInputStream = inputStream;
            }
            return new tf.e(inflaterInputStream, fVar.f55542b, i7, (tf.h) this.f47747c, fVar);
        }
        throw new Exception("Frame encryption is not supported");
    }

    public q2.m t(e2.l0 l0Var) {
        q2.e eVar;
        l0Var.f10355b.getClass();
        e2.d0 d0Var = l0Var.f10355b.f10266c;
        if (d0Var == null) {
            return q2.m.A;
        }
        synchronized (this.f47746b) {
            try {
                if (!d0Var.equals((e2.d0) this.f47747c)) {
                    this.f47747c = d0Var;
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

    public String toString() {
        String str = "";
        switch (this.f47745a) {
            case 9:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f47746b);
                sb2.append('{');
                ly0 ly0Var = (ly0) ((ly0) this.f47747c).d;
                while (ly0Var != null) {
                    Object obj = ly0Var.f47747c;
                    sb2.append(str);
                    String str2 = (String) ly0Var.f47746b;
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
                    ly0Var = (ly0) ly0Var.d;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 18:
                StringBuilder sb3 = new StringBuilder("id3v2tag[pos=");
                uf.a aVar = (uf.a) this.f47746b;
                sb3.append(aVar.f915b);
                sb3.append(", ");
                sb3.append(aVar.e());
                sb3.append(" left]");
                return sb3.toString();
            case 22:
                return ((a8.ua) this.f47747c).toString() + ", hidden list:" + ((ArrayList) this.d).size();
            case 29:
                StringBuilder sb4 = new StringBuilder(32);
                sb4.append((String) this.f47746b);
                sb4.append('{');
                ly0 ly0Var2 = (ly0) ((ly0) this.f47747c).d;
                while (ly0Var2 != null) {
                    Object obj2 = ly0Var2.f47747c;
                    sb4.append(str);
                    String str3 = (String) ly0Var2.f47746b;
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
                    ly0Var2 = (ly0) ly0Var2.d;
                    str = ", ";
                }
                sb4.append('}');
                return sb4.toString();
            default:
                return super.toString();
        }
    }

    public View u(int i7) {
        return ((RecyclerView) ((org.telegram.ui.Components.uy) this.f47746b).f38776b).getChildAt(z(i7));
    }

    public int v() {
        return ((RecyclerView) ((org.telegram.ui.Components.uy) this.f47746b).f38776b).getChildCount() - ((ArrayList) this.d).size();
    }

    @Override
    public void w(MediaFormat mediaFormat) {
        this.d = mediaFormat;
    }

    public long x() {
        f3.l lVar = (f3.l) this.d;
        if (lVar != null) {
            return lVar.d;
        }
        return -1L;
    }

    public ByteBuffer y() {
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
        return (ByteBuffer) this.f47747c;
    }

    public int z(int i7) {
        a8.ua uaVar = (a8.ua) this.f47747c;
        if (i7 < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) ((org.telegram.ui.Components.uy) this.f47746b).f38776b).getChildCount();
        int i10 = i7;
        while (i10 < childCount) {
            int B = i7 - (i10 - uaVar.B(i10));
            if (B == 0) {
                while (uaVar.E(i10)) {
                    i10++;
                }
                return i10;
            }
            i10 += B;
        }
        return -1;
    }

    public ly0(Object obj, Object obj2, Object obj3, int i7) {
        this.f47745a = i7;
        this.f47746b = obj;
        this.f47747c = obj2;
        this.d = obj3;
    }

    public ly0(String str, int i7) {
        this.f47745a = i7;
        switch (i7) {
            case 29:
                ly0 ly0Var = new ly0(28, false);
                this.f47747c = ly0Var;
                this.d = ly0Var;
                this.f47746b = str;
                return;
            default:
                ly0 ly0Var2 = new ly0(8, false);
                this.f47747c = ly0Var2;
                this.d = ly0Var2;
                this.f47746b = str;
                return;
        }
    }

    public ly0(InputStream inputStream, long j3, int i7, tf.h hVar) {
        this.f47745a = 18;
        uf.a aVar = new uf.a(inputStream, j3, i7);
        this.f47746b = aVar;
        this.d = new org.telegram.ui.Components.uy(aVar, 19);
        this.f47747c = hVar;
    }

    public ly0(String str, Boolean bool, uc.a aVar, String str2) {
        this.f47745a = 20;
        this.f47746b = str;
        this.f47747c = str2;
        this.d = aVar;
    }

    public ly0(int i7) {
        this.f47745a = i7;
        switch (i7) {
            case 17:
                this.f47746b = new Object();
                this.f47747c = null;
                this.d = null;
                return;
            case 25:
                this.f47746b = new ArrayList();
                this.f47747c = new ArrayList();
                return;
            case 27:
                this.f47746b = new HashMap();
                this.f47747c = new HashMap();
                this.d = y7.i.f59052c;
                return;
            default:
                this.f47746b = new Object();
                return;
        }
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

    public ly0(org.telegram.ui.Components.uy uyVar) {
        this.f47745a = 22;
        this.f47746b = uyVar;
        this.f47747c = new a8.ua(8);
        this.d = new ArrayList();
    }

    public ly0(File file) {
        this.f47745a = 5;
        this.f47746b = file;
        this.f47747c = new File(file.getPath() + ".new");
        this.d = new File(file.getPath() + ".bak");
    }

    public ly0(f3.r rVar) {
        this.f47745a = 26;
        this.f47746b = rVar;
    }

    public ly0(Runnable runnable) {
        this.f47745a = 11;
        this.f47747c = new CopyOnWriteArrayList();
        this.d = new HashMap();
        this.f47746b = runnable;
    }

    public ly0(byte[] bArr, m9.y yVar) {
        this.f47745a = 3;
        this.f47746b = bArr;
        this.f47747c = null;
        this.d = yVar;
    }

    public ly0(e2.o0 o0Var, m9.y yVar) {
        this.f47745a = 3;
        this.f47746b = o0Var.f10440k;
        this.f47747c = o0Var.f10443n;
        this.d = yVar;
    }

    public ly0(org.telegram.ui.Components.qt qtVar) {
        this.f47745a = 12;
        this.f47745a = 12;
        this.f47746b = qtVar;
        this.f47747c = Choreographer.getInstance();
        this.d = new org.telegram.ui.Components.xy0(this, 1);
    }

    public ly0(String str, String str2) {
        this.f47745a = 21;
        this.f47746b = str;
        this.f47747c = str2;
        this.d = str2.isEmpty() ? str : a8.p0.D(str, "/", str2);
    }

    public ly0(s4.e eVar, android.support.v4.media.session.a0 a0Var) {
        this.f47745a = 14;
        this.d = eVar;
        this.f47746b = a0Var;
    }

    public ly0(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.f47745a = 13;
        this.f47747c = arrayDeque;
        this.f47746b = bufferedReader;
    }
}
