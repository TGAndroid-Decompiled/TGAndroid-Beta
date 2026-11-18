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
public final class jp extends bk0 {
    public final org.telegram.ui.ActionBar.i6 f36505c;
    public ArrayList d;
    public WeakReference f36506e;
    public final int h;
    public final int f36508n;
    public final long f36509r;
    public int f36507f = -1;
    public final HashMap f36510s = new HashMap();
    public final HashMap f36511w = new HashMap();

    public jp(int i7, long j3, org.telegram.ui.zm zmVar, int i10) {
        this.f36508n = i10;
        this.f36509r = j3;
        this.f36505c = zmVar;
        this.h = i7;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return false;
    }

    public final void E(int i7) {
        j01 j01Var;
        int i10 = this.f36507f;
        if (i10 == i7) {
            return;
        }
        if (i10 >= 0) {
            g(i10);
            WeakReference weakReference = this.f36506e;
            if (weakReference == null) {
                j01Var = null;
            } else {
                j01Var = (j01) weakReference.get();
            }
            if (j01Var != null) {
                j01Var.setSelected(false);
            }
        }
        this.f36507f = i7;
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
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        boolean z11;
        FileInputStream fileInputStream;
        char c10;
        int h;
        int intValue;
        String[] split;
        j01 j01Var = (j01) f1Var.f59123a;
        org.telegram.ui.ActionBar.m6 i10 = ((kp) this.d.get(i7)).f36837a.i(((kp) this.d.get(i7)).f36839c);
        if (i10 != null && i10.f29249b != null && !i10.U && new File(i10.f29249b).exists() && i10.f29249b != null) {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(new File(i10.f29249b));
                int i11 = 0;
                boolean z12 = false;
                while (true) {
                    try {
                        int read = fileInputStream2.read(org.telegram.ui.Cells.ia.f30838q3);
                        if (read != -1) {
                            int i12 = i11;
                            int i13 = 0;
                            int i14 = 0;
                            while (true) {
                                if (i13 < read) {
                                    byte[] bArr = org.telegram.ui.Cells.ia.f30838q3;
                                    if (bArr[i13] == 10) {
                                        int i15 = i13 - i14;
                                        int i16 = i15 + 1;
                                        String str = new String(bArr, i14, i15, "UTF-8");
                                        if (str.startsWith("WLS=")) {
                                            String substring = str.substring(4);
                                            Uri parse = Uri.parse(substring);
                                            i10.f29254e = parse.getQueryParameter("slug");
                                            File h7 = org.telegram.messenger.t0.h();
                                            StringBuilder sb2 = new StringBuilder();
                                            fileInputStream = fileInputStream2;
                                            try {
                                                sb2.append(Utilities.a(substring));
                                                sb2.append(".wp");
                                                i10.f29251c = new File(h7, sb2.toString()).getAbsolutePath();
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
                                                            i10.f29264r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                                            if (queryParameter2.length() >= 13 && org.telegram.messenger.g0.S1(queryParameter2.charAt(6))) {
                                                                i10.f29265s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                                            }
                                                            if (queryParameter2.length() >= 20 && org.telegram.messenger.g0.S1(queryParameter2.charAt(13))) {
                                                                i10.f29266w = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                                            }
                                                            if (queryParameter2.length() == 27 && org.telegram.messenger.g0.S1(queryParameter2.charAt(20))) {
                                                                i10.f29267x = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                                            }
                                                        }
                                                    } catch (Exception unused) {
                                                    }
                                                    try {
                                                        String queryParameter3 = parse.getQueryParameter("rotation");
                                                        if (!TextUtils.isEmpty(queryParameter3)) {
                                                            i10.f29268y = Utilities.z(queryParameter3).intValue();
                                                        }
                                                    } catch (Exception unused2) {
                                                    }
                                                    String queryParameter4 = parse.getQueryParameter("intensity");
                                                    if (!TextUtils.isEmpty(queryParameter4)) {
                                                        i10.E = Utilities.z(queryParameter4).intValue();
                                                    }
                                                    if (i10.E == 0) {
                                                        i10.E = 50;
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
                                                i10.Q = i16 + i12;
                                                z12 = true;
                                                break;
                                            }
                                            int indexOf = str.indexOf(61);
                                            c10 = 65535;
                                            if (indexOf != -1 && ((h = org.telegram.ui.ActionBar.w4.h(str.substring(0, indexOf))) == org.telegram.ui.ActionBar.n6.f29657ra || h == org.telegram.ui.ActionBar.n6.f29658rb || h == org.telegram.ui.ActionBar.n6.Ee || h == org.telegram.ui.ActionBar.n6.Fe || h == org.telegram.ui.ActionBar.n6.Ge || h == org.telegram.ui.ActionBar.n6.He)) {
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
                                                if (h == org.telegram.ui.ActionBar.n6.f29657ra) {
                                                    i10.R = intValue;
                                                } else if (h == org.telegram.ui.ActionBar.n6.f29658rb) {
                                                    i10.S = intValue;
                                                } else if (h == org.telegram.ui.ActionBar.n6.Ee) {
                                                    i10.M = intValue;
                                                } else if (h == org.telegram.ui.ActionBar.n6.Fe) {
                                                    i10.N = intValue;
                                                } else if (h == org.telegram.ui.ActionBar.n6.Ge) {
                                                    i10.O = intValue;
                                                } else if (h == org.telegram.ui.ActionBar.n6.He) {
                                                    i10.P = intValue;
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
                            if (z12 || i11 == i12) {
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
            if (i10.f29251c != null && !i10.f29256f && !new File(i10.f29251c).exists()) {
                HashMap hashMap = this.f36511w;
                if (!hashMap.containsKey(i10)) {
                    hashMap.put(i10, i10.f29254e);
                    TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                    TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                    tL_inputWallPaperSlug.slug = i10.f29254e;
                    getwallpaper.wallpaper = tL_inputWallPaperSlug;
                    ConnectionsManager.getInstance(i10.F).sendRequest(getwallpaper, new org.telegram.ui.u7(15, this, i10));
                }
            } else {
                i10.U = true;
            }
        }
        kp kpVar = (kp) this.d.get(i7);
        kp kpVar2 = j01Var.H;
        if (kpVar2 != null && ig.b.a(kpVar2.f36837a.f29999c, kpVar.f36837a.f29999c) && !org.telegram.ui.cx.C4 && j01Var.W == kpVar.f36839c) {
            z10 = true;
        } else {
            z10 = false;
        }
        j01Var.setFocusable(true);
        j01Var.setEnabled(true);
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29485i5, j01Var, null);
        j01Var.f(kpVar, this.f36509r, z10);
        if (i7 == this.f36507f) {
            z11 = true;
        } else {
            z11 = false;
        }
        j01Var.g(z11, z10);
        if (i7 == this.f36507f) {
            this.f36506e = new WeakReference(j01Var);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        Context context = viewGroup.getContext();
        org.telegram.ui.ActionBar.i6 i6Var = this.f36505c;
        return new v4.f1(new j01(this.h, this.f36508n, context, i6Var));
    }
}
