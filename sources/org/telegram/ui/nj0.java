package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Base64;
import android.widget.TextView;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class nj0 extends org.telegram.ui.ActionBar.k {
    public final int f39918a;
    public final Object f39919b;
    public final org.telegram.ui.ActionBar.k2 f39920c;

    public nj0(org.telegram.ui.ActionBar.k2 k2Var, Object obj, int i10) {
        this.f39918a = i10;
        this.f39920c = k2Var;
        this.f39919b = obj;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        int i13;
        StringBuilder sb2;
        boolean z10;
        int i14 = this.f39918a;
        Object obj = this.f39919b;
        org.telegram.ui.ActionBar.k2 k2Var = this.f39920c;
        int i15 = 1;
        switch (i14) {
            case 0:
                PasscodeActivity passcodeActivity = (PasscodeActivity) k2Var;
                if (i10 == -1) {
                    passcodeActivity.finishFragment();
                    return;
                } else if (i10 == 1) {
                    if (passcodeActivity.D == 0) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    passcodeActivity.D = i11;
                    org.telegram.messenger.i0.h3(new if0(10, this, (org.telegram.ui.ActionBar.b1) obj), 150L);
                    passcodeActivity.h.setText("");
                    for (bs bsVar : passcodeActivity.f33428n.f44045f) {
                        bsVar.setText("");
                    }
                    passcodeActivity.z0();
                    return;
                } else {
                    return;
                }
            default:
                ProxyListActivity proxyListActivity = (ProxyListActivity) k2Var;
                ArrayList arrayList = proxyListActivity.E;
                if (i10 != -1) {
                    if (i10 != 0) {
                        if (i10 == 1) {
                            StringBuilder sb3 = new StringBuilder();
                            int size = arrayList.size();
                            int i16 = 0;
                            while (i16 < size) {
                                Object obj2 = arrayList.get(i16);
                                i16++;
                                org.telegram.messenger.tz tzVar = (org.telegram.messenger.tz) obj2;
                                if (sb3.length() > 0) {
                                    sb3.append("\n\n");
                                }
                                ji.b bVar = tzVar.f18325a;
                                String str = bVar.e;
                                String str2 = bVar.d;
                                String str3 = bVar.f10429b;
                                String str4 = bVar.f10431f;
                                int i17 = bVar.f10428a;
                                int c10 = m1.j.c(i17);
                                ArrayList arrayList2 = arrayList;
                                if (c10 != i15) {
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
                                    if (i17 != 3) {
                                        sb2.append("&port=");
                                        sb2.append(bVar.f10430c);
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
                                    if (i17 == 3) {
                                        if (str3 != null && str3.indexOf(47) >= 0) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        if (z10 && ji.b.g(str4)) {
                                            int length = str4.length() / 2;
                                            byte[] bArr = new byte[length];
                                            for (int i18 = 0; i18 < length; i18++) {
                                                int i19 = i18 * 2;
                                                bArr[i18] = (byte) (Character.digit(str4.charAt(i19 + 1), 16) | (Character.digit(str4.charAt(i19), 16) << 4));
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
                                            arrayList = arrayList2;
                                            i15 = 1;
                                        }
                                    }
                                    sb2.append("&secret=");
                                    sb2.append(URLEncoder.encode(str4, "UTF-8"));
                                    sb3.append(sb2.toString());
                                    arrayList = arrayList2;
                                    i15 = 1;
                                }
                                sb3.append(sb2.toString());
                                arrayList = arrayList2;
                                i15 = 1;
                            }
                            ArrayList arrayList3 = arrayList;
                            Intent intent = new Intent("android.intent.action.SEND");
                            intent.setType("text/plain");
                            intent.putExtra("android.intent.extra.TEXT", sb3.toString());
                            if (arrayList3.size() > 1) {
                                i13 = 2131745475;
                            } else {
                                i13 = 2131745476;
                            }
                            Intent createChooser = Intent.createChooser(intent, org.telegram.messenger.dd.L0(i13, null));
                            createChooser.setFlags(268435456);
                            ((Context) obj).startActivity(createChooser);
                            fg.j jVar = proxyListActivity.f33964a;
                            if (jVar != null) {
                                jVar.F();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(proxyListActivity.getParentActivity());
                    if (arrayList.size() > 1) {
                        i12 = 2131751511;
                    } else {
                        i12 = 2131751512;
                    }
                    String L0 = org.telegram.messenger.dd.L0(i12, null);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                    x1Var.T = L0;
                    alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                    x1Var.R = org.telegram.messenger.dd.L0(2131751510, null);
                    alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751599, null), new rj0(this, 14));
                    proxyListActivity.showDialog(x1Var);
                    TextView textView = (TextView) x1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21171q7, null);
                        return;
                    }
                    return;
                } else if (arrayList.isEmpty()) {
                    proxyListActivity.finishFragment();
                    return;
                } else {
                    proxyListActivity.f33964a.F();
                    return;
                }
        }
    }
}
