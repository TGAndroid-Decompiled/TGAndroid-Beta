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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class wp extends lm0 {
    public final org.telegram.ui.ActionBar.u6 f34511c;
    public ArrayList d;
    public WeakReference e;
    public final int h;
    public final int f34513n;
    public final long f34514r;
    public int f34512f = -1;
    public final HashMap f34515s = new HashMap();
    public final HashMap v = new HashMap();

    public wp(int i10, long j10, org.telegram.ui.sn snVar, int i11) {
        this.f34513n = i11;
        this.f34514r = j10;
        this.f34511c = snVar;
        this.h = i10;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        return false;
    }

    public final void E(int i10) {
        d31 d31Var;
        int i11 = this.f34512f;
        if (i11 == i10) {
            return;
        }
        if (i11 >= 0) {
            m(i11);
            WeakReference weakReference = this.e;
            if (weakReference == null) {
                d31Var = null;
            } else {
                d31Var = (d31) weakReference.get();
            }
            if (d31Var != null) {
                d31Var.setSelected(false);
            }
        }
        this.f34512f = i10;
        m(i10);
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.d;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        boolean z10;
        boolean z11;
        FileInputStream fileInputStream;
        char c10;
        int i11;
        int intValue;
        String[] split;
        d31 d31Var = (d31) e1Var.f47735a;
        org.telegram.ui.ActionBar.x6 i12 = ((xp) this.d.get(i10)).f34790a.i(((xp) this.d.get(i10)).f34792c);
        if (i12 != null && i12.f23251b != null && !i12.T && new File(i12.f23251b).exists() && i12.f23251b != null) {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(new File(i12.f23251b));
                int i13 = 0;
                boolean z12 = false;
                while (true) {
                    try {
                        int read = fileInputStream2.read(org.telegram.ui.Cells.ra.f24996q3);
                        if (read != -1) {
                            int i14 = i13;
                            int i15 = 0;
                            int i16 = 0;
                            while (true) {
                                if (i15 < read) {
                                    byte[] bArr = org.telegram.ui.Cells.ra.f24996q3;
                                    if (bArr[i15] == 10) {
                                        int i17 = i15 - i16;
                                        int i18 = i17 + 1;
                                        String str = new String(bArr, i16, i17, "UTF-8");
                                        if (str.startsWith("WLS=")) {
                                            String substring = str.substring(4);
                                            Uri parse = Uri.parse(substring);
                                            i12.e = parse.getQueryParameter("slug");
                                            File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                                            StringBuilder sb2 = new StringBuilder();
                                            fileInputStream = fileInputStream2;
                                            try {
                                                sb2.append(Utilities.MD5(substring));
                                                sb2.append(".wp");
                                                i12.f23253c = new File(filesDirFixed, sb2.toString()).getAbsolutePath();
                                                String queryParameter = parse.getQueryParameter("mode");
                                                if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                                                    int i19 = 0;
                                                    while (true) {
                                                        if (i19 >= split.length) {
                                                            break;
                                                        } else if ("blur".equals(split[i19])) {
                                                            i12.h = true;
                                                            break;
                                                        } else {
                                                            i19++;
                                                        }
                                                    }
                                                }
                                                if (!TextUtils.isEmpty(parse.getQueryParameter("pattern"))) {
                                                    try {
                                                        String queryParameter2 = parse.getQueryParameter("bg_color");
                                                        if (!TextUtils.isEmpty(queryParameter2)) {
                                                            i12.f23264r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                                            if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                                                                i12.f23265s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                                            }
                                                            if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                                                                i12.v = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                                            }
                                                            if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                                                                i12.f23266w = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                                            }
                                                        }
                                                    } catch (Exception unused) {
                                                    }
                                                    try {
                                                        String queryParameter3 = parse.getQueryParameter("rotation");
                                                        if (!TextUtils.isEmpty(queryParameter3)) {
                                                            i12.f23267x = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                                                        }
                                                    } catch (Exception unused2) {
                                                    }
                                                    String queryParameter4 = parse.getQueryParameter("intensity");
                                                    if (!TextUtils.isEmpty(queryParameter4)) {
                                                        i12.f23268y = Utilities.parseInt((CharSequence) queryParameter4).intValue();
                                                    }
                                                    if (i12.f23268y == 0) {
                                                        i12.f23268y = 50;
                                                    }
                                                }
                                                c10 = 65535;
                                                i16 += i18;
                                                i14 += i18;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                Throwable th3 = th;
                                                fileInputStream.close();
                                                throw th3;
                                            }
                                        } else {
                                            fileInputStream = fileInputStream2;
                                            if (str.startsWith("WPS")) {
                                                i12.P = i18 + i14;
                                                z12 = true;
                                                break;
                                            }
                                            int indexOf = str.indexOf(61);
                                            c10 = 65535;
                                            if (indexOf != -1 && ((i11 = org.telegram.ui.ActionBar.m5.i(str.substring(0, indexOf))) == org.telegram.ui.ActionBar.y6.f23616ra || i11 == org.telegram.ui.ActionBar.y6.Aa || i11 == org.telegram.ui.ActionBar.y6.Nd || i11 == org.telegram.ui.ActionBar.y6.Od || i11 == org.telegram.ui.ActionBar.y6.Pd || i11 == org.telegram.ui.ActionBar.y6.Qd)) {
                                                String substring2 = str.substring(indexOf + 1);
                                                if (substring2.length() > 0 && substring2.charAt(0) == '#') {
                                                    try {
                                                        intValue = Color.parseColor(substring2);
                                                    } catch (Exception unused3) {
                                                        intValue = Utilities.parseInt((CharSequence) substring2).intValue();
                                                    }
                                                } else {
                                                    intValue = Utilities.parseInt((CharSequence) substring2).intValue();
                                                }
                                                if (i11 == org.telegram.ui.ActionBar.y6.f23616ra) {
                                                    i12.Q = intValue;
                                                } else if (i11 == org.telegram.ui.ActionBar.y6.Aa) {
                                                    i12.R = intValue;
                                                } else if (i11 == org.telegram.ui.ActionBar.y6.Nd) {
                                                    i12.L = intValue;
                                                } else if (i11 == org.telegram.ui.ActionBar.y6.Od) {
                                                    i12.M = intValue;
                                                } else if (i11 == org.telegram.ui.ActionBar.y6.Pd) {
                                                    i12.N = intValue;
                                                } else if (i11 == org.telegram.ui.ActionBar.y6.Qd) {
                                                    i12.O = intValue;
                                                }
                                            }
                                            i16 += i18;
                                            i14 += i18;
                                        }
                                    } else {
                                        fileInputStream = fileInputStream2;
                                        c10 = 65535;
                                    }
                                    i15++;
                                    fileInputStream2 = fileInputStream;
                                } else {
                                    fileInputStream = fileInputStream2;
                                    break;
                                }
                            }
                            if (z12 || i13 == i14) {
                                break;
                            }
                            fileInputStream.getChannel().position(i14);
                            i13 = i14;
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
                FileLog.e(th5);
            }
            if (i12.f23253c != null && !i12.f23257f && !new File(i12.f23253c).exists()) {
                HashMap hashMap = this.v;
                if (!hashMap.containsKey(i12)) {
                    hashMap.put(i12, i12.e);
                    TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                    TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                    tL_inputWallPaperSlug.slug = i12.e;
                    getwallpaper.wallpaper = tL_inputWallPaperSlug;
                    ConnectionsManager.getInstance(i12.E).sendRequest(getwallpaper, new org.telegram.ui.z7(15, this, i12));
                }
            } else {
                i12.T = true;
            }
        }
        xp xpVar = (xp) this.d.get(i10);
        xp xpVar2 = d31Var.G;
        if (xpVar2 != null && hg.b.a(xpVar2.f34790a.f22682c, xpVar.f34790a.f22682c) && !org.telegram.ui.cy.f38559y4 && d31Var.V == xpVar.f34792c) {
            z10 = true;
        } else {
            z10 = false;
        }
        d31Var.setFocusable(true);
        d31Var.setEnabled(true);
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23445i5, d31Var, null);
        d31Var.f(xpVar, this.f34514r, z10);
        if (i10 == this.f34512f) {
            z11 = true;
        } else {
            z11 = false;
        }
        d31Var.g(z11, z10);
        if (i10 == this.f34512f) {
            this.e = new WeakReference(d31Var);
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        org.telegram.ui.ActionBar.u6 u6Var = this.f34511c;
        return new s4.e1(new d31(this.h, this.f34513n, context, u6Var));
    }
}
