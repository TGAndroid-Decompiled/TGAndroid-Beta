package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.TextView;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class k21 extends org.telegram.ui.ActionBar.k {
    public final Context f34204a;
    public final ProxyListActivity f34205b;

    public k21(ProxyListActivity proxyListActivity, Context context) {
        this.f34205b = proxyListActivity;
        this.f34204a = context;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        StringBuilder sb2;
        ProxyListActivity proxyListActivity = this.f34205b;
        ArrayList arrayList = proxyListActivity.H;
        if (i10 != -1) {
            int i13 = 0;
            if (i10 != 0) {
                if (i10 == 1) {
                    StringBuilder sb3 = new StringBuilder();
                    int size = arrayList.size();
                    while (i13 < size) {
                        Object obj = arrayList.get(i13);
                        i13++;
                        SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) obj;
                        if (sb3.length() > 0) {
                            sb3.append("\n\n");
                        }
                        ki.b bVar = proxyInfo.settings;
                        String str = bVar.f12529f;
                        String str2 = bVar.e;
                        String str3 = bVar.d;
                        int i14 = bVar.f12526a;
                        int c10 = m1.j.c(i14);
                        if (c10 != 1) {
                            if (c10 != 2) {
                                sb2 = new StringBuilder("https://t.me/socks?");
                            } else {
                                sb2 = new StringBuilder("https://t.me/webproxy?");
                            }
                        } else {
                            sb2 = new StringBuilder("https://t.me/proxy?");
                        }
                        try {
                            sb2.append("server=");
                            sb2.append(URLEncoder.encode(bVar.f12527b, "UTF-8"));
                            if (i14 != 3) {
                                sb2.append("&port=");
                                sb2.append(bVar.f12528c);
                            }
                            if (!TextUtils.isEmpty(str3)) {
                                sb2.append("&user=");
                                sb2.append(URLEncoder.encode(str3, "UTF-8"));
                            }
                            if (!TextUtils.isEmpty(str2)) {
                                sb2.append("&pass=");
                                sb2.append(URLEncoder.encode(str2, "UTF-8"));
                            }
                            if (!TextUtils.isEmpty(str)) {
                                sb2.append("&secret=");
                                sb2.append(URLEncoder.encode(str, "UTF-8"));
                            }
                        } catch (UnsupportedEncodingException unused) {
                        }
                        sb3.append(sb2.toString());
                    }
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", sb3.toString());
                    if (arrayList.size() > 1) {
                        i12 = R.string.ShareLinks;
                    } else {
                        i12 = R.string.ShareLink;
                    }
                    Intent createChooser = Intent.createChooser(intent, LocaleController.getString(i12));
                    createChooser.setFlags(268435456);
                    this.f34204a.startActivity(createChooser);
                    l21 l21Var = proxyListActivity.f30530a;
                    if (l21Var != null) {
                        l21Var.F();
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
            alertDialog$Builder.f17528a.T = LocaleController.getString(i11);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.DeleteProxyTitle);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ul0(this, 14));
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
            proxyListActivity.showDialog(d2Var);
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18162q7, false));
            }
        } else if (arrayList.isEmpty()) {
            proxyListActivity.finishFragment();
        } else {
            proxyListActivity.f30530a.F();
        }
    }
}
