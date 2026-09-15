package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Base64;
import android.widget.TextView;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class e21 extends org.telegram.ui.ActionBar.j {
    public final Context f33192a;
    public final ProxyListActivity f33193b;

    public e21(ProxyListActivity proxyListActivity, Context context) {
        this.f33193b = proxyListActivity;
        this.f33192a = context;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        StringBuilder sb2;
        boolean z10;
        ProxyListActivity proxyListActivity = this.f33193b;
        ArrayList arrayList = proxyListActivity.F;
        if (i10 != -1) {
            int i13 = 1;
            if (i10 != 0) {
                if (i10 == 1) {
                    StringBuilder sb3 = new StringBuilder();
                    int size = arrayList.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj = arrayList.get(i14);
                        i14++;
                        SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) obj;
                        if (sb3.length() > 0) {
                            sb3.append("\n\n");
                        }
                        ni.b bVar = proxyInfo.settings;
                        String str = bVar.e;
                        String str2 = bVar.d;
                        String str3 = bVar.f15246b;
                        String str4 = bVar.f15248f;
                        int i15 = bVar.f15245a;
                        int c10 = m1.j.c(i15);
                        if (c10 != i13) {
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
                            sb2.append(URLEncoder.encode(str3, "UTF-8"));
                            if (i15 != 3) {
                                sb2.append("&port=");
                                sb2.append(bVar.f15247c);
                            }
                            if (!TextUtils.isEmpty(str2)) {
                                sb2.append("&user=");
                                sb2.append(URLEncoder.encode(str2, "UTF-8"));
                            }
                            if (!TextUtils.isEmpty(str)) {
                                sb2.append("&pass=");
                                sb2.append(URLEncoder.encode(str, "UTF-8"));
                            }
                            if (!TextUtils.isEmpty(str4)) {
                                if (i15 == 3) {
                                    if (str3 != null && str3.indexOf(47) >= 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10 && ni.b.g(str4)) {
                                        int length = str4.length() / 2;
                                        byte[] bArr = new byte[length];
                                        for (int i16 = 0; i16 < length; i16++) {
                                            int i17 = i16 * 2;
                                            bArr[i16] = (byte) (Character.digit(str4.charAt(i17 + 1), 16) | (Character.digit(str4.charAt(i17), 16) << 4));
                                        }
                                        byte[] bArr2 = new byte[length + 1];
                                        bArr2[0] = 112;
                                        System.arraycopy(bArr, 0, bArr2, 1, length);
                                        str4 = Base64.encodeToString(bArr2, 11);
                                    }
                                }
                                sb2.append("&secret=");
                                sb2.append(URLEncoder.encode(str4, "UTF-8"));
                            }
                        } catch (UnsupportedEncodingException unused) {
                        }
                        sb3.append(sb2.toString());
                        i13 = 1;
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
                    this.f33192a.startActivity(createChooser);
                    f21 f21Var = proxyListActivity.f31418a;
                    if (f21Var != null) {
                        f21Var.F();
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
            alertDialog$Builder.f18437a.T = LocaleController.getString(i11);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.f18437a.R = LocaleController.getString(R.string.DeleteProxyTitle);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new tl0(this, 14));
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18437a;
            proxyListActivity.showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19074q7, false));
            }
        } else if (arrayList.isEmpty()) {
            proxyListActivity.finishFragment();
        } else {
            proxyListActivity.f31418a.F();
        }
    }
}
