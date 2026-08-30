package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class m11 extends org.telegram.ui.ActionBar.j {
    public final Context f36163a;
    public final ProxyListActivity f36164b;

    public m11(ProxyListActivity proxyListActivity, Context context) {
        this.f36164b = proxyListActivity;
        this.f36163a = context;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        ProxyListActivity proxyListActivity = this.f36164b;
        ArrayList arrayList = proxyListActivity.E;
        if (i10 != -1) {
            int i13 = 0;
            if (i10 != 0) {
                if (i10 == 1) {
                    StringBuilder sb = new StringBuilder();
                    int size = arrayList.size();
                    while (i13 < size) {
                        Object obj = arrayList.get(i13);
                        i13++;
                        SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) obj;
                        if (sb.length() > 0) {
                            sb.append("\n\n");
                        }
                        sb.append(proxyInfo.getLink());
                    }
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", sb.toString());
                    if (arrayList.size() > 1) {
                        i12 = R.string.ShareLinks;
                    } else {
                        i12 = R.string.ShareLink;
                    }
                    Intent createChooser = Intent.createChooser(intent, LocaleController.getString(i12));
                    createChooser.setFlags(268435456);
                    this.f36163a.startActivity(createChooser);
                    n11 n11Var = proxyListActivity.f32206a;
                    if (n11Var != null) {
                        n11Var.F();
                        return;
                    }
                    return;
                }
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(proxyListActivity.getParentActivity());
            if (arrayList.size() > 1) {
                i11 = R.string.DeleteProxyMultiConfirm;
            } else {
                i11 = R.string.DeleteProxyConfirm;
            }
            alertDialog$Builder.f19503a.Q = LocaleController.getString(i11);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.DeleteProxyTitle);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new il0(this, 14));
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
            proxyListActivity.showDialog(d2Var);
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20141q7, false));
            }
        } else if (arrayList.isEmpty()) {
            proxyListActivity.finishFragment();
        } else {
            proxyListActivity.f32206a.F();
        }
    }
}
