package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Dictation.DictationAsr;
public final class l4 extends org.telegram.ui.Components.tj0 {
    public final int f48826c;
    public final Object d;
    public final Object f48827e;

    public l4(int i7, Object obj, Object obj2) {
        this.f48826c = i7;
        this.f48827e = obj;
        this.d = obj2;
    }

    private final void G(v4.e1 r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l4.G(v4.e1, int):void");
    }

    private final void H(v4.e1 r23, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l4.H(v4.e1, int):void");
    }

    private final void I(v4.e1 e1Var, int i7) {
        boolean K1;
        boolean z10;
        ym0 ym0Var = (ym0) this.f48827e;
        org.telegram.messenger.ve veVar = ym0Var.K;
        ArrayList arrayList = ym0Var.f53581n;
        ArrayList arrayList2 = ym0Var.f53568c;
        HashMap hashMap = ym0Var.f53566b;
        int i10 = e1Var.f58539f;
        View view = e1Var.f58535a;
        int i11 = -1;
        int i12 = 0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
                        if (i7 < arrayList.size()) {
                            l8Var.o(2131232328, (CharSequence) arrayList.get(i7), false);
                            return;
                        } else {
                            l8Var.o(2131232095, org.telegram.messenger.hd.M0(2131752067, null), false);
                            return;
                        }
                    }
                    return;
                }
                org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) veVar.f26971e.get(i7);
                org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
                g7Var.setPhotoEntry(ffVar);
                g7Var.b(hashMap.containsKey(Integer.valueOf(ffVar.C)), false);
                g7Var.setTag(Integer.valueOf(i7));
                return;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -1;
                layoutParams.height = ym0Var.S;
                view.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
        q5Var.setItemSize(ym0Var.S);
        org.telegram.ui.Components.i9 imageView = q5Var.getImageView();
        q5Var.setTag(Integer.valueOf(i7));
        imageView.r();
        if (veVar != null) {
            org.telegram.messenger.ff ffVar2 = (org.telegram.messenger.ff) veVar.f26971e.get(i7);
            if (arrayList2.size() > 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            q5Var.d(ffVar2, z10, true, false, false);
            int i13 = ffVar2.C;
            if (ym0Var.f53571e) {
                i11 = arrayList2.indexOf(Integer.valueOf(i13));
            }
            q5Var.b(i11, hashMap.containsKey(Integer.valueOf(i13)), false);
            K1 = PhotoViewer.K1(ffVar2.I);
        } else {
            org.telegram.messenger.jf jfVar = (org.telegram.messenger.jf) ym0Var.f53573f.get(i7);
            q5Var.e(jfVar);
            q5Var.getVideoInfoContainer().setVisibility(4);
            if (ym0Var.f53571e) {
                i11 = arrayList2.indexOf(jfVar.B);
            }
            q5Var.b(i11, hashMap.containsKey(jfVar.B), false);
            K1 = PhotoViewer.K1(jfVar.g());
        }
        imageView.getImageReceiver().O0(!K1, true);
        q5Var.getCheckBox().setVisibility((ym0Var.U != 0 || K1) ? 8 : 8);
    }

    private final void J(v4.e1 e1Var, int i7) {
        int i10;
        PhotoViewer photoViewer = (PhotoViewer) this.f48827e;
        Context context = (Context) this.d;
        org.telegram.ui.Cells.w5 w5Var = (org.telegram.ui.Cells.w5) e1Var.f58535a;
        int L = org.telegram.messenger.g0.L(85.0f);
        if (i7 != 0) {
            i10 = org.telegram.messenger.g0.L(6.0f);
        } else {
            i10 = 0;
        }
        w5Var.f31883f = L;
        org.telegram.ui.Components.fp fpVar = w5Var.f31881c;
        org.telegram.ui.Components.i9 i9Var = w5Var.f31879a;
        di.k4 k4Var = w5Var.f31882e;
        w5Var.h = i10;
        ((FrameLayout.LayoutParams) w5Var.f31880b.getLayoutParams()).rightMargin = i10;
        ((FrameLayout.LayoutParams) i9Var.getLayoutParams()).rightMargin = i10;
        ((FrameLayout.LayoutParams) k4Var.getLayoutParams()).rightMargin = i10;
        i9Var.r();
        Object obj = photoViewer.d.v().get(photoViewer.d.c().get(i7));
        if (obj instanceof org.telegram.messenger.ff) {
            org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) obj;
            int i11 = ffVar.C;
            String str = ffVar.I;
            w5Var.setTag(ffVar);
            k4Var.setVisibility(4);
            String str2 = ffVar.f27709c;
            if (str2 != null) {
                i9Var.h(str2, null, context.getResources().getDrawable(2131232451));
            } else if (str != null) {
                i9Var.s(ffVar.J, ffVar.K, true);
                if (ffVar.f27708b && !ffVar.d()) {
                    k4Var.setVisibility(0);
                    w5Var.d.setText(org.telegram.messenger.g0.g0(ffVar.E, false, false));
                    i9Var.h("vthumb://" + i11 + ":" + str, null, context.getResources().getDrawable(2131232451));
                } else {
                    i9Var.h("thumb://" + i11 + ":" + str, null, context.getResources().getDrawable(2131232451));
                }
            } else {
                i9Var.setImageResource(2131232451);
            }
            fpVar.f34663a.f(-1, true, false);
            fpVar.setVisibility(0);
        } else if (obj instanceof org.telegram.messenger.jf) {
            org.telegram.messenger.jf jfVar = (org.telegram.messenger.jf) obj;
            w5Var.setTag(jfVar);
            w5Var.setImage(jfVar);
            k4Var.setVisibility(4);
            fpVar.f34663a.f(-1, true, false);
            fpVar.setVisibility(0);
        }
    }

    private final void K(v4.e1 e1Var, int i7) {
        boolean z10;
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.f48827e;
        ArrayList arrayList = proxyListActivity.F;
        ArrayList arrayList2 = proxyListActivity.G;
        int i10 = e1Var.f58539f;
        View view = e1Var.f58535a;
        boolean z11 = true;
        switch (i10) {
            case 1:
                org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) view;
                org.telegram.ui.ActionBar.q6.U(v9Var.getTextView(), org.telegram.ui.ActionBar.j6.G6, null);
                if (i7 == ProxyListActivity.f0(proxyListActivity)) {
                    String M0 = org.telegram.messenger.hd.M0(2131754391, null);
                    if (proxyListActivity.E == -1) {
                        z11 = false;
                    }
                    v9Var.b(M0, z11);
                    return;
                } else if (i7 == proxyListActivity.E) {
                    org.telegram.ui.ActionBar.q6.U(v9Var.getTextView(), org.telegram.ui.ActionBar.j6.f29070p7, null);
                    v9Var.b(org.telegram.messenger.hd.M0(2131751580, null), false);
                    return;
                } else {
                    return;
                }
            case 2:
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                if (i7 == proxyListActivity.h) {
                    n4Var.setText(org.telegram.messenger.hd.M0(2131746605, null));
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                if (i7 == ProxyListActivity.g0(proxyListActivity)) {
                    String M02 = org.telegram.messenger.hd.M0(2131743783, null);
                    boolean z12 = proxyListActivity.d;
                    if (proxyListActivity.f43255w == -1) {
                        z11 = false;
                    }
                    q8Var.f(M02, z12, z11);
                    return;
                } else if (i7 == proxyListActivity.f43255w) {
                    q8Var.f(org.telegram.messenger.hd.M0(2131743785, null), org.telegram.messenger.gz.f23931a1, true);
                    return;
                } else {
                    return;
                }
            case 4:
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                if (i7 == proxyListActivity.f43257y) {
                    y8Var.setText(org.telegram.messenger.hd.M0(2131746603, null));
                    return;
                }
                return;
            case 5:
                mx0 mx0Var = (mx0) view;
                org.telegram.messenger.fz fzVar = (org.telegram.messenger.fz) arrayList2.get(i7 - proxyListActivity.f43252n);
                mx0Var.setProxy(fzVar);
                if (org.telegram.messenger.gz.B1 == fzVar) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                mx0Var.setChecked(z10);
                boolean contains = arrayList.contains(arrayList2.get(i7 - proxyListActivity.f43252n));
                mx0Var.h = contains;
                mx0Var.f49334f.a(contains, false);
                mx0Var.a(!arrayList.isEmpty(), false);
                return;
            case 6:
                if (i7 == proxyListActivity.f43256x) {
                    org.telegram.ui.Components.wt0 wt0Var = (org.telegram.ui.Components.wt0) view;
                    ArrayList arrayList3 = new ArrayList(org.telegram.messenger.nt.d);
                    String[] strArr = new String[arrayList3.size()];
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        strArr[i11] = org.telegram.messenger.hd.a0(null, null, 2131746602, arrayList3.get(i11));
                    }
                    wt0Var.setCallback(new t70(11));
                    wt0Var.b(org.telegram.messenger.gz.f23934b1, null, strArr);
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final void L(v4.e1 e1Var, int i7) {
        String M0;
        String M02;
        boolean z10;
        String M03;
        boolean e10 = org.telegram.ui.Components.w40.e(vy0.d0((vy0) this.f48827e));
        int i10 = e1Var.f58539f;
        if (i10 == 0) {
            org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) e1Var.f58535a;
            if (i7 == 0) {
                M03 = org.telegram.messenger.hd.M0(2131745988, null);
            } else {
                M03 = org.telegram.messenger.hd.M0(2131745992, null);
            }
            n4Var.setText(M03);
        } else if (i10 == 1) {
            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) e1Var.f58535a;
            if (i7 != 1 && !e10) {
                z10 = false;
            } else {
                z10 = true;
            }
            q8Var.setEnabled(z10);
            if (i7 == 1) {
                q8Var.f(org.telegram.messenger.hd.M0(2131745984, null), e10, false);
                return;
            }
            String M04 = org.telegram.messenger.hd.M0(2131745991, null);
            aj.a aVar = aj.e.f1656i;
            aVar.a();
            q8Var.f(M04, aVar.d, false);
        } else if (i10 == 2) {
            org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) e1Var.f58535a;
            v9Var.setEnabled(e10);
            if (i7 == 2) {
                v9Var.c(org.telegram.messenger.hd.M0(2131745986, null), a8.p0.n(((zi.t0) aj.e.f1653e.a()).f61690a, "p", new StringBuilder()), false, true);
            } else if (i7 == 3) {
                String M05 = org.telegram.messenger.hd.M0(2131745996, null);
                zi.o0 o0Var = (zi.o0) aj.e.f1654f.a();
                if (o0Var == zi.o0.f61666a) {
                    M02 = org.telegram.messenger.hd.M0(2131745995, null);
                } else if (o0Var == zi.o0.f61667b) {
                    M02 = org.telegram.messenger.hd.M0(2131745993, null);
                } else {
                    M02 = org.telegram.messenger.hd.M0(2131745994, null);
                }
                v9Var.c(M05, M02, false, true);
            } else if (i7 == 4) {
                v9Var.c(org.telegram.messenger.hd.M0(2131745989, null), a8.p0.n(((zi.q0) aj.e.f1655g.a()).f61676a, " FPS", new StringBuilder()), false, true);
            } else {
                v9Var.c(org.telegram.messenger.hd.M0(2131745997, null), vy0.f0(aj.e.h.a()), false, false);
            }
        } else {
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) e1Var.f58535a;
            if (i7 == 6) {
                M0 = org.telegram.messenger.hd.M0(2131745987, null);
            } else {
                M0 = org.telegram.messenger.hd.M0(2131745990, null);
            }
            y8Var.setText(M0);
        }
    }

    private final void M(v4.e1 e1Var, int i7) {
        ArrayList arrayList = (ArrayList) this.f48827e;
        if (e1Var.f58539f == 0) {
            org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) e1Var.f58535a;
            boolean z10 = true;
            if (i7 == arrayList.size() - 1) {
                z10 = false;
            }
            t2Var.f31637t2 = z10;
            t2Var.setDialog((org.telegram.ui.Cells.o2) arrayList.get(i7));
        }
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        switch (this.f48826c) {
            case 0:
                int b10 = e1Var.b();
                if (b10 == 1 || b10 == 5 || b10 == 6) {
                    return true;
                }
                if (MediaController.s0(vy0.c0((vy0) this.f48827e)) && b10 == 2) {
                    return true;
                }
                return false;
            case 1:
                int b11 = e1Var.b();
                org.telegram.ui.Components.jn jnVar = (org.telegram.ui.Components.jn) this.f48827e;
                if (b11 != jnVar.f36111v0 && b11 != jnVar.H0 && b11 != jnVar.C0 && b11 != jnVar.G0 && b11 != jnVar.D0 && b11 != jnVar.I0 && b11 != jnVar.E0 && b11 != jnVar.F0 && b11 != jnVar.J0 && b11 != jnVar.K0 && b11 != jnVar.O0.f3344b && b11 != jnVar.N0.f3344b && b11 != jnVar.M0) {
                    return false;
                }
                return true;
            case 2:
                return true;
            case 3:
                return true;
            case 4:
                return false;
            case 5:
                if (e1Var.f58539f == 0) {
                    return true;
                }
                return false;
            case 6:
                return true;
            case 7:
                return true;
            case 8:
                int b12 = e1Var.b();
                DataAutoDownloadActivity dataAutoDownloadActivity = (DataAutoDownloadActivity) this.f48827e;
                if (b12 != DataAutoDownloadActivity.n0(dataAutoDownloadActivity) && b12 != DataAutoDownloadActivity.o0(dataAutoDownloadActivity) && b12 != DataAutoDownloadActivity.g0(dataAutoDownloadActivity) && b12 != DataAutoDownloadActivity.p0(dataAutoDownloadActivity)) {
                    return false;
                }
                return true;
            case 9:
                int b13 = e1Var.b();
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.f48827e;
                if (b13 != dataSettingsActivity.f42571e && b13 != dataSettingsActivity.f42572f && b13 != dataSettingsActivity.h && b13 != dataSettingsActivity.f42575s && b13 != DataSettingsActivity.c0(dataSettingsActivity) && b13 != dataSettingsActivity.f42576w && b13 != DataSettingsActivity.d0(dataSettingsActivity) && b13 != DataSettingsActivity.e0(dataSettingsActivity) && b13 != dataSettingsActivity.F && b13 != dataSettingsActivity.E && b13 != dataSettingsActivity.G && b13 != dataSettingsActivity.H && b13 != dataSettingsActivity.L && b13 != dataSettingsActivity.K && b13 != dataSettingsActivity.f42573n && b13 != DataSettingsActivity.h0(dataSettingsActivity) && b13 != DataSettingsActivity.f0(dataSettingsActivity) && b13 != DataSettingsActivity.j0(dataSettingsActivity) && b13 != DataSettingsActivity.b0(dataSettingsActivity)) {
                    return false;
                }
                return true;
            case 10:
                int b14 = e1Var.b();
                ee0 ee0Var = (ee0) this.f48827e;
                if (b14 != ee0Var.f46768c && b14 != ee0Var.d && b14 != ee0Var.f46769e && b14 != ee0Var.f46770f && b14 != ee0Var.h && b14 != ee0Var.f46772r) {
                    return false;
                }
                return true;
            case 11:
                int b15 = e1Var.b();
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.f48827e;
                if (b15 != notificationsSettingsActivity.f42692y && b15 != notificationsSettingsActivity.E && b15 != notificationsSettingsActivity.F && b15 != notificationsSettingsActivity.L && b15 != notificationsSettingsActivity.N && b15 != notificationsSettingsActivity.T && b15 != notificationsSettingsActivity.O && b15 != notificationsSettingsActivity.M && b15 != notificationsSettingsActivity.S && b15 != notificationsSettingsActivity.G && b15 != notificationsSettingsActivity.H && b15 != notificationsSettingsActivity.P && b15 != notificationsSettingsActivity.f42688r && b15 != notificationsSettingsActivity.f42689s && b15 != notificationsSettingsActivity.U && b15 != notificationsSettingsActivity.K) {
                    return true;
                }
                return false;
            case 12:
                int b16 = e1Var.b();
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f48827e;
                if (b16 != PasscodeActivity.c0(passcodeActivity) && b16 != PasscodeActivity.d0(passcodeActivity) && b16 != passcodeActivity.O && b16 != PasscodeActivity.e0(passcodeActivity) && b16 != PasscodeActivity.f0(passcodeActivity) && b16 != passcodeActivity.K && b16 != passcodeActivity.L) {
                    return false;
                }
                return true;
            case 13:
                return true;
            case 14:
                ym0 ym0Var = (ym0) this.f48827e;
                if (ym0Var.K == null && (!TextUtils.isEmpty(ym0Var.f53593w) ? e1Var.b() >= ym0Var.f53573f.size() : e1Var.f58539f != 3)) {
                    return false;
                }
                return true;
            case 15:
                return false;
            case 16:
                int b17 = e1Var.b();
                ProxyListActivity proxyListActivity = (ProxyListActivity) this.f48827e;
                if (b17 != ProxyListActivity.g0(proxyListActivity) && b17 != proxyListActivity.f43255w && b17 != ProxyListActivity.f0(proxyListActivity) && b17 != proxyListActivity.E && (b17 < proxyListActivity.f43252n || b17 >= proxyListActivity.f43253r)) {
                    return false;
                }
                return true;
            case 17:
                int b18 = e1Var.b();
                if (b18 == 1) {
                    return true;
                }
                if (org.telegram.ui.Components.w40.e(vy0.b0((vy0) this.f48827e)) && (b18 == 2 || b18 == 3 || b18 == 4 || b18 == 5 || b18 == 8)) {
                    return true;
                }
                return false;
            case 18:
                if (e1Var.f58539f != 1) {
                    return true;
                }
                return false;
            default:
                if (p1.g.d(3)[e1Var.f58539f] == 1) {
                    return true;
                }
                return false;
        }
    }

    public void E() {
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.f48827e;
        int size = proxyListActivity.F.size();
        boolean v = ProxyListActivity.b0(proxyListActivity).v();
        if (size > 0) {
            ProxyListActivity.c0(proxyListActivity).A(size, v);
            if (!v) {
                ProxyListActivity.d0(proxyListActivity).F();
                int i7 = proxyListActivity.f43252n;
                n(i7, proxyListActivity.f43253r - i7, 2);
            }
        } else if (v) {
            ProxyListActivity.e0(proxyListActivity).u();
            int i10 = proxyListActivity.f43252n;
            n(i10, proxyListActivity.f43253r - i10, 2);
        }
    }

    public void F() {
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.f48827e;
        proxyListActivity.F.clear();
        int i7 = proxyListActivity.f43252n;
        n(i7, proxyListActivity.f43253r - i7, 1);
        E();
    }

    public void N(int i7) {
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.f48827e;
        ArrayList arrayList = proxyListActivity.F;
        int i10 = proxyListActivity.f43252n;
        if (i7 >= i10 && i7 < proxyListActivity.f43253r) {
            org.telegram.messenger.fz fzVar = (org.telegram.messenger.fz) proxyListActivity.G.get(i7 - i10);
            if (arrayList.contains(fzVar)) {
                arrayList.remove(fzVar);
            } else {
                arrayList.add(fzVar);
            }
            h(i7, 1);
            E();
        }
    }

    @Override
    public final int b() {
        switch (this.f48826c) {
            case 0:
                if (DictationAsr.A()) {
                    return 8;
                }
                return 4;
            case 1:
                return ((org.telegram.ui.Components.jn) this.f48827e).R0;
            case 2:
                return ((org.telegram.ui.Components.iz) this.f48827e).h.size();
            case 3:
                int size = ((org.telegram.ui.Components.jz) this.f48827e).f36213v1.size();
                if (size < 10) {
                    return size + 1;
                }
                return size;
            case 4:
                return ((org.telegram.ui.Components.td0) this.f48827e).G;
            case 5:
                return org.telegram.messenger.rd.g() + 1;
            case 6:
                ArrayList arrayList = ((org.telegram.ui.Components.rw0) this.d).f39088x;
                if (arrayList == null) {
                    return 0;
                }
                return arrayList.size();
            case 7:
                return ((org.telegram.ui.Components.v61) this.f48827e).h.size();
            case 8:
                return ((DataAutoDownloadActivity) this.f48827e).f42567y;
            case 9:
                return ((DataSettingsActivity) this.f48827e).U;
            case 10:
                return ((ee0) this.f48827e).f46774w;
            case 11:
                return ((NotificationsSettingsActivity) this.f48827e).V;
            case 12:
                return ((PasscodeActivity) this.f48827e).Q;
            case 13:
                nm0 nm0Var = (nm0) this.f48827e;
                ArrayList arrayList2 = nm0Var.d;
                if (arrayList2 != null) {
                    return (int) Math.ceil(arrayList2.size() / nm0Var.f49587f);
                }
                return 0;
            case 14:
                ym0 ym0Var = (ym0) this.f48827e;
                org.telegram.messenger.ve veVar = ym0Var.K;
                if (veVar == null) {
                    if (ym0Var.f53573f.isEmpty()) {
                        if (!TextUtils.isEmpty(ym0Var.f53593w) || ym0Var.f53581n.isEmpty()) {
                            return 0;
                        }
                        return ym0Var.f53581n.size() + 2;
                    }
                    return ym0Var.f53573f.size() + (!ym0Var.f53588s ? 1 : 0);
                }
                return veVar.f26971e.size();
            case 15:
                PhotoViewer photoViewer = (PhotoViewer) this.f48827e;
                sq0 sq0Var = photoViewer.d;
                if (sq0Var != null && sq0Var.c() != null) {
                    return photoViewer.d.c().size();
                }
                return 0;
            case 16:
                return ((ProxyListActivity) this.f48827e).f43250e;
            case 17:
                return 7;
            case 18:
                return ((ArrayList) this.f48827e).size();
            default:
                return ((pg.i) this.f48827e).F.size();
        }
    }

    @Override
    public long c(int i7) {
        int i10;
        switch (this.f48826c) {
            case 2:
                i10 = ((org.telegram.ui.Components.iz) this.f48827e).f35797l0.get(i7);
                break;
            case 4:
                return i7;
            case 6:
                ArrayList arrayList = ((org.telegram.ui.Components.rw0) this.d).f39088x;
                if (arrayList == null) {
                    return 0L;
                }
                return ((org.telegram.messenger.oi) arrayList.get(i7)).f25764a.hashCode();
            case 7:
                i10 = ((org.telegram.ui.Components.s61) ((org.telegram.ui.Components.v61) this.f48827e).h.get(i7)).f39188a;
                break;
            case 14:
                return i7;
            case 16:
                ProxyListActivity proxyListActivity = (ProxyListActivity) this.f48827e;
                if (i7 == proxyListActivity.f43251f) {
                    return -1L;
                }
                if (i7 == proxyListActivity.f43254s) {
                    return -2L;
                }
                if (i7 == ProxyListActivity.f0(proxyListActivity)) {
                    return -3L;
                }
                if (i7 == ProxyListActivity.g0(proxyListActivity)) {
                    return -4L;
                }
                if (i7 == proxyListActivity.h) {
                    return -6L;
                }
                if (i7 == proxyListActivity.E) {
                    return -8L;
                }
                if (i7 == proxyListActivity.f43255w) {
                    return -9L;
                }
                if (i7 == proxyListActivity.f43256x) {
                    return -10L;
                }
                if (i7 == proxyListActivity.f43257y) {
                    return -11L;
                }
                int i11 = proxyListActivity.f43252n;
                if (i7 >= i11 && i7 < proxyListActivity.f43253r) {
                    return ((org.telegram.messenger.fz) proxyListActivity.G.get(i7 - i11)).hashCode();
                }
                return -7L;
            default:
                return super.c(i7);
        }
        return i10;
    }

    @Override
    public int d(int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        switch (this.f48826c) {
            case 0:
                if (i7 != 0 && i7 != 4) {
                    if (i7 == 1 || i7 == 5 || i7 == 6) {
                        return 1;
                    }
                    if (i7 == 2) {
                        return 2;
                    }
                    return 3;
                }
                return 0;
            case 1:
                org.telegram.ui.Components.jn jnVar = (org.telegram.ui.Components.jn) this.f48827e;
                if (i7 != jnVar.C0 && i7 != jnVar.G0 && i7 != jnVar.H0 && i7 != jnVar.D0 && i7 != jnVar.E0 && i7 != jnVar.F0 && i7 != jnVar.I0 && i7 != jnVar.N0.f3344b && i7 != jnVar.O0.f3344b) {
                    if (i7 != jnVar.m0 && i7 != jnVar.f36109t0 && i7 != jnVar.f36115x0 && i7 != jnVar.f36100p0) {
                        if (i7 == jnVar.f36108s0) {
                            return 1;
                        }
                        if (i7 != jnVar.f36113w0 && i7 != jnVar.f36117y0 && i7 != jnVar.f36105r0 && i7 != jnVar.L0) {
                            if (i7 != jnVar.f36111v0 && i7 != jnVar.J0 && i7 != jnVar.M0) {
                                if (i7 == jnVar.f36097n0) {
                                    return 4;
                                }
                                if (i7 == jnVar.f36098o0) {
                                    return 11;
                                }
                                if (i7 == jnVar.f36102q0) {
                                    return 7;
                                }
                                if (i7 != jnVar.f36118z0 && i7 != jnVar.A0 && i7 != jnVar.K0) {
                                    if (i7 == jnVar.B0) {
                                        return 8;
                                    }
                                    if (i7 == 0) {
                                        return 9;
                                    }
                                    return 5;
                                }
                                return 6;
                            }
                            return 3;
                        }
                        return 2;
                    }
                    return 0;
                }
                return 10;
            case 2:
                return 0;
            case 3:
                return 0;
            case 4:
                org.telegram.ui.Components.td0 td0Var = (org.telegram.ui.Components.td0) this.f48827e;
                if (i7 != td0Var.E && i7 != td0Var.F) {
                    return 0;
                }
                return 1;
            case 5:
                if (i7 == 0) {
                    return 1;
                }
                return 0;
            case 6:
            default:
                return super.d(i7);
            case 7:
                return 0;
            case 8:
                DataAutoDownloadActivity dataAutoDownloadActivity = (DataAutoDownloadActivity) this.f48827e;
                if (i7 == DataAutoDownloadActivity.c0(dataAutoDownloadActivity)) {
                    return 0;
                }
                if (i7 == dataAutoDownloadActivity.f42564s) {
                    return 1;
                }
                if (i7 != dataAutoDownloadActivity.f42563r && i7 != dataAutoDownloadActivity.f42565w) {
                    if (i7 == DataAutoDownloadActivity.h0(dataAutoDownloadActivity)) {
                        return 3;
                    }
                    if (i7 != DataAutoDownloadActivity.n0(dataAutoDownloadActivity) && i7 != DataAutoDownloadActivity.o0(dataAutoDownloadActivity) && i7 != DataAutoDownloadActivity.g0(dataAutoDownloadActivity) && i7 != DataAutoDownloadActivity.p0(dataAutoDownloadActivity)) {
                        return 5;
                    }
                    return 4;
                }
                return 2;
            case 9:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.f48827e;
                if (i7 != dataSettingsActivity.f42574r && i7 != dataSettingsActivity.f42577x && i7 != dataSettingsActivity.O && i7 != dataSettingsActivity.Q && i7 != dataSettingsActivity.M && i7 != dataSettingsActivity.R && i7 != dataSettingsActivity.T) {
                    if (i7 != dataSettingsActivity.d && i7 != dataSettingsActivity.f42578y && i7 != dataSettingsActivity.N && i7 != 0 && i7 != dataSettingsActivity.P && i7 != dataSettingsActivity.J && i7 != dataSettingsActivity.S) {
                        if (i7 != dataSettingsActivity.F && i7 != dataSettingsActivity.E && i7 != dataSettingsActivity.G && i7 != dataSettingsActivity.H && i7 != dataSettingsActivity.K && i7 != dataSettingsActivity.L) {
                            if (i7 == dataSettingsActivity.I) {
                                return 4;
                            }
                            if (i7 != dataSettingsActivity.f42571e && i7 != dataSettingsActivity.h && i7 != dataSettingsActivity.f42572f && i7 != DataSettingsActivity.h0(dataSettingsActivity) && i7 != DataSettingsActivity.f0(dataSettingsActivity) && i7 != DataSettingsActivity.j0(dataSettingsActivity)) {
                                if (i7 != dataSettingsActivity.f42575s && i7 != dataSettingsActivity.f42576w && i7 != dataSettingsActivity.f42573n) {
                                    return 1;
                                }
                                return 6;
                            }
                            return 5;
                        }
                        return 3;
                    }
                    return 2;
                }
                return 0;
            case 10:
                ee0 ee0Var = (ee0) this.f48827e;
                ee0Var.getClass();
                if (i7 == 0) {
                    return 0;
                }
                if (i7 != ee0Var.f46768c && i7 != ee0Var.d && i7 != ee0Var.f46769e && i7 != ee0Var.f46770f && i7 != ee0Var.h) {
                    if (i7 == ee0Var.f46771n) {
                        return 2;
                    }
                    if (i7 == ee0Var.f46772r) {
                        return 3;
                    }
                    return 4;
                }
                return 1;
            case 11:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.f48827e;
                if (i7 != notificationsSettingsActivity.L && i7 != notificationsSettingsActivity.N && i7 != notificationsSettingsActivity.T && i7 != notificationsSettingsActivity.H && i7 != notificationsSettingsActivity.O && i7 != notificationsSettingsActivity.F && i7 != notificationsSettingsActivity.f42692y && i7 != notificationsSettingsActivity.f42688r) {
                    i10 = notificationsSettingsActivity.inappSoundRow;
                    if (i7 != i10) {
                        i11 = notificationsSettingsActivity.inappVibrateRow;
                        if (i7 != i11 && i7 != notificationsSettingsActivity.f42691x) {
                            i12 = notificationsSettingsActivity.inappPreviewRow;
                            if (i7 != i12) {
                                i13 = notificationsSettingsActivity.contactJoinedRow;
                                if (i7 != i13) {
                                    i14 = notificationsSettingsActivity.pinnedMessageRow;
                                    if (i7 != i14 && i7 != notificationsSettingsActivity.f42690w) {
                                        i15 = notificationsSettingsActivity.badgeNumberMutedRow;
                                        if (i7 != i15) {
                                            i16 = notificationsSettingsActivity.badgeNumberMessagesRow;
                                            if (i7 != i16) {
                                                i17 = notificationsSettingsActivity.badgeNumberShowRow;
                                                if (i7 != i17) {
                                                    i18 = notificationsSettingsActivity.inappPriorityRow;
                                                    if (i7 != i18) {
                                                        i19 = notificationsSettingsActivity.inchatSoundRow;
                                                        if (i7 != i19 && i7 != notificationsSettingsActivity.Q) {
                                                            i20 = notificationsSettingsActivity.accountsAllRow;
                                                            if (i7 != i20) {
                                                                i21 = notificationsSettingsActivity.resetNotificationsRow;
                                                                if (i7 != i21) {
                                                                    i22 = notificationsSettingsActivity.privateRow;
                                                                    if (i7 != i22) {
                                                                        i23 = notificationsSettingsActivity.groupRow;
                                                                        if (i7 != i23) {
                                                                            i24 = notificationsSettingsActivity.channelsRow;
                                                                            if (i7 != i24) {
                                                                                i25 = notificationsSettingsActivity.storiesRow;
                                                                                if (i7 != i25) {
                                                                                    i26 = notificationsSettingsActivity.reactionsRow;
                                                                                    if (i7 != i26) {
                                                                                        if (i7 != notificationsSettingsActivity.K && i7 != notificationsSettingsActivity.E && i7 != notificationsSettingsActivity.M && i7 != notificationsSettingsActivity.S && i7 != notificationsSettingsActivity.G && i7 != notificationsSettingsActivity.P && i7 != notificationsSettingsActivity.U) {
                                                                                            if (i7 == notificationsSettingsActivity.f42689s) {
                                                                                                return 6;
                                                                                            }
                                                                                            return 5;
                                                                                        }
                                                                                        return 4;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    return 3;
                                                                }
                                                                return 2;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return 1;
                }
                return 0;
            case 12:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f48827e;
                if (i7 != PasscodeActivity.c0(passcodeActivity) && i7 != passcodeActivity.O && i7 != passcodeActivity.L && i7 != passcodeActivity.K) {
                    if (i7 != PasscodeActivity.e0(passcodeActivity) && i7 != PasscodeActivity.d0(passcodeActivity) && i7 != PasscodeActivity.f0(passcodeActivity)) {
                        if (i7 != passcodeActivity.I && i7 != passcodeActivity.P && i7 != passcodeActivity.H && i7 != passcodeActivity.M) {
                            if (i7 != passcodeActivity.N && i7 != passcodeActivity.J) {
                                if (i7 == 0) {
                                    return 4;
                                }
                            } else {
                                return 3;
                            }
                        } else {
                            return 2;
                        }
                    } else {
                        return 1;
                    }
                }
                return 0;
            case 13:
                return 0;
            case 14:
                ym0 ym0Var = (ym0) this.f48827e;
                if (ym0Var.Z) {
                    return 2;
                }
                if (ym0Var.K == null) {
                    if (ym0Var.f53573f.isEmpty()) {
                        if (i7 == ym0Var.f53581n.size()) {
                            return 4;
                        }
                        return 3;
                    } else if (i7 >= ym0Var.f53573f.size()) {
                        return 1;
                    }
                }
                return 0;
            case 15:
                return 0;
            case 16:
                ProxyListActivity proxyListActivity = (ProxyListActivity) this.f48827e;
                if (i7 != proxyListActivity.f43251f && i7 != proxyListActivity.f43254s) {
                    if (i7 != ProxyListActivity.f0(proxyListActivity) && i7 != proxyListActivity.E) {
                        if (i7 != ProxyListActivity.g0(proxyListActivity) && i7 != proxyListActivity.f43255w) {
                            if (i7 == proxyListActivity.h) {
                                return 2;
                            }
                            if (i7 == proxyListActivity.f43256x) {
                                return 6;
                            }
                            if (i7 >= proxyListActivity.f43252n && i7 < proxyListActivity.f43253r) {
                                return 5;
                            }
                            return 4;
                        }
                        return 3;
                    }
                    return 1;
                }
                return 0;
            case 17:
                if (i7 != 0 && i7 != 7) {
                    if (i7 == 1 || i7 == 8) {
                        return 1;
                    }
                    if (i7 != 6 && i7 != 9) {
                        return 2;
                    }
                    return 3;
                }
                return 0;
            case 18:
                if (i7 == ((ArrayList) this.f48827e).size()) {
                    return 1;
                }
                return 0;
            case 19:
                return p1.g.c(((pg.a) ((pg.i) this.f48827e).F.get(i7)).f55018b);
        }
    }

    @Override
    public final void t(v4.e1 r24, int r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l4.t(v4.e1, int):void");
    }

    @Override
    public void v(v4.e1 e1Var, int i7, List list) {
        boolean contains;
        switch (this.f48826c) {
            case 16:
                ProxyListActivity proxyListActivity = (ProxyListActivity) this.f48827e;
                ArrayList arrayList = proxyListActivity.F;
                int i10 = e1Var.f58539f;
                View view = e1Var.f58535a;
                if (i10 == 5 && !list.isEmpty()) {
                    mx0 mx0Var = (mx0) view;
                    if (list.contains(1) && (contains = arrayList.contains(proxyListActivity.G.get(i7 - proxyListActivity.f43252n))) != mx0Var.h) {
                        mx0Var.h = contains;
                        mx0Var.f49334f.a(contains, true);
                    }
                    if (list.contains(2)) {
                        mx0Var.a(!arrayList.isEmpty(), true);
                        return;
                    }
                    return;
                } else if (e1Var.f58539f == 3 && list.contains(0)) {
                    org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                    if (i7 == ProxyListActivity.g0(proxyListActivity)) {
                        q8Var.setChecked(proxyListActivity.d);
                        return;
                    } else if (i7 == proxyListActivity.f43255w) {
                        q8Var.setChecked(org.telegram.messenger.gz.f23931a1);
                        return;
                    } else {
                        return;
                    }
                } else {
                    t(e1Var, i7);
                    return;
                }
            default:
                super.v(e1Var, i7, list);
                return;
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.v9 v9Var;
        int i10;
        org.telegram.ui.Components.en n4Var;
        int i11;
        View view;
        org.telegram.ui.Components.hn hnVar;
        org.telegram.ui.Cells.r5 r5Var;
        FrameLayout frameLayout;
        org.telegram.ui.Components.wt0 wt0Var;
        View x6Var;
        org.telegram.ui.Cells.x8 x8Var;
        View n4Var2;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        org.telegram.ui.ActionBar.e6 e6Var3;
        org.telegram.ui.ActionBar.e6 e6Var4;
        org.telegram.ui.ActionBar.e6 e6Var5;
        View q8Var;
        org.telegram.ui.Cells.l8 l8Var;
        View x6Var2;
        org.telegram.ui.Cells.v9 v9Var2;
        View t4Var;
        FrameLayout frameLayout2;
        int i12 = this.f48826c;
        int i13 = 8;
        Object obj = this.f48827e;
        Object obj2 = this.d;
        switch (i12) {
            case 0:
                Context context = (Context) obj2;
                if (i7 == 0) {
                    v9Var = new org.telegram.ui.Cells.n4(context);
                } else if (i7 == 1) {
                    v9Var = new org.telegram.ui.Cells.q8(context);
                } else if (i7 == 2) {
                    org.telegram.ui.Cells.v9 v9Var3 = new org.telegram.ui.Cells.v9(context);
                    v9Var3.setCanDisable(true);
                    v9Var = v9Var3;
                } else {
                    v9Var = new org.telegram.ui.Cells.y8(context);
                }
                v9Var.setLayoutParams(new v4.p0(-1, -2));
                return new v4.e1(v9Var);
            case 1:
                Context context2 = (Context) obj2;
                org.telegram.ui.Components.jn jnVar = (org.telegram.ui.Components.jn) obj;
                boolean z10 = jnVar.f36096n;
                org.telegram.ui.ActionBar.e6 e6Var6 = jnVar.f33606a;
                switch (i7) {
                    case 0:
                        i10 = -1;
                        n4Var = new org.telegram.ui.Cells.n4((Context) obj2, org.telegram.ui.ActionBar.j6.L6, 21, 15, false, jnVar.f33606a);
                        break;
                    case 1:
                        i10 = -1;
                        View x6Var3 = new org.telegram.ui.Cells.x6(context2, (org.telegram.ui.Cells.y0) null);
                        new org.telegram.ui.Components.fq(new ColorDrawable(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28792a7, e6Var6)), org.telegram.ui.ActionBar.j6.Y0(context2, 2131231229, org.telegram.ui.ActionBar.j6.f28813b7)).f34678x = true;
                        n4Var = x6Var3;
                        break;
                    case 2:
                        i10 = -1;
                        n4Var = new org.telegram.ui.Cells.y8(context2, e6Var6);
                        break;
                    case 3:
                        i10 = -1;
                        n4Var = new org.telegram.ui.Cells.l8(context2, e6Var6);
                        break;
                    case 4:
                    case 11:
                        i10 = -1;
                        org.telegram.ui.Components.en enVar = new org.telegram.ui.Components.en(this, (Context) obj2, jnVar.J ? 1 : 0, jnVar.f33606a, i7);
                        if (i7 == 11 && !z10) {
                            enVar.setTextRight(98);
                            enVar.b().setOnClickListener(new View.OnClickListener(this) {
                                public final org.telegram.ui.l4 f33637b;

                                {
                                    this.f33637b = this;
                                }

                                @Override
                                public final void onClick(View view2) {
                                    switch (r2) {
                                        case 0:
                                            jn.T((jn) this.f33637b.f48827e, -2);
                                            return;
                                        case 1:
                                            jn.T((jn) this.f33637b.f48827e, -3);
                                            return;
                                        default:
                                            ((jn) this.f33637b.f48827e).c0(view2, (org.telegram.ui.Cells.z5) view2.getParent(), true);
                                            return;
                                    }
                                }
                            });
                        }
                        enVar.d();
                        enVar.setIconsColor(org.telegram.ui.ActionBar.j6.f29050o7);
                        enVar.c(new org.telegram.ui.Components.fn(this, enVar, i7));
                        n4Var = enVar;
                        break;
                    case 5:
                    default:
                        i11 = -1;
                        org.telegram.ui.Components.hn hnVar2 = new org.telegram.ui.Components.hn(this, (Context) obj2, jnVar.J ? 1 : 0, new View.OnClickListener(this) {
                            public final org.telegram.ui.l4 f33637b;

                            {
                                this.f33637b = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (r2) {
                                    case 0:
                                        jn.T((jn) this.f33637b.f48827e, -2);
                                        return;
                                    case 1:
                                        jn.T((jn) this.f33637b.f48827e, -3);
                                        return;
                                    default:
                                        ((jn) this.f33637b.f48827e).c0(view2, (org.telegram.ui.Cells.z5) view2.getParent(), true);
                                        return;
                                }
                            }
                        }, jnVar.f33606a);
                        if (!z10) {
                            hnVar2.setTextRight(140);
                            hnVar2.b().setOnClickListener(new org.telegram.ui.Components.n2(8, this, hnVar2));
                        }
                        int i14 = org.telegram.ui.ActionBar.j6.f29050o7;
                        hnVar2.setIconsColor(i14);
                        org.telegram.ui.Components.fp fpVar = hnVar2.f32121r;
                        if (fpVar != null) {
                            fpVar.getCheckBoxBase().i(org.telegram.messenger.g0.L(6.0f));
                            CheckBoxBase checkBoxBase = fpVar.getCheckBoxBase();
                            float f10 = hnVar2.f32115a.f57081e;
                            if (checkBoxBase.f32446w != f10) {
                                checkBoxBase.f32446w = f10;
                                checkBoxBase.b();
                            }
                        }
                        hnVar2.getCheckBox().b(-1, i14, org.telegram.ui.ActionBar.j6.f28979k7);
                        hnVar2.c(new bi.v(11, this, hnVar2));
                        hnVar2.setShowNextButton(true);
                        EditTextBoldCursor textView = hnVar2.getTextView();
                        textView.setImeOptions(textView.getImeOptions() | 5);
                        textView.setOnEditorActionListener(new ld(2, this, hnVar2));
                        textView.setOnKeyListener(new org.telegram.ui.Components.dn(hnVar2, 0));
                        hnVar = hnVar2;
                        i10 = i11;
                        n4Var = hnVar;
                        break;
                    case 6:
                        i11 = -1;
                        hnVar = new org.telegram.ui.Cells.q8(context2, e6Var6);
                        i10 = i11;
                        n4Var = hnVar;
                        break;
                    case 7:
                        i11 = -1;
                        org.telegram.ui.Components.gn gnVar = new org.telegram.ui.Components.gn(this, context2, jnVar.J ? 1 : 0);
                        gnVar.d();
                        if (!z10) {
                            gnVar.setTextRight(98);
                            gnVar.b().setOnClickListener(new View.OnClickListener(this) {
                                public final org.telegram.ui.l4 f33637b;

                                {
                                    this.f33637b = this;
                                }

                                @Override
                                public final void onClick(View view2) {
                                    switch (r2) {
                                        case 0:
                                            jn.T((jn) this.f33637b.f48827e, -2);
                                            return;
                                        case 1:
                                            jn.T((jn) this.f33637b.f48827e, -3);
                                            return;
                                        default:
                                            ((jn) this.f33637b.f48827e).c0(view2, (org.telegram.ui.Cells.z5) view2.getParent(), true);
                                            return;
                                    }
                                }
                            });
                        }
                        gnVar.setIconsColor(org.telegram.ui.ActionBar.j6.f29050o7);
                        gnVar.c(new bi.v(10, this, gnVar));
                        hnVar = gnVar;
                        i10 = i11;
                        n4Var = hnVar;
                        break;
                    case 8:
                        i11 = -1;
                        View bnVar = new org.telegram.ui.Components.bn(context2, 0);
                        bnVar.setTag(-33024);
                        view = bnVar;
                        hnVar = view;
                        i10 = i11;
                        n4Var = hnVar;
                        break;
                    case 9:
                        i11 = -1;
                        View o2Var = new bi.o2(16, context2, this);
                        o2Var.setTag(-33024);
                        view = o2Var;
                        hnVar = view;
                        i10 = i11;
                        n4Var = hnVar;
                        break;
                    case 10:
                        i11 = -1;
                        org.telegram.ui.Cells.x5 x5Var = new org.telegram.ui.Cells.x5(context2, e6Var6);
                        x5Var.getCheckBox().setIcon(2131232514);
                        hnVar = x5Var;
                        i10 = i11;
                        n4Var = hnVar;
                        break;
                }
                return i5.c.q(n4Var, n4Var, i10, -2);
            case 2:
                return new v4.e1(new org.telegram.ui.Components.gz((org.telegram.ui.Components.iz) obj, (Context) obj2));
            case 3:
                org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2(0, (Context) obj2, null);
                n2Var.setBackground(null);
                n2Var.setLayoutParams(new v4.p0(-1, -2));
                return new v4.e1(n2Var);
            case 4:
                Context context3 = (Context) obj2;
                if (i7 == 0) {
                    org.telegram.ui.ActionBar.e6 e6Var7 = ((org.telegram.ui.Components.td0) obj).J0;
                    ?? frameLayout3 = new FrameLayout(context3);
                    frameLayout3.f31416e = new j6.o((Object) frameLayout3, 23);
                    TextView textView2 = new TextView(context3);
                    frameLayout3.f31413a = textView2;
                    textView2.setGravity(5);
                    textView2.setTextColor(-1);
                    textView2.setTextSize(1, 12.0f);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    frameLayout3.addView(textView2, c8.ja.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
                    TextView textView3 = new TextView(context3);
                    frameLayout3.f31414b = textView3;
                    org.telegram.ui.ActionBar.q6.U(textView3, org.telegram.ui.ActionBar.j6.f29098qg, e6Var7);
                    textView3.setTextSize(1, 12.0f);
                    textView3.setGravity(5);
                    textView3.setSingleLine(true);
                    frameLayout3.addView(textView3, c8.ja.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
                    ?? view2 = new View(context3);
                    Paint paint = new Paint();
                    view2.f35607a = paint;
                    Paint paint2 = new Paint(1);
                    view2.f35608b = paint2;
                    view2.f35609c = org.telegram.messenger.g0.L(16.0f);
                    view2.d = 0;
                    view2.f35610e = 0.0f;
                    view2.f35611f = false;
                    paint.setColor(-11711155);
                    paint2.setColor(-1);
                    frameLayout3.f31415c = view2;
                    frameLayout3.addView(view2, c8.ja.d(-1, 40.0f, 19, 96.0f, 0.0f, 24.0f, 0.0f));
                    frameLayout3.setSeekBarDelegate(new org.telegram.ui.Components.gx(this, 11));
                    r5Var = frameLayout3;
                } else {
                    org.telegram.ui.Cells.r5 r5Var2 = new org.telegram.ui.Cells.r5(context3);
                    r5Var2.setOnClickListener(new org.telegram.ui.Components.y60(this, 4));
                    r5Var = r5Var2;
                }
                return new v4.e1(r5Var);
            case 5:
                Context context4 = (Context) obj2;
                org.telegram.ui.Components.bt0 bt0Var = (org.telegram.ui.Components.bt0) obj;
                if (i7 != 0) {
                    FrameLayout v1Var = new bi.v1(context4, 21);
                    v1Var.setWillNotDraw(false);
                    bt0Var.f33371p1 = new TextView(context4);
                    org.telegram.ui.ActionBar.q6.U(bt0Var.f33371p1, org.telegram.ui.ActionBar.j6.J5, bt0Var.J0);
                    bt0Var.f33371p1.setTextSize(1, 14.0f);
                    bt0Var.f33371p1.setGravity(17);
                    bt0Var.f33371p1.setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
                    v1Var.addView(bt0Var.f33371p1, c8.ja.c(40.0f, -1));
                    frameLayout = v1Var;
                } else {
                    frameLayout = new org.telegram.ui.Cells.q7(54, context4, bt0Var.J0, false);
                }
                return new v4.e1(frameLayout);
            case 6:
                return new v4.e1(new org.telegram.ui.Components.qw0((org.telegram.ui.Components.rw0) obj, ((org.telegram.ui.Components.rw0) obj2).getContext()));
            case 7:
                return new v4.e1(new org.telegram.ui.Components.t61((org.telegram.ui.Components.v61) obj, (Context) obj2));
            case 8:
                Context context5 = (Context) obj2;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                if (i7 != 4) {
                                    wt0Var = new org.telegram.ui.Cells.y8(context5);
                                } else {
                                    wt0Var = new org.telegram.ui.Cells.h5(context5);
                                }
                            } else {
                                org.telegram.ui.Components.wt0 wt0Var2 = new org.telegram.ui.Components.wt0(context5, null);
                                wt0Var2.setCallback(new zr(this, 3));
                                wt0Var = wt0Var2;
                            }
                        } else {
                            wt0Var = new org.telegram.ui.Cells.n4(context5);
                        }
                    } else {
                        wt0Var = new org.telegram.ui.Cells.x6(context5, (org.telegram.ui.Cells.y0) null);
                    }
                } else {
                    org.telegram.ui.Cells.q8 q8Var2 = new org.telegram.ui.Cells.q8(context5);
                    q8Var2.d(org.telegram.ui.ActionBar.j6.f28904g6, org.telegram.ui.ActionBar.j6.O6, org.telegram.ui.ActionBar.j6.P6, org.telegram.ui.ActionBar.j6.Q6, org.telegram.ui.ActionBar.j6.R6);
                    q8Var2.setTypeface(org.telegram.messenger.g0.o());
                    q8Var2.setHeight(56);
                    wt0Var = q8Var2;
                }
                return i5.c.q(wt0Var, wt0Var, -1, -2);
            case 9:
                Context context6 = (Context) obj2;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                if (i7 != 4) {
                                    if (i7 != 5) {
                                        x6Var = new org.telegram.ui.Cells.l8(context6);
                                    } else {
                                        x6Var = new org.telegram.ui.Cells.h5(context6);
                                    }
                                } else {
                                    x6Var = new org.telegram.ui.Cells.y8(context6);
                                }
                            } else {
                                x6Var = new org.telegram.ui.Cells.q8(context6);
                            }
                        } else {
                            x6Var = new org.telegram.ui.Cells.n4(context6, 22);
                        }
                    } else {
                        x6Var = new org.telegram.ui.Cells.v9(context6);
                    }
                } else {
                    x6Var = new org.telegram.ui.Cells.x6(context6, (org.telegram.ui.Cells.y0) null);
                }
                return i5.c.q(x6Var, x6Var, -1, -2);
            case 10:
                Context context7 = (Context) obj2;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                x8Var = new org.telegram.ui.Cells.y8(context7);
                            } else {
                                View v9Var4 = new org.telegram.ui.Cells.v9(context7);
                                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, v9Var4, null);
                                x8Var = v9Var4;
                            }
                        } else {
                            x8Var = new org.telegram.ui.Cells.x6(context7, (org.telegram.ui.Cells.y0) null);
                        }
                    } else {
                        org.telegram.ui.Cells.x8 x8Var2 = new org.telegram.ui.Cells.x8(context7);
                        x8Var2.setMultilineDetail(true);
                        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, x8Var2, null);
                        x8Var = x8Var2;
                    }
                } else {
                    View n4Var3 = new org.telegram.ui.Cells.n4(context7);
                    org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, n4Var3, null);
                    x8Var = n4Var3;
                }
                return i5.c.q(x8Var, x8Var, -1, -2);
            case 11:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                Context context8 = (Context) obj2;
                if (i7 == 0) {
                    e6Var = ((org.telegram.ui.ActionBar.e2) notificationsSettingsActivity).resourceProvider;
                    n4Var2 = new org.telegram.ui.Cells.n4(context8, e6Var);
                } else if (i7 == 1) {
                    e6Var2 = ((org.telegram.ui.ActionBar.e2) notificationsSettingsActivity).resourceProvider;
                    n4Var2 = new org.telegram.ui.Cells.q8(context8, e6Var2);
                } else if (i7 != 2) {
                    if (i7 == 3) {
                        e6Var3 = ((org.telegram.ui.ActionBar.e2) notificationsSettingsActivity).resourceProvider;
                        n4Var2 = new org.telegram.ui.Cells.h5((Context) obj2, 21, 64, true, e6Var3);
                    } else if (i7 != 4) {
                        if (i7 != 5) {
                            e6Var5 = ((org.telegram.ui.ActionBar.e2) notificationsSettingsActivity).resourceProvider;
                            n4Var2 = new org.telegram.ui.Cells.y8(context8, e6Var5);
                        } else {
                            e6Var4 = ((org.telegram.ui.ActionBar.e2) notificationsSettingsActivity).resourceProvider;
                            n4Var2 = new org.telegram.ui.Cells.v9(0, context8, e6Var4);
                        }
                    } else {
                        n4Var2 = new org.telegram.ui.Cells.x6(context8, (org.telegram.ui.Cells.y0) null);
                    }
                } else {
                    n4Var2 = new org.telegram.ui.Cells.x8(context8);
                }
                return new v4.e1(n4Var2);
            case 12:
                Context context9 = (Context) obj2;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 3) {
                            if (i7 != 4) {
                                q8Var = new org.telegram.ui.Cells.y8(context9);
                            } else {
                                q8Var = new li0(context9);
                                q8Var.setTag(-33024);
                            }
                        } else {
                            q8Var = new org.telegram.ui.Cells.n4(context9);
                        }
                    } else {
                        q8Var = new org.telegram.ui.Cells.v9(context9);
                    }
                } else {
                    q8Var = new org.telegram.ui.Cells.q8(context9);
                }
                return new v4.e1(q8Var);
            case 13:
                Context context10 = (Context) obj2;
                ?? frameLayout4 = new FrameLayout(context10);
                frameLayout4.f31811e = new Paint();
                frameLayout4.f31809b = new org.telegram.messenger.ve[4];
                frameLayout4.f31808a = new org.telegram.ui.Cells.t5[4];
                for (int i15 = 0; i15 < 4; i15++) {
                    frameLayout4.f31808a[i15] = new org.telegram.ui.Cells.t5((org.telegram.ui.Cells.v5) frameLayout4, context10);
                    frameLayout4.addView(frameLayout4.f31808a[i15]);
                    frameLayout4.f31808a[i15].setVisibility(4);
                    frameLayout4.f31808a[i15].setTag(Integer.valueOf(i15));
                    frameLayout4.f31808a[i15].setOnClickListener(new org.telegram.ui.Cells.a(frameLayout4, 9));
                }
                frameLayout4.setDelegate(new ni0(this, 1));
                return new v4.e1(frameLayout4);
            case 14:
                ym0 ym0Var = (ym0) obj;
                boolean z11 = ym0Var.f53589s0;
                Context context11 = (Context) obj2;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                org.telegram.ui.Cells.e3 e3Var = new org.telegram.ui.Cells.e3(context11, null);
                                e3Var.setForceDarkTheme(z11);
                                l8Var = e3Var;
                            } else {
                                org.telegram.ui.Cells.l8 l8Var2 = new org.telegram.ui.Cells.l8(23, context11, true);
                                l8Var2.setLayoutParams(new v4.p0(-1, -2));
                                l8Var = l8Var2;
                                if (z11) {
                                    org.telegram.ui.ActionBar.q6.X(l8Var2.f30653a, ym0Var.f53594w0, null);
                                    org.telegram.ui.ActionBar.q6.s(l8Var2.f30656e, org.telegram.ui.ActionBar.j6.f28950ih, null, PorterDuff.Mode.MULTIPLY);
                                    l8Var = l8Var2;
                                }
                            }
                        } else {
                            l8Var = new org.telegram.ui.Cells.g7(1, context11, null);
                        }
                    } else {
                        ViewGroup frameLayout5 = new FrameLayout(context11);
                        frameLayout5.setLayoutParams(new v4.p0(-1, -2));
                        RadialProgressView radialProgressView = new RadialProgressView(context11, null);
                        radialProgressView.setProgressColor(-11371101);
                        frameLayout5.addView(radialProgressView, c8.ja.c(-1.0f, -1));
                        l8Var = frameLayout5;
                    }
                } else {
                    org.telegram.ui.Cells.q5 q5Var = new org.telegram.ui.Cells.q5(context11, null);
                    q5Var.setDelegate(new wm0(this));
                    FrameLayout checkFrame = q5Var.getCheckFrame();
                    if (ym0Var.U == 0) {
                        i13 = 0;
                    }
                    checkFrame.setVisibility(i13);
                    l8Var = q5Var;
                }
                return new v4.e1(l8Var);
            case 15:
                Context context12 = (Context) obj2;
                ?? frameLayout6 = new FrameLayout(context12);
                new Paint();
                frameLayout6.setWillNotDraw(false);
                org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context12);
                frameLayout6.f31879a = i9Var;
                i9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
                frameLayout6.addView(i9Var, c8.ja.c(-1.0f, -1));
                FrameLayout frameLayout7 = new FrameLayout(context12);
                frameLayout6.f31880b = frameLayout7;
                frameLayout6.addView(frameLayout7, c8.ja.e(42, 42, 53));
                di.k4 k4Var = new di.k4(context12);
                k4Var.d = new Path();
                k4Var.f8909e = new float[8];
                k4Var.f8907b = new RectF();
                k4Var.f8908c = new Paint(1);
                frameLayout6.f31882e = k4Var;
                k4Var.setWillNotDraw(false);
                k4Var.setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), 0);
                frameLayout6.addView(k4Var, c8.ja.e(-1, 16, 83));
                k4Var.addView(org.telegram.messenger.i20.e(context12, 2131231463), c8.ja.e(-2, -2, 19));
                TextView textView4 = new TextView(context12);
                frameLayout6.d = textView4;
                textView4.setTextColor(-1);
                textView4.setTextSize(1, 12.0f);
                textView4.setImportantForAccessibility(2);
                k4Var.addView(textView4, c8.ja.d(-2, -2.0f, 19, 18.0f, -0.7f, 0.0f, 0.0f));
                org.telegram.ui.Components.fp fpVar2 = new org.telegram.ui.Components.fp(24, context12, null);
                frameLayout6.f31881c = fpVar2;
                fpVar2.setDrawBackgroundAsArc(11);
                fpVar2.b(org.telegram.ui.ActionBar.j6.W9, org.telegram.ui.ActionBar.j6.X9, org.telegram.ui.ActionBar.j6.V9);
                frameLayout6.addView(fpVar2, c8.ja.d(26, 26.0f, 51, 55.0f, 4.0f, 0.0f, 0.0f));
                fpVar2.setVisibility(0);
                frameLayout6.setFocusable(true);
                frameLayout7.setOnClickListener(new g40(this, 21));
                return new v4.e1(frameLayout6);
            case 16:
                Context context13 = (Context) obj2;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                if (i7 != 4) {
                                    if (i7 != 6) {
                                        x6Var2 = new mx0((ProxyListActivity) obj, context13);
                                        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, x6Var2, null);
                                    } else {
                                        x6Var2 = new org.telegram.ui.Components.wt0(context13, null);
                                        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, x6Var2, null);
                                    }
                                } else {
                                    x6Var2 = new org.telegram.ui.Cells.y8(context13);
                                }
                            } else {
                                x6Var2 = new org.telegram.ui.Cells.q8(context13);
                                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, x6Var2, null);
                            }
                        } else {
                            x6Var2 = new org.telegram.ui.Cells.n4(context13);
                            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, x6Var2, null);
                        }
                    } else {
                        x6Var2 = new org.telegram.ui.Cells.v9(context13);
                        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, x6Var2, null);
                    }
                } else {
                    x6Var2 = new org.telegram.ui.Cells.x6(context13, (org.telegram.ui.Cells.y0) null);
                }
                return i5.c.q(x6Var2, x6Var2, -1, -2);
            case 17:
                Context context14 = (Context) obj2;
                if (i7 == 0) {
                    v9Var2 = new org.telegram.ui.Cells.n4(context14);
                } else if (i7 == 1) {
                    v9Var2 = new org.telegram.ui.Cells.q8(context14);
                } else if (i7 == 2) {
                    org.telegram.ui.Cells.v9 v9Var5 = new org.telegram.ui.Cells.v9(context14);
                    v9Var5.setCanDisable(true);
                    v9Var2 = v9Var5;
                } else {
                    v9Var2 = new org.telegram.ui.Cells.y8(context14);
                }
                v9Var2.setLayoutParams(new v4.p0(-1, -2));
                return new v4.e1(v9Var2);
            case 18:
                Context context15 = (Context) obj2;
                if (i7 == 0) {
                    t4Var = new org.telegram.ui.Cells.t2(context15, false);
                } else {
                    t4Var = new org.telegram.ui.Cells.t4(context15);
                }
                t4Var.setLayoutParams(new v4.p0(-1, -2));
                return new v4.e1(t4Var);
            default:
                Context context16 = (Context) obj2;
                int c10 = p1.g.c(p1.g.d(3)[i7]);
                if (c10 != 1) {
                    if (c10 != 2) {
                        frameLayout2 = new org.telegram.ui.ActionBar.n1(context16, null);
                    } else {
                        ?? frameLayout8 = new FrameLayout(context16);
                        frameLayout8.setWillNotDraw(false);
                        TextPaint textPaint = new TextPaint(1);
                        frameLayout8.h = textPaint;
                        textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
                        org.telegram.ui.Components.qm0 qm0Var = new org.telegram.ui.Components.qm0(context16);
                        frameLayout8.f55034a = qm0Var;
                        qm0Var.setReportChanges(true);
                        qm0Var.setDelegate(new org.telegram.messenger.ou((Object) frameLayout8, 15));
                        qm0Var.setImportantForAccessibility(2);
                        frameLayout8.addView(qm0Var, c8.ja.d(-1, 38.0f, 83, 5.0f, 29.0f, 47.0f, 0.0f));
                        frameLayout2 = frameLayout8;
                    }
                } else {
                    frameLayout2 = new org.telegram.ui.Cells.n4(context16);
                }
                frameLayout2.setLayoutParams(new v4.p0(-1, -2));
                return new v4.e1(frameLayout2);
        }
    }

    @Override
    public void y(v4.e1 e1Var) {
        int i7;
        int i10;
        int i11 = this.f48826c;
        Object obj = this.f48827e;
        switch (i11) {
            case 1:
                org.telegram.ui.Components.jn jnVar = (org.telegram.ui.Components.jn) obj;
                sh.d dVar = jnVar.n1;
                boolean z10 = jnVar.f36096n;
                int i12 = e1Var.f58539f;
                View view = e1Var.f58535a;
                CharSequence charSequence = "";
                if (i12 == 4) {
                    org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) view;
                    z5Var.setTag(1);
                    CharSequence charSequence2 = jnVar.O;
                    if (charSequence2 != null) {
                        charSequence = charSequence2;
                    }
                    if (z10) {
                        i10 = 2131744053;
                    } else {
                        i10 = 2131746448;
                    }
                    z5Var.o(charSequence, org.telegram.messenger.hd.M0(i10, null), true);
                    z5Var.setTag(null);
                    org.telegram.ui.Components.jn.Q(jnVar, view, e1Var.b());
                    return;
                } else if (i12 == 11) {
                    org.telegram.ui.Cells.z5 z5Var2 = (org.telegram.ui.Cells.z5) view;
                    z5Var2.setTag(1);
                    CharSequence charSequence3 = jnVar.P;
                    if (charSequence3 != null) {
                        charSequence = charSequence3;
                    }
                    z5Var2.o(charSequence, org.telegram.messenger.hd.M0(2131746449, null), false);
                    z5Var2.setTag(null);
                    z5Var2.f32118e.b(dVar.b(-2), false);
                    org.telegram.ui.Components.jn.Q(jnVar, view, e1Var.b());
                    return;
                } else if (i12 == 5) {
                    int b10 = e1Var.b();
                    org.telegram.ui.Cells.z5 z5Var3 = (org.telegram.ui.Cells.z5) view;
                    z5Var3.setTag(1);
                    z5Var3.f32115a.a(jnVar.f36076c0, false);
                    int i13 = b10 - jnVar.f36110u0;
                    CharSequence charSequence4 = jnVar.L[i13];
                    if (z10) {
                        i7 = 2131744055;
                    } else {
                        i7 = 2131747774;
                    }
                    z5Var3.o(charSequence4, org.telegram.messenger.hd.M0(i7, null), true);
                    z5Var3.setTag(null);
                    if (jnVar.f36094l0 == b10) {
                        EditTextBoldCursor textView = z5Var3.getTextView();
                        textView.requestFocus();
                        org.telegram.messenger.g0.J3(textView);
                        jnVar.f36094l0 = -1;
                    }
                    if (!z10) {
                        z5Var3.f32118e.b(dVar.b(i13), false);
                    }
                    org.telegram.ui.Components.jn.Q(jnVar, view, b10);
                    return;
                } else if (i12 == 7) {
                    org.telegram.ui.Cells.z5 z5Var4 = (org.telegram.ui.Cells.z5) view;
                    z5Var4.setTag(1);
                    CharSequence charSequence5 = jnVar.Q;
                    if (charSequence5 != null) {
                        charSequence = charSequence5;
                    }
                    z5Var4.o(charSequence, org.telegram.messenger.hd.M0(2131754474, null), false);
                    z5Var4.setTag(null);
                    if (!z10) {
                        z5Var4.f32118e.b(dVar.b(-3), false);
                    }
                    org.telegram.ui.Components.jn.Q(jnVar, view, e1Var.b());
                    return;
                } else {
                    return;
                }
            case 9:
                if (e1Var.f58539f == 3) {
                    org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) e1Var.f58535a;
                    int b11 = e1Var.b();
                    DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) obj;
                    if (b11 == dataSettingsActivity.F) {
                        q8Var.setChecked(org.telegram.messenger.gz.E0);
                        return;
                    } else if (b11 == dataSettingsActivity.E) {
                        q8Var.setChecked(org.telegram.messenger.gz.B0);
                        return;
                    } else if (b11 == dataSettingsActivity.G) {
                        q8Var.setChecked(org.telegram.messenger.gz.C0);
                        return;
                    } else if (b11 == dataSettingsActivity.H) {
                        q8Var.setChecked(org.telegram.messenger.gz.D0);
                        return;
                    } else if (b11 == dataSettingsActivity.K) {
                        int i14 = org.telegram.messenger.gz.f23929a;
                        q8Var.setChecked(org.telegram.messenger.qc.e(2048));
                        return;
                    } else if (b11 == dataSettingsActivity.L) {
                        int i15 = org.telegram.messenger.gz.f23929a;
                        q8Var.setChecked(org.telegram.messenger.qc.e(1024));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 16:
                ProxyListActivity proxyListActivity = (ProxyListActivity) obj;
                if (e1Var.f58539f == 3) {
                    org.telegram.ui.Cells.q8 q8Var2 = (org.telegram.ui.Cells.q8) e1Var.f58535a;
                    int b12 = e1Var.b();
                    if (b12 == ProxyListActivity.g0(proxyListActivity)) {
                        q8Var2.setChecked(proxyListActivity.d);
                        return;
                    } else if (b12 == proxyListActivity.f43255w) {
                        q8Var2.setChecked(org.telegram.messenger.gz.f23931a1);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void z(v4.e1 e1Var) {
        switch (this.f48826c) {
            case 1:
                org.telegram.ui.Components.jn jnVar = (org.telegram.ui.Components.jn) this.f48827e;
                int i7 = e1Var.f58539f;
                if (i7 == 4 || i7 == 11 || i7 == 5) {
                    EditTextBoldCursor textView = ((org.telegram.ui.Cells.z5) e1Var.f58535a).getTextView();
                    if (textView.isFocused()) {
                        if (jnVar.J) {
                            org.telegram.ui.Components.an anVar = jnVar.f36116y;
                            if (anVar != null) {
                                anVar.f();
                            }
                            jnVar.e0(true);
                        }
                        jnVar.f36087h1 = null;
                        textView.clearFocus();
                        org.telegram.messenger.g0.v1(textView);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public l4(pg.i iVar, LaunchActivity launchActivity) {
        this.f48826c = 19;
        this.f48827e = iVar;
        this.d = launchActivity;
    }

    public l4(Context context) {
        this.f48826c = 18;
        this.d = context;
        ArrayList arrayList = new ArrayList();
        this.f48827e = arrayList;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        org.telegram.ui.Cells.o2 o2Var = new org.telegram.ui.Cells.o2();
        o2Var.f30788a = org.telegram.messenger.hd.M0(2131744171, null);
        o2Var.f30789b = org.telegram.messenger.hd.M0(2131744163, null);
        o2Var.f30790c = 0;
        o2Var.d = 0;
        o2Var.f30791e = true;
        o2Var.f30792f = false;
        o2Var.f30793g = 0;
        o2Var.h = currentTimeMillis;
        o2Var.f30794i = false;
        o2Var.f30795j = false;
        o2Var.f30796k = 2;
        arrayList.add(o2Var);
        org.telegram.ui.Cells.o2 o2Var2 = new org.telegram.ui.Cells.o2();
        o2Var2.f30788a = org.telegram.messenger.hd.M0(2131744170, null);
        o2Var2.f30789b = org.telegram.messenger.hd.M0(2131744162, null);
        o2Var2.f30790c = 1;
        o2Var2.d = 2;
        o2Var2.f30791e = false;
        o2Var2.f30792f = false;
        o2Var2.f30793g = 0;
        o2Var2.h = currentTimeMillis - 3600;
        o2Var2.f30794i = false;
        o2Var2.f30795j = false;
        o2Var2.f30796k = -1;
        arrayList.add(o2Var2);
        org.telegram.ui.Cells.o2 o2Var3 = new org.telegram.ui.Cells.o2();
        o2Var3.f30788a = org.telegram.messenger.hd.M0(2131744169, null);
        o2Var3.f30789b = org.telegram.messenger.hd.M0(2131744161, null);
        o2Var3.f30790c = 2;
        o2Var3.d = 3;
        o2Var3.f30791e = false;
        o2Var3.f30792f = true;
        o2Var3.f30793g = 0;
        o2Var3.h = currentTimeMillis - 7200;
        o2Var3.f30794i = false;
        o2Var3.f30795j = true;
        o2Var3.f30796k = -1;
        arrayList.add(o2Var3);
        org.telegram.ui.Cells.o2 o2Var4 = new org.telegram.ui.Cells.o2();
        o2Var4.f30788a = org.telegram.messenger.hd.M0(2131744168, null);
        o2Var4.f30789b = org.telegram.messenger.hd.M0(2131744160, null);
        o2Var4.f30790c = 3;
        o2Var4.d = 0;
        o2Var4.f30791e = false;
        o2Var4.f30792f = false;
        o2Var4.f30793g = 2;
        o2Var4.h = currentTimeMillis - 10800;
        o2Var4.f30794i = false;
        o2Var4.f30795j = false;
        o2Var4.f30796k = -1;
        arrayList.add(o2Var4);
        org.telegram.ui.Cells.o2 o2Var5 = new org.telegram.ui.Cells.o2();
        o2Var5.f30788a = org.telegram.messenger.hd.M0(2131744167, null);
        o2Var5.f30789b = org.telegram.messenger.hd.M0(2131744159, null);
        o2Var5.f30790c = 4;
        o2Var5.d = 0;
        o2Var5.f30791e = false;
        o2Var5.f30792f = false;
        o2Var5.f30793g = 1;
        o2Var5.h = currentTimeMillis - 14400;
        o2Var5.f30794i = false;
        o2Var5.f30795j = false;
        o2Var5.f30796k = 2;
        arrayList.add(o2Var5);
        org.telegram.ui.Cells.o2 o2Var6 = new org.telegram.ui.Cells.o2();
        o2Var6.f30788a = org.telegram.messenger.hd.M0(2131744166, null);
        o2Var6.f30789b = org.telegram.messenger.hd.M0(2131744158, null);
        o2Var6.f30790c = 5;
        o2Var6.d = 0;
        o2Var6.f30791e = false;
        o2Var6.f30792f = false;
        o2Var6.f30793g = 0;
        o2Var6.h = currentTimeMillis - 18000;
        o2Var6.f30794i = false;
        o2Var6.f30795j = false;
        o2Var6.f30796k = -1;
        arrayList.add(o2Var6);
        org.telegram.ui.Cells.o2 o2Var7 = new org.telegram.ui.Cells.o2();
        o2Var7.f30788a = org.telegram.messenger.hd.M0(2131744165, null);
        o2Var7.f30789b = org.telegram.messenger.hd.M0(2131744157, null);
        o2Var7.f30790c = 6;
        o2Var7.d = 0;
        o2Var7.f30791e = false;
        o2Var7.f30792f = false;
        o2Var7.f30793g = 0;
        o2Var7.h = currentTimeMillis - 21600;
        o2Var7.f30794i = true;
        o2Var7.f30795j = false;
        o2Var7.f30796k = -1;
        arrayList.add(o2Var7);
        org.telegram.ui.Cells.o2 o2Var8 = new org.telegram.ui.Cells.o2();
        o2Var8.f30788a = org.telegram.messenger.hd.M0(2131744164, null);
        o2Var8.f30789b = org.telegram.messenger.hd.M0(2131744156, null);
        o2Var8.f30790c = 0;
        o2Var8.d = 0;
        o2Var8.f30791e = false;
        o2Var8.f30792f = false;
        o2Var8.f30793g = 0;
        o2Var8.h = currentTimeMillis - 25200;
        o2Var8.f30794i = true;
        o2Var8.f30795j = false;
        o2Var8.f30796k = -1;
        arrayList.add(o2Var8);
    }

    public l4(ProxyListActivity proxyListActivity, Context context) {
        this.f48826c = 16;
        this.f48827e = proxyListActivity;
        this.d = context;
        C(true);
    }
}
