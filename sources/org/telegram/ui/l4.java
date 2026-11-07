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
public final class l4 extends org.telegram.ui.Components.oj0 {
    public final int f47404c;
    public final Object d;
    public final Object f47405e;

    public l4(int i7, Object obj, Object obj2) {
        this.f47404c = i7;
        this.f47405e = obj;
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
        xm0 xm0Var = (xm0) this.f47405e;
        org.telegram.messenger.we weVar = xm0Var.J;
        ArrayList arrayList = xm0Var.f51927n;
        ArrayList arrayList2 = xm0Var.f51914c;
        HashMap hashMap = xm0Var.f51912b;
        int i10 = d1Var.f56955f;
        View view = d1Var.f56951a;
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
                            m8Var.o(2131232094, org.telegram.messenger.hd.M0(2131752067, null), false);
                            return;
                        }
                    }
                    return;
                }
                org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) weVar.f26297e.get(i7);
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                h7Var.setPhotoEntry(gfVar);
                h7Var.b(hashMap.containsKey(Integer.valueOf(gfVar.C)), false);
                h7Var.setTag(Integer.valueOf(i7));
                return;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -1;
                layoutParams.height = xm0Var.R;
                view.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
        q5Var.setItemSize(xm0Var.R);
        org.telegram.ui.Components.l9 imageView = q5Var.getImageView();
        q5Var.setTag(Integer.valueOf(i7));
        imageView.r();
        if (weVar != null) {
            org.telegram.messenger.gf gfVar2 = (org.telegram.messenger.gf) weVar.f26297e.get(i7);
            if (arrayList2.size() > 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            q5Var.d(gfVar2, z9, true, false, false);
            int i13 = gfVar2.C;
            if (xm0Var.f51917e) {
                i11 = arrayList2.indexOf(Integer.valueOf(i13));
            }
            q5Var.b(i11, hashMap.containsKey(Integer.valueOf(i13)), false);
            K1 = PhotoViewer.K1(gfVar2.I);
        } else {
            org.telegram.messenger.kf kfVar = (org.telegram.messenger.kf) xm0Var.f51919f.get(i7);
            q5Var.e(kfVar);
            q5Var.getVideoInfoContainer().setVisibility(4);
            if (xm0Var.f51917e) {
                i11 = arrayList2.indexOf(kfVar.B);
            }
            q5Var.b(i11, hashMap.containsKey(kfVar.B), false);
            K1 = PhotoViewer.K1(kfVar.g());
        }
        imageView.getImageReceiver().O0(!K1, true);
        q5Var.getCheckBox().setVisibility((xm0Var.T != 0 || K1) ? 8 : 8);
    }

    private final void J(v4.d1 d1Var, int i7) {
        int i10;
        PhotoViewer photoViewer = (PhotoViewer) this.f47405e;
        Context context = (Context) this.d;
        org.telegram.ui.Cells.w5 w5Var = (org.telegram.ui.Cells.w5) d1Var.f56951a;
        int L = org.telegram.messenger.g0.L(85.0f);
        if (i7 != 0) {
            i10 = org.telegram.messenger.g0.L(6.0f);
        } else {
            i10 = 0;
        }
        w5Var.f30728f = L;
        org.telegram.ui.Components.wo woVar = w5Var.f30726c;
        org.telegram.ui.Components.l9 l9Var = w5Var.f30724a;
        bi.m5 m5Var = w5Var.f30727e;
        w5Var.h = i10;
        ((FrameLayout.LayoutParams) w5Var.f30725b.getLayoutParams()).rightMargin = i10;
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
            String str2 = gfVar.f26825c;
            if (str2 != null) {
                l9Var.h(str2, null, context.getResources().getDrawable(2131232450));
            } else if (str != null) {
                l9Var.s(gfVar.J, gfVar.K, true);
                if (gfVar.f26824b && !gfVar.d()) {
                    m5Var.setVisibility(0);
                    w5Var.d.setText(org.telegram.messenger.g0.g0(gfVar.E, false, false));
                    l9Var.h("vthumb://" + i11 + ":" + str, null, context.getResources().getDrawable(2131232450));
                } else {
                    l9Var.h("thumb://" + i11 + ":" + str, null, context.getResources().getDrawable(2131232450));
                }
            } else {
                l9Var.setImageResource(2131232450);
            }
            woVar.f40058a.f(-1, true, false);
            woVar.setVisibility(0);
        } else if (obj instanceof org.telegram.messenger.kf) {
            org.telegram.messenger.kf kfVar = (org.telegram.messenger.kf) obj;
            w5Var.setTag(kfVar);
            w5Var.setImage(kfVar);
            m5Var.setVisibility(4);
            woVar.f40058a.f(-1, true, false);
            woVar.setVisibility(0);
        }
    }

    private final void K(v4.d1 d1Var, int i7) {
        boolean z9;
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.f47405e;
        ArrayList arrayList = proxyListActivity.E;
        ArrayList arrayList2 = proxyListActivity.F;
        int i10 = d1Var.f56955f;
        View view = d1Var.f56951a;
        boolean z10 = true;
        switch (i10) {
            case 1:
                org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) view;
                org.telegram.ui.ActionBar.r6.V(w9Var.getTextView(), org.telegram.ui.ActionBar.k6.G6, null);
                if (i7 == ProxyListActivity.f0(proxyListActivity)) {
                    String M0 = org.telegram.messenger.hd.M0(2131754391, null);
                    if (proxyListActivity.D == -1) {
                        z10 = false;
                    }
                    w9Var.b(M0, z10);
                    return;
                } else if (i7 == proxyListActivity.D) {
                    org.telegram.ui.ActionBar.r6.V(w9Var.getTextView(), org.telegram.ui.ActionBar.k6.f28070p7, null);
                    w9Var.b(org.telegram.messenger.hd.M0(2131751581, null), false);
                    return;
                } else {
                    return;
                }
            case 2:
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                if (i7 == proxyListActivity.h) {
                    n4Var.setText(org.telegram.messenger.hd.M0(2131746604, null));
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                if (i7 == ProxyListActivity.g0(proxyListActivity)) {
                    String M02 = org.telegram.messenger.hd.M0(2131743784, null);
                    boolean z11 = proxyListActivity.d;
                    if (proxyListActivity.f41880w == -1) {
                        z10 = false;
                    }
                    r8Var.f(M02, z11, z10);
                    return;
                } else if (i7 == proxyListActivity.f41880w) {
                    r8Var.f(org.telegram.messenger.hd.M0(2131743786, null), org.telegram.messenger.iz.f23366a1, true);
                    return;
                } else {
                    return;
                }
            case 4:
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                if (i7 == proxyListActivity.f41882y) {
                    z8Var.setText(org.telegram.messenger.hd.M0(2131746602, null));
                    return;
                }
                return;
            case 5:
                nx0 nx0Var = (nx0) view;
                org.telegram.messenger.hz hzVar = (org.telegram.messenger.hz) arrayList2.get(i7 - proxyListActivity.f41877n);
                nx0Var.setProxy(hzVar);
                if (org.telegram.messenger.iz.B1 == hzVar) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                nx0Var.setChecked(z9);
                boolean contains = arrayList.contains(arrayList2.get(i7 - proxyListActivity.f41877n));
                nx0Var.h = contains;
                nx0Var.f48162f.a(contains, false);
                nx0Var.a(!arrayList.isEmpty(), false);
                return;
            case 6:
                if (i7 == proxyListActivity.f41881x) {
                    org.telegram.ui.Components.vt0 vt0Var = (org.telegram.ui.Components.vt0) view;
                    ArrayList arrayList3 = new ArrayList(org.telegram.messenger.qt.d);
                    String[] strArr = new String[arrayList3.size()];
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        strArr[i11] = org.telegram.messenger.hd.a0(null, null, 2131746601, arrayList3.get(i11));
                    }
                    vt0Var.setCallback(new go0(5));
                    vt0Var.b(org.telegram.messenger.iz.f23369b1, null, strArr);
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
        boolean e10 = org.telegram.ui.Components.t40.e(xy0.d0((xy0) this.f47405e));
        int i10 = d1Var.f56955f;
        if (i10 == 0) {
            org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) d1Var.f56951a;
            if (i7 == 0) {
                M03 = org.telegram.messenger.hd.M0(2131745989, null);
            } else {
                M03 = org.telegram.messenger.hd.M0(2131745993, null);
            }
            n4Var.setText(M03);
        } else if (i10 == 1) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) d1Var.f56951a;
            if (i7 != 1 && !e10) {
                z9 = false;
            } else {
                z9 = true;
            }
            r8Var.setEnabled(z9);
            if (i7 == 1) {
                r8Var.f(org.telegram.messenger.hd.M0(2131745985, null), e10, false);
                return;
            }
            String M04 = org.telegram.messenger.hd.M0(2131745992, null);
            xi.a aVar = xi.e.f58773i;
            aVar.a();
            r8Var.f(M04, aVar.d, false);
        } else if (i10 == 2) {
            org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) d1Var.f56951a;
            w9Var.setEnabled(e10);
            if (i7 == 2) {
                w9Var.c(org.telegram.messenger.hd.M0(2131745987, null), a8.p0.n(((wi.s0) xi.e.f58770e.a()).f58048a, "p", new StringBuilder()), false, true);
            } else if (i7 == 3) {
                String M05 = org.telegram.messenger.hd.M0(2131745997, null);
                wi.o0 o0Var = (wi.o0) xi.e.f58771f.a();
                if (o0Var == wi.o0.f58024a) {
                    M02 = org.telegram.messenger.hd.M0(2131745996, null);
                } else if (o0Var == wi.o0.f58025b) {
                    M02 = org.telegram.messenger.hd.M0(2131745994, null);
                } else {
                    M02 = org.telegram.messenger.hd.M0(2131745995, null);
                }
                w9Var.c(M05, M02, false, true);
            } else if (i7 == 4) {
                w9Var.c(org.telegram.messenger.hd.M0(2131745990, null), a8.p0.n(((wi.p0) xi.e.f58772g.a()).f58031a, " FPS", new StringBuilder()), false, true);
            } else {
                w9Var.c(org.telegram.messenger.hd.M0(2131745998, null), xy0.f0(xi.e.h.a()), false, false);
            }
        } else {
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) d1Var.f56951a;
            if (i7 == 6) {
                M0 = org.telegram.messenger.hd.M0(2131745988, null);
            } else {
                M0 = org.telegram.messenger.hd.M0(2131745991, null);
            }
            z8Var.setText(M0);
        }
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        switch (this.f47404c) {
            case 0:
                int b10 = d1Var.b();
                if (b10 == 1) {
                    return true;
                }
                if (MediaController.s0(xy0.c0((xy0) this.f47405e)) && b10 == 2) {
                    return true;
                }
                return false;
            case 1:
                int b11 = d1Var.b();
                org.telegram.ui.Components.bn bnVar = (org.telegram.ui.Components.bn) this.f47405e;
                if (b11 != bnVar.f32242u0 && b11 != bnVar.G0 && b11 != bnVar.B0 && b11 != bnVar.F0 && b11 != bnVar.C0 && b11 != bnVar.H0 && b11 != bnVar.D0 && b11 != bnVar.E0 && b11 != bnVar.I0 && b11 != bnVar.J0 && b11 != bnVar.N0.f3393b && b11 != bnVar.M0.f3393b && b11 != bnVar.L0) {
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
                if (d1Var.f56955f == 0) {
                    return true;
                }
                return false;
            case 6:
                return true;
            case 7:
                return true;
            case 8:
                int b12 = d1Var.b();
                DataAutoDownloadActivity dataAutoDownloadActivity = (DataAutoDownloadActivity) this.f47405e;
                if (b12 != DataAutoDownloadActivity.n0(dataAutoDownloadActivity) && b12 != DataAutoDownloadActivity.o0(dataAutoDownloadActivity) && b12 != DataAutoDownloadActivity.g0(dataAutoDownloadActivity) && b12 != DataAutoDownloadActivity.p0(dataAutoDownloadActivity)) {
                    return false;
                }
                return true;
            case 9:
                int b13 = d1Var.b();
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.f47405e;
                if (b13 != dataSettingsActivity.f41213e && b13 != dataSettingsActivity.f41214f && b13 != dataSettingsActivity.h && b13 != dataSettingsActivity.f41217s && b13 != DataSettingsActivity.c0(dataSettingsActivity) && b13 != dataSettingsActivity.f41218w && b13 != DataSettingsActivity.d0(dataSettingsActivity) && b13 != DataSettingsActivity.e0(dataSettingsActivity) && b13 != dataSettingsActivity.E && b13 != dataSettingsActivity.D && b13 != dataSettingsActivity.F && b13 != dataSettingsActivity.G && b13 != dataSettingsActivity.K && b13 != dataSettingsActivity.J && b13 != dataSettingsActivity.f41215n && b13 != DataSettingsActivity.h0(dataSettingsActivity) && b13 != DataSettingsActivity.f0(dataSettingsActivity) && b13 != DataSettingsActivity.j0(dataSettingsActivity) && b13 != DataSettingsActivity.b0(dataSettingsActivity)) {
                    return false;
                }
                return true;
            case 10:
                int b14 = d1Var.b();
                ee0 ee0Var = (ee0) this.f47405e;
                if (b14 != ee0Var.f45327c && b14 != ee0Var.d && b14 != ee0Var.f45328e && b14 != ee0Var.f45329f && b14 != ee0Var.h && b14 != ee0Var.f45331r) {
                    return false;
                }
                return true;
            case 11:
                int b15 = d1Var.b();
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.f47405e;
                if (b15 != notificationsSettingsActivity.f41320y && b15 != notificationsSettingsActivity.D && b15 != notificationsSettingsActivity.E && b15 != notificationsSettingsActivity.K && b15 != notificationsSettingsActivity.M && b15 != notificationsSettingsActivity.S && b15 != notificationsSettingsActivity.N && b15 != notificationsSettingsActivity.L && b15 != notificationsSettingsActivity.R && b15 != notificationsSettingsActivity.F && b15 != notificationsSettingsActivity.G && b15 != notificationsSettingsActivity.O && b15 != notificationsSettingsActivity.f41316r && b15 != notificationsSettingsActivity.f41317s && b15 != notificationsSettingsActivity.T && b15 != notificationsSettingsActivity.J) {
                    return true;
                }
                return false;
            case 12:
                int b16 = d1Var.b();
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f47405e;
                if (b16 != PasscodeActivity.c0(passcodeActivity) && b16 != PasscodeActivity.d0(passcodeActivity) && b16 != passcodeActivity.N && b16 != PasscodeActivity.e0(passcodeActivity) && b16 != PasscodeActivity.f0(passcodeActivity) && b16 != passcodeActivity.J && b16 != passcodeActivity.K) {
                    return false;
                }
                return true;
            case 13:
                return true;
            case 14:
                xm0 xm0Var = (xm0) this.f47405e;
                if (xm0Var.J == null && (!TextUtils.isEmpty(xm0Var.f51939w) ? d1Var.b() >= xm0Var.f51919f.size() : d1Var.f56955f != 3)) {
                    return false;
                }
                return true;
            case 15:
                return false;
            case 16:
                int b17 = d1Var.b();
                ProxyListActivity proxyListActivity = (ProxyListActivity) this.f47405e;
                if (b17 != ProxyListActivity.g0(proxyListActivity) && b17 != proxyListActivity.f41880w && b17 != ProxyListActivity.f0(proxyListActivity) && b17 != proxyListActivity.D && (b17 < proxyListActivity.f41877n || b17 >= proxyListActivity.f41878r)) {
                    return false;
                }
                return true;
            case 17:
                int b18 = d1Var.b();
                if (b18 == 1) {
                    return true;
                }
                if (org.telegram.ui.Components.t40.e(xy0.b0((xy0) this.f47405e)) && (b18 == 2 || b18 == 3 || b18 == 4 || b18 == 5 || b18 == 8)) {
                    return true;
                }
                return false;
            case 18:
                if (d1Var.f56955f != 1) {
                    return true;
                }
                return false;
            default:
                if (p1.g.d(3)[d1Var.f56955f] == 1) {
                    return true;
                }
                return false;
        }
    }

    public void E() {
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.f47405e;
        int size = proxyListActivity.E.size();
        boolean s5 = ProxyListActivity.b0(proxyListActivity).s();
        if (size > 0) {
            ProxyListActivity.c0(proxyListActivity).x(size, s5);
            if (!s5) {
                ProxyListActivity.d0(proxyListActivity).B();
                int i7 = proxyListActivity.f41877n;
                n(i7, proxyListActivity.f41878r - i7, 2);
            }
        } else if (s5) {
            ProxyListActivity.e0(proxyListActivity).r();
            int i10 = proxyListActivity.f41877n;
            n(i10, proxyListActivity.f41878r - i10, 2);
        }
    }

    public void F() {
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.f47405e;
        proxyListActivity.E.clear();
        int i7 = proxyListActivity.f41877n;
        n(i7, proxyListActivity.f41878r - i7, 1);
        E();
    }

    public void M(int i7) {
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.f47405e;
        ArrayList arrayList = proxyListActivity.E;
        int i10 = proxyListActivity.f41877n;
        if (i7 >= i10 && i7 < proxyListActivity.f41878r) {
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
        switch (this.f47404c) {
            case 0:
                return 4;
            case 1:
                return ((org.telegram.ui.Components.bn) this.f47405e).Q0;
            case 2:
                return ((org.telegram.ui.Components.ez) this.f47405e).h.size();
            case 3:
                int size = ((org.telegram.ui.Components.fz) this.f47405e).f33698r1.size();
                if (size < 10) {
                    return size + 1;
                }
                return size;
            case 4:
                return ((org.telegram.ui.Components.sd0) this.f47405e).F;
            case 5:
                return org.telegram.messenger.sd.g() + 1;
            case 6:
                ArrayList arrayList = ((org.telegram.ui.Components.ow0) this.d).f36700x;
                if (arrayList == null) {
                    return 0;
                }
                return arrayList.size();
            case 7:
                return ((org.telegram.ui.Components.u61) this.f47405e).h.size();
            case 8:
                return ((DataAutoDownloadActivity) this.f47405e).f41209y;
            case 9:
                return ((DataSettingsActivity) this.f47405e).T;
            case 10:
                return ((ee0) this.f47405e).f45333w;
            case 11:
                return ((NotificationsSettingsActivity) this.f47405e).U;
            case 12:
                return ((PasscodeActivity) this.f47405e).P;
            case 13:
                mm0 mm0Var = (mm0) this.f47405e;
                ArrayList arrayList2 = mm0Var.d;
                if (arrayList2 != null) {
                    return (int) Math.ceil(arrayList2.size() / mm0Var.f47838f);
                }
                return 0;
            case 14:
                xm0 xm0Var = (xm0) this.f47405e;
                org.telegram.messenger.we weVar = xm0Var.J;
                if (weVar == null) {
                    if (xm0Var.f51919f.isEmpty()) {
                        if (!TextUtils.isEmpty(xm0Var.f51939w) || xm0Var.f51927n.isEmpty()) {
                            return 0;
                        }
                        return xm0Var.f51927n.size() + 2;
                    }
                    return xm0Var.f51919f.size() + (!xm0Var.f51934s ? 1 : 0);
                }
                return weVar.f26297e.size();
            case 15:
                PhotoViewer photoViewer = (PhotoViewer) this.f47405e;
                uq0 uq0Var = photoViewer.d;
                if (uq0Var != null && uq0Var.c() != null) {
                    return photoViewer.d.c().size();
                }
                return 0;
            case 16:
                return ((ProxyListActivity) this.f47405e).f41875e;
            case 17:
                return 7;
            case 18:
                return ((ArrayList) this.f47405e).size();
            default:
                return ((pg.j) this.f47405e).E.size();
        }
    }

    @Override
    public long c(int i7) {
        int i10;
        switch (this.f47404c) {
            case 2:
                i10 = ((org.telegram.ui.Components.ez) this.f47405e).f33392k0.get(i7);
                break;
            case 4:
                return i7;
            case 6:
                ArrayList arrayList = ((org.telegram.ui.Components.ow0) this.d).f36700x;
                if (arrayList == null) {
                    return 0L;
                }
                return ((org.telegram.messenger.qi) arrayList.get(i7)).f24698a.hashCode();
            case 7:
                i10 = ((org.telegram.ui.Components.r61) ((org.telegram.ui.Components.u61) this.f47405e).h.get(i7)).f37511a;
                break;
            case 14:
                return i7;
            case 16:
                ProxyListActivity proxyListActivity = (ProxyListActivity) this.f47405e;
                if (i7 == proxyListActivity.f41876f) {
                    return -1L;
                }
                if (i7 == proxyListActivity.f41879s) {
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
                if (i7 == proxyListActivity.f41880w) {
                    return -9L;
                }
                if (i7 == proxyListActivity.f41881x) {
                    return -10L;
                }
                if (i7 == proxyListActivity.f41882y) {
                    return -11L;
                }
                int i11 = proxyListActivity.f41877n;
                if (i7 >= i11 && i7 < proxyListActivity.f41878r) {
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
        switch (this.f47404c) {
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
                org.telegram.ui.Components.bn bnVar = (org.telegram.ui.Components.bn) this.f47405e;
                if (i7 != bnVar.B0 && i7 != bnVar.F0 && i7 != bnVar.G0 && i7 != bnVar.C0 && i7 != bnVar.D0 && i7 != bnVar.E0 && i7 != bnVar.H0 && i7 != bnVar.M0.f3393b && i7 != bnVar.N0.f3393b) {
                    if (i7 != bnVar.f32227l0 && i7 != bnVar.f32240s0 && i7 != bnVar.f32245w0 && i7 != bnVar.f32231o0) {
                        if (i7 == bnVar.f32238r0) {
                            return 1;
                        }
                        if (i7 != bnVar.f32243v0 && i7 != bnVar.f32247x0 && i7 != bnVar.f32235q0 && i7 != bnVar.K0) {
                            if (i7 != bnVar.f32242u0 && i7 != bnVar.I0 && i7 != bnVar.L0) {
                                if (i7 == bnVar.m0) {
                                    return 4;
                                }
                                if (i7 == bnVar.f32230n0) {
                                    return 11;
                                }
                                if (i7 == bnVar.f32233p0) {
                                    return 7;
                                }
                                if (i7 != bnVar.f32249y0 && i7 != bnVar.f32250z0 && i7 != bnVar.J0) {
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
                org.telegram.ui.Components.sd0 sd0Var = (org.telegram.ui.Components.sd0) this.f47405e;
                if (i7 != sd0Var.D && i7 != sd0Var.E) {
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
                DataAutoDownloadActivity dataAutoDownloadActivity = (DataAutoDownloadActivity) this.f47405e;
                if (i7 == DataAutoDownloadActivity.c0(dataAutoDownloadActivity)) {
                    return 0;
                }
                if (i7 == dataAutoDownloadActivity.f41206s) {
                    return 1;
                }
                if (i7 != dataAutoDownloadActivity.f41205r && i7 != dataAutoDownloadActivity.f41207w) {
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
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.f47405e;
                if (i7 != dataSettingsActivity.f41216r && i7 != dataSettingsActivity.f41219x && i7 != dataSettingsActivity.N && i7 != dataSettingsActivity.P && i7 != dataSettingsActivity.L && i7 != dataSettingsActivity.Q && i7 != dataSettingsActivity.S) {
                    if (i7 != dataSettingsActivity.d && i7 != dataSettingsActivity.f41220y && i7 != dataSettingsActivity.M && i7 != 0 && i7 != dataSettingsActivity.O && i7 != dataSettingsActivity.I && i7 != dataSettingsActivity.R) {
                        if (i7 != dataSettingsActivity.E && i7 != dataSettingsActivity.D && i7 != dataSettingsActivity.F && i7 != dataSettingsActivity.G && i7 != dataSettingsActivity.J && i7 != dataSettingsActivity.K) {
                            if (i7 == dataSettingsActivity.H) {
                                return 4;
                            }
                            if (i7 != dataSettingsActivity.f41213e && i7 != dataSettingsActivity.h && i7 != dataSettingsActivity.f41214f && i7 != DataSettingsActivity.h0(dataSettingsActivity) && i7 != DataSettingsActivity.f0(dataSettingsActivity) && i7 != DataSettingsActivity.j0(dataSettingsActivity)) {
                                if (i7 != dataSettingsActivity.f41217s && i7 != dataSettingsActivity.f41218w && i7 != dataSettingsActivity.f41215n) {
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
                ee0 ee0Var = (ee0) this.f47405e;
                ee0Var.getClass();
                if (i7 == 0) {
                    return 0;
                }
                if (i7 != ee0Var.f45327c && i7 != ee0Var.d && i7 != ee0Var.f45328e && i7 != ee0Var.f45329f && i7 != ee0Var.h) {
                    if (i7 == ee0Var.f45330n) {
                        return 2;
                    }
                    if (i7 == ee0Var.f45331r) {
                        return 3;
                    }
                    return 4;
                }
                return 1;
            case 11:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.f47405e;
                if (i7 != notificationsSettingsActivity.K && i7 != notificationsSettingsActivity.M && i7 != notificationsSettingsActivity.S && i7 != notificationsSettingsActivity.G && i7 != notificationsSettingsActivity.N && i7 != notificationsSettingsActivity.E && i7 != notificationsSettingsActivity.f41320y && i7 != notificationsSettingsActivity.f41316r) {
                    i10 = notificationsSettingsActivity.inappSoundRow;
                    if (i7 != i10) {
                        i11 = notificationsSettingsActivity.inappVibrateRow;
                        if (i7 != i11 && i7 != notificationsSettingsActivity.f41319x) {
                            i12 = notificationsSettingsActivity.inappPreviewRow;
                            if (i7 != i12) {
                                i13 = notificationsSettingsActivity.contactJoinedRow;
                                if (i7 != i13) {
                                    i14 = notificationsSettingsActivity.pinnedMessageRow;
                                    if (i7 != i14 && i7 != notificationsSettingsActivity.f41318w) {
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
                                                                                            if (i7 == notificationsSettingsActivity.f41317s) {
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
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f47405e;
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
                xm0 xm0Var = (xm0) this.f47405e;
                if (xm0Var.Y) {
                    return 2;
                }
                if (xm0Var.J == null) {
                    if (xm0Var.f51919f.isEmpty()) {
                        if (i7 == xm0Var.f51927n.size()) {
                            return 4;
                        }
                        return 3;
                    } else if (i7 >= xm0Var.f51919f.size()) {
                        return 1;
                    }
                }
                return 0;
            case 15:
                return 0;
            case 16:
                ProxyListActivity proxyListActivity = (ProxyListActivity) this.f47405e;
                if (i7 != proxyListActivity.f41876f && i7 != proxyListActivity.f41879s) {
                    if (i7 != ProxyListActivity.f0(proxyListActivity) && i7 != proxyListActivity.D) {
                        if (i7 != ProxyListActivity.g0(proxyListActivity) && i7 != proxyListActivity.f41880w) {
                            if (i7 == proxyListActivity.h) {
                                return 2;
                            }
                            if (i7 == proxyListActivity.f41881x) {
                                return 6;
                            }
                            if (i7 >= proxyListActivity.f41877n && i7 < proxyListActivity.f41878r) {
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
                if (i7 == ((ArrayList) this.f47405e).size()) {
                    return 1;
                }
                return 0;
            case 19:
                return p1.g.c(((pg.a) ((pg.j) this.f47405e).E.get(i7)).f53505b);
        }
    }

    @Override
    public final void t(v4.d1 r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l4.t(v4.d1, int):void");
    }

    @Override
    public void v(v4.d1 d1Var, int i7, List list) {
        boolean contains;
        switch (this.f47404c) {
            case 16:
                ProxyListActivity proxyListActivity = (ProxyListActivity) this.f47405e;
                ArrayList arrayList = proxyListActivity.E;
                int i10 = d1Var.f56955f;
                View view = d1Var.f56951a;
                if (i10 == 5 && !list.isEmpty()) {
                    nx0 nx0Var = (nx0) view;
                    if (list.contains(1) && (contains = arrayList.contains(proxyListActivity.F.get(i7 - proxyListActivity.f41877n))) != nx0Var.h) {
                        nx0Var.h = contains;
                        nx0Var.f48162f.a(contains, true);
                    }
                    if (list.contains(2)) {
                        nx0Var.a(!arrayList.isEmpty(), true);
                        return;
                    }
                    return;
                } else if (d1Var.f56955f == 3 && list.contains(0)) {
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    if (i7 == ProxyListActivity.g0(proxyListActivity)) {
                        r8Var.setChecked(proxyListActivity.d);
                        return;
                    } else if (i7 == proxyListActivity.f41880w) {
                        r8Var.setChecked(org.telegram.messenger.iz.f23366a1);
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
        org.telegram.ui.Components.vt0 vt0Var;
        View y6Var;
        org.telegram.ui.Cells.y8 y8Var;
        View n4Var2;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        org.telegram.ui.ActionBar.f6 f6Var4;
        org.telegram.ui.ActionBar.f6 f6Var5;
        View r8Var;
        org.telegram.ui.Cells.m8 m8Var;
        View y6Var2;
        org.telegram.ui.Cells.w9 w9Var;
        View t4Var;
        FrameLayout frameLayout2;
        int i10 = this.f47404c;
        int i11 = 8;
        Object obj = this.f47405e;
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
                boolean z9 = bnVar.f32229n;
                org.telegram.ui.ActionBar.f6 f6Var6 = bnVar.f38968a;
                switch (i7) {
                    case 0:
                        n4Var = new org.telegram.ui.Cells.n4((Context) obj2, org.telegram.ui.ActionBar.k6.L6, 21, 15, false, bnVar.f38968a);
                        break;
                    case 1:
                        View y6Var3 = new org.telegram.ui.Cells.y6(context2, (org.telegram.ui.Cells.f1) null);
                        new org.telegram.ui.Components.xp(new ColorDrawable(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27793a7, f6Var6)), org.telegram.ui.ActionBar.k6.Y0(context2, 2131231229, org.telegram.ui.ActionBar.k6.f27813b7)).f40340x = true;
                        view = y6Var3;
                        n4Var = view;
                        break;
                    case 2:
                        n4Var = new org.telegram.ui.Cells.z8(context2, f6Var6);
                        break;
                    case 3:
                        n4Var = new org.telegram.ui.Cells.m8(context2, f6Var6);
                        break;
                    case 4:
                    case 11:
                        org.telegram.ui.Components.wm wmVar = new org.telegram.ui.Components.wm(this, (Context) obj2, bnVar.I ? 1 : 0, bnVar.f38968a, i7);
                        if (i7 == 11 && !z9) {
                            wmVar.setTextRight(98);
                            wmVar.a().setOnClickListener(new View.OnClickListener(this) {
                                public final org.telegram.ui.l4 f38675b;

                                {
                                    this.f38675b = this;
                                }

                                @Override
                                public final void onClick(View view2) {
                                    switch (r2) {
                                        case 0:
                                            bn.S((bn) this.f38675b.f47405e, -2);
                                            return;
                                        case 1:
                                            bn.S((bn) this.f38675b.f47405e, -3);
                                            return;
                                        default:
                                            ((bn) this.f38675b.f47405e).c0(view2, (org.telegram.ui.Cells.a6) view2.getParent(), true);
                                            return;
                                    }
                                }
                            });
                        }
                        wmVar.c();
                        wmVar.setIconsColor(org.telegram.ui.ActionBar.k6.f28050o7);
                        wmVar.b(new org.telegram.ui.Components.xm(this, wmVar, i7));
                        n4Var = wmVar;
                        break;
                    case 5:
                    default:
                        org.telegram.ui.Components.zm zmVar = new org.telegram.ui.Components.zm(this, (Context) obj2, bnVar.I ? 1 : 0, new View.OnClickListener(this) {
                            public final org.telegram.ui.l4 f38675b;

                            {
                                this.f38675b = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (r2) {
                                    case 0:
                                        bn.S((bn) this.f38675b.f47405e, -2);
                                        return;
                                    case 1:
                                        bn.S((bn) this.f38675b.f47405e, -3);
                                        return;
                                    default:
                                        ((bn) this.f38675b.f47405e).c0(view2, (org.telegram.ui.Cells.a6) view2.getParent(), true);
                                        return;
                                }
                            }
                        }, bnVar.f38968a);
                        if (!z9) {
                            zmVar.setTextRight(140);
                            zmVar.a().setOnClickListener(new org.telegram.ui.Components.lk(1, this, zmVar));
                        }
                        int i12 = org.telegram.ui.ActionBar.k6.f28050o7;
                        zmVar.setIconsColor(i12);
                        org.telegram.ui.Components.wo woVar = zmVar.f28891r;
                        if (woVar != null) {
                            woVar.getCheckBoxBase().i(org.telegram.messenger.g0.L(6.0f));
                            CheckBoxBase checkBoxBase = woVar.getCheckBoxBase();
                            float f10 = zmVar.f28885a.f55394e;
                            if (checkBoxBase.f31264w != f10) {
                                checkBoxBase.f31264w = f10;
                                checkBoxBase.b();
                            }
                        }
                        zmVar.getCheckBox().b(-1, i12, org.telegram.ui.ActionBar.k6.f27979k7);
                        zmVar.b(new fi.h7(4, this, zmVar));
                        zmVar.setShowNextButton(true);
                        EditTextBoldCursor textView = zmVar.getTextView();
                        textView.setImeOptions(textView.getImeOptions() | 5);
                        textView.setOnEditorActionListener(new nd(2, this, zmVar));
                        textView.setOnKeyListener(new org.telegram.ui.Components.vm(zmVar, 0));
                        n4Var = zmVar;
                        break;
                    case 6:
                        n4Var = new org.telegram.ui.Cells.r8(context2, f6Var6);
                        break;
                    case 7:
                        org.telegram.ui.Components.ym ymVar = new org.telegram.ui.Components.ym(this, context2, bnVar.I ? 1 : 0);
                        ymVar.c();
                        if (!z9) {
                            ymVar.setTextRight(98);
                            ymVar.a().setOnClickListener(new View.OnClickListener(this) {
                                public final org.telegram.ui.l4 f38675b;

                                {
                                    this.f38675b = this;
                                }

                                @Override
                                public final void onClick(View view2) {
                                    switch (r2) {
                                        case 0:
                                            bn.S((bn) this.f38675b.f47405e, -2);
                                            return;
                                        case 1:
                                            bn.S((bn) this.f38675b.f47405e, -3);
                                            return;
                                        default:
                                            ((bn) this.f38675b.f47405e).c0(view2, (org.telegram.ui.Cells.a6) view2.getParent(), true);
                                            return;
                                    }
                                }
                            });
                        }
                        ymVar.setIconsColor(org.telegram.ui.ActionBar.k6.f28050o7);
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
                        org.telegram.ui.Cells.x5 x5Var = new org.telegram.ui.Cells.x5(context2, f6Var6);
                        x5Var.getCheckBox().setIcon(2131232513);
                        n4Var = x5Var;
                        break;
                }
                return jg.g.r(n4Var, n4Var, -1, -2);
            case 2:
                return new v4.d1(new org.telegram.ui.Components.cz((org.telegram.ui.Components.ez) obj, (Context) obj2));
            case 3:
                org.telegram.ui.ActionBar.o2 o2Var = new org.telegram.ui.ActionBar.o2(0, (Context) obj2, null);
                o2Var.setBackground(null);
                o2Var.setLayoutParams(new v4.o0(-1, -2));
                return new v4.d1(o2Var);
            case 4:
                Context context3 = (Context) obj2;
                if (i7 == 0) {
                    org.telegram.ui.ActionBar.f6 f6Var7 = ((org.telegram.ui.Components.sd0) obj).I0;
                    ?? frameLayout3 = new FrameLayout(context3);
                    frameLayout3.f30263e = new m.f3((Object) frameLayout3, 20);
                    TextView textView2 = new TextView(context3);
                    frameLayout3.f30260a = textView2;
                    textView2.setGravity(5);
                    textView2.setTextColor(-1);
                    textView2.setTextSize(1, 12.0f);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    frameLayout3.addView(textView2, c8.ha.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
                    TextView textView3 = new TextView(context3);
                    frameLayout3.f30261b = textView3;
                    org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.f28040ng, f6Var7);
                    textView3.setTextSize(1, 12.0f);
                    textView3.setGravity(5);
                    textView3.setSingleLine(true);
                    frameLayout3.addView(textView3, c8.ha.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
                    ?? view2 = new View(context3);
                    Paint paint = new Paint();
                    view2.f34286a = paint;
                    Paint paint2 = new Paint(1);
                    view2.f34287b = paint2;
                    view2.f34288c = org.telegram.messenger.g0.L(16.0f);
                    view2.d = 0;
                    view2.f34289e = 0.0f;
                    view2.f34290f = false;
                    paint.setColor(-11711155);
                    paint2.setColor(-1);
                    frameLayout3.f30262c = view2;
                    frameLayout3.addView(view2, c8.ha.d(-1, 40.0f, 19, 96.0f, 0.0f, 24.0f, 0.0f));
                    frameLayout3.setSeekBarDelegate(new org.telegram.ui.Components.ax(this, 11));
                    r5Var = frameLayout3;
                } else {
                    org.telegram.ui.Cells.r5 r5Var2 = new org.telegram.ui.Cells.r5(context3);
                    r5Var2.setOnClickListener(new org.telegram.ui.Components.la0(this, 3));
                    r5Var = r5Var2;
                }
                return new v4.d1(r5Var);
            case 5:
                Context context4 = (Context) obj2;
                org.telegram.ui.Components.at0 at0Var = (org.telegram.ui.Components.at0) obj;
                if (i7 != 0) {
                    FrameLayout a4Var = new di.a4(context4, 19);
                    a4Var.setWillNotDraw(false);
                    at0Var.l1 = new TextView(context4);
                    org.telegram.ui.ActionBar.r6.V(at0Var.l1, org.telegram.ui.ActionBar.k6.J5, at0Var.I0);
                    at0Var.l1.setTextSize(1, 14.0f);
                    at0Var.l1.setGravity(17);
                    at0Var.l1.setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
                    a4Var.addView(at0Var.l1, c8.ha.c(40.0f, -1));
                    frameLayout = a4Var;
                } else {
                    frameLayout = new org.telegram.ui.Cells.r7(54, context4, at0Var.I0, false);
                }
                return new v4.d1(frameLayout);
            case 6:
                return new v4.d1(new org.telegram.ui.Components.nw0((org.telegram.ui.Components.ow0) obj, ((org.telegram.ui.Components.ow0) obj2).getContext()));
            case 7:
                return new v4.d1(new org.telegram.ui.Components.s61((org.telegram.ui.Components.u61) obj, (Context) obj2));
            case 8:
                Context context5 = (Context) obj2;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                if (i7 != 4) {
                                    vt0Var = new org.telegram.ui.Cells.z8(context5);
                                } else {
                                    vt0Var = new org.telegram.ui.Cells.h5(context5);
                                }
                            } else {
                                org.telegram.ui.Components.vt0 vt0Var2 = new org.telegram.ui.Components.vt0(context5, null);
                                vt0Var2.setCallback(new wr(this, 3));
                                vt0Var = vt0Var2;
                            }
                        } else {
                            vt0Var = new org.telegram.ui.Cells.n4(context5);
                        }
                    } else {
                        vt0Var = new org.telegram.ui.Cells.y6(context5, (org.telegram.ui.Cells.f1) null);
                    }
                } else {
                    org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(context5);
                    r8Var2.d(org.telegram.ui.ActionBar.k6.f27904g6, org.telegram.ui.ActionBar.k6.O6, org.telegram.ui.ActionBar.k6.P6, org.telegram.ui.ActionBar.k6.Q6, org.telegram.ui.ActionBar.k6.R6);
                    r8Var2.setTypeface(org.telegram.messenger.g0.o());
                    r8Var2.setHeight(56);
                    vt0Var = r8Var2;
                }
                return jg.g.r(vt0Var, vt0Var, -1, -2);
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
                                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27849d6, w9Var3, null);
                                y8Var = w9Var3;
                            }
                        } else {
                            y8Var = new org.telegram.ui.Cells.y6(context7, (org.telegram.ui.Cells.f1) null);
                        }
                    } else {
                        org.telegram.ui.Cells.y8 y8Var2 = new org.telegram.ui.Cells.y8(context7);
                        y8Var2.setMultilineDetail(true);
                        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27849d6, y8Var2, null);
                        y8Var = y8Var2;
                    }
                } else {
                    View n4Var3 = new org.telegram.ui.Cells.n4(context7);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27849d6, n4Var3, null);
                    y8Var = n4Var3;
                }
                return jg.g.r(y8Var, y8Var, -1, -2);
            case 11:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                Context context8 = (Context) obj2;
                if (i7 == 0) {
                    f6Var = ((org.telegram.ui.ActionBar.f2) notificationsSettingsActivity).resourceProvider;
                    n4Var2 = new org.telegram.ui.Cells.n4(context8, f6Var);
                } else if (i7 == 1) {
                    f6Var2 = ((org.telegram.ui.ActionBar.f2) notificationsSettingsActivity).resourceProvider;
                    n4Var2 = new org.telegram.ui.Cells.r8(context8, f6Var2);
                } else if (i7 != 2) {
                    if (i7 == 3) {
                        f6Var3 = ((org.telegram.ui.ActionBar.f2) notificationsSettingsActivity).resourceProvider;
                        n4Var2 = new org.telegram.ui.Cells.h5((Context) obj2, 21, 64, true, f6Var3);
                    } else if (i7 != 4) {
                        if (i7 != 5) {
                            f6Var5 = ((org.telegram.ui.ActionBar.f2) notificationsSettingsActivity).resourceProvider;
                            n4Var2 = new org.telegram.ui.Cells.z8(context8, f6Var5);
                        } else {
                            f6Var4 = ((org.telegram.ui.ActionBar.f2) notificationsSettingsActivity).resourceProvider;
                            n4Var2 = new org.telegram.ui.Cells.w9(0, context8, f6Var4);
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
                                r8Var = new ji0(context9);
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
                frameLayout4.f30637e = new Paint();
                frameLayout4.f30635b = new org.telegram.messenger.we[4];
                frameLayout4.f30634a = new org.telegram.ui.Cells.t5[4];
                for (int i13 = 0; i13 < 4; i13++) {
                    frameLayout4.f30634a[i13] = new org.telegram.ui.Cells.t5((org.telegram.ui.Cells.v5) frameLayout4, context10);
                    frameLayout4.addView(frameLayout4.f30634a[i13]);
                    frameLayout4.f30634a[i13].setVisibility(4);
                    frameLayout4.f30634a[i13].setTag(Integer.valueOf(i13));
                    frameLayout4.f30634a[i13].setOnClickListener(new org.telegram.ui.Cells.a(frameLayout4, 9));
                }
                frameLayout4.setDelegate(new li0(this, 1));
                return new v4.d1(frameLayout4);
            case 14:
                xm0 xm0Var = (xm0) obj;
                boolean z10 = xm0Var.f51933r0;
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
                                    org.telegram.ui.ActionBar.r6.Y(m8Var2.f29564a, xm0Var.f51938v0, null);
                                    org.telegram.ui.ActionBar.r6.t(m8Var2.f29567e, org.telegram.ui.ActionBar.k6.f27895fh, null, PorterDuff.Mode.MULTIPLY);
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
                    q5Var.setDelegate(new vm0(this));
                    FrameLayout checkFrame = q5Var.getCheckFrame();
                    if (xm0Var.T == 0) {
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
                frameLayout6.f30724a = l9Var;
                l9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
                frameLayout6.addView(l9Var, c8.ha.c(-1.0f, -1));
                FrameLayout frameLayout7 = new FrameLayout(context12);
                frameLayout6.f30725b = frameLayout7;
                frameLayout6.addView(frameLayout7, c8.ha.e(42, 42, 53));
                bi.m5 m5Var = new bi.m5(context12);
                m5Var.d = new Path();
                m5Var.f4328e = new float[8];
                m5Var.f4326b = new RectF();
                m5Var.f4327c = new Paint(1);
                frameLayout6.f30727e = m5Var;
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
                frameLayout6.f30726c = woVar2;
                woVar2.setDrawBackgroundAsArc(11);
                woVar2.b(org.telegram.ui.ActionBar.k6.W9, org.telegram.ui.ActionBar.k6.X9, org.telegram.ui.ActionBar.k6.V9);
                frameLayout6.addView(woVar2, c8.ha.d(26, 26.0f, 51, 55.0f, 4.0f, 0.0f, 0.0f));
                woVar2.setVisibility(0);
                frameLayout6.setFocusable(true);
                frameLayout7.setOnClickListener(new g40(this, 21));
                return new v4.d1(frameLayout6);
            case 16:
                Context context13 = (Context) obj2;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                if (i7 != 4) {
                                    if (i7 != 6) {
                                        y6Var2 = new nx0((ProxyListActivity) obj, context13);
                                        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27849d6, y6Var2, null);
                                    } else {
                                        y6Var2 = new org.telegram.ui.Components.vt0(context13, null);
                                        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27849d6, y6Var2, null);
                                    }
                                } else {
                                    y6Var2 = new org.telegram.ui.Cells.z8(context13);
                                }
                            } else {
                                y6Var2 = new org.telegram.ui.Cells.r8(context13);
                                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27849d6, y6Var2, null);
                            }
                        } else {
                            y6Var2 = new org.telegram.ui.Cells.n4(context13);
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27849d6, y6Var2, null);
                        }
                    } else {
                        y6Var2 = new org.telegram.ui.Cells.w9(context13);
                        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27849d6, y6Var2, null);
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
                        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context16);
                        frameLayout8.f53524a = mm0Var;
                        mm0Var.setReportChanges(true);
                        mm0Var.setDelegate(new org.telegram.ui.Components.uy((Object) frameLayout8, 8));
                        mm0Var.setImportantForAccessibility(2);
                        frameLayout8.addView(mm0Var, c8.ha.d(-1, 38.0f, 83, 5.0f, 29.0f, 47.0f, 0.0f));
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
        int i11 = this.f47404c;
        Object obj = this.f47405e;
        switch (i11) {
            case 1:
                org.telegram.ui.Components.bn bnVar = (org.telegram.ui.Components.bn) obj;
                sh.d dVar = bnVar.f32228m1;
                boolean z9 = bnVar.f32229n;
                int i12 = d1Var.f56955f;
                View view = d1Var.f56951a;
                CharSequence charSequence = "";
                if (i12 == 4) {
                    org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view;
                    a6Var.setTag(1);
                    CharSequence charSequence2 = bnVar.N;
                    if (charSequence2 != null) {
                        charSequence = charSequence2;
                    }
                    if (z9) {
                        i10 = 2131744054;
                    } else {
                        i10 = 2131746447;
                    }
                    a6Var.n(charSequence, org.telegram.messenger.hd.M0(i10, null), true);
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
                    a6Var2.n(charSequence, org.telegram.messenger.hd.M0(2131746448, null), false);
                    a6Var2.setTag(null);
                    a6Var2.f28888e.b(dVar.b(-2), false);
                    org.telegram.ui.Components.bn.P(bnVar, view, d1Var.b());
                    return;
                } else if (i12 == 5) {
                    int b10 = d1Var.b();
                    org.telegram.ui.Cells.a6 a6Var3 = (org.telegram.ui.Cells.a6) view;
                    a6Var3.setTag(1);
                    a6Var3.f28885a.a(bnVar.f32207b0, false);
                    int i13 = b10 - bnVar.f32241t0;
                    CharSequence charSequence4 = bnVar.K[i13];
                    if (z9) {
                        i7 = 2131744056;
                    } else {
                        i7 = 2131747773;
                    }
                    a6Var3.n(charSequence4, org.telegram.messenger.hd.M0(i7, null), true);
                    a6Var3.setTag(null);
                    if (bnVar.f32225k0 == b10) {
                        EditTextBoldCursor textView = a6Var3.getTextView();
                        textView.requestFocus();
                        org.telegram.messenger.g0.K3(textView);
                        bnVar.f32225k0 = -1;
                    }
                    if (!z9) {
                        a6Var3.f28888e.b(dVar.b(i13), false);
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
                    a6Var4.n(charSequence, org.telegram.messenger.hd.M0(2131754474, null), false);
                    a6Var4.setTag(null);
                    if (!z9) {
                        a6Var4.f28888e.b(dVar.b(-3), false);
                    }
                    org.telegram.ui.Components.bn.P(bnVar, view, d1Var.b());
                    return;
                } else {
                    return;
                }
            case 9:
                if (d1Var.f56955f == 3) {
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) d1Var.f56951a;
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
                        int i14 = org.telegram.messenger.iz.f23364a;
                        r8Var.setChecked(org.telegram.messenger.rc.e(2048));
                        return;
                    } else if (b11 == dataSettingsActivity.K) {
                        int i15 = org.telegram.messenger.iz.f23364a;
                        r8Var.setChecked(org.telegram.messenger.rc.e(1024));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 16:
                ProxyListActivity proxyListActivity = (ProxyListActivity) obj;
                if (d1Var.f56955f == 3) {
                    org.telegram.ui.Cells.r8 r8Var2 = (org.telegram.ui.Cells.r8) d1Var.f56951a;
                    int b12 = d1Var.b();
                    if (b12 == ProxyListActivity.g0(proxyListActivity)) {
                        r8Var2.setChecked(proxyListActivity.d);
                        return;
                    } else if (b12 == proxyListActivity.f41880w) {
                        r8Var2.setChecked(org.telegram.messenger.iz.f23366a1);
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
        switch (this.f47404c) {
            case 1:
                org.telegram.ui.Components.bn bnVar = (org.telegram.ui.Components.bn) this.f47405e;
                int i7 = d1Var.f56955f;
                if (i7 == 4 || i7 == 11 || i7 == 5) {
                    EditTextBoldCursor textView = ((org.telegram.ui.Cells.a6) d1Var.f56951a).getTextView();
                    if (textView.isFocused()) {
                        if (bnVar.I) {
                            org.telegram.ui.Components.sm smVar = bnVar.f32248y;
                            if (smVar != null) {
                                smVar.f();
                            }
                            bnVar.e0(true);
                        }
                        bnVar.f32218g1 = null;
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
        this.f47404c = 19;
        this.f47405e = jVar;
        this.d = launchActivity;
    }

    public l4(Context context) {
        this.f47404c = 18;
        this.d = context;
        ArrayList arrayList = new ArrayList();
        this.f47405e = arrayList;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        org.telegram.ui.Cells.o2 o2Var = new org.telegram.ui.Cells.o2();
        o2Var.f29633a = org.telegram.messenger.hd.M0(2131744172, null);
        o2Var.f29634b = org.telegram.messenger.hd.M0(2131744164, null);
        o2Var.f29635c = 0;
        o2Var.d = 0;
        o2Var.f29636e = true;
        o2Var.f29637f = false;
        o2Var.f29638g = 0;
        o2Var.h = currentTimeMillis;
        o2Var.f29639i = false;
        o2Var.f29640j = false;
        o2Var.f29641k = 2;
        arrayList.add(o2Var);
        org.telegram.ui.Cells.o2 o2Var2 = new org.telegram.ui.Cells.o2();
        o2Var2.f29633a = org.telegram.messenger.hd.M0(2131744171, null);
        o2Var2.f29634b = org.telegram.messenger.hd.M0(2131744163, null);
        o2Var2.f29635c = 1;
        o2Var2.d = 2;
        o2Var2.f29636e = false;
        o2Var2.f29637f = false;
        o2Var2.f29638g = 0;
        o2Var2.h = currentTimeMillis - 3600;
        o2Var2.f29639i = false;
        o2Var2.f29640j = false;
        o2Var2.f29641k = -1;
        arrayList.add(o2Var2);
        org.telegram.ui.Cells.o2 o2Var3 = new org.telegram.ui.Cells.o2();
        o2Var3.f29633a = org.telegram.messenger.hd.M0(2131744170, null);
        o2Var3.f29634b = org.telegram.messenger.hd.M0(2131744162, null);
        o2Var3.f29635c = 2;
        o2Var3.d = 3;
        o2Var3.f29636e = false;
        o2Var3.f29637f = true;
        o2Var3.f29638g = 0;
        o2Var3.h = currentTimeMillis - 7200;
        o2Var3.f29639i = false;
        o2Var3.f29640j = true;
        o2Var3.f29641k = -1;
        arrayList.add(o2Var3);
        org.telegram.ui.Cells.o2 o2Var4 = new org.telegram.ui.Cells.o2();
        o2Var4.f29633a = org.telegram.messenger.hd.M0(2131744169, null);
        o2Var4.f29634b = org.telegram.messenger.hd.M0(2131744161, null);
        o2Var4.f29635c = 3;
        o2Var4.d = 0;
        o2Var4.f29636e = false;
        o2Var4.f29637f = false;
        o2Var4.f29638g = 2;
        o2Var4.h = currentTimeMillis - 10800;
        o2Var4.f29639i = false;
        o2Var4.f29640j = false;
        o2Var4.f29641k = -1;
        arrayList.add(o2Var4);
        org.telegram.ui.Cells.o2 o2Var5 = new org.telegram.ui.Cells.o2();
        o2Var5.f29633a = org.telegram.messenger.hd.M0(2131744168, null);
        o2Var5.f29634b = org.telegram.messenger.hd.M0(2131744160, null);
        o2Var5.f29635c = 4;
        o2Var5.d = 0;
        o2Var5.f29636e = false;
        o2Var5.f29637f = false;
        o2Var5.f29638g = 1;
        o2Var5.h = currentTimeMillis - 14400;
        o2Var5.f29639i = false;
        o2Var5.f29640j = false;
        o2Var5.f29641k = 2;
        arrayList.add(o2Var5);
        org.telegram.ui.Cells.o2 o2Var6 = new org.telegram.ui.Cells.o2();
        o2Var6.f29633a = org.telegram.messenger.hd.M0(2131744167, null);
        o2Var6.f29634b = org.telegram.messenger.hd.M0(2131744159, null);
        o2Var6.f29635c = 5;
        o2Var6.d = 0;
        o2Var6.f29636e = false;
        o2Var6.f29637f = false;
        o2Var6.f29638g = 0;
        o2Var6.h = currentTimeMillis - 18000;
        o2Var6.f29639i = false;
        o2Var6.f29640j = false;
        o2Var6.f29641k = -1;
        arrayList.add(o2Var6);
        org.telegram.ui.Cells.o2 o2Var7 = new org.telegram.ui.Cells.o2();
        o2Var7.f29633a = org.telegram.messenger.hd.M0(2131744166, null);
        o2Var7.f29634b = org.telegram.messenger.hd.M0(2131744158, null);
        o2Var7.f29635c = 6;
        o2Var7.d = 0;
        o2Var7.f29636e = false;
        o2Var7.f29637f = false;
        o2Var7.f29638g = 0;
        o2Var7.h = currentTimeMillis - 21600;
        o2Var7.f29639i = true;
        o2Var7.f29640j = false;
        o2Var7.f29641k = -1;
        arrayList.add(o2Var7);
        org.telegram.ui.Cells.o2 o2Var8 = new org.telegram.ui.Cells.o2();
        o2Var8.f29633a = org.telegram.messenger.hd.M0(2131744165, null);
        o2Var8.f29634b = org.telegram.messenger.hd.M0(2131744157, null);
        o2Var8.f29635c = 0;
        o2Var8.d = 0;
        o2Var8.f29636e = false;
        o2Var8.f29637f = false;
        o2Var8.f29638g = 0;
        o2Var8.h = currentTimeMillis - 25200;
        o2Var8.f29639i = true;
        o2Var8.f29640j = false;
        o2Var8.f29641k = -1;
        arrayList.add(o2Var8);
    }

    public l4(ProxyListActivity proxyListActivity, Context context) {
        this.f47404c = 16;
        this.f47405e = proxyListActivity;
        this.d = context;
        C(true);
    }
}
