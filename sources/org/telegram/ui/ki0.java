package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ki0 extends org.telegram.ui.ActionBar.j {
    public final int f49435a;
    public final Object f49436b;
    public final org.telegram.ui.ActionBar.g2 f49437c;

    public ki0(org.telegram.ui.ActionBar.g2 g2Var, Object obj, int i7) {
        this.f49435a = i7;
        this.f49437c = g2Var;
        this.f49436b = obj;
    }

    @Override
    public final void b(int i7) {
        int i10;
        int i11;
        int i12 = this.f49435a;
        Object obj = this.f49436b;
        int i13 = 0;
        org.telegram.ui.ActionBar.g2 g2Var = this.f49437c;
        int i14 = 1;
        switch (i12) {
            case 0:
                PasscodeActivity passcodeActivity = (PasscodeActivity) g2Var;
                if (i7 == -1) {
                    passcodeActivity.finishFragment();
                    return;
                } else if (i7 == 1) {
                    if (passcodeActivity.E != 0) {
                        i14 = 0;
                    }
                    passcodeActivity.E = i14;
                    org.telegram.messenger.g0.h3(new bd0(14, this, (org.telegram.ui.ActionBar.y0) obj), 150L);
                    passcodeActivity.h.setText("");
                    er[] erVarArr = passcodeActivity.f43263n.f46491f;
                    int length = erVarArr.length;
                    while (i13 < length) {
                        erVarArr[i13].setText("");
                        i13++;
                    }
                    passcodeActivity.z0();
                    return;
                } else {
                    return;
                }
            default:
                ProxyListActivity proxyListActivity = (ProxyListActivity) g2Var;
                ArrayList arrayList = proxyListActivity.F;
                if (i7 != -1) {
                    if (i7 != 0) {
                        if (i7 == 1) {
                            StringBuilder sb2 = new StringBuilder();
                            int size = arrayList.size();
                            while (i13 < size) {
                                Object obj2 = arrayList.get(i13);
                                i13++;
                                org.telegram.messenger.az azVar = (org.telegram.messenger.az) obj2;
                                if (sb2.length() > 0) {
                                    sb2.append("\n\n");
                                }
                                sb2.append(azVar.f23096a.e());
                            }
                            Intent intent = new Intent("android.intent.action.SEND");
                            intent.setType("text/plain");
                            intent.putExtra("android.intent.extra.TEXT", sb2.toString());
                            if (arrayList.size() > 1) {
                                i11 = 2131745261;
                            } else {
                                i11 = 2131745262;
                            }
                            Intent createChooser = Intent.createChooser(intent, org.telegram.messenger.gd.N0(i11, null));
                            createChooser.setFlags(268435456);
                            ((Context) obj).startActivity(createChooser);
                            l4 l4Var = proxyListActivity.f43819a;
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
                        i10 = 2131751498;
                    } else {
                        i10 = 2131751499;
                    }
                    String N0 = org.telegram.messenger.gd.N0(i10, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                    t1Var.U = N0;
                    alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                    t1Var.S = org.telegram.messenger.gd.N0(2131751497, null);
                    alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751586, null), new oi0(this, 13));
                    proxyListActivity.showDialog(t1Var);
                    TextView textView = (TextView) t1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29692q7, null);
                        return;
                    }
                    return;
                } else if (arrayList.isEmpty()) {
                    proxyListActivity.finishFragment();
                    return;
                } else {
                    proxyListActivity.f43819a.F();
                    return;
                }
        }
    }
}
