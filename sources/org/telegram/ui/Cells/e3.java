package org.telegram.ui.Cells;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.Editable;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import kh.ac;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.hq0;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.iz0;
import org.telegram.ui.Components.jx0;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.kj;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.re0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.x60;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.cw;
import org.telegram.ui.cy;
import org.telegram.ui.dy;
import org.telegram.ui.ei1;
import org.telegram.ui.fm0;
import org.telegram.ui.lm0;
import org.telegram.ui.n21;
import org.telegram.ui.nu0;
import org.telegram.ui.p31;
import org.telegram.ui.wm0;
import org.telegram.ui.wu;
import org.telegram.ui.xu;
import org.telegram.ui.z11;
import org.telegram.ui.zk0;
public class e3 implements kt, ac, k1, org.telegram.ui.h7, pk0, lm0, ng.a, org.telegram.ui.ActionBar.b6, h61, p4.q, p5.a, qh.m3, qh.c1, Continuation, td.d, m3.e, w3.y {
    public final int f24285a;
    public Object f24286b;
    public Object f24287c;

    public e3(int i9) {
        this.f24285a = i9;
    }

    public static e3 s2(View view) {
        return new e3(view);
    }

    @Override
    public boolean A(qh.d1 d1Var) {
        return false;
    }

    @Override
    public void B1(Editable editable) {
        ((qh.h0) this.f24287c).i();
        ((qh.g0) this.f24286b).T();
    }

    @Override
    public String C(long j10) {
        String trim = ((EditTextBoldCursor) this.f24286b).getText().toString().trim();
        if (trim.length() > 16) {
            trim = trim.substring(0, 16);
        }
        if (!((iz0) this.f24287c).f29555s && TextUtils.isEmpty(trim)) {
            return null;
        }
        return trim;
    }

    @Override
    public void C0() {
        qh.s3 s3Var = ((qh.p) this.f24287c).f46607s;
        if (s3Var != null) {
            int i9 = s3Var.T;
            if (i9 == 2) {
                i9 = 0;
            }
            s3Var.U = i9;
            s3Var.e(false, false);
            s3Var.f(2, true);
        }
    }

    @Override
    public void D1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        ve.e.s(t1Var.getContext(), str);
    }

    @Override
    public void E(int i9, int i10) {
        ((qh.g0) this.f24286b).Q(i9, i10);
    }

    @Override
    public CharacterStyle E1(t1 t1Var) {
        return null;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean G1(t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public ColorFilter H() {
        switch (this.f24285a) {
            case 10:
                return org.telegram.ui.ActionBar.f6.f23317v3;
            default:
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.f24287c;
                if (b6Var == null) {
                    return org.telegram.ui.ActionBar.f6.f23317v3;
                }
                return b6Var.H();
        }
    }

    @Override
    public boolean I(float f10) {
        return false;
    }

    @Override
    public x60 J1(View view) {
        qh.p pVar = (qh.p) this.f24287c;
        x60 x60Var = new x60(pVar, (org.telegram.ui.ActionBar.b6) this.f24286b, view, false, false, true);
        pVar.D = x60Var;
        return x60Var;
    }

    @Override
    public boolean K0(long j10) {
        return ((iz0) this.f24287c).v;
    }

    @Override
    public void L0(qh.d1 d1Var) {
        ((qh.g0) this.f24286b).g();
    }

    @Override
    public int N0(int i9) {
        switch (this.f24285a) {
            case 10:
                SparseIntArray sparseIntArray = (SparseIntArray) this.f24286b;
                if (sparseIntArray != null) {
                    return sparseIntArray.get(i9);
                }
                return org.telegram.ui.ActionBar.f6.w0(null, i9, false);
            default:
                SparseIntArray sparseIntArray2 = (SparseIntArray) this.f24286b;
                int indexOfKey = sparseIntArray2.indexOfKey(i9);
                if (indexOfKey >= 0) {
                    return sparseIntArray2.valueAt(indexOfKey);
                }
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.f24287c;
                if (b6Var == null) {
                    return org.telegram.ui.ActionBar.f6.w0(null, i9, false);
                }
                return b6Var.N0(i9);
        }
    }

    @Override
    public void N1() {
        qh.p pVar = (qh.p) this.f24287c;
        pVar.W();
        pVar.X();
    }

    @Override
    public Paint O(String str) {
        switch (this.f24285a) {
            case 10:
                return org.telegram.ui.ActionBar.f6.S0(str);
            default:
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.f24287c;
                if (b6Var == null) {
                    return org.telegram.ui.ActionBar.f6.S0(str);
                }
                return b6Var.O(str);
        }
    }

    @Override
    public boolean O1(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public nu0 P1() {
        return null;
    }

    @Override
    public m3.d Q1(m3.l lVar, long j10) {
        long position = lVar.getPosition();
        int min = (int) Math.min(20000L, lVar.getLength() - position);
        d5.y yVar = (d5.y) this.f24287c;
        yVar.z(min);
        lVar.c(0, min, yVar.f4410a);
        int i9 = -1;
        long j11 = -9223372036854775807L;
        int i10 = -1;
        while (yVar.a() >= 4) {
            if (p3.a.a(yVar.f4411b, yVar.f4410a) != 442) {
                yVar.D(1);
            } else {
                yVar.D(4);
                long c10 = w3.v.c(yVar);
                if (c10 != -9223372036854775807L) {
                    long b10 = ((d5.e0) this.f24286b).b(c10);
                    if (b10 > j10) {
                        if (j11 == -9223372036854775807L) {
                            return new m3.d(-1, b10, position);
                        }
                        return new m3.d(0, -9223372036854775807L, position + i10);
                    } else if (b10 + 100000 > j10) {
                        return new m3.d(0, -9223372036854775807L, position + yVar.f4411b);
                    } else {
                        j11 = b10;
                        i10 = yVar.f4411b;
                    }
                }
                int i11 = yVar.f4412c;
                if (yVar.a() < 10) {
                    yVar.C(i11);
                } else {
                    yVar.D(9);
                    int r10 = yVar.r() & 7;
                    if (yVar.a() < r10) {
                        yVar.C(i11);
                    } else {
                        yVar.D(r10);
                        if (yVar.a() < 4) {
                            yVar.C(i11);
                        } else {
                            if (p3.a.a(yVar.f4411b, yVar.f4410a) == 443) {
                                yVar.D(4);
                                int w8 = yVar.w();
                                if (yVar.a() < w8) {
                                    yVar.C(i11);
                                } else {
                                    yVar.D(w8);
                                }
                            }
                            while (true) {
                                if (yVar.a() < 4) {
                                    break;
                                }
                                int a2 = p3.a.a(yVar.f4411b, yVar.f4410a);
                                if (a2 == 442 || a2 == 441 || (a2 >>> 8) != 1) {
                                    break;
                                }
                                yVar.D(4);
                                if (yVar.a() < 2) {
                                    yVar.C(i11);
                                    break;
                                }
                                yVar.C(Math.min(yVar.f4412c, yVar.f4411b + yVar.w()));
                            }
                        }
                    }
                }
                i9 = yVar.f4411b;
            }
        }
        if (j11 != -9223372036854775807L) {
            return new m3.d(-2, j11, position + i9);
        }
        return m3.d.d;
    }

    @Override
    public boolean R1(long j10) {
        return ((iz0) this.f24287c).f29555s;
    }

    @Override
    public boolean S0(t1 t1Var, boolean z10) {
        return false;
    }

    @Override
    public void T(String str, String str2) {
        wm0 wm0Var = ((fm0) this.f24287c).f38315a;
        if ("PHONE_VERIFICATION_NEEDED".equals(str)) {
            wm0Var.O1(true, str2, (zk0) this.f24286b, this, wm0Var.f44203x1);
        } else {
            wm0Var.N1(true, false);
        }
    }

    @Override
    public void T0(Canvas canvas, float f10, float f11, float f12, float f13) {
        switch (this.f24285a) {
            case 8:
                canvas.save();
                canvas.clipRect(f10, f11, f12, f13);
                ((PhotoViewer) this.f24287c).T0(canvas, (org.telegram.ui.Components.fa) this.f24286b, -14277082, 855638016, false, true, true);
                canvas.drawColor(637534208);
                canvas.restore();
                return;
            default:
                Paint paint = (Paint) this.f24286b;
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f24287c;
                zf.z0 z0Var = premiumPreviewFragment.f35852i0;
                if (premiumPreviewFragment.f35845d0) {
                    paint.setColor(premiumPreviewFragment.getThemedColor(org.telegram.ui.ActionBar.f6.f22947a7));
                    canvas.drawRect(f10, f11, f12, f13, paint);
                    return;
                }
                z0Var.d(0, (-premiumPreviewFragment.Z.getMeasuredWidth()) * 0.1f * premiumPreviewFragment.X, 0, premiumPreviewFragment.Z.getMeasuredWidth(), 0.0f, premiumPreviewFragment.Z.getMeasuredHeight());
                canvas.drawRect(f10, f11, f12, f13, z0Var.f50792f);
                return;
        }
    }

    @Override
    public boolean T1(boolean z10) {
        return false;
    }

    @Override
    public boolean U1(qh.d1 d1Var) {
        return false;
    }

    @Override
    public boolean V(t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public void V0() {
        qh.p pVar = (qh.p) this.f24287c;
        if (pVar.getCurrentItemTop() != pVar.E) {
            pVar.f27493b.X1(pVar, 0);
        }
        pVar.Z();
        qh.p.J(pVar);
    }

    @Override
    public com.google.android.exoplayer2.upstream.s0 V1() {
        return new g5.b(9, ((p4.q) this.f24286b).V1(), (List) this.f24287c);
    }

    @Override
    public boolean W() {
        return false;
    }

    @Override
    public boolean W1(t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public boolean X(t1 t1Var) {
        return false;
    }

    @Override
    public void X1(qh.n3 n3Var, View view) {
        qh.p pVar = (qh.p) this.f24287c;
        x60 x60Var = new x60(pVar, (org.telegram.ui.ActionBar.b6) this.f24286b, view, false, false, true);
        x60Var.Q = true;
        org.telegram.ui.ActionBar.o2 o2Var = pVar.f27493b.f30099b0;
        pVar.getContext();
        pVar.D = qh.a4.b(x60Var, o2Var, n3Var, true);
    }

    @Override
    public boolean Y() {
        return false;
    }

    @Override
    public boolean Y0(int i9, t1 t1Var) {
        return false;
    }

    @Override
    public boolean Z0(MessageObject messageObject) {
        return ll.a(messageObject);
    }

    @Override
    public boolean a() {
        switch (this.f24285a) {
            case 10:
            default:
                return org.telegram.ui.ActionBar.f6.I.q();
        }
    }

    @Override
    public void a1(float f10, boolean z10) {
        ib0 ib0Var = (ib0) this.f24286b;
        re0 re0Var = (re0) this.f24287c;
        k61 k61Var = re0Var.d;
        if (k61Var != null) {
            long q10 = k61Var.q();
            float max = 2.8f / ((float) Math.max(60L, q10));
            long j10 = (((f10 / (1.0f - max)) * max) + f10) * ((float) q10);
            re0Var.f32149e = j10;
            re0Var.d.M(j10, !z10);
            if (!z10) {
                AndroidUtilities.cancelRunOnUIThread(ib0Var);
                AndroidUtilities.runOnUIThread(ib0Var, 120L);
            }
        }
    }

    @Override
    public void b() {
        ((td.i) this.f24286b).b();
    }

    @Override
    public int b0() {
        return 0;
    }

    @Override
    public void b1(int i9) {
        qh.p pVar = (qh.p) this.f24287c;
        pVar.f27493b.X1(pVar, i9);
        pVar.Z();
        qh.p.J(pVar);
    }

    @Override
    public boolean mo5c(float f10, float f11, int i9, View view) {
        dy dyVar = (dy) this.f24287c;
        if (view instanceof r2) {
            r2 r2Var = (r2) view;
            if (r2Var.f25000j2) {
                dyVar.N4(r2Var.getDialogId(), view);
                return true;
            }
        }
        cw cwVar = dyVar.f37735v0;
        if (cwVar != null && cwVar.getVisibility() == 0 && dyVar.f37735v0.f34047n) {
            return false;
        }
        return dyVar.o4(view, i9, f10, ((cy) this.f24286b).d);
    }

    @Override
    public void c0(int i9) {
        qh.p.N((qh.p) this.f24287c, 74, i9);
    }

    @Override
    public void c1(int i9, int i10) {
        switch (this.f24285a) {
            case 10:
                return;
            default:
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.f24287c;
                if (b6Var != null) {
                    b6Var.c1(i9, i10);
                    return;
                }
                return;
        }
    }

    @Override
    public void c2(qh.s5 s5Var, String str) {
        qh.p pVar = (qh.p) this.f24287c;
        if (pVar.v == null) {
            org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.f24286b;
            pVar.v = new m.t3(new ei1(7, this, b6Var), b6Var);
        }
        pVar.v.f(s5Var, str);
    }

    @Override
    public void d(qh.d1 d1Var) {
        ((qh.g0) this.f24286b).d(d1Var);
    }

    @Override
    public pg.a d0() {
        return null;
    }

    @Override
    public void d2(qh.l3 l3Var, View view) {
        qh.p pVar = (qh.p) this.f24287c;
        x60 x60Var = new x60(pVar, (org.telegram.ui.ActionBar.b6) this.f24286b, view, false, false, true);
        x60Var.Q = true;
        pVar.D = qh.a4.c(x60Var, pVar.f27493b.f30099b0, pVar.getContext(), (org.telegram.ui.ActionBar.b6) this.f24286b, l3Var, true);
    }

    @Override
    public void dismiss() {
        ((xu) this.f24287c).dismiss();
    }

    @Override
    public boolean e0(t1 t1Var) {
        return false;
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public boolean f0(t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public void f1(qh.d1 d1Var, boolean z10) {
        ((qh.p) this.f24287c).f27493b.t1(d1Var, z10);
    }

    @Override
    public boolean f2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public void g(d5.y yVar) {
        w3.b0 b0Var = (w3.b0) this.f24287c;
        SparseArray sparseArray = b0Var.f48498f;
        d5.x xVar = (d5.x) this.f24286b;
        if (yVar.r() == 0 && (yVar.r() & 128) != 0) {
            yVar.D(6);
            int a2 = yVar.a() / 4;
            for (int i9 = 0; i9 < a2; i9++) {
                yVar.c(0, 4, xVar.f4405b);
                xVar.p(0);
                int i10 = xVar.i(16);
                xVar.s(3);
                if (i10 == 0) {
                    xVar.s(13);
                } else {
                    int i11 = xVar.i(13);
                    if (sparseArray.get(i11) == null) {
                        sparseArray.put(i11, new w3.z(new e0.i0(b0Var, i11)));
                        b0Var.f48503l++;
                    }
                }
            }
            if (b0Var.f48494a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        switch (this.f24285a) {
            case 10:
                return null;
            default:
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.f24287c;
                if (b6Var == null) {
                    return org.telegram.ui.ActionBar.f6.O0(str);
                }
                return b6Var.getDrawable(str);
        }
    }

    @Override
    public boolean h() {
        return true;
    }

    @Override
    public void h0() {
        int i9;
        qh.p pVar = (qh.p) this.f24287c;
        qh.o3 o3Var = pVar.f46606r;
        qh.s3 s3Var = pVar.f46607s;
        if (s3Var != null) {
            qh.c3 c3Var = o3Var.f46577j3;
            if (c3Var != null && c3Var.y() && o3Var.C4()) {
                i9 = 1;
            } else {
                i9 = 0;
            }
            if (s3Var.T == 2) {
                s3Var.U = i9;
            } else {
                s3Var.f(i9, true);
            }
            if (i9 != 0) {
                pVar.V();
            }
        }
        pVar.Y();
    }

    @Override
    public void h1(CharSequence charSequence) {
        ((qh.g0) this.f24286b).G(charSequence);
    }

    @Override
    public String i(t1 t1Var) {
        return null;
    }

    @Override
    public void i2() {
        d5.y yVar = (d5.y) this.f24287c;
        byte[] bArr = d5.f0.f4353f;
        yVar.getClass();
        yVar.A(bArr.length, bArr);
    }

    @Override
    public void j() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((dy) this.f24287c).finishPreviewFragment();
        }
    }

    @Override
    public boolean j0() {
        return false;
    }

    @Override
    public void k1(qh.d1 d1Var, int i9, int i10) {
        n9 D;
        qh.g0 g0Var = (qh.g0) this.f24286b;
        if (!((qh.h0) this.f24287c).d && i9 != i10 && (D = g0Var.D()) != null) {
            if (!D.y() || D.W != g0Var.H()) {
                d1Var.post(new kj(this, d1Var, i10, D, g0Var, i9));
            }
        }
    }

    @Override
    public int l0(t1 t1Var) {
        return 0;
    }

    @Override
    public void m1() {
        ((mt) this.f24286b).getText();
        ((g3) this.f24287c).b();
    }

    @Override
    public boolean n(float r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.e3.n(float):boolean");
    }

    @Override
    public void n0(qh.a aVar) {
        qh.p pVar = (qh.p) this.f24287c;
        ki kiVar = pVar.f27493b;
        org.telegram.ui.ActionBar.o2 o2Var = kiVar.f30099b0;
        if (o2Var != null && aVar != null && (aVar.f46269b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(o2Var)) {
            ki kiVar2 = new ki(pVar.getContext(), kiVar.f30099b0, false, false, false, null);
            kiVar2.V1 = new wa.a(21);
            kiVar2.L = true;
            kiVar2.f30158t1.setVisibility(8);
            kiVar2.f30145p2 = new hq0(pVar, aVar, kiVar2, 4);
            kiVar2.r1();
            kiVar2.show();
        }
    }

    @Override
    public void n1() {
        ((td.i) this.f24286b).c((td.j) this.f24287c);
    }

    @Override
    public boolean n2(int i9) {
        return false;
    }

    @Override
    public void o(float f10, float f11, int i9, int i10) {
        switch (this.f24285a) {
            case 10:
                org.telegram.ui.ActionBar.f6.q(f10, f11, i9, i10);
                return;
            default:
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.f24287c;
                if (b6Var == null) {
                    org.telegram.ui.ActionBar.f6.q(f10, f11, i9, i10);
                    return;
                } else {
                    b6Var.o(f10, f11, i9, i10);
                    return;
                }
        }
    }

    @Override
    public boolean o0() {
        return false;
    }

    @Override
    public void o1(org.telegram.ui.r6 r6Var, hh.a aVar, boolean z10) {
        xu xuVar = (xu) this.f24287c;
        wu wuVar = xuVar.T;
        if (aVar != null) {
            ((hh.b) this.f24286b).i(aVar);
            xuVar.f44604a0.d();
            hh.b bVar = xuVar.f44606c0;
            jx0[] jx0VarArr = xuVar.X;
            z1[] z1VarArr = xuVar.Y;
            z1 z1Var = z1VarArr[0];
            if (z1Var != null) {
                jx0 jx0Var = jx0VarArr[0];
                boolean z11 = bVar.f10796m;
                jx0Var.f29874c = z11;
                z1Var.c(z11, true);
            }
            z1 z1Var2 = z1VarArr[1];
            if (z1Var2 != null) {
                jx0 jx0Var2 = jx0VarArr[1];
                boolean z12 = bVar.f10797n;
                jx0Var2.f29874c = z12;
                z1Var2.c(z12, true);
            }
            z1 z1Var3 = z1VarArr[2];
            if (z1Var3 != null) {
                jx0 jx0Var3 = jx0VarArr[2];
                boolean z13 = bVar.f10798o;
                jx0Var3.f29874c = z13;
                z1Var3.c(z13, true);
            }
            z1 z1Var4 = z1VarArr[3];
            if (z1Var4 != null) {
                jx0 jx0Var4 = jx0VarArr[3];
                boolean z14 = bVar.f10799p;
                jx0Var4.f29874c = z14;
                z1Var4.c(z14, true);
            }
            z1 z1Var5 = z1VarArr[4];
            if (z1Var5 != null) {
                jx0 jx0Var5 = jx0VarArr[4];
                boolean z15 = bVar.f10800q;
                jx0Var5.f29874c = z15;
                z1Var5.c(z15, true);
            }
            xuVar.W.a(wuVar.d(), true);
            wuVar.c(true);
        }
    }

    @Override
    public void onContentChanged() {
        qh.p pVar = (qh.p) this.f24287c;
        qh.s3 s3Var = pVar.f46607s;
        if (s3Var != null) {
            s3Var.setSendLoading(pVar.f46606r.m3());
        }
        pVar.U(true);
        pVar.X();
        qh.d dVar = pVar.L;
        AndroidUtilities.cancelRunOnUIThread(dVar);
        AndroidUtilities.runOnUIThread(dVar, 1000L);
    }

    @Override
    public void onError(k61 k61Var, Exception exc) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f24287c;
        int i9 = secretMediaViewer.X;
        if (i9 > 0) {
            secretMediaViewer.X = i9 - 1;
            AndroidUtilities.runOnUIThread(new n21(4, this, (File) this.f24286b), 100L);
            return;
        }
        FileLog.e(exc);
    }

    @Override
    public void onRenderedFirstFrame(i3.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i9) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f24287c;
        p31 p31Var = secretMediaViewer.f36129e1;
        if (secretMediaViewer.f36167y != null && secretMediaViewer.f36125d0 != null) {
            AndroidUtilities.cancelRunOnUIThread(p31Var);
            AndroidUtilities.runOnUIThread(p31Var);
            if (i9 != 4 && i9 != 1) {
                try {
                    secretMediaViewer.f36119b.getWindow().addFlags(128);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            } else {
                try {
                    secretMediaViewer.f36119b.getWindow().clearFlags(128);
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
            }
            if (i9 == 3 && secretMediaViewer.f36163w.getVisibility() != 0) {
                secretMediaViewer.f36163w.setVisibility(0);
            }
            if (secretMediaViewer.f36167y.z() && i9 != 4) {
                if (!secretMediaViewer.A) {
                    secretMediaViewer.A = true;
                }
            } else if (secretMediaViewer.A) {
                secretMediaViewer.A = false;
                if (i9 == 4) {
                    secretMediaViewer.D = true;
                    if (secretMediaViewer.E) {
                        secretMediaViewer.e(true, !secretMediaViewer.f36144m1);
                        return;
                    }
                    secretMediaViewer.f36167y.M(0L, false);
                    secretMediaViewer.f36167y.D();
                }
            }
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onVideoSizeChanged(int i9, int i10, int i11, float f10) {
        float f11;
        c5.c cVar = ((SecretMediaViewer) this.f24287c).f36163w;
        if (cVar != null) {
            if (i11 != 90 && i11 != 270) {
                i10 = i9;
                i9 = i10;
            }
            if (i9 == 0) {
                f11 = 1.0f;
            } else {
                f11 = (i10 * f10) / i9;
            }
            cVar.a(f11, i11);
        }
    }

    @Override
    public boolean p() {
        return ((qh.g0) this.f24286b).K();
    }

    @Override
    public int p0(int i9) {
        switch (this.f24285a) {
            case 10:
                return N0(i9);
            default:
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.f24287c;
                if (b6Var == null) {
                    return org.telegram.ui.ActionBar.f6.w0(null, i9, false);
                }
                return b6Var.p0(i9);
        }
    }

    @Override
    public int q1(int i9) {
        switch (this.f24285a) {
            case 10:
                return N0(i9);
            default:
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.f24287c;
                if (b6Var == null) {
                    return org.telegram.ui.ActionBar.f6.w0(null, i9, false);
                }
                return b6Var.q1(i9);
        }
    }

    @Override
    public o9 q2() {
        return null;
    }

    @Override
    public boolean r0(org.telegram.ui.Components.t5 t5Var) {
        return false;
    }

    @Override
    public boolean r1() {
        return false;
    }

    @Override
    public void t() {
        int i9 = this.f24285a;
    }

    @Override
    public boolean t0() {
        switch (this.f24285a) {
            case 10:
                return false;
            default:
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.f24287c;
                if (b6Var == null) {
                    return org.telegram.ui.ActionBar.f6.a1();
                }
                return b6Var.t0();
        }
    }

    @Override
    public Object then(Task task) {
        t5.a aVar = (t5.a) this.f24286b;
        Bundle bundle = (Bundle) this.f24287c;
        aVar.getClass();
        if (!task.isSuccessful()) {
            return task;
        }
        Bundle bundle2 = (Bundle) task.getResult();
        if (bundle2 != null && bundle2.containsKey("google.messenger")) {
            return aVar.a(bundle).onSuccessTask(t5.m.f47702a, t5.b.f47680b);
        }
        return task;
    }

    public String toString() {
        switch (this.f24285a) {
            case 20:
                return "Bounds{lower=" + ((i0.b) this.f24286b) + " upper=" + ((i0.b) this.f24287c) + "}";
            case 27:
                StringBuilder sb2 = new StringBuilder(128);
                sb2.append("LoaderManager{");
                sb2.append(Integer.toHexString(System.identityHashCode(this)));
                sb2.append(" in ");
                Class<?> cls = ((androidx.lifecycle.t) this.f24286b).getClass();
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
    public void u(float f10) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((dy) this.f24287c).movePreviewFragment(f10);
        }
    }

    @Override
    public void v1() {
        qh.s3 s3Var = ((qh.p) this.f24287c).f46607s;
        if (s3Var != null) {
            int i9 = 0;
            s3Var.e(false, true);
            int i10 = s3Var.U;
            if (i10 != 2) {
                i9 = i10;
            }
            s3Var.f(i9, true);
        }
    }

    public void v2(String str, PrintWriter printWriter) {
        boolean z10;
        w1.b bVar = (w1.b) this.f24287c;
        if (bVar.d.f31c > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            int i9 = 0;
            while (true) {
                a0.l lVar = bVar.d;
                if (i9 < lVar.f31c) {
                    w1.a aVar = (w1.a) lVar.f30b[i9];
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(bVar.d.f29a[i9]);
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
                    printWriter.println(aVar.f48425l);
                    k5.d dVar = aVar.f48425l;
                    String str3 = str2 + "  ";
                    dVar.getClass();
                    printWriter.print(str3);
                    printWriter.print("mId=");
                    printWriter.print(0);
                    printWriter.print(" mListener=");
                    printWriter.println(dVar.f14645a);
                    if (dVar.f14646b || dVar.f14648e) {
                        printWriter.print(str3);
                        printWriter.print("mStarted=");
                        printWriter.print(dVar.f14646b);
                        printWriter.print(" mContentChanged=");
                        printWriter.print(dVar.f14648e);
                        printWriter.print(" mProcessingChange=");
                        printWriter.println(false);
                    }
                    if (dVar.f14647c || dVar.d) {
                        printWriter.print(str3);
                        printWriter.print("mAbandoned=");
                        printWriter.print(dVar.f14647c);
                        printWriter.print(" mReset=");
                        printWriter.println(dVar.d);
                    }
                    if (dVar.f14650g != null) {
                        printWriter.print(str3);
                        printWriter.print("mTask=");
                        printWriter.print(dVar.f14650g);
                        printWriter.print(" waiting=");
                        dVar.f14650g.getClass();
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
                    if (aVar.f48427n != null) {
                        printWriter.print(str2);
                        printWriter.print("mCallbacks=");
                        printWriter.println(aVar.f48427n);
                        c2.t tVar = aVar.f48427n;
                        tVar.getClass();
                        printWriter.print(str2 + "  ");
                        printWriter.print("mDeliveredData=");
                        printWriter.println(tVar.f2233b);
                    }
                    printWriter.print(str2);
                    printWriter.print("mData=");
                    k5.d dVar2 = aVar.f48425l;
                    Object obj2 = aVar.f1156e;
                    if (obj2 != androidx.lifecycle.z.f1152k) {
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
                    if (aVar.f1155c > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    printWriter.println(z10);
                    i9++;
                } else {
                    return;
                }
            }
        }
    }

    @Override
    public com.google.android.exoplayer2.upstream.s0 x0(p4.m mVar, p4.j jVar) {
        return new g5.b(9, ((p4.q) this.f24286b).x0(mVar, jVar), (List) this.f24287c);
    }

    @Override
    public boolean x1(t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public kg.d y() {
        switch (this.f24285a) {
            case 8:
                if (Build.VERSION.SDK_INT >= 29) {
                    kg.e eVar = new kg.e(this);
                    ((PhotoViewer) this.f24287c).V.add(eVar);
                    return eVar;
                }
                return new kg.f(this);
            default:
                return new kg.f(this);
        }
    }

    @Override
    public void y0(Bitmap bitmap) {
        e3 e3Var = (e3) this.f24286b;
        e3Var.f24287c = bitmap;
        p5.f fVar = (p5.f) this.f24287c;
        fVar.f45472l = e3Var;
        fVar.b();
    }

    @Override
    public boolean z0(MessageObject messageObject) {
        return true;
    }

    @Override
    public boolean z1() {
        return false;
    }

    public e3(int i9, Object obj, Object obj2) {
        this.f24285a = i9;
        this.f24287c = obj;
        this.f24286b = obj2;
    }

    @Override
    public void onRenderedFirstFrame() {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f24287c;
        if (secretMediaViewer.Y) {
            return;
        }
        secretMediaViewer.Y = true;
        secretMediaViewer.f36127e.invalidate();
    }

    public e3(Object obj, Object obj2, boolean z10, int i9) {
        this.f24285a = i9;
        this.f24286b = obj;
        this.f24287c = obj2;
    }

    public e3(IBinder iBinder) {
        this.f24285a = 21;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (interfaceDescriptor != "android.os.IMessenger" && (interfaceDescriptor == null || !interfaceDescriptor.equals("android.os.IMessenger"))) {
            if (interfaceDescriptor != "com.google.android.gms.iid.IMessengerCompat" && (interfaceDescriptor == null || !interfaceDescriptor.equals("com.google.android.gms.iid.IMessengerCompat"))) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.f24287c = new t5.g(iBinder);
            this.f24286b = null;
            return;
        }
        this.f24286b = new Messenger(iBinder);
        this.f24287c = null;
    }

    public e3(w5.a aVar) {
        this.f24285a = 15;
        this.f24286b = aVar == null ? null : aVar.f48764b;
    }

    public e3(org.telegram.ui.ActionBar.b6 b6Var) {
        this.f24285a = 12;
        this.f24286b = new SparseIntArray();
        this.f24287c = b6Var;
        r2();
    }

    public e3(View view) {
        this.f24285a = 4;
        v51 v51Var = new v51(this, view);
        this.f24286b = v51Var;
        view.addOnLayoutChangeListener(v51Var);
    }

    public e3(androidx.lifecycle.t tVar, androidx.lifecycle.t0 t0Var) {
        this.f24285a = 27;
        this.f24286b = tVar;
        this.f24287c = (w1.b) new a5.m(t0Var, w1.b.f48428f).n(w1.b.class);
    }

    public e3(d5.e0 e0Var) {
        this.f24285a = 28;
        this.f24286b = e0Var;
        this.f24287c = new d5.y();
    }

    private final void t2() {
    }

    private final void u2() {
    }

    @Override
    public void A0(t1 t1Var) {
    }

    @Override
    public void A1(t1 t1Var) {
    }

    @Override
    public void B(float f10) {
    }

    @Override
    public void B0() {
    }

    @Override
    public void C1(MessageObject messageObject) {
    }

    @Override
    public void D(boolean z10) {
    }

    @Override
    public void F(t1 t1Var) {
    }

    @Override
    public void F0(t1 t1Var) {
    }

    @Override
    public void G0(t1 t1Var) {
    }

    @Override
    public void H0(boolean z10) {
    }

    @Override
    public void H1() {
    }

    @Override
    public void I0(t1 t1Var) {
    }

    @Override
    public void I1() {
    }

    @Override
    public void J(t1 t1Var) {
    }

    @Override
    public void J0() {
    }

    @Override
    public void K(float f10) {
    }

    @Override
    public void K1(float f10) {
    }

    @Override
    public void L() {
    }

    @Override
    public void M0(t1 t1Var) {
    }

    @Override
    public void N(t1 t1Var) {
    }

    @Override
    public void P(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void R(t1 t1Var) {
    }

    @Override
    public void U(MessageObject messageObject) {
    }

    @Override
    public void U0(t1 t1Var) {
    }

    @Override
    public void W0(t1 t1Var) {
    }

    @Override
    public void X0(float f10) {
    }

    @Override
    public void Z1(float f10) {
    }

    @Override
    public void a0(t1 t1Var) {
    }

    @Override
    public void a2() {
    }

    @Override
    public void b2(t1 t1Var) {
    }

    @Override
    public void clear() {
    }

    @Override
    public void d1() {
    }

    @Override
    public void g0() {
    }

    @Override
    public void g2(t1 t1Var) {
    }

    @Override
    public void h2(float f10) {
    }

    @Override
    public void i0(int i9) {
    }

    @Override
    public void i1(long j10) {
    }

    @Override
    public void j1(boolean z10) {
    }

    @Override
    public void k(int i9) {
    }

    @Override
    public void k2() {
    }

    @Override
    public void m() {
    }

    @Override
    public void m0(t1 t1Var) {
    }

    @Override
    public void m2(long j10) {
    }

    @Override
    public void o2() {
    }

    @Override
    public void onSeekFinished(i3.a aVar) {
    }

    @Override
    public void onSeekStarted(i3.a aVar) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public void q0(String str) {
    }

    @Override
    public void r(t1 t1Var) {
    }

    public void r2() {
    }

    @Override
    public void s() {
    }

    @Override
    public void s1(t1 t1Var) {
    }

    @Override
    public void u1(float f10) {
    }

    @Override
    public void v(t1 t1Var) {
    }

    @Override
    public void v0(float f10) {
    }

    @Override
    public void w() {
    }

    @Override
    public void x(t1 t1Var) {
    }

    @Override
    public void z(t1 t1Var) {
    }

    public e3(re0 re0Var) {
        this.f24285a = 2;
        this.f24287c = re0Var;
        this.f24286b = new ib0(this, 9);
    }

    public e3(String str, String str2) {
        this.f24285a = 25;
        this.f24286b = str;
        this.f24287c = str2;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("userId should not be empty");
        }
    }

    public e3(String str) {
        this.f24285a = 17;
        this.f24287c = null;
        this.f24286b = str;
    }

    public e3(EditText editText) {
        this.f24285a = 16;
        this.f24286b = editText;
        q1.i iVar = new q1.i(editText);
        this.f24287c = iVar;
        editText.addTextChangedListener(iVar);
        if (q1.a.f45896b == null) {
            synchronized (q1.a.f45895a) {
                try {
                    if (q1.a.f45896b == null) {
                        ?? factory = new Editable.Factory();
                        try {
                            q1.a.f45897c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, q1.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        q1.a.f45896b = factory;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(q1.a.f45896b);
    }

    private final void w2(int i9, int i10) {
    }

    @Override
    public void L1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void M(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void O0(int i9, t1 t1Var) {
    }

    @Override
    public void P0(float f10, int i9) {
    }

    @Override
    public void Q(long j10, boolean z10) {
    }

    @Override
    public void Q0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void S(int i9, t1 t1Var) {
    }

    @Override
    public void Y1(float f10, int i9) {
    }

    @Override
    public void e1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void e2(t1 t1Var, long j10) {
    }

    @Override
    public void g1(t1 t1Var, TLRPC.Document document) {
    }

    @Override
    public void j2(int i9, long j10) {
    }

    @Override
    public void p1(float f10, int i9) {
    }

    @Override
    public void t1(t1 t1Var, boolean z10) {
    }

    @Override
    public void w1(t1 t1Var, eh.f fVar) {
    }

    @Override
    public void y1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    public e3(PremiumPreviewFragment premiumPreviewFragment) {
        this.f24285a = 9;
        this.f24287c = premiumPreviewFragment;
        this.f24286b = new Paint();
    }

    public e3(w3.b0 b0Var) {
        this.f24285a = 29;
        this.f24287c = b0Var;
        this.f24286b = new d5.x(new byte[4], 4);
    }

    public e3(z11 z11Var) {
        this.f24285a = 10;
        this.f24287c = z11Var;
    }

    public e3(PhotoViewer photoViewer) {
        this.f24285a = 8;
        this.f24287c = photoViewer;
        this.f24286b = new org.telegram.ui.Components.fa(photoViewer.X, photoViewer.f35580a0, 0, false);
    }

    @Override
    public void D0(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void E0(t1 t1Var, float f10, float f11) {
    }

    @Override
    public void R0(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void e(d5.e0 e0Var, m3.m mVar, w3.d0 d0Var) {
    }

    @Override
    public void k0(t1 t1Var, float f10, float f11) {
    }

    @Override
    public void l1(t1 t1Var, float f10, float f11) {
    }

    @Override
    public void p2(t1 t1Var, int i9, int i10) {
    }

    @Override
    public void s0(t1 t1Var, float f10, float f11) {
    }

    @Override
    public void M1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void q(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i9) {
    }

    @Override
    public void u0(t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public void w0(t1 t1Var, float f10, float f11, boolean z10) {
    }

    @Override
    public void S1(t1 t1Var, int i9, float f10, float f11, boolean z10) {
    }

    @Override
    public void l(t1 t1Var, ArrayList arrayList, int i9, int i10, int i11) {
    }

    @Override
    public void l2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override
    public void Z(t1 t1Var, TLRPC.Chat chat, int i9, float f10, float f11, boolean z10) {
    }

    @Override
    public void F1(MessageObject messageObject, String str, String str2, String str3, String str4, int i9, int i10) {
    }
}
