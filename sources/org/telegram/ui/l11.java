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
public final class l11 extends org.telegram.ui.Components.hm0 {
    public final Context f38665c;
    public final ProxyListActivity d;

    public l11(ProxyListActivity proxyListActivity, Context context) {
        this.d = proxyListActivity;
        this.f38665c = context;
        C(true);
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10;
        int i11;
        int b10 = b1Var.b();
        ProxyListActivity proxyListActivity = this.d;
        i10 = proxyListActivity.useProxyRow;
        if (b10 != i10 && b10 != proxyListActivity.v) {
            i11 = proxyListActivity.proxyAddRow;
            if (b10 != i11 && b10 != proxyListActivity.f33760y) {
                if (b10 < proxyListActivity.f33755n || b10 >= proxyListActivity.f33756r) {
                    return false;
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
        int size = proxyListActivity.F.size();
        kVar = ((org.telegram.ui.ActionBar.n2) proxyListActivity).actionBar;
        boolean s10 = kVar.s();
        if (size > 0) {
            proxyListActivity.E.a(size, s10);
            if (!s10) {
                kVar3 = ((org.telegram.ui.ActionBar.n2) proxyListActivity).actionBar;
                kVar3.O(null, null);
                int i10 = proxyListActivity.f33755n;
                r(i10, proxyListActivity.f33756r - i10, 2);
            }
        } else if (s10) {
            kVar2 = ((org.telegram.ui.ActionBar.n2) proxyListActivity).actionBar;
            kVar2.r();
            int i11 = proxyListActivity.f33755n;
            r(i11, proxyListActivity.f33756r - i11, 2);
        }
    }

    public final void F() {
        ProxyListActivity proxyListActivity = this.d;
        proxyListActivity.F.clear();
        int i10 = proxyListActivity.f33755n;
        r(i10, proxyListActivity.f33756r - i10, 1);
        E();
    }

    public final void G(int i10) {
        ProxyListActivity proxyListActivity = this.d;
        ArrayList arrayList = proxyListActivity.F;
        int i11 = proxyListActivity.f33755n;
        if (i10 >= i11 && i10 < proxyListActivity.f33756r) {
            SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) proxyListActivity.G.get(i10 - i11);
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
        return this.d.e;
    }

    @Override
    public final long i(int i10) {
        int i11;
        int i12;
        ProxyListActivity proxyListActivity = this.d;
        if (i10 == proxyListActivity.f33754f) {
            return -1L;
        }
        if (i10 != proxyListActivity.f33757s) {
            i11 = proxyListActivity.proxyAddRow;
            if (i10 != i11) {
                i12 = proxyListActivity.useProxyRow;
                if (i10 == i12) {
                    return -4L;
                }
                if (i10 == proxyListActivity.h) {
                    return -6L;
                }
                if (i10 == proxyListActivity.f33760y) {
                    return -8L;
                }
                if (i10 == proxyListActivity.v) {
                    return -9L;
                }
                if (i10 == proxyListActivity.f33758w) {
                    return -10L;
                }
                if (i10 == proxyListActivity.f33759x) {
                    return -11L;
                }
                int i13 = proxyListActivity.f33755n;
                if (i10 >= i13 && i10 < proxyListActivity.f33756r) {
                    return ((SharedConfig.ProxyInfo) proxyListActivity.G.get(i10 - i13)).hashCode();
                }
                return -7L;
            }
            return -3L;
        }
        return -2L;
    }

    @Override
    public final int j(int i10) {
        int i11;
        int i12;
        ProxyListActivity proxyListActivity = this.d;
        if (i10 != proxyListActivity.f33754f && i10 != proxyListActivity.f33757s) {
            i11 = proxyListActivity.proxyAddRow;
            if (i10 != i11 && i10 != proxyListActivity.f33760y) {
                i12 = proxyListActivity.useProxyRow;
                if (i10 != i12 && i10 != proxyListActivity.v) {
                    if (i10 == proxyListActivity.h) {
                        return 2;
                    }
                    if (i10 == proxyListActivity.f33758w) {
                        return 6;
                    }
                    if (i10 >= proxyListActivity.f33755n && i10 < proxyListActivity.f33756r) {
                        return 5;
                    }
                    return 4;
                }
                return 3;
            }
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        int i12;
        boolean z10;
        ProxyListActivity proxyListActivity = this.d;
        ArrayList arrayList = proxyListActivity.F;
        ArrayList arrayList2 = proxyListActivity.G;
        int i13 = b1Var.f45913f;
        View view = b1Var.f45910a;
        boolean z11 = true;
        switch (i13) {
            case 1:
                org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) view;
                baVar.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false));
                i11 = proxyListActivity.proxyAddRow;
                if (i10 == i11) {
                    String string = LocaleController.getString(R.string.AddProxy);
                    if (proxyListActivity.f33760y == -1) {
                        z11 = false;
                    }
                    baVar.b(string, z11);
                    return;
                } else if (i10 == proxyListActivity.f33760y) {
                    baVar.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21207p7, false));
                    baVar.b(LocaleController.getString(R.string.DeleteAllProxies), false);
                    return;
                } else {
                    return;
                }
            case 2:
                org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                if (i10 == proxyListActivity.h) {
                    l4Var.setText(LocaleController.getString(R.string.ProxyConnections));
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
                i12 = proxyListActivity.useProxyRow;
                if (i10 == i12) {
                    String string2 = LocaleController.getString(R.string.UseProxySettings);
                    boolean z12 = proxyListActivity.d;
                    if (proxyListActivity.v == -1) {
                        z11 = false;
                    }
                    v8Var.f(string2, z12, z11);
                    return;
                } else if (i10 == proxyListActivity.v) {
                    v8Var.f(LocaleController.getString(R.string.UseProxyRotation), SharedConfig.proxyRotationEnabled, true);
                    return;
                } else {
                    return;
                }
            case 4:
                org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
                if (i10 == proxyListActivity.f33759x) {
                    d9Var.setText(LocaleController.getString(R.string.ProxyRotationTimeoutInfo));
                    return;
                }
                return;
            case 5:
                m11 m11Var = (m11) view;
                SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) arrayList2.get(i10 - proxyListActivity.f33755n);
                m11Var.setProxy(proxyInfo);
                if (SharedConfig.currentProxy == proxyInfo) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                m11Var.setChecked(z10);
                boolean contains = arrayList.contains(arrayList2.get(i10 - proxyListActivity.f33755n));
                m11Var.h = contains;
                m11Var.f38968f.a(contains, false);
                m11Var.a(!arrayList.isEmpty(), false);
                return;
            case 6:
                if (i10 == proxyListActivity.f33758w) {
                    org.telegram.ui.Components.nw0 nw0Var = (org.telegram.ui.Components.nw0) view;
                    ArrayList arrayList3 = new ArrayList(ProxyRotationController.ROTATION_TIMEOUTS);
                    String[] strArr = new String[arrayList3.size()];
                    for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                        strArr[i14] = LocaleController.formatString(R.string.ProxyRotationTimeoutSeconds, arrayList3.get(i14));
                    }
                    nw0Var.setCallback(new hk0(8));
                    nw0Var.b(SharedConfig.proxyRotationTimeout, null, strArr);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void w(s4.b1 b1Var, int i10, List list) {
        int i11;
        boolean contains;
        ProxyListActivity proxyListActivity = this.d;
        ArrayList arrayList = proxyListActivity.F;
        int i12 = b1Var.f45913f;
        View view = b1Var.f45910a;
        if (i12 == 5 && !list.isEmpty()) {
            m11 m11Var = (m11) view;
            if (list.contains(1) && (contains = arrayList.contains(proxyListActivity.G.get(i10 - proxyListActivity.f33755n))) != m11Var.h) {
                m11Var.h = contains;
                m11Var.f38968f.a(contains, true);
            }
            if (list.contains(2)) {
                m11Var.a(!arrayList.isEmpty(), true);
            }
        } else if (b1Var.f45913f == 3 && list.contains(0)) {
            org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
            i11 = proxyListActivity.useProxyRow;
            if (i10 == i11) {
                v8Var.setChecked(proxyListActivity.d);
            } else if (i10 == proxyListActivity.v) {
                v8Var.setChecked(SharedConfig.proxyRotationEnabled);
            }
        } else {
            v(b1Var, i10);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View z6Var;
        Context context = this.f38665c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 6) {
                                z6Var = new m11(this.d, context);
                                z6Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20986d6, false));
                            } else {
                                z6Var = new org.telegram.ui.Components.nw0(context, null);
                                z6Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20986d6, false));
                            }
                        } else {
                            z6Var = new org.telegram.ui.Cells.d9(context);
                        }
                    } else {
                        z6Var = new org.telegram.ui.Cells.v8(context);
                        z6Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20986d6, false));
                    }
                } else {
                    z6Var = new org.telegram.ui.Cells.l4(context);
                    z6Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20986d6, false));
                }
            } else {
                z6Var = new org.telegram.ui.Cells.ba(context);
                z6Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20986d6, false));
            }
        } else {
            z6Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c1) null);
        }
        return com.google.android.gms.internal.play_billing.k3.l(z6Var, z6Var, -1, -2);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        int i10;
        if (b1Var.f45913f == 3) {
            org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) b1Var.f45910a;
            int b10 = b1Var.b();
            ProxyListActivity proxyListActivity = this.d;
            i10 = proxyListActivity.useProxyRow;
            if (b10 == i10) {
                v8Var.setChecked(proxyListActivity.d);
            } else if (b10 == proxyListActivity.v) {
                v8Var.setChecked(SharedConfig.proxyRotationEnabled);
            }
        }
    }
}
