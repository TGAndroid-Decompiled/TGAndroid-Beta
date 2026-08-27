package org.telegram.ui;

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
import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.EditTextBoldCursor;

public class i6 implements org.telegram.ui.Components.jt, lh.wb, org.telegram.ui.Cells.j1, i7, org.telegram.ui.Components.sk0, mm0, og.a, org.telegram.ui.ActionBar.c6, org.telegram.ui.Components.j61, p4.q, p5.a, rh.n3, rh.c1, Continuation, ud.d, m3.e {

    public final int f38983a;

    public Object f38984b;

    public Object f38985c;

    public i6(int i10) {
        this.f38983a = i10;
    }

    public static i6 q2(View view) {
        return new i6(view);
    }

    @Override
    public boolean A0(MessageObject messageObject) {
        return true;
    }

    @Override
    public org.telegram.ui.Components.b70 A1(View view) {
        rh.p pVar = (rh.p) this.f38985c;
        org.telegram.ui.Components.b70 b70Var = new org.telegram.ui.Components.b70(pVar, (org.telegram.ui.ActionBar.c6) this.f38984b, view, false, false, true);
        pVar.D = b70Var;
        return b70Var;
    }

    @Override
    public void B(int i10, int i11) {
        ((rh.g0) this.f38984b).y0(i10, i11);
    }

    @Override
    public void C(rh.m3 m3Var, View view) {
        rh.p pVar = (rh.p) this.f38985c;
        org.telegram.ui.Components.b70 b70Var = new org.telegram.ui.Components.b70(pVar, (org.telegram.ui.ActionBar.c6) this.f38984b, view, false, false, true);
        b70Var.Q = true;
        pVar.D = rh.b4.c(b70Var, pVar.f34900b.f28635b0, pVar.getContext(), (org.telegram.ui.ActionBar.c6) this.f38984b, m3Var, true);
    }

    @Override
    public void D0() {
        rh.t3 t3Var = ((rh.p) this.f38985c).f47325s;
        if (t3Var != null) {
            int i10 = t3Var.T;
            if (i10 == 2) {
                i10 = 0;
            }
            t3Var.U = i10;
            t3Var.e(false, false);
            t3Var.f(2, true);
        }
    }

    @Override
    public boolean E() {
        return false;
    }

    @Override
    public void E1(org.telegram.ui.Cells.s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        we.e.s(s1Var.getContext(), str);
    }

    @Override
    public ColorFilter F() {
        switch (this.f38983a) {
            case 11:
                return org.telegram.ui.ActionBar.g6.f23371v3;
            default:
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f38985c;
                return c6Var == null ? org.telegram.ui.ActionBar.g6.f23371v3 : c6Var.F();
        }
    }

    @Override
    public CharacterStyle F1(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    @Override
    public boolean G(float f10) {
        return false;
    }

    @Override
    public boolean H1(org.telegram.ui.Cells.s1 s1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public void J(s6 s6Var, ih.a aVar, boolean z10) {
        av avVar = (av) this.f38985c;
        zu zuVar = avVar.T;
        if (aVar != null) {
            ((ih.b) this.f38984b).i(aVar);
            avVar.f36637a0.d();
            ih.b bVar = avVar.f36639c0;
            org.telegram.ui.Components.lx0[] lx0VarArr = avVar.X;
            org.telegram.ui.Cells.y1[] y1VarArr = avVar.Y;
            org.telegram.ui.Cells.y1 y1Var = y1VarArr[0];
            if (y1Var != null) {
                org.telegram.ui.Components.lx0 lx0Var = lx0VarArr[0];
                boolean z11 = bVar.f11492m;
                lx0Var.f30485c = z11;
                y1Var.c(z11, true);
            }
            org.telegram.ui.Cells.y1 y1Var2 = y1VarArr[1];
            if (y1Var2 != null) {
                org.telegram.ui.Components.lx0 lx0Var2 = lx0VarArr[1];
                boolean z12 = bVar.f11493n;
                lx0Var2.f30485c = z12;
                y1Var2.c(z12, true);
            }
            org.telegram.ui.Cells.y1 y1Var3 = y1VarArr[2];
            if (y1Var3 != null) {
                org.telegram.ui.Components.lx0 lx0Var3 = lx0VarArr[2];
                boolean z13 = bVar.f11494o;
                lx0Var3.f30485c = z13;
                y1Var3.c(z13, true);
            }
            org.telegram.ui.Cells.y1 y1Var4 = y1VarArr[3];
            if (y1Var4 != null) {
                org.telegram.ui.Components.lx0 lx0Var4 = lx0VarArr[3];
                boolean z14 = bVar.f11495p;
                lx0Var4.f30485c = z14;
                y1Var4.c(z14, true);
            }
            org.telegram.ui.Cells.y1 y1Var5 = y1VarArr[4];
            if (y1Var5 != null) {
                org.telegram.ui.Components.lx0 lx0Var5 = lx0VarArr[4];
                boolean z15 = bVar.f11496q;
                lx0Var5.f30485c = z15;
                y1Var5.c(z15, true);
            }
            avVar.W.a(zuVar.d(), true);
            zuVar.c(true);
        }
    }

    @Override
    public void J1() {
        rh.p pVar = (rh.p) this.f38985c;
        pVar.X();
        pVar.Y();
    }

    @Override
    public boolean L0(long j10) {
        return ((org.telegram.ui.Components.kz0) this.f38985c).v;
    }

    @Override
    public boolean M1(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public Paint N(String str) {
        switch (this.f38983a) {
            case 11:
                return org.telegram.ui.ActionBar.g6.S0(str);
            default:
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f38985c;
                return c6Var == null ? org.telegram.ui.ActionBar.g6.S0(str) : c6Var.N(str);
        }
    }

    @Override
    public int N0(int i10) {
        switch (this.f38983a) {
            case 11:
                SparseIntArray sparseIntArray = (SparseIntArray) this.f38984b;
                return sparseIntArray != null ? sparseIntArray.get(i10) : org.telegram.ui.ActionBar.g6.w0(null, i10, false);
            default:
                SparseIntArray sparseIntArray2 = (SparseIntArray) this.f38984b;
                int iIndexOfKey = sparseIntArray2.indexOfKey(i10);
                if (iIndexOfKey >= 0) {
                    return sparseIntArray2.valueAt(iIndexOfKey);
                }
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f38985c;
                return c6Var == null ? org.telegram.ui.ActionBar.g6.w0(null, i10, false) : c6Var.N0(i10);
        }
    }

    @Override
    public void N1(rh.d1 d1Var, int i10, int i11) {
        org.telegram.ui.Cells.j9 j9VarN;
        rh.g0 g0Var = (rh.g0) this.f38984b;
        if (((rh.h0) this.f38985c).d || i10 == i11 || (j9VarN = g0Var.N()) == null) {
            return;
        }
        if (j9VarN.y() && j9VarN.W == g0Var.q0()) {
            return;
        }
        d1Var.post(new org.telegram.ui.Components.gj(this, d1Var, i11, j9VarN, g0Var, i10));
    }

    @Override
    public ou0 O1() {
        return null;
    }

    @Override
    public m3.d P1(m3.l lVar, long j10) {
        int iA;
        long position = lVar.getPosition();
        int iMin = (int) Math.min(20000L, lVar.getLength() - position);
        d5.z zVar = (d5.z) this.f38985c;
        zVar.z(iMin);
        lVar.b(0, iMin, zVar.f4858a);
        int i10 = -1;
        long j11 = -9223372036854775807L;
        int i11 = -1;
        while (zVar.a() >= 4) {
            if (p3.a.a(zVar.f4859b, zVar.f4858a) != 442) {
                zVar.D(1);
            } else {
                zVar.D(4);
                long jC = w3.v.c(zVar);
                if (jC != -9223372036854775807L) {
                    long jB = ((d5.f0) this.f38984b).b(jC);
                    if (jB > j10) {
                        return j11 == -9223372036854775807L ? new m3.d(-1, jB, position) : new m3.d(0, -9223372036854775807L, position + ((long) i11));
                    }
                    if (jB + 100000 > j10) {
                        return new m3.d(0, -9223372036854775807L, position + ((long) zVar.f4859b));
                    }
                    j11 = jB;
                    i11 = zVar.f4859b;
                }
                int i12 = zVar.f4860c;
                if (zVar.a() >= 10) {
                    zVar.D(9);
                    int iR = zVar.r() & 7;
                    if (zVar.a() >= iR) {
                        zVar.D(iR);
                        if (zVar.a() >= 4) {
                            if (p3.a.a(zVar.f4859b, zVar.f4858a) != 443) {
                                while (zVar.a() >= 4) {
                                    iA = p3.a.a(zVar.f4859b, zVar.f4858a);
                                    if (iA == 442) {
                                        break;
                                    }
                                    break;
                                }
                            }
                            zVar.D(4);
                            int iW = zVar.w();
                            if (zVar.a() < iW) {
                                zVar.C(i12);
                            } else {
                                zVar.D(iW);
                                while (zVar.a() >= 4) {
                                    iA = p3.a.a(zVar.f4859b, zVar.f4858a);
                                    if (iA == 442 || iA == 441 || (iA >>> 8) != 1) {
                                        break;
                                    }
                                    zVar.D(4);
                                    if (zVar.a() < 2) {
                                        zVar.C(i12);
                                        break;
                                    }
                                    zVar.C(Math.min(zVar.f4860c, zVar.f4859b + zVar.w()));
                                }
                            }
                        } else {
                            zVar.C(i12);
                        }
                    } else {
                        zVar.C(i12);
                    }
                } else {
                    zVar.C(i12);
                }
                i10 = zVar.f4859b;
            }
        }
        return j11 != -9223372036854775807L ? new m3.d(-2, j11, position + ((long) i10)) : m3.d.d;
    }

    @Override
    public boolean Q1(long j10) {
        return ((org.telegram.ui.Components.kz0) this.f38985c).f30234s;
    }

    @Override
    public void S(String str, String str2) {
        xm0 xm0Var = ((gm0) this.f38985c).f38446a;
        if ("PHONE_VERIFICATION_NEEDED".equals(str)) {
            xm0Var.O1(true, str2, (zk0) this.f38984b, this, xm0Var.f44534x1);
        } else {
            xm0Var.N1(true, false);
        }
    }

    @Override
    public boolean S0(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
        return false;
    }

    @Override
    public void S1(rh.o3 o3Var, View view) {
        rh.p pVar = (rh.p) this.f38985c;
        org.telegram.ui.Components.b70 b70Var = new org.telegram.ui.Components.b70(pVar, (org.telegram.ui.ActionBar.c6) this.f38984b, view, false, false, true);
        b70Var.Q = true;
        org.telegram.ui.ActionBar.n2 n2Var = pVar.f34900b.f28635b0;
        pVar.getContext();
        pVar.D = rh.b4.b(b70Var, n2Var, o3Var, true);
    }

    @Override
    public void T0(Canvas canvas, float f10, float f11, float f12, float f13) {
        switch (this.f38983a) {
            case 9:
                canvas.save();
                canvas.clipRect(f10, f11, f12, f13);
                ((PhotoViewer) this.f38985c).T0(canvas, (org.telegram.ui.Components.da) this.f38984b, -14277082, 855638016, false, true, true);
                canvas.drawColor(637534208);
                canvas.restore();
                break;
            default:
                Paint paint = (Paint) this.f38984b;
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f38985c;
                ag.i2 i2Var = premiumPreviewFragment.f35855i0;
                if (!premiumPreviewFragment.f35848d0) {
                    i2Var.d(0, (-premiumPreviewFragment.Z.getMeasuredWidth()) * 0.1f * premiumPreviewFragment.X, 0, premiumPreviewFragment.Z.getMeasuredWidth(), 0.0f, premiumPreviewFragment.Z.getMeasuredHeight());
                    canvas.drawRect(f10, f11, f12, f13, i2Var.f458f);
                } else {
                    paint.setColor(premiumPreviewFragment.getThemedColor(org.telegram.ui.ActionBar.g6.f22999a7));
                    canvas.drawRect(f10, f11, f12, f13, paint);
                }
                break;
        }
    }

    @Override
    public boolean T1(boolean z10) {
        return false;
    }

    @Override
    public boolean U(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public com.google.android.exoplayer2.upstream.s0 U1() {
        return new g5.b(7, ((p4.q) this.f38984b).U1(), (List) this.f38985c);
    }

    @Override
    public boolean V() {
        return false;
    }

    @Override
    public void V0() {
        rh.p pVar = (rh.p) this.f38985c;
        if (pVar.getCurrentItemTop() != pVar.E) {
            pVar.f34900b.X1(pVar, 0);
        }
        pVar.a0();
        rh.p.K(pVar);
    }

    @Override
    public boolean V1(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public boolean W(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override
    public boolean X() {
        return false;
    }

    @Override
    public boolean Y0(int i10, org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override
    public void Z0(float f10, boolean z10) {
        org.telegram.ui.Components.mb0 mb0Var = (org.telegram.ui.Components.mb0) this.f38984b;
        org.telegram.ui.Components.we0 we0Var = (org.telegram.ui.Components.we0) this.f38985c;
        org.telegram.ui.Components.m61 m61Var = we0Var.d;
        if (m61Var == null) {
            return;
        }
        long jQ = m61Var.q();
        float fMax = 2.8f / Math.max(60L, jQ);
        long j10 = (long) ((((f10 / (1.0f - fMax)) * fMax) + f10) * jQ);
        we0Var.f34169e = j10;
        we0Var.d.M(j10, !z10);
        if (z10) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(mb0Var);
        AndroidUtilities.runOnUIThread(mb0Var, 120L);
    }

    @Override
    public boolean a() {
        switch (this.f38983a) {
        }
        return org.telegram.ui.ActionBar.g6.I.q();
    }

    @Override
    public void a0(rh.t5 t5Var, String str) {
        rh.p pVar = (rh.p) this.f38985c;
        if (pVar.v == null) {
            org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f38984b;
            pVar.v = new m.t3(new di1(8, this, c6Var), c6Var);
        }
        pVar.v.f(t5Var, str);
    }

    @Override
    public boolean a1(MessageObject messageObject) {
        return org.telegram.messenger.rl.a(messageObject);
    }

    @Override
    public void b() {
        ((ud.i) this.f38984b).b();
    }

    @Override
    public int b0() {
        return 0;
    }

    @Override
    public void b1(int i10) {
        rh.p pVar = (rh.p) this.f38985c;
        pVar.f34900b.X1(pVar, i10);
        pVar.a0();
        rh.p.K(pVar);
    }

    @Override
    public boolean mo5c(float f10, float f11, int i10, View view) {
        gy gyVar = (gy) this.f38985c;
        if (view instanceof org.telegram.ui.Cells.p2) {
            org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view;
            if (p2Var.f24883j2) {
                gyVar.N4(p2Var.getDialogId(), view);
                return true;
            }
        }
        fw fwVar = gyVar.f38604v0;
        if (fwVar != null && fwVar.getVisibility() == 0 && gyVar.f38604v0.f35085n) {
            return false;
        }
        return gyVar.o4(view, i10, f10, ((fy) this.f38984b).d);
    }

    @Override
    public void c0(int i10) {
        rh.p.O((rh.p) this.f38985c, 74, i10);
    }

    @Override
    public void c1(int i10, int i11) {
        switch (this.f38983a) {
            case 11:
                break;
            default:
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f38985c;
                if (c6Var != null) {
                    c6Var.c1(i10, i11);
                }
                break;
        }
    }

    @Override
    public boolean c2(org.telegram.ui.Cells.s1 s1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public qg.a d0() {
        return null;
    }

    @Override
    public void dismiss() {
        ((av) this.f38985c).dismiss();
    }

    @Override
    public boolean e0(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public boolean f0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public boolean f1(rh.d1 d1Var) {
        return false;
    }

    @Override
    public void f2() {
        d5.z zVar = (d5.z) this.f38985c;
        byte[] bArr = d5.g0.f4799f;
        zVar.getClass();
        zVar.A(bArr.length, bArr);
    }

    @Override
    public void g(rh.d1 d1Var) {
        ((rh.g0) this.f38984b).g(d1Var);
    }

    @Override
    public void g1(CharSequence charSequence) {
        ((rh.g0) this.f38984b).S(charSequence);
    }

    @Override
    public Drawable getDrawable(String str) {
        switch (this.f38983a) {
            case 11:
                return null;
            default:
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f38985c;
                return c6Var == null ? org.telegram.ui.ActionBar.g6.O0(str) : c6Var.getDrawable(str);
        }
    }

    @Override
    public String h(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    @Override
    public void h0() {
        rh.p pVar = (rh.p) this.f38985c;
        rh.p3 p3Var = pVar.f47324r;
        rh.t3 t3Var = pVar.f47325s;
        if (t3Var != null) {
            rh.d3 d3Var = p3Var.f47352j3;
            int i10 = (d3Var != null && d3Var.y() && p3Var.C4()) ? 1 : 0;
            if (t3Var.T == 2) {
                t3Var.U = i10;
            } else {
                t3Var.f(i10, true);
            }
            if (i10 != 0) {
                pVar.W();
            }
        }
        pVar.Z();
    }

    @Override
    public void i() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((gy) this.f38985c).finishPreviewFragment();
        }
    }

    @Override
    public boolean j0() {
        return false;
    }

    @Override
    public void k1() {
        org.telegram.ui.Cells.d3 d3Var = (org.telegram.ui.Cells.d3) this.f38985c;
        ((org.telegram.ui.Components.lt) this.f38984b).getText();
        d3Var.b();
    }

    @Override
    public boolean k2(int i10) {
        return false;
    }

    @Override
    public boolean l(float f10) {
        boolean z10;
        rh.t3 t3Var = ((rh.p) this.f38985c).f47325s;
        if (t3Var != null) {
            FrameLayout frameLayout = t3Var.D;
            if (frameLayout == null) {
                z10 = false;
            } else {
                int[] iArr = new int[2];
                frameLayout.getLocationOnScreen(iArr);
                if (f10 >= iArr[1]) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            t3Var.e(z10, true);
            if (z10) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int l0(org.telegram.ui.Cells.s1 s1Var) {
        return 0;
    }

    @Override
    public void l1() {
        ((ud.i) this.f38984b).c((ud.j) this.f38985c);
    }

    @Override
    public void l2(rh.a aVar) {
        rh.p pVar = (rh.p) this.f38985c;
        org.telegram.ui.Components.gi giVar = pVar.f34900b;
        org.telegram.ui.ActionBar.n2 n2Var = giVar.f28635b0;
        if (n2Var != null && aVar != null && (aVar.f47028b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(n2Var)) {
            org.telegram.ui.Components.gi giVar2 = new org.telegram.ui.Components.gi(pVar.getContext(), giVar.f28635b0, false, false, false, null);
            giVar2.V1 = new za.b(21);
            giVar2.L = true;
            giVar2.f28694t1.setVisibility(8);
            giVar2.f28681p2 = new org.telegram.ui.Components.iq0(pVar, aVar, giVar2, 5);
            giVar2.r1();
            giVar2.show();
        }
    }

    @Override
    public void m(float f10, float f11, int i10, int i11) {
        switch (this.f38983a) {
            case 11:
                org.telegram.ui.ActionBar.g6.q(f10, f11, i10, i11);
                break;
            default:
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f38985c;
                if (c6Var != null) {
                    c6Var.m(f10, f11, i10, i11);
                } else {
                    org.telegram.ui.ActionBar.g6.q(f10, f11, i10, i11);
                }
                break;
        }
    }

    @Override
    public boolean n() {
        return ((rh.g0) this.f38984b).w0();
    }

    @Override
    public void n0(rh.d1 d1Var, boolean z10) {
        ((rh.p) this.f38985c).f34900b.t1(d1Var, z10);
    }

    @Override
    public boolean o0(rh.d1 d1Var) {
        return false;
    }

    @Override
    public int o1(int i10) {
        switch (this.f38983a) {
            case 11:
                return N0(i10);
            default:
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f38985c;
                return c6Var == null ? org.telegram.ui.ActionBar.g6.w0(null, i10, false) : c6Var.o1(i10);
        }
    }

    @Override
    public org.telegram.ui.Cells.k9 o2() {
        return null;
    }

    @Override
    public void onContentChanged() {
        rh.p pVar = (rh.p) this.f38985c;
        rh.t3 t3Var = pVar.f47325s;
        if (t3Var != null) {
            t3Var.setSendLoading(pVar.f47324r.m3());
        }
        pVar.V(true);
        pVar.Y();
        rh.d dVar = pVar.L;
        AndroidUtilities.cancelRunOnUIThread(dVar);
        AndroidUtilities.runOnUIThread(dVar, 1000L);
    }

    @Override
    public void onError(org.telegram.ui.Components.m61 m61Var, Exception exc) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f38985c;
        int i10 = secretMediaViewer.X;
        if (i10 <= 0) {
            FileLog.e(exc);
            return;
        }
        secretMediaViewer.X = i10 - 1;
        AndroidUtilities.runOnUIThread(new m21(4, this, (File) this.f38984b), 100L);
    }

    @Override
    public void onRenderedFirstFrame(i3.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f38985c;
        o31 o31Var = secretMediaViewer.f36132e1;
        if (secretMediaViewer.f36170y == null || secretMediaViewer.f36128d0 == null) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(o31Var);
        AndroidUtilities.runOnUIThread(o31Var);
        if (i10 == 4 || i10 == 1) {
            try {
                secretMediaViewer.f36122b.getWindow().clearFlags(128);
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        } else {
            try {
                secretMediaViewer.f36122b.getWindow().addFlags(128);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        if (i10 == 3 && secretMediaViewer.f36166w.getVisibility() != 0) {
            secretMediaViewer.f36166w.setVisibility(0);
        }
        if (secretMediaViewer.f36170y.z() && i10 != 4) {
            if (secretMediaViewer.A) {
                return;
            }
            secretMediaViewer.A = true;
        } else if (secretMediaViewer.A) {
            secretMediaViewer.A = false;
            if (i10 == 4) {
                secretMediaViewer.D = true;
                if (secretMediaViewer.E) {
                    secretMediaViewer.e(true, !secretMediaViewer.f36147m1);
                } else {
                    secretMediaViewer.f36170y.M(0L, false);
                    secretMediaViewer.f36170y.D();
                }
            }
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
        c5.c cVar = ((SecretMediaViewer) this.f38985c).f36166w;
        if (cVar != null) {
            if (i12 != 90 && i12 != 270) {
                i11 = i10;
                i10 = i11;
            }
            cVar.a(i10 == 0 ? 1.0f : (i11 * f10) / i10, i12);
        }
    }

    @Override
    public boolean p0() {
        return false;
    }

    @Override
    public int q0(int i10) {
        switch (this.f38983a) {
            case 11:
                return N0(i10);
            default:
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f38985c;
                return c6Var == null ? org.telegram.ui.ActionBar.g6.w0(null, i10, false) : c6Var.q0(i10);
        }
    }

    @Override
    public void q1() {
        rh.t3 t3Var = ((rh.p) this.f38985c).f47325s;
        if (t3Var != null) {
            t3Var.e(false, true);
            int i10 = t3Var.U;
            t3Var.f(i10 != 2 ? i10 : 0, true);
        }
    }

    @Override
    public void r() {
        int i10 = this.f38983a;
    }

    @Override
    public void r1(Editable editable) {
        ((rh.h0) this.f38985c).i();
        ((rh.g0) this.f38984b).I0();
    }

    @Override
    public void s(float f10) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((gy) this.f38985c).movePreviewFragment(f10);
        }
    }

    @Override
    public boolean s0(org.telegram.ui.Components.t5 t5Var) {
        return false;
    }

    @Override
    public boolean s1() {
        return false;
    }

    public void t2(String str, PrintWriter printWriter) {
        w1.b bVar = (w1.b) this.f38985c;
        if (bVar.d.f31c <= 0) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Loaders:");
        String str2 = str + "    ";
        int i10 = 0;
        while (true) {
            a0.l lVar = bVar.d;
            if (i10 >= lVar.f31c) {
                return;
            }
            w1.a aVar = (w1.a) lVar.f30b[i10];
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(bVar.d.f29a[i10]);
            printWriter.print(": ");
            printWriter.println(aVar.toString());
            printWriter.print(str2);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mArgs=");
            printWriter.println((Object) null);
            printWriter.print(str2);
            printWriter.print("mLoader=");
            printWriter.println(aVar.f48928l);
            k5.d dVar = aVar.f48928l;
            String str3 = str2 + "  ";
            dVar.getClass();
            printWriter.print(str3);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mListener=");
            printWriter.println(dVar.f14466a);
            if (dVar.f14467b || dVar.f14469e) {
                printWriter.print(str3);
                printWriter.print("mStarted=");
                printWriter.print(dVar.f14467b);
                printWriter.print(" mContentChanged=");
                printWriter.print(dVar.f14469e);
                printWriter.print(" mProcessingChange=");
                printWriter.println(false);
            }
            if (dVar.f14468c || dVar.d) {
                printWriter.print(str3);
                printWriter.print("mAbandoned=");
                printWriter.print(dVar.f14468c);
                printWriter.print(" mReset=");
                printWriter.println(dVar.d);
            }
            if (dVar.f14471g != null) {
                printWriter.print(str3);
                printWriter.print("mTask=");
                printWriter.print(dVar.f14471g);
                printWriter.print(" waiting=");
                dVar.f14471g.getClass();
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
            if (aVar.f48930n != null) {
                printWriter.print(str2);
                printWriter.print("mCallbacks=");
                printWriter.println(aVar.f48930n);
                c2.t tVar = aVar.f48930n;
                tVar.getClass();
                printWriter.print(str2 + "  ");
                printWriter.print("mDeliveredData=");
                printWriter.println(tVar.f2346b);
            }
            printWriter.print(str2);
            printWriter.print("mData=");
            k5.d dVar2 = aVar.f48928l;
            Object obj = aVar.f1653e;
            Object obj2 = obj != androidx.lifecycle.z.f1649k ? obj : null;
            dVar2.getClass();
            StringBuilder sb2 = new StringBuilder(64);
            if (obj2 == null) {
                sb2.append("null");
            } else {
                Class<?> cls = obj2.getClass();
                sb2.append(cls.getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(cls)));
                sb2.append("}");
            }
            printWriter.println(sb2.toString());
            printWriter.print(str2);
            printWriter.print("mStarted=");
            printWriter.println(aVar.f1652c > 0);
            i10++;
        }
    }

    @Override
    public Object then(Task task) {
        Bundle bundle;
        u5.a aVar = (u5.a) this.f38984b;
        Bundle bundle2 = (Bundle) this.f38985c;
        aVar.getClass();
        return (task.isSuccessful() && (bundle = (Bundle) task.getResult()) != null && bundle.containsKey("google.messenger")) ? aVar.a(bundle2).onSuccessTask(u5.l.f48424a, u5.b.f48405b) : task;
    }

    public String toString() {
        switch (this.f38983a) {
            case 18:
                return "Bounds{lower=" + ((i0.c) this.f38984b) + " upper=" + ((i0.c) this.f38985c) + "}";
            case 28:
                StringBuilder sb2 = new StringBuilder(128);
                sb2.append("LoaderManager{");
                sb2.append(Integer.toHexString(System.identityHashCode(this)));
                sb2.append(" in ");
                Class<?> cls = ((androidx.lifecycle.t) this.f38984b).getClass();
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
    public boolean u0() {
        switch (this.f38983a) {
            case 11:
                return false;
            default:
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f38985c;
                return c6Var == null ? org.telegram.ui.ActionBar.g6.a1() : c6Var.u0();
        }
    }

    @Override
    public lg.d w() {
        switch (this.f38983a) {
            case 9:
                if (Build.VERSION.SDK_INT < 29) {
                    return new lg.f(this);
                }
                lg.e eVar = new lg.e(this);
                ((PhotoViewer) this.f38985c).V.add(eVar);
                return eVar;
            default:
                return new lg.f(this);
        }
    }

    @Override
    public void w1(rh.d1 d1Var) {
        ((rh.g0) this.f38984b).m();
    }

    @Override
    public boolean x1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public com.google.android.exoplayer2.upstream.s0 y0(p4.m mVar, p4.j jVar) {
        return new g5.b(7, ((p4.q) this.f38984b).y0(mVar, jVar), (List) this.f38985c);
    }

    @Override
    public String z(long j10) {
        String strTrim = ((EditTextBoldCursor) this.f38984b).getText().toString().trim();
        if (strTrim.length() > 16) {
            strTrim = strTrim.substring(0, 16);
        }
        if (((org.telegram.ui.Components.kz0) this.f38985c).f30234s || !TextUtils.isEmpty(strTrim)) {
            return strTrim;
        }
        return null;
    }

    @Override
    public void z0(Bitmap bitmap) {
        i6 i6Var = (i6) this.f38984b;
        i6Var.f38985c = bitmap;
        p5.f fVar = (p5.f) this.f38985c;
        fVar.f45478l = i6Var;
        fVar.b();
    }

    @Override
    public boolean z1() {
        return false;
    }

    public i6(int i10, Object obj, Object obj2) {
        this.f38983a = i10;
        this.f38985c = obj;
        this.f38984b = obj2;
    }

    @Override
    public void onRenderedFirstFrame() {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f38985c;
        if (secretMediaViewer.Y) {
            return;
        }
        secretMediaViewer.Y = true;
        secretMediaViewer.f36130e.invalidate();
    }

    public i6(Object obj, Object obj2, boolean z10, int i10) {
        this.f38983a = i10;
        this.f38984b = obj;
        this.f38985c = obj2;
    }

    public i6(IBinder iBinder) throws RemoteException {
        this.f38983a = 22;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (interfaceDescriptor != "android.os.IMessenger" && (interfaceDescriptor == null || !interfaceDescriptor.equals("android.os.IMessenger"))) {
            if (interfaceDescriptor != "com.google.android.gms.iid.IMessengerCompat" && (interfaceDescriptor == null || !interfaceDescriptor.equals("com.google.android.gms.iid.IMessengerCompat"))) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.f38985c = new u5.f(iBinder);
            this.f38984b = null;
            return;
        }
        this.f38984b = new Messenger(iBinder);
        this.f38985c = null;
    }

    public i6(x5.a aVar) {
        this.f38983a = 16;
        this.f38984b = aVar == null ? null : aVar.f49364b;
    }

    public i6(org.telegram.ui.ActionBar.c6 c6Var) {
        this.f38983a = 13;
        this.f38984b = new SparseIntArray();
        this.f38985c = c6Var;
        p2();
    }

    public i6(View view) {
        this.f38983a = 5;
        org.telegram.ui.Components.x51 x51Var = new org.telegram.ui.Components.x51(this, view);
        this.f38984b = x51Var;
        view.addOnLayoutChangeListener(x51Var);
    }

    public i6(androidx.lifecycle.t tVar, androidx.lifecycle.t0 t0Var) {
        this.f38983a = 28;
        this.f38984b = tVar;
        this.f38985c = (w1.b) new a5.n(t0Var, w1.b.f48931f).l(w1.b.class);
    }

    public i6(d5.f0 f0Var) {
        this.f38983a = 29;
        this.f38984b = f0Var;
        this.f38985c = new d5.z();
    }

    private final void r2() {
    }

    private final void s2() {
    }

    @Override
    public void A(boolean z10) {
    }

    @Override
    public void B0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void B1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void C0() {
    }

    @Override
    public void C1(float f10) {
    }

    @Override
    public void D(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void D1(MessageObject messageObject) {
    }

    @Override
    public void G0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void H(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void H0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void I(float f10) {
    }

    @Override
    public void I0(boolean z10) {
    }

    @Override
    public void I1() {
    }

    @Override
    public void J0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void K() {
    }

    @Override
    public void K0() {
    }

    @Override
    public void M(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void M0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void O(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void Q(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void T(MessageObject messageObject) {
    }

    @Override
    public void U0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void W0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void X0(float f10) {
    }

    @Override
    public void X1(float f10) {
    }

    @Override
    public void Y1() {
    }

    @Override
    public void Z(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void Z1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void clear() {
    }

    @Override
    public void d1() {
    }

    @Override
    public void d2(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void e(int i10) {
    }

    @Override
    public void e2(float f10) {
    }

    @Override
    public void g0() {
    }

    @Override
    public void h2() {
    }

    @Override
    public void i0(int i10) {
    }

    @Override
    public void i1(long j10) {
    }

    @Override
    public void j1(boolean z10) {
    }

    @Override
    public void j2(long j10) {
    }

    @Override
    public void k() {
    }

    @Override
    public void m0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void m2() {
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
    public void p(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void p1(float f10) {
    }

    public void p2() {
    }

    @Override
    public void q() {
    }

    @Override
    public void r0(String str) {
    }

    @Override
    public void t(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void t1() {
    }

    @Override
    public void u() {
    }

    @Override
    public void u1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void v(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void w0(float f10) {
    }

    @Override
    public void x(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void y(float f10) {
    }

    public i6(org.telegram.ui.Components.we0 we0Var) {
        this.f38983a = 3;
        this.f38985c = we0Var;
        this.f38984b = new org.telegram.ui.Components.mb0(this, 9);
    }

    public i6(String str, String str2) {
        this.f38983a = 26;
        this.f38984b = str;
        this.f38985c = str2;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("userId should not be empty");
        }
    }

    public i6(String str) {
        this.f38983a = 19;
        this.f38985c = null;
        this.f38984b = str;
    }

    public i6(EditText editText) {
        this.f38983a = 17;
        this.f38984b = editText;
        q1.i iVar = new q1.i(editText);
        this.f38985c = iVar;
        editText.addTextChangedListener(iVar);
        if (q1.a.f46060b == null) {
            synchronized (q1.a.f46059a) {
                try {
                    if (q1.a.f46060b == null) {
                        q1.a aVar = new q1.a();
                        try {
                            q1.a.f46061c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, q1.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        q1.a.f46060b = aVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        editText.setEditableFactory(q1.a.f46060b);
    }

    private final void u2(int i10, int i11) {
    }

    @Override
    public void K1(org.telegram.ui.Cells.s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void L(org.telegram.ui.Cells.s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void O0(int i10, org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void P(long j10, boolean z10) {
    }

    @Override
    public void P0(float f10, int i10) {
    }

    @Override
    public void Q0(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void R(int i10, org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void W1(float f10, int i10) {
    }

    @Override
    public void a2(org.telegram.ui.Cells.s1 s1Var, fh.f fVar) {
    }

    @Override
    public void b2(org.telegram.ui.Cells.s1 s1Var, long j10) {
    }

    @Override
    public void e1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void g2(int i10, long j10) {
    }

    @Override
    public void h1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Document document) {
    }

    @Override
    public void n1(float f10, int i10) {
    }

    @Override
    public void v1(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
    }

    @Override
    public void y1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    public i6(PremiumPreviewFragment premiumPreviewFragment) {
        this.f38983a = 10;
        this.f38985c = premiumPreviewFragment;
        this.f38984b = new Paint();
    }

    public i6(y11 y11Var) {
        this.f38983a = 11;
        this.f38985c = y11Var;
    }

    public i6(PhotoViewer photoViewer) {
        this.f38983a = 9;
        this.f38985c = photoViewer;
        this.f38984b = new org.telegram.ui.Components.da(photoViewer.X, photoViewer.f35583a0, 0, false);
    }

    @Override
    public void E0(org.telegram.ui.Cells.s1 s1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void F0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
    }

    @Override
    public void R0(org.telegram.ui.Cells.s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void k0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
    }

    @Override
    public void m1(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
    }

    @Override
    public void n2(org.telegram.ui.Cells.s1 s1Var, int i10, int i11) {
    }

    @Override
    public void t0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
    }

    @Override
    public void L1(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void o(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void v0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public void x0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11, boolean z10) {
    }

    @Override
    public void R1(org.telegram.ui.Cells.s1 s1Var, int i10, float f10, float f11, boolean z10) {
    }

    @Override
    public void i2(org.telegram.ui.Cells.s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override
    public void j(org.telegram.ui.Cells.s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void Y(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z10) {
    }

    @Override
    public void G1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
