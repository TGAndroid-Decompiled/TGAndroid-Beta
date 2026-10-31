package org.telegram.ui.Wallet;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.messenger.cd;
import org.telegram.messenger.q20;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ix0;
import org.telegram.ui.Components.wb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.un;
public final class n0 implements Runnable {
    public final int f34920a = 0;
    public final q20 f34921b;
    public final long f34922c;
    public final long d;
    public final Object e;
    public final Object f34923f;
    public final Object h;

    public n0(p0 p0Var, String str, h0 h0Var, long j10, long j11, q20 q20Var) {
        this.e = p0Var;
        this.f34923f = str;
        this.h = h0Var;
        this.f34922c = j10;
        this.d = j11;
        this.f34921b = q20Var;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        String str;
        String str2;
        LinkedHashMap linkedHashMap = null;
        switch (this.f34920a) {
            case 0:
                p0 p0Var = (p0) this.e;
                String str3 = (String) this.f34923f;
                h0 h0Var = (h0) this.h;
                long j10 = this.f34922c;
                ?? r72 = this.d;
                q20 q20Var = this.f34921b;
                ArrayList arrayList2 = new ArrayList();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                try {
                    try {
                        try {
                        } catch (Exception e) {
                            e = e;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception e7) {
                    e = e7;
                    arrayList = arrayList2;
                    r72 = h0Var;
                    linkedHashMap = linkedHashMap2;
                } catch (Throwable th3) {
                    th = th3;
                    arrayList = arrayList2;
                    r72 = h0Var;
                    linkedHashMap = linkedHashMap2;
                }
                if (!str3.isEmpty() && h0Var != null && !h0Var.d()) {
                    Object obj = p0.f35000f;
                    synchronized (obj) {
                        try {
                            p0Var.c(j10);
                            try {
                                ix0 r10 = p0Var.r();
                                try {
                                    if (!((LinkedHashMap) r10.e).isEmpty() && r10.f27119a != r72) {
                                        throw new Exception("USER_MISMATCH");
                                    }
                                    r10.f27119a = r72;
                                    arrayList = arrayList2;
                                    try {
                                        p0Var.s(r10, str3, linkedHashMap2, arrayList, j10);
                                        linkedHashMap = linkedHashMap2;
                                    } catch (Exception e10) {
                                        e = e10;
                                        linkedHashMap = linkedHashMap2;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        linkedHashMap = linkedHashMap2;
                                    }
                                } catch (Exception e11) {
                                    e = e11;
                                    r72 = h0Var;
                                    linkedHashMap = linkedHashMap2;
                                    arrayList = arrayList2;
                                } catch (Throwable th5) {
                                    th = th5;
                                    r72 = h0Var;
                                    linkedHashMap = linkedHashMap2;
                                    arrayList = arrayList2;
                                }
                                try {
                                    ((LinkedHashMap) r10.e).put(str3, p0Var.j(r10, str3, h0Var, arrayList, j10));
                                    linkedHashMap.put(str3, h0Var);
                                    r10.f27120b = ConnectionsManager.getInstance(p0Var.f35004b).getCurrentTime();
                                    synchronized (obj) {
                                        p0Var.c(j10);
                                        p0Var.v(r10, linkedHashMap);
                                        p0Var.d(r10);
                                    }
                                    h0Var.close();
                                    for (h0 h0Var2 : linkedHashMap.values()) {
                                        h0Var2.close();
                                    }
                                    str2 = null;
                                } catch (Exception e12) {
                                    e = e12;
                                    r72 = h0Var;
                                    org.telegram.messenger.f8.g(e, true);
                                    if (e instanceof o0) {
                                        str = e.getMessage();
                                    } else {
                                        str = "STORAGE_BROKEN";
                                    }
                                    if (r72 != 0) {
                                        r72.close();
                                    }
                                    for (h0 h0Var3 : linkedHashMap.values()) {
                                        h0Var3.close();
                                    }
                                    str2 = str;
                                    p0Var.e(arrayList);
                                    org.telegram.messenger.i0.g3(new ag.a3(p0Var, q20Var, j10, str2, 13));
                                    return;
                                } catch (Throwable th6) {
                                    th = th6;
                                    r72 = h0Var;
                                    if (r72 != 0) {
                                        r72.close();
                                    }
                                    for (h0 h0Var4 : linkedHashMap.values()) {
                                        h0Var4.close();
                                    }
                                    p0Var.e(arrayList);
                                    throw th;
                                }
                                p0Var.e(arrayList);
                                org.telegram.messenger.i0.g3(new ag.a3(p0Var, q20Var, j10, str2, 13));
                                return;
                            } catch (Throwable th7) {
                                th = th7;
                                while (true) {
                                    try {
                                        throw th;
                                    } catch (Throwable th8) {
                                        th = th8;
                                    }
                                }
                            }
                        } catch (Throwable th9) {
                            th = th9;
                        }
                    }
                } else {
                    throw new Exception("INVALID_ARGUMENT");
                }
                break;
            default:
                rh.e4 e4Var = (rh.e4) this.e;
                q20 q20Var2 = this.f34921b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f34923f;
                TLObject tLObject = (TLObject) this.h;
                long j11 = this.f34922c;
                long j12 = this.d;
                q20Var2.a(tL_error);
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T != null) {
                    if (tLObject instanceof TLRPC.Updates) {
                        if (j11 >= 0 && j12 >= 0) {
                            un ha = un.ha(j11);
                            ha.whenFullyVisible(new rh.v1(e4Var, ha, j11, 0));
                            T.presentFragment(ha);
                        } else {
                            wb I = cc.a0(T).I(2131624027, cd.L0(2131749906, null), org.telegram.messenger.i0.W2(cd.a0(null, null, 2131749907, e4Var.z1(), org.telegram.messenger.o5.t(j11))));
                            I.f32145t = true;
                            I.j();
                        }
                    } else {
                        cc.a0(T).f0(tL_error, false);
                    }
                }
                rh.e6.y(e4Var.f21583a, false).P(j11);
                rh.e6.y(e4Var.f21583a, false).P(j12);
                return;
        }
    }

    public n0(rh.e4 e4Var, q20 q20Var, TLRPC.TL_error tL_error, TLObject tLObject, long j10, long j11) {
        this.e = e4Var;
        this.f34921b = q20Var;
        this.f34923f = tL_error;
        this.h = tLObject;
        this.f34922c = j10;
        this.d = j11;
    }
}
