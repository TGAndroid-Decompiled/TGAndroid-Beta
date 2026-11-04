package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class fi0 extends org.telegram.ui.ActionBar.j {
    public final int f45288a;
    public final Object f45289b;
    public final org.telegram.ui.ActionBar.d2 f45290c;

    public fi0(org.telegram.ui.ActionBar.d2 d2Var, Object obj, int i3) {
        this.f45288a = i3;
        this.f45290c = d2Var;
        this.f45289b = obj;
    }

    @Override
    public final void b(int i3) {
        int i10;
        int i11;
        int i12 = this.f45288a;
        Object obj = this.f45289b;
        int i13 = 0;
        org.telegram.ui.ActionBar.d2 d2Var = this.f45290c;
        int i14 = 1;
        switch (i12) {
            case 0:
                PasscodeActivity passcodeActivity = (PasscodeActivity) d2Var;
                if (i3 == -1) {
                    passcodeActivity.finishFragment();
                    return;
                } else if (i3 == 1) {
                    if (passcodeActivity.E != 0) {
                        i14 = 0;
                    }
                    passcodeActivity.E = i14;
                    org.telegram.messenger.g0.i3(new tb0(21, this, (org.telegram.ui.ActionBar.y0) obj), 150L);
                    passcodeActivity.h.setText("");
                    zq[] zqVarArr = passcodeActivity.f41359n.f52078f;
                    int length = zqVarArr.length;
                    while (i13 < length) {
                        zqVarArr[i13].setText("");
                        i13++;
                    }
                    passcodeActivity.z0();
                    return;
                } else {
                    return;
                }
            default:
                ProxyListActivity proxyListActivity = (ProxyListActivity) d2Var;
                ArrayList arrayList = proxyListActivity.F;
                if (i3 != -1) {
                    if (i3 != 0) {
                        if (i3 == 1) {
                            StringBuilder sb2 = new StringBuilder();
                            int size = arrayList.size();
                            while (i13 < size) {
                                Object obj2 = arrayList.get(i13);
                                i13++;
                                org.telegram.messenger.zy zyVar = (org.telegram.messenger.zy) obj2;
                                if (sb2.length() > 0) {
                                    sb2.append("\n\n");
                                }
                                sb2.append(zyVar.f26993a.e());
                            }
                            Intent intent = new Intent("android.intent.action.SEND");
                            intent.setType("text/plain");
                            intent.putExtra("android.intent.extra.TEXT", sb2.toString());
                            if (arrayList.size() > 1) {
                                i11 = 2131745467;
                            } else {
                                i11 = 2131745468;
                            }
                            Intent createChooser = Intent.createChooser(intent, org.telegram.messenger.bd.M0(i11, null));
                            createChooser.setFlags(268435456);
                            ((Context) obj).startActivity(createChooser);
                            n4 n4Var = proxyListActivity.f41904a;
                            if (n4Var != null) {
                                n4Var.F();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(proxyListActivity.getParentActivity());
                    if (arrayList.size() > 1) {
                        i10 = 2131751511;
                    } else {
                        i10 = 2131751512;
                    }
                    String M0 = org.telegram.messenger.bd.M0(i10, null);
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                    s1Var.U = M0;
                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                    s1Var.S = org.telegram.messenger.bd.M0(2131751510, null);
                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new ci0(this, 14));
                    proxyListActivity.showDialog(s1Var);
                    TextView textView = (TextView) s1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, null);
                        return;
                    }
                    return;
                } else if (arrayList.isEmpty()) {
                    proxyListActivity.finishFragment();
                    return;
                } else {
                    proxyListActivity.f41904a.F();
                    return;
                }
        }
    }
}
