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
public final class to extends pj0 {
    public final org.telegram.ui.ActionBar.g6 f38461c;
    public ArrayList d;
    public WeakReference f38462e;
    public final int h;
    public final int f38464n;
    public final long f38465r;
    public int f38463f = -1;
    public final HashMap f38466s = new HashMap();
    public final HashMap f38467w = new HashMap();

    public to(int i7, long j3, org.telegram.ui.an anVar, int i10) {
        this.f38464n = i10;
        this.f38465r = j3;
        this.f38461c = anVar;
        this.h = i7;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    public final void E(int i7) {
        a01 a01Var;
        int i10 = this.f38463f;
        if (i10 == i7) {
            return;
        }
        if (i10 >= 0) {
            g(i10);
            WeakReference weakReference = this.f38462e;
            if (weakReference == null) {
                a01Var = null;
            } else {
                a01Var = (a01) weakReference.get();
            }
            if (a01Var != null) {
                a01Var.setSelected(false);
            }
        }
        this.f38463f = i7;
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
        a01 a01Var = (a01) d1Var.f57056a;
        org.telegram.ui.ActionBar.k6 i10 = ((uo) this.d.get(i7)).f38760a.i(((uo) this.d.get(i7)).f38762c);
        if (i10 != null && i10.f27738b != null && !i10.T && new File(i10.f27738b).exists() && i10.f27738b != null) {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(new File(i10.f27738b));
                int i11 = 0;
                boolean z11 = false;
                while (true) {
                    try {
                        int read = fileInputStream2.read(org.telegram.ui.Cells.ga.f29219p3);
                        if (read != -1) {
                            int i12 = i11;
                            int i13 = 0;
                            int i14 = 0;
                            while (true) {
                                if (i13 < read) {
                                    byte[] bArr = org.telegram.ui.Cells.ga.f29219p3;
                                    if (bArr[i13] == 10) {
                                        int i15 = i13 - i14;
                                        int i16 = i15 + 1;
                                        String str = new String(bArr, i14, i15, "UTF-8");
                                        if (str.startsWith("WLS=")) {
                                            String substring = str.substring(4);
                                            Uri parse = Uri.parse(substring);
                                            i10.f27743e = parse.getQueryParameter("slug");
                                            File h7 = org.telegram.messenger.t0.h();
                                            StringBuilder sb2 = new StringBuilder();
                                            fileInputStream = fileInputStream2;
                                            try {
                                                sb2.append(Utilities.a(substring));
                                                sb2.append(".wp");
                                                i10.f27740c = new File(h7, sb2.toString()).getAbsolutePath();
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
                                                            i10.f27752r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                                            if (queryParameter2.length() >= 13 && org.telegram.messenger.g0.S1(queryParameter2.charAt(6))) {
                                                                i10.f27753s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                                            }
                                                            if (queryParameter2.length() >= 20 && org.telegram.messenger.g0.S1(queryParameter2.charAt(13))) {
                                                                i10.f27754w = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                                            }
                                                            if (queryParameter2.length() == 27 && org.telegram.messenger.g0.S1(queryParameter2.charAt(20))) {
                                                                i10.f27755x = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                                            }
                                                        }
                                                    } catch (Exception unused) {
                                                    }
                                                    try {
                                                        String queryParameter3 = parse.getQueryParameter("rotation");
                                                        if (!TextUtils.isEmpty(queryParameter3)) {
                                                            i10.f27756y = Utilities.z(queryParameter3).intValue();
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
                                            if (indexOf != -1 && ((h = org.telegram.ui.ActionBar.u4.h(str.substring(0, indexOf))) == org.telegram.ui.ActionBar.l6.f28128ra || h == org.telegram.ui.ActionBar.l6.f28070ob || h == org.telegram.ui.ActionBar.l6.Be || h == org.telegram.ui.ActionBar.l6.Ce || h == org.telegram.ui.ActionBar.l6.De || h == org.telegram.ui.ActionBar.l6.Ee)) {
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
                                                if (h == org.telegram.ui.ActionBar.l6.f28128ra) {
                                                    i10.Q = intValue;
                                                } else if (h == org.telegram.ui.ActionBar.l6.f28070ob) {
                                                    i10.R = intValue;
                                                } else if (h == org.telegram.ui.ActionBar.l6.Be) {
                                                    i10.L = intValue;
                                                } else if (h == org.telegram.ui.ActionBar.l6.Ce) {
                                                    i10.M = intValue;
                                                } else if (h == org.telegram.ui.ActionBar.l6.De) {
                                                    i10.N = intValue;
                                                } else if (h == org.telegram.ui.ActionBar.l6.Ee) {
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
            if (i10.f27740c != null && !i10.f27745f && !new File(i10.f27740c).exists()) {
                HashMap hashMap = this.f38467w;
                if (!hashMap.containsKey(i10)) {
                    hashMap.put(i10, i10.f27743e);
                    TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                    TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                    tL_inputWallPaperSlug.slug = i10.f27743e;
                    getwallpaper.wallpaper = tL_inputWallPaperSlug;
                    ConnectionsManager.getInstance(i10.E).sendRequest(getwallpaper, new org.telegram.ui.ld(13, this, i10));
                }
            } else {
                i10.T = true;
            }
        }
        uo uoVar = (uo) this.d.get(i7);
        uo uoVar2 = a01Var.G;
        if (uoVar2 != null && ig.b.a(uoVar2.f38760a.f28462c, uoVar.f38760a.f28462c) && !org.telegram.ui.yw.f52206y4 && a01Var.V == uoVar.f38762c) {
            z9 = true;
        } else {
            z9 = false;
        }
        a01Var.setFocusable(true);
        a01Var.setEnabled(true);
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27956i5, a01Var, null);
        a01Var.f(uoVar, this.f38465r, z9);
        if (i7 == this.f38463f) {
            z10 = true;
        } else {
            z10 = false;
        }
        a01Var.g(z10, z9);
        if (i7 == this.f38463f) {
            this.f38462e = new WeakReference(a01Var);
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        Context context = viewGroup.getContext();
        org.telegram.ui.ActionBar.g6 g6Var = this.f38461c;
        return new v4.d1(new a01(this.h, this.f38464n, context, g6Var));
    }
}
