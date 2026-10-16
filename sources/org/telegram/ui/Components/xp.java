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
public final class xp extends lm0 {
    public final org.telegram.ui.ActionBar.c6 f30981c;
    public ArrayList d;
    public WeakReference e;
    public int f30982f;
    public final int h;
    public final int f30983n;
    public final long f30984r;
    public final HashMap f30985s;
    public final HashMap v;

    public xp(int i10, long j10, org.telegram.ui.ActionBar.c6 c6Var, int i11) {
        this.f30982f = -1;
        this.f30985s = new HashMap();
        this.v = new HashMap();
        this.f30983n = i11;
        this.f30984r = j10;
        this.f30981c = c6Var;
        this.h = i10;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    public final void E(int i10) {
        w21 w21Var;
        int i11 = this.f30982f;
        if (i11 == i10) {
            return;
        }
        if (i11 >= 0) {
            m(i11);
            WeakReference weakReference = this.e;
            if (weakReference == null) {
                w21Var = null;
            } else {
                w21Var = (w21) weakReference.get();
            }
            if (w21Var != null) {
                w21Var.setSelected(false);
            }
        }
        this.f30982f = i10;
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
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        boolean z11;
        FileInputStream fileInputStream;
        char c10;
        int s10;
        int intValue;
        String[] split;
        w21 w21Var = (w21) b1Var.f44838a;
        org.telegram.ui.ActionBar.f6 j10 = ((yp) this.d.get(i10)).f31345a.j(((yp) this.d.get(i10)).f31347c);
        if (j10 != null && j10.f19493b != null && !j10.T && new File(j10.f19493b).exists() && j10.f19493b != null) {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(new File(j10.f19493b));
                int i11 = 0;
                boolean z12 = false;
                while (true) {
                    try {
                        int read = fileInputStream2.read(org.telegram.ui.Cells.na.f21298g3);
                        if (read != -1) {
                            int i12 = i11;
                            int i13 = 0;
                            int i14 = 0;
                            while (true) {
                                if (i13 < read) {
                                    byte[] bArr = org.telegram.ui.Cells.na.f21298g3;
                                    if (bArr[i13] == 10) {
                                        int i15 = i13 - i14;
                                        int i16 = i15 + 1;
                                        String str = new String(bArr, i14, i15, "UTF-8");
                                        if (str.startsWith("WLS=")) {
                                            String substring = str.substring(4);
                                            Uri parse = Uri.parse(substring);
                                            j10.e = parse.getQueryParameter("slug");
                                            File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                                            StringBuilder sb2 = new StringBuilder();
                                            fileInputStream = fileInputStream2;
                                            try {
                                                sb2.append(Utilities.MD5(substring));
                                                sb2.append(".wp");
                                                j10.f19495c = new File(filesDirFixed, sb2.toString()).getAbsolutePath();
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
                                                            j10.f19506r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                                            if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                                                                j10.f19507s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                                            }
                                                            if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                                                                j10.v = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                                            }
                                                            if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                                                                j10.f19508w = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                                            }
                                                        }
                                                    } catch (Exception unused) {
                                                    }
                                                    try {
                                                        String queryParameter3 = parse.getQueryParameter("rotation");
                                                        if (!TextUtils.isEmpty(queryParameter3)) {
                                                            j10.f19509x = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                                                        }
                                                    } catch (Exception unused2) {
                                                    }
                                                    String queryParameter4 = parse.getQueryParameter("intensity");
                                                    if (!TextUtils.isEmpty(queryParameter4)) {
                                                        j10.f19510y = Utilities.parseInt((CharSequence) queryParameter4).intValue();
                                                    }
                                                    if (j10.f19510y == 0) {
                                                        j10.f19510y = 50;
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
                                                j10.P = i16 + i12;
                                                z12 = true;
                                                break;
                                            }
                                            int indexOf = str.indexOf(61);
                                            c10 = 65535;
                                            if (indexOf != -1 && ((s10 = org.telegram.ui.ActionBar.e5.s(str.substring(0, indexOf))) == org.telegram.ui.ActionBar.g6.f19862ra || s10 == org.telegram.ui.ActionBar.g6.Aa || s10 == org.telegram.ui.ActionBar.g6.Nd || s10 == org.telegram.ui.ActionBar.g6.Od || s10 == org.telegram.ui.ActionBar.g6.Pd || s10 == org.telegram.ui.ActionBar.g6.Qd)) {
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
                                                if (s10 == org.telegram.ui.ActionBar.g6.f19862ra) {
                                                    j10.Q = intValue;
                                                } else if (s10 == org.telegram.ui.ActionBar.g6.Aa) {
                                                    j10.R = intValue;
                                                } else if (s10 == org.telegram.ui.ActionBar.g6.Nd) {
                                                    j10.L = intValue;
                                                } else if (s10 == org.telegram.ui.ActionBar.g6.Od) {
                                                    j10.M = intValue;
                                                } else if (s10 == org.telegram.ui.ActionBar.g6.Pd) {
                                                    j10.N = intValue;
                                                } else if (s10 == org.telegram.ui.ActionBar.g6.Qd) {
                                                    j10.O = intValue;
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
                FileLog.e(th5);
            }
            if (j10.f19495c != null && !j10.f19499f && !new File(j10.f19495c).exists()) {
                HashMap hashMap = this.v;
                if (!hashMap.containsKey(j10)) {
                    hashMap.put(j10, j10.e);
                    TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                    TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                    tL_inputWallPaperSlug.slug = j10.e;
                    getwallpaper.wallpaper = tL_inputWallPaperSlug;
                    ConnectionsManager.getInstance(j10.E).sendRequest(getwallpaper, new org.telegram.ui.to(7, this, j10));
                }
            } else {
                j10.T = true;
            }
        }
        yp ypVar = (yp) this.d.get(i10);
        yp ypVar2 = w21Var.G;
        if (ypVar2 != null && gg.b.a(ypVar2.f31345a.f19344c, ypVar.f31345a.f19344c) && !org.telegram.ui.yy.f41979x4 && w21Var.V == ypVar.f31347c) {
            z10 = true;
        } else {
            z10 = false;
        }
        w21Var.setFocusable(true);
        w21Var.setEnabled(true);
        w21Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19689i5, false));
        w21Var.f(ypVar, this.f30984r, z10);
        if (i10 == this.f30982f) {
            z11 = true;
        } else {
            z11 = false;
        }
        w21Var.g(z11, z10);
        if (i10 == this.f30982f) {
            this.e = new WeakReference(w21Var);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        org.telegram.ui.ActionBar.c6 c6Var = this.f30981c;
        return new s4.b1(new w21(this.h, this.f30983n, context, c6Var));
    }

    public xp(int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        this(i10, 0L, c6Var, i11);
    }
}
