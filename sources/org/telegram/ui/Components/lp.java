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
public final class lp extends dk0 {
    public final org.telegram.ui.ActionBar.h6 f37256c;
    public ArrayList d;
    public WeakReference f37257e;
    public final int h;
    public final int f37259n;
    public final long f37260r;
    public int f37258f = -1;
    public final HashMap f37261s = new HashMap();
    public final HashMap f37262w = new HashMap();

    public lp(int i7, long j3, org.telegram.ui.zm zmVar, int i10) {
        this.f37259n = i10;
        this.f37260r = j3;
        this.f37256c = zmVar;
        this.h = i7;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return false;
    }

    public final void E(int i7) {
        k01 k01Var;
        int i10 = this.f37258f;
        if (i10 == i7) {
            return;
        }
        if (i10 >= 0) {
            g(i10);
            WeakReference weakReference = this.f37257e;
            if (weakReference == null) {
                k01Var = null;
            } else {
                k01Var = (k01) weakReference.get();
            }
            if (k01Var != null) {
                k01Var.setSelected(false);
            }
        }
        this.f37258f = i7;
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
        k01 k01Var = (k01) f1Var.f59165a;
        org.telegram.ui.ActionBar.l6 i10 = ((mp) this.d.get(i7)).f37593a.i(((mp) this.d.get(i7)).f37595c);
        if (i10 != null && i10.f29234b != null && !i10.U && new File(i10.f29234b).exists() && i10.f29234b != null) {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(new File(i10.f29234b));
                int i11 = 0;
                boolean z12 = false;
                while (true) {
                    try {
                        int read = fileInputStream2.read(org.telegram.ui.Cells.ia.f30869q3);
                        if (read != -1) {
                            int i12 = i11;
                            int i13 = 0;
                            int i14 = 0;
                            while (true) {
                                if (i13 < read) {
                                    byte[] bArr = org.telegram.ui.Cells.ia.f30869q3;
                                    if (bArr[i13] == 10) {
                                        int i15 = i13 - i14;
                                        int i16 = i15 + 1;
                                        String str = new String(bArr, i14, i15, "UTF-8");
                                        if (str.startsWith("WLS=")) {
                                            String substring = str.substring(4);
                                            Uri parse = Uri.parse(substring);
                                            i10.f29239e = parse.getQueryParameter("slug");
                                            File h7 = org.telegram.messenger.t0.h();
                                            StringBuilder sb2 = new StringBuilder();
                                            fileInputStream = fileInputStream2;
                                            try {
                                                sb2.append(Utilities.a(substring));
                                                sb2.append(".wp");
                                                i10.f29236c = new File(h7, sb2.toString()).getAbsolutePath();
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
                                                            i10.f29249r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                                            if (queryParameter2.length() >= 13 && org.telegram.messenger.g0.S1(queryParameter2.charAt(6))) {
                                                                i10.f29250s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                                            }
                                                            if (queryParameter2.length() >= 20 && org.telegram.messenger.g0.S1(queryParameter2.charAt(13))) {
                                                                i10.f29251w = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                                            }
                                                            if (queryParameter2.length() == 27 && org.telegram.messenger.g0.S1(queryParameter2.charAt(20))) {
                                                                i10.f29252x = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                                            }
                                                        }
                                                    } catch (Exception unused) {
                                                    }
                                                    try {
                                                        String queryParameter3 = parse.getQueryParameter("rotation");
                                                        if (!TextUtils.isEmpty(queryParameter3)) {
                                                            i10.f29253y = Utilities.z(queryParameter3).intValue();
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
                                            if (indexOf != -1 && ((h = org.telegram.ui.ActionBar.v4.h(str.substring(0, indexOf))) == org.telegram.ui.ActionBar.m6.f29644ra || h == org.telegram.ui.ActionBar.m6.f29645rb || h == org.telegram.ui.ActionBar.m6.Ee || h == org.telegram.ui.ActionBar.m6.Fe || h == org.telegram.ui.ActionBar.m6.Ge || h == org.telegram.ui.ActionBar.m6.He)) {
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
                                                if (h == org.telegram.ui.ActionBar.m6.f29644ra) {
                                                    i10.R = intValue;
                                                } else if (h == org.telegram.ui.ActionBar.m6.f29645rb) {
                                                    i10.S = intValue;
                                                } else if (h == org.telegram.ui.ActionBar.m6.Ee) {
                                                    i10.M = intValue;
                                                } else if (h == org.telegram.ui.ActionBar.m6.Fe) {
                                                    i10.N = intValue;
                                                } else if (h == org.telegram.ui.ActionBar.m6.Ge) {
                                                    i10.O = intValue;
                                                } else if (h == org.telegram.ui.ActionBar.m6.He) {
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
            if (i10.f29236c != null && !i10.f29241f && !new File(i10.f29236c).exists()) {
                HashMap hashMap = this.f37262w;
                if (!hashMap.containsKey(i10)) {
                    hashMap.put(i10, i10.f29239e);
                    TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                    TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                    tL_inputWallPaperSlug.slug = i10.f29239e;
                    getwallpaper.wallpaper = tL_inputWallPaperSlug;
                    ConnectionsManager.getInstance(i10.F).sendRequest(getwallpaper, new org.telegram.ui.u7(15, this, i10));
                }
            } else {
                i10.U = true;
            }
        }
        mp mpVar = (mp) this.d.get(i7);
        mp mpVar2 = k01Var.H;
        if (mpVar2 != null && ig.b.a(mpVar2.f37593a.f29985c, mpVar.f37593a.f29985c) && !org.telegram.ui.cx.C4 && k01Var.W == mpVar.f37595c) {
            z10 = true;
        } else {
            z10 = false;
        }
        k01Var.setFocusable(true);
        k01Var.setEnabled(true);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29472i5, k01Var, null);
        k01Var.f(mpVar, this.f37260r, z10);
        if (i7 == this.f37258f) {
            z11 = true;
        } else {
            z11 = false;
        }
        k01Var.g(z11, z10);
        if (i7 == this.f37258f) {
            this.f37257e = new WeakReference(k01Var);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        Context context = viewGroup.getContext();
        org.telegram.ui.ActionBar.h6 h6Var = this.f37256c;
        return new v4.f1(new k01(this.h, this.f37259n, context, h6Var));
    }
}
