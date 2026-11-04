package org.telegram.ui.Components;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public class nh implements z80, ry, org.telegram.ui.gm0, k51, w2.e1, com.google.android.gms.common.api.internal.p, t4.d, com.google.android.gms.common.api.internal.n, u4.d0, u4.i1, p5.b, ug.c, ug.k1 {
    public final int f36539a;
    public final Object f36540b;

    public nh(Object obj, int i3) {
        this.f36539a = i3;
        this.f36540b = obj;
    }

    public s0.d A(int i3) {
        return null;
    }

    public void B() {
        q2.q[] qVarArr;
        q2.q[] qVarArr2;
        q2.k kVar = (q2.k) this.f36540b;
        int i3 = kVar.I - 1;
        kVar.I = i3;
        if (i3 > 0) {
            return;
        }
        int i10 = 0;
        for (q2.q qVar : kVar.K) {
            qVar.m();
            i10 += qVar.Z.f57206a;
        }
        d2.o1[] o1VarArr = new d2.o1[i10];
        int i11 = 0;
        for (q2.q qVar2 : kVar.K) {
            qVar2.m();
            int i12 = qVar2.Z.f57206a;
            int i13 = 0;
            while (i13 < i12) {
                qVar2.m();
                o1VarArr[i11] = qVar2.Z.a(i13);
                i13++;
                i11++;
            }
        }
        kVar.J = new w2.r1(o1VarArr);
        kVar.H.b(kVar);
    }

    public void C(r4.p pVar, r4.m mVar, Collection collection) {
        r4.e eVar = (r4.e) this.f36540b;
        if (pVar == eVar.f54278y && mVar != null) {
            r4.v vVar = eVar.f54277x.f54372a;
            String d = mVar.d();
            r4.w wVar = new r4.w(vVar, d, eVar.b(vVar, d), false);
            wVar.i(mVar);
            if (eVar.d != wVar) {
                eVar.h(eVar, wVar, eVar.f54278y, 3, eVar.f54277x, collection);
                eVar.f54277x = null;
                eVar.f54278y = null;
            }
        } else if (pVar == eVar.f54260e) {
            if (mVar != null) {
                eVar.n(eVar.d, mVar);
            }
            eVar.d.n(collection);
        }
    }

    public boolean D(int i3, int i10, Bundle bundle) {
        return false;
    }

    @Override
    public void E(int i3, int i10) {
        ((u4.h0) this.f36540b).j(i3, i10);
    }

    public byte F() {
        int read = ((rf.a) this.f36540b).read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    public int G() {
        return ((F() & 255) << 24) | ((F() & 255) << 16) | ((F() & 255) << 8) | (F() & 255);
    }

    public int H() {
        return ((F() & Byte.MAX_VALUE) << 21) | ((F() & Byte.MAX_VALUE) << 14) | ((F() & Byte.MAX_VALUE) << 7) | (F() & Byte.MAX_VALUE);
    }

    public void I(int i3) {
        RecyclerView recyclerView = (RecyclerView) this.f36540b;
        View childAt = recyclerView.getChildAt(i3);
        if (childAt != null) {
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i3);
    }

    public void J(long j10) {
        long j11 = 0;
        while (j11 < j10) {
            long skip = ((rf.a) this.f36540b).skip(j10 - j11);
            if (skip > 0) {
                j11 += skip;
            } else {
                throw new EOFException();
            }
        }
    }

    public void K() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f36540b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        int size = arrayDeque.size();
        long M = M();
        throw new IOException("data item not completed, stackSize: " + size + " scope: " + M);
    }

    public void L(long j10) {
        long M = M();
        if (M != j10) {
            if (M != -1) {
                if (M == -2) {
                    M = -2;
                } else {
                    return;
                }
            }
            StringBuilder t10 = a1.g.t(j10, "expected non-string scope or scope ", " but found ");
            t10.append(M);
            throw new IOException(t10.toString());
        }
    }

    public long M() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f36540b;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    @Override
    public void O0(int i3, int i10) {
        ((u4.h0) this.f36540b).p(i3, i10);
    }

    @Override
    public void a(ArrayList arrayList) {
        switch (this.f36539a) {
            case 2:
                f30.a((f30) this.f36540b, false, arrayList);
                return;
            default:
                b8.ke keVar = (b8.ke) this.f36540b;
                try {
                    if (!arrayList.isEmpty()) {
                        org.telegram.messenger.xy xyVar = (org.telegram.messenger.xy) arrayList.get(0);
                        if (xyVar.f26477c != null) {
                            File z10 = org.telegram.messenger.w7.z(4);
                            keVar.f2719f = new File(z10, Utilities.f21385b.nextInt() + ".jpg");
                            Point c12 = org.telegram.messenger.g0.c1();
                            Bitmap K = org.telegram.messenger.zb.K(xyVar.f26477c, null, (float) c12.x, (float) c12.y, true);
                            K.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream((File) keVar.f2719f));
                            ((s61) keVar.f2718e).b((File) keVar.f2719f, K, true);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                    return;
                }
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        int i3 = this.f36539a;
        Object obj3 = this.f36540b;
        switch (i3) {
            case 16:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                r6.b bVar = (r6.b) ((r6.a) obj).m();
                Parcel J0 = bVar.J0();
                m7.a.b(J0, (p6.r) obj3);
                try {
                    bVar.f2456b.transact(1, J0, null, 1);
                    J0.recycle();
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Throwable th2) {
                    J0.recycle();
                    throw th2;
                }
            default:
                x8.j jVar = (x8.j) obj3;
                g8.b bVar2 = (g8.b) obj;
                Bundle A = bVar2.A();
                A.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
                g8.a aVar = new g8.a(0, (TaskCompletionSource) obj2);
                try {
                    g8.i iVar = (g8.i) bVar2.m();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i10 = g8.c.f12035a;
                    obtain.writeInt(1);
                    jVar.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    A.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(aVar);
                    iVar.f12043a.transact(19, obtain, null, 1);
                    obtain.recycle();
                    return;
                } catch (RemoteException e10) {
                    Log.e("WalletClientImpl", "RemoteException getting payment data", e10);
                    Bundle bundle = Bundle.EMPTY;
                    aVar.o(Status.h, null);
                    return;
                }
        }
    }

    @Override
    public void c(Object obj) {
        com.google.android.gms.common.api.internal.m mVar;
        org.telegram.messenger.t9 t9Var = (org.telegram.messenger.t9) obj;
        androidx.activity.n nVar = ((t7.i) this.f36540b).f54962b;
        synchronized (nVar) {
            nVar.f1269b = false;
            mVar = ((com.google.android.gms.common.api.internal.o) nVar.f1270c).f6726b;
        }
        if (mVar != null) {
            ((t7.c) nVar.d).c(mVar, 2441);
        }
    }

    @Override
    public int d(View view) {
        return u4.o0.x(view) - ((ViewGroup.MarginLayoutParams) ((u4.p0) view.getLayoutParams())).leftMargin;
    }

    @Override
    public void f() {
        ((org.telegram.ui.lp0) this.f36540b).r0(null, true);
    }

    @Override
    public int g() {
        return ((u4.o0) this.f36540b).D();
    }

    @Override
    public Object mo5get() {
        return new u5.i(Integer.valueOf(u5.i.d).intValue(), (Context) ((cd.a) this.f36540b).mo5get(), "com.google.android.datatransport.events");
    }

    @Override
    public float getBlurAngle() {
        return ((org.telegram.messenger.ze) this.f36540b).f26801t;
    }

    @Override
    public float getBlurExcludeBlurSize() {
        return ((org.telegram.messenger.ze) this.f36540b).f26800s;
    }

    @Override
    public PointF getBlurExcludePoint() {
        return ((org.telegram.messenger.ze) this.f36540b).f26799r;
    }

    @Override
    public float getBlurExcludeSize() {
        return ((org.telegram.messenger.ze) this.f36540b).f26798q;
    }

    @Override
    public int getBlurType() {
        return ((org.telegram.messenger.ze) this.f36540b).f26795n;
    }

    @Override
    public float getContrastValue() {
        return a1.g.A(((org.telegram.messenger.ze) this.f36540b).d, 100.0f, 0.3f, 1.0f);
    }

    @Override
    public float getEnhanceValue() {
        return ((org.telegram.messenger.ze) this.f36540b).f26784a / 100.0f;
    }

    @Override
    public float getExposureValue() {
        return ((org.telegram.messenger.ze) this.f36540b).f26786c / 100.0f;
    }

    @Override
    public float getFadeValue() {
        return ((org.telegram.messenger.ze) this.f36540b).f26789g / 100.0f;
    }

    @Override
    public float getGrainValue() {
        return (((org.telegram.messenger.ze) this.f36540b).f26794m / 100.0f) * 0.04f;
    }

    @Override
    public float getHighlightsValue() {
        return com.google.android.recaptcha.internal.a.x(((org.telegram.messenger.ze) this.f36540b).f26791j, 0.75f, 100.0f, 100.0f);
    }

    @Override
    public float getSaturationValue() {
        float f10 = ((org.telegram.messenger.ze) this.f36540b).f26788f / 100.0f;
        if (f10 > 0.0f) {
            f10 *= 1.05f;
        }
        return f10 + 1.0f;
    }

    @Override
    public float getShadowsValue() {
        return com.google.android.recaptcha.internal.a.x(((org.telegram.messenger.ze) this.f36540b).f26792k, 0.55f, 100.0f, 100.0f);
    }

    @Override
    public float getSharpenValue() {
        return a1.g.A(((org.telegram.messenger.ze) this.f36540b).f26796o, 100.0f, 0.6f, 0.11f);
    }

    @Override
    public float getSoftenSkinValue() {
        return ((org.telegram.messenger.ze) this.f36540b).f26785b / 100.0f;
    }

    @Override
    public int getTintHighlightsColor() {
        return ((org.telegram.messenger.ze) this.f36540b).f26790i;
    }

    @Override
    public float getTintHighlightsIntensityValue() {
        if (((org.telegram.messenger.ze) this.f36540b).f26790i == 0) {
            return 0.0f;
        }
        return 0.5f;
    }

    @Override
    public int getTintShadowsColor() {
        return ((org.telegram.messenger.ze) this.f36540b).h;
    }

    @Override
    public float getTintShadowsIntensityValue() {
        if (((org.telegram.messenger.ze) this.f36540b).h == 0) {
            return 0.0f;
        }
        return 0.5f;
    }

    @Override
    public float getVignetteValue() {
        return ((org.telegram.messenger.ze) this.f36540b).f26793l / 100.0f;
    }

    @Override
    public float getWarmthValue() {
        return ((org.telegram.messenger.ze) this.f36540b).f26787e / 100.0f;
    }

    @Override
    public ByteBuffer h() {
        org.telegram.messenger.ze zeVar = (org.telegram.messenger.ze) this.f36540b;
        zeVar.f26797p.q();
        return (ByteBuffer) zeVar.f26797p.f11822f;
    }

    @Override
    public int i() {
        u4.o0 o0Var = (u4.o0) this.f36540b;
        return o0Var.f55639m - o0Var.E();
    }

    @Override
    public View j(int i3) {
        return ((u4.o0) this.f36540b).q(i3);
    }

    @Override
    public void j1(int i3, int i10) {
        ((u4.h0) this.f36540b).n(i3, i10, null);
    }

    @Override
    public void k(w2.f1 f1Var) {
        q2.q qVar = (q2.q) f1Var;
        q2.k kVar = (q2.k) this.f36540b;
        kVar.H.k(kVar);
    }

    @Override
    public int l(View view) {
        return u4.o0.y(view) + ((ViewGroup.MarginLayoutParams) ((u4.p0) view.getLayoutParams())).rightMargin;
    }

    @Override
    public void l0(int i3, int i10) {
        ((u4.h0) this.f36540b).o(i3, i10);
    }

    @Override
    public void m() {
        switch (this.f36539a) {
            case 2:
                try {
                    Intent intent = new Intent("android.intent.action.GET_CONTENT");
                    intent.setType("image/*");
                    ((f30) this.f36540b).f33681a.startActivityForResult(intent, 14);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                try {
                    Intent intent2 = new Intent("android.intent.action.PICK");
                    intent2.setType("image/*");
                    ((Activity) ((b8.ke) this.f36540b).f2717c).startActivityForResult(intent2, 11);
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
        }
    }

    @Override
    public Paint.FontMetricsInt n() {
        return ((bi) this.f36540b).f32299z2.getEditText().getPaint().getFontMetricsInt();
    }

    @Override
    public boolean o() {
        return false;
    }

    @Override
    public void onRenderedFirstFrame(l2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i3) {
        mi0 mi0Var = (mi0) this.f36540b;
        if (z10 && mi0Var.f36163n.S() >= 0) {
            mi0Var.f36167x = true;
        }
        je0 je0Var = mi0Var.f36162f;
        jb0 jb0Var = mi0Var.f36168y;
        je0Var.a(z10, true);
        org.telegram.messenger.g0.r(jb0Var);
        if (z10) {
            org.telegram.messenger.g0.i3(jb0Var, 16L);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public ug.j p() {
        return ((org.telegram.ui.lp0) this.f36540b).C0;
    }

    @Override
    public void r() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override
    public void s(float f10) {
        ((ug.c2) this.f36540b).setOutlineWidth(f10);
    }

    @Override
    public void t(int i3, int i10, CharSequence charSequence, boolean z10) {
        bi biVar = (bi) this.f36540b;
        if (biVar.a1() == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(biVar.a1().getText());
            spannableStringBuilder.replace(i3, i10 + i3, charSequence);
            if (z10) {
                org.telegram.messenger.i6.l(spannableStringBuilder, biVar.a1().getEditText().getPaint().getFontMetricsInt(), false);
            }
            biVar.a1().setText(spannableStringBuilder);
            biVar.a1().setSelection(i3 + charSequence.length());
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public String toString() {
        switch (this.f36539a) {
            case 15:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.f36540b).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    @Override
    public void u(int i3, Object obj) {
        String str;
        switch (i3) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i3 != 6 && i3 != 7 && i3 != 8) {
            Log.d("ProfileInstaller", str);
        } else {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        }
        ((ProfileInstallReceiver) this.f36540b).setResultCode(i3);
    }

    @Override
    public boolean v() {
        return !((org.telegram.messenger.ze) this.f36540b).f26797p.F();
    }

    public void x() {
        tg.s0 s0Var = ((tg.u0) this.f36540b).d;
        if (s0Var != null) {
            tg.r0 r0Var = s0Var.f55311s;
            if (r0Var != null) {
                s0Var.cancelRunnable(r0Var);
                s0Var.f55311s = null;
            }
            tg.r0 r0Var2 = new tg.r0(s0Var, 1);
            s0Var.f55311s = r0Var2;
            s0Var.postRunnable(r0Var2, 1L);
        }
    }

    public s0.d y(int i3) {
        return null;
    }

    public android.view.ViewGroup z(android.content.Context r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nh.z(android.content.Context, int):android.view.ViewGroup");
    }

    public nh(boolean z10) {
        this.f36539a = 8;
        this.f36540b = new AtomicBoolean(z10);
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public nh(int i3) {
        this.f36539a = i3;
        switch (i3) {
            case 10:
                this.f36540b = new ArrayDeque(16);
                return;
            case 17:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f36540b = new cf0(this);
                    return;
                } else {
                    this.f36540b = new cf0(this);
                    return;
                }
            default:
                this.f36540b = g9.i0.p();
                return;
        }
    }

    @Override
    public float get() {
        return ((ug.c2) this.f36540b).G;
    }

    @Override
    public void onSeekFinished(l2.a aVar) {
    }

    @Override
    public void onSeekStarted(l2.a aVar) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public void w(String str) {
    }

    @Override
    public void onError(m51 m51Var, Exception exc) {
    }

    @Override
    public void e(TLRPC.BotInlineResult botInlineResult, boolean z10, int i3) {
    }

    @Override
    public void q(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override
    public void onVideoSizeChanged(int i3, int i10, int i11, float f10) {
    }
}
