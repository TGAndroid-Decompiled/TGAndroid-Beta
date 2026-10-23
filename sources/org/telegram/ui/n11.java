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
public final class n11 extends org.telegram.ui.Components.lm0 {
    public final Context f39743c;
    public final ProxyListActivity d;

    public n11(ProxyListActivity proxyListActivity, Context context) {
        this.d = proxyListActivity;
        this.f39743c = context;
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
            if (b10 != i11 && b10 != proxyListActivity.f34076y) {
                if (b10 < proxyListActivity.f34071n || b10 >= proxyListActivity.f34072r) {
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
        kVar = ((org.telegram.ui.ActionBar.o2) proxyListActivity).actionBar;
        boolean s10 = kVar.s();
        if (size > 0) {
            proxyListActivity.E.a(size, s10);
            if (!s10) {
                kVar3 = ((org.telegram.ui.ActionBar.o2) proxyListActivity).actionBar;
                kVar3.N(null, null);
                int i10 = proxyListActivity.f34071n;
                r(i10, proxyListActivity.f34072r - i10, 2);
            }
        } else if (s10) {
            kVar2 = ((org.telegram.ui.ActionBar.o2) proxyListActivity).actionBar;
            kVar2.r();
            int i11 = proxyListActivity.f34071n;
            r(i11, proxyListActivity.f34072r - i11, 2);
        }
    }

    public final void F() {
        ProxyListActivity proxyListActivity = this.d;
        proxyListActivity.F.clear();
        int i10 = proxyListActivity.f34071n;
        r(i10, proxyListActivity.f34072r - i10, 1);
        E();
    }

    public final void G(int i10) {
        ProxyListActivity proxyListActivity = this.d;
        ArrayList arrayList = proxyListActivity.F;
        int i11 = proxyListActivity.f34071n;
        if (i10 >= i11 && i10 < proxyListActivity.f34072r) {
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
        if (i10 == proxyListActivity.f34070f) {
            return -1L;
        }
        if (i10 != proxyListActivity.f34073s) {
            i11 = proxyListActivity.proxyAddRow;
            if (i10 != i11) {
                i12 = proxyListActivity.useProxyRow;
                if (i10 == i12) {
                    return -4L;
                }
                if (i10 == proxyListActivity.h) {
                    return -6L;
                }
                if (i10 == proxyListActivity.f34076y) {
                    return -8L;
                }
                if (i10 == proxyListActivity.v) {
                    return -9L;
                }
                if (i10 == proxyListActivity.f34074w) {
                    return -10L;
                }
                if (i10 == proxyListActivity.f34075x) {
                    return -11L;
                }
                int i13 = proxyListActivity.f34071n;
                if (i10 >= i13 && i10 < proxyListActivity.f34072r) {
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
        if (i10 != proxyListActivity.f34070f && i10 != proxyListActivity.f34073s) {
            i11 = proxyListActivity.proxyAddRow;
            if (i10 != i11 && i10 != proxyListActivity.f34076y) {
                i12 = proxyListActivity.useProxyRow;
                if (i10 != i12 && i10 != proxyListActivity.v) {
                    if (i10 == proxyListActivity.h) {
                        return 2;
                    }
                    if (i10 == proxyListActivity.f34074w) {
                        return 6;
                    }
                    if (i10 >= proxyListActivity.f34071n && i10 < proxyListActivity.f34072r) {
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
        int i13 = b1Var.f46346f;
        View view = b1Var.f46343a;
        boolean z11 = true;
        switch (i13) {
            case 1:
                org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) view;
                org.telegram.ui.ActionBar.r6.W(caVar.getTextView(), org.telegram.ui.ActionBar.k6.G6, null);
                i11 = proxyListActivity.proxyAddRow;
                if (i10 == i11) {
                    String string = LocaleController.getString(R.string.AddProxy);
                    if (proxyListActivity.f34076y == -1) {
                        z11 = false;
                    }
                    caVar.b(string, z11);
                    return;
                } else if (i10 == proxyListActivity.f34076y) {
                    org.telegram.ui.ActionBar.r6.W(caVar.getTextView(), org.telegram.ui.ActionBar.k6.f21404p7, null);
                    caVar.b(LocaleController.getString(R.string.DeleteAllProxies), false);
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
                org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                i12 = proxyListActivity.useProxyRow;
                if (i10 == i12) {
                    String string2 = LocaleController.getString(R.string.UseProxySettings);
                    boolean z12 = proxyListActivity.d;
                    if (proxyListActivity.v == -1) {
                        z11 = false;
                    }
                    w8Var.f(string2, z12, z11);
                    return;
                } else if (i10 == proxyListActivity.v) {
                    w8Var.f(LocaleController.getString(R.string.UseProxyRotation), SharedConfig.proxyRotationEnabled, true);
                    return;
                } else {
                    return;
                }
            case 4:
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                if (i10 == proxyListActivity.f34075x) {
                    e9Var.setText(LocaleController.getString(R.string.ProxyRotationTimeoutInfo));
                    return;
                }
                return;
            case 5:
                o11 o11Var = (o11) view;
                SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) arrayList2.get(i10 - proxyListActivity.f34071n);
                o11Var.setProxy(proxyInfo);
                if (SharedConfig.currentProxy == proxyInfo) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                o11Var.setChecked(z10);
                boolean contains = arrayList.contains(arrayList2.get(i10 - proxyListActivity.f34071n));
                o11Var.h = contains;
                o11Var.f40046f.a(contains, false);
                o11Var.a(!arrayList.isEmpty(), false);
                return;
            case 6:
                if (i10 == proxyListActivity.f34074w) {
                    org.telegram.ui.Components.sw0 sw0Var = (org.telegram.ui.Components.sw0) view;
                    ArrayList arrayList3 = new ArrayList(ProxyRotationController.ROTATION_TIMEOUTS);
                    String[] strArr = new String[arrayList3.size()];
                    for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                        strArr[i14] = LocaleController.formatString(R.string.ProxyRotationTimeoutSeconds, arrayList3.get(i14));
                    }
                    sw0Var.setCallback(new wv(18));
                    sw0Var.b(SharedConfig.proxyRotationTimeout, null, strArr);
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
        int i12 = b1Var.f46346f;
        View view = b1Var.f46343a;
        if (i12 == 5 && !list.isEmpty()) {
            o11 o11Var = (o11) view;
            if (list.contains(1) && (contains = arrayList.contains(proxyListActivity.G.get(i10 - proxyListActivity.f34071n))) != o11Var.h) {
                o11Var.h = contains;
                o11Var.f40046f.a(contains, true);
            }
            if (list.contains(2)) {
                o11Var.a(!arrayList.isEmpty(), true);
            }
        } else if (b1Var.f46346f == 3 && list.contains(0)) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            i11 = proxyListActivity.useProxyRow;
            if (i10 == i11) {
                w8Var.setChecked(proxyListActivity.d);
            } else if (i10 == proxyListActivity.v) {
                w8Var.setChecked(SharedConfig.proxyRotationEnabled);
            }
        } else {
            v(b1Var, i10);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View b7Var;
        Context context = this.f39743c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 6) {
                                b7Var = new o11(this.d, context);
                                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21183d6, b7Var, null);
                            } else {
                                b7Var = new org.telegram.ui.Components.sw0(context, null);
                                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21183d6, b7Var, null);
                            }
                        } else {
                            b7Var = new org.telegram.ui.Cells.e9(context);
                        }
                    } else {
                        b7Var = new org.telegram.ui.Cells.w8(context);
                        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21183d6, b7Var, null);
                    }
                } else {
                    b7Var = new org.telegram.ui.Cells.l4(context);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21183d6, b7Var, null);
                }
            } else {
                b7Var = new org.telegram.ui.Cells.ca(context);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21183d6, b7Var, null);
            }
        } else {
            b7Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.b1) null);
        }
        return com.google.android.gms.internal.play_billing.k3.l(b7Var, b7Var, -1, -2);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        int i10;
        if (b1Var.f46346f == 3) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) b1Var.f46343a;
            int b10 = b1Var.b();
            ProxyListActivity proxyListActivity = this.d;
            i10 = proxyListActivity.useProxyRow;
            if (b10 == i10) {
                w8Var.setChecked(proxyListActivity.d);
            } else if (b10 == proxyListActivity.v) {
                w8Var.setChecked(SharedConfig.proxyRotationEnabled);
            }
        }
    }
}
