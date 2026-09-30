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
public final class np extends yl0 {
    public final org.telegram.ui.ActionBar.d6 f26762c;
    public ArrayList d;
    public WeakReference e;
    public int f26763f;
    public final int h;
    public final int f26764n;
    public final long f26765r;
    public final HashMap f26766s;
    public final HashMap v;

    public np(int i10, long j3, org.telegram.ui.ActionBar.d6 d6Var, int i11) {
        this.f26763f = -1;
        this.f26766s = new HashMap();
        this.v = new HashMap();
        this.f26764n = i11;
        this.f26765r = j3;
        this.f26762c = d6Var;
        this.h = i10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    public final void E(int i10) {
        k21 k21Var;
        int i11 = this.f26763f;
        if (i11 == i10) {
            return;
        }
        if (i11 >= 0) {
            m(i11);
            WeakReference weakReference = this.e;
            if (weakReference == null) {
                k21Var = null;
            } else {
                k21Var = (k21) weakReference.get();
            }
            if (k21Var != null) {
                k21Var.setSelected(false);
            }
        }
        this.f26763f = i10;
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
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        boolean z11;
        FileInputStream fileInputStream;
        int s10;
        int intValue;
        String[] split;
        k21 k21Var = (k21) c1Var.f43068a;
        org.telegram.ui.ActionBar.g6 j3 = ((op) this.d.get(i10)).f27160a.j(((op) this.d.get(i10)).f27162c);
        if (j3 != null && j3.f18951b != null && !j3.T && new File(j3.f18951b).exists() && j3.f18951b != null) {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(new File(j3.f18951b));
                int i11 = 0;
                boolean z12 = false;
                while (true) {
                    try {
                        int read = fileInputStream2.read(org.telegram.ui.Cells.pa.f20836p3);
                        if (read != -1) {
                            int i12 = i11;
                            int i13 = 0;
                            int i14 = 0;
                            while (true) {
                                if (i13 < read) {
                                    byte[] bArr = org.telegram.ui.Cells.pa.f20836p3;
                                    if (bArr[i13] == 10) {
                                        int i15 = i13 - i14;
                                        int i16 = i15 + 1;
                                        String str = new String(bArr, i14, i15, "UTF-8");
                                        if (str.startsWith("WLS=")) {
                                            String substring = str.substring(4);
                                            Uri parse = Uri.parse(substring);
                                            j3.e = parse.getQueryParameter("slug");
                                            File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                                            StringBuilder sb2 = new StringBuilder();
                                            fileInputStream = fileInputStream2;
                                            try {
                                                sb2.append(Utilities.MD5(substring));
                                                sb2.append(".wp");
                                                j3.f18953c = new File(filesDirFixed, sb2.toString()).getAbsolutePath();
                                                String queryParameter = parse.getQueryParameter("mode");
                                                if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                                                    int i17 = 0;
                                                    while (true) {
                                                        if (i17 >= split.length) {
                                                            break;
                                                        } else if ("blur".equals(split[i17])) {
                                                            j3.h = true;
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
                                                            j3.f18964r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                                            if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                                                                j3.f18965s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                                            }
                                                            if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                                                                j3.v = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                                            }
                                                            if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                                                                j3.f18966w = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                                            }
                                                        }
                                                    } catch (Exception unused) {
                                                    }
                                                    try {
                                                        String queryParameter3 = parse.getQueryParameter("rotation");
                                                        if (!TextUtils.isEmpty(queryParameter3)) {
                                                            j3.f18967x = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                                                        }
                                                    } catch (Exception unused2) {
                                                    }
                                                    String queryParameter4 = parse.getQueryParameter("intensity");
                                                    if (!TextUtils.isEmpty(queryParameter4)) {
                                                        j3.f18968y = Utilities.parseInt((CharSequence) queryParameter4).intValue();
                                                    }
                                                    if (j3.f18968y == 0) {
                                                        j3.f18968y = 50;
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
                                                j3.P = i16 + i12;
                                                z12 = true;
                                                break;
                                            }
                                            int indexOf = str.indexOf(61);
                                            if (indexOf != -1 && ((s10 = org.telegram.ui.ActionBar.e5.s(str.substring(0, indexOf))) == org.telegram.ui.ActionBar.h6.f19337ra || s10 == org.telegram.ui.ActionBar.h6.Aa || s10 == org.telegram.ui.ActionBar.h6.Nd || s10 == org.telegram.ui.ActionBar.h6.Od || s10 == org.telegram.ui.ActionBar.h6.Pd || s10 == org.telegram.ui.ActionBar.h6.Qd)) {
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
                                                if (s10 == org.telegram.ui.ActionBar.h6.f19337ra) {
                                                    j3.Q = intValue;
                                                } else if (s10 == org.telegram.ui.ActionBar.h6.Aa) {
                                                    j3.R = intValue;
                                                } else if (s10 == org.telegram.ui.ActionBar.h6.Nd) {
                                                    j3.L = intValue;
                                                } else if (s10 == org.telegram.ui.ActionBar.h6.Od) {
                                                    j3.M = intValue;
                                                } else if (s10 == org.telegram.ui.ActionBar.h6.Pd) {
                                                    j3.N = intValue;
                                                } else if (s10 == org.telegram.ui.ActionBar.h6.Qd) {
                                                    j3.O = intValue;
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
            if (j3.f18953c != null && !j3.f18957f && !new File(j3.f18953c).exists()) {
                HashMap hashMap = this.v;
                if (!hashMap.containsKey(j3)) {
                    hashMap.put(j3, j3.e);
                    TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                    TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                    tL_inputWallPaperSlug.slug = j3.e;
                    getwallpaper.wallpaper = tL_inputWallPaperSlug;
                    ConnectionsManager.getInstance(j3.E).sendRequest(getwallpaper, new org.telegram.ui.lo(7, this, j3));
                }
            } else {
                j3.T = true;
            }
        }
        op opVar = (op) this.d.get(i10);
        op opVar2 = k21Var.G;
        if (opVar2 != null && fg.b.a(opVar2.f27160a.f18775c, opVar.f27160a.f18775c) && !org.telegram.ui.qy.f37108w4 && k21Var.V == opVar.f27162c) {
            z10 = true;
        } else {
            z10 = false;
        }
        k21Var.setFocusable(true);
        k21Var.setEnabled(true);
        k21Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19164i5, false));
        k21Var.f(opVar, this.f26765r, z10);
        if (i10 == this.f26763f) {
            z11 = true;
        } else {
            z11 = false;
        }
        k21Var.g(z11, z10);
        if (i10 == this.f26763f) {
            this.e = new WeakReference(k21Var);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        org.telegram.ui.ActionBar.d6 d6Var = this.f26762c;
        return new s4.c1(new k21(this.h, this.f26764n, context, d6Var));
    }

    public np(int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        this(i10, 0L, d6Var, i11);
    }
}
