package org.telegram.ui.Components;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
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
public class i61 implements hi.l7, org.telegram.ui.ky0, t0.h, q5.b, oa.a {
    public final int f35957a;
    public Object f35958b;
    public Object f35959c;
    public Object d;

    public i61(int i7, boolean z10) {
        this.f35957a = i7;
    }

    public static void M(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (!file.renameTo(file2)) {
            Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
        }
    }

    public static q2.e s(e2.d0 d0Var) {
        String uri;
        boolean z10;
        boolean z11;
        j2.o oVar = new j2.o();
        byte[] bArr = null;
        oVar.f17293c = null;
        Uri uri2 = d0Var.f10353b;
        if (uri2 == null) {
            uri = null;
        } else {
            uri = uri2.toString();
        }
        boolean z12 = d0Var.f10356f;
        ?? obj = new Object();
        if (z12 && TextUtils.isEmpty(uri)) {
            z10 = false;
        } else {
            z10 = true;
        }
        a8.ma.f(z10);
        obj.f988b = oVar;
        obj.f989c = uri;
        obj.f987a = z12;
        obj.d = new HashMap();
        h9.l0 l0Var = d0Var.f10354c;
        h9.t0 t0Var = l0Var.f14008a;
        if (t0Var == null) {
            t0Var = l0Var.c();
            l0Var.f14008a = t0Var;
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
        int i7 = e2.l.f10482a;
        qb.a aVar = new qb.a(4);
        UUID uuid = d0Var.f10352a;
        uuid.getClass();
        boolean z13 = d0Var.d;
        boolean z14 = d0Var.f10355e;
        int[] f10 = c8.l1.f(d0Var.f10357g);
        for (int i10 : f10) {
            if (i10 != 2 && i10 != 1) {
                z11 = false;
            } else {
                z11 = true;
            }
            a8.ma.f(z11);
        }
        q2.e eVar = new q2.e(uuid, obj, hashMap, z13, (int[]) f10.clone(), z14, aVar);
        byte[] bArr2 = d0Var.h;
        if (bArr2 != null) {
            bArr = Arrays.copyOf(bArr2, bArr2.length);
        }
        a8.ma.p(eVar.f55874x.isEmpty());
        eVar.L = bArr;
        return eVar;
    }

    public long A() {
        f3.l lVar = (f3.l) this.d;
        if (lVar != null) {
            return lVar.d;
        }
        return -1L;
    }

    public ByteBuffer B() {
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
        return (ByteBuffer) this.f35959c;
    }

    public int C(int i7) {
        a8.va vaVar = (a8.va) this.f35959c;
        if (i7 < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) ((v4.b) this.f35958b).f59186b).getChildCount();
        int i10 = i7;
        while (i10 < childCount) {
            int B = i7 - (i10 - vaVar.B(i10));
            if (B == 0) {
                while (vaVar.E(i10)) {
                    i10++;
                }
                return i10;
            }
            i10 += B;
        }
        return -1;
    }

    public Paint D(float f10, int i7) {
        Paint[] paintArr = (Paint[]) this.f35958b;
        if (paintArr[i7] == null) {
            Paint paint = new Paint(1);
            paintArr[i7] = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        paintArr[i7].setShader(null);
        paintArr[i7].setColor(-65536);
        paintArr[i7].setAlpha((int) (f10 * 255.0f));
        return paintArr[i7];
    }

    public View E(int i7) {
        return ((RecyclerView) ((v4.b) this.f35958b).f59186b).getChildAt(i7);
    }

    public int F() {
        return ((RecyclerView) ((v4.b) this.f35958b).f59186b).getChildCount();
    }

    public boolean G() {
        String trim;
        ArrayDeque arrayDeque = (ArrayDeque) this.f35959c;
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
            String readLine = ((BufferedReader) this.f35958b).readLine();
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

    public void H(View view) {
        ((ArrayList) this.d).add(view);
        v4.b bVar = (v4.b) this.f35958b;
        v4.f1 U = RecyclerView.U(view);
        if (U != null) {
            View view2 = U.f59245a;
            RecyclerView recyclerView = (RecyclerView) bVar.f59186b;
            int i7 = U.f59261s;
            if (i7 != -1) {
                U.f59260r = i7;
            } else {
                WeakHashMap weakHashMap = r0.i0.f56367a;
                U.f59260r = view2.getImportantForAccessibility();
            }
            if (recyclerView.c0()) {
                U.f59261s = 4;
                recyclerView.L0.add(U);
                return;
            }
            WeakHashMap weakHashMap2 = r0.i0.f56367a;
            view2.setImportantForAccessibility(4);
        }
    }

    public void I(j2.h r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, x2.w0 r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i61.I(j2.h, android.net.Uri, java.util.Map, long, long, x2.w0):void");
    }

    public String J() {
        if (G()) {
            String str = (String) this.d;
            this.d = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    public void K() {
        int i7;
        RecyclerView recyclerView = (RecyclerView) ((v4.b) this.f35958b).f59186b;
        ((a8.va) this.f35959c).H();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            v4.f1 U = RecyclerView.U((View) arrayList.get(size));
            if (U != null) {
                int i10 = U.f59260r;
                if (recyclerView.c0()) {
                    U.f59261s = i10;
                    recyclerView.L0.add(U);
                } else {
                    View view = U.f59245a;
                    WeakHashMap weakHashMap = r0.i0.f56367a;
                    view.setImportantForAccessibility(i10);
                }
                U.f59260r = 0;
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

    public void L(wf.f fVar) {
        if (((wf.d) this.f35958b) != null) {
            for (int i7 = 0; i7 < fVar.f59818a.size(); i7++) {
                wf.d dVar = (wf.d) this.f35958b;
                dVar.h.remove(fVar.g(i7).d);
                dVar.h();
            }
        }
    }

    public void N(o5.i iVar, int i7, boolean z10) {
        Long l10;
        char c10;
        u5.a aVar = (u5.a) this.d;
        Context context = (Context) this.f35958b;
        ComponentName componentName = new ComponentName(context, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = iVar.f21804a;
        String str2 = iVar.f21804a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        l5.d dVar = iVar.f21806c;
        adler32.update(allocate.putInt(y5.a.a(dVar)).array());
        byte[] bArr = iVar.f21805b;
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
                        c8.hc.a(iVar, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((v5.g) ((v5.d) this.f35959c)).a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str2, String.valueOf(y5.a.a(dVar))});
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
            Set set = ((u5.b) aVar.f58544b.get(dVar)).f58547c;
            if (set.contains(u5.c.f58548a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(u5.c.f58550c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(u5.c.f58549b)) {
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
            String c11 = c8.hc.c("JobInfoScheduler");
            if (Log.isLoggable(c11, 3)) {
                Log.d(c11, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th2) {
            rawQuery.close();
            throw th2;
        }
    }

    public void O(wf.a aVar) {
        wf.f fVar;
        wf.f fVar2 = (wf.f) this.f35959c;
        if (fVar2 != null && ((wf.a) this.d) == null && aVar != null) {
            l(fVar2);
        }
        if (((wf.a) this.d) != null && (fVar = (wf.f) this.f35959c) != null && aVar == null) {
            L(fVar);
        }
        wf.a aVar2 = (wf.a) this.d;
        if (aVar2 != null) {
            h6.h hVar = aVar2.f59793a;
            q6.m.e("Must be called from the main thread.");
            hVar.f13920i.remove(aVar2);
        }
        if (aVar != null) {
            aVar.f59793a.p(aVar);
            wf.f fVar3 = (wf.f) this.f35959c;
            if (fVar3 != null) {
                aVar.d = fVar3;
                aVar.f59798g = 0;
                aVar.h = 0;
                aVar.p();
            }
        }
        this.d = aVar;
    }

    public FileOutputStream P() {
        File file = (File) this.f35959c;
        File file2 = (File) this.d;
        if (file2.exists()) {
            M(file2, (File) this.f35958b);
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

    public void Q(View view) {
        if (((ArrayList) this.d).remove(view)) {
            v4.b bVar = (v4.b) this.f35958b;
            v4.f1 U = RecyclerView.U(view);
            if (U != null) {
                RecyclerView recyclerView = (RecyclerView) bVar.f59186b;
                int i7 = U.f59260r;
                if (recyclerView.c0()) {
                    U.f59261s = i7;
                    recyclerView.L0.add(U);
                } else {
                    View view2 = U.f59245a;
                    WeakHashMap weakHashMap = r0.i0.f56367a;
                    view2.setImportantForAccessibility(i7);
                }
                U.f59260r = 0;
            }
        }
    }

    public void R(Object obj, String str) {
        i61 i61Var = new i61(11, false);
        ((i61) this.d).d = i61Var;
        this.d = i61Var;
        i61Var.f35959c = obj;
        i61Var.f35958b = str;
    }

    @Override
    public void a() {
        org.telegram.messenger.w10 w10Var;
        boolean[] zArr = (boolean[]) this.f35958b;
        if (!zArr[0] && (w10Var = (org.telegram.messenger.w10) this.f35959c) != null) {
            zArr[0] = true;
            w10Var.a(Boolean.TRUE);
        }
        org.telegram.messenger.g0.h3(new org.telegram.ui.qu0((kc) this.d, 9), 200L);
    }

    @Override
    public Uri b() {
        return (Uri) this.f35958b;
    }

    @Override
    public oa.a c(Class cls, na.d dVar) {
        ((HashMap) this.f35958b).put(cls, dVar);
        ((HashMap) this.f35959c).remove(cls);
        return this;
    }

    @Override
    public Uri f() {
        return (Uri) this.d;
    }

    @Override
    public void g(ArrayList arrayList) {
        j61 j61Var = (j61) this.d;
        if (j61Var.f36309b == ((hi.r7) this.f35959c)) {
            j61Var.f36313g = arrayList;
        }
    }

    @Override
    public Object mo23get() {
        return new i61((Context) ((fd.a) this.f35958b).mo23get(), (v5.d) ((fd.a) this.f35959c).mo23get(), (u5.a) ((pb.b) this.d).mo23get(), 22);
    }

    @Override
    public ClipDescription getDescription() {
        return (ClipDescription) this.f35959c;
    }

    @Override
    public Object h() {
        return null;
    }

    @Override
    public void j(long j3, long j10, boolean z10) {
        ((m.o3) this.f35958b).f(j3, j10, z10);
    }

    public void l(wf.f fVar) {
        if (((wf.d) this.f35958b) == null) {
            this.f35958b = new wf.d();
        }
        for (int i7 = 0; i7 < fVar.f59818a.size(); i7++) {
            wf.d dVar = (wf.d) this.f35958b;
            wf.e g10 = fVar.g(i7);
            dVar.h.put(g10.d, g10);
            dVar.h();
        }
    }

    public void m(int i7, View view, boolean z10) {
        int C;
        RecyclerView recyclerView = (RecyclerView) ((v4.b) this.f35958b).f59186b;
        if (i7 < 0) {
            C = recyclerView.getChildCount();
        } else {
            C = C(i7);
        }
        ((a8.va) this.f35959c).F(C, z10);
        if (z10) {
            H(view);
        }
        recyclerView.addView(view, C);
        v4.f1 U = RecyclerView.U(view);
        recyclerView.g0(view);
        v4.i0 i0Var = recyclerView.f2791x;
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

    public void n(View view, int i7, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int C;
        RecyclerView recyclerView = (RecyclerView) ((v4.b) this.f35958b).f59186b;
        if (i7 < 0) {
            C = recyclerView.getChildCount();
        } else {
            C = C(i7);
        }
        ((a8.va) this.f35959c).F(C, z10);
        if (z10) {
            H(view);
        }
        v4.f1 U = RecyclerView.U(view);
        if (U != null) {
            if (!U.l() && !U.r()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + U + recyclerView.C());
            }
            U.f59254l &= -257;
        }
        recyclerView.attachViewToParent(view, C, layoutParams);
    }

    public String o(int i7, long j3, long j10, String str) {
        ArrayList arrayList = (ArrayList) this.f35958b;
        ArrayList arrayList2 = (ArrayList) this.d;
        ArrayList arrayList3 = (ArrayList) this.f35959c;
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

    @Override
    public void p() {
        j61 j61Var = (j61) this.d;
        if (j61Var.f36309b != ((hi.r7) this.f35959c)) {
            return;
        }
        j61Var.c();
        j61Var.f36308a.i();
    }

    public void q() {
        android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) this.f35958b;
        if (a0Var != null) {
            int i7 = ((s4.e) this.d).f57064n.d;
            android.support.v4.media.session.u uVar = (android.support.v4.media.session.u) a0Var.f1676b;
            uVar.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i7);
            uVar.f1706a.setPlaybackToLocal(builder.build());
            this.f35959c = null;
        }
    }

    public void r(Canvas canvas, RectF rectF, float f10) {
        Paint[] paintArr = (Paint[]) this.f35958b;
        if (paintArr[0] == null) {
            Paint paint = new Paint(1);
            paintArr[0] = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        paintArr[0].setShader((LinearGradient) this.f35959c);
        paintArr[0].setAlpha((int) (f10 * 255.0f));
        canvas.drawRect(rectF, paintArr[0]);
    }

    public void t(int i7) {
        v4.f1 U;
        int C = C(i7);
        ((a8.va) this.f35959c).G(C);
        RecyclerView recyclerView = (RecyclerView) ((v4.b) this.f35958b).f59186b;
        View childAt = recyclerView.getChildAt(C);
        if (childAt != null && (U = RecyclerView.U(childAt)) != null) {
            if (U.l() && !U.r()) {
                throw new IllegalArgumentException("called detach on an already detached child " + U + recyclerView.C());
            }
            U.a(256);
        }
        recyclerView.detachViewFromParent(C);
    }

    public String toString() {
        switch (this.f35957a) {
            case 12:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f35958b);
                sb2.append('{');
                i61 i61Var = (i61) ((i61) this.f35959c).d;
                String str = "";
                while (i61Var != null) {
                    Object obj = i61Var.f35959c;
                    sb2.append(str);
                    String str2 = (String) i61Var.f35958b;
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
                    i61Var = (i61) i61Var.d;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 21:
                StringBuilder sb3 = new StringBuilder("id3v2tag[pos=");
                uf.a aVar = (uf.a) this.f35958b;
                sb3.append(aVar.f912b);
                sb3.append(", ");
                sb3.append(aVar.e());
                sb3.append(" left]");
                return sb3.toString();
            case 24:
                return ((a8.va) this.f35959c).toString() + ", hidden list:" + ((ArrayList) this.d).size();
            default:
                return super.toString();
        }
    }

    public void u(Canvas canvas, RectF rectF, int i7, float f10) {
        Paint[] paintArr = (Paint[]) this.f35958b;
        Matrix matrix = (Matrix) this.d;
        if (f10 <= 0.0f) {
            return;
        }
        if (((LinearGradient) this.f35959c) == null) {
            this.f35959c = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-65536, 16711680}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        }
        if (paintArr[i7] == null) {
            paintArr[i7] = new Paint(1);
            paintArr[i7].setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        paintArr[i7].setShader((LinearGradient) this.f35959c);
        matrix.reset();
        if (i7 == 0) {
            matrix.postScale(1.0f, rectF.width() / 16.0f);
            matrix.postRotate(-90.0f);
            matrix.postTranslate(rectF.left, rectF.top);
        } else if (i7 == 1) {
            matrix.postScale(1.0f, rectF.height() / 16.0f);
            matrix.postTranslate(rectF.left, rectF.top);
        } else if (i7 == 2) {
            matrix.postScale(1.0f, rectF.width() / 16.0f);
            matrix.postRotate(90.0f);
            matrix.postTranslate(rectF.right, rectF.top);
        } else if (i7 == 3) {
            matrix.postScale(1.0f, rectF.height() / 16.0f);
            matrix.postScale(1.0f, -1.0f);
            matrix.postTranslate(rectF.left, rectF.bottom);
        }
        ((LinearGradient) this.f35959c).setLocalMatrix(matrix);
        paintArr[i7].setAlpha((int) (255.0f * f10));
        canvas.drawRect(rectF, paintArr[i7]);
    }

    public void v(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.f35958b;
        qa.e eVar = new qa.e(byteArrayOutputStream, hashMap, (HashMap) this.f35959c, (na.d) this.d);
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

    public tf.e w(tf.f fVar) {
        InflaterInputStream inflaterInputStream;
        int i7 = fVar.f57824c;
        InputStream inputStream = (uf.a) this.f35958b;
        if (fVar.d) {
            nd0 nd0Var = (nd0) this.d;
            nd0Var.getClass();
            byte[] bArr = new byte[i7];
            int i10 = 0;
            while (i10 < i7) {
                int read = ((ab.d) nd0Var.f37766b).read(bArr, i10, i7 - i10);
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
        if (!fVar.f57826f) {
            if (fVar.f57825e) {
                i7 = fVar.f57827g;
                inflaterInputStream = new InflaterInputStream(inputStream);
            } else {
                inflaterInputStream = inputStream;
            }
            return new tf.e(inflaterInputStream, fVar.f57823b, i7, (tf.h) this.f35959c, fVar);
        }
        throw new Exception("Frame encryption is not supported");
    }

    public q2.m x(e2.l0 l0Var) {
        q2.e eVar;
        l0Var.f10494b.getClass();
        e2.d0 d0Var = l0Var.f10494b.f10405c;
        if (d0Var == null) {
            return q2.m.A;
        }
        synchronized (this.f35958b) {
            try {
                if (!d0Var.equals((e2.d0) this.f35959c)) {
                    this.f35959c = d0Var;
                    this.d = s(d0Var);
                }
                eVar = (q2.e) this.d;
                eVar.getClass();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    public View y(int i7) {
        return ((RecyclerView) ((v4.b) this.f35958b).f59186b).getChildAt(C(i7));
    }

    public int z() {
        return ((RecyclerView) ((v4.b) this.f35958b).f59186b).getChildCount() - ((ArrayList) this.d).size();
    }

    public i61(Object obj, Object obj2, Object obj3, int i7) {
        this.f35957a = i7;
        this.f35958b = obj;
        this.f35959c = obj2;
        this.d = obj3;
    }

    public i61(String str) {
        this.f35957a = 12;
        i61 i61Var = new i61(11, false);
        this.f35959c = i61Var;
        this.d = i61Var;
        this.f35958b = str;
    }

    public i61(int i7) {
        this.f35957a = i7;
        switch (i7) {
            case 9:
                this.f35958b = new Object();
                return;
            case 20:
                this.f35958b = new Object();
                this.f35959c = null;
                this.d = null;
                return;
            case 28:
                this.f35958b = new HashMap();
                this.f35959c = new HashMap();
                this.d = y7.i.f60958c;
                return;
            default:
                this.f35958b = new Paint[4];
                this.d = new Matrix();
                return;
        }
    }

    public i61(InputStream inputStream, long j3, int i7, tf.h hVar) {
        this.f35957a = 21;
        uf.a aVar = new uf.a(inputStream, j3, i7);
        this.f35958b = aVar;
        this.d = new nd0(aVar, 16);
        this.f35959c = hVar;
    }

    public i61(String str, Boolean bool, uc.a aVar, String str2) {
        this.f35957a = 23;
        this.f35958b = str;
        this.f35959c = str2;
        this.d = aVar;
    }

    public i61(v4.b bVar) {
        this.f35957a = 24;
        this.f35958b = bVar;
        this.f35959c = new a8.va(8);
        this.d = new ArrayList();
    }

    @Override
    public void d() {
    }

    @Override
    public void e() {
    }

    @Override
    public void i() {
    }

    @Override
    public void k() {
    }

    public i61(File file) {
        this.f35957a = 8;
        this.f35958b = file;
        this.f35959c = new File(file.getPath() + ".new");
        this.d = new File(file.getPath() + ".bak");
    }

    public i61(f3.r rVar) {
        this.f35957a = 26;
        this.f35958b = rVar;
    }

    public i61(Runnable runnable) {
        this.f35957a = 14;
        this.f35959c = new CopyOnWriteArrayList();
        this.d = new HashMap();
        this.f35958b = runnable;
    }

    public i61(byte[] bArr, m9.y yVar) {
        this.f35957a = 6;
        this.f35958b = bArr;
        this.f35959c = null;
        this.d = yVar;
    }

    public i61(e2.o0 o0Var, m9.y yVar) {
        this.f35957a = 6;
        this.f35958b = o0Var.f10579k;
        this.f35959c = o0Var.f10582n;
        this.d = yVar;
    }

    public i61(j61 j61Var, m.o3 o3Var, hi.r7 r7Var) {
        this.f35957a = 0;
        this.d = j61Var;
        this.f35958b = o3Var;
        this.f35959c = r7Var;
    }

    public i61(org.telegram.ui.Cells.aa aaVar) {
        this.f35957a = 15;
        this.f35957a = 15;
        this.f35958b = aaVar;
        this.f35959c = Choreographer.getInstance();
        this.d = new hz0(this, 1);
    }

    public i61(String str, String str2) {
        this.f35957a = 27;
        this.f35958b = str;
        this.f35959c = str2;
        this.d = str2.isEmpty() ? str : a8.p0.E(str, "/", str2);
    }

    public i61(s4.e eVar, android.support.v4.media.session.a0 a0Var) {
        this.f35957a = 17;
        this.d = eVar;
        this.f35958b = a0Var;
    }

    public i61(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.f35957a = 16;
        this.f35959c = arrayDeque;
        this.f35958b = bufferedReader;
    }
}
