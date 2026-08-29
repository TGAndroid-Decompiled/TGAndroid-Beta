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
public final class ep extends il0 {
    public final org.telegram.ui.ActionBar.c6 f28153c;
    public ArrayList d;
    public WeakReference f28154e;
    public int f28155f;
    public final int h;
    public final int f28156n;
    public final long f28157r;
    public final HashMap f28158s;
    public final HashMap v;

    public ep(int i10, long j10, org.telegram.ui.ActionBar.c6 c6Var, int i11) {
        this.f28155f = -1;
        this.f28158s = new HashMap();
        this.v = new HashMap();
        this.f28156n = i11;
        this.f28157r = j10;
        this.f28153c = c6Var;
        this.h = i10;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        return false;
    }

    public final void E(int i10) {
        l11 l11Var;
        int i11 = this.f28155f;
        if (i11 == i10) {
            return;
        }
        if (i11 >= 0) {
            m(i11);
            WeakReference weakReference = this.f28154e;
            if (weakReference == null) {
                l11Var = null;
            } else {
                l11Var = (l11) weakReference.get();
            }
            if (l11Var != null) {
                l11Var.setSelected(false);
            }
        }
        this.f28155f = i10;
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
    public final void v(f2.n1 n1Var, int i10) {
        boolean z10;
        boolean z11;
        FileInputStream fileInputStream;
        int s10;
        int intValue;
        String[] split;
        l11 l11Var = (l11) n1Var.f6432a;
        org.telegram.ui.ActionBar.f6 j10 = ((fp) this.d.get(i10)).f28512a.j(((fp) this.d.get(i10)).f28514c);
        if (j10 != null && j10.f22943b != null && !j10.P && new File(j10.f22943b).exists() && j10.f22943b != null) {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(new File(j10.f22943b));
                int i11 = 0;
                boolean z12 = false;
                while (true) {
                    try {
                        int read = fileInputStream2.read(org.telegram.ui.Cells.ja.f24564e3);
                        if (read != -1) {
                            int i12 = i11;
                            int i13 = 0;
                            int i14 = 0;
                            while (true) {
                                if (i13 < read) {
                                    byte[] bArr = org.telegram.ui.Cells.ja.f24564e3;
                                    if (bArr[i13] == 10) {
                                        int i15 = i13 - i14;
                                        int i16 = i15 + 1;
                                        String str = new String(bArr, i14, i15, "UTF-8");
                                        if (str.startsWith("WLS=")) {
                                            String substring = str.substring(4);
                                            Uri parse = Uri.parse(substring);
                                            j10.f22948e = parse.getQueryParameter("slug");
                                            File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                                            StringBuilder sb2 = new StringBuilder();
                                            fileInputStream = fileInputStream2;
                                            try {
                                                sb2.append(Utilities.MD5(substring));
                                                sb2.append(".wp");
                                                j10.f22945c = new File(filesDirFixed, sb2.toString()).getAbsolutePath();
                                                String queryParameter = parse.getQueryParameter("mode");
                                                if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                                                    int i17 = 0;
                                                    while (true) {
                                                        if (i17 >= split.length) {
                                                            break;
                                                        } else if ("blur".equals(split[i17])) {
                                                            j10.h = true;
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
                                                            j10.f22953r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                                            if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                                                                j10.f22954s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                                            }
                                                            if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                                                                j10.v = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                                            }
                                                            if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                                                                j10.f22955w = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                                            }
                                                        }
                                                    } catch (Exception unused) {
                                                    }
                                                    try {
                                                        String queryParameter3 = parse.getQueryParameter("rotation");
                                                        if (!TextUtils.isEmpty(queryParameter3)) {
                                                            j10.f22956x = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                                                        }
                                                    } catch (Exception unused2) {
                                                    }
                                                    String queryParameter4 = parse.getQueryParameter("intensity");
                                                    if (!TextUtils.isEmpty(queryParameter4)) {
                                                        j10.f22957y = Utilities.parseInt((CharSequence) queryParameter4).intValue();
                                                    }
                                                    if (j10.f22957y == 0) {
                                                        j10.f22957y = 50;
                                                    }
                                                }
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
                                                j10.L = i16 + i12;
                                                z12 = true;
                                                break;
                                            }
                                            int indexOf = str.indexOf(61);
                                            if (indexOf != -1 && ((s10 = org.telegram.ui.ActionBar.e5.s(str.substring(0, indexOf))) == org.telegram.ui.ActionBar.g6.f23313ra || s10 == org.telegram.ui.ActionBar.g6.Aa || s10 == org.telegram.ui.ActionBar.g6.Nd || s10 == org.telegram.ui.ActionBar.g6.Od || s10 == org.telegram.ui.ActionBar.g6.Pd || s10 == org.telegram.ui.ActionBar.g6.Qd)) {
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
                                                if (s10 == org.telegram.ui.ActionBar.g6.f23313ra) {
                                                    j10.M = intValue;
                                                } else if (s10 == org.telegram.ui.ActionBar.g6.Aa) {
                                                    j10.N = intValue;
                                                } else if (s10 == org.telegram.ui.ActionBar.g6.Nd) {
                                                    j10.H = intValue;
                                                } else if (s10 == org.telegram.ui.ActionBar.g6.Od) {
                                                    j10.I = intValue;
                                                } else if (s10 == org.telegram.ui.ActionBar.g6.Pd) {
                                                    j10.J = intValue;
                                                } else if (s10 == org.telegram.ui.ActionBar.g6.Qd) {
                                                    j10.K = intValue;
                                                }
                                            }
                                            i14 += i16;
                                            i12 += i16;
                                        }
                                    } else {
                                        fileInputStream = fileInputStream2;
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
                FileLog.e(th5);
            }
            if (j10.f22945c != null && !j10.f22950f && !new File(j10.f22945c).exists()) {
                HashMap hashMap = this.v;
                if (!hashMap.containsKey(j10)) {
                    hashMap.put(j10, j10.f22948e);
                    TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                    TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                    tL_inputWallPaperSlug.slug = j10.f22948e;
                    getwallpaper.wallpaper = tL_inputWallPaperSlug;
                    ConnectionsManager.getInstance(j10.A).sendRequest(getwallpaper, new org.telegram.ui.zg(10, this, j10));
                }
            } else {
                j10.P = true;
            }
        }
        fp fpVar = (fp) this.d.get(i10);
        fp fpVar2 = l11Var.C;
        if (fpVar2 != null && qf.b.a(fpVar2.f28512a.f22764c, fpVar.f28512a.f22764c) && !org.telegram.ui.fy.f38251t4 && l11Var.R == fpVar.f28514c) {
            z10 = true;
        } else {
            z10 = false;
        }
        l11Var.setFocusable(true);
        l11Var.setEnabled(true);
        l11Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23151i5, false));
        l11Var.f(fpVar, this.f28157r, z10);
        if (i10 == this.f28155f) {
            z11 = true;
        } else {
            z11 = false;
        }
        l11Var.g(z11, z10);
        if (i10 == this.f28155f) {
            this.f28154e = new WeakReference(l11Var);
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        org.telegram.ui.ActionBar.c6 c6Var = this.f28153c;
        return new f2.n1(new l11(this.h, this.f28156n, context, c6Var));
    }

    public ep(int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        this(i10, 0L, c6Var, i11);
    }
}
