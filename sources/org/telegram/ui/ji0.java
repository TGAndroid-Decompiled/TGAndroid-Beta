package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ji0 extends org.telegram.ui.ActionBar.j {
    public final int f48349a;
    public final Object f48350b;
    public final org.telegram.ui.ActionBar.e2 f48351c;

    public ji0(org.telegram.ui.ActionBar.e2 e2Var, Object obj, int i7) {
        this.f48349a = i7;
        this.f48351c = e2Var;
        this.f48350b = obj;
    }

    @Override
    public final void b(int i7) {
        int i10;
        int i11;
        int i12 = this.f48349a;
        Object obj = this.f48350b;
        int i13 = 0;
        org.telegram.ui.ActionBar.e2 e2Var = this.f48351c;
        int i14 = 1;
        switch (i12) {
            case 0:
                PasscodeActivity passcodeActivity = (PasscodeActivity) e2Var;
                if (i7 == -1) {
                    passcodeActivity.finishFragment();
                    return;
                } else if (i7 == 1) {
                    if (passcodeActivity.E != 0) {
                        i14 = 0;
                    }
                    passcodeActivity.E = i14;
                    org.telegram.messenger.g0.i3(new jd0(13, this, (org.telegram.ui.ActionBar.z0) obj), 150L);
                    passcodeActivity.h.setText("");
                    dr[] drVarArr = passcodeActivity.f42698n.f45485f;
                    int length = drVarArr.length;
                    while (i13 < length) {
                        drVarArr[i13].setText("");
                        i13++;
                    }
                    passcodeActivity.z0();
                    return;
                } else {
                    return;
                }
            default:
                ProxyListActivity proxyListActivity = (ProxyListActivity) e2Var;
                ArrayList arrayList = proxyListActivity.F;
                if (i7 != -1) {
                    if (i7 != 0) {
                        if (i7 == 1) {
                            StringBuilder sb2 = new StringBuilder();
                            int size = arrayList.size();
                            while (i13 < size) {
                                Object obj2 = arrayList.get(i13);
                                i13++;
                                org.telegram.messenger.fz fzVar = (org.telegram.messenger.fz) obj2;
                                if (sb2.length() > 0) {
                                    sb2.append("\n\n");
                                }
                                sb2.append(fzVar.f23577a.e());
                            }
                            Intent intent = new Intent("android.intent.action.SEND");
                            intent.setType("text/plain");
                            intent.putExtra("android.intent.extra.TEXT", sb2.toString());
                            if (arrayList.size() > 1) {
                                i11 = 2131745457;
                            } else {
                                i11 = 2131745458;
                            }
                            Intent createChooser = Intent.createChooser(intent, org.telegram.messenger.hd.M0(i11, null));
                            createChooser.setFlags(268435456);
                            ((Context) obj).startActivity(createChooser);
                            l4 l4Var = proxyListActivity.f43247a;
                            if (l4Var != null) {
                                l4Var.F();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(proxyListActivity.getParentActivity());
                    if (arrayList.size() > 1) {
                        i10 = 2131751510;
                    } else {
                        i10 = 2131751511;
                    }
                    String M0 = org.telegram.messenger.hd.M0(i10, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                    t1Var.U = M0;
                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                    t1Var.S = org.telegram.messenger.hd.M0(2131751509, null);
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751598, null), new ni0(this, 13));
                    proxyListActivity.showDialog(t1Var);
                    TextView textView = (TextView) t1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, null);
                        return;
                    }
                    return;
                } else if (arrayList.isEmpty()) {
                    proxyListActivity.finishFragment();
                    return;
                } else {
                    proxyListActivity.f43247a.F();
                    return;
                }
        }
    }
}
