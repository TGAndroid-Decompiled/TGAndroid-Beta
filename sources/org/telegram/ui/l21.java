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
public final class l21 extends org.telegram.ui.Components.ul0 {
    public final Context f34527c;
    public final ProxyListActivity d;

    public l21(ProxyListActivity proxyListActivity, Context context) {
        this.d = proxyListActivity;
        this.f34527c = context;
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
        if (b10 != i10 && b10 != proxyListActivity.f30537w) {
            i11 = proxyListActivity.callsRow;
            if (b10 != i11) {
                i12 = proxyListActivity.proxyAddRow;
                if (b10 != i12 && b10 != proxyListActivity.F) {
                    if (b10 < proxyListActivity.f30535r || b10 >= proxyListActivity.f30536s) {
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
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        ProxyListActivity proxyListActivity = this.d;
        int size = proxyListActivity.H.size();
        lVar = ((org.telegram.ui.ActionBar.p2) proxyListActivity).actionBar;
        boolean s10 = lVar.s();
        if (size > 0) {
            proxyListActivity.G.a(size, s10);
            if (!s10) {
                lVar3 = ((org.telegram.ui.ActionBar.p2) proxyListActivity).actionBar;
                lVar3.O(null, null);
                int i10 = proxyListActivity.f30535r;
                r(i10, proxyListActivity.f30536s - i10, 2);
            }
        } else if (s10) {
            lVar2 = ((org.telegram.ui.ActionBar.p2) proxyListActivity).actionBar;
            lVar2.r();
            int i11 = proxyListActivity.f30535r;
            r(i11, proxyListActivity.f30536s - i11, 2);
        }
    }

    public final void F() {
        ProxyListActivity proxyListActivity = this.d;
        proxyListActivity.H.clear();
        int i10 = proxyListActivity.f30535r;
        r(i10, proxyListActivity.f30536s - i10, 1);
        E();
    }

    public final void G(int i10) {
        ProxyListActivity proxyListActivity = this.d;
        ArrayList arrayList = proxyListActivity.H;
        int i11 = proxyListActivity.f30535r;
        if (i10 >= i11 && i10 < proxyListActivity.f30536s) {
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
        return this.d.f30533f;
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
                    if (i10 == proxyListActivity.f30534n) {
                        return -6L;
                    }
                    if (i10 == proxyListActivity.F) {
                        return -8L;
                    }
                    if (i10 == proxyListActivity.f30537w) {
                        return -9L;
                    }
                    if (i10 == proxyListActivity.f30538x) {
                        return -10L;
                    }
                    if (i10 == proxyListActivity.f30539y) {
                        return -11L;
                    }
                    int i14 = proxyListActivity.f30535r;
                    if (i10 >= i14 && i10 < proxyListActivity.f30536s) {
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
                if (i10 != i12 && i10 != proxyListActivity.f30537w) {
                    i13 = proxyListActivity.callsRow;
                    if (i10 != i13) {
                        if (i10 == proxyListActivity.f30534n) {
                            return 2;
                        }
                        if (i10 == proxyListActivity.f30538x) {
                            return 6;
                        }
                        if (i10 >= proxyListActivity.f30535r && i10 < proxyListActivity.f30536s) {
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
        int i14 = c1Var.f41613f;
        View view = c1Var.f41610a;
        boolean z11 = true;
        switch (i14) {
            case 1:
                org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) view;
                gaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
                i11 = proxyListActivity.proxyAddRow;
                if (i10 == i11) {
                    String string = LocaleController.getString(R.string.AddProxy);
                    if (proxyListActivity.F == -1) {
                        z11 = false;
                    }
                    gaVar.b(string, z11);
                    return;
                } else if (i10 == proxyListActivity.F) {
                    gaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18144p7, false));
                    gaVar.b(LocaleController.getString(R.string.DeleteAllProxies), false);
                    return;
                } else {
                    return;
                }
            case 2:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (i10 == proxyListActivity.f30534n) {
                    m4Var.setText(LocaleController.getString(R.string.ProxyConnections));
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
                i12 = proxyListActivity.useProxyRow;
                if (i10 != i12) {
                    i13 = proxyListActivity.callsRow;
                    if (i10 == i13) {
                        x8Var.f(LocaleController.getString(R.string.UseProxyForCalls), proxyListActivity.e, false);
                        return;
                    } else if (i10 == proxyListActivity.f30537w) {
                        x8Var.f(LocaleController.getString(R.string.UseProxyRotation), SharedConfig.proxyRotationEnabled, true);
                        return;
                    } else {
                        return;
                    }
                }
                String string2 = LocaleController.getString(R.string.UseProxySettings);
                boolean z12 = proxyListActivity.d;
                if (proxyListActivity.f30537w == -1) {
                    z11 = false;
                }
                x8Var.f(string2, z12, z11);
                return;
            case 4:
                org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
                if (i10 == proxyListActivity.E) {
                    f9Var.setText(LocaleController.getString(R.string.UseProxyForCallsInfo));
                    return;
                } else if (i10 == proxyListActivity.f30539y) {
                    f9Var.setText(LocaleController.getString(R.string.ProxyRotationTimeoutInfo));
                    return;
                } else {
                    return;
                }
            case 5:
                m21 m21Var = (m21) view;
                SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) arrayList2.get(i10 - proxyListActivity.f30535r);
                m21Var.setProxy(proxyInfo);
                if (SharedConfig.currentProxy == proxyInfo) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                m21Var.setChecked(z10);
                boolean contains = arrayList.contains(arrayList2.get(i10 - proxyListActivity.f30535r));
                m21Var.h = contains;
                m21Var.f34828f.a(contains, false);
                m21Var.a(!arrayList.isEmpty(), false);
                return;
            case 6:
                if (i10 == proxyListActivity.f30538x) {
                    org.telegram.ui.Components.ew0 ew0Var = (org.telegram.ui.Components.ew0) view;
                    ArrayList arrayList3 = new ArrayList(ProxyRotationController.ROTATION_TIMEOUTS);
                    String[] strArr = new String[arrayList3.size()];
                    for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                        strArr[i15] = LocaleController.formatString(R.string.ProxyRotationTimeoutSeconds, arrayList3.get(i15));
                    }
                    ew0Var.setCallback(new js0(4));
                    ew0Var.b(SharedConfig.proxyRotationTimeout, null, strArr);
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
        int i13 = c1Var.f41613f;
        View view = c1Var.f41610a;
        if (i13 == 5 && !list.isEmpty()) {
            m21 m21Var = (m21) view;
            if (list.contains(1) && (contains = arrayList.contains(proxyListActivity.I.get(i10 - proxyListActivity.f30535r))) != m21Var.h) {
                m21Var.h = contains;
                m21Var.f34828f.a(contains, true);
            }
            if (list.contains(2)) {
                m21Var.a(!arrayList.isEmpty(), true);
            }
        } else if (c1Var.f41613f == 3 && list.contains(0)) {
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
            i11 = proxyListActivity.useProxyRow;
            if (i10 != i11) {
                i12 = proxyListActivity.callsRow;
                if (i10 == i12) {
                    x8Var.setChecked(proxyListActivity.e);
                    return;
                } else if (i10 == proxyListActivity.f30537w) {
                    x8Var.setChecked(SharedConfig.proxyRotationEnabled);
                    return;
                } else {
                    return;
                }
            }
            x8Var.setChecked(proxyListActivity.d);
        } else {
            v(c1Var, i10);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View c7Var;
        Context context = this.f34527c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 6) {
                                c7Var = new m21(this.d, context);
                                c7Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
                            } else {
                                c7Var = new org.telegram.ui.Components.ew0(context, null);
                                c7Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
                            }
                        } else {
                            c7Var = new org.telegram.ui.Cells.f9(context);
                        }
                    } else {
                        c7Var = new org.telegram.ui.Cells.x8(context);
                        c7Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
                    }
                } else {
                    c7Var = new org.telegram.ui.Cells.m4(context);
                    c7Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
                }
            } else {
                c7Var = new org.telegram.ui.Cells.ga(context);
                c7Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
            }
        } else {
            c7Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.r6) null);
        }
        return com.google.android.gms.internal.vision.e2.j(c7Var, c7Var, -1, -2);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        int i10;
        int i11;
        if (c1Var.f41613f == 3) {
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) c1Var.f41610a;
            int b10 = c1Var.b();
            ProxyListActivity proxyListActivity = this.d;
            i10 = proxyListActivity.useProxyRow;
            if (b10 != i10) {
                i11 = proxyListActivity.callsRow;
                if (b10 == i11) {
                    x8Var.setChecked(proxyListActivity.e);
                    return;
                } else if (b10 == proxyListActivity.f30537w) {
                    x8Var.setChecked(SharedConfig.proxyRotationEnabled);
                    return;
                } else {
                    return;
                }
            }
            x8Var.setChecked(proxyListActivity.d);
        }
    }
}
