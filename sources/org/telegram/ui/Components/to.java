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
public final class to extends oj0 {
    public final org.telegram.ui.ActionBar.f6 f38398c;
    public ArrayList d;
    public WeakReference f38399e;
    public final int h;
    public final int f38401n;
    public final long f38402r;
    public int f38400f = -1;
    public final HashMap f38403s = new HashMap();
    public final HashMap f38404w = new HashMap();

    public to(int i7, long j3, org.telegram.ui.ym ymVar, int i10) {
        this.f38401n = i10;
        this.f38402r = j3;
        this.f38398c = ymVar;
        this.h = i7;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    public final void E(int i7) {
        zz0 zz0Var;
        int i10 = this.f38400f;
        if (i10 == i7) {
            return;
        }
        if (i10 >= 0) {
            g(i10);
            WeakReference weakReference = this.f38399e;
            if (weakReference == null) {
                zz0Var = null;
            } else {
                zz0Var = (zz0) weakReference.get();
            }
            if (zz0Var != null) {
                zz0Var.setSelected(false);
            }
        }
        this.f38400f = i7;
        g(i7);
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
    public final void t(v4.d1 d1Var, int i7) {
        boolean z9;
        boolean z10;
        FileInputStream fileInputStream;
        char c10;
        int h;
        int intValue;
        String[] split;
        zz0 zz0Var = (zz0) d1Var.f57043a;
        org.telegram.ui.ActionBar.j6 i10 = ((uo) this.d.get(i7)).f38699a.i(((uo) this.d.get(i7)).f38701c);
        if (i10 != null && i10.f27631b != null && !i10.T && new File(i10.f27631b).exists() && i10.f27631b != null) {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(new File(i10.f27631b));
                int i11 = 0;
                boolean z11 = false;
                while (true) {
                    try {
                        int read = fileInputStream2.read(org.telegram.ui.Cells.ga.f29215p3);
                        if (read != -1) {
                            int i12 = i11;
                            int i13 = 0;
                            int i14 = 0;
                            while (true) {
                                if (i13 < read) {
                                    byte[] bArr = org.telegram.ui.Cells.ga.f29215p3;
                                    if (bArr[i13] == 10) {
                                        int i15 = i13 - i14;
                                        int i16 = i15 + 1;
                                        String str = new String(bArr, i14, i15, "UTF-8");
                                        if (str.startsWith("WLS=")) {
                                            String substring = str.substring(4);
                                            Uri parse = Uri.parse(substring);
                                            i10.f27636e = parse.getQueryParameter("slug");
                                            File h7 = org.telegram.messenger.t0.h();
                                            StringBuilder sb2 = new StringBuilder();
                                            fileInputStream = fileInputStream2;
                                            try {
                                                sb2.append(Utilities.a(substring));
                                                sb2.append(".wp");
                                                i10.f27633c = new File(h7, sb2.toString()).getAbsolutePath();
                                                String queryParameter = parse.getQueryParameter("mode");
                                                if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                                                    int i17 = 0;
                                                    while (true) {
                                                        if (i17 >= split.length) {
                                                            break;
                                                        } else if ("blur".equals(split[i17])) {
                                                            i10.h = true;
                                                            break;
                                                        } else {
                                                            i17++;
                                                        }
                                                    }
                                                }
                                                if (!TextUtils.isEmpty(parse.getQueryParameter("pattern"))) {
                                                    try {
                                                        String queryParameter2 = parse.getQueryParameter("bg_color");
                                                        if (!TextUtils.isEmpty(queryParameter2)) {
                                                            i10.f27645r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                                            if (queryParameter2.length() >= 13 && org.telegram.messenger.g0.S1(queryParameter2.charAt(6))) {
                                                                i10.f27646s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                                            }
                                                            if (queryParameter2.length() >= 20 && org.telegram.messenger.g0.S1(queryParameter2.charAt(13))) {
                                                                i10.f27647w = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                                            }
                                                            if (queryParameter2.length() == 27 && org.telegram.messenger.g0.S1(queryParameter2.charAt(20))) {
                                                                i10.f27648x = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                                            }
                                                        }
                                                    } catch (Exception unused) {
                                                    }
                                                    try {
                                                        String queryParameter3 = parse.getQueryParameter("rotation");
                                                        if (!TextUtils.isEmpty(queryParameter3)) {
                                                            i10.f27649y = Utilities.z(queryParameter3).intValue();
                                                        }
                                                    } catch (Exception unused2) {
                                                    }
                                                    String queryParameter4 = parse.getQueryParameter("intensity");
                                                    if (!TextUtils.isEmpty(queryParameter4)) {
                                                        i10.D = Utilities.z(queryParameter4).intValue();
                                                    }
                                                    if (i10.D == 0) {
                                                        i10.D = 50;
                                                    }
                                                }
                                                c10 = 65535;
                                                i14 += i16;
                                                i12 += i16;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                Throwable th3 = th;
                                                fileInputStream.close();
                                                throw th3;
                                            }
                                        } else {
                                            fileInputStream = fileInputStream2;
                                            if (str.startsWith("WPS")) {
                                                i10.P = i16 + i12;
                                                z11 = true;
                                                break;
                                            }
                                            int indexOf = str.indexOf(61);
                                            c10 = 65535;
                                            if (indexOf != -1 && ((h = org.telegram.ui.ActionBar.u4.h(str.substring(0, indexOf))) == org.telegram.ui.ActionBar.k6.f28115ra || h == org.telegram.ui.ActionBar.k6.f28057ob || h == org.telegram.ui.ActionBar.k6.Be || h == org.telegram.ui.ActionBar.k6.Ce || h == org.telegram.ui.ActionBar.k6.De || h == org.telegram.ui.ActionBar.k6.Ee)) {
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
                                                if (h == org.telegram.ui.ActionBar.k6.f28115ra) {
                                                    i10.Q = intValue;
                                                } else if (h == org.telegram.ui.ActionBar.k6.f28057ob) {
                                                    i10.R = intValue;
                                                } else if (h == org.telegram.ui.ActionBar.k6.Be) {
                                                    i10.L = intValue;
                                                } else if (h == org.telegram.ui.ActionBar.k6.Ce) {
                                                    i10.M = intValue;
                                                } else if (h == org.telegram.ui.ActionBar.k6.De) {
                                                    i10.N = intValue;
                                                } else if (h == org.telegram.ui.ActionBar.k6.Ee) {
                                                    i10.O = intValue;
                                                }
                                            }
                                            i14 += i16;
                                            i12 += i16;
                                        }
                                    } else {
                                        fileInputStream = fileInputStream2;
                                        c10 = 65535;
                                    }
                                    i13++;
                                    fileInputStream2 = fileInputStream;
                                } else {
                                    fileInputStream = fileInputStream2;
                                    break;
                                }
                            }
                            if (z11 || i11 == i12) {
                                break;
                            }
                            fileInputStream.getChannel().position(i12);
                            i11 = i12;
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
                org.telegram.messenger.a8.g(th5, true);
            }
            if (i10.f27633c != null && !i10.f27638f && !new File(i10.f27633c).exists()) {
                HashMap hashMap = this.f38404w;
                if (!hashMap.containsKey(i10)) {
                    hashMap.put(i10, i10.f27636e);
                    TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                    TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                    tL_inputWallPaperSlug.slug = i10.f27636e;
                    getwallpaper.wallpaper = tL_inputWallPaperSlug;
                    ConnectionsManager.getInstance(i10.E).sendRequest(getwallpaper, new org.telegram.ui.ld(13, this, i10));
                }
            } else {
                i10.T = true;
            }
        }
        uo uoVar = (uo) this.d.get(i7);
        uo uoVar2 = zz0Var.G;
        if (uoVar2 != null && ig.b.a(uoVar2.f38699a.f28461c, uoVar.f38699a.f28461c) && !org.telegram.ui.ww.f51530x4 && zz0Var.V == uoVar.f38701c) {
            z9 = true;
        } else {
            z9 = false;
        }
        zz0Var.setFocusable(true);
        zz0Var.setEnabled(true);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27943i5, zz0Var, null);
        zz0Var.f(uoVar, this.f38402r, z9);
        if (i7 == this.f38400f) {
            z10 = true;
        } else {
            z10 = false;
        }
        zz0Var.g(z10, z9);
        if (i7 == this.f38400f) {
            this.f38399e = new WeakReference(zz0Var);
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        Context context = viewGroup.getContext();
        org.telegram.ui.ActionBar.f6 f6Var = this.f38398c;
        return new v4.d1(new zz0(this.h, this.f38401n, context, f6Var));
    }
}
