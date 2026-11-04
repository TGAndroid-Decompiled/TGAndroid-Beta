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
public final class n4 extends org.telegram.ui.Components.sj0 {
    public final int f47864c;
    public final Object d;
    public final Object f47865e;

    public n4(int i3, Object obj, Object obj2) {
        this.f47864c = i3;
        this.f47865e = obj;
        this.d = obj2;
    }

    private final void G(u4.d1 r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.n4.G(u4.d1, int):void");
    }

    private final void H(u4.d1 r23, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.n4.H(u4.d1, int):void");
    }

    private final void I(u4.d1 d1Var, int i3) {
        boolean P1;
        boolean z10;
        sm0 sm0Var = (sm0) this.f47865e;
        org.telegram.messenger.pe peVar = sm0Var.K;
        ArrayList arrayList = sm0Var.f49555n;
        ArrayList arrayList2 = sm0Var.f49542c;
        HashMap hashMap = sm0Var.f49540b;
        int i10 = d1Var.f55544f;
        View view = d1Var.f55540a;
        int i11 = -1;
        int i12 = 0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
                        if (i3 < arrayList.size()) {
                            l8Var.o(2131232327, (CharSequence) arrayList.get(i3), false);
                            return;
                        } else {
                            l8Var.o(2131232094, org.telegram.messenger.bd.M0(2131752067, null), false);
                            return;
                        }
                    }
                    return;
                }
                org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) peVar.f24738e.get(i3);
                org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
                g7Var.setPhotoEntry(yeVar);
                g7Var.b(hashMap.containsKey(Integer.valueOf(yeVar.C)), false);
                g7Var.setTag(Integer.valueOf(i3));
                return;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -1;
                layoutParams.height = sm0Var.S;
                view.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
        q5Var.setItemSize(sm0Var.S);
        org.telegram.ui.Components.k9 imageView = q5Var.getImageView();
        q5Var.setTag(Integer.valueOf(i3));
        imageView.r();
        if (peVar != null) {
            org.telegram.messenger.ye yeVar2 = (org.telegram.messenger.ye) peVar.f24738e.get(i3);
            if (arrayList2.size() > 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            q5Var.d(yeVar2, z10, true, false, false);
            int i13 = yeVar2.C;
            if (sm0Var.f49545e) {
                i11 = arrayList2.indexOf(Integer.valueOf(i13));
            }
            q5Var.b(i11, hashMap.containsKey(Integer.valueOf(i13)), false);
            P1 = PhotoViewer.P1(yeVar2.I);
        } else {
            org.telegram.messenger.bf bfVar = (org.telegram.messenger.bf) sm0Var.f49547f.get(i3);
            q5Var.e(bfVar);
            q5Var.getVideoInfoContainer().setVisibility(4);
            if (sm0Var.f49545e) {
                i11 = arrayList2.indexOf(bfVar.B);
            }
            q5Var.b(i11, hashMap.containsKey(bfVar.B), false);
            P1 = PhotoViewer.P1(bfVar.g());
        }
        imageView.getImageReceiver().O0(!P1, true);
        q5Var.getCheckBox().setVisibility((sm0Var.U != 0 || P1) ? 8 : 8);
    }

    private final void J(u4.d1 d1Var, int i3) {
        int i10;
        PhotoViewer photoViewer = (PhotoViewer) this.f47865e;
        Context context = (Context) this.d;
        org.telegram.ui.Cells.w5 w5Var = (org.telegram.ui.Cells.w5) d1Var.f55540a;
        int L = org.telegram.messenger.g0.L(85.0f);
        if (i3 != 0) {
            i10 = org.telegram.messenger.g0.L(6.0f);
        } else {
            i10 = 0;
        }
        w5Var.f30807f = L;
        org.telegram.ui.Components.wo woVar = w5Var.f30805c;
        org.telegram.ui.Components.k9 k9Var = w5Var.f30803a;
        ci.t4 t4Var = w5Var.f30806e;
        w5Var.h = i10;
        ((FrameLayout.LayoutParams) w5Var.f30804b.getLayoutParams()).rightMargin = i10;
        ((FrameLayout.LayoutParams) k9Var.getLayoutParams()).rightMargin = i10;
        ((FrameLayout.LayoutParams) t4Var.getLayoutParams()).rightMargin = i10;
        k9Var.r();
        Object obj = photoViewer.d.v().get(photoViewer.d.c().get(i3));
        if (obj instanceof org.telegram.messenger.ye) {
            org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) obj;
            int i11 = yeVar.C;
            String str = yeVar.I;
            w5Var.setTag(yeVar);
            t4Var.setVisibility(4);
            String str2 = yeVar.f25311c;
            if (str2 != null) {
                k9Var.h(str2, null, context.getResources().getDrawable(2131232450));
            } else if (str != null) {
                k9Var.s(yeVar.J, yeVar.K, true);
                if (yeVar.f25310b && !yeVar.d()) {
                    t4Var.setVisibility(0);
                    w5Var.d.setText(org.telegram.messenger.g0.g0(yeVar.E, false, false));
                    k9Var.h("vthumb://" + i11 + ":" + str, null, context.getResources().getDrawable(2131232450));
                } else {
                    k9Var.h("thumb://" + i11 + ":" + str, null, context.getResources().getDrawable(2131232450));
                }
            } else {
                k9Var.setImageResource(2131232450);
            }
            woVar.f40035a.f(-1, true, false);
            woVar.setVisibility(0);
        } else if (obj instanceof org.telegram.messenger.bf) {
            org.telegram.messenger.bf bfVar = (org.telegram.messenger.bf) obj;
            w5Var.setTag(bfVar);
            w5Var.setImage(bfVar);
            t4Var.setVisibility(4);
            woVar.f40035a.f(-1, true, false);
            woVar.setVisibility(0);
        }
    }

    private final void K(u4.d1 d1Var, int i3) {
        boolean z10;
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.f47865e;
        ArrayList arrayList = proxyListActivity.F;
        ArrayList arrayList2 = proxyListActivity.G;
        int i10 = d1Var.f55544f;
        View view = d1Var.f55540a;
        boolean z11 = true;
        switch (i10) {
            case 1:
                org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) view;
                org.telegram.ui.ActionBar.r6.V(v9Var.getTextView(), org.telegram.ui.ActionBar.k6.G6, null);
                if (i3 == ProxyListActivity.f0(proxyListActivity)) {
                    String M0 = org.telegram.messenger.bd.M0(2131754391, null);
                    if (proxyListActivity.E == -1) {
                        z11 = false;
                    }
                    v9Var.b(M0, z11);
                    return;
                } else if (i3 == proxyListActivity.E) {
                    org.telegram.ui.ActionBar.r6.V(v9Var.getTextView(), org.telegram.ui.ActionBar.k6.f28102p7, null);
                    v9Var.b(org.telegram.messenger.bd.M0(2131751581, null), false);
                    return;
                } else {
                    return;
                }
            case 2:
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                if (i3 == proxyListActivity.h) {
                    n4Var.setText(org.telegram.messenger.bd.M0(2131746613, null));
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                if (i3 == ProxyListActivity.g0(proxyListActivity)) {
                    String M02 = org.telegram.messenger.bd.M0(2131743793, null);
                    boolean z12 = proxyListActivity.d;
                    if (proxyListActivity.f41912w == -1) {
                        z11 = false;
                    }
                    q8Var.f(M02, z12, z11);
                    return;
                } else if (i3 == proxyListActivity.f41912w) {
                    q8Var.f(org.telegram.messenger.bd.M0(2131743795, null), org.telegram.messenger.az.f21614a1, true);
                    return;
                } else {
                    return;
                }
            case 4:
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                if (i3 == proxyListActivity.f41914y) {
                    y8Var.setText(org.telegram.messenger.bd.M0(2131746611, null));
                    return;
                }
                return;
            case 5:
                fx0 fx0Var = (fx0) view;
                org.telegram.messenger.zy zyVar = (org.telegram.messenger.zy) arrayList2.get(i3 - proxyListActivity.f41909n);
                fx0Var.setProxy(zyVar);
                if (org.telegram.messenger.az.B1 == zyVar) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                fx0Var.setChecked(z10);
                boolean contains = arrayList.contains(arrayList2.get(i3 - proxyListActivity.f41909n));
                fx0Var.h = contains;
                fx0Var.f45400f.a(contains, false);
                fx0Var.a(!arrayList.isEmpty(), false);
                return;
            case 6:
                if (i3 == proxyListActivity.f41913x) {
                    org.telegram.ui.Components.ut0 ut0Var = (org.telegram.ui.Components.ut0) view;
                    ArrayList arrayList3 = new ArrayList(org.telegram.messenger.ht.d);
                    String[] strArr = new String[arrayList3.size()];
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        strArr[i11] = org.telegram.messenger.bd.a0(null, null, 2131746610, arrayList3.get(i11));
                    }
                    ut0Var.setCallback(new u70(10));
                    ut0Var.b(org.telegram.messenger.az.f21617b1, null, strArr);
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final void L(u4.d1 d1Var, int i3) {
        String M0;
        String M02;
        boolean z10;
        String M03;
        boolean d = org.telegram.ui.Components.p40.d(ny0.d0((ny0) this.f47865e));
        int i10 = d1Var.f55544f;
        if (i10 == 0) {
            org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) d1Var.f55540a;
            if (i3 == 0) {
                M03 = org.telegram.messenger.bd.M0(2131745998, null);
            } else {
                M03 = org.telegram.messenger.bd.M0(2131746002, null);
            }
            n4Var.setText(M03);
        } else if (i10 == 1) {
            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) d1Var.f55540a;
            if (i3 != 1 && !d) {
                z10 = false;
            } else {
                z10 = true;
            }
            q8Var.setEnabled(z10);
            if (i3 == 1) {
                q8Var.f(org.telegram.messenger.bd.M0(2131745994, null), d, false);
                return;
            }
            String M04 = org.telegram.messenger.bd.M0(2131746001, null);
            xi.a aVar = xi.e.f58883i;
            aVar.a();
            q8Var.f(M04, aVar.d, false);
        } else if (i10 == 2) {
            org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) d1Var.f55540a;
            v9Var.setEnabled(d);
            if (i3 == 2) {
                v9Var.c(org.telegram.messenger.bd.M0(2131745996, null), a1.g.o(((wi.r0) xi.e.f58880e.a()).f58000a, "p", new StringBuilder()), false, true);
            } else if (i3 == 3) {
                String M05 = org.telegram.messenger.bd.M0(2131746006, null);
                wi.n0 n0Var = (wi.n0) xi.e.f58881f.a();
                if (n0Var == wi.n0.f57979a) {
                    M02 = org.telegram.messenger.bd.M0(2131746005, null);
                } else if (n0Var == wi.n0.f57980b) {
                    M02 = org.telegram.messenger.bd.M0(2131746003, null);
                } else {
                    M02 = org.telegram.messenger.bd.M0(2131746004, null);
                }
                v9Var.c(M05, M02, false, true);
            } else if (i3 == 4) {
                v9Var.c(org.telegram.messenger.bd.M0(2131745999, null), a1.g.o(((wi.o0) xi.e.f58882g.a()).f57986a, " FPS", new StringBuilder()), false, true);
            } else {
                v9Var.c(org.telegram.messenger.bd.M0(2131746007, null), ny0.f0(xi.e.h.a()), false, false);
            }
        } else {
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) d1Var.f55540a;
            if (i3 == 6) {
                M0 = org.telegram.messenger.bd.M0(2131745997, null);
            } else {
                M0 = org.telegram.messenger.bd.M0(2131746000, null);
            }
            y8Var.setText(M0);
        }
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        switch (this.f47864c) {
            case 0:
                int b10 = d1Var.b();
                if (b10 == 1) {
                    return true;
                }
                if (MediaController.s0(ny0.c0((ny0) this.f47865e)) && b10 == 2) {
                    return true;
                }
                return false;
            case 1:
                int b11 = d1Var.b();
                org.telegram.ui.Components.an anVar = (org.telegram.ui.Components.an) this.f47865e;
                if (b11 != anVar.f31943v0 && b11 != anVar.H0 && b11 != anVar.C0 && b11 != anVar.G0 && b11 != anVar.D0 && b11 != anVar.I0 && b11 != anVar.E0 && b11 != anVar.F0 && b11 != anVar.J0 && b11 != anVar.K0 && b11 != anVar.O0.f4758b && b11 != anVar.N0.f4758b && b11 != anVar.M0) {
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
                if (d1Var.f55544f == 0) {
                    return true;
                }
                return false;
            case 6:
                return true;
            case 7:
                return true;
            case 8:
                int b12 = d1Var.b();
                DataAutoDownloadActivity dataAutoDownloadActivity = (DataAutoDownloadActivity) this.f47865e;
                if (b12 != DataAutoDownloadActivity.n0(dataAutoDownloadActivity) && b12 != DataAutoDownloadActivity.o0(dataAutoDownloadActivity) && b12 != DataAutoDownloadActivity.g0(dataAutoDownloadActivity) && b12 != DataAutoDownloadActivity.p0(dataAutoDownloadActivity)) {
                    return false;
                }
                return true;
            case 9:
                int b13 = d1Var.b();
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.f47865e;
                if (b13 != dataSettingsActivity.f41246e && b13 != dataSettingsActivity.f41247f && b13 != dataSettingsActivity.h && b13 != dataSettingsActivity.f41250s && b13 != DataSettingsActivity.c0(dataSettingsActivity) && b13 != dataSettingsActivity.f41251w && b13 != DataSettingsActivity.d0(dataSettingsActivity) && b13 != DataSettingsActivity.e0(dataSettingsActivity) && b13 != dataSettingsActivity.F && b13 != dataSettingsActivity.E && b13 != dataSettingsActivity.G && b13 != dataSettingsActivity.H && b13 != dataSettingsActivity.L && b13 != dataSettingsActivity.K && b13 != dataSettingsActivity.f41248n && b13 != DataSettingsActivity.h0(dataSettingsActivity) && b13 != DataSettingsActivity.f0(dataSettingsActivity) && b13 != DataSettingsActivity.j0(dataSettingsActivity) && b13 != DataSettingsActivity.b0(dataSettingsActivity)) {
                    return false;
                }
                return true;
            case 10:
                int b14 = d1Var.b();
                zd0 zd0Var = (zd0) this.f47865e;
                if (b14 != zd0Var.f52660c && b14 != zd0Var.d && b14 != zd0Var.f52661e && b14 != zd0Var.f52662f && b14 != zd0Var.h && b14 != zd0Var.f52664r) {
                    return false;
                }
                return true;
            case 11:
                int b15 = d1Var.b();
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.f47865e;
                if (b15 != notificationsSettingsActivity.f41353y && b15 != notificationsSettingsActivity.E && b15 != notificationsSettingsActivity.F && b15 != notificationsSettingsActivity.L && b15 != notificationsSettingsActivity.N && b15 != notificationsSettingsActivity.T && b15 != notificationsSettingsActivity.O && b15 != notificationsSettingsActivity.M && b15 != notificationsSettingsActivity.S && b15 != notificationsSettingsActivity.G && b15 != notificationsSettingsActivity.H && b15 != notificationsSettingsActivity.P && b15 != notificationsSettingsActivity.f41349r && b15 != notificationsSettingsActivity.f41350s && b15 != notificationsSettingsActivity.U && b15 != notificationsSettingsActivity.K) {
                    return true;
                }
                return false;
            case 12:
                int b16 = d1Var.b();
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f47865e;
                if (b16 != PasscodeActivity.c0(passcodeActivity) && b16 != PasscodeActivity.d0(passcodeActivity) && b16 != passcodeActivity.O && b16 != PasscodeActivity.e0(passcodeActivity) && b16 != PasscodeActivity.f0(passcodeActivity) && b16 != passcodeActivity.K && b16 != passcodeActivity.L) {
                    return false;
                }
                return true;
            case 13:
                return true;
            case 14:
                sm0 sm0Var = (sm0) this.f47865e;
                if (sm0Var.K == null && (!TextUtils.isEmpty(sm0Var.f49567w) ? d1Var.b() >= sm0Var.f49547f.size() : d1Var.f55544f != 3)) {
                    return false;
                }
                return true;
            case 15:
                return false;
            case 16:
                int b17 = d1Var.b();
                ProxyListActivity proxyListActivity = (ProxyListActivity) this.f47865e;
                if (b17 != ProxyListActivity.g0(proxyListActivity) && b17 != proxyListActivity.f41912w && b17 != ProxyListActivity.f0(proxyListActivity) && b17 != proxyListActivity.E && (b17 < proxyListActivity.f41909n || b17 >= proxyListActivity.f41910r)) {
                    return false;
                }
                return true;
            case 17:
                int b18 = d1Var.b();
                if (b18 == 1) {
                    return true;
                }
                if (org.telegram.ui.Components.p40.d(ny0.b0((ny0) this.f47865e)) && (b18 == 2 || b18 == 3 || b18 == 4 || b18 == 5 || b18 == 8)) {
                    return true;
                }
                return false;
            case 18:
                if (d1Var.f55544f != 1) {
                    return true;
                }
                return false;
            default:
                if (o1.g.d(3)[d1Var.f55544f] == 1) {
                    return true;
                }
                return false;
        }
    }

    public void E() {
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.f47865e;
        int size = proxyListActivity.F.size();
        boolean s6 = ProxyListActivity.b0(proxyListActivity).s();
        if (size > 0) {
            ProxyListActivity.c0(proxyListActivity).x(size, s6);
            if (!s6) {
                ProxyListActivity.d0(proxyListActivity).B();
                int i3 = proxyListActivity.f41909n;
                n(i3, proxyListActivity.f41910r - i3, 2);
            }
        } else if (s6) {
            ProxyListActivity.e0(proxyListActivity).r();
            int i10 = proxyListActivity.f41909n;
            n(i10, proxyListActivity.f41910r - i10, 2);
        }
    }

    public void F() {
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.f47865e;
        proxyListActivity.F.clear();
        int i3 = proxyListActivity.f41909n;
        n(i3, proxyListActivity.f41910r - i3, 1);
        E();
    }

    public void M(int i3) {
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.f47865e;
        ArrayList arrayList = proxyListActivity.F;
        int i10 = proxyListActivity.f41909n;
        if (i3 >= i10 && i3 < proxyListActivity.f41910r) {
            org.telegram.messenger.zy zyVar = (org.telegram.messenger.zy) proxyListActivity.G.get(i3 - i10);
            if (arrayList.contains(zyVar)) {
                arrayList.remove(zyVar);
            } else {
                arrayList.add(zyVar);
            }
            h(i3, 1);
            E();
        }
    }

    @Override
    public final int b() {
        switch (this.f47864c) {
            case 0:
                return 4;
            case 1:
                return ((org.telegram.ui.Components.an) this.f47865e).R0;
            case 2:
                return ((org.telegram.ui.Components.bz) this.f47865e).h.size();
            case 3:
                int size = ((org.telegram.ui.Components.cz) this.f47865e).f32865s1.size();
                if (size < 10) {
                    return size + 1;
                }
                return size;
            case 4:
                return ((org.telegram.ui.Components.nd0) this.f47865e).G;
            case 5:
                return org.telegram.messenger.ld.g() + 1;
            case 6:
                ArrayList arrayList = ((org.telegram.ui.Components.ow0) this.d).f36974x;
                if (arrayList == null) {
                    return 0;
                }
                return arrayList.size();
            case 7:
                return ((org.telegram.ui.Components.m61) this.f47865e).h.size();
            case 8:
                return ((DataAutoDownloadActivity) this.f47865e).f41242y;
            case 9:
                return ((DataSettingsActivity) this.f47865e).U;
            case 10:
                return ((zd0) this.f47865e).f52666w;
            case 11:
                return ((NotificationsSettingsActivity) this.f47865e).V;
            case 12:
                return ((PasscodeActivity) this.f47865e).Q;
            case 13:
                hm0 hm0Var = (hm0) this.f47865e;
                ArrayList arrayList2 = hm0Var.d;
                if (arrayList2 != null) {
                    return (int) Math.ceil(arrayList2.size() / hm0Var.f45939f);
                }
                return 0;
            case 14:
                sm0 sm0Var = (sm0) this.f47865e;
                org.telegram.messenger.pe peVar = sm0Var.K;
                if (peVar == null) {
                    if (sm0Var.f49547f.isEmpty()) {
                        if (!TextUtils.isEmpty(sm0Var.f49567w) || sm0Var.f49555n.isEmpty()) {
                            return 0;
                        }
                        return sm0Var.f49555n.size() + 2;
                    }
                    return sm0Var.f49547f.size() + (!sm0Var.f49562s ? 1 : 0);
                }
                return peVar.f24738e.size();
            case 15:
                PhotoViewer photoViewer = (PhotoViewer) this.f47865e;
                kq0 kq0Var = photoViewer.d;
                if (kq0Var != null && kq0Var.c() != null) {
                    return photoViewer.d.c().size();
                }
                return 0;
            case 16:
                return ((ProxyListActivity) this.f47865e).f41907e;
            case 17:
                return 7;
            case 18:
                return ((ArrayList) this.f47865e).size();
            default:
                return ((qg.h) this.f47865e).F.size();
        }
    }

    @Override
    public long c(int i3) {
        int i10;
        switch (this.f47864c) {
            case 2:
                i10 = ((org.telegram.ui.Components.bz) this.f47865e).f32458l0.get(i3);
                break;
            case 4:
                return i3;
            case 6:
                ArrayList arrayList = ((org.telegram.ui.Components.ow0) this.d).f36974x;
                if (arrayList == null) {
                    return 0L;
                }
                return ((org.telegram.messenger.hi) arrayList.get(i3)).f22931a.hashCode();
            case 7:
                i10 = ((org.telegram.ui.Components.j61) ((org.telegram.ui.Components.m61) this.f47865e).h.get(i3)).f34971a;
                break;
            case 14:
                return i3;
            case 16:
                ProxyListActivity proxyListActivity = (ProxyListActivity) this.f47865e;
                if (i3 == proxyListActivity.f41908f) {
                    return -1L;
                }
                if (i3 == proxyListActivity.f41911s) {
                    return -2L;
                }
                if (i3 == ProxyListActivity.f0(proxyListActivity)) {
                    return -3L;
                }
                if (i3 == ProxyListActivity.g0(proxyListActivity)) {
                    return -4L;
                }
                if (i3 == proxyListActivity.h) {
                    return -6L;
                }
                if (i3 == proxyListActivity.E) {
                    return -8L;
                }
                if (i3 == proxyListActivity.f41912w) {
                    return -9L;
                }
                if (i3 == proxyListActivity.f41913x) {
                    return -10L;
                }
                if (i3 == proxyListActivity.f41914y) {
                    return -11L;
                }
                int i11 = proxyListActivity.f41909n;
                if (i3 >= i11 && i3 < proxyListActivity.f41910r) {
                    return ((org.telegram.messenger.zy) proxyListActivity.G.get(i3 - i11)).hashCode();
                }
                return -7L;
            default:
                return super.c(i3);
        }
        return i10;
    }

    @Override
    public int d(int i3) {
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
        switch (this.f47864c) {
            case 0:
                if (i3 == 0) {
                    return 0;
                }
                int i27 = 1;
                if (i3 != 1) {
                    i27 = 2;
                    if (i3 != 2) {
                        return 3;
                    }
                }
                return i27;
            case 1:
                org.telegram.ui.Components.an anVar = (org.telegram.ui.Components.an) this.f47865e;
                if (i3 != anVar.C0 && i3 != anVar.G0 && i3 != anVar.H0 && i3 != anVar.D0 && i3 != anVar.E0 && i3 != anVar.F0 && i3 != anVar.I0 && i3 != anVar.N0.f4758b && i3 != anVar.O0.f4758b) {
                    if (i3 != anVar.m0 && i3 != anVar.f31941t0 && i3 != anVar.f31947x0 && i3 != anVar.f31932p0) {
                        if (i3 == anVar.f31940s0) {
                            return 1;
                        }
                        if (i3 != anVar.f31945w0 && i3 != anVar.f31949y0 && i3 != anVar.f31937r0 && i3 != anVar.L0) {
                            if (i3 != anVar.f31943v0 && i3 != anVar.J0 && i3 != anVar.M0) {
                                if (i3 == anVar.f31928n0) {
                                    return 4;
                                }
                                if (i3 == anVar.f31930o0) {
                                    return 11;
                                }
                                if (i3 == anVar.f31934q0) {
                                    return 7;
                                }
                                if (i3 != anVar.f31950z0 && i3 != anVar.A0 && i3 != anVar.K0) {
                                    if (i3 == anVar.B0) {
                                        return 8;
                                    }
                                    if (i3 == 0) {
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
                org.telegram.ui.Components.nd0 nd0Var = (org.telegram.ui.Components.nd0) this.f47865e;
                if (i3 != nd0Var.E && i3 != nd0Var.F) {
                    return 0;
                }
                return 1;
            case 5:
                if (i3 == 0) {
                    return 1;
                }
                return 0;
            case 6:
            default:
                return super.d(i3);
            case 7:
                return 0;
            case 8:
                DataAutoDownloadActivity dataAutoDownloadActivity = (DataAutoDownloadActivity) this.f47865e;
                if (i3 == DataAutoDownloadActivity.c0(dataAutoDownloadActivity)) {
                    return 0;
                }
                if (i3 == dataAutoDownloadActivity.f41239s) {
                    return 1;
                }
                if (i3 != dataAutoDownloadActivity.f41238r && i3 != dataAutoDownloadActivity.f41240w) {
                    if (i3 == DataAutoDownloadActivity.h0(dataAutoDownloadActivity)) {
                        return 3;
                    }
                    if (i3 != DataAutoDownloadActivity.n0(dataAutoDownloadActivity) && i3 != DataAutoDownloadActivity.o0(dataAutoDownloadActivity) && i3 != DataAutoDownloadActivity.g0(dataAutoDownloadActivity) && i3 != DataAutoDownloadActivity.p0(dataAutoDownloadActivity)) {
                        return 5;
                    }
                    return 4;
                }
                return 2;
            case 9:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.f47865e;
                if (i3 != dataSettingsActivity.f41249r && i3 != dataSettingsActivity.f41252x && i3 != dataSettingsActivity.O && i3 != dataSettingsActivity.Q && i3 != dataSettingsActivity.M && i3 != dataSettingsActivity.R && i3 != dataSettingsActivity.T) {
                    if (i3 != dataSettingsActivity.d && i3 != dataSettingsActivity.f41253y && i3 != dataSettingsActivity.N && i3 != 0 && i3 != dataSettingsActivity.P && i3 != dataSettingsActivity.J && i3 != dataSettingsActivity.S) {
                        if (i3 != dataSettingsActivity.F && i3 != dataSettingsActivity.E && i3 != dataSettingsActivity.G && i3 != dataSettingsActivity.H && i3 != dataSettingsActivity.K && i3 != dataSettingsActivity.L) {
                            if (i3 == dataSettingsActivity.I) {
                                return 4;
                            }
                            if (i3 != dataSettingsActivity.f41246e && i3 != dataSettingsActivity.h && i3 != dataSettingsActivity.f41247f && i3 != DataSettingsActivity.h0(dataSettingsActivity) && i3 != DataSettingsActivity.f0(dataSettingsActivity) && i3 != DataSettingsActivity.j0(dataSettingsActivity)) {
                                if (i3 != dataSettingsActivity.f41250s && i3 != dataSettingsActivity.f41251w && i3 != dataSettingsActivity.f41248n) {
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
                zd0 zd0Var = (zd0) this.f47865e;
                zd0Var.getClass();
                if (i3 == 0) {
                    return 0;
                }
                if (i3 != zd0Var.f52660c && i3 != zd0Var.d && i3 != zd0Var.f52661e && i3 != zd0Var.f52662f && i3 != zd0Var.h) {
                    if (i3 == zd0Var.f52663n) {
                        return 2;
                    }
                    if (i3 == zd0Var.f52664r) {
                        return 3;
                    }
                    return 4;
                }
                return 1;
            case 11:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.f47865e;
                if (i3 != notificationsSettingsActivity.L && i3 != notificationsSettingsActivity.N && i3 != notificationsSettingsActivity.T && i3 != notificationsSettingsActivity.H && i3 != notificationsSettingsActivity.O && i3 != notificationsSettingsActivity.F && i3 != notificationsSettingsActivity.f41353y && i3 != notificationsSettingsActivity.f41349r) {
                    i10 = notificationsSettingsActivity.inappSoundRow;
                    if (i3 != i10) {
                        i11 = notificationsSettingsActivity.inappVibrateRow;
                        if (i3 != i11 && i3 != notificationsSettingsActivity.f41352x) {
                            i12 = notificationsSettingsActivity.inappPreviewRow;
                            if (i3 != i12) {
                                i13 = notificationsSettingsActivity.contactJoinedRow;
                                if (i3 != i13) {
                                    i14 = notificationsSettingsActivity.pinnedMessageRow;
                                    if (i3 != i14 && i3 != notificationsSettingsActivity.f41351w) {
                                        i15 = notificationsSettingsActivity.badgeNumberMutedRow;
                                        if (i3 != i15) {
                                            i16 = notificationsSettingsActivity.badgeNumberMessagesRow;
                                            if (i3 != i16) {
                                                i17 = notificationsSettingsActivity.badgeNumberShowRow;
                                                if (i3 != i17) {
                                                    i18 = notificationsSettingsActivity.inappPriorityRow;
                                                    if (i3 != i18) {
                                                        i19 = notificationsSettingsActivity.inchatSoundRow;
                                                        if (i3 != i19 && i3 != notificationsSettingsActivity.Q) {
                                                            i20 = notificationsSettingsActivity.accountsAllRow;
                                                            if (i3 != i20) {
                                                                i21 = notificationsSettingsActivity.resetNotificationsRow;
                                                                if (i3 != i21) {
                                                                    i22 = notificationsSettingsActivity.privateRow;
                                                                    if (i3 != i22) {
                                                                        i23 = notificationsSettingsActivity.groupRow;
                                                                        if (i3 != i23) {
                                                                            i24 = notificationsSettingsActivity.channelsRow;
                                                                            if (i3 != i24) {
                                                                                i25 = notificationsSettingsActivity.storiesRow;
                                                                                if (i3 != i25) {
                                                                                    i26 = notificationsSettingsActivity.reactionsRow;
                                                                                    if (i3 != i26) {
                                                                                        if (i3 != notificationsSettingsActivity.K && i3 != notificationsSettingsActivity.E && i3 != notificationsSettingsActivity.M && i3 != notificationsSettingsActivity.S && i3 != notificationsSettingsActivity.G && i3 != notificationsSettingsActivity.P && i3 != notificationsSettingsActivity.U) {
                                                                                            if (i3 == notificationsSettingsActivity.f41350s) {
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
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f47865e;
                if (i3 != PasscodeActivity.c0(passcodeActivity) && i3 != passcodeActivity.O && i3 != passcodeActivity.L && i3 != passcodeActivity.K) {
                    if (i3 != PasscodeActivity.e0(passcodeActivity) && i3 != PasscodeActivity.d0(passcodeActivity) && i3 != PasscodeActivity.f0(passcodeActivity)) {
                        if (i3 != passcodeActivity.I && i3 != passcodeActivity.P && i3 != passcodeActivity.H && i3 != passcodeActivity.M) {
                            if (i3 != passcodeActivity.N && i3 != passcodeActivity.J) {
                                if (i3 == 0) {
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
                sm0 sm0Var = (sm0) this.f47865e;
                if (sm0Var.Z) {
                    return 2;
                }
                if (sm0Var.K == null) {
                    if (sm0Var.f49547f.isEmpty()) {
                        if (i3 == sm0Var.f49555n.size()) {
                            return 4;
                        }
                        return 3;
                    } else if (i3 >= sm0Var.f49547f.size()) {
                        return 1;
                    }
                }
                return 0;
            case 15:
                return 0;
            case 16:
                ProxyListActivity proxyListActivity = (ProxyListActivity) this.f47865e;
                if (i3 != proxyListActivity.f41908f && i3 != proxyListActivity.f41911s) {
                    if (i3 != ProxyListActivity.f0(proxyListActivity) && i3 != proxyListActivity.E) {
                        if (i3 != ProxyListActivity.g0(proxyListActivity) && i3 != proxyListActivity.f41912w) {
                            if (i3 == proxyListActivity.h) {
                                return 2;
                            }
                            if (i3 == proxyListActivity.f41913x) {
                                return 6;
                            }
                            if (i3 >= proxyListActivity.f41909n && i3 < proxyListActivity.f41910r) {
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
                if (i3 != 0 && i3 != 7) {
                    if (i3 == 1 || i3 == 8) {
                        return 1;
                    }
                    if (i3 != 6 && i3 != 9) {
                        return 2;
                    }
                    return 3;
                }
                return 0;
            case 18:
                if (i3 == ((ArrayList) this.f47865e).size()) {
                    return 1;
                }
                return 0;
            case 19:
                return o1.g.c(((qg.a) ((qg.h) this.f47865e).F.get(i3)).f53909b);
        }
    }

    @Override
    public final void t(u4.d1 r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.n4.t(u4.d1, int):void");
    }

    @Override
    public void v(u4.d1 d1Var, int i3, List list) {
        boolean contains;
        switch (this.f47864c) {
            case 16:
                ProxyListActivity proxyListActivity = (ProxyListActivity) this.f47865e;
                ArrayList arrayList = proxyListActivity.F;
                int i10 = d1Var.f55544f;
                View view = d1Var.f55540a;
                if (i10 == 5 && !list.isEmpty()) {
                    fx0 fx0Var = (fx0) view;
                    if (list.contains(1) && (contains = arrayList.contains(proxyListActivity.G.get(i3 - proxyListActivity.f41909n))) != fx0Var.h) {
                        fx0Var.h = contains;
                        fx0Var.f45400f.a(contains, true);
                    }
                    if (list.contains(2)) {
                        fx0Var.a(!arrayList.isEmpty(), true);
                        return;
                    }
                    return;
                } else if (d1Var.f55544f == 3 && list.contains(0)) {
                    org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                    if (i3 == ProxyListActivity.g0(proxyListActivity)) {
                        q8Var.setChecked(proxyListActivity.d);
                        return;
                    } else if (i3 == proxyListActivity.f41912w) {
                        q8Var.setChecked(org.telegram.messenger.az.f21614a1);
                        return;
                    } else {
                        return;
                    }
                } else {
                    t(d1Var, i3);
                    return;
                }
            default:
                super.v(d1Var, i3, list);
                return;
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View y8Var;
        org.telegram.ui.Components.ym n4Var;
        View view;
        org.telegram.ui.Cells.r5 r5Var;
        FrameLayout frameLayout;
        org.telegram.ui.Components.ut0 ut0Var;
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
        org.telegram.ui.Cells.v9 v9Var;
        View t4Var;
        FrameLayout frameLayout2;
        int i10 = this.f47864c;
        int i11 = 8;
        Object obj = this.f47865e;
        Object obj2 = this.d;
        switch (i10) {
            case 0:
                Context context = (Context) obj2;
                if (i3 == 0) {
                    y8Var = new org.telegram.ui.Cells.n4(context);
                } else if (i3 == 1) {
                    y8Var = new org.telegram.ui.Cells.q8(context);
                } else if (i3 == 2) {
                    org.telegram.ui.Cells.v9 v9Var2 = new org.telegram.ui.Cells.v9(context);
                    v9Var2.setCanDisable(true);
                    y8Var = v9Var2;
                } else {
                    y8Var = new org.telegram.ui.Cells.y8(context);
                }
                y8Var.setLayoutParams(new u4.p0(-1, -2));
                return new u4.d1(y8Var);
            case 1:
                Context context2 = (Context) obj2;
                org.telegram.ui.Components.an anVar = (org.telegram.ui.Components.an) obj;
                boolean z10 = anVar.f31927n;
                org.telegram.ui.ActionBar.e6 e6Var6 = anVar.f38415a;
                switch (i3) {
                    case 0:
                        n4Var = new org.telegram.ui.Cells.n4((Context) obj2, org.telegram.ui.ActionBar.k6.L6, 21, 15, false, anVar.f38415a);
                        break;
                    case 1:
                        View x6Var3 = new org.telegram.ui.Cells.x6(context2, (org.telegram.ui.Cells.f1) null);
                        new org.telegram.ui.Components.xp(new ColorDrawable(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27824a7, e6Var6)), org.telegram.ui.ActionBar.k6.Y0(context2, 2131231229, org.telegram.ui.ActionBar.k6.f27843b7)).f40447x = true;
                        n4Var = x6Var3;
                        break;
                    case 2:
                        n4Var = new org.telegram.ui.Cells.y8(context2, e6Var6);
                        break;
                    case 3:
                        n4Var = new org.telegram.ui.Cells.l8(context2, e6Var6);
                        break;
                    case 4:
                    case 11:
                        org.telegram.ui.Components.vm vmVar = new org.telegram.ui.Components.vm(this, (Context) obj2, anVar.J ? 1 : 0, anVar.f38415a, i3);
                        if (i3 == 11 && !z10) {
                            vmVar.setTextRight(98);
                            vmVar.a().setOnClickListener(new View.OnClickListener(this) {
                                public final org.telegram.ui.n4 f38497b;

                                {
                                    this.f38497b = this;
                                }

                                @Override
                                public final void onClick(View view2) {
                                    switch (r2) {
                                        case 0:
                                            an.S((an) this.f38497b.f47865e, -2);
                                            return;
                                        case 1:
                                            an.S((an) this.f38497b.f47865e, -3);
                                            return;
                                        default:
                                            ((an) this.f38497b.f47865e).c0(view2, (org.telegram.ui.Cells.z5) view2.getParent(), true);
                                            return;
                                    }
                                }
                            });
                        }
                        vmVar.c();
                        vmVar.setIconsColor(org.telegram.ui.ActionBar.k6.f28082o7);
                        vmVar.b(new org.telegram.ui.Components.wm(this, vmVar, i3));
                        n4Var = vmVar;
                        break;
                    case 5:
                    default:
                        org.telegram.ui.Components.ym ymVar = new org.telegram.ui.Components.ym(this, (Context) obj2, anVar.J ? 1 : 0, new View.OnClickListener(this) {
                            public final org.telegram.ui.n4 f38497b;

                            {
                                this.f38497b = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (r2) {
                                    case 0:
                                        an.S((an) this.f38497b.f47865e, -2);
                                        return;
                                    case 1:
                                        an.S((an) this.f38497b.f47865e, -3);
                                        return;
                                    default:
                                        ((an) this.f38497b.f47865e).c0(view2, (org.telegram.ui.Cells.z5) view2.getParent(), true);
                                        return;
                                }
                            }
                        }, anVar.f38415a);
                        if (!z10) {
                            ymVar.setTextRight(140);
                            ymVar.a().setOnClickListener(new org.telegram.ui.Components.q2(7, this, ymVar));
                        }
                        int i12 = org.telegram.ui.ActionBar.k6.f28082o7;
                        ymVar.setIconsColor(i12);
                        org.telegram.ui.Components.wo woVar = ymVar.f31051r;
                        if (woVar != null) {
                            woVar.getCheckBoxBase().i(org.telegram.messenger.g0.L(6.0f));
                            CheckBoxBase checkBoxBase = woVar.getCheckBoxBase();
                            float f10 = ymVar.f31045a.f53840e;
                            if (checkBoxBase.f31339w != f10) {
                                checkBoxBase.f31339w = f10;
                                checkBoxBase.b();
                            }
                        }
                        ymVar.getCheckBox().b(-1, i12, org.telegram.ui.ActionBar.k6.f28008k7);
                        ymVar.b(new ai.a0(11, this, ymVar));
                        ymVar.setShowNextButton(true);
                        EditTextBoldCursor textView = ymVar.getTextView();
                        textView.setImeOptions(textView.getImeOptions() | 5);
                        textView.setOnEditorActionListener(new ld(2, this, ymVar));
                        textView.setOnKeyListener(new org.telegram.ui.Components.um(ymVar, 0));
                        n4Var = ymVar;
                        break;
                    case 6:
                        n4Var = new org.telegram.ui.Cells.q8(context2, e6Var6);
                        break;
                    case 7:
                        org.telegram.ui.Components.xm xmVar = new org.telegram.ui.Components.xm(this, context2, anVar.J ? 1 : 0);
                        xmVar.c();
                        if (!z10) {
                            xmVar.setTextRight(98);
                            xmVar.a().setOnClickListener(new View.OnClickListener(this) {
                                public final org.telegram.ui.n4 f38497b;

                                {
                                    this.f38497b = this;
                                }

                                @Override
                                public final void onClick(View view2) {
                                    switch (r2) {
                                        case 0:
                                            an.S((an) this.f38497b.f47865e, -2);
                                            return;
                                        case 1:
                                            an.S((an) this.f38497b.f47865e, -3);
                                            return;
                                        default:
                                            ((an) this.f38497b.f47865e).c0(view2, (org.telegram.ui.Cells.z5) view2.getParent(), true);
                                            return;
                                    }
                                }
                            });
                        }
                        xmVar.setIconsColor(org.telegram.ui.ActionBar.k6.f28082o7);
                        xmVar.b(new ai.a0(10, this, xmVar));
                        n4Var = xmVar;
                        break;
                    case 8:
                        View smVar = new org.telegram.ui.Components.sm(context2, 0);
                        smVar.setTag(-33024);
                        view = smVar;
                        n4Var = view;
                        break;
                    case 9:
                        View x2Var = new ai.x2(16, context2, this);
                        x2Var.setTag(-33024);
                        view = x2Var;
                        n4Var = view;
                        break;
                    case 10:
                        org.telegram.ui.Cells.x5 x5Var = new org.telegram.ui.Cells.x5(context2, e6Var6);
                        x5Var.getCheckBox().setIcon(2131232513);
                        n4Var = x5Var;
                        break;
                }
                return k2.p1.p(n4Var, n4Var, -1, -2);
            case 2:
                return new u4.d1(new org.telegram.ui.Components.zy((org.telegram.ui.Components.bz) obj, (Context) obj2));
            case 3:
                org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2(0, (Context) obj2, null);
                m2Var.setBackground(null);
                m2Var.setLayoutParams(new u4.p0(-1, -2));
                return new u4.d1(m2Var);
            case 4:
                Context context3 = (Context) obj2;
                if (i3 == 0) {
                    org.telegram.ui.ActionBar.e6 e6Var7 = ((org.telegram.ui.Components.nd0) obj).J0;
                    ?? frameLayout3 = new FrameLayout(context3);
                    frameLayout3.f30340e = new mi.b0((Object) frameLayout3, 19);
                    TextView textView2 = new TextView(context3);
                    frameLayout3.f30337a = textView2;
                    textView2.setGravity(5);
                    textView2.setTextColor(-1);
                    textView2.setTextSize(1, 12.0f);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    frameLayout3.addView(textView2, b8.mf.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
                    TextView textView3 = new TextView(context3);
                    frameLayout3.f30338b = textView3;
                    org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.f28071ng, e6Var7);
                    textView3.setTextSize(1, 12.0f);
                    textView3.setGravity(5);
                    textView3.setSingleLine(true);
                    frameLayout3.addView(textView3, b8.mf.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
                    ?? view2 = new View(context3);
                    Paint paint = new Paint();
                    view2.f32689a = paint;
                    Paint paint2 = new Paint(1);
                    view2.f32690b = paint2;
                    view2.f32691c = org.telegram.messenger.g0.L(16.0f);
                    view2.d = 0;
                    view2.f32692e = 0.0f;
                    view2.f32693f = false;
                    paint.setColor(-11711155);
                    paint2.setColor(-1);
                    frameLayout3.f30339c = view2;
                    frameLayout3.addView(view2, b8.mf.d(-1, 40.0f, 19, 96.0f, 0.0f, 24.0f, 0.0f));
                    frameLayout3.setSeekBarDelegate(new org.telegram.ui.Components.zw(this, 11));
                    r5Var = frameLayout3;
                } else {
                    org.telegram.ui.Cells.r5 r5Var2 = new org.telegram.ui.Cells.r5(context3);
                    r5Var2.setOnClickListener(new org.telegram.ui.Components.ga0(this, 3));
                    r5Var = r5Var2;
                }
                return new u4.d1(r5Var);
            case 5:
                Context context4 = (Context) obj2;
                org.telegram.ui.Components.zs0 zs0Var = (org.telegram.ui.Components.zs0) obj;
                if (i3 != 0) {
                    FrameLayout d2Var = new ai.d2(context4, 21);
                    d2Var.setWillNotDraw(false);
                    zs0Var.m1 = new TextView(context4);
                    org.telegram.ui.ActionBar.r6.V(zs0Var.m1, org.telegram.ui.ActionBar.k6.J5, zs0Var.J0);
                    zs0Var.m1.setTextSize(1, 14.0f);
                    zs0Var.m1.setGravity(17);
                    zs0Var.m1.setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
                    d2Var.addView(zs0Var.m1, b8.mf.c(40.0f, -1));
                    frameLayout = d2Var;
                } else {
                    frameLayout = new org.telegram.ui.Cells.q7(54, context4, zs0Var.J0, false);
                }
                return new u4.d1(frameLayout);
            case 6:
                return new u4.d1(new org.telegram.ui.Components.nw0((org.telegram.ui.Components.ow0) obj, ((org.telegram.ui.Components.ow0) obj2).getContext()));
            case 7:
                return new u4.d1(new org.telegram.ui.Components.k61((org.telegram.ui.Components.m61) obj, (Context) obj2));
            case 8:
                Context context5 = (Context) obj2;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 != 4) {
                                    ut0Var = new org.telegram.ui.Cells.y8(context5);
                                } else {
                                    ut0Var = new org.telegram.ui.Cells.h5(context5);
                                }
                            } else {
                                org.telegram.ui.Components.ut0 ut0Var2 = new org.telegram.ui.Components.ut0(context5, null);
                                ut0Var2.setCallback(new ur(this, 3));
                                ut0Var = ut0Var2;
                            }
                        } else {
                            ut0Var = new org.telegram.ui.Cells.n4(context5);
                        }
                    } else {
                        ut0Var = new org.telegram.ui.Cells.x6(context5, (org.telegram.ui.Cells.f1) null);
                    }
                } else {
                    org.telegram.ui.Cells.q8 q8Var2 = new org.telegram.ui.Cells.q8(context5);
                    q8Var2.d(org.telegram.ui.ActionBar.k6.f27937g6, org.telegram.ui.ActionBar.k6.O6, org.telegram.ui.ActionBar.k6.P6, org.telegram.ui.ActionBar.k6.Q6, org.telegram.ui.ActionBar.k6.R6);
                    q8Var2.setTypeface(org.telegram.messenger.g0.o());
                    q8Var2.setHeight(56);
                    ut0Var = q8Var2;
                }
                return k2.p1.p(ut0Var, ut0Var, -1, -2);
            case 9:
                Context context6 = (Context) obj2;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 != 4) {
                                    if (i3 != 5) {
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
                    x6Var = new org.telegram.ui.Cells.x6(context6, (org.telegram.ui.Cells.f1) null);
                }
                return k2.p1.p(x6Var, x6Var, -1, -2);
            case 10:
                Context context7 = (Context) obj2;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                x8Var = new org.telegram.ui.Cells.y8(context7);
                            } else {
                                View v9Var3 = new org.telegram.ui.Cells.v9(context7);
                                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, v9Var3, null);
                                x8Var = v9Var3;
                            }
                        } else {
                            x8Var = new org.telegram.ui.Cells.x6(context7, (org.telegram.ui.Cells.f1) null);
                        }
                    } else {
                        org.telegram.ui.Cells.x8 x8Var2 = new org.telegram.ui.Cells.x8(context7);
                        x8Var2.setMultilineDetail(true);
                        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, x8Var2, null);
                        x8Var = x8Var2;
                    }
                } else {
                    View n4Var3 = new org.telegram.ui.Cells.n4(context7);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, n4Var3, null);
                    x8Var = n4Var3;
                }
                return k2.p1.p(x8Var, x8Var, -1, -2);
            case 11:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                Context context8 = (Context) obj2;
                if (i3 == 0) {
                    e6Var = ((org.telegram.ui.ActionBar.d2) notificationsSettingsActivity).resourceProvider;
                    n4Var2 = new org.telegram.ui.Cells.n4(context8, e6Var);
                } else if (i3 == 1) {
                    e6Var2 = ((org.telegram.ui.ActionBar.d2) notificationsSettingsActivity).resourceProvider;
                    n4Var2 = new org.telegram.ui.Cells.q8(context8, e6Var2);
                } else if (i3 != 2) {
                    if (i3 == 3) {
                        e6Var3 = ((org.telegram.ui.ActionBar.d2) notificationsSettingsActivity).resourceProvider;
                        n4Var2 = new org.telegram.ui.Cells.h5((Context) obj2, 21, 64, true, e6Var3);
                    } else if (i3 != 4) {
                        if (i3 != 5) {
                            e6Var5 = ((org.telegram.ui.ActionBar.d2) notificationsSettingsActivity).resourceProvider;
                            n4Var2 = new org.telegram.ui.Cells.y8(context8, e6Var5);
                        } else {
                            e6Var4 = ((org.telegram.ui.ActionBar.d2) notificationsSettingsActivity).resourceProvider;
                            n4Var2 = new org.telegram.ui.Cells.v9(0, context8, e6Var4);
                        }
                    } else {
                        n4Var2 = new org.telegram.ui.Cells.x6(context8, (org.telegram.ui.Cells.f1) null);
                    }
                } else {
                    n4Var2 = new org.telegram.ui.Cells.x8(context8);
                }
                return new u4.d1(n4Var2);
            case 12:
                Context context9 = (Context) obj2;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                q8Var = new org.telegram.ui.Cells.y8(context9);
                            } else {
                                q8Var = new hi0(context9);
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
                return new u4.d1(q8Var);
            case 13:
                Context context10 = (Context) obj2;
                ?? frameLayout4 = new FrameLayout(context10);
                frameLayout4.f30735e = new Paint();
                frameLayout4.f30733b = new org.telegram.messenger.pe[4];
                frameLayout4.f30732a = new org.telegram.ui.Cells.t5[4];
                for (int i13 = 0; i13 < 4; i13++) {
                    frameLayout4.f30732a[i13] = new org.telegram.ui.Cells.t5((org.telegram.ui.Cells.v5) frameLayout4, context10);
                    frameLayout4.addView(frameLayout4.f30732a[i13]);
                    frameLayout4.f30732a[i13].setVisibility(4);
                    frameLayout4.f30732a[i13].setTag(Integer.valueOf(i13));
                    frameLayout4.f30732a[i13].setOnClickListener(new org.telegram.ui.Cells.a(frameLayout4, 9));
                }
                frameLayout4.setDelegate(new ci0(this, 2));
                return new u4.d1(frameLayout4);
            case 14:
                sm0 sm0Var = (sm0) obj;
                boolean z11 = sm0Var.f49563s0;
                Context context11 = (Context) obj2;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                org.telegram.ui.Cells.e3 e3Var = new org.telegram.ui.Cells.e3(context11, null);
                                e3Var.setForceDarkTheme(z11);
                                l8Var = e3Var;
                            } else {
                                org.telegram.ui.Cells.l8 l8Var2 = new org.telegram.ui.Cells.l8(23, context11, true);
                                l8Var2.setLayoutParams(new u4.p0(-1, -2));
                                l8Var = l8Var2;
                                if (z11) {
                                    org.telegram.ui.ActionBar.r6.Y(l8Var2.f29592a, sm0Var.f49568w0, null);
                                    org.telegram.ui.ActionBar.r6.t(l8Var2.f29595e, org.telegram.ui.ActionBar.k6.f27928fh, null, PorterDuff.Mode.MULTIPLY);
                                    l8Var = l8Var2;
                                }
                            }
                        } else {
                            l8Var = new org.telegram.ui.Cells.g7(1, context11, null);
                        }
                    } else {
                        ViewGroup frameLayout5 = new FrameLayout(context11);
                        frameLayout5.setLayoutParams(new u4.p0(-1, -2));
                        RadialProgressView radialProgressView = new RadialProgressView(context11, null);
                        radialProgressView.setProgressColor(-11371101);
                        frameLayout5.addView(radialProgressView, b8.mf.c(-1.0f, -1));
                        l8Var = frameLayout5;
                    }
                } else {
                    org.telegram.ui.Cells.q5 q5Var = new org.telegram.ui.Cells.q5(context11, null);
                    q5Var.setDelegate(new qm0(this));
                    FrameLayout checkFrame = q5Var.getCheckFrame();
                    if (sm0Var.U == 0) {
                        i11 = 0;
                    }
                    checkFrame.setVisibility(i11);
                    l8Var = q5Var;
                }
                return new u4.d1(l8Var);
            case 15:
                Context context12 = (Context) obj2;
                ?? frameLayout6 = new FrameLayout(context12);
                new Paint();
                frameLayout6.setWillNotDraw(false);
                org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context12);
                frameLayout6.f30803a = k9Var;
                k9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
                frameLayout6.addView(k9Var, b8.mf.c(-1.0f, -1));
                FrameLayout frameLayout7 = new FrameLayout(context12);
                frameLayout6.f30804b = frameLayout7;
                frameLayout6.addView(frameLayout7, b8.mf.e(42, 42, 53));
                ci.t4 t4Var2 = new ci.t4(context12);
                t4Var2.d = new Path();
                t4Var2.f6025e = new float[8];
                t4Var2.f6023b = new RectF();
                t4Var2.f6024c = new Paint(1);
                frameLayout6.f30806e = t4Var2;
                t4Var2.setWillNotDraw(false);
                t4Var2.setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), 0);
                frameLayout6.addView(t4Var2, b8.mf.e(-1, 16, 83));
                t4Var2.addView(org.telegram.messenger.camera.q.e(context12, 2131231463), b8.mf.e(-2, -2, 19));
                TextView textView4 = new TextView(context12);
                frameLayout6.d = textView4;
                textView4.setTextColor(-1);
                textView4.setTextSize(1, 12.0f);
                textView4.setImportantForAccessibility(2);
                t4Var2.addView(textView4, b8.mf.d(-2, -2.0f, 19, 18.0f, -0.7f, 0.0f, 0.0f));
                org.telegram.ui.Components.wo woVar2 = new org.telegram.ui.Components.wo(24, context12, null);
                frameLayout6.f30805c = woVar2;
                woVar2.setDrawBackgroundAsArc(11);
                woVar2.b(org.telegram.ui.ActionBar.k6.W9, org.telegram.ui.ActionBar.k6.X9, org.telegram.ui.ActionBar.k6.V9);
                frameLayout6.addView(woVar2, b8.mf.d(26, 26.0f, 51, 55.0f, 4.0f, 0.0f, 0.0f));
                woVar2.setVisibility(0);
                frameLayout6.setFocusable(true);
                frameLayout7.setOnClickListener(new b40(this, 21));
                return new u4.d1(frameLayout6);
            case 16:
                Context context13 = (Context) obj2;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 != 4) {
                                    if (i3 != 6) {
                                        x6Var2 = new fx0((ProxyListActivity) obj, context13);
                                        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, x6Var2, null);
                                    } else {
                                        x6Var2 = new org.telegram.ui.Components.ut0(context13, null);
                                        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, x6Var2, null);
                                    }
                                } else {
                                    x6Var2 = new org.telegram.ui.Cells.y8(context13);
                                }
                            } else {
                                x6Var2 = new org.telegram.ui.Cells.q8(context13);
                                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, x6Var2, null);
                            }
                        } else {
                            x6Var2 = new org.telegram.ui.Cells.n4(context13);
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, x6Var2, null);
                        }
                    } else {
                        x6Var2 = new org.telegram.ui.Cells.v9(context13);
                        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, x6Var2, null);
                    }
                } else {
                    x6Var2 = new org.telegram.ui.Cells.x6(context13, (org.telegram.ui.Cells.f1) null);
                }
                return k2.p1.p(x6Var2, x6Var2, -1, -2);
            case 17:
                Context context14 = (Context) obj2;
                if (i3 == 0) {
                    v9Var = new org.telegram.ui.Cells.n4(context14);
                } else if (i3 == 1) {
                    v9Var = new org.telegram.ui.Cells.q8(context14);
                } else if (i3 == 2) {
                    org.telegram.ui.Cells.v9 v9Var4 = new org.telegram.ui.Cells.v9(context14);
                    v9Var4.setCanDisable(true);
                    v9Var = v9Var4;
                } else {
                    v9Var = new org.telegram.ui.Cells.y8(context14);
                }
                v9Var.setLayoutParams(new u4.p0(-1, -2));
                return new u4.d1(v9Var);
            case 18:
                Context context15 = (Context) obj2;
                if (i3 == 0) {
                    t4Var = new org.telegram.ui.Cells.t2(context15, false);
                } else {
                    t4Var = new org.telegram.ui.Cells.t4(context15);
                }
                t4Var.setLayoutParams(new u4.p0(-1, -2));
                return new u4.d1(t4Var);
            default:
                Context context16 = (Context) obj2;
                int c2 = o1.g.c(o1.g.d(3)[i3]);
                if (c2 != 1) {
                    if (c2 != 2) {
                        frameLayout2 = new org.telegram.ui.ActionBar.m1(context16, null);
                    } else {
                        ?? frameLayout8 = new FrameLayout(context16);
                        frameLayout8.setWillNotDraw(false);
                        TextPaint textPaint = new TextPaint(1);
                        frameLayout8.h = textPaint;
                        textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
                        org.telegram.ui.Components.pm0 pm0Var = new org.telegram.ui.Components.pm0(context16);
                        frameLayout8.f53924a = pm0Var;
                        pm0Var.setReportChanges(true);
                        pm0Var.setDelegate(new org.telegram.ui.Components.i9((Object) frameLayout8, 14));
                        pm0Var.setImportantForAccessibility(2);
                        frameLayout8.addView(pm0Var, b8.mf.d(-1, 38.0f, 83, 5.0f, 29.0f, 47.0f, 0.0f));
                        frameLayout2 = frameLayout8;
                    }
                } else {
                    frameLayout2 = new org.telegram.ui.Cells.n4(context16);
                }
                frameLayout2.setLayoutParams(new u4.p0(-1, -2));
                return new u4.d1(frameLayout2);
        }
    }

    @Override
    public void y(u4.d1 d1Var) {
        int i3;
        int i10;
        int i11 = this.f47864c;
        Object obj = this.f47865e;
        switch (i11) {
            case 1:
                org.telegram.ui.Components.an anVar = (org.telegram.ui.Components.an) obj;
                th.d dVar = anVar.f31929n1;
                boolean z10 = anVar.f31927n;
                int i12 = d1Var.f55544f;
                View view = d1Var.f55540a;
                CharSequence charSequence = "";
                if (i12 == 4) {
                    org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) view;
                    z5Var.setTag(1);
                    CharSequence charSequence2 = anVar.O;
                    if (charSequence2 != null) {
                        charSequence = charSequence2;
                    }
                    if (z10) {
                        i10 = 2131744063;
                    } else {
                        i10 = 2131746456;
                    }
                    z5Var.n(charSequence, org.telegram.messenger.bd.M0(i10, null), true);
                    z5Var.setTag(null);
                    org.telegram.ui.Components.an.P(anVar, view, d1Var.b());
                    return;
                } else if (i12 == 11) {
                    org.telegram.ui.Cells.z5 z5Var2 = (org.telegram.ui.Cells.z5) view;
                    z5Var2.setTag(1);
                    CharSequence charSequence3 = anVar.P;
                    if (charSequence3 != null) {
                        charSequence = charSequence3;
                    }
                    z5Var2.n(charSequence, org.telegram.messenger.bd.M0(2131746457, null), false);
                    z5Var2.setTag(null);
                    z5Var2.f31048e.b(dVar.b(-2), false);
                    org.telegram.ui.Components.an.P(anVar, view, d1Var.b());
                    return;
                } else if (i12 == 5) {
                    int b10 = d1Var.b();
                    org.telegram.ui.Cells.z5 z5Var3 = (org.telegram.ui.Cells.z5) view;
                    z5Var3.setTag(1);
                    z5Var3.f31045a.a(anVar.f31908c0, false);
                    int i13 = b10 - anVar.f31942u0;
                    CharSequence charSequence4 = anVar.L[i13];
                    if (z10) {
                        i3 = 2131744065;
                    } else {
                        i3 = 2131747782;
                    }
                    z5Var3.n(charSequence4, org.telegram.messenger.bd.M0(i3, null), true);
                    z5Var3.setTag(null);
                    if (anVar.f31925l0 == b10) {
                        EditTextBoldCursor textView = z5Var3.getTextView();
                        textView.requestFocus();
                        org.telegram.messenger.g0.K3(textView);
                        anVar.f31925l0 = -1;
                    }
                    if (!z10) {
                        z5Var3.f31048e.b(dVar.b(i13), false);
                    }
                    org.telegram.ui.Components.an.P(anVar, view, b10);
                    return;
                } else if (i12 == 7) {
                    org.telegram.ui.Cells.z5 z5Var4 = (org.telegram.ui.Cells.z5) view;
                    z5Var4.setTag(1);
                    CharSequence charSequence5 = anVar.Q;
                    if (charSequence5 != null) {
                        charSequence = charSequence5;
                    }
                    z5Var4.n(charSequence, org.telegram.messenger.bd.M0(2131754474, null), false);
                    z5Var4.setTag(null);
                    if (!z10) {
                        z5Var4.f31048e.b(dVar.b(-3), false);
                    }
                    org.telegram.ui.Components.an.P(anVar, view, d1Var.b());
                    return;
                } else {
                    return;
                }
            case 9:
                if (d1Var.f55544f == 3) {
                    org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) d1Var.f55540a;
                    int b11 = d1Var.b();
                    DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) obj;
                    if (b11 == dataSettingsActivity.F) {
                        q8Var.setChecked(org.telegram.messenger.az.E0);
                        return;
                    } else if (b11 == dataSettingsActivity.E) {
                        q8Var.setChecked(org.telegram.messenger.az.B0);
                        return;
                    } else if (b11 == dataSettingsActivity.G) {
                        q8Var.setChecked(org.telegram.messenger.az.C0);
                        return;
                    } else if (b11 == dataSettingsActivity.H) {
                        q8Var.setChecked(org.telegram.messenger.az.D0);
                        return;
                    } else if (b11 == dataSettingsActivity.K) {
                        int i14 = org.telegram.messenger.az.f21612a;
                        q8Var.setChecked(org.telegram.messenger.lc.e(2048));
                        return;
                    } else if (b11 == dataSettingsActivity.L) {
                        int i15 = org.telegram.messenger.az.f21612a;
                        q8Var.setChecked(org.telegram.messenger.lc.e(1024));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 16:
                ProxyListActivity proxyListActivity = (ProxyListActivity) obj;
                if (d1Var.f55544f == 3) {
                    org.telegram.ui.Cells.q8 q8Var2 = (org.telegram.ui.Cells.q8) d1Var.f55540a;
                    int b12 = d1Var.b();
                    if (b12 == ProxyListActivity.g0(proxyListActivity)) {
                        q8Var2.setChecked(proxyListActivity.d);
                        return;
                    } else if (b12 == proxyListActivity.f41912w) {
                        q8Var2.setChecked(org.telegram.messenger.az.f21614a1);
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
    public void z(u4.d1 d1Var) {
        switch (this.f47864c) {
            case 1:
                org.telegram.ui.Components.an anVar = (org.telegram.ui.Components.an) this.f47865e;
                int i3 = d1Var.f55544f;
                if (i3 == 4 || i3 == 11 || i3 == 5) {
                    EditTextBoldCursor textView = ((org.telegram.ui.Cells.z5) d1Var.f55540a).getTextView();
                    if (textView.isFocused()) {
                        if (anVar.J) {
                            org.telegram.ui.Components.rm rmVar = anVar.f31948y;
                            if (rmVar != null) {
                                rmVar.f();
                            }
                            anVar.e0(true);
                        }
                        anVar.f31919h1 = null;
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

    public n4(qg.h hVar, LaunchActivity launchActivity) {
        this.f47864c = 19;
        this.f47865e = hVar;
        this.d = launchActivity;
    }

    public n4(Context context) {
        this.f47864c = 18;
        this.d = context;
        ArrayList arrayList = new ArrayList();
        this.f47865e = arrayList;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        org.telegram.ui.Cells.o2 o2Var = new org.telegram.ui.Cells.o2();
        o2Var.f29727a = org.telegram.messenger.bd.M0(2131744181, null);
        o2Var.f29728b = org.telegram.messenger.bd.M0(2131744173, null);
        o2Var.f29729c = 0;
        o2Var.d = 0;
        o2Var.f29730e = true;
        o2Var.f29731f = false;
        o2Var.f29732g = 0;
        o2Var.h = currentTimeMillis;
        o2Var.f29733i = false;
        o2Var.f29734j = false;
        o2Var.f29735k = 2;
        arrayList.add(o2Var);
        org.telegram.ui.Cells.o2 o2Var2 = new org.telegram.ui.Cells.o2();
        o2Var2.f29727a = org.telegram.messenger.bd.M0(2131744180, null);
        o2Var2.f29728b = org.telegram.messenger.bd.M0(2131744172, null);
        o2Var2.f29729c = 1;
        o2Var2.d = 2;
        o2Var2.f29730e = false;
        o2Var2.f29731f = false;
        o2Var2.f29732g = 0;
        o2Var2.h = currentTimeMillis - 3600;
        o2Var2.f29733i = false;
        o2Var2.f29734j = false;
        o2Var2.f29735k = -1;
        arrayList.add(o2Var2);
        org.telegram.ui.Cells.o2 o2Var3 = new org.telegram.ui.Cells.o2();
        o2Var3.f29727a = org.telegram.messenger.bd.M0(2131744179, null);
        o2Var3.f29728b = org.telegram.messenger.bd.M0(2131744171, null);
        o2Var3.f29729c = 2;
        o2Var3.d = 3;
        o2Var3.f29730e = false;
        o2Var3.f29731f = true;
        o2Var3.f29732g = 0;
        o2Var3.h = currentTimeMillis - 7200;
        o2Var3.f29733i = false;
        o2Var3.f29734j = true;
        o2Var3.f29735k = -1;
        arrayList.add(o2Var3);
        org.telegram.ui.Cells.o2 o2Var4 = new org.telegram.ui.Cells.o2();
        o2Var4.f29727a = org.telegram.messenger.bd.M0(2131744178, null);
        o2Var4.f29728b = org.telegram.messenger.bd.M0(2131744170, null);
        o2Var4.f29729c = 3;
        o2Var4.d = 0;
        o2Var4.f29730e = false;
        o2Var4.f29731f = false;
        o2Var4.f29732g = 2;
        o2Var4.h = currentTimeMillis - 10800;
        o2Var4.f29733i = false;
        o2Var4.f29734j = false;
        o2Var4.f29735k = -1;
        arrayList.add(o2Var4);
        org.telegram.ui.Cells.o2 o2Var5 = new org.telegram.ui.Cells.o2();
        o2Var5.f29727a = org.telegram.messenger.bd.M0(2131744177, null);
        o2Var5.f29728b = org.telegram.messenger.bd.M0(2131744169, null);
        o2Var5.f29729c = 4;
        o2Var5.d = 0;
        o2Var5.f29730e = false;
        o2Var5.f29731f = false;
        o2Var5.f29732g = 1;
        o2Var5.h = currentTimeMillis - 14400;
        o2Var5.f29733i = false;
        o2Var5.f29734j = false;
        o2Var5.f29735k = 2;
        arrayList.add(o2Var5);
        org.telegram.ui.Cells.o2 o2Var6 = new org.telegram.ui.Cells.o2();
        o2Var6.f29727a = org.telegram.messenger.bd.M0(2131744176, null);
        o2Var6.f29728b = org.telegram.messenger.bd.M0(2131744168, null);
        o2Var6.f29729c = 5;
        o2Var6.d = 0;
        o2Var6.f29730e = false;
        o2Var6.f29731f = false;
        o2Var6.f29732g = 0;
        o2Var6.h = currentTimeMillis - 18000;
        o2Var6.f29733i = false;
        o2Var6.f29734j = false;
        o2Var6.f29735k = -1;
        arrayList.add(o2Var6);
        org.telegram.ui.Cells.o2 o2Var7 = new org.telegram.ui.Cells.o2();
        o2Var7.f29727a = org.telegram.messenger.bd.M0(2131744175, null);
        o2Var7.f29728b = org.telegram.messenger.bd.M0(2131744167, null);
        o2Var7.f29729c = 6;
        o2Var7.d = 0;
        o2Var7.f29730e = false;
        o2Var7.f29731f = false;
        o2Var7.f29732g = 0;
        o2Var7.h = currentTimeMillis - 21600;
        o2Var7.f29733i = true;
        o2Var7.f29734j = false;
        o2Var7.f29735k = -1;
        arrayList.add(o2Var7);
        org.telegram.ui.Cells.o2 o2Var8 = new org.telegram.ui.Cells.o2();
        o2Var8.f29727a = org.telegram.messenger.bd.M0(2131744174, null);
        o2Var8.f29728b = org.telegram.messenger.bd.M0(2131744166, null);
        o2Var8.f29729c = 0;
        o2Var8.d = 0;
        o2Var8.f29730e = false;
        o2Var8.f29731f = false;
        o2Var8.f29732g = 0;
        o2Var8.h = currentTimeMillis - 25200;
        o2Var8.f29733i = true;
        o2Var8.f29734j = false;
        o2Var8.f29735k = -1;
        arrayList.add(o2Var8);
    }

    public n4(ProxyListActivity proxyListActivity, Context context) {
        this.f47864c = 16;
        this.f47865e = proxyListActivity;
        this.d = context;
        C(true);
    }
}
