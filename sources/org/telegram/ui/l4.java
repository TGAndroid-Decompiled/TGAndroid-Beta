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
public final class l4 extends org.telegram.ui.Components.pj0 {
    public final int f47457c;
    public final Object d;
    public final Object f47458e;

    public l4(int i7, Object obj, Object obj2) {
        this.f47457c = i7;
        this.f47458e = obj;
        this.d = obj2;
    }

    private final void G(v4.d1 r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l4.G(v4.d1, int):void");
    }

    private final void H(v4.d1 r23, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l4.H(v4.d1, int):void");
    }

    private final void I(v4.d1 d1Var, int i7) {
        boolean K1;
        boolean z9;
        zm0 zm0Var = (zm0) this.f47458e;
        org.telegram.messenger.we weVar = zm0Var.J;
        ArrayList arrayList = zm0Var.f52615n;
        ArrayList arrayList2 = zm0Var.f52602c;
        HashMap hashMap = zm0Var.f52600b;
        int i10 = d1Var.f57060f;
        View view = d1Var.f57056a;
        int i11 = -1;
        int i12 = 0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                        if (i7 < arrayList.size()) {
                            m8Var.o(2131232327, (CharSequence) arrayList.get(i7), false);
                            return;
                        } else {
                            m8Var.o(2131232094, org.telegram.messenger.id.M0(2131752067, null), false);
                            return;
                        }
                    }
                    return;
                }
                org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) weVar.f26300e.get(i7);
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                h7Var.setPhotoEntry(gfVar);
                h7Var.b(hashMap.containsKey(Integer.valueOf(gfVar.C)), false);
                h7Var.setTag(Integer.valueOf(i7));
                return;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -1;
                layoutParams.height = zm0Var.R;
                view.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
        q5Var.setItemSize(zm0Var.R);
        org.telegram.ui.Components.l9 imageView = q5Var.getImageView();
        q5Var.setTag(Integer.valueOf(i7));
        imageView.r();
        if (weVar != null) {
            org.telegram.messenger.gf gfVar2 = (org.telegram.messenger.gf) weVar.f26300e.get(i7);
            if (arrayList2.size() > 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            q5Var.d(gfVar2, z9, true, false, false);
            int i13 = gfVar2.C;
            if (zm0Var.f52605e) {
                i11 = arrayList2.indexOf(Integer.valueOf(i13));
            }
            q5Var.b(i11, hashMap.containsKey(Integer.valueOf(i13)), false);
            K1 = PhotoViewer.K1(gfVar2.I);
        } else {
            org.telegram.messenger.kf kfVar = (org.telegram.messenger.kf) zm0Var.f52607f.get(i7);
            q5Var.e(kfVar);
            q5Var.getVideoInfoContainer().setVisibility(4);
            if (zm0Var.f52605e) {
                i11 = arrayList2.indexOf(kfVar.B);
            }
            q5Var.b(i11, hashMap.containsKey(kfVar.B), false);
            K1 = PhotoViewer.K1(kfVar.g());
        }
        imageView.getImageReceiver().O0(!K1, true);
        q5Var.getCheckBox().setVisibility((zm0Var.T != 0 || K1) ? 8 : 8);
    }

    private final void J(v4.d1 d1Var, int i7) {
        int i10;
        PhotoViewer photoViewer = (PhotoViewer) this.f47458e;
        Context context = (Context) this.d;
        org.telegram.ui.Cells.w5 w5Var = (org.telegram.ui.Cells.w5) d1Var.f57056a;
        int L = org.telegram.messenger.g0.L(85.0f);
        if (i7 != 0) {
            i10 = org.telegram.messenger.g0.L(6.0f);
        } else {
            i10 = 0;
        }
        w5Var.f30736f = L;
        org.telegram.ui.Components.wo woVar = w5Var.f30734c;
        org.telegram.ui.Components.l9 l9Var = w5Var.f30732a;
        bi.m5 m5Var = w5Var.f30735e;
        w5Var.h = i10;
        ((FrameLayout.LayoutParams) w5Var.f30733b.getLayoutParams()).rightMargin = i10;
        ((FrameLayout.LayoutParams) l9Var.getLayoutParams()).rightMargin = i10;
        ((FrameLayout.LayoutParams) m5Var.getLayoutParams()).rightMargin = i10;
        l9Var.r();
        Object obj = photoViewer.d.v().get(photoViewer.d.c().get(i7));
        if (obj instanceof org.telegram.messenger.gf) {
            org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) obj;
            int i11 = gfVar.C;
            String str = gfVar.I;
            w5Var.setTag(gfVar);
            m5Var.setVisibility(4);
            String str2 = gfVar.f26846c;
            if (str2 != null) {
                l9Var.h(str2, null, context.getResources().getDrawable(2131232450));
            } else if (str != null) {
                l9Var.s(gfVar.J, gfVar.K, true);
                if (gfVar.f26845b && !gfVar.d()) {
                    m5Var.setVisibility(0);
                    w5Var.d.setText(org.telegram.messenger.g0.g0(gfVar.E, false, false));
                    l9Var.h("vthumb://" + i11 + ":" + str, null, context.getResources().getDrawable(2131232450));
                } else {
                    l9Var.h("thumb://" + i11 + ":" + str, null, context.getResources().getDrawable(2131232450));
                }
            } else {
                l9Var.setImageResource(2131232450);
            }
            woVar.f40108a.f(-1, true, false);
            woVar.setVisibility(0);
        } else if (obj instanceof org.telegram.messenger.kf) {
            org.telegram.messenger.kf kfVar = (org.telegram.messenger.kf) obj;
            w5Var.setTag(kfVar);
            w5Var.setImage(kfVar);
            m5Var.setVisibility(4);
            woVar.f40108a.f(-1, true, false);
            woVar.setVisibility(0);
        }
    }

    private final void K(v4.d1 d1Var, int i7) {
        boolean z9;
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.f47458e;
        ArrayList arrayList = proxyListActivity.E;
        ArrayList arrayList2 = proxyListActivity.F;
        int i10 = d1Var.f57060f;
        View view = d1Var.f57056a;
        boolean z10 = true;
        switch (i10) {
            case 1:
                org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) view;
                org.telegram.ui.ActionBar.s6.U(w9Var.getTextView(), org.telegram.ui.ActionBar.l6.G6, null);
                if (i7 == ProxyListActivity.f0(proxyListActivity)) {
                    String M0 = org.telegram.messenger.id.M0(2131754391, null);
                    if (proxyListActivity.D == -1) {
                        z10 = false;
                    }
                    w9Var.b(M0, z10);
                    return;
                } else if (i7 == proxyListActivity.D) {
                    org.telegram.ui.ActionBar.s6.U(w9Var.getTextView(), org.telegram.ui.ActionBar.l6.f28086p7, null);
                    w9Var.b(org.telegram.messenger.id.M0(2131751580, null), false);
                    return;
                } else {
                    return;
                }
            case 2:
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                if (i7 == proxyListActivity.h) {
                    n4Var.setText(org.telegram.messenger.id.M0(2131746605, null));
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                if (i7 == ProxyListActivity.g0(proxyListActivity)) {
                    String M02 = org.telegram.messenger.id.M0(2131743783, null);
                    boolean z11 = proxyListActivity.d;
                    if (proxyListActivity.f41891w == -1) {
                        z10 = false;
                    }
                    r8Var.f(M02, z11, z10);
                    return;
                } else if (i7 == proxyListActivity.f41891w) {
                    r8Var.f(org.telegram.messenger.id.M0(2131743785, null), org.telegram.messenger.iz.f23387a1, true);
                    return;
                } else {
                    return;
                }
            case 4:
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                if (i7 == proxyListActivity.f41893y) {
                    z8Var.setText(org.telegram.messenger.id.M0(2131746603, null));
                    return;
                }
                return;
            case 5:
                rx0 rx0Var = (rx0) view;
                org.telegram.messenger.hz hzVar = (org.telegram.messenger.hz) arrayList2.get(i7 - proxyListActivity.f41888n);
                rx0Var.setProxy(hzVar);
                if (org.telegram.messenger.iz.B1 == hzVar) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                rx0Var.setChecked(z9);
                boolean contains = arrayList.contains(arrayList2.get(i7 - proxyListActivity.f41888n));
                rx0Var.h = contains;
                rx0Var.f49626f.a(contains, false);
                rx0Var.a(!arrayList.isEmpty(), false);
                return;
            case 6:
                if (i7 == proxyListActivity.f41892x) {
                    org.telegram.ui.Components.xt0 xt0Var = (org.telegram.ui.Components.xt0) view;
                    ArrayList arrayList3 = new ArrayList(org.telegram.messenger.qt.d);
                    String[] strArr = new String[arrayList3.size()];
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        strArr[i11] = org.telegram.messenger.id.a0(null, null, 2131746602, arrayList3.get(i11));
                    }
                    xt0Var.setCallback(new io0(5));
                    xt0Var.b(org.telegram.messenger.iz.f23390b1, null, strArr);
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final void L(v4.d1 d1Var, int i7) {
        String M0;
        String M02;
        boolean z9;
        String M03;
        boolean e10 = org.telegram.ui.Components.u40.e(az0.d0((az0) this.f47458e));
        int i10 = d1Var.f57060f;
        if (i10 == 0) {
            org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) d1Var.f57056a;
            if (i7 == 0) {
                M03 = org.telegram.messenger.id.M0(2131745988, null);
            } else {
                M03 = org.telegram.messenger.id.M0(2131745992, null);
            }
            n4Var.setText(M03);
        } else if (i10 == 1) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) d1Var.f57056a;
            if (i7 != 1 && !e10) {
                z9 = false;
            } else {
                z9 = true;
            }
            r8Var.setEnabled(z9);
            if (i7 == 1) {
                r8Var.f(org.telegram.messenger.id.M0(2131745984, null), e10, false);
                return;
            }
            String M04 = org.telegram.messenger.id.M0(2131745991, null);
            xi.a aVar = xi.e.f58872i;
            aVar.a();
            r8Var.f(M04, aVar.d, false);
        } else if (i10 == 2) {
            org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) d1Var.f57056a;
            w9Var.setEnabled(e10);
            if (i7 == 2) {
                w9Var.c(org.telegram.messenger.id.M0(2131745986, null), a8.p0.n(((wi.r0) xi.e.f58869e.a()).f58147a, "p", new StringBuilder()), false, true);
            } else if (i7 == 3) {
                String M05 = org.telegram.messenger.id.M0(2131745996, null);
                wi.n0 n0Var = (wi.n0) xi.e.f58870f.a();
                if (n0Var == wi.n0.f58123a) {
                    M02 = org.telegram.messenger.id.M0(2131745995, null);
                } else if (n0Var == wi.n0.f58124b) {
                    M02 = org.telegram.messenger.id.M0(2131745993, null);
                } else {
                    M02 = org.telegram.messenger.id.M0(2131745994, null);
                }
                w9Var.c(M05, M02, false, true);
            } else if (i7 == 4) {
                w9Var.c(org.telegram.messenger.id.M0(2131745989, null), a8.p0.n(((wi.o0) xi.e.f58871g.a()).f58131a, " FPS", new StringBuilder()), false, true);
            } else {
                w9Var.c(org.telegram.messenger.id.M0(2131745997, null), az0.f0(xi.e.h.a()), false, false);
            }
        } else {
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) d1Var.f57056a;
            if (i7 == 6) {
                M0 = org.telegram.messenger.id.M0(2131745987, null);
            } else {
                M0 = org.telegram.messenger.id.M0(2131745990, null);
            }
            z8Var.setText(M0);
        }
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        switch (this.f47457c) {
            case 0:
                int b10 = d1Var.b();
                if (b10 == 1) {
                    return true;
                }
                if (MediaController.s0(az0.c0((az0) this.f47458e)) && b10 == 2) {
                    return true;
                }
                return false;
            case 1:
                int b11 = d1Var.b();
                org.telegram.ui.Components.bn bnVar = (org.telegram.ui.Components.bn) this.f47458e;
                if (b11 != bnVar.f32322u0 && b11 != bnVar.G0 && b11 != bnVar.B0 && b11 != bnVar.F0 && b11 != bnVar.C0 && b11 != bnVar.H0 && b11 != bnVar.D0 && b11 != bnVar.E0 && b11 != bnVar.I0 && b11 != bnVar.J0 && b11 != bnVar.N0.f3393b && b11 != bnVar.M0.f3393b && b11 != bnVar.L0) {
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
                if (d1Var.f57060f == 0) {
                    return true;
                }
                return false;
            case 6:
                return true;
            case 7:
                return true;
            case 8:
                int b12 = d1Var.b();
                DataAutoDownloadActivity dataAutoDownloadActivity = (DataAutoDownloadActivity) this.f47458e;
                if (b12 != DataAutoDownloadActivity.n0(dataAutoDownloadActivity) && b12 != DataAutoDownloadActivity.o0(dataAutoDownloadActivity) && b12 != DataAutoDownloadActivity.g0(dataAutoDownloadActivity) && b12 != DataAutoDownloadActivity.p0(dataAutoDownloadActivity)) {
                    return false;
                }
                return true;
            case 9:
                int b13 = d1Var.b();
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.f47458e;
                if (b13 != dataSettingsActivity.f41224e && b13 != dataSettingsActivity.f41225f && b13 != dataSettingsActivity.h && b13 != dataSettingsActivity.f41228s && b13 != DataSettingsActivity.c0(dataSettingsActivity) && b13 != dataSettingsActivity.f41229w && b13 != DataSettingsActivity.d0(dataSettingsActivity) && b13 != DataSettingsActivity.e0(dataSettingsActivity) && b13 != dataSettingsActivity.E && b13 != dataSettingsActivity.D && b13 != dataSettingsActivity.F && b13 != dataSettingsActivity.G && b13 != dataSettingsActivity.K && b13 != dataSettingsActivity.J && b13 != dataSettingsActivity.f41226n && b13 != DataSettingsActivity.h0(dataSettingsActivity) && b13 != DataSettingsActivity.f0(dataSettingsActivity) && b13 != DataSettingsActivity.j0(dataSettingsActivity) && b13 != DataSettingsActivity.b0(dataSettingsActivity)) {
                    return false;
                }
                return true;
            case 10:
                int b14 = d1Var.b();
                ge0 ge0Var = (ge0) this.f47458e;
                if (b14 != ge0Var.f45983c && b14 != ge0Var.d && b14 != ge0Var.f45984e && b14 != ge0Var.f45985f && b14 != ge0Var.h && b14 != ge0Var.f45987r) {
                    return false;
                }
                return true;
            case 11:
                int b15 = d1Var.b();
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.f47458e;
                if (b15 != notificationsSettingsActivity.f41331y && b15 != notificationsSettingsActivity.D && b15 != notificationsSettingsActivity.E && b15 != notificationsSettingsActivity.K && b15 != notificationsSettingsActivity.M && b15 != notificationsSettingsActivity.S && b15 != notificationsSettingsActivity.N && b15 != notificationsSettingsActivity.L && b15 != notificationsSettingsActivity.R && b15 != notificationsSettingsActivity.F && b15 != notificationsSettingsActivity.G && b15 != notificationsSettingsActivity.O && b15 != notificationsSettingsActivity.f41327r && b15 != notificationsSettingsActivity.f41328s && b15 != notificationsSettingsActivity.T && b15 != notificationsSettingsActivity.J) {
                    return true;
                }
                return false;
            case 12:
                int b16 = d1Var.b();
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f47458e;
                if (b16 != PasscodeActivity.c0(passcodeActivity) && b16 != PasscodeActivity.d0(passcodeActivity) && b16 != passcodeActivity.N && b16 != PasscodeActivity.e0(passcodeActivity) && b16 != PasscodeActivity.f0(passcodeActivity) && b16 != passcodeActivity.J && b16 != passcodeActivity.K) {
                    return false;
                }
                return true;
            case 13:
                return true;
            case 14:
                zm0 zm0Var = (zm0) this.f47458e;
                if (zm0Var.J == null && (!TextUtils.isEmpty(zm0Var.f52627w) ? d1Var.b() >= zm0Var.f52607f.size() : d1Var.f57060f != 3)) {
                    return false;
                }
                return true;
            case 15:
                return false;
            case 16:
                int b17 = d1Var.b();
                ProxyListActivity proxyListActivity = (ProxyListActivity) this.f47458e;
                if (b17 != ProxyListActivity.g0(proxyListActivity) && b17 != proxyListActivity.f41891w && b17 != ProxyListActivity.f0(proxyListActivity) && b17 != proxyListActivity.D && (b17 < proxyListActivity.f41888n || b17 >= proxyListActivity.f41889r)) {
                    return false;
                }
                return true;
            case 17:
                int b18 = d1Var.b();
                if (b18 == 1) {
                    return true;
                }
                if (org.telegram.ui.Components.u40.e(az0.b0((az0) this.f47458e)) && (b18 == 2 || b18 == 3 || b18 == 4 || b18 == 5 || b18 == 8)) {
                    return true;
                }
                return false;
            case 18:
                if (d1Var.f57060f != 1) {
                    return true;
                }
                return false;
            default:
                if (p1.g.d(3)[d1Var.f57060f] == 1) {
                    return true;
                }
                return false;
        }
    }

    public void E() {
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.f47458e;
        int size = proxyListActivity.E.size();
        boolean t6 = ProxyListActivity.b0(proxyListActivity).t();
        if (size > 0) {
            ProxyListActivity.c0(proxyListActivity).y(size, t6);
            if (!t6) {
                ProxyListActivity.d0(proxyListActivity).C();
                int i7 = proxyListActivity.f41888n;
                n(i7, proxyListActivity.f41889r - i7, 2);
            }
        } else if (t6) {
            ProxyListActivity.e0(proxyListActivity).s();
            int i10 = proxyListActivity.f41888n;
            n(i10, proxyListActivity.f41889r - i10, 2);
        }
    }

    public void F() {
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.f47458e;
        proxyListActivity.E.clear();
        int i7 = proxyListActivity.f41888n;
        n(i7, proxyListActivity.f41889r - i7, 1);
        E();
    }

    public void M(int i7) {
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.f47458e;
        ArrayList arrayList = proxyListActivity.E;
        int i10 = proxyListActivity.f41888n;
        if (i7 >= i10 && i7 < proxyListActivity.f41889r) {
            org.telegram.messenger.hz hzVar = (org.telegram.messenger.hz) proxyListActivity.F.get(i7 - i10);
            if (arrayList.contains(hzVar)) {
                arrayList.remove(hzVar);
            } else {
                arrayList.add(hzVar);
            }
            h(i7, 1);
            E();
        }
    }

    @Override
    public final int b() {
        switch (this.f47457c) {
            case 0:
                return 4;
            case 1:
                return ((org.telegram.ui.Components.bn) this.f47458e).Q0;
            case 2:
                return ((org.telegram.ui.Components.fz) this.f47458e).h.size();
            case 3:
                int size = ((org.telegram.ui.Components.gz) this.f47458e).f34105r1.size();
                if (size < 10) {
                    return size + 1;
                }
                return size;
            case 4:
                return ((org.telegram.ui.Components.td0) this.f47458e).F;
            case 5:
                return org.telegram.messenger.sd.g() + 1;
            case 6:
                ArrayList arrayList = ((org.telegram.ui.Components.pw0) this.d).f37117x;
                if (arrayList == null) {
                    return 0;
                }
                return arrayList.size();
            case 7:
                return ((org.telegram.ui.Components.v61) this.f47458e).h.size();
            case 8:
                return ((DataAutoDownloadActivity) this.f47458e).f41220y;
            case 9:
                return ((DataSettingsActivity) this.f47458e).T;
            case 10:
                return ((ge0) this.f47458e).f45989w;
            case 11:
                return ((NotificationsSettingsActivity) this.f47458e).U;
            case 12:
                return ((PasscodeActivity) this.f47458e).P;
            case 13:
                om0 om0Var = (om0) this.f47458e;
                ArrayList arrayList2 = om0Var.d;
                if (arrayList2 != null) {
                    return (int) Math.ceil(arrayList2.size() / om0Var.f48479f);
                }
                return 0;
            case 14:
                zm0 zm0Var = (zm0) this.f47458e;
                org.telegram.messenger.we weVar = zm0Var.J;
                if (weVar == null) {
                    if (zm0Var.f52607f.isEmpty()) {
                        if (!TextUtils.isEmpty(zm0Var.f52627w) || zm0Var.f52615n.isEmpty()) {
                            return 0;
                        }
                        return zm0Var.f52615n.size() + 2;
                    }
                    return zm0Var.f52607f.size() + (!zm0Var.f52622s ? 1 : 0);
                }
                return weVar.f26300e.size();
            case 15:
                PhotoViewer photoViewer = (PhotoViewer) this.f47458e;
                wq0 wq0Var = photoViewer.d;
                if (wq0Var != null && wq0Var.c() != null) {
                    return photoViewer.d.c().size();
                }
                return 0;
            case 16:
                return ((ProxyListActivity) this.f47458e).f41886e;
            case 17:
                return 7;
            case 18:
                return ((ArrayList) this.f47458e).size();
            default:
                return ((pg.j) this.f47458e).E.size();
        }
    }

    @Override
    public long c(int i7) {
        int i10;
        switch (this.f47457c) {
            case 2:
                i10 = ((org.telegram.ui.Components.fz) this.f47458e).f33780k0.get(i7);
                break;
            case 4:
                return i7;
            case 6:
                ArrayList arrayList = ((org.telegram.ui.Components.pw0) this.d).f37117x;
                if (arrayList == null) {
                    return 0L;
                }
                return ((org.telegram.messenger.qi) arrayList.get(i7)).f24701a.hashCode();
            case 7:
                i10 = ((org.telegram.ui.Components.s61) ((org.telegram.ui.Components.v61) this.f47458e).h.get(i7)).f37938a;
                break;
            case 14:
                return i7;
            case 16:
                ProxyListActivity proxyListActivity = (ProxyListActivity) this.f47458e;
                if (i7 == proxyListActivity.f41887f) {
                    return -1L;
                }
                if (i7 == proxyListActivity.f41890s) {
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
                if (i7 == proxyListActivity.D) {
                    return -8L;
                }
                if (i7 == proxyListActivity.f41891w) {
                    return -9L;
                }
                if (i7 == proxyListActivity.f41892x) {
                    return -10L;
                }
                if (i7 == proxyListActivity.f41893y) {
                    return -11L;
                }
                int i11 = proxyListActivity.f41888n;
                if (i7 >= i11 && i7 < proxyListActivity.f41889r) {
                    return ((org.telegram.messenger.hz) proxyListActivity.F.get(i7 - i11)).hashCode();
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
        switch (this.f47457c) {
            case 0:
                if (i7 == 0) {
                    return 0;
                }
                int i27 = 1;
                if (i7 != 1) {
                    i27 = 2;
                    if (i7 != 2) {
                        return 3;
                    }
                }
                return i27;
            case 1:
                org.telegram.ui.Components.bn bnVar = (org.telegram.ui.Components.bn) this.f47458e;
                if (i7 != bnVar.B0 && i7 != bnVar.F0 && i7 != bnVar.G0 && i7 != bnVar.C0 && i7 != bnVar.D0 && i7 != bnVar.E0 && i7 != bnVar.H0 && i7 != bnVar.M0.f3393b && i7 != bnVar.N0.f3393b) {
                    if (i7 != bnVar.f32307l0 && i7 != bnVar.f32320s0 && i7 != bnVar.f32325w0 && i7 != bnVar.f32311o0) {
                        if (i7 == bnVar.f32318r0) {
                            return 1;
                        }
                        if (i7 != bnVar.f32323v0 && i7 != bnVar.f32327x0 && i7 != bnVar.f32315q0 && i7 != bnVar.K0) {
                            if (i7 != bnVar.f32322u0 && i7 != bnVar.I0 && i7 != bnVar.L0) {
                                if (i7 == bnVar.m0) {
                                    return 4;
                                }
                                if (i7 == bnVar.f32310n0) {
                                    return 11;
                                }
                                if (i7 == bnVar.f32313p0) {
                                    return 7;
                                }
                                if (i7 != bnVar.f32329y0 && i7 != bnVar.f32330z0 && i7 != bnVar.J0) {
                                    if (i7 == bnVar.A0) {
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
                org.telegram.ui.Components.td0 td0Var = (org.telegram.ui.Components.td0) this.f47458e;
                if (i7 != td0Var.D && i7 != td0Var.E) {
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
                DataAutoDownloadActivity dataAutoDownloadActivity = (DataAutoDownloadActivity) this.f47458e;
                if (i7 == DataAutoDownloadActivity.c0(dataAutoDownloadActivity)) {
                    return 0;
                }
                if (i7 == dataAutoDownloadActivity.f41217s) {
                    return 1;
                }
                if (i7 != dataAutoDownloadActivity.f41216r && i7 != dataAutoDownloadActivity.f41218w) {
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
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.f47458e;
                if (i7 != dataSettingsActivity.f41227r && i7 != dataSettingsActivity.f41230x && i7 != dataSettingsActivity.N && i7 != dataSettingsActivity.P && i7 != dataSettingsActivity.L && i7 != dataSettingsActivity.Q && i7 != dataSettingsActivity.S) {
                    if (i7 != dataSettingsActivity.d && i7 != dataSettingsActivity.f41231y && i7 != dataSettingsActivity.M && i7 != 0 && i7 != dataSettingsActivity.O && i7 != dataSettingsActivity.I && i7 != dataSettingsActivity.R) {
                        if (i7 != dataSettingsActivity.E && i7 != dataSettingsActivity.D && i7 != dataSettingsActivity.F && i7 != dataSettingsActivity.G && i7 != dataSettingsActivity.J && i7 != dataSettingsActivity.K) {
                            if (i7 == dataSettingsActivity.H) {
                                return 4;
                            }
                            if (i7 != dataSettingsActivity.f41224e && i7 != dataSettingsActivity.h && i7 != dataSettingsActivity.f41225f && i7 != DataSettingsActivity.h0(dataSettingsActivity) && i7 != DataSettingsActivity.f0(dataSettingsActivity) && i7 != DataSettingsActivity.j0(dataSettingsActivity)) {
                                if (i7 != dataSettingsActivity.f41228s && i7 != dataSettingsActivity.f41229w && i7 != dataSettingsActivity.f41226n) {
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
                ge0 ge0Var = (ge0) this.f47458e;
                ge0Var.getClass();
                if (i7 == 0) {
                    return 0;
                }
                if (i7 != ge0Var.f45983c && i7 != ge0Var.d && i7 != ge0Var.f45984e && i7 != ge0Var.f45985f && i7 != ge0Var.h) {
                    if (i7 == ge0Var.f45986n) {
                        return 2;
                    }
                    if (i7 == ge0Var.f45987r) {
                        return 3;
                    }
                    return 4;
                }
                return 1;
            case 11:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.f47458e;
                if (i7 != notificationsSettingsActivity.K && i7 != notificationsSettingsActivity.M && i7 != notificationsSettingsActivity.S && i7 != notificationsSettingsActivity.G && i7 != notificationsSettingsActivity.N && i7 != notificationsSettingsActivity.E && i7 != notificationsSettingsActivity.f41331y && i7 != notificationsSettingsActivity.f41327r) {
                    i10 = notificationsSettingsActivity.inappSoundRow;
                    if (i7 != i10) {
                        i11 = notificationsSettingsActivity.inappVibrateRow;
                        if (i7 != i11 && i7 != notificationsSettingsActivity.f41330x) {
                            i12 = notificationsSettingsActivity.inappPreviewRow;
                            if (i7 != i12) {
                                i13 = notificationsSettingsActivity.contactJoinedRow;
                                if (i7 != i13) {
                                    i14 = notificationsSettingsActivity.pinnedMessageRow;
                                    if (i7 != i14 && i7 != notificationsSettingsActivity.f41329w) {
                                        i15 = notificationsSettingsActivity.badgeNumberMutedRow;
                                        if (i7 != i15) {
                                            i16 = notificationsSettingsActivity.badgeNumberMessagesRow;
                                            if (i7 != i16) {
                                                i17 = notificationsSettingsActivity.badgeNumberShowRow;
                                                if (i7 != i17) {
                                                    i18 = notificationsSettingsActivity.inappPriorityRow;
                                                    if (i7 != i18) {
                                                        i19 = notificationsSettingsActivity.inchatSoundRow;
                                                        if (i7 != i19 && i7 != notificationsSettingsActivity.P) {
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
                                                                                        if (i7 != notificationsSettingsActivity.J && i7 != notificationsSettingsActivity.D && i7 != notificationsSettingsActivity.L && i7 != notificationsSettingsActivity.R && i7 != notificationsSettingsActivity.F && i7 != notificationsSettingsActivity.O && i7 != notificationsSettingsActivity.T) {
                                                                                            if (i7 == notificationsSettingsActivity.f41328s) {
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
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f47458e;
                if (i7 != PasscodeActivity.c0(passcodeActivity) && i7 != passcodeActivity.N && i7 != passcodeActivity.K && i7 != passcodeActivity.J) {
                    if (i7 != PasscodeActivity.e0(passcodeActivity) && i7 != PasscodeActivity.d0(passcodeActivity) && i7 != PasscodeActivity.f0(passcodeActivity)) {
                        if (i7 != passcodeActivity.H && i7 != passcodeActivity.O && i7 != passcodeActivity.G && i7 != passcodeActivity.L) {
                            if (i7 != passcodeActivity.M && i7 != passcodeActivity.I) {
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
                zm0 zm0Var = (zm0) this.f47458e;
                if (zm0Var.Y) {
                    return 2;
                }
                if (zm0Var.J == null) {
                    if (zm0Var.f52607f.isEmpty()) {
                        if (i7 == zm0Var.f52615n.size()) {
                            return 4;
                        }
                        return 3;
                    } else if (i7 >= zm0Var.f52607f.size()) {
                        return 1;
                    }
                }
                return 0;
            case 15:
                return 0;
            case 16:
                ProxyListActivity proxyListActivity = (ProxyListActivity) this.f47458e;
                if (i7 != proxyListActivity.f41887f && i7 != proxyListActivity.f41890s) {
                    if (i7 != ProxyListActivity.f0(proxyListActivity) && i7 != proxyListActivity.D) {
                        if (i7 != ProxyListActivity.g0(proxyListActivity) && i7 != proxyListActivity.f41891w) {
                            if (i7 == proxyListActivity.h) {
                                return 2;
                            }
                            if (i7 == proxyListActivity.f41892x) {
                                return 6;
                            }
                            if (i7 >= proxyListActivity.f41888n && i7 < proxyListActivity.f41889r) {
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
                if (i7 == ((ArrayList) this.f47458e).size()) {
                    return 1;
                }
                return 0;
            case 19:
                return p1.g.c(((pg.a) ((pg.j) this.f47458e).E.get(i7)).f53611b);
        }
    }

    @Override
    public final void t(v4.d1 r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l4.t(v4.d1, int):void");
    }

    @Override
    public void v(v4.d1 d1Var, int i7, List list) {
        boolean contains;
        switch (this.f47457c) {
            case 16:
                ProxyListActivity proxyListActivity = (ProxyListActivity) this.f47458e;
                ArrayList arrayList = proxyListActivity.E;
                int i10 = d1Var.f57060f;
                View view = d1Var.f57056a;
                if (i10 == 5 && !list.isEmpty()) {
                    rx0 rx0Var = (rx0) view;
                    if (list.contains(1) && (contains = arrayList.contains(proxyListActivity.F.get(i7 - proxyListActivity.f41888n))) != rx0Var.h) {
                        rx0Var.h = contains;
                        rx0Var.f49626f.a(contains, true);
                    }
                    if (list.contains(2)) {
                        rx0Var.a(!arrayList.isEmpty(), true);
                        return;
                    }
                    return;
                } else if (d1Var.f57060f == 3 && list.contains(0)) {
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    if (i7 == ProxyListActivity.g0(proxyListActivity)) {
                        r8Var.setChecked(proxyListActivity.d);
                        return;
                    } else if (i7 == proxyListActivity.f41891w) {
                        r8Var.setChecked(org.telegram.messenger.iz.f23387a1);
                        return;
                    } else {
                        return;
                    }
                } else {
                    t(d1Var, i7);
                    return;
                }
            default:
                super.v(d1Var, i7, list);
                return;
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View z8Var;
        org.telegram.ui.Components.zm n4Var;
        View view;
        org.telegram.ui.Cells.r5 r5Var;
        FrameLayout frameLayout;
        org.telegram.ui.Components.xt0 xt0Var;
        View y6Var;
        org.telegram.ui.Cells.y8 y8Var;
        View n4Var2;
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        org.telegram.ui.ActionBar.g6 g6Var3;
        org.telegram.ui.ActionBar.g6 g6Var4;
        org.telegram.ui.ActionBar.g6 g6Var5;
        View r8Var;
        org.telegram.ui.Cells.m8 m8Var;
        View y6Var2;
        org.telegram.ui.Cells.w9 w9Var;
        View t4Var;
        FrameLayout frameLayout2;
        int i10 = this.f47457c;
        int i11 = 8;
        Object obj = this.f47458e;
        Object obj2 = this.d;
        switch (i10) {
            case 0:
                Context context = (Context) obj2;
                if (i7 == 0) {
                    z8Var = new org.telegram.ui.Cells.n4(context);
                } else if (i7 == 1) {
                    z8Var = new org.telegram.ui.Cells.r8(context);
                } else if (i7 == 2) {
                    org.telegram.ui.Cells.w9 w9Var2 = new org.telegram.ui.Cells.w9(context);
                    w9Var2.setCanDisable(true);
                    z8Var = w9Var2;
                } else {
                    z8Var = new org.telegram.ui.Cells.z8(context);
                }
                z8Var.setLayoutParams(new v4.o0(-1, -2));
                return new v4.d1(z8Var);
            case 1:
                Context context2 = (Context) obj2;
                org.telegram.ui.Components.bn bnVar = (org.telegram.ui.Components.bn) obj;
                boolean z9 = bnVar.f32309n;
                org.telegram.ui.ActionBar.g6 g6Var6 = bnVar.f39070a;
                switch (i7) {
                    case 0:
                        n4Var = new org.telegram.ui.Cells.n4((Context) obj2, org.telegram.ui.ActionBar.l6.L6, 21, 15, false, bnVar.f39070a);
                        break;
                    case 1:
                        View y6Var3 = new org.telegram.ui.Cells.y6(context2, (org.telegram.ui.Cells.f1) null);
                        new org.telegram.ui.Components.xp(new ColorDrawable(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27809a7, g6Var6)), org.telegram.ui.ActionBar.l6.Y0(context2, 2131231229, org.telegram.ui.ActionBar.l6.f27829b7)).f40453x = true;
                        view = y6Var3;
                        n4Var = view;
                        break;
                    case 2:
                        n4Var = new org.telegram.ui.Cells.z8(context2, g6Var6);
                        break;
                    case 3:
                        n4Var = new org.telegram.ui.Cells.m8(context2, g6Var6);
                        break;
                    case 4:
                    case 11:
                        org.telegram.ui.Components.wm wmVar = new org.telegram.ui.Components.wm(this, (Context) obj2, bnVar.I ? 1 : 0, bnVar.f39070a, i7);
                        if (i7 == 11 && !z9) {
                            wmVar.setTextRight(98);
                            wmVar.a().setOnClickListener(new View.OnClickListener(this) {
                                public final org.telegram.ui.l4 f38751b;

                                {
                                    this.f38751b = this;
                                }

                                @Override
                                public final void onClick(View view2) {
                                    switch (r2) {
                                        case 0:
                                            bn.S((bn) this.f38751b.f47458e, -2);
                                            return;
                                        case 1:
                                            bn.S((bn) this.f38751b.f47458e, -3);
                                            return;
                                        default:
                                            ((bn) this.f38751b.f47458e).c0(view2, (org.telegram.ui.Cells.a6) view2.getParent(), true);
                                            return;
                                    }
                                }
                            });
                        }
                        wmVar.c();
                        wmVar.setIconsColor(org.telegram.ui.ActionBar.l6.f28066o7);
                        wmVar.b(new org.telegram.ui.Components.xm(this, wmVar, i7));
                        n4Var = wmVar;
                        break;
                    case 5:
                    default:
                        org.telegram.ui.Components.zm zmVar = new org.telegram.ui.Components.zm(this, (Context) obj2, bnVar.I ? 1 : 0, new View.OnClickListener(this) {
                            public final org.telegram.ui.l4 f38751b;

                            {
                                this.f38751b = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (r2) {
                                    case 0:
                                        bn.S((bn) this.f38751b.f47458e, -2);
                                        return;
                                    case 1:
                                        bn.S((bn) this.f38751b.f47458e, -3);
                                        return;
                                    default:
                                        ((bn) this.f38751b.f47458e).c0(view2, (org.telegram.ui.Cells.a6) view2.getParent(), true);
                                        return;
                                }
                            }
                        }, bnVar.f39070a);
                        if (!z9) {
                            zmVar.setTextRight(140);
                            zmVar.a().setOnClickListener(new org.telegram.ui.Components.lk(1, this, zmVar));
                        }
                        int i12 = org.telegram.ui.ActionBar.l6.f28066o7;
                        zmVar.setIconsColor(i12);
                        org.telegram.ui.Components.wo woVar = zmVar.f28898r;
                        if (woVar != null) {
                            woVar.getCheckBoxBase().i(org.telegram.messenger.g0.L(6.0f));
                            CheckBoxBase checkBoxBase = woVar.getCheckBoxBase();
                            float f10 = zmVar.f28892a.f55499e;
                            if (checkBoxBase.f31273w != f10) {
                                checkBoxBase.f31273w = f10;
                                checkBoxBase.b();
                            }
                        }
                        zmVar.getCheckBox().b(-1, i12, org.telegram.ui.ActionBar.l6.f27995k7);
                        zmVar.b(new fi.h7(4, this, zmVar));
                        zmVar.setShowNextButton(true);
                        EditTextBoldCursor textView = zmVar.getTextView();
                        textView.setImeOptions(textView.getImeOptions() | 5);
                        textView.setOnEditorActionListener(new nd(2, this, zmVar));
                        textView.setOnKeyListener(new org.telegram.ui.Components.vm(zmVar, 0));
                        n4Var = zmVar;
                        break;
                    case 6:
                        n4Var = new org.telegram.ui.Cells.r8(context2, g6Var6);
                        break;
                    case 7:
                        org.telegram.ui.Components.ym ymVar = new org.telegram.ui.Components.ym(this, context2, bnVar.I ? 1 : 0);
                        ymVar.c();
                        if (!z9) {
                            ymVar.setTextRight(98);
                            ymVar.a().setOnClickListener(new View.OnClickListener(this) {
                                public final org.telegram.ui.l4 f38751b;

                                {
                                    this.f38751b = this;
                                }

                                @Override
                                public final void onClick(View view2) {
                                    switch (r2) {
                                        case 0:
                                            bn.S((bn) this.f38751b.f47458e, -2);
                                            return;
                                        case 1:
                                            bn.S((bn) this.f38751b.f47458e, -3);
                                            return;
                                        default:
                                            ((bn) this.f38751b.f47458e).c0(view2, (org.telegram.ui.Cells.a6) view2.getParent(), true);
                                            return;
                                    }
                                }
                            });
                        }
                        ymVar.setIconsColor(org.telegram.ui.ActionBar.l6.f28066o7);
                        ymVar.b(new fi.h7(3, this, ymVar));
                        n4Var = ymVar;
                        break;
                    case 8:
                        View tmVar = new org.telegram.ui.Components.tm(context2, 0);
                        tmVar.setTag(-33024);
                        view = tmVar;
                        n4Var = view;
                        break;
                    case 9:
                        View ecVar = new bi.ec(15, context2, this);
                        ecVar.setTag(-33024);
                        view = ecVar;
                        n4Var = view;
                        break;
                    case 10:
                        org.telegram.ui.Cells.x5 x5Var = new org.telegram.ui.Cells.x5(context2, g6Var6);
                        x5Var.getCheckBox().setIcon(2131232513);
                        n4Var = x5Var;
                        break;
                }
                return jg.g.r(n4Var, n4Var, -1, -2);
            case 2:
                return new v4.d1(new org.telegram.ui.Components.dz((org.telegram.ui.Components.fz) obj, (Context) obj2));
            case 3:
                org.telegram.ui.ActionBar.o2 o2Var = new org.telegram.ui.ActionBar.o2(0, (Context) obj2, null);
                o2Var.setBackground(null);
                o2Var.setLayoutParams(new v4.o0(-1, -2));
                return new v4.d1(o2Var);
            case 4:
                Context context3 = (Context) obj2;
                if (i7 == 0) {
                    org.telegram.ui.ActionBar.g6 g6Var7 = ((org.telegram.ui.Components.td0) obj).I0;
                    ?? frameLayout3 = new FrameLayout(context3);
                    frameLayout3.f30271e = new m.f3((Object) frameLayout3, 20);
                    TextView textView2 = new TextView(context3);
                    frameLayout3.f30268a = textView2;
                    textView2.setGravity(5);
                    textView2.setTextColor(-1);
                    textView2.setTextSize(1, 12.0f);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    frameLayout3.addView(textView2, c8.ha.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
                    TextView textView3 = new TextView(context3);
                    frameLayout3.f30269b = textView3;
                    org.telegram.ui.ActionBar.s6.U(textView3, org.telegram.ui.ActionBar.l6.f28056ng, g6Var7);
                    textView3.setTextSize(1, 12.0f);
                    textView3.setGravity(5);
                    textView3.setSingleLine(true);
                    frameLayout3.addView(textView3, c8.ha.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
                    ?? view2 = new View(context3);
                    Paint paint = new Paint();
                    view2.f34712a = paint;
                    Paint paint2 = new Paint(1);
                    view2.f34713b = paint2;
                    view2.f34714c = org.telegram.messenger.g0.L(16.0f);
                    view2.d = 0;
                    view2.f34715e = 0.0f;
                    view2.f34716f = false;
                    paint.setColor(-11711155);
                    paint2.setColor(-1);
                    frameLayout3.f30270c = view2;
                    frameLayout3.addView(view2, c8.ha.d(-1, 40.0f, 19, 96.0f, 0.0f, 24.0f, 0.0f));
                    frameLayout3.setSeekBarDelegate(new org.telegram.ui.Components.bx(this, 11));
                    r5Var = frameLayout3;
                } else {
                    org.telegram.ui.Cells.r5 r5Var2 = new org.telegram.ui.Cells.r5(context3);
                    r5Var2.setOnClickListener(new org.telegram.ui.Components.ma0(this, 3));
                    r5Var = r5Var2;
                }
                return new v4.d1(r5Var);
            case 5:
                Context context4 = (Context) obj2;
                org.telegram.ui.Components.ct0 ct0Var = (org.telegram.ui.Components.ct0) obj;
                if (i7 != 0) {
                    FrameLayout b4Var = new di.b4(context4, 19);
                    b4Var.setWillNotDraw(false);
                    ct0Var.l1 = new TextView(context4);
                    org.telegram.ui.ActionBar.s6.U(ct0Var.l1, org.telegram.ui.ActionBar.l6.J5, ct0Var.I0);
                    ct0Var.l1.setTextSize(1, 14.0f);
                    ct0Var.l1.setGravity(17);
                    ct0Var.l1.setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
                    b4Var.addView(ct0Var.l1, c8.ha.c(40.0f, -1));
                    frameLayout = b4Var;
                } else {
                    frameLayout = new org.telegram.ui.Cells.r7(54, context4, ct0Var.I0, false);
                }
                return new v4.d1(frameLayout);
            case 6:
                return new v4.d1(new org.telegram.ui.Components.ow0((org.telegram.ui.Components.pw0) obj, ((org.telegram.ui.Components.pw0) obj2).getContext()));
            case 7:
                return new v4.d1(new org.telegram.ui.Components.t61((org.telegram.ui.Components.v61) obj, (Context) obj2));
            case 8:
                Context context5 = (Context) obj2;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                if (i7 != 4) {
                                    xt0Var = new org.telegram.ui.Cells.z8(context5);
                                } else {
                                    xt0Var = new org.telegram.ui.Cells.h5(context5);
                                }
                            } else {
                                org.telegram.ui.Components.xt0 xt0Var2 = new org.telegram.ui.Components.xt0(context5, null);
                                xt0Var2.setCallback(new yr(this, 3));
                                xt0Var = xt0Var2;
                            }
                        } else {
                            xt0Var = new org.telegram.ui.Cells.n4(context5);
                        }
                    } else {
                        xt0Var = new org.telegram.ui.Cells.y6(context5, (org.telegram.ui.Cells.f1) null);
                    }
                } else {
                    org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(context5);
                    r8Var2.d(org.telegram.ui.ActionBar.l6.f27920g6, org.telegram.ui.ActionBar.l6.O6, org.telegram.ui.ActionBar.l6.P6, org.telegram.ui.ActionBar.l6.Q6, org.telegram.ui.ActionBar.l6.R6);
                    r8Var2.setTypeface(org.telegram.messenger.g0.o());
                    r8Var2.setHeight(56);
                    xt0Var = r8Var2;
                }
                return jg.g.r(xt0Var, xt0Var, -1, -2);
            case 9:
                Context context6 = (Context) obj2;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                if (i7 != 4) {
                                    if (i7 != 5) {
                                        y6Var = new org.telegram.ui.Cells.m8(context6);
                                    } else {
                                        y6Var = new org.telegram.ui.Cells.h5(context6);
                                    }
                                } else {
                                    y6Var = new org.telegram.ui.Cells.z8(context6);
                                }
                            } else {
                                y6Var = new org.telegram.ui.Cells.r8(context6);
                            }
                        } else {
                            y6Var = new org.telegram.ui.Cells.n4(context6, 22);
                        }
                    } else {
                        y6Var = new org.telegram.ui.Cells.w9(context6);
                    }
                } else {
                    y6Var = new org.telegram.ui.Cells.y6(context6, (org.telegram.ui.Cells.f1) null);
                }
                return jg.g.r(y6Var, y6Var, -1, -2);
            case 10:
                Context context7 = (Context) obj2;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                y8Var = new org.telegram.ui.Cells.z8(context7);
                            } else {
                                View w9Var3 = new org.telegram.ui.Cells.w9(context7);
                                org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27865d6, w9Var3, null);
                                y8Var = w9Var3;
                            }
                        } else {
                            y8Var = new org.telegram.ui.Cells.y6(context7, (org.telegram.ui.Cells.f1) null);
                        }
                    } else {
                        org.telegram.ui.Cells.y8 y8Var2 = new org.telegram.ui.Cells.y8(context7);
                        y8Var2.setMultilineDetail(true);
                        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27865d6, y8Var2, null);
                        y8Var = y8Var2;
                    }
                } else {
                    View n4Var3 = new org.telegram.ui.Cells.n4(context7);
                    org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27865d6, n4Var3, null);
                    y8Var = n4Var3;
                }
                return jg.g.r(y8Var, y8Var, -1, -2);
            case 11:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                Context context8 = (Context) obj2;
                if (i7 == 0) {
                    g6Var = ((org.telegram.ui.ActionBar.f2) notificationsSettingsActivity).resourceProvider;
                    n4Var2 = new org.telegram.ui.Cells.n4(context8, g6Var);
                } else if (i7 == 1) {
                    g6Var2 = ((org.telegram.ui.ActionBar.f2) notificationsSettingsActivity).resourceProvider;
                    n4Var2 = new org.telegram.ui.Cells.r8(context8, g6Var2);
                } else if (i7 != 2) {
                    if (i7 == 3) {
                        g6Var3 = ((org.telegram.ui.ActionBar.f2) notificationsSettingsActivity).resourceProvider;
                        n4Var2 = new org.telegram.ui.Cells.h5((Context) obj2, 21, 64, true, g6Var3);
                    } else if (i7 != 4) {
                        if (i7 != 5) {
                            g6Var5 = ((org.telegram.ui.ActionBar.f2) notificationsSettingsActivity).resourceProvider;
                            n4Var2 = new org.telegram.ui.Cells.z8(context8, g6Var5);
                        } else {
                            g6Var4 = ((org.telegram.ui.ActionBar.f2) notificationsSettingsActivity).resourceProvider;
                            n4Var2 = new org.telegram.ui.Cells.w9(0, context8, g6Var4);
                        }
                    } else {
                        n4Var2 = new org.telegram.ui.Cells.y6(context8, (org.telegram.ui.Cells.f1) null);
                    }
                } else {
                    n4Var2 = new org.telegram.ui.Cells.y8(context8);
                }
                return new v4.d1(n4Var2);
            case 12:
                Context context9 = (Context) obj2;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 3) {
                            if (i7 != 4) {
                                r8Var = new org.telegram.ui.Cells.z8(context9);
                            } else {
                                r8Var = new li0(context9);
                                r8Var.setTag(-33024);
                            }
                        } else {
                            r8Var = new org.telegram.ui.Cells.n4(context9);
                        }
                    } else {
                        r8Var = new org.telegram.ui.Cells.w9(context9);
                    }
                } else {
                    r8Var = new org.telegram.ui.Cells.r8(context9);
                }
                return new v4.d1(r8Var);
            case 13:
                Context context10 = (Context) obj2;
                ?? frameLayout4 = new FrameLayout(context10);
                frameLayout4.f30645e = new Paint();
                frameLayout4.f30643b = new org.telegram.messenger.we[4];
                frameLayout4.f30642a = new org.telegram.ui.Cells.t5[4];
                for (int i13 = 0; i13 < 4; i13++) {
                    frameLayout4.f30642a[i13] = new org.telegram.ui.Cells.t5((org.telegram.ui.Cells.v5) frameLayout4, context10);
                    frameLayout4.addView(frameLayout4.f30642a[i13]);
                    frameLayout4.f30642a[i13].setVisibility(4);
                    frameLayout4.f30642a[i13].setTag(Integer.valueOf(i13));
                    frameLayout4.f30642a[i13].setOnClickListener(new org.telegram.ui.Cells.a(frameLayout4, 9));
                }
                frameLayout4.setDelegate(new ni0(this, 1));
                return new v4.d1(frameLayout4);
            case 14:
                zm0 zm0Var = (zm0) obj;
                boolean z10 = zm0Var.f52621r0;
                Context context11 = (Context) obj2;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                org.telegram.ui.Cells.e3 e3Var = new org.telegram.ui.Cells.e3(context11, null);
                                e3Var.setForceDarkTheme(z10);
                                m8Var = e3Var;
                            } else {
                                org.telegram.ui.Cells.m8 m8Var2 = new org.telegram.ui.Cells.m8(23, context11, true);
                                m8Var2.setLayoutParams(new v4.o0(-1, -2));
                                if (z10) {
                                    org.telegram.ui.ActionBar.s6.X(m8Var2.f29571a, zm0Var.f52626v0, null);
                                    org.telegram.ui.ActionBar.s6.s(m8Var2.f29574e, org.telegram.ui.ActionBar.l6.f27911fh, null, PorterDuff.Mode.MULTIPLY);
                                }
                                m8Var = m8Var2;
                            }
                        } else {
                            m8Var = new org.telegram.ui.Cells.h7(1, context11, null);
                        }
                    } else {
                        ViewGroup frameLayout5 = new FrameLayout(context11);
                        frameLayout5.setLayoutParams(new v4.o0(-1, -2));
                        RadialProgressView radialProgressView = new RadialProgressView(context11, null);
                        radialProgressView.setProgressColor(-11371101);
                        frameLayout5.addView(radialProgressView, c8.ha.c(-1.0f, -1));
                        m8Var = frameLayout5;
                    }
                } else {
                    org.telegram.ui.Cells.q5 q5Var = new org.telegram.ui.Cells.q5(context11, null);
                    q5Var.setDelegate(new xm0(this));
                    FrameLayout checkFrame = q5Var.getCheckFrame();
                    if (zm0Var.T == 0) {
                        i11 = 0;
                    }
                    checkFrame.setVisibility(i11);
                    m8Var = q5Var;
                }
                return new v4.d1(m8Var);
            case 15:
                Context context12 = (Context) obj2;
                ?? frameLayout6 = new FrameLayout(context12);
                new Paint();
                frameLayout6.setWillNotDraw(false);
                org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context12);
                frameLayout6.f30732a = l9Var;
                l9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
                frameLayout6.addView(l9Var, c8.ha.c(-1.0f, -1));
                FrameLayout frameLayout7 = new FrameLayout(context12);
                frameLayout6.f30733b = frameLayout7;
                frameLayout6.addView(frameLayout7, c8.ha.e(42, 42, 53));
                bi.m5 m5Var = new bi.m5(context12);
                m5Var.d = new Path();
                m5Var.f4328e = new float[8];
                m5Var.f4326b = new RectF();
                m5Var.f4327c = new Paint(1);
                frameLayout6.f30735e = m5Var;
                m5Var.setWillNotDraw(false);
                m5Var.setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), 0);
                frameLayout6.addView(m5Var, c8.ha.e(-1, 16, 83));
                m5Var.addView(org.telegram.messenger.camera.q.e(context12, 2131231463), c8.ha.e(-2, -2, 19));
                TextView textView4 = new TextView(context12);
                frameLayout6.d = textView4;
                textView4.setTextColor(-1);
                textView4.setTextSize(1, 12.0f);
                textView4.setImportantForAccessibility(2);
                m5Var.addView(textView4, c8.ha.d(-2, -2.0f, 19, 18.0f, -0.7f, 0.0f, 0.0f));
                org.telegram.ui.Components.wo woVar2 = new org.telegram.ui.Components.wo(24, context12, null);
                frameLayout6.f30734c = woVar2;
                woVar2.setDrawBackgroundAsArc(11);
                woVar2.b(org.telegram.ui.ActionBar.l6.W9, org.telegram.ui.ActionBar.l6.X9, org.telegram.ui.ActionBar.l6.V9);
                frameLayout6.addView(woVar2, c8.ha.d(26, 26.0f, 51, 55.0f, 4.0f, 0.0f, 0.0f));
                woVar2.setVisibility(0);
                frameLayout6.setFocusable(true);
                frameLayout7.setOnClickListener(new i40(this, 21));
                return new v4.d1(frameLayout6);
            case 16:
                Context context13 = (Context) obj2;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                if (i7 != 4) {
                                    if (i7 != 6) {
                                        y6Var2 = new rx0((ProxyListActivity) obj, context13);
                                        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27865d6, y6Var2, null);
                                    } else {
                                        y6Var2 = new org.telegram.ui.Components.xt0(context13, null);
                                        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27865d6, y6Var2, null);
                                    }
                                } else {
                                    y6Var2 = new org.telegram.ui.Cells.z8(context13);
                                }
                            } else {
                                y6Var2 = new org.telegram.ui.Cells.r8(context13);
                                org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27865d6, y6Var2, null);
                            }
                        } else {
                            y6Var2 = new org.telegram.ui.Cells.n4(context13);
                            org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27865d6, y6Var2, null);
                        }
                    } else {
                        y6Var2 = new org.telegram.ui.Cells.w9(context13);
                        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27865d6, y6Var2, null);
                    }
                } else {
                    y6Var2 = new org.telegram.ui.Cells.y6(context13, (org.telegram.ui.Cells.f1) null);
                }
                return jg.g.r(y6Var2, y6Var2, -1, -2);
            case 17:
                Context context14 = (Context) obj2;
                if (i7 == 0) {
                    w9Var = new org.telegram.ui.Cells.n4(context14);
                } else if (i7 == 1) {
                    w9Var = new org.telegram.ui.Cells.r8(context14);
                } else if (i7 == 2) {
                    org.telegram.ui.Cells.w9 w9Var4 = new org.telegram.ui.Cells.w9(context14);
                    w9Var4.setCanDisable(true);
                    w9Var = w9Var4;
                } else {
                    w9Var = new org.telegram.ui.Cells.z8(context14);
                }
                w9Var.setLayoutParams(new v4.o0(-1, -2));
                return new v4.d1(w9Var);
            case 18:
                Context context15 = (Context) obj2;
                if (i7 == 0) {
                    t4Var = new org.telegram.ui.Cells.t2(context15, false);
                } else {
                    t4Var = new org.telegram.ui.Cells.t4(context15);
                }
                t4Var.setLayoutParams(new v4.o0(-1, -2));
                return new v4.d1(t4Var);
            default:
                Context context16 = (Context) obj2;
                int c10 = p1.g.c(p1.g.d(3)[i7]);
                if (c10 != 1) {
                    if (c10 != 2) {
                        frameLayout2 = new org.telegram.ui.ActionBar.o1(context16, null);
                    } else {
                        ?? frameLayout8 = new FrameLayout(context16);
                        frameLayout8.setWillNotDraw(false);
                        TextPaint textPaint = new TextPaint(1);
                        frameLayout8.h = textPaint;
                        textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
                        org.telegram.ui.Components.nm0 nm0Var = new org.telegram.ui.Components.nm0(context16);
                        frameLayout8.f53630a = nm0Var;
                        nm0Var.setReportChanges(true);
                        nm0Var.setDelegate(new org.telegram.ui.Components.vy((Object) frameLayout8, 8));
                        nm0Var.setImportantForAccessibility(2);
                        frameLayout8.addView(nm0Var, c8.ha.d(-1, 38.0f, 83, 5.0f, 29.0f, 47.0f, 0.0f));
                        frameLayout2 = frameLayout8;
                    }
                } else {
                    frameLayout2 = new org.telegram.ui.Cells.n4(context16);
                }
                frameLayout2.setLayoutParams(new v4.o0(-1, -2));
                return new v4.d1(frameLayout2);
        }
    }

    @Override
    public void y(v4.d1 d1Var) {
        int i7;
        int i10;
        int i11 = this.f47457c;
        Object obj = this.f47458e;
        switch (i11) {
            case 1:
                org.telegram.ui.Components.bn bnVar = (org.telegram.ui.Components.bn) obj;
                sh.e eVar = bnVar.f32308m1;
                boolean z9 = bnVar.f32309n;
                int i12 = d1Var.f57060f;
                View view = d1Var.f57056a;
                CharSequence charSequence = "";
                if (i12 == 4) {
                    org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view;
                    a6Var.setTag(1);
                    CharSequence charSequence2 = bnVar.N;
                    if (charSequence2 != null) {
                        charSequence = charSequence2;
                    }
                    if (z9) {
                        i10 = 2131744053;
                    } else {
                        i10 = 2131746448;
                    }
                    a6Var.n(charSequence, org.telegram.messenger.id.M0(i10, null), true);
                    a6Var.setTag(null);
                    org.telegram.ui.Components.bn.P(bnVar, view, d1Var.b());
                    return;
                } else if (i12 == 11) {
                    org.telegram.ui.Cells.a6 a6Var2 = (org.telegram.ui.Cells.a6) view;
                    a6Var2.setTag(1);
                    CharSequence charSequence3 = bnVar.O;
                    if (charSequence3 != null) {
                        charSequence = charSequence3;
                    }
                    a6Var2.n(charSequence, org.telegram.messenger.id.M0(2131746449, null), false);
                    a6Var2.setTag(null);
                    a6Var2.f28895e.b(eVar.b(-2), false);
                    org.telegram.ui.Components.bn.P(bnVar, view, d1Var.b());
                    return;
                } else if (i12 == 5) {
                    int b10 = d1Var.b();
                    org.telegram.ui.Cells.a6 a6Var3 = (org.telegram.ui.Cells.a6) view;
                    a6Var3.setTag(1);
                    a6Var3.f28892a.a(bnVar.f32287b0, false);
                    int i13 = b10 - bnVar.f32321t0;
                    CharSequence charSequence4 = bnVar.K[i13];
                    if (z9) {
                        i7 = 2131744055;
                    } else {
                        i7 = 2131747774;
                    }
                    a6Var3.n(charSequence4, org.telegram.messenger.id.M0(i7, null), true);
                    a6Var3.setTag(null);
                    if (bnVar.f32305k0 == b10) {
                        EditTextBoldCursor textView = a6Var3.getTextView();
                        textView.requestFocus();
                        org.telegram.messenger.g0.K3(textView);
                        bnVar.f32305k0 = -1;
                    }
                    if (!z9) {
                        a6Var3.f28895e.b(eVar.b(i13), false);
                    }
                    org.telegram.ui.Components.bn.P(bnVar, view, b10);
                    return;
                } else if (i12 == 7) {
                    org.telegram.ui.Cells.a6 a6Var4 = (org.telegram.ui.Cells.a6) view;
                    a6Var4.setTag(1);
                    CharSequence charSequence5 = bnVar.P;
                    if (charSequence5 != null) {
                        charSequence = charSequence5;
                    }
                    a6Var4.n(charSequence, org.telegram.messenger.id.M0(2131754474, null), false);
                    a6Var4.setTag(null);
                    if (!z9) {
                        a6Var4.f28895e.b(eVar.b(-3), false);
                    }
                    org.telegram.ui.Components.bn.P(bnVar, view, d1Var.b());
                    return;
                } else {
                    return;
                }
            case 9:
                if (d1Var.f57060f == 3) {
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) d1Var.f57056a;
                    int b11 = d1Var.b();
                    DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) obj;
                    if (b11 == dataSettingsActivity.E) {
                        r8Var.setChecked(org.telegram.messenger.iz.E0);
                        return;
                    } else if (b11 == dataSettingsActivity.D) {
                        r8Var.setChecked(org.telegram.messenger.iz.B0);
                        return;
                    } else if (b11 == dataSettingsActivity.F) {
                        r8Var.setChecked(org.telegram.messenger.iz.C0);
                        return;
                    } else if (b11 == dataSettingsActivity.G) {
                        r8Var.setChecked(org.telegram.messenger.iz.D0);
                        return;
                    } else if (b11 == dataSettingsActivity.J) {
                        int i14 = org.telegram.messenger.iz.f23385a;
                        r8Var.setChecked(org.telegram.messenger.sc.e(2048));
                        return;
                    } else if (b11 == dataSettingsActivity.K) {
                        int i15 = org.telegram.messenger.iz.f23385a;
                        r8Var.setChecked(org.telegram.messenger.sc.e(1024));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 16:
                ProxyListActivity proxyListActivity = (ProxyListActivity) obj;
                if (d1Var.f57060f == 3) {
                    org.telegram.ui.Cells.r8 r8Var2 = (org.telegram.ui.Cells.r8) d1Var.f57056a;
                    int b12 = d1Var.b();
                    if (b12 == ProxyListActivity.g0(proxyListActivity)) {
                        r8Var2.setChecked(proxyListActivity.d);
                        return;
                    } else if (b12 == proxyListActivity.f41891w) {
                        r8Var2.setChecked(org.telegram.messenger.iz.f23387a1);
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
    public void z(v4.d1 d1Var) {
        switch (this.f47457c) {
            case 1:
                org.telegram.ui.Components.bn bnVar = (org.telegram.ui.Components.bn) this.f47458e;
                int i7 = d1Var.f57060f;
                if (i7 == 4 || i7 == 11 || i7 == 5) {
                    EditTextBoldCursor textView = ((org.telegram.ui.Cells.a6) d1Var.f57056a).getTextView();
                    if (textView.isFocused()) {
                        if (bnVar.I) {
                            org.telegram.ui.Components.sm smVar = bnVar.f32328y;
                            if (smVar != null) {
                                smVar.f();
                            }
                            bnVar.e0(true);
                        }
                        bnVar.f32298g1 = null;
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

    public l4(pg.j jVar, LaunchActivity launchActivity) {
        this.f47457c = 19;
        this.f47458e = jVar;
        this.d = launchActivity;
    }

    public l4(Context context) {
        this.f47457c = 18;
        this.d = context;
        ArrayList arrayList = new ArrayList();
        this.f47458e = arrayList;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        org.telegram.ui.Cells.o2 o2Var = new org.telegram.ui.Cells.o2();
        o2Var.f29640a = org.telegram.messenger.id.M0(2131744171, null);
        o2Var.f29641b = org.telegram.messenger.id.M0(2131744163, null);
        o2Var.f29642c = 0;
        o2Var.d = 0;
        o2Var.f29643e = true;
        o2Var.f29644f = false;
        o2Var.f29645g = 0;
        o2Var.h = currentTimeMillis;
        o2Var.f29646i = false;
        o2Var.f29647j = false;
        o2Var.f29648k = 2;
        arrayList.add(o2Var);
        org.telegram.ui.Cells.o2 o2Var2 = new org.telegram.ui.Cells.o2();
        o2Var2.f29640a = org.telegram.messenger.id.M0(2131744170, null);
        o2Var2.f29641b = org.telegram.messenger.id.M0(2131744162, null);
        o2Var2.f29642c = 1;
        o2Var2.d = 2;
        o2Var2.f29643e = false;
        o2Var2.f29644f = false;
        o2Var2.f29645g = 0;
        o2Var2.h = currentTimeMillis - 3600;
        o2Var2.f29646i = false;
        o2Var2.f29647j = false;
        o2Var2.f29648k = -1;
        arrayList.add(o2Var2);
        org.telegram.ui.Cells.o2 o2Var3 = new org.telegram.ui.Cells.o2();
        o2Var3.f29640a = org.telegram.messenger.id.M0(2131744169, null);
        o2Var3.f29641b = org.telegram.messenger.id.M0(2131744161, null);
        o2Var3.f29642c = 2;
        o2Var3.d = 3;
        o2Var3.f29643e = false;
        o2Var3.f29644f = true;
        o2Var3.f29645g = 0;
        o2Var3.h = currentTimeMillis - 7200;
        o2Var3.f29646i = false;
        o2Var3.f29647j = true;
        o2Var3.f29648k = -1;
        arrayList.add(o2Var3);
        org.telegram.ui.Cells.o2 o2Var4 = new org.telegram.ui.Cells.o2();
        o2Var4.f29640a = org.telegram.messenger.id.M0(2131744168, null);
        o2Var4.f29641b = org.telegram.messenger.id.M0(2131744160, null);
        o2Var4.f29642c = 3;
        o2Var4.d = 0;
        o2Var4.f29643e = false;
        o2Var4.f29644f = false;
        o2Var4.f29645g = 2;
        o2Var4.h = currentTimeMillis - 10800;
        o2Var4.f29646i = false;
        o2Var4.f29647j = false;
        o2Var4.f29648k = -1;
        arrayList.add(o2Var4);
        org.telegram.ui.Cells.o2 o2Var5 = new org.telegram.ui.Cells.o2();
        o2Var5.f29640a = org.telegram.messenger.id.M0(2131744167, null);
        o2Var5.f29641b = org.telegram.messenger.id.M0(2131744159, null);
        o2Var5.f29642c = 4;
        o2Var5.d = 0;
        o2Var5.f29643e = false;
        o2Var5.f29644f = false;
        o2Var5.f29645g = 1;
        o2Var5.h = currentTimeMillis - 14400;
        o2Var5.f29646i = false;
        o2Var5.f29647j = false;
        o2Var5.f29648k = 2;
        arrayList.add(o2Var5);
        org.telegram.ui.Cells.o2 o2Var6 = new org.telegram.ui.Cells.o2();
        o2Var6.f29640a = org.telegram.messenger.id.M0(2131744166, null);
        o2Var6.f29641b = org.telegram.messenger.id.M0(2131744158, null);
        o2Var6.f29642c = 5;
        o2Var6.d = 0;
        o2Var6.f29643e = false;
        o2Var6.f29644f = false;
        o2Var6.f29645g = 0;
        o2Var6.h = currentTimeMillis - 18000;
        o2Var6.f29646i = false;
        o2Var6.f29647j = false;
        o2Var6.f29648k = -1;
        arrayList.add(o2Var6);
        org.telegram.ui.Cells.o2 o2Var7 = new org.telegram.ui.Cells.o2();
        o2Var7.f29640a = org.telegram.messenger.id.M0(2131744165, null);
        o2Var7.f29641b = org.telegram.messenger.id.M0(2131744157, null);
        o2Var7.f29642c = 6;
        o2Var7.d = 0;
        o2Var7.f29643e = false;
        o2Var7.f29644f = false;
        o2Var7.f29645g = 0;
        o2Var7.h = currentTimeMillis - 21600;
        o2Var7.f29646i = true;
        o2Var7.f29647j = false;
        o2Var7.f29648k = -1;
        arrayList.add(o2Var7);
        org.telegram.ui.Cells.o2 o2Var8 = new org.telegram.ui.Cells.o2();
        o2Var8.f29640a = org.telegram.messenger.id.M0(2131744164, null);
        o2Var8.f29641b = org.telegram.messenger.id.M0(2131744156, null);
        o2Var8.f29642c = 0;
        o2Var8.d = 0;
        o2Var8.f29643e = false;
        o2Var8.f29644f = false;
        o2Var8.f29645g = 0;
        o2Var8.h = currentTimeMillis - 25200;
        o2Var8.f29646i = true;
        o2Var8.f29647j = false;
        o2Var8.f29648k = -1;
        arrayList.add(o2Var8);
    }

    public l4(ProxyListActivity proxyListActivity, Context context) {
        this.f47457c = 16;
        this.f47458e = proxyListActivity;
        this.d = context;
        C(true);
    }
}
