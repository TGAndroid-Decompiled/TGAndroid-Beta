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
public final class m11 extends org.telegram.ui.ActionBar.j {
    public final Context f39356a;
    public final ProxyListActivity f39357b;

    public m11(ProxyListActivity proxyListActivity, Context context) {
        this.f39357b = proxyListActivity;
        this.f39356a = context;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        StringBuilder sb2;
        boolean z10;
        ProxyListActivity proxyListActivity = this.f39357b;
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
                        qi.a aVar = proxyInfo.settings;
                        String str = aVar.e;
                        String str2 = aVar.d;
                        String str3 = aVar.f45165b;
                        String str4 = aVar.f45167f;
                        int i15 = aVar.f45164a;
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
                                sb2.append(aVar.f45166c);
                            }
                            if (!TextUtils.isEmpty(str2)) {
                                sb2.append("&user=");
                                sb2.append(URLEncoder.encode(str2, "UTF-8"));
                            }
                            if (!TextUtils.isEmpty(str)) {
                                sb2.append("&pass=");
                                sb2.append(URLEncoder.encode(str, "UTF-8"));
                            }
                        } catch (UnsupportedEncodingException unused) {
                        }
                        if (!TextUtils.isEmpty(str4)) {
                            if (i15 == 3) {
                                if (str3 != null && str3.indexOf(47) >= 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10 && qi.a.g(str4)) {
                                    int length = str4.length() / 2;
                                    byte[] bArr = new byte[length];
                                    for (int i16 = 0; i16 < length; i16++) {
                                        int i17 = i16 * 2;
                                        bArr[i16] = (byte) (Character.digit(str4.charAt(i17 + 1), 16) | (Character.digit(str4.charAt(i17), 16) << 4));
                                    }
                                    byte[] bArr2 = new byte[length + 1];
                                    bArr2[0] = 112;
                                    try {
                                        System.arraycopy(bArr, 0, bArr2, 1, length);
                                        str4 = Base64.encodeToString(bArr2, 11);
                                        sb2.append("&secret=");
                                        sb2.append(URLEncoder.encode(str4, "UTF-8"));
                                    } catch (UnsupportedEncodingException unused2) {
                                    }
                                    sb3.append(sb2.toString());
                                    i13 = 1;
                                }
                            }
                            sb2.append("&secret=");
                            sb2.append(URLEncoder.encode(str4, "UTF-8"));
                            sb3.append(sb2.toString());
                            i13 = 1;
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
                    this.f39356a.startActivity(createChooser);
                    n11 n11Var = proxyListActivity.f34067a;
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
            alertDialog$Builder.f20678a.T = LocaleController.getString(i11);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.DeleteProxyTitle);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new sp0(this, 13));
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
            proxyListActivity.showDialog(c2Var);
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21421q7, null);
            }
        } else if (arrayList.isEmpty()) {
            proxyListActivity.finishFragment();
        } else {
            proxyListActivity.f34067a.F();
        }
    }
}
