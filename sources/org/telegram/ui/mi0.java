package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class mi0 extends org.telegram.ui.ActionBar.j {
    public final int f49841a;
    public final Object f49842b;
    public final org.telegram.ui.ActionBar.h2 f49843c;

    public mi0(org.telegram.ui.ActionBar.h2 h2Var, Object obj, int i7) {
        this.f49841a = i7;
        this.f49843c = h2Var;
        this.f49842b = obj;
    }

    @Override
    public final void b(int i7) {
        int i10;
        int i11;
        int i12 = this.f49841a;
        Object obj = this.f49842b;
        int i13 = 0;
        org.telegram.ui.ActionBar.h2 h2Var = this.f49843c;
        int i14 = 1;
        switch (i12) {
            case 0:
                PasscodeActivity passcodeActivity = (PasscodeActivity) h2Var;
                if (i7 == -1) {
                    passcodeActivity.finishFragment();
                    return;
                } else if (i7 == 1) {
                    if (passcodeActivity.E != 0) {
                        i14 = 0;
                    }
                    passcodeActivity.E = i14;
                    org.telegram.messenger.g0.h3(new we0(8, this, (org.telegram.ui.ActionBar.z0) obj), 150L);
                    passcodeActivity.h.setText("");
                    er[] erVarArr = passcodeActivity.f43143n.f46274f;
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
                ProxyListActivity proxyListActivity = (ProxyListActivity) h2Var;
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
                                sb2.append(azVar.f22985a.e());
                            }
                            Intent intent = new Intent("android.intent.action.SEND");
                            intent.setType("text/plain");
                            intent.putExtra("android.intent.extra.TEXT", sb2.toString());
                            if (arrayList.size() > 1) {
                                i11 = 2131745262;
                            } else {
                                i11 = 2131745263;
                            }
                            Intent createChooser = Intent.createChooser(intent, org.telegram.messenger.gd.M0(i11, null));
                            createChooser.setFlags(268435456);
                            ((Context) obj).startActivity(createChooser);
                            l4 l4Var = proxyListActivity.f43693a;
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
                        i10 = 2131751499;
                    } else {
                        i10 = 2131751500;
                    }
                    String M0 = org.telegram.messenger.gd.M0(i10, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                    u1Var.U = M0;
                    alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                    u1Var.S = org.telegram.messenger.gd.M0(2131751498, null);
                    alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751587, null), new qi0(this, 13));
                    proxyListActivity.showDialog(u1Var);
                    TextView textView = (TextView) u1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29635q7, null);
                        return;
                    }
                    return;
                } else if (arrayList.isEmpty()) {
                    proxyListActivity.finishFragment();
                    return;
                } else {
                    proxyListActivity.f43693a.F();
                    return;
                }
        }
    }
}
