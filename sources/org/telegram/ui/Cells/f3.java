package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Trace;
import android.text.Editable;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.widget.EditText;
import ci.sc;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.f71;
import org.telegram.ui.Components.jc0;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.q71;
import org.telegram.ui.Components.sf0;
import org.telegram.ui.Components.t71;
import org.telegram.ui.Components.zt;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.rx0;
import org.telegram.ui.sw;
import org.telegram.ui.ty;
import org.telegram.ui.uy;
import org.telegram.ui.x41;
public final class f3 implements zt, sc, ml0, fh.a, q71, p2.s, r2.k, y2.o, SuccessContinuation {
    public final int f20268a;
    public Object f20269b;
    public Object f20270c;

    public f3(int i10) {
        this.f20268a = i10;
    }

    public static org.telegram.ui.Cells.f3 a(android.content.Context r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.f3.a(android.content.Context):org.telegram.ui.Cells.f3");
    }

    public static f3 h(View view) {
        return new f3(view);
    }

    public void B(s4.c1 c1Var) {
        s4.i1 i1Var = (s4.i1) ((a0.f) this.f20269b).get(c1Var);
        if (i1Var == null) {
            return;
        }
        i1Var.f43028a &= -2;
    }

    @Override
    public y2.o D() {
        return new f3(((p2.s) this.f20269b).D(), (List) this.f20270c, false, 14);
    }

    public void E(s4.c1 c1Var) {
        a0.f fVar = (a0.f) this.f20269b;
        a0.i iVar = (a0.i) this.f20270c;
        int m10 = iVar.m() - 1;
        while (true) {
            if (m10 < 0) {
                break;
            } else if (c1Var == iVar.n(m10)) {
                Object[] objArr = iVar.f19c;
                Object obj = objArr[m10];
                Object obj2 = a0.j.f20a;
                if (obj != obj2) {
                    objArr[m10] = obj2;
                    iVar.f17a = true;
                }
            } else {
                m10--;
            }
        }
        s4.i1 i1Var = (s4.i1) fVar.get(c1Var);
        if (i1Var != null) {
            fVar.remove(c1Var);
            i1Var.f43028a = 0;
            i1Var.f43029b = null;
            i1Var.f43030c = null;
            s4.i1.d.i(i1Var);
        }
    }

    @Override
    public void F(float f7, boolean z10) {
        jc0 jc0Var = (jc0) this.f20269b;
        sf0 sf0Var = (sf0) this.f20270c;
        t71 t71Var = sf0Var.d;
        if (t71Var != null) {
            long p5 = t71Var.p();
            float max = 2.8f / ((float) Math.max(60L, p5));
            long j3 = (((f7 / (1.0f - max)) * max) + f7) * ((float) p5);
            sf0Var.e = j3;
            sf0Var.d.L(j3, !z10);
            if (!z10) {
                AndroidUtilities.cancelRunOnUIThread(jc0Var);
                AndroidUtilities.runOnUIThread(jc0Var, 120L);
            }
        }
    }

    @Override
    public y2.o K(p2.o oVar, p2.l lVar) {
        return new f3(((p2.s) this.f20269b).K(oVar, lVar), (List) this.f20270c, false, 14);
    }

    @Override
    public boolean mo18c(float f7, float f10, int i10, View view) {
        uy uyVar = (uy) this.f20270c;
        if (view instanceof s2) {
            s2 s2Var = (s2) view;
            if (s2Var.f20988n2) {
                uyVar.N4(s2Var.getDialogId(), view);
                return true;
            }
        }
        sw swVar = uyVar.f38360z0;
        if (swVar != null && swVar.getVisibility() == 0 && uyVar.f38360z0.f25586n) {
            return false;
        }
        return uyVar.o4(view, i10, f7, ((ty) this.f20269b).d);
    }

    @Override
    public ch.d d() {
        return new ch.f(this);
    }

    public void f(s4.c1 c1Var, b2.q0 q0Var) {
        a0.f fVar = (a0.f) this.f20269b;
        s4.i1 i1Var = (s4.i1) fVar.get(c1Var);
        if (i1Var == null) {
            i1Var = s4.i1.a();
            fVar.put(c1Var, i1Var);
        }
        i1Var.f43030c = q0Var;
        i1Var.f43028a |= 8;
    }

    @Override
    public void g() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((uy) this.f20270c).finishPreviewFragment();
        }
    }

    @Override
    public void j() {
        ((bu) this.f20269b).getText();
        ((h3) this.f20270c).b();
    }

    public void k() {
        String str = (String) this.f20269b;
        try {
            ba.c cVar = (ba.c) this.f20270c;
            cVar.getClass();
            new File(cVar.f3452b, str).createNewFile();
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e);
        }
    }

    @Override
    public r2.c v(com.google.firebase.messaging.n nVar) {
        MediaCodec mediaCodec;
        int i10;
        String str = ((r2.o) nVar.f7330a).f42262a;
        r2.c cVar = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                r2.c cVar2 = new r2.c(mediaCodec, (HandlerThread) ((r2.b) this.f20269b).get(), new r2.e(mediaCodec, (HandlerThread) ((r2.b) this.f20270c).get()), (r2.j) nVar.f7333f);
                try {
                    Trace.endSection();
                    Surface surface = (Surface) nVar.d;
                    if (surface == null && ((r2.o) nVar.f7330a).h && Build.VERSION.SDK_INT >= 35) {
                        i10 = 8;
                    } else {
                        i10 = 0;
                    }
                    r2.c.l(cVar2, (MediaFormat) nVar.f7331b, surface, (MediaCrypto) nVar.e, i10);
                    return cVar2;
                } catch (Exception e) {
                    e = e;
                    cVar = cVar2;
                    if (cVar == null) {
                        if (mediaCodec != null) {
                            mediaCodec.release();
                        }
                    } else {
                        cVar.release();
                    }
                    throw e;
                }
            } catch (Exception e7) {
                e = e7;
            }
        } catch (Exception e10) {
            e = e10;
            mediaCodec = null;
        }
    }

    @Override
    public Object n2(Uri uri, g2.k kVar) {
        t2.a aVar = (t2.a) ((y2.o) this.f20269b).n2(uri, kVar);
        List list = (List) this.f20270c;
        if (list != null && !list.isEmpty()) {
            return (t2.a) aVar.a(list);
        }
        return aVar;
    }

    public void o(String str, PrintWriter printWriter) {
        boolean z10;
        w1.b bVar = (w1.b) this.f20270c;
        if (bVar.d.f33c > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            int i10 = 0;
            while (true) {
                a0.n nVar = bVar.d;
                if (i10 < nVar.f33c) {
                    w1.a aVar = (w1.a) nVar.f32b[i10];
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(bVar.d.f31a[i10]);
                    printWriter.print(": ");
                    printWriter.println(aVar.toString());
                    printWriter.print(str2);
                    printWriter.print("mId=");
                    printWriter.print(0);
                    printWriter.print(" mArgs=");
                    Object obj = null;
                    printWriter.println((Object) null);
                    printWriter.print(str2);
                    printWriter.print("mLoader=");
                    printWriter.println(aVar.f44768l);
                    a6.d dVar = aVar.f44768l;
                    String str3 = str2 + "  ";
                    dVar.getClass();
                    printWriter.print(str3);
                    printWriter.print("mId=");
                    printWriter.print(0);
                    printWriter.print(" mListener=");
                    printWriter.println(dVar.f290a);
                    if (dVar.f291b || dVar.e) {
                        printWriter.print(str3);
                        printWriter.print("mStarted=");
                        printWriter.print(dVar.f291b);
                        printWriter.print(" mContentChanged=");
                        printWriter.print(dVar.e);
                        printWriter.print(" mProcessingChange=");
                        printWriter.println(false);
                    }
                    if (dVar.f292c || dVar.d) {
                        printWriter.print(str3);
                        printWriter.print("mAbandoned=");
                        printWriter.print(dVar.f292c);
                        printWriter.print(" mReset=");
                        printWriter.println(dVar.d);
                    }
                    if (dVar.f294g != null) {
                        printWriter.print(str3);
                        printWriter.print("mTask=");
                        printWriter.print(dVar.f294g);
                        printWriter.print(" waiting=");
                        dVar.f294g.getClass();
                        printWriter.println(false);
                    }
                    if (dVar.h != null) {
                        printWriter.print(str3);
                        printWriter.print("mCancellingTask=");
                        printWriter.print(dVar.h);
                        printWriter.print(" waiting=");
                        dVar.h.getClass();
                        printWriter.println(false);
                    }
                    if (aVar.f44770n != null) {
                        printWriter.print(str2);
                        printWriter.print("mCallbacks=");
                        printWriter.println(aVar.f44770n);
                        b2.p pVar = aVar.f44770n;
                        pVar.getClass();
                        printWriter.print(str2 + "  ");
                        printWriter.print("mDeliveredData=");
                        printWriter.println(pVar.f3176b);
                    }
                    printWriter.print(str2);
                    printWriter.print("mData=");
                    a6.d dVar2 = aVar.f44768l;
                    Object obj2 = aVar.e;
                    if (obj2 != androidx.lifecycle.z.f2616k) {
                        obj = obj2;
                    }
                    dVar2.getClass();
                    StringBuilder sb2 = new StringBuilder(64);
                    if (obj == null) {
                        sb2.append("null");
                    } else {
                        Class<?> cls = obj.getClass();
                        sb2.append(cls.getSimpleName());
                        sb2.append("{");
                        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
                        sb2.append("}");
                    }
                    printWriter.println(sb2.toString());
                    printWriter.print(str2);
                    printWriter.print("mStarted=");
                    if (aVar.f2619c > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    printWriter.println(z10);
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    @Override
    public void onError(t71 t71Var, Exception exc) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f20270c;
        int i10 = secretMediaViewer.f31724b0;
        if (i10 > 0) {
            secretMediaViewer.f31724b0 = i10 - 1;
            AndroidUtilities.runOnUIThread(new rx0(28, this, (File) this.f20269b), 100L);
            return;
        }
        FileLog.e(exc);
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f20270c;
        x41 x41Var = secretMediaViewer.f31741i1;
        if (secretMediaViewer.f31774y != null && secretMediaViewer.f31738h0 != null) {
            AndroidUtilities.cancelRunOnUIThread(x41Var);
            AndroidUtilities.runOnUIThread(x41Var);
            if (i10 != 4 && i10 != 1) {
                try {
                    secretMediaViewer.f31723b.getWindow().addFlags(128);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } else {
                try {
                    secretMediaViewer.f31723b.getWindow().clearFlags(128);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
            if (i10 == 3 && secretMediaViewer.f31769w.getVisibility() != 0) {
                secretMediaViewer.f31769w.setVisibility(0);
            }
            if (secretMediaViewer.f31774y.y() && i10 != 4) {
                if (!secretMediaViewer.E) {
                    secretMediaViewer.E = true;
                }
            } else if (secretMediaViewer.E) {
                secretMediaViewer.E = false;
                if (i10 == 4) {
                    secretMediaViewer.H = true;
                    if (secretMediaViewer.I) {
                        secretMediaViewer.e(true, !secretMediaViewer.f31756q1);
                        return;
                    }
                    secretMediaViewer.f31774y.L(0L, false);
                    secretMediaViewer.f31774y.C();
                }
            }
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        float f10;
        org.telegram.ui.k4 k4Var = ((SecretMediaViewer) this.f20270c).f31769w;
        if (k4Var != null) {
            if (i11 == 0) {
                f10 = 1.0f;
            } else {
                f10 = (i10 * f7) / i11;
            }
            k4Var.a(f10, 0);
        }
    }

    public File p() {
        if (((File) this.f20269b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f20269b) == null) {
                        k9.h hVar = (k9.h) this.f20270c;
                        hVar.a();
                        File filesDir = hVar.f13548a.getFilesDir();
                        this.f20269b = new File(filesDir, "PersistedInstallation." + ((k9.h) this.f20270c).d() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.f20269b;
    }

    @Override
    public void q(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((uy) this.f20270c).movePreviewFragment(f7);
        }
    }

    public void s(ra.b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", bVar.f42480a);
            jSONObject.put("Status", m1.j.c(bVar.f42481b));
            jSONObject.put("AuthToken", bVar.f42482c);
            jSONObject.put("RefreshToken", bVar.d);
            jSONObject.put("TokenCreationEpochInSecs", bVar.f42483f);
            jSONObject.put("ExpiresInSecs", bVar.e);
            jSONObject.put("FisError", bVar.f42484g);
            k9.h hVar = (k9.h) this.f20270c;
            hVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", hVar.f13548a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!createTempFile.renameTo(p())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public b2.q0 t(s4.c1 c1Var, int i10) {
        s4.i1 i1Var;
        b2.q0 q0Var;
        a0.f fVar = (a0.f) this.f20269b;
        int c10 = fVar.c(c1Var);
        if (c10 >= 0 && (i1Var = (s4.i1) fVar.h(c10)) != null) {
            int i11 = i1Var.f43028a;
            if ((i11 & i10) != 0) {
                int i12 = i11 & (~i10);
                i1Var.f43028a = i12;
                if (i10 == 4) {
                    q0Var = i1Var.f43029b;
                } else if (i10 == 8) {
                    q0Var = i1Var.f43030c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i12 & 12) == 0) {
                    fVar.f(c10);
                    i1Var.f43028a = 0;
                    i1Var.f43029b = null;
                    i1Var.f43030c = null;
                    s4.i1.d.i(i1Var);
                }
                return q0Var;
            }
        }
        return null;
    }

    @Override
    public Task then(Object obj) {
        da.a aVar = (da.a) obj;
        u4.g gVar = (u4.g) this.f20270c;
        if (aVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return Tasks.forResult(null);
        }
        m5.e eVar = (m5.e) gVar.f43922c;
        w9.m.b((w9.m) ((m5.e) gVar.f43922c).f14954c);
        ((w9.m) eVar.f14954c).f45243m.y((Executor) this.f20269b, null);
        ((w9.m) eVar.f14954c).f45247q.trySetResult(null);
        return Tasks.forResult(null);
    }

    public String toString() {
        switch (this.f20268a) {
            case 18:
                StringBuilder sb2 = new StringBuilder(128);
                sb2.append("LoaderManager{");
                sb2.append(Integer.toHexString(System.identityHashCode(this)));
                sb2.append(" in ");
                Class<?> cls = ((androidx.lifecycle.t) this.f20269b).getClass();
                sb2.append(cls.getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(cls)));
                sb2.append("}}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public ra.b x() {
        JSONObject jSONObject;
        String str;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(p());
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read < 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int i10 = m1.j.d(5)[optInt];
        if (i10 != 0) {
            if (i10 == 0) {
                str = " registrationStatus";
            } else {
                str = "";
            }
            if (str.isEmpty()) {
                return new ra.b(optString, i10, optString2, optString3, optLong2, optLong, optString4);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
        throw new NullPointerException("Null registrationStatus");
    }

    @Override
    public void y(Canvas canvas, float f7, float f10, float f11, float f12) {
        Paint paint = (Paint) this.f20269b;
        PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f20270c;
        rg.z0 z0Var = premiumPreviewFragment.m0;
        if (premiumPreviewFragment.f31450h0) {
            paint.setColor(premiumPreviewFragment.getThemedColor(org.telegram.ui.ActionBar.j6.f19038a7));
            canvas.drawRect(f7, f10, f11, f12, paint);
            return;
        }
        z0Var.d(0, (-premiumPreviewFragment.f31445d0.getMeasuredWidth()) * 0.1f * premiumPreviewFragment.f31442b0, 0, premiumPreviewFragment.f31445d0.getMeasuredWidth(), 0.0f, premiumPreviewFragment.f31445d0.getMeasuredHeight());
        canvas.drawRect(f7, f10, f11, f12, z0Var.f42854f);
    }

    public void z() {
        try {
            ((FileLock) this.f20270c).release();
            ((FileChannel) this.f20269b).close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }

    public f3(int i10, Object obj, Object obj2) {
        this.f20268a = i10;
        this.f20270c = obj;
        this.f20269b = obj2;
    }

    @Override
    public void onRenderedFirstFrame() {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f20270c;
        if (secretMediaViewer.f31727c0) {
            return;
        }
        secretMediaViewer.f31727c0 = true;
        secretMediaViewer.e.invalidate();
    }

    public f3(Object obj, Object obj2, boolean z10, int i10) {
        this.f20268a = i10;
        this.f20269b = obj;
        this.f20270c = obj2;
    }

    public f3(v7.s1 s1Var) {
        this.f20268a = 19;
        this.f20270c = new Object();
        this.f20269b = s1Var;
        w7.pa.b();
    }

    public f3(Context context) {
        this.f20268a = 15;
        this.f20269b = context;
        this.f20270c = null;
    }

    public f3() {
        this.f20268a = 13;
        this.f20269b = new a0.m(0);
        this.f20270c = new a0.i();
    }

    public f3(View view) {
        this.f20268a = 2;
        f71 f71Var = new f71(this, view);
        this.f20269b = f71Var;
        view.addOnLayoutChangeListener(f71Var);
    }

    public f3(androidx.lifecycle.t tVar, androidx.lifecycle.t0 t0Var) {
        this.f20268a = 18;
        this.f20269b = tVar;
        this.f20270c = (w1.b) new aa.a(t0Var, w1.b.f44771f).l(w1.b.class);
    }

    public f3(sf0 sf0Var) {
        this.f20268a = 1;
        this.f20270c = sf0Var;
        this.f20269b = new jc0(this, 9);
    }

    public f3(k9.h hVar) {
        this.f20268a = 12;
        this.f20270c = hVar;
    }

    public f3(String str, String str2) {
        this.f20268a = 16;
        this.f20269b = str;
        this.f20270c = str2;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("userId should not be empty");
        }
    }

    @Override
    public void C(float f7) {
    }

    @Override
    public void J(long j3) {
    }

    @Override
    public void O(boolean z10) {
    }

    @Override
    public void T(float f7) {
    }

    @Override
    public void X(float f7) {
    }

    @Override
    public void a0(float f7) {
    }

    @Override
    public void b() {
    }

    @Override
    public void b0() {
    }

    @Override
    public void e(int i10) {
    }

    @Override
    public void g0(float f7) {
    }

    @Override
    public void i(float f7) {
    }

    @Override
    public void l(float f7) {
    }

    @Override
    public void l0(long j3) {
    }

    @Override
    public void onSeekFinished(j2.a aVar) {
    }

    @Override
    public void onSeekStarted(j2.a aVar) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public void r() {
    }

    @Override
    public void u(float f7) {
    }

    @Override
    public void w(boolean z10) {
    }

    public f3(EditText editText) {
        this.f20268a = 9;
        this.f20269b = editText;
        q1.i iVar = new q1.i(editText);
        this.f20270c = iVar;
        editText.addTextChangedListener(iVar);
        if (q1.a.f41379b == null) {
            synchronized (q1.a.f41378a) {
                try {
                    if (q1.a.f41379b == null) {
                        ?? factory = new Editable.Factory();
                        try {
                            q1.a.f41380c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, q1.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        q1.a.f41379b = factory;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(q1.a.f41379b);
    }

    public f3(PremiumPreviewFragment premiumPreviewFragment) {
        this.f20268a = 5;
        this.f20270c = premiumPreviewFragment;
        this.f20269b = new Paint();
    }

    @Override
    public void A(float f7, int i10) {
    }

    @Override
    public void R(float f7, int i10) {
    }

    @Override
    public void Z(float f7, int i10) {
    }

    @Override
    public void h0(int i10, long j3) {
    }

    @Override
    public void m(long j3, boolean z10) {
    }
}
