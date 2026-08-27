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

public final class yo extends yk0 {

    public final org.telegram.ui.ActionBar.c6 f34931c;
    public ArrayList d;

    public WeakReference f34932e;

    public int f34933f;
    public final int h;

    public final int f34934n;

    public final long f34935r;

    public final HashMap f34936s;
    public final HashMap v;

    public yo(int i10, long j10, org.telegram.ui.ActionBar.c6 c6Var, int i11) {
        this.f34933f = -1;
        this.f34936s = new HashMap();
        this.v = new HashMap();
        this.f34934n = i11;
        this.f34935r = j10;
        this.f34931c = c6Var;
        this.h = i10;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return false;
    }

    public final void E(int i10) {
        int i11 = this.f34933f;
        if (i11 == i10) {
            return;
        }
        if (i11 >= 0) {
            m(i11);
            WeakReference weakReference = this.f34932e;
            b11 b11Var = weakReference == null ? null : (b11) weakReference.get();
            if (b11Var != null) {
                b11Var.setSelected(false);
            }
        }
        this.f34933f = i10;
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
    public final void v(f2.o1 o1Var, int i10) {
        FileInputStream fileInputStream;
        int iS;
        int iIntValue;
        String[] strArrSplit;
        b11 b11Var = (b11) o1Var.f5789a;
        org.telegram.ui.ActionBar.f6 f6VarJ = ((zo) this.d.get(i10)).f35316a.j(((zo) this.d.get(i10)).f35318c);
        if (f6VarJ != null && f6VarJ.f22943b != null && !f6VarJ.P && new File(f6VarJ.f22943b).exists() && f6VarJ.f22943b != null) {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(new File(f6VarJ.f22943b));
                int i11 = 0;
                boolean z10 = false;
                while (true) {
                    try {
                        int i12 = fileInputStream2.read(org.telegram.ui.Cells.ia.f24500e3);
                        if (i12 == -1) {
                            fileInputStream = fileInputStream2;
                            break;
                        }
                        int i13 = i11;
                        int i14 = 0;
                        int i15 = 0;
                        while (true) {
                            if (i14 >= i12) {
                                fileInputStream = fileInputStream2;
                                break;
                            }
                            byte[] bArr = org.telegram.ui.Cells.ia.f24500e3;
                            if (bArr[i14] == 10) {
                                int i16 = i14 - i15;
                                int i17 = i16 + 1;
                                String str = new String(bArr, i15, i16, "UTF-8");
                                if (str.startsWith("WLS=")) {
                                    String strSubstring = str.substring(4);
                                    Uri uri = Uri.parse(strSubstring);
                                    f6VarJ.f22948e = uri.getQueryParameter("slug");
                                    File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                                    StringBuilder sb2 = new StringBuilder();
                                    fileInputStream = fileInputStream2;
                                    try {
                                        sb2.append(Utilities.MD5(strSubstring));
                                        sb2.append(".wp");
                                        f6VarJ.f22945c = new File(filesDirFixed, sb2.toString()).getAbsolutePath();
                                        String queryParameter = uri.getQueryParameter("mode");
                                        if (queryParameter != null && (strArrSplit = queryParameter.toLowerCase().split(" ")) != null && strArrSplit.length > 0) {
                                            for (String str2 : strArrSplit) {
                                                if ("blur".equals(str2)) {
                                                    f6VarJ.h = true;
                                                    break;
                                                }
                                            }
                                        }
                                        if (!TextUtils.isEmpty(uri.getQueryParameter("pattern"))) {
                                            try {
                                                String queryParameter2 = uri.getQueryParameter("bg_color");
                                                if (!TextUtils.isEmpty(queryParameter2)) {
                                                    f6VarJ.f22953r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                                    if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                                                        f6VarJ.f22954s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                                    }
                                                    if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                                                        f6VarJ.v = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                                    }
                                                    if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                                                        f6VarJ.f22955w = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                                    }
                                                }
                                            } catch (Exception unused) {
                                            }
                                            try {
                                                String queryParameter3 = uri.getQueryParameter("rotation");
                                                if (!TextUtils.isEmpty(queryParameter3)) {
                                                    f6VarJ.f22956x = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                                                }
                                            } catch (Exception unused2) {
                                            }
                                            String queryParameter4 = uri.getQueryParameter("intensity");
                                            if (!TextUtils.isEmpty(queryParameter4)) {
                                                f6VarJ.f22957y = Utilities.parseInt((CharSequence) queryParameter4).intValue();
                                            }
                                            if (f6VarJ.f22957y == 0) {
                                                f6VarJ.f22957y = 50;
                                            }
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        Throwable th2 = th;
                                        try {
                                            fileInputStream.close();
                                            throw th2;
                                        } catch (Throwable th3) {
                                            th2.addSuppressed(th3);
                                            throw th2;
                                        }
                                    }
                                } else {
                                    fileInputStream = fileInputStream2;
                                    if (str.startsWith("WPS")) {
                                        f6VarJ.L = i17 + i13;
                                        z10 = true;
                                        break;
                                    }
                                    int iIndexOf = str.indexOf(61);
                                    if (iIndexOf != -1 && ((iS = org.telegram.ui.ActionBar.e5.s(str.substring(0, iIndexOf))) == org.telegram.ui.ActionBar.g6.f23305ra || iS == org.telegram.ui.ActionBar.g6.Aa || iS == org.telegram.ui.ActionBar.g6.Nd || iS == org.telegram.ui.ActionBar.g6.Od || iS == org.telegram.ui.ActionBar.g6.Pd || iS == org.telegram.ui.ActionBar.g6.Qd)) {
                                        String strSubstring2 = str.substring(iIndexOf + 1);
                                        if (strSubstring2.length() <= 0 || strSubstring2.charAt(0) != '#') {
                                            iIntValue = Utilities.parseInt((CharSequence) strSubstring2).intValue();
                                        } else {
                                            try {
                                                iIntValue = Color.parseColor(strSubstring2);
                                            } catch (Exception unused3) {
                                                iIntValue = Utilities.parseInt((CharSequence) strSubstring2).intValue();
                                            }
                                        }
                                        if (iS == org.telegram.ui.ActionBar.g6.f23305ra) {
                                            f6VarJ.M = iIntValue;
                                        } else if (iS == org.telegram.ui.ActionBar.g6.Aa) {
                                            f6VarJ.N = iIntValue;
                                        } else if (iS == org.telegram.ui.ActionBar.g6.Nd) {
                                            f6VarJ.H = iIntValue;
                                        } else if (iS == org.telegram.ui.ActionBar.g6.Od) {
                                            f6VarJ.I = iIntValue;
                                        } else if (iS == org.telegram.ui.ActionBar.g6.Pd) {
                                            f6VarJ.J = iIntValue;
                                        } else if (iS == org.telegram.ui.ActionBar.g6.Qd) {
                                            f6VarJ.K = iIntValue;
                                        }
                                    }
                                }
                                i15 += i17;
                                i13 += i17;
                            } else {
                                fileInputStream = fileInputStream2;
                            }
                            i14++;
                            fileInputStream2 = fileInputStream;
                        }
                        if (z10 || i11 == i13) {
                            break;
                            break;
                        } else {
                            fileInputStream.getChannel().position(i13);
                            i11 = i13;
                            fileInputStream2 = fileInputStream;
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
            if (f6VarJ.f22945c == null || f6VarJ.f22950f || new File(f6VarJ.f22945c).exists()) {
                f6VarJ.P = true;
            } else {
                HashMap map = this.v;
                if (!map.containsKey(f6VarJ)) {
                    map.put(f6VarJ, f6VarJ.f22948e);
                    TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                    TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                    tL_inputWallPaperSlug.slug = f6VarJ.f22948e;
                    getwallpaper.wallpaper = tL_inputWallPaperSlug;
                    ConnectionsManager.getInstance(f6VarJ.A).sendRequest(getwallpaper, new org.telegram.ui.gg(11, this, f6VarJ));
                }
            }
        }
        zo zoVar = (zo) this.d.get(i10);
        zo zoVar2 = b11Var.C;
        boolean z11 = zoVar2 != null && of.b.a(zoVar2.f35316a.f22782c, zoVar.f35316a.f22782c) && !org.telegram.ui.gy.f38494t4 && b11Var.R == zoVar.f35318c;
        b11Var.setFocusable(true);
        b11Var.setEnabled(true);
        b11Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23143i5, false));
        b11Var.f(zoVar, this.f34935r, z11);
        b11Var.g(i10 == this.f34933f, z11);
        if (i10 == this.f34933f) {
            this.f34932e = new WeakReference(b11Var);
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        org.telegram.ui.ActionBar.c6 c6Var = this.f34931c;
        return new lk0(new b11(this.h, this.f34934n, context, c6Var));
    }

    public yo(int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        this(i10, 0L, c6Var, i11);
    }
}
