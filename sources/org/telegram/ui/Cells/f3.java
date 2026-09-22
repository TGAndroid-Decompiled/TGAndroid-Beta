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
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.jc0;
import org.telegram.ui.Components.pl0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.v71;
import org.telegram.ui.Components.vf0;
import org.telegram.ui.Components.zt;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.rx0;
import org.telegram.ui.sw;
import org.telegram.ui.ty;
import org.telegram.ui.uy;
import org.telegram.ui.x41;
public final class f3 implements zt, sc, pl0, fh.a, s71, p2.s, r2.k, y2.o, SuccessContinuation {
    public final int f20283a;
    public Object f20284b;
    public Object f20285c;

    public f3(int i10) {
        this.f20283a = i10;
    }

    public static org.telegram.ui.Cells.f3 e(android.content.Context r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.f3.e(android.content.Context):org.telegram.ui.Cells.f3");
    }

    public static f3 j(View view) {
        return new f3(view);
    }

    public void A() {
        try {
            ((FileLock) this.f20285c).release();
            ((FileChannel) this.f20284b).close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }

    public void C(s4.c1 c1Var) {
        s4.i1 i1Var = (s4.i1) ((a0.f) this.f20284b).get(c1Var);
        if (i1Var == null) {
            return;
        }
        i1Var.f43049a &= -2;
    }

    @Override
    public void D(float f7, boolean z10) {
        jc0 jc0Var = (jc0) this.f20284b;
        vf0 vf0Var = (vf0) this.f20285c;
        v71 v71Var = vf0Var.d;
        if (v71Var != null) {
            long p5 = v71Var.p();
            float max = 2.8f / ((float) Math.max(60L, p5));
            long j3 = (((f7 / (1.0f - max)) * max) + f7) * ((float) p5);
            vf0Var.e = j3;
            vf0Var.d.L(j3, !z10);
            if (!z10) {
                AndroidUtilities.cancelRunOnUIThread(jc0Var);
                AndroidUtilities.runOnUIThread(jc0Var, 120L);
            }
        }
    }

    public void E(s4.c1 c1Var) {
        a0.f fVar = (a0.f) this.f20284b;
        a0.i iVar = (a0.i) this.f20285c;
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
            i1Var.f43049a = 0;
            i1Var.f43050b = null;
            i1Var.f43051c = null;
            s4.i1.d.i(i1Var);
        }
    }

    @Override
    public y2.o H() {
        return new f3(((p2.s) this.f20284b).H(), (List) this.f20285c, false, 14);
    }

    @Override
    public y2.o K(p2.o oVar, p2.l lVar) {
        return new f3(((p2.s) this.f20284b).K(oVar, lVar), (List) this.f20285c, false, 14);
    }

    @Override
    public boolean mo18c(float f7, float f10, int i10, View view) {
        uy uyVar = (uy) this.f20285c;
        if (view instanceof s2) {
            s2 s2Var = (s2) view;
            if (s2Var.f21003n2) {
                uyVar.N4(s2Var.getDialogId(), view);
                return true;
            }
        }
        sw swVar = uyVar.f38381z0;
        if (swVar != null && swVar.getVisibility() == 0 && uyVar.f38381z0.f25539n) {
            return false;
        }
        return uyVar.o4(view, i10, f7, ((ty) this.f20284b).d);
    }

    @Override
    public void g() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((uy) this.f20285c).finishPreviewFragment();
        }
    }

    public void h(s4.c1 c1Var, b2.q0 q0Var) {
        a0.f fVar = (a0.f) this.f20284b;
        s4.i1 i1Var = (s4.i1) fVar.get(c1Var);
        if (i1Var == null) {
            i1Var = s4.i1.a();
            fVar.put(c1Var, i1Var);
        }
        i1Var.f43051c = q0Var;
        i1Var.f43049a |= 8;
    }

    @Override
    public void i() {
        ((bu) this.f20284b).getText();
        ((h3) this.f20285c).b();
    }

    @Override
    public ch.d l() {
        return new ch.f(this);
    }

    public void n() {
        String str = (String) this.f20284b;
        try {
            ba.c cVar = (ba.c) this.f20285c;
            cVar.getClass();
            new File(cVar.f3451b, str).createNewFile();
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e);
        }
    }

    @Override
    public Object n2(Uri uri, g2.k kVar) {
        t2.a aVar = (t2.a) ((y2.o) this.f20284b).n2(uri, kVar);
        List list = (List) this.f20285c;
        if (list != null && !list.isEmpty()) {
            return (t2.a) aVar.a(list);
        }
        return aVar;
    }

    @Override
    public r2.c a(com.google.firebase.messaging.n nVar) {
        MediaCodec mediaCodec;
        int i10;
        String str = ((r2.o) nVar.f7328a).f42283a;
        r2.c cVar = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                r2.c cVar2 = new r2.c(mediaCodec, (HandlerThread) ((r2.b) this.f20284b).get(), new r2.e(mediaCodec, (HandlerThread) ((r2.b) this.f20285c).get()), (r2.j) nVar.f7331f);
                try {
                    Trace.endSection();
                    Surface surface = (Surface) nVar.d;
                    if (surface == null && ((r2.o) nVar.f7328a).h && Build.VERSION.SDK_INT >= 35) {
                        i10 = 8;
                    } else {
                        i10 = 0;
                    }
                    r2.c.l(cVar2, (MediaFormat) nVar.f7329b, surface, (MediaCrypto) nVar.e, i10);
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
    public void onError(v71 v71Var, Exception exc) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f20285c;
        int i10 = secretMediaViewer.f31745b0;
        if (i10 > 0) {
            secretMediaViewer.f31745b0 = i10 - 1;
            AndroidUtilities.runOnUIThread(new rx0(28, this, (File) this.f20284b), 100L);
            return;
        }
        FileLog.e(exc);
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f20285c;
        x41 x41Var = secretMediaViewer.f31762i1;
        if (secretMediaViewer.f31795y != null && secretMediaViewer.f31759h0 != null) {
            AndroidUtilities.cancelRunOnUIThread(x41Var);
            AndroidUtilities.runOnUIThread(x41Var);
            if (i10 != 4 && i10 != 1) {
                try {
                    secretMediaViewer.f31744b.getWindow().addFlags(128);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } else {
                try {
                    secretMediaViewer.f31744b.getWindow().clearFlags(128);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
            if (i10 == 3 && secretMediaViewer.f31790w.getVisibility() != 0) {
                secretMediaViewer.f31790w.setVisibility(0);
            }
            if (secretMediaViewer.f31795y.y() && i10 != 4) {
                if (!secretMediaViewer.E) {
                    secretMediaViewer.E = true;
                }
            } else if (secretMediaViewer.E) {
                secretMediaViewer.E = false;
                if (i10 == 4) {
                    secretMediaViewer.H = true;
                    if (secretMediaViewer.I) {
                        secretMediaViewer.e(true, !secretMediaViewer.f31777q1);
                        return;
                    }
                    secretMediaViewer.f31795y.L(0L, false);
                    secretMediaViewer.f31795y.C();
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
        org.telegram.ui.k4 k4Var = ((SecretMediaViewer) this.f20285c).f31790w;
        if (k4Var != null) {
            if (i11 == 0) {
                f10 = 1.0f;
            } else {
                f10 = (i10 * f7) / i11;
            }
            k4Var.a(f10, 0);
        }
    }

    public void p(String str, PrintWriter printWriter) {
        boolean z10;
        w1.b bVar = (w1.b) this.f20285c;
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
                    printWriter.println(aVar.f44789l);
                    a6.d dVar = aVar.f44789l;
                    String str3 = str2 + "  ";
                    dVar.getClass();
                    printWriter.print(str3);
                    printWriter.print("mId=");
                    printWriter.print(0);
                    printWriter.print(" mListener=");
                    printWriter.println(dVar.f289a);
                    if (dVar.f290b || dVar.e) {
                        printWriter.print(str3);
                        printWriter.print("mStarted=");
                        printWriter.print(dVar.f290b);
                        printWriter.print(" mContentChanged=");
                        printWriter.print(dVar.e);
                        printWriter.print(" mProcessingChange=");
                        printWriter.println(false);
                    }
                    if (dVar.f291c || dVar.d) {
                        printWriter.print(str3);
                        printWriter.print("mAbandoned=");
                        printWriter.print(dVar.f291c);
                        printWriter.print(" mReset=");
                        printWriter.println(dVar.d);
                    }
                    if (dVar.f293g != null) {
                        printWriter.print(str3);
                        printWriter.print("mTask=");
                        printWriter.print(dVar.f293g);
                        printWriter.print(" waiting=");
                        dVar.f293g.getClass();
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
                    if (aVar.f44791n != null) {
                        printWriter.print(str2);
                        printWriter.print("mCallbacks=");
                        printWriter.println(aVar.f44791n);
                        b2.p pVar = aVar.f44791n;
                        pVar.getClass();
                        printWriter.print(str2 + "  ");
                        printWriter.print("mDeliveredData=");
                        printWriter.println(pVar.f3175b);
                    }
                    printWriter.print(str2);
                    printWriter.print("mData=");
                    a6.d dVar2 = aVar.f44789l;
                    Object obj2 = aVar.e;
                    if (obj2 != androidx.lifecycle.z.f2615k) {
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
                    if (aVar.f2618c > 0) {
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
    public void q(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((uy) this.f20285c).movePreviewFragment(f7);
        }
    }

    public File s() {
        if (((File) this.f20284b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f20284b) == null) {
                        k9.h hVar = (k9.h) this.f20285c;
                        hVar.a();
                        File filesDir = hVar.f13548a.getFilesDir();
                        this.f20284b = new File(filesDir, "PersistedInstallation." + ((k9.h) this.f20285c).d() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.f20284b;
    }

    @Override
    public Task then(Object obj) {
        da.a aVar = (da.a) obj;
        u4.g gVar = (u4.g) this.f20285c;
        if (aVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return Tasks.forResult(null);
        }
        m5.e eVar = (m5.e) gVar.f43943c;
        w9.n.b((w9.n) ((m5.e) gVar.f43943c).f14969c);
        ((w9.n) eVar.f14969c).f45264m.y((Executor) this.f20284b, null);
        ((w9.n) eVar.f14969c).f45268q.trySetResult(null);
        return Tasks.forResult(null);
    }

    public String toString() {
        switch (this.f20283a) {
            case 18:
                StringBuilder sb2 = new StringBuilder(128);
                sb2.append("LoaderManager{");
                sb2.append(Integer.toHexString(System.identityHashCode(this)));
                sb2.append(" in ");
                Class<?> cls = ((androidx.lifecycle.t) this.f20284b).getClass();
                sb2.append(cls.getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(cls)));
                sb2.append("}}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    @Override
    public void v(Canvas canvas, float f7, float f10, float f11, float f12) {
        Paint paint = (Paint) this.f20284b;
        PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f20285c;
        rg.z0 z0Var = premiumPreviewFragment.m0;
        if (premiumPreviewFragment.f31471h0) {
            paint.setColor(premiumPreviewFragment.getThemedColor(org.telegram.ui.ActionBar.j6.f19053a7));
            canvas.drawRect(f7, f10, f11, f12, paint);
            return;
        }
        z0Var.d(0, (-premiumPreviewFragment.f31466d0.getMeasuredWidth()) * 0.1f * premiumPreviewFragment.f31463b0, 0, premiumPreviewFragment.f31466d0.getMeasuredWidth(), 0.0f, premiumPreviewFragment.f31466d0.getMeasuredHeight());
        canvas.drawRect(f7, f10, f11, f12, z0Var.f42875f);
    }

    public void w(ra.b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", bVar.f42501a);
            jSONObject.put("Status", m1.j.c(bVar.f42502b));
            jSONObject.put("AuthToken", bVar.f42503c);
            jSONObject.put("RefreshToken", bVar.d);
            jSONObject.put("TokenCreationEpochInSecs", bVar.f42504f);
            jSONObject.put("ExpiresInSecs", bVar.e);
            jSONObject.put("FisError", bVar.f42505g);
            k9.h hVar = (k9.h) this.f20285c;
            hVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", hVar.f13548a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!createTempFile.renameTo(s())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public b2.q0 x(s4.c1 c1Var, int i10) {
        s4.i1 i1Var;
        b2.q0 q0Var;
        a0.f fVar = (a0.f) this.f20284b;
        int c10 = fVar.c(c1Var);
        if (c10 >= 0 && (i1Var = (s4.i1) fVar.h(c10)) != null) {
            int i11 = i1Var.f43049a;
            if ((i11 & i10) != 0) {
                int i12 = i11 & (~i10);
                i1Var.f43049a = i12;
                if (i10 == 4) {
                    q0Var = i1Var.f43050b;
                } else if (i10 == 8) {
                    q0Var = i1Var.f43051c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i12 & 12) == 0) {
                    fVar.f(c10);
                    i1Var.f43049a = 0;
                    i1Var.f43050b = null;
                    i1Var.f43051c = null;
                    s4.i1.d.i(i1Var);
                }
                return q0Var;
            }
        }
        return null;
    }

    public ra.b z() {
        JSONObject jSONObject;
        String str;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(s());
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

    public f3(int i10, Object obj, Object obj2) {
        this.f20283a = i10;
        this.f20285c = obj;
        this.f20284b = obj2;
    }

    @Override
    public void onRenderedFirstFrame() {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f20285c;
        if (secretMediaViewer.f31748c0) {
            return;
        }
        secretMediaViewer.f31748c0 = true;
        secretMediaViewer.e.invalidate();
    }

    public f3(Object obj, Object obj2, boolean z10, int i10) {
        this.f20283a = i10;
        this.f20284b = obj;
        this.f20285c = obj2;
    }

    public f3(v7.s1 s1Var) {
        this.f20283a = 19;
        this.f20285c = new Object();
        this.f20284b = s1Var;
        w7.pa.b();
    }

    public f3(Context context) {
        this.f20283a = 15;
        this.f20284b = context;
        this.f20285c = null;
    }

    public f3() {
        this.f20283a = 13;
        this.f20284b = new a0.m(0);
        this.f20285c = new a0.i();
    }

    public f3(View view) {
        this.f20283a = 2;
        h71 h71Var = new h71(this, view);
        this.f20284b = h71Var;
        view.addOnLayoutChangeListener(h71Var);
    }

    public f3(androidx.lifecycle.t tVar, androidx.lifecycle.t0 t0Var) {
        this.f20283a = 18;
        this.f20284b = tVar;
        this.f20285c = (w1.b) new aa.a(t0Var, w1.b.f44792f).n(w1.b.class);
    }

    public f3(vf0 vf0Var) {
        this.f20283a = 1;
        this.f20285c = vf0Var;
        this.f20284b = new jc0(this, 10);
    }

    public f3(k9.h hVar) {
        this.f20283a = 12;
        this.f20285c = hVar;
    }

    public f3(String str, String str2) {
        this.f20283a = 16;
        this.f20284b = str;
        this.f20285c = str2;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("userId should not be empty");
        }
    }

    @Override
    public void B(float f7) {
    }

    @Override
    public void J(long j3) {
    }

    @Override
    public void L(boolean z10) {
    }

    @Override
    public void Q(float f7) {
    }

    @Override
    public void U(float f7) {
    }

    @Override
    public void X(float f7) {
    }

    @Override
    public void Y() {
    }

    @Override
    public void b(int i10) {
    }

    @Override
    public void b0(float f7) {
    }

    @Override
    public void d() {
    }

    @Override
    public void f(float f7) {
    }

    @Override
    public void h0(long j3) {
    }

    @Override
    public void k(float f7) {
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
    public void t(float f7) {
    }

    @Override
    public void u(boolean z10) {
    }

    public f3(EditText editText) {
        this.f20283a = 9;
        this.f20284b = editText;
        q1.i iVar = new q1.i(editText);
        this.f20285c = iVar;
        editText.addTextChangedListener(iVar);
        if (q1.a.f41401b == null) {
            synchronized (q1.a.f41400a) {
                try {
                    if (q1.a.f41401b == null) {
                        ?? factory = new Editable.Factory();
                        try {
                            q1.a.f41402c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, q1.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        q1.a.f41401b = factory;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(q1.a.f41401b);
    }

    public f3(PremiumPreviewFragment premiumPreviewFragment) {
        this.f20283a = 5;
        this.f20285c = premiumPreviewFragment;
        this.f20284b = new Paint();
    }

    @Override
    public void O(float f7, int i10) {
    }

    @Override
    public void W(float f7, int i10) {
    }

    @Override
    public void c0(int i10, long j3) {
    }

    @Override
    public void m(long j3, boolean z10) {
    }

    @Override
    public void y(float f7, int i10) {
    }
}
