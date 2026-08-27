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

public final class c11 extends org.telegram.ui.Components.yk0 {

    public final Context f36912c;
    public final ProxyListActivity d;

    public c11(ProxyListActivity proxyListActivity, Context context) {
        this.d = proxyListActivity;
        this.f36912c = context;
        C(true);
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        int iB = o1Var.b();
        ProxyListActivity proxyListActivity = this.d;
        if (iB == proxyListActivity.useProxyRow || iB == proxyListActivity.f36107w || iB == proxyListActivity.callsRow || iB == proxyListActivity.proxyAddRow || iB == proxyListActivity.B) {
            return true;
        }
        return iB >= proxyListActivity.f36105r && iB < proxyListActivity.f36106s;
    }

    public final void E() {
        ProxyListActivity proxyListActivity = this.d;
        int size = proxyListActivity.D.size();
        boolean zT = ((org.telegram.ui.ActionBar.n2) proxyListActivity).actionBar.t();
        if (size <= 0) {
            if (zT) {
                ((org.telegram.ui.ActionBar.n2) proxyListActivity).actionBar.s();
                int i10 = proxyListActivity.f36105r;
                r(i10, proxyListActivity.f36106s - i10, 2);
                return;
            }
            return;
        }
        proxyListActivity.C.a(size, zT);
        if (zT) {
            return;
        }
        ((org.telegram.ui.ActionBar.n2) proxyListActivity).actionBar.O(null, null);
        int i11 = proxyListActivity.f36105r;
        r(i11, proxyListActivity.f36106s - i11, 2);
    }

    public final void F() {
        ProxyListActivity proxyListActivity = this.d;
        proxyListActivity.D.clear();
        int i10 = proxyListActivity.f36105r;
        r(i10, proxyListActivity.f36106s - i10, 1);
        E();
    }

    public final void G(int i10) {
        ProxyListActivity proxyListActivity = this.d;
        ArrayList arrayList = proxyListActivity.D;
        int i11 = proxyListActivity.f36105r;
        if (i10 < i11 || i10 >= proxyListActivity.f36106s) {
            return;
        }
        SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) proxyListActivity.E.get(i10 - i11);
        if (arrayList.contains(proxyInfo)) {
            arrayList.remove(proxyInfo);
        } else {
            arrayList.add(proxyInfo);
        }
        n(i10, 1);
        E();
    }

    @Override
    public final int h() {
        return this.d.f36103f;
    }

    @Override
    public final long i(int i10) {
        ProxyListActivity proxyListActivity = this.d;
        if (i10 == proxyListActivity.h) {
            return -1L;
        }
        if (i10 == proxyListActivity.v) {
            return -2L;
        }
        if (i10 == proxyListActivity.proxyAddRow) {
            return -3L;
        }
        if (i10 == proxyListActivity.useProxyRow) {
            return -4L;
        }
        if (i10 == proxyListActivity.callsRow) {
            return -5L;
        }
        if (i10 == proxyListActivity.f36104n) {
            return -6L;
        }
        if (i10 == proxyListActivity.B) {
            return -8L;
        }
        if (i10 == proxyListActivity.f36107w) {
            return -9L;
        }
        if (i10 == proxyListActivity.f36108x) {
            return -10L;
        }
        if (i10 == proxyListActivity.f36109y) {
            return -11L;
        }
        int i11 = proxyListActivity.f36105r;
        if (i10 < i11 || i10 >= proxyListActivity.f36106s) {
            return -7L;
        }
        return ((SharedConfig.ProxyInfo) proxyListActivity.E.get(i10 - i11)).hashCode();
    }

    @Override
    public final int j(int i10) {
        ProxyListActivity proxyListActivity = this.d;
        if (i10 == proxyListActivity.h || i10 == proxyListActivity.v) {
            return 0;
        }
        if (i10 == proxyListActivity.proxyAddRow || i10 == proxyListActivity.B) {
            return 1;
        }
        if (i10 == proxyListActivity.useProxyRow || i10 == proxyListActivity.f36107w || i10 == proxyListActivity.callsRow) {
            return 3;
        }
        if (i10 == proxyListActivity.f36104n) {
            return 2;
        }
        if (i10 == proxyListActivity.f36108x) {
            return 6;
        }
        return (i10 < proxyListActivity.f36105r || i10 >= proxyListActivity.f36106s) ? 4 : 5;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        ProxyListActivity proxyListActivity = this.d;
        ArrayList arrayList = proxyListActivity.D;
        ArrayList arrayList2 = proxyListActivity.E;
        int i11 = o1Var.f5793f;
        View view = o1Var.f5789a;
        switch (i11) {
            case 1:
                org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
                x9Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
                if (i10 == proxyListActivity.proxyAddRow) {
                    x9Var.b(LocaleController.getString(R.string.AddProxy), proxyListActivity.B != -1);
                } else if (i10 == proxyListActivity.B) {
                    x9Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23269p7, false));
                    x9Var.b(LocaleController.getString(R.string.DeleteAllProxies), false);
                }
                break;
            case 2:
                org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
                if (i10 == proxyListActivity.f36104n) {
                    j4Var.setText(LocaleController.getString(R.string.ProxyConnections));
                }
                break;
            case 3:
                org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                if (i10 == proxyListActivity.useProxyRow) {
                    p8Var.f(LocaleController.getString(R.string.UseProxySettings), proxyListActivity.d, proxyListActivity.f36107w != -1);
                } else if (i10 == proxyListActivity.callsRow) {
                    p8Var.f(LocaleController.getString(R.string.UseProxyForCalls), proxyListActivity.f36102e, false);
                } else if (i10 == proxyListActivity.f36107w) {
                    p8Var.f(LocaleController.getString(R.string.UseProxyRotation), SharedConfig.proxyRotationEnabled, true);
                }
                break;
            case 4:
                org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
                if (i10 == proxyListActivity.A) {
                    x8Var.setText(LocaleController.getString(R.string.UseProxyForCallsInfo));
                } else if (i10 == proxyListActivity.f36109y) {
                    x8Var.setText(LocaleController.getString(R.string.ProxyRotationTimeoutInfo));
                }
                break;
            case 5:
                d11 d11Var = (d11) view;
                SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) arrayList2.get(i10 - proxyListActivity.f36105r);
                d11Var.setProxy(proxyInfo);
                d11Var.setChecked(SharedConfig.currentProxy == proxyInfo);
                boolean zContains = arrayList.contains(arrayList2.get(i10 - proxyListActivity.f36105r));
                d11Var.h = zContains;
                d11Var.f37236f.a(zContains, false);
                d11Var.a(!arrayList.isEmpty(), false);
                break;
            case 6:
                if (i10 == proxyListActivity.f36108x) {
                    org.telegram.ui.Components.dv0 dv0Var = (org.telegram.ui.Components.dv0) view;
                    ArrayList arrayList3 = new ArrayList(ProxyRotationController.ROTATION_TIMEOUTS);
                    String[] strArr = new String[arrayList3.size()];
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        strArr[i12] = LocaleController.formatString(R.string.ProxyRotationTimeoutSeconds, arrayList3.get(i12));
                    }
                    dv0Var.setCallback(new j70(13));
                    dv0Var.b(SharedConfig.proxyRotationTimeout, null, strArr);
                }
                break;
        }
    }

    @Override
    public final void w(f2.o1 o1Var, int i10, List list) {
        boolean zContains;
        ProxyListActivity proxyListActivity = this.d;
        ArrayList arrayList = proxyListActivity.D;
        int i11 = o1Var.f5793f;
        View view = o1Var.f5789a;
        if (i11 == 5 && !list.isEmpty()) {
            d11 d11Var = (d11) view;
            if (list.contains(1) && (zContains = arrayList.contains(proxyListActivity.E.get(i10 - proxyListActivity.f36105r))) != d11Var.h) {
                d11Var.h = zContains;
                d11Var.f37236f.a(zContains, true);
            }
            if (list.contains(2)) {
                d11Var.a(!arrayList.isEmpty(), true);
                return;
            }
            return;
        }
        if (o1Var.f5793f != 3 || !list.contains(0)) {
            v(o1Var, i10);
            return;
        }
        org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
        if (i10 == proxyListActivity.useProxyRow) {
            p8Var.setChecked(proxyListActivity.d);
        } else if (i10 == proxyListActivity.callsRow) {
            p8Var.setChecked(proxyListActivity.f36102e);
        } else if (i10 == proxyListActivity.f36107w) {
            p8Var.setChecked(SharedConfig.proxyRotationEnabled);
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View w6Var;
        Context context = this.f36912c;
        if (i10 == 0) {
            w6Var = new org.telegram.ui.Cells.w6(context, (org.telegram.messenger.rl) null);
        } else if (i10 == 1) {
            w6Var = new org.telegram.ui.Cells.x9(context);
            w6Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
        } else if (i10 == 2) {
            w6Var = new org.telegram.ui.Cells.j4(context);
            w6Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
        } else if (i10 == 3) {
            w6Var = new org.telegram.ui.Cells.p8(context);
            w6Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
        } else if (i10 == 4) {
            w6Var = new org.telegram.ui.Cells.x8(context);
        } else if (i10 != 6) {
            w6Var = new d11(this.d, context);
            w6Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
        } else {
            w6Var = new org.telegram.ui.Components.dv0(context, null);
            w6Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
        }
        return org.telegram.ui.Cells.pa.l(w6Var, w6Var, -1, -2);
    }

    @Override
    public final void y(f2.o1 o1Var) {
        if (o1Var.f5793f == 3) {
            org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) o1Var.f5789a;
            int iB = o1Var.b();
            ProxyListActivity proxyListActivity = this.d;
            if (iB == proxyListActivity.useProxyRow) {
                p8Var.setChecked(proxyListActivity.d);
            } else if (iB == proxyListActivity.callsRow) {
                p8Var.setChecked(proxyListActivity.f36102e);
            } else if (iB == proxyListActivity.f36107w) {
                p8Var.setChecked(SharedConfig.proxyRotationEnabled);
            }
        }
    }
}
