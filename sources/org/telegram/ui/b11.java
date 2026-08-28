package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.ProxyRotationController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class b11 extends org.telegram.ui.Components.vk0 {
    public final Context f36595c;
    public final ProxyListActivity d;

    public b11(ProxyListActivity proxyListActivity, Context context) {
        this.d = proxyListActivity;
        this.f36595c = context;
        C(true);
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        int i9;
        int i10;
        int i11;
        int b10 = q1Var.b();
        ProxyListActivity proxyListActivity = this.d;
        i9 = proxyListActivity.useProxyRow;
        if (b10 != i9 && b10 != proxyListActivity.f36104w) {
            i10 = proxyListActivity.callsRow;
            if (b10 != i10) {
                i11 = proxyListActivity.proxyAddRow;
                if (b10 != i11 && b10 != proxyListActivity.B) {
                    if (b10 < proxyListActivity.f36102r || b10 >= proxyListActivity.f36103s) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final void E() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        ProxyListActivity proxyListActivity = this.d;
        int size = proxyListActivity.D.size();
        kVar = ((org.telegram.ui.ActionBar.o2) proxyListActivity).actionBar;
        boolean s10 = kVar.s();
        if (size > 0) {
            proxyListActivity.C.a(size, s10);
            if (!s10) {
                kVar3 = ((org.telegram.ui.ActionBar.o2) proxyListActivity).actionBar;
                kVar3.N(null, null);
                int i9 = proxyListActivity.f36102r;
                r(i9, proxyListActivity.f36103s - i9, 2);
            }
        } else if (s10) {
            kVar2 = ((org.telegram.ui.ActionBar.o2) proxyListActivity).actionBar;
            kVar2.r();
            int i10 = proxyListActivity.f36102r;
            r(i10, proxyListActivity.f36103s - i10, 2);
        }
    }

    public final void F() {
        ProxyListActivity proxyListActivity = this.d;
        proxyListActivity.D.clear();
        int i9 = proxyListActivity.f36102r;
        r(i9, proxyListActivity.f36103s - i9, 1);
        E();
    }

    public final void G(int i9) {
        ProxyListActivity proxyListActivity = this.d;
        ArrayList arrayList = proxyListActivity.D;
        int i10 = proxyListActivity.f36102r;
        if (i9 >= i10 && i9 < proxyListActivity.f36103s) {
            SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) proxyListActivity.E.get(i9 - i10);
            if (arrayList.contains(proxyInfo)) {
                arrayList.remove(proxyInfo);
            } else {
                arrayList.add(proxyInfo);
            }
            n(i9, 1);
            E();
        }
    }

    @Override
    public final int h() {
        return this.d.f36100f;
    }

    @Override
    public final long i(int i9) {
        int i10;
        int i11;
        int i12;
        ProxyListActivity proxyListActivity = this.d;
        if (i9 == proxyListActivity.h) {
            return -1L;
        }
        if (i9 != proxyListActivity.v) {
            i10 = proxyListActivity.proxyAddRow;
            if (i9 != i10) {
                i11 = proxyListActivity.useProxyRow;
                if (i9 != i11) {
                    i12 = proxyListActivity.callsRow;
                    if (i9 == i12) {
                        return -5L;
                    }
                    if (i9 == proxyListActivity.f36101n) {
                        return -6L;
                    }
                    if (i9 == proxyListActivity.B) {
                        return -8L;
                    }
                    if (i9 == proxyListActivity.f36104w) {
                        return -9L;
                    }
                    if (i9 == proxyListActivity.f36105x) {
                        return -10L;
                    }
                    if (i9 == proxyListActivity.f36106y) {
                        return -11L;
                    }
                    int i13 = proxyListActivity.f36102r;
                    if (i9 >= i13 && i9 < proxyListActivity.f36103s) {
                        return ((SharedConfig.ProxyInfo) proxyListActivity.E.get(i9 - i13)).hashCode();
                    }
                    return -7L;
                }
                return -4L;
            }
            return -3L;
        }
        return -2L;
    }

    @Override
    public final int j(int i9) {
        int i10;
        int i11;
        int i12;
        ProxyListActivity proxyListActivity = this.d;
        if (i9 != proxyListActivity.h && i9 != proxyListActivity.v) {
            i10 = proxyListActivity.proxyAddRow;
            if (i9 != i10 && i9 != proxyListActivity.B) {
                i11 = proxyListActivity.useProxyRow;
                if (i9 != i11 && i9 != proxyListActivity.f36104w) {
                    i12 = proxyListActivity.callsRow;
                    if (i9 != i12) {
                        if (i9 == proxyListActivity.f36101n) {
                            return 2;
                        }
                        if (i9 == proxyListActivity.f36105x) {
                            return 6;
                        }
                        if (i9 >= proxyListActivity.f36102r && i9 < proxyListActivity.f36103s) {
                            return 5;
                        }
                        return 4;
                    }
                    return 3;
                }
                return 3;
            }
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        int i11;
        int i12;
        boolean z10;
        ProxyListActivity proxyListActivity = this.d;
        ArrayList arrayList = proxyListActivity.D;
        ArrayList arrayList2 = proxyListActivity.E;
        int i13 = q1Var.f5505f;
        View view = q1Var.f5501a;
        boolean z11 = true;
        switch (i13) {
            case 1:
                org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) view;
                baVar.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
                i10 = proxyListActivity.proxyAddRow;
                if (i9 == i10) {
                    String string = LocaleController.getString(R.string.AddProxy);
                    if (proxyListActivity.B == -1) {
                        z11 = false;
                    }
                    baVar.b(string, z11);
                    return;
                } else if (i9 == proxyListActivity.B) {
                    baVar.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23212p7, false));
                    baVar.b(LocaleController.getString(R.string.DeleteAllProxies), false);
                    return;
                } else {
                    return;
                }
            case 2:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (i9 == proxyListActivity.f36101n) {
                    m4Var.setText(LocaleController.getString(R.string.ProxyConnections));
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
                i11 = proxyListActivity.useProxyRow;
                if (i9 != i11) {
                    i12 = proxyListActivity.callsRow;
                    if (i9 == i12) {
                        t8Var.f(LocaleController.getString(R.string.UseProxyForCalls), proxyListActivity.f36099e, false);
                        return;
                    } else if (i9 == proxyListActivity.f36104w) {
                        t8Var.f(LocaleController.getString(R.string.UseProxyRotation), SharedConfig.proxyRotationEnabled, true);
                        return;
                    } else {
                        return;
                    }
                }
                String string2 = LocaleController.getString(R.string.UseProxySettings);
                boolean z12 = proxyListActivity.d;
                if (proxyListActivity.f36104w == -1) {
                    z11 = false;
                }
                t8Var.f(string2, z12, z11);
                return;
            case 4:
                org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
                if (i9 == proxyListActivity.A) {
                    b9Var.setText(LocaleController.getString(R.string.UseProxyForCallsInfo));
                    return;
                } else if (i9 == proxyListActivity.f36106y) {
                    b9Var.setText(LocaleController.getString(R.string.ProxyRotationTimeoutInfo));
                    return;
                } else {
                    return;
                }
            case 5:
                c11 c11Var = (c11) view;
                SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) arrayList2.get(i9 - proxyListActivity.f36102r);
                c11Var.setProxy(proxyInfo);
                if (SharedConfig.currentProxy == proxyInfo) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                c11Var.setChecked(z10);
                boolean contains = arrayList.contains(arrayList2.get(i9 - proxyListActivity.f36102r));
                c11Var.h = contains;
                c11Var.f37041f.a(contains, false);
                c11Var.a(!arrayList.isEmpty(), false);
                return;
            case 6:
                if (i9 == proxyListActivity.f36105x) {
                    org.telegram.ui.Components.bv0 bv0Var = (org.telegram.ui.Components.bv0) view;
                    ArrayList arrayList3 = new ArrayList(ProxyRotationController.ROTATION_TIMEOUTS);
                    String[] strArr = new String[arrayList3.size()];
                    for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                        strArr[i14] = LocaleController.formatString(R.string.ProxyRotationTimeoutSeconds, arrayList3.get(i14));
                    }
                    bv0Var.setCallback(new fk0(8));
                    bv0Var.b(SharedConfig.proxyRotationTimeout, null, strArr);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void w(f2.q1 q1Var, int i9, List list) {
        int i10;
        int i11;
        boolean contains;
        ProxyListActivity proxyListActivity = this.d;
        ArrayList arrayList = proxyListActivity.D;
        int i12 = q1Var.f5505f;
        View view = q1Var.f5501a;
        if (i12 == 5 && !list.isEmpty()) {
            c11 c11Var = (c11) view;
            if (list.contains(1) && (contains = arrayList.contains(proxyListActivity.E.get(i9 - proxyListActivity.f36102r))) != c11Var.h) {
                c11Var.h = contains;
                c11Var.f37041f.a(contains, true);
            }
            if (list.contains(2)) {
                c11Var.a(!arrayList.isEmpty(), true);
            }
        } else if (q1Var.f5505f == 3 && list.contains(0)) {
            org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
            i10 = proxyListActivity.useProxyRow;
            if (i9 != i10) {
                i11 = proxyListActivity.callsRow;
                if (i9 == i11) {
                    t8Var.setChecked(proxyListActivity.f36099e);
                    return;
                } else if (i9 == proxyListActivity.f36104w) {
                    t8Var.setChecked(SharedConfig.proxyRotationEnabled);
                    return;
                } else {
                    return;
                }
            }
            t8Var.setChecked(proxyListActivity.d);
        } else {
            v(q1Var, i9);
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View z6Var;
        Context context = this.f36595c;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 != 4) {
                            if (i9 != 6) {
                                z6Var = new c11(this.d, context);
                                z6Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
                            } else {
                                z6Var = new org.telegram.ui.Components.bv0(context, null);
                                z6Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
                            }
                        } else {
                            z6Var = new org.telegram.ui.Cells.b9(context);
                        }
                    } else {
                        z6Var = new org.telegram.ui.Cells.t8(context);
                        z6Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
                    }
                } else {
                    z6Var = new org.telegram.ui.Cells.m4(context);
                    z6Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
                }
            } else {
                z6Var = new org.telegram.ui.Cells.ba(context);
                z6Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
            }
        } else {
            z6Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
        }
        return j3.r0.s(z6Var, z6Var, -1, -2);
    }

    @Override
    public final void y(f2.q1 q1Var) {
        int i9;
        int i10;
        if (q1Var.f5505f == 3) {
            org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) q1Var.f5501a;
            int b10 = q1Var.b();
            ProxyListActivity proxyListActivity = this.d;
            i9 = proxyListActivity.useProxyRow;
            if (b10 != i9) {
                i10 = proxyListActivity.callsRow;
                if (b10 == i10) {
                    t8Var.setChecked(proxyListActivity.f36099e);
                    return;
                } else if (b10 == proxyListActivity.f36104w) {
                    t8Var.setChecked(SharedConfig.proxyRotationEnabled);
                    return;
                } else {
                    return;
                }
            }
            t8Var.setChecked(proxyListActivity.d);
        }
    }
}
