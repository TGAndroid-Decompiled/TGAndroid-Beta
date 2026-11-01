package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.io.File;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class bp extends tk0 {
    public final org.telegram.ui.ActionBar.p6 f24902c;
    public ArrayList d;
    public WeakReference e;
    public final int h;
    public final int f24904n;
    public final long f24905r;
    public int f24903f = -1;
    public final HashMap f24906s = new HashMap();
    public final HashMap f24907w = new HashMap();

    public bp(int i10, long j10, org.telegram.ui.sn snVar, int i11) {
        this.f24904n = i11;
        this.f24905r = j10;
        this.f24902c = snVar;
        this.h = i10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    public final void E(int i10) {
        f11 f11Var;
        int i11 = this.f24903f;
        if (i11 == i10) {
            return;
        }
        if (i11 >= 0) {
            g(i11);
            WeakReference weakReference = this.e;
            if (weakReference == null) {
                f11Var = null;
            } else {
                f11Var = (f11) weakReference.get();
            }
            if (f11Var != null) {
                f11Var.setSelected(false);
            }
        }
        this.f24903f = i10;
        g(i10);
    }

    @Override
    public final int b() {
        ArrayList arrayList = this.d;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        boolean z10;
        boolean z11;
        FileInputStream fileInputStream;
        char c10;
        int h;
        int intValue;
        String[] split;
        f11 f11Var = (f11) c1Var.f47909a;
        org.telegram.ui.ActionBar.s6 i11 = ((cp) this.d.get(i10)).f25197a.i(((cp) this.d.get(i10)).f25199c);
        if (i11 != null && i11.f20804b != null && !i11.T && new File(i11.f20804b).exists() && i11.f20804b != null) {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(new File(i11.f20804b));
                int i12 = 0;
                boolean z12 = false;
                while (true) {
                    try {
                        int read = fileInputStream2.read(org.telegram.ui.Cells.ga.f21936p3);
                        if (read != -1) {
                            int i13 = i12;
                            int i14 = 0;
                            int i15 = 0;
                            while (true) {
                                if (i14 < read) {
                                    byte[] bArr = org.telegram.ui.Cells.ga.f21936p3;
                                    if (bArr[i14] == 10) {
                                        int i16 = i14 - i15;
                                        int i17 = i16 + 1;
                                        String str = new String(bArr, i15, i16, "UTF-8");
                                        if (str.startsWith("WLS=")) {
                                            String substring = str.substring(4);
                                            Uri parse = Uri.parse(substring);
                                            i11.e = parse.getQueryParameter("slug");
                                            File h10 = org.telegram.messenger.w0.h();
                                            StringBuilder sb2 = new StringBuilder();
                                            fileInputStream = fileInputStream2;
                                            try {
                                                sb2.append(Utilities.a(substring));
                                                sb2.append(".wp");
                                                i11.f20806c = new File(h10, sb2.toString()).getAbsolutePath();
                                                String queryParameter = parse.getQueryParameter("mode");
                                                if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                                                    int i18 = 0;
                                                    while (true) {
                                                        if (i18 >= split.length) {
                                                            break;
                                                        } else if ("blur".equals(split[i18])) {
                                                            i11.h = true;
                                                            break;
                                                        } else {
                                                            i18++;
                                                        }
                                                    }
                                                }
                                                if (!TextUtils.isEmpty(parse.getQueryParameter("pattern"))) {
                                                    try {
                                                        String queryParameter2 = parse.getQueryParameter("bg_color");
                                                        if (!TextUtils.isEmpty(queryParameter2)) {
                                                            i11.f20817r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                                            if (queryParameter2.length() >= 13 && org.telegram.messenger.i0.S1(queryParameter2.charAt(6))) {
                                                                i11.f20818s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                                            }
                                                            if (queryParameter2.length() >= 20 && org.telegram.messenger.i0.S1(queryParameter2.charAt(13))) {
                                                                i11.f20819w = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                                            }
                                                            if (queryParameter2.length() == 27 && org.telegram.messenger.i0.S1(queryParameter2.charAt(20))) {
                                                                i11.f20820x = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                                            }
                                                        }
                                                    } catch (Exception unused) {
                                                    }
                                                    try {
                                                        String queryParameter3 = parse.getQueryParameter("rotation");
                                                        if (!TextUtils.isEmpty(queryParameter3)) {
                                                            i11.f20821y = Utilities.z(queryParameter3).intValue();
                                                        }
                                                    } catch (Exception unused2) {
                                                    }
                                                    String queryParameter4 = parse.getQueryParameter("intensity");
                                                    if (!TextUtils.isEmpty(queryParameter4)) {
                                                        i11.D = Utilities.z(queryParameter4).intValue();
                                                    }
                                                    if (i11.D == 0) {
                                                        i11.D = 50;
                                                    }
                                                }
                                                c10 = 65535;
                                                i15 += i17;
                                                i13 += i17;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                Throwable th3 = th;
                                                fileInputStream.close();
                                                throw th3;
                                            }
                                        } else {
                                            fileInputStream = fileInputStream2;
                                            if (str.startsWith("WPS")) {
                                                i11.P = i17 + i13;
                                                z12 = true;
                                                break;
                                            }
                                            int indexOf = str.indexOf(61);
                                            c10 = 65535;
                                            if (indexOf != -1 && ((h = org.telegram.ui.ActionBar.d5.h(str.substring(0, indexOf))) == org.telegram.ui.ActionBar.t6.f21191ra || h == org.telegram.ui.ActionBar.t6.f21140ob || h == org.telegram.ui.ActionBar.t6.Be || h == org.telegram.ui.ActionBar.t6.Ce || h == org.telegram.ui.ActionBar.t6.De || h == org.telegram.ui.ActionBar.t6.Ee)) {
                                                String substring2 = str.substring(indexOf + 1);
                                                if (substring2.length() > 0 && substring2.charAt(0) == '#') {
                                                    try {
                                                        intValue = Color.parseColor(substring2);
                                                    } catch (Exception unused3) {
                                                        intValue = Utilities.z(substring2).intValue();
                                                    }
                                                } else {
                                                    intValue = Utilities.z(substring2).intValue();
                                                }
                                                if (h == org.telegram.ui.ActionBar.t6.f21191ra) {
                                                    i11.Q = intValue;
                                                } else if (h == org.telegram.ui.ActionBar.t6.f21140ob) {
                                                    i11.R = intValue;
                                                } else if (h == org.telegram.ui.ActionBar.t6.Be) {
                                                    i11.L = intValue;
                                                } else if (h == org.telegram.ui.ActionBar.t6.Ce) {
                                                    i11.M = intValue;
                                                } else if (h == org.telegram.ui.ActionBar.t6.De) {
                                                    i11.N = intValue;
                                                } else if (h == org.telegram.ui.ActionBar.t6.Ee) {
                                                    i11.O = intValue;
                                                }
                                            }
                                            i15 += i17;
                                            i13 += i17;
                                        }
                                    } else {
                                        fileInputStream = fileInputStream2;
                                        c10 = 65535;
                                    }
                                    i14++;
                                    fileInputStream2 = fileInputStream;
                                } else {
                                    fileInputStream = fileInputStream2;
                                    break;
                                }
                            }
                            if (z12 || i12 == i13) {
                                break;
                            }
                            fileInputStream.getChannel().position(i13);
                            i12 = i13;
                            fileInputStream2 = fileInputStream;
                        } else {
                            fileInputStream = fileInputStream2;
                            break;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        fileInputStream = fileInputStream2;
                    }
                }
                fileInputStream.close();
            } catch (Throwable th5) {
                org.telegram.messenger.f8.g(th5, true);
            }
            if (i11.f20806c != null && !i11.f20810f && !new File(i11.f20806c).exists()) {
                HashMap hashMap = this.f24907w;
                if (!hashMap.containsKey(i11)) {
                    hashMap.put(i11, i11.e);
                    TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                    TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                    tL_inputWallPaperSlug.slug = i11.e;
                    getwallpaper.wallpaper = tL_inputWallPaperSlug;
                    ConnectionsManager.getInstance(i11.E).sendRequest(getwallpaper, new ag.k0(27, this, i11));
                }
            } else {
                i11.T = true;
            }
        }
        cp cpVar = (cp) this.d.get(i10);
        cp cpVar2 = f11Var.G;
        if (cpVar2 != null && yf.b.a(cpVar2.f25197a.f21561c, cpVar.f25197a.f21561c) && !org.telegram.ui.zx.f44112x4 && f11Var.V == cpVar.f25199c) {
            z10 = true;
        } else {
            z10 = false;
        }
        f11Var.setFocusable(true);
        f11Var.setEnabled(true);
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f21020i5, f11Var, null);
        f11Var.f(cpVar, this.f24905r, z10);
        if (i10 == this.f24903f) {
            z11 = true;
        } else {
            z11 = false;
        }
        f11Var.g(z11, z10);
        if (i10 == this.f24903f) {
            this.e = new WeakReference(f11Var);
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        org.telegram.ui.ActionBar.p6 p6Var = this.f24902c;
        return new s4.c1(new f11(this.h, this.f24904n, context, p6Var));
    }
}
