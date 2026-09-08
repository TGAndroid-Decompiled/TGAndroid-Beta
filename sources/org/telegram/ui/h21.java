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
public final class h21 extends org.telegram.ui.Components.kl0 {
    public final Context f36896c;
    public final ProxyListActivity d;

    public h21(ProxyListActivity proxyListActivity, Context context) {
        this.d = proxyListActivity;
        this.f36896c = context;
        C(true);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10;
        int i11;
        int i12;
        int b10 = c1Var.b();
        ProxyListActivity proxyListActivity = this.d;
        i10 = proxyListActivity.useProxyRow;
        if (b10 != i10 && b10 != proxyListActivity.f34072w) {
            i11 = proxyListActivity.callsRow;
            if (b10 != i11) {
                i12 = proxyListActivity.proxyAddRow;
                if (b10 != i12 && b10 != proxyListActivity.F) {
                    if (b10 < proxyListActivity.f34070r || b10 >= proxyListActivity.f34071s) {
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
        int size = proxyListActivity.H.size();
        kVar = ((org.telegram.ui.ActionBar.n2) proxyListActivity).actionBar;
        boolean s10 = kVar.s();
        if (size > 0) {
            proxyListActivity.G.a(size, s10);
            if (!s10) {
                kVar3 = ((org.telegram.ui.ActionBar.n2) proxyListActivity).actionBar;
                kVar3.O(null, null);
                int i10 = proxyListActivity.f34070r;
                r(i10, proxyListActivity.f34071s - i10, 2);
            }
        } else if (s10) {
            kVar2 = ((org.telegram.ui.ActionBar.n2) proxyListActivity).actionBar;
            kVar2.r();
            int i11 = proxyListActivity.f34070r;
            r(i11, proxyListActivity.f34071s - i11, 2);
        }
    }

    public final void F() {
        ProxyListActivity proxyListActivity = this.d;
        proxyListActivity.H.clear();
        int i10 = proxyListActivity.f34070r;
        r(i10, proxyListActivity.f34071s - i10, 1);
        E();
    }

    public final void G(int i10) {
        ProxyListActivity proxyListActivity = this.d;
        ArrayList arrayList = proxyListActivity.H;
        int i11 = proxyListActivity.f34070r;
        if (i10 >= i11 && i10 < proxyListActivity.f34071s) {
            SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) proxyListActivity.I.get(i10 - i11);
            if (arrayList.contains(proxyInfo)) {
                arrayList.remove(proxyInfo);
            } else {
                arrayList.add(proxyInfo);
            }
            n(i10, 1);
            E();
        }
    }

    @Override
    public final int h() {
        return this.d.f34068f;
    }

    @Override
    public final long i(int i10) {
        int i11;
        int i12;
        int i13;
        ProxyListActivity proxyListActivity = this.d;
        if (i10 == proxyListActivity.h) {
            return -1L;
        }
        if (i10 != proxyListActivity.v) {
            i11 = proxyListActivity.proxyAddRow;
            if (i10 != i11) {
                i12 = proxyListActivity.useProxyRow;
                if (i10 != i12) {
                    i13 = proxyListActivity.callsRow;
                    if (i10 == i13) {
                        return -5L;
                    }
                    if (i10 == proxyListActivity.f34069n) {
                        return -6L;
                    }
                    if (i10 == proxyListActivity.F) {
                        return -8L;
                    }
                    if (i10 == proxyListActivity.f34072w) {
                        return -9L;
                    }
                    if (i10 == proxyListActivity.f34073x) {
                        return -10L;
                    }
                    if (i10 == proxyListActivity.f34074y) {
                        return -11L;
                    }
                    int i14 = proxyListActivity.f34070r;
                    if (i10 >= i14 && i10 < proxyListActivity.f34071s) {
                        return ((SharedConfig.ProxyInfo) proxyListActivity.I.get(i10 - i14)).hashCode();
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
    public final int j(int i10) {
        int i11;
        int i12;
        int i13;
        ProxyListActivity proxyListActivity = this.d;
        if (i10 != proxyListActivity.h && i10 != proxyListActivity.v) {
            i11 = proxyListActivity.proxyAddRow;
            if (i10 != i11 && i10 != proxyListActivity.F) {
                i12 = proxyListActivity.useProxyRow;
                if (i10 != i12 && i10 != proxyListActivity.f34072w) {
                    i13 = proxyListActivity.callsRow;
                    if (i10 != i13) {
                        if (i10 == proxyListActivity.f34069n) {
                            return 2;
                        }
                        if (i10 == proxyListActivity.f34073x) {
                            return 6;
                        }
                        if (i10 >= proxyListActivity.f34070r && i10 < proxyListActivity.f34071s) {
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
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        int i12;
        int i13;
        boolean z10;
        ProxyListActivity proxyListActivity = this.d;
        ArrayList arrayList = proxyListActivity.H;
        ArrayList arrayList2 = proxyListActivity.I;
        int i14 = c1Var.f45770f;
        View view = c1Var.f45766a;
        boolean z11 = true;
        switch (i14) {
            case 1:
                org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) view;
                eaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
                i11 = proxyListActivity.proxyAddRow;
                if (i10 == i11) {
                    String string = LocaleController.getString(R.string.AddProxy);
                    if (proxyListActivity.F == -1) {
                        z11 = false;
                    }
                    eaVar.b(string, z11);
                    return;
                } else if (i10 == proxyListActivity.F) {
                    eaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20907p7, false));
                    eaVar.b(LocaleController.getString(R.string.DeleteAllProxies), false);
                    return;
                } else {
                    return;
                }
            case 2:
                org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                if (i10 == proxyListActivity.f34069n) {
                    l4Var.setText(LocaleController.getString(R.string.ProxyConnections));
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                i12 = proxyListActivity.useProxyRow;
                if (i10 != i12) {
                    i13 = proxyListActivity.callsRow;
                    if (i10 == i13) {
                        w8Var.f(LocaleController.getString(R.string.UseProxyForCalls), proxyListActivity.f34067e, false);
                        return;
                    } else if (i10 == proxyListActivity.f34072w) {
                        w8Var.f(LocaleController.getString(R.string.UseProxyRotation), SharedConfig.proxyRotationEnabled, true);
                        return;
                    } else {
                        return;
                    }
                }
                String string2 = LocaleController.getString(R.string.UseProxySettings);
                boolean z12 = proxyListActivity.d;
                if (proxyListActivity.f34072w == -1) {
                    z11 = false;
                }
                w8Var.f(string2, z12, z11);
                return;
            case 4:
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                if (i10 == proxyListActivity.E) {
                    e9Var.setText(LocaleController.getString(R.string.UseProxyForCallsInfo));
                    return;
                } else if (i10 == proxyListActivity.f34074y) {
                    e9Var.setText(LocaleController.getString(R.string.ProxyRotationTimeoutInfo));
                    return;
                } else {
                    return;
                }
            case 5:
                i21 i21Var = (i21) view;
                SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) arrayList2.get(i10 - proxyListActivity.f34070r);
                i21Var.setProxy(proxyInfo);
                if (SharedConfig.currentProxy == proxyInfo) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i21Var.setChecked(z10);
                boolean contains = arrayList.contains(arrayList2.get(i10 - proxyListActivity.f34070r));
                i21Var.h = contains;
                i21Var.f37202f.a(contains, false);
                i21Var.a(!arrayList.isEmpty(), false);
                return;
            case 6:
                if (i10 == proxyListActivity.f34073x) {
                    org.telegram.ui.Components.sv0 sv0Var = (org.telegram.ui.Components.sv0) view;
                    ArrayList arrayList3 = new ArrayList(ProxyRotationController.ROTATION_TIMEOUTS);
                    String[] strArr = new String[arrayList3.size()];
                    for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                        strArr[i15] = LocaleController.formatString(R.string.ProxyRotationTimeoutSeconds, arrayList3.get(i15));
                    }
                    sv0Var.setCallback(new sw0(3));
                    sv0Var.b(SharedConfig.proxyRotationTimeout, null, strArr);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void w(s4.c1 c1Var, int i10, List list) {
        int i11;
        int i12;
        boolean contains;
        ProxyListActivity proxyListActivity = this.d;
        ArrayList arrayList = proxyListActivity.H;
        int i13 = c1Var.f45770f;
        View view = c1Var.f45766a;
        if (i13 == 5 && !list.isEmpty()) {
            i21 i21Var = (i21) view;
            if (list.contains(1) && (contains = arrayList.contains(proxyListActivity.I.get(i10 - proxyListActivity.f34070r))) != i21Var.h) {
                i21Var.h = contains;
                i21Var.f37202f.a(contains, true);
            }
            if (list.contains(2)) {
                i21Var.a(!arrayList.isEmpty(), true);
            }
        } else if (c1Var.f45770f == 3 && list.contains(0)) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            i11 = proxyListActivity.useProxyRow;
            if (i10 != i11) {
                i12 = proxyListActivity.callsRow;
                if (i10 == i12) {
                    w8Var.setChecked(proxyListActivity.f34067e);
                    return;
                } else if (i10 == proxyListActivity.f34072w) {
                    w8Var.setChecked(SharedConfig.proxyRotationEnabled);
                    return;
                } else {
                    return;
                }
            }
            w8Var.setChecked(proxyListActivity.d);
        } else {
            v(c1Var, i10);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View a7Var;
        Context context = this.f36896c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 6) {
                                a7Var = new i21(this.d, context);
                                a7Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20690d6, false));
                            } else {
                                a7Var = new org.telegram.ui.Components.sv0(context, null);
                                a7Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20690d6, false));
                            }
                        } else {
                            a7Var = new org.telegram.ui.Cells.e9(context);
                        }
                    } else {
                        a7Var = new org.telegram.ui.Cells.w8(context);
                        a7Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20690d6, false));
                    }
                } else {
                    a7Var = new org.telegram.ui.Cells.l4(context);
                    a7Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20690d6, false));
                }
            } else {
                a7Var = new org.telegram.ui.Cells.ea(context);
                a7Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20690d6, false));
            }
        } else {
            a7Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.p6) null);
        }
        return com.google.android.gms.internal.vision.e2.l(a7Var, a7Var, -1, -2);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        int i10;
        int i11;
        if (c1Var.f45770f == 3) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) c1Var.f45766a;
            int b10 = c1Var.b();
            ProxyListActivity proxyListActivity = this.d;
            i10 = proxyListActivity.useProxyRow;
            if (b10 != i10) {
                i11 = proxyListActivity.callsRow;
                if (b10 == i11) {
                    w8Var.setChecked(proxyListActivity.f34067e);
                    return;
                } else if (b10 == proxyListActivity.f34072w) {
                    w8Var.setChecked(SharedConfig.proxyRotationEnabled);
                    return;
                } else {
                    return;
                }
            }
            w8Var.setChecked(proxyListActivity.d);
        }
    }
}
