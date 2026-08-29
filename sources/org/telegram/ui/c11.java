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
public final class c11 extends org.telegram.ui.Components.il0 {
    public final Context f36958c;
    public final ProxyListActivity d;

    public c11(ProxyListActivity proxyListActivity, Context context) {
        this.d = proxyListActivity;
        this.f36958c = context;
        C(true);
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        int i10;
        int i11;
        int i12;
        int b10 = n1Var.b();
        ProxyListActivity proxyListActivity = this.d;
        i10 = proxyListActivity.useProxyRow;
        if (b10 != i10 && b10 != proxyListActivity.f36169w) {
            i11 = proxyListActivity.callsRow;
            if (b10 != i11) {
                i12 = proxyListActivity.proxyAddRow;
                if (b10 != i12 && b10 != proxyListActivity.B) {
                    if (b10 < proxyListActivity.f36167r || b10 >= proxyListActivity.f36168s) {
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
        int size = proxyListActivity.D.size();
        lVar = ((org.telegram.ui.ActionBar.o2) proxyListActivity).actionBar;
        boolean s10 = lVar.s();
        if (size > 0) {
            proxyListActivity.C.a(size, s10);
            if (!s10) {
                lVar3 = ((org.telegram.ui.ActionBar.o2) proxyListActivity).actionBar;
                lVar3.O(null, null);
                int i10 = proxyListActivity.f36167r;
                r(i10, proxyListActivity.f36168s - i10, 2);
            }
        } else if (s10) {
            lVar2 = ((org.telegram.ui.ActionBar.o2) proxyListActivity).actionBar;
            lVar2.r();
            int i11 = proxyListActivity.f36167r;
            r(i11, proxyListActivity.f36168s - i11, 2);
        }
    }

    public final void F() {
        ProxyListActivity proxyListActivity = this.d;
        proxyListActivity.D.clear();
        int i10 = proxyListActivity.f36167r;
        r(i10, proxyListActivity.f36168s - i10, 1);
        E();
    }

    public final void G(int i10) {
        ProxyListActivity proxyListActivity = this.d;
        ArrayList arrayList = proxyListActivity.D;
        int i11 = proxyListActivity.f36167r;
        if (i10 >= i11 && i10 < proxyListActivity.f36168s) {
            SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) proxyListActivity.E.get(i10 - i11);
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
        return this.d.f36165f;
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
                    if (i10 == proxyListActivity.f36166n) {
                        return -6L;
                    }
                    if (i10 == proxyListActivity.B) {
                        return -8L;
                    }
                    if (i10 == proxyListActivity.f36169w) {
                        return -9L;
                    }
                    if (i10 == proxyListActivity.f36170x) {
                        return -10L;
                    }
                    if (i10 == proxyListActivity.f36171y) {
                        return -11L;
                    }
                    int i14 = proxyListActivity.f36167r;
                    if (i10 >= i14 && i10 < proxyListActivity.f36168s) {
                        return ((SharedConfig.ProxyInfo) proxyListActivity.E.get(i10 - i14)).hashCode();
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
            if (i10 != i11 && i10 != proxyListActivity.B) {
                i12 = proxyListActivity.useProxyRow;
                if (i10 != i12 && i10 != proxyListActivity.f36169w) {
                    i13 = proxyListActivity.callsRow;
                    if (i10 != i13) {
                        if (i10 == proxyListActivity.f36166n) {
                            return 2;
                        }
                        if (i10 == proxyListActivity.f36170x) {
                            return 6;
                        }
                        if (i10 >= proxyListActivity.f36167r && i10 < proxyListActivity.f36168s) {
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
    public final void v(f2.n1 n1Var, int i10) {
        int i11;
        int i12;
        int i13;
        boolean z10;
        ProxyListActivity proxyListActivity = this.d;
        ArrayList arrayList = proxyListActivity.D;
        ArrayList arrayList2 = proxyListActivity.E;
        int i14 = n1Var.f6436f;
        View view = n1Var.f6432a;
        boolean z11 = true;
        switch (i14) {
            case 1:
                org.telegram.ui.Cells.y9 y9Var = (org.telegram.ui.Cells.y9) view;
                y9Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
                i11 = proxyListActivity.proxyAddRow;
                if (i10 == i11) {
                    String string = LocaleController.getString(R.string.AddProxy);
                    if (proxyListActivity.B == -1) {
                        z11 = false;
                    }
                    y9Var.b(string, z11);
                    return;
                } else if (i10 == proxyListActivity.B) {
                    y9Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23279p7, false));
                    y9Var.b(LocaleController.getString(R.string.DeleteAllProxies), false);
                    return;
                } else {
                    return;
                }
            case 2:
                org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
                if (i10 == proxyListActivity.f36166n) {
                    k4Var.setText(LocaleController.getString(R.string.ProxyConnections));
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                i12 = proxyListActivity.useProxyRow;
                if (i10 != i12) {
                    i13 = proxyListActivity.callsRow;
                    if (i10 == i13) {
                        q8Var.f(LocaleController.getString(R.string.UseProxyForCalls), proxyListActivity.f36164e, false);
                        return;
                    } else if (i10 == proxyListActivity.f36169w) {
                        q8Var.f(LocaleController.getString(R.string.UseProxyRotation), SharedConfig.proxyRotationEnabled, true);
                        return;
                    } else {
                        return;
                    }
                }
                String string2 = LocaleController.getString(R.string.UseProxySettings);
                boolean z12 = proxyListActivity.d;
                if (proxyListActivity.f36169w == -1) {
                    z11 = false;
                }
                q8Var.f(string2, z12, z11);
                return;
            case 4:
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                if (i10 == proxyListActivity.A) {
                    y8Var.setText(LocaleController.getString(R.string.UseProxyForCallsInfo));
                    return;
                } else if (i10 == proxyListActivity.f36171y) {
                    y8Var.setText(LocaleController.getString(R.string.ProxyRotationTimeoutInfo));
                    return;
                } else {
                    return;
                }
            case 5:
                d11 d11Var = (d11) view;
                SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) arrayList2.get(i10 - proxyListActivity.f36167r);
                d11Var.setProxy(proxyInfo);
                if (SharedConfig.currentProxy == proxyInfo) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                d11Var.setChecked(z10);
                boolean contains = arrayList.contains(arrayList2.get(i10 - proxyListActivity.f36167r));
                d11Var.h = contains;
                d11Var.f37273f.a(contains, false);
                d11Var.a(!arrayList.isEmpty(), false);
                return;
            case 6:
                if (i10 == proxyListActivity.f36170x) {
                    org.telegram.ui.Components.lv0 lv0Var = (org.telegram.ui.Components.lv0) view;
                    ArrayList arrayList3 = new ArrayList(ProxyRotationController.ROTATION_TIMEOUTS);
                    String[] strArr = new String[arrayList3.size()];
                    for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                        strArr[i15] = LocaleController.formatString(R.string.ProxyRotationTimeoutSeconds, arrayList3.get(i15));
                    }
                    lv0Var.setCallback(new xx0(2));
                    lv0Var.b(SharedConfig.proxyRotationTimeout, null, strArr);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void w(f2.n1 n1Var, int i10, List list) {
        int i11;
        int i12;
        boolean contains;
        ProxyListActivity proxyListActivity = this.d;
        ArrayList arrayList = proxyListActivity.D;
        int i13 = n1Var.f6436f;
        View view = n1Var.f6432a;
        if (i13 == 5 && !list.isEmpty()) {
            d11 d11Var = (d11) view;
            if (list.contains(1) && (contains = arrayList.contains(proxyListActivity.E.get(i10 - proxyListActivity.f36167r))) != d11Var.h) {
                d11Var.h = contains;
                d11Var.f37273f.a(contains, true);
            }
            if (list.contains(2)) {
                d11Var.a(!arrayList.isEmpty(), true);
            }
        } else if (n1Var.f6436f == 3 && list.contains(0)) {
            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
            i11 = proxyListActivity.useProxyRow;
            if (i10 != i11) {
                i12 = proxyListActivity.callsRow;
                if (i10 == i12) {
                    q8Var.setChecked(proxyListActivity.f36164e);
                    return;
                } else if (i10 == proxyListActivity.f36169w) {
                    q8Var.setChecked(SharedConfig.proxyRotationEnabled);
                    return;
                } else {
                    return;
                }
            }
            q8Var.setChecked(proxyListActivity.d);
        } else {
            v(n1Var, i10);
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View x6Var;
        Context context = this.f36958c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 6) {
                                x6Var = new d11(this.d, context);
                                x6Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
                            } else {
                                x6Var = new org.telegram.ui.Components.lv0(context, null);
                                x6Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
                            }
                        } else {
                            x6Var = new org.telegram.ui.Cells.y8(context);
                        }
                    } else {
                        x6Var = new org.telegram.ui.Cells.q8(context);
                        x6Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
                    }
                } else {
                    x6Var = new org.telegram.ui.Cells.k4(context);
                    x6Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
                }
            } else {
                x6Var = new org.telegram.ui.Cells.y9(context);
                x6Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
            }
        } else {
            x6Var = new org.telegram.ui.Cells.x6(context, (b) null);
        }
        return th.m(x6Var, x6Var, -1, -2);
    }

    @Override
    public final void y(f2.n1 n1Var) {
        int i10;
        int i11;
        if (n1Var.f6436f == 3) {
            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) n1Var.f6432a;
            int b10 = n1Var.b();
            ProxyListActivity proxyListActivity = this.d;
            i10 = proxyListActivity.useProxyRow;
            if (b10 != i10) {
                i11 = proxyListActivity.callsRow;
                if (b10 == i11) {
                    q8Var.setChecked(proxyListActivity.f36164e);
                    return;
                } else if (b10 == proxyListActivity.f36169w) {
                    q8Var.setChecked(SharedConfig.proxyRotationEnabled);
                    return;
                } else {
                    return;
                }
            }
            q8Var.setChecked(proxyListActivity.d);
        }
    }
}
