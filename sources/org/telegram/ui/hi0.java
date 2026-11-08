package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class hi0 extends org.telegram.ui.ActionBar.j {
    public final int f46387a;
    public final Object f46388b;
    public final org.telegram.ui.ActionBar.f2 f46389c;

    public hi0(org.telegram.ui.ActionBar.f2 f2Var, Object obj, int i7) {
        this.f46387a = i7;
        this.f46389c = f2Var;
        this.f46388b = obj;
    }

    @Override
    public final void b(int i7) {
        int i10;
        int i11;
        int i12 = this.f46387a;
        Object obj = this.f46388b;
        int i13 = 0;
        org.telegram.ui.ActionBar.f2 f2Var = this.f46389c;
        int i14 = 1;
        switch (i12) {
            case 0:
                PasscodeActivity passcodeActivity = (PasscodeActivity) f2Var;
                if (i7 == -1) {
                    passcodeActivity.finishFragment();
                    return;
                } else if (i7 == 1) {
                    if (passcodeActivity.D != 0) {
                        i14 = 0;
                    }
                    passcodeActivity.D = i14;
                    org.telegram.messenger.g0.i3(new zc0(17, this, (org.telegram.ui.ActionBar.z0) obj), 150L);
                    passcodeActivity.h.setText("");
                    br[] brVarArr = passcodeActivity.f41330n.f52289f;
                    int length = brVarArr.length;
                    while (i13 < length) {
                        brVarArr[i13].setText("");
                        i13++;
                    }
                    passcodeActivity.z0();
                    return;
                } else {
                    return;
                }
            default:
                ProxyListActivity proxyListActivity = (ProxyListActivity) f2Var;
                ArrayList arrayList = proxyListActivity.E;
                if (i7 != -1) {
                    if (i7 != 0) {
                        if (i7 == 1) {
                            StringBuilder sb2 = new StringBuilder();
                            int size = arrayList.size();
                            while (i13 < size) {
                                Object obj2 = arrayList.get(i13);
                                i13++;
                                org.telegram.messenger.hz hzVar = (org.telegram.messenger.hz) obj2;
                                if (sb2.length() > 0) {
                                    sb2.append("\n\n");
                                }
                                sb2.append(hzVar.f22994a.e());
                            }
                            Intent intent = new Intent("android.intent.action.SEND");
                            intent.setType("text/plain");
                            intent.putExtra("android.intent.extra.TEXT", sb2.toString());
                            if (arrayList.size() > 1) {
                                i11 = 2131745460;
                            } else {
                                i11 = 2131745461;
                            }
                            Intent createChooser = Intent.createChooser(intent, org.telegram.messenger.id.M0(i11, null));
                            createChooser.setFlags(268435456);
                            ((Context) obj).startActivity(createChooser);
                            l4 l4Var = proxyListActivity.f41876a;
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
                        i10 = 2131751511;
                    } else {
                        i10 = 2131751512;
                    }
                    String M0 = org.telegram.messenger.id.M0(i10, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                    u1Var.T = M0;
                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                    u1Var.R = org.telegram.messenger.id.M0(2131751510, null);
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751599, null), new li0(this, 13));
                    proxyListActivity.showDialog(u1Var);
                    TextView textView = (TextView) u1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28093q7, null);
                        return;
                    }
                    return;
                } else if (arrayList.isEmpty()) {
                    proxyListActivity.finishFragment();
                    return;
                } else {
                    proxyListActivity.f41876a.F();
                    return;
                }
        }
    }
}
