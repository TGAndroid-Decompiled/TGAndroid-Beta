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
public final class l4 extends org.telegram.ui.Components.bk0 {
    public final int f49431c;
    public final Object d;
    public final Object f49432e;

    public l4(int i7, Object obj, Object obj2) {
        this.f49431c = i7;
        this.f49432e = obj;
        this.d = obj2;
    }

    private final void G(v4.f1 r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l4.G(v4.f1, int):void");
    }

    private final void H(v4.f1 r23, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l4.H(v4.f1, int):void");
    }

    private final void I(v4.f1 f1Var, int i7) {
        boolean K1;
        boolean z10;
        cn0 cn0Var = (cn0) this.f49432e;
        org.telegram.messenger.ue ueVar = cn0Var.K;
        ArrayList arrayList = cn0Var.f46554n;
        ArrayList arrayList2 = cn0Var.f46541c;
        HashMap hashMap = cn0Var.f46539b;
        int i10 = f1Var.f59127f;
        View view = f1Var.f59123a;
        int i11 = -1;
        int i12 = 0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
                        if (i7 < arrayList.size()) {
                            n8Var.o(2131232329, (CharSequence) arrayList.get(i7), false);
                            return;
                        } else {
                            n8Var.o(2131232096, org.telegram.messenger.gd.M0(2131752056, null), false);
                            return;
                        }
                    }
                    return;
                }
                org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) ueVar.f27158e.get(i7);
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
                i7Var.setPhotoEntry(efVar);
                i7Var.b(hashMap.containsKey(Integer.valueOf(efVar.C)), false);
                i7Var.setTag(Integer.valueOf(i7));
                return;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -1;
                layoutParams.height = cn0Var.S;
                view.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
        s5Var.setItemSize(cn0Var.S);
        org.telegram.ui.Components.q9 imageView = s5Var.getImageView();
        s5Var.setTag(Integer.valueOf(i7));
        imageView.r();
        if (ueVar != null) {
            org.telegram.messenger.ef efVar2 = (org.telegram.messenger.ef) ueVar.f27158e.get(i7);
            if (arrayList2.size() > 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            s5Var.d(efVar2, z10, true, false, false);
            int i13 = efVar2.C;
            if (cn0Var.f46544e) {
                i11 = arrayList2.indexOf(Integer.valueOf(i13));
            }
            s5Var.b(i11, hashMap.containsKey(Integer.valueOf(i13)), false);
            K1 = PhotoViewer.K1(efVar2.I);
        } else {
            org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) cn0Var.f46546f.get(i7);
            s5Var.e(hfVar);
            s5Var.getVideoInfoContainer().setVisibility(4);
            if (cn0Var.f46544e) {
                i11 = arrayList2.indexOf(hfVar.B);
            }
            s5Var.b(i11, hashMap.containsKey(hfVar.B), false);
            K1 = PhotoViewer.K1(hfVar.g());
        }
        imageView.getImageReceiver().O0(!K1, true);
        s5Var.getCheckBox().setVisibility((cn0Var.U != 0 || K1) ? 8 : 8);
    }

    private final void J(v4.f1 f1Var, int i7) {
        int i10;
        PhotoViewer photoViewer = (PhotoViewer) this.f49432e;
        Context context = (Context) this.d;
        org.telegram.ui.Cells.y5 y5Var = (org.telegram.ui.Cells.y5) f1Var.f59123a;
        int L = org.telegram.messenger.g0.L(85.0f);
        if (i7 != 0) {
            i10 = org.telegram.messenger.g0.L(6.0f);
        } else {
            i10 = 0;
        }
        y5Var.f32469f = L;
        org.telegram.ui.Components.mp mpVar = y5Var.f32467c;
        org.telegram.ui.Components.q9 q9Var = y5Var.f32465a;
        di.n4 n4Var = y5Var.f32468e;
        y5Var.h = i10;
        ((FrameLayout.LayoutParams) y5Var.f32466b.getLayoutParams()).rightMargin = i10;
        ((FrameLayout.LayoutParams) q9Var.getLayoutParams()).rightMargin = i10;
        ((FrameLayout.LayoutParams) n4Var.getLayoutParams()).rightMargin = i10;
        q9Var.r();
        Object obj = photoViewer.d.v().get(photoViewer.d.c().get(i7));
        if (obj instanceof org.telegram.messenger.ef) {
            org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj;
            int i11 = efVar.C;
            String str = efVar.I;
            y5Var.setTag(efVar);
            n4Var.setVisibility(4);
            String str2 = efVar.f27848c;
            if (str2 != null) {
                q9Var.h(str2, null, context.getResources().getDrawable(2131232452));
            } else if (str != null) {
                q9Var.s(efVar.J, efVar.K, true);
                if (efVar.f27847b && !efVar.d()) {
                    n4Var.setVisibility(0);
                    y5Var.d.setText(org.telegram.messenger.g0.g0(efVar.E, false, false));
                    q9Var.h("vthumb://" + i11 + ":" + str, null, context.getResources().getDrawable(2131232452));
                } else {
                    q9Var.h("thumb://" + i11 + ":" + str, null, context.getResources().getDrawable(2131232452));
                }
            } else {
                q9Var.setImageResource(2131232452);
            }
            mpVar.f37598a.f(-1, true, false);
            mpVar.setVisibility(0);
        } else if (obj instanceof org.telegram.messenger.hf) {
            org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) obj;
            y5Var.setTag(hfVar);
            y5Var.setImage(hfVar);
            n4Var.setVisibility(4);
            mpVar.f37598a.f(-1, true, false);
            mpVar.setVisibility(0);
        }
    }

    private final void K(v4.f1 f1Var, int i7) {
        boolean z10;
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.f49432e;
        ArrayList arrayList = proxyListActivity.F;
        ArrayList arrayList2 = proxyListActivity.G;
        int i10 = f1Var.f59127f;
        View view = f1Var.f59123a;
        boolean z11 = true;
        switch (i10) {
            case 1:
                org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
                org.telegram.ui.ActionBar.u6.U(x9Var.getTextView(), org.telegram.ui.ActionBar.n6.G6, null);
                if (i7 == ProxyListActivity.f0(proxyListActivity)) {
                    String M0 = org.telegram.messenger.gd.M0(2131754389, null);
                    if (proxyListActivity.E == -1) {
                        z11 = false;
                    }
                    x9Var.b(M0, z11);
                    return;
                } else if (i7 == proxyListActivity.E) {
                    org.telegram.ui.ActionBar.u6.U(x9Var.getTextView(), org.telegram.ui.ActionBar.n6.f29615p7, null);
                    x9Var.b(org.telegram.messenger.gd.M0(2131751569, null), false);
                    return;
                } else {
                    return;
                }
            case 2:
                org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
                if (i7 == proxyListActivity.h) {
                    o4Var.setText(org.telegram.messenger.gd.M0(2131746410, null));
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                if (i7 == ProxyListActivity.g0(proxyListActivity)) {
                    String M02 = org.telegram.messenger.gd.M0(2131743546, null);
                    boolean z12 = proxyListActivity.d;
                    if (proxyListActivity.f43701w == -1) {
                        z11 = false;
                    }
                    s8Var.f(M02, z12, z11);
                    return;
                } else if (i7 == proxyListActivity.f43701w) {
                    s8Var.f(org.telegram.messenger.gd.M0(2131743548, null), org.telegram.messenger.bz.f23147a1, true);
                    return;
                } else {
                    return;
                }
            case 4:
                org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                if (i7 == proxyListActivity.f43703y) {
                    a9Var.setText(org.telegram.messenger.gd.M0(2131746408, null));
                    return;
                }
                return;
            case 5:
                rx0 rx0Var = (rx0) view;
                org.telegram.messenger.az azVar = (org.telegram.messenger.az) arrayList2.get(i7 - proxyListActivity.f43698n);
                rx0Var.setProxy(azVar);
                if (org.telegram.messenger.bz.B1 == azVar) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                rx0Var.setChecked(z10);
                boolean contains = arrayList.contains(arrayList2.get(i7 - proxyListActivity.f43698n));
                rx0Var.h = contains;
                rx0Var.f51809f.a(contains, false);
                rx0Var.a(!arrayList.isEmpty(), false);
                return;
            case 6:
                if (i7 == proxyListActivity.f43702x) {
                    org.telegram.ui.Components.eu0 eu0Var = (org.telegram.ui.Components.eu0) view;
                    ArrayList arrayList3 = new ArrayList(org.telegram.messenger.kt.d);
                    String[] strArr = new String[arrayList3.size()];
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        strArr[i11] = org.telegram.messenger.gd.a0(null, null, 2131746407, arrayList3.get(i11));
                    }
                    eu0Var.setCallback(new l60(12));
                    eu0Var.b(org.telegram.messenger.bz.f23150b1, null, strArr);
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final void L(v4.f1 f1Var, int i7) {
        String M0;
        String M02;
        boolean z10;
        String M03;
        boolean e10 = org.telegram.ui.Components.e50.e(zy0.d0((zy0) this.f49432e));
        int i10 = f1Var.f59127f;
        if (i10 == 0) {
            org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) f1Var.f59123a;
            if (i7 == 0) {
                M03 = org.telegram.messenger.gd.M0(2131745793, null);
            } else {
                M03 = org.telegram.messenger.gd.M0(2131745797, null);
            }
            o4Var.setText(M03);
        } else if (i10 == 1) {
            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) f1Var.f59123a;
            if (i7 != 1 && !e10) {
                z10 = false;
            } else {
                z10 = true;
            }
            s8Var.setEnabled(z10);
            if (i7 == 1) {
                s8Var.f(org.telegram.messenger.gd.M0(2131745789, null), e10, false);
                return;
            }
            String M04 = org.telegram.messenger.gd.M0(2131745796, null);
            aj.a aVar = aj.e.f1655i;
            aVar.a();
            s8Var.f(M04, aVar.d, false);
        } else if (i10 == 2) {
            org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) f1Var.f59123a;
            x9Var.setEnabled(e10);
            if (i7 == 2) {
                x9Var.c(org.telegram.messenger.gd.M0(2131745791, null), a8.p0.n(((zi.s0) aj.e.f1652e.a()).f62255a, "p", new StringBuilder()), false, true);
            } else if (i7 == 3) {
                String M05 = org.telegram.messenger.gd.M0(2131745801, null);
                zi.o0 o0Var = (zi.o0) aj.e.f1653f.a();
                if (o0Var == zi.o0.f62234a) {
                    M02 = org.telegram.messenger.gd.M0(2131745800, null);
                } else if (o0Var == zi.o0.f62235b) {
                    M02 = org.telegram.messenger.gd.M0(2131745798, null);
                } else {
                    M02 = org.telegram.messenger.gd.M0(2131745799, null);
                }
                x9Var.c(M05, M02, false, true);
            } else if (i7 == 4) {
                x9Var.c(org.telegram.messenger.gd.M0(2131745794, null), a8.p0.n(((zi.p0) aj.e.f1654g.a()).f62241a, " FPS", new StringBuilder()), false, true);
            } else {
                x9Var.c(org.telegram.messenger.gd.M0(2131745802, null), zy0.f0(aj.e.h.a()), false, false);
            }
        } else {
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) f1Var.f59123a;
            if (i7 == 6) {
                M0 = org.telegram.messenger.gd.M0(2131745792, null);
            } else {
                M0 = org.telegram.messenger.gd.M0(2131745795, null);
            }
            a9Var.setText(M0);
        }
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        switch (this.f49431c) {
            case 0:
                int b10 = f1Var.b();
                if (b10 == 1) {
                    return true;
                }
                if (MediaController.s0(zy0.c0((zy0) this.f49432e)) && b10 == 2) {
                    return true;
                }
                return false;
            case 1:
                int b11 = f1Var.b();
                org.telegram.ui.Components.rn rnVar = (org.telegram.ui.Components.rn) this.f49432e;
                if (b11 != rnVar.f39246v0 && b11 != rnVar.H0 && b11 != rnVar.C0 && b11 != rnVar.G0 && b11 != rnVar.D0 && b11 != rnVar.I0 && b11 != rnVar.E0 && b11 != rnVar.F0 && b11 != rnVar.J0 && b11 != rnVar.K0 && b11 != rnVar.O0.f3355b && b11 != rnVar.N0.f3355b && b11 != rnVar.M0) {
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
                if (f1Var.f59127f == 0) {
                    return true;
                }
                return false;
            case 6:
                return true;
            case 7:
                return true;
            case 8:
                int b12 = f1Var.b();
                DataAutoDownloadActivity dataAutoDownloadActivity = (DataAutoDownloadActivity) this.f49432e;
                if (b12 != DataAutoDownloadActivity.n0(dataAutoDownloadActivity) && b12 != DataAutoDownloadActivity.o0(dataAutoDownloadActivity) && b12 != DataAutoDownloadActivity.g0(dataAutoDownloadActivity) && b12 != DataAutoDownloadActivity.p0(dataAutoDownloadActivity)) {
                    return false;
                }
                return true;
            case 9:
                int b13 = f1Var.b();
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.f49432e;
                if (b13 != dataSettingsActivity.f43015e && b13 != dataSettingsActivity.f43016f && b13 != dataSettingsActivity.h && b13 != dataSettingsActivity.f43019s && b13 != DataSettingsActivity.c0(dataSettingsActivity) && b13 != dataSettingsActivity.f43020w && b13 != DataSettingsActivity.d0(dataSettingsActivity) && b13 != DataSettingsActivity.e0(dataSettingsActivity) && b13 != dataSettingsActivity.F && b13 != dataSettingsActivity.E && b13 != dataSettingsActivity.G && b13 != dataSettingsActivity.H && b13 != dataSettingsActivity.L && b13 != dataSettingsActivity.K && b13 != dataSettingsActivity.f43017n && b13 != DataSettingsActivity.h0(dataSettingsActivity) && b13 != DataSettingsActivity.f0(dataSettingsActivity) && b13 != DataSettingsActivity.j0(dataSettingsActivity) && b13 != DataSettingsActivity.b0(dataSettingsActivity)) {
                    return false;
                }
                return true;
            case 10:
                int b14 = f1Var.b();
                ge0 ge0Var = (ge0) this.f49432e;
                if (b14 != ge0Var.f47985c && b14 != ge0Var.d && b14 != ge0Var.f47986e && b14 != ge0Var.f47987f && b14 != ge0Var.h && b14 != ge0Var.f47989r) {
                    return false;
                }
                return true;
            case 11:
                int b15 = f1Var.b();
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.f49432e;
                if (b15 != notificationsSettingsActivity.f43137y && b15 != notificationsSettingsActivity.E && b15 != notificationsSettingsActivity.F && b15 != notificationsSettingsActivity.L && b15 != notificationsSettingsActivity.N && b15 != notificationsSettingsActivity.T && b15 != notificationsSettingsActivity.O && b15 != notificationsSettingsActivity.M && b15 != notificationsSettingsActivity.S && b15 != notificationsSettingsActivity.G && b15 != notificationsSettingsActivity.H && b15 != notificationsSettingsActivity.P && b15 != notificationsSettingsActivity.f43133r && b15 != notificationsSettingsActivity.f43134s && b15 != notificationsSettingsActivity.U && b15 != notificationsSettingsActivity.K) {
                    return true;
                }
                return false;
            case 12:
                int b16 = f1Var.b();
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f49432e;
                if (b16 != PasscodeActivity.c0(passcodeActivity) && b16 != PasscodeActivity.d0(passcodeActivity) && b16 != passcodeActivity.O && b16 != PasscodeActivity.e0(passcodeActivity) && b16 != PasscodeActivity.f0(passcodeActivity) && b16 != passcodeActivity.K && b16 != passcodeActivity.L) {
                    return false;
                }
                return true;
            case 13:
                return true;
            case 14:
                cn0 cn0Var = (cn0) this.f49432e;
                if (cn0Var.K == null && (!TextUtils.isEmpty(cn0Var.f46566w) ? f1Var.b() >= cn0Var.f46546f.size() : f1Var.f59127f != 3)) {
                    return false;
                }
                return true;
            case 15:
                return false;
            case 16:
                int b17 = f1Var.b();
                ProxyListActivity proxyListActivity = (ProxyListActivity) this.f49432e;
                if (b17 != ProxyListActivity.g0(proxyListActivity) && b17 != proxyListActivity.f43701w && b17 != ProxyListActivity.f0(proxyListActivity) && b17 != proxyListActivity.E && (b17 < proxyListActivity.f43698n || b17 >= proxyListActivity.f43699r)) {
                    return false;
                }
                return true;
            case 17:
                int b18 = f1Var.b();
                if (b18 == 1) {
                    return true;
                }
                if (org.telegram.ui.Components.e50.e(zy0.b0((zy0) this.f49432e)) && (b18 == 2 || b18 == 3 || b18 == 4 || b18 == 5 || b18 == 8)) {
                    return true;
                }
                return false;
            case 18:
                if (f1Var.f59127f != 1) {
                    return true;
                }
                return false;
            default:
                if (p1.g.d(3)[f1Var.f59127f] == 1) {
                    return true;
                }
                return false;
        }
    }

    public void E() {
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.f49432e;
        int size = proxyListActivity.F.size();
        boolean x10 = ProxyListActivity.b0(proxyListActivity).x();
        if (size > 0) {
            ProxyListActivity.c0(proxyListActivity).E(size, x10);
            if (!x10) {
                ProxyListActivity.d0(proxyListActivity).J();
                int i7 = proxyListActivity.f43698n;
                n(i7, proxyListActivity.f43699r - i7, 2);
            }
        } else if (x10) {
            ProxyListActivity.e0(proxyListActivity).w();
            int i10 = proxyListActivity.f43698n;
            n(i10, proxyListActivity.f43699r - i10, 2);
        }
    }

    public void F() {
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.f49432e;
        proxyListActivity.F.clear();
        int i7 = proxyListActivity.f43698n;
        n(i7, proxyListActivity.f43699r - i7, 1);
        E();
    }

    public void M(int i7) {
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.f49432e;
        ArrayList arrayList = proxyListActivity.F;
        int i10 = proxyListActivity.f43698n;
        if (i7 >= i10 && i7 < proxyListActivity.f43699r) {
            org.telegram.messenger.az azVar = (org.telegram.messenger.az) proxyListActivity.G.get(i7 - i10);
            if (arrayList.contains(azVar)) {
                arrayList.remove(azVar);
            } else {
                arrayList.add(azVar);
            }
            h(i7, 1);
            E();
        }
    }

    @Override
    public final int b() {
        switch (this.f49431c) {
            case 0:
                return 4;
            case 1:
                return ((org.telegram.ui.Components.rn) this.f49432e).R0;
            case 2:
                return ((org.telegram.ui.Components.pz) this.f49432e).h.size();
            case 3:
                int size = ((org.telegram.ui.Components.qz) this.f49432e).f38951v1.size();
                if (size < 10) {
                    return size + 1;
                }
                return size;
            case 4:
                return ((org.telegram.ui.Components.de0) this.f49432e).G;
            case 5:
                return org.telegram.messenger.qd.g() + 1;
            case 6:
                ArrayList arrayList = ((org.telegram.ui.Components.yw0) this.d).f42659x;
                if (arrayList == null) {
                    return 0;
                }
                return arrayList.size();
            case 7:
                return ((org.telegram.ui.Components.f71) this.f49432e).h.size();
            case 8:
                return ((DataAutoDownloadActivity) this.f49432e).f43011y;
            case 9:
                return ((DataSettingsActivity) this.f49432e).U;
            case 10:
                return ((ge0) this.f49432e).f47991w;
            case 11:
                return ((NotificationsSettingsActivity) this.f49432e).V;
            case 12:
                return ((PasscodeActivity) this.f49432e).Q;
            case 13:
                qm0 qm0Var = (qm0) this.f49432e;
                ArrayList arrayList2 = qm0Var.d;
                if (arrayList2 != null) {
                    return (int) Math.ceil(arrayList2.size() / qm0Var.f51249f);
                }
                return 0;
            case 14:
                cn0 cn0Var = (cn0) this.f49432e;
                org.telegram.messenger.ue ueVar = cn0Var.K;
                if (ueVar == null) {
                    if (cn0Var.f46546f.isEmpty()) {
                        if (!TextUtils.isEmpty(cn0Var.f46566w) || cn0Var.f46554n.isEmpty()) {
                            return 0;
                        }
                        return cn0Var.f46554n.size() + 2;
                    }
                    return cn0Var.f46546f.size() + (!cn0Var.f46561s ? 1 : 0);
                }
                return ueVar.f27158e.size();
            case 15:
                PhotoViewer photoViewer = (PhotoViewer) this.f49432e;
                uq0 uq0Var = photoViewer.d;
                if (uq0Var != null && uq0Var.c() != null) {
                    return photoViewer.d.c().size();
                }
                return 0;
            case 16:
                return ((ProxyListActivity) this.f49432e).f43696e;
            case 17:
                return 7;
            case 18:
                return ((ArrayList) this.f49432e).size();
            default:
                return ((pg.i) this.f49432e).F.size();
        }
    }

    @Override
    public long c(int i7) {
        int i10;
        switch (this.f49431c) {
            case 2:
                i10 = ((org.telegram.ui.Components.pz) this.f49432e).f38630l0.get(i7);
                break;
            case 4:
                return i7;
            case 6:
                ArrayList arrayList = ((org.telegram.ui.Components.yw0) this.d).f42659x;
                if (arrayList == null) {
                    return 0L;
                }
                return ((org.telegram.messenger.ni) arrayList.get(i7)).f25927a.hashCode();
            case 7:
                i10 = ((org.telegram.ui.Components.c71) ((org.telegram.ui.Components.f71) this.f49432e).h.get(i7)).f33908a;
                break;
            case 14:
                return i7;
            case 16:
                ProxyListActivity proxyListActivity = (ProxyListActivity) this.f49432e;
                if (i7 == proxyListActivity.f43697f) {
                    return -1L;
                }
                if (i7 == proxyListActivity.f43700s) {
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
                if (i7 == proxyListActivity.f43701w) {
                    return -9L;
                }
                if (i7 == proxyListActivity.f43702x) {
                    return -10L;
                }
                if (i7 == proxyListActivity.f43703y) {
                    return -11L;
                }
                int i11 = proxyListActivity.f43698n;
                if (i7 >= i11 && i7 < proxyListActivity.f43699r) {
                    return ((org.telegram.messenger.az) proxyListActivity.G.get(i7 - i11)).hashCode();
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
        switch (this.f49431c) {
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
                org.telegram.ui.Components.rn rnVar = (org.telegram.ui.Components.rn) this.f49432e;
                if (i7 != rnVar.C0 && i7 != rnVar.G0 && i7 != rnVar.H0 && i7 != rnVar.D0 && i7 != rnVar.E0 && i7 != rnVar.F0 && i7 != rnVar.I0 && i7 != rnVar.N0.f3355b && i7 != rnVar.O0.f3355b) {
                    if (i7 != rnVar.m0 && i7 != rnVar.f39244t0 && i7 != rnVar.f39250x0 && i7 != rnVar.f39235p0) {
                        if (i7 == rnVar.f39243s0) {
                            return 1;
                        }
                        if (i7 != rnVar.f39248w0 && i7 != rnVar.f39252y0 && i7 != rnVar.f39240r0 && i7 != rnVar.L0) {
                            if (i7 != rnVar.f39246v0 && i7 != rnVar.J0 && i7 != rnVar.M0) {
                                if (i7 == rnVar.f39232n0) {
                                    return 4;
                                }
                                if (i7 == rnVar.f39233o0) {
                                    return 11;
                                }
                                if (i7 == rnVar.f39237q0) {
                                    return 7;
                                }
                                if (i7 != rnVar.f39253z0 && i7 != rnVar.A0 && i7 != rnVar.K0) {
                                    if (i7 == rnVar.B0) {
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
                org.telegram.ui.Components.de0 de0Var = (org.telegram.ui.Components.de0) this.f49432e;
                if (i7 != de0Var.E && i7 != de0Var.F) {
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
                DataAutoDownloadActivity dataAutoDownloadActivity = (DataAutoDownloadActivity) this.f49432e;
                if (i7 == DataAutoDownloadActivity.c0(dataAutoDownloadActivity)) {
                    return 0;
                }
                if (i7 == dataAutoDownloadActivity.f43008s) {
                    return 1;
                }
                if (i7 != dataAutoDownloadActivity.f43007r && i7 != dataAutoDownloadActivity.f43009w) {
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
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.f49432e;
                if (i7 != dataSettingsActivity.f43018r && i7 != dataSettingsActivity.f43021x && i7 != dataSettingsActivity.O && i7 != dataSettingsActivity.Q && i7 != dataSettingsActivity.M && i7 != dataSettingsActivity.R && i7 != dataSettingsActivity.T) {
                    if (i7 != dataSettingsActivity.d && i7 != dataSettingsActivity.f43022y && i7 != dataSettingsActivity.N && i7 != 0 && i7 != dataSettingsActivity.P && i7 != dataSettingsActivity.J && i7 != dataSettingsActivity.S) {
                        if (i7 != dataSettingsActivity.F && i7 != dataSettingsActivity.E && i7 != dataSettingsActivity.G && i7 != dataSettingsActivity.H && i7 != dataSettingsActivity.K && i7 != dataSettingsActivity.L) {
                            if (i7 == dataSettingsActivity.I) {
                                return 4;
                            }
                            if (i7 != dataSettingsActivity.f43015e && i7 != dataSettingsActivity.h && i7 != dataSettingsActivity.f43016f && i7 != DataSettingsActivity.h0(dataSettingsActivity) && i7 != DataSettingsActivity.f0(dataSettingsActivity) && i7 != DataSettingsActivity.j0(dataSettingsActivity)) {
                                if (i7 != dataSettingsActivity.f43019s && i7 != dataSettingsActivity.f43020w && i7 != dataSettingsActivity.f43017n) {
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
                ge0 ge0Var = (ge0) this.f49432e;
                ge0Var.getClass();
                if (i7 == 0) {
                    return 0;
                }
                if (i7 != ge0Var.f47985c && i7 != ge0Var.d && i7 != ge0Var.f47986e && i7 != ge0Var.f47987f && i7 != ge0Var.h) {
                    if (i7 == ge0Var.f47988n) {
                        return 2;
                    }
                    if (i7 == ge0Var.f47989r) {
                        return 3;
                    }
                    return 4;
                }
                return 1;
            case 11:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.f49432e;
                if (i7 != notificationsSettingsActivity.L && i7 != notificationsSettingsActivity.N && i7 != notificationsSettingsActivity.T && i7 != notificationsSettingsActivity.H && i7 != notificationsSettingsActivity.O && i7 != notificationsSettingsActivity.F && i7 != notificationsSettingsActivity.f43137y && i7 != notificationsSettingsActivity.f43133r) {
                    i10 = notificationsSettingsActivity.inappSoundRow;
                    if (i7 != i10) {
                        i11 = notificationsSettingsActivity.inappVibrateRow;
                        if (i7 != i11 && i7 != notificationsSettingsActivity.f43136x) {
                            i12 = notificationsSettingsActivity.inappPreviewRow;
                            if (i7 != i12) {
                                i13 = notificationsSettingsActivity.contactJoinedRow;
                                if (i7 != i13) {
                                    i14 = notificationsSettingsActivity.pinnedMessageRow;
                                    if (i7 != i14 && i7 != notificationsSettingsActivity.f43135w) {
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
                                                                                            if (i7 == notificationsSettingsActivity.f43134s) {
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
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f49432e;
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
                cn0 cn0Var = (cn0) this.f49432e;
                if (cn0Var.Z) {
                    return 2;
                }
                if (cn0Var.K == null) {
                    if (cn0Var.f46546f.isEmpty()) {
                        if (i7 == cn0Var.f46554n.size()) {
                            return 4;
                        }
                        return 3;
                    } else if (i7 >= cn0Var.f46546f.size()) {
                        return 1;
                    }
                }
                return 0;
            case 15:
                return 0;
            case 16:
                ProxyListActivity proxyListActivity = (ProxyListActivity) this.f49432e;
                if (i7 != proxyListActivity.f43697f && i7 != proxyListActivity.f43700s) {
                    if (i7 != ProxyListActivity.f0(proxyListActivity) && i7 != proxyListActivity.E) {
                        if (i7 != ProxyListActivity.g0(proxyListActivity) && i7 != proxyListActivity.f43701w) {
                            if (i7 == proxyListActivity.h) {
                                return 2;
                            }
                            if (i7 == proxyListActivity.f43702x) {
                                return 6;
                            }
                            if (i7 >= proxyListActivity.f43698n && i7 < proxyListActivity.f43699r) {
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
                if (i7 == ((ArrayList) this.f49432e).size()) {
                    return 1;
                }
                return 0;
            case 19:
                return p1.g.c(((pg.a) ((pg.i) this.f49432e).F.get(i7)).f55594b);
        }
    }

    @Override
    public final void t(v4.f1 r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l4.t(v4.f1, int):void");
    }

    @Override
    public void v(v4.f1 f1Var, int i7, List list) {
        boolean contains;
        switch (this.f49431c) {
            case 16:
                ProxyListActivity proxyListActivity = (ProxyListActivity) this.f49432e;
                ArrayList arrayList = proxyListActivity.F;
                int i10 = f1Var.f59127f;
                View view = f1Var.f59123a;
                if (i10 == 5 && !list.isEmpty()) {
                    rx0 rx0Var = (rx0) view;
                    if (list.contains(1) && (contains = arrayList.contains(proxyListActivity.G.get(i7 - proxyListActivity.f43698n))) != rx0Var.h) {
                        rx0Var.h = contains;
                        rx0Var.f51809f.a(contains, true);
                    }
                    if (list.contains(2)) {
                        rx0Var.a(!arrayList.isEmpty(), true);
                        return;
                    }
                    return;
                } else if (f1Var.f59127f == 3 && list.contains(0)) {
                    org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                    if (i7 == ProxyListActivity.g0(proxyListActivity)) {
                        s8Var.setChecked(proxyListActivity.d);
                        return;
                    } else if (i7 == proxyListActivity.f43701w) {
                        s8Var.setChecked(org.telegram.messenger.bz.f23147a1);
                        return;
                    } else {
                        return;
                    }
                } else {
                    t(f1Var, i7);
                    return;
                }
            default:
                super.v(f1Var, i7, list);
                return;
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.x9 x9Var;
        org.telegram.ui.Components.pn o4Var;
        View view;
        org.telegram.ui.Cells.t5 t5Var;
        FrameLayout frameLayout;
        org.telegram.ui.Components.eu0 eu0Var;
        View z6Var;
        org.telegram.ui.Cells.z8 z8Var;
        View o4Var2;
        org.telegram.ui.ActionBar.i6 i6Var;
        org.telegram.ui.ActionBar.i6 i6Var2;
        org.telegram.ui.ActionBar.i6 i6Var3;
        org.telegram.ui.ActionBar.i6 i6Var4;
        org.telegram.ui.ActionBar.i6 i6Var5;
        View s8Var;
        org.telegram.ui.Cells.n8 n8Var;
        View z6Var2;
        org.telegram.ui.Cells.x9 x9Var2;
        View u4Var;
        FrameLayout frameLayout2;
        int i10 = this.f49431c;
        int i11 = 8;
        Object obj = this.f49432e;
        Object obj2 = this.d;
        switch (i10) {
            case 0:
                Context context = (Context) obj2;
                if (i7 == 0) {
                    x9Var = new org.telegram.ui.Cells.o4(context);
                } else if (i7 == 1) {
                    x9Var = new org.telegram.ui.Cells.s8(context);
                } else if (i7 == 2) {
                    org.telegram.ui.Cells.x9 x9Var3 = new org.telegram.ui.Cells.x9(context);
                    x9Var3.setCanDisable(true);
                    x9Var = x9Var3;
                } else {
                    x9Var = new org.telegram.ui.Cells.a9(context);
                }
                x9Var.setLayoutParams(new v4.q0(-1, -2));
                return new v4.f1(x9Var);
            case 1:
                Context context2 = (Context) obj2;
                org.telegram.ui.Components.rn rnVar = (org.telegram.ui.Components.rn) obj;
                boolean z10 = rnVar.f39231n;
                org.telegram.ui.ActionBar.i6 i6Var6 = rnVar.f36765a;
                switch (i7) {
                    case 0:
                        o4Var = new org.telegram.ui.Cells.o4((Context) obj2, org.telegram.ui.ActionBar.n6.L6, 21, 15, false, rnVar.f36765a);
                        break;
                    case 1:
                        View z6Var3 = new org.telegram.ui.Cells.z6(context2, (org.telegram.ui.Cells.c0) null);
                        new org.telegram.ui.Components.mq(new ColorDrawable(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29337a7, i6Var6)), org.telegram.ui.ActionBar.n6.Y0(context2, 2131231229, org.telegram.ui.ActionBar.n6.f29358b7)).f37616x = true;
                        o4Var = z6Var3;
                        break;
                    case 2:
                        o4Var = new org.telegram.ui.Cells.a9(context2, i6Var6);
                        break;
                    case 3:
                        o4Var = new org.telegram.ui.Cells.n8(context2, i6Var6);
                        break;
                    case 4:
                    case 11:
                        org.telegram.ui.Components.mn mnVar = new org.telegram.ui.Components.mn(this, (Context) obj2, rnVar.J ? 1 : 0, rnVar.f36765a, i7);
                        if (i7 == 11 && !z10) {
                            mnVar.setTextRight(98);
                            mnVar.b().setOnClickListener(new View.OnClickListener(this) {
                                public final org.telegram.ui.l4 f36831b;

                                {
                                    this.f36831b = this;
                                }

                                @Override
                                public final void onClick(View view2) {
                                    switch (r2) {
                                        case 0:
                                            rn.T((rn) this.f36831b.f49432e, -2);
                                            return;
                                        case 1:
                                            rn.T((rn) this.f36831b.f49432e, -3);
                                            return;
                                        default:
                                            ((rn) this.f36831b.f49432e).c0(view2, (org.telegram.ui.Cells.b6) view2.getParent(), true);
                                            return;
                                    }
                                }
                            });
                        }
                        mnVar.d();
                        mnVar.setIconsColor(org.telegram.ui.ActionBar.n6.f29595o7);
                        mnVar.c(new org.telegram.ui.Components.nn(this, mnVar, i7));
                        o4Var = mnVar;
                        break;
                    case 5:
                    default:
                        org.telegram.ui.Components.pn pnVar = new org.telegram.ui.Components.pn(this, (Context) obj2, rnVar.J ? 1 : 0, new View.OnClickListener(this) {
                            public final org.telegram.ui.l4 f36831b;

                            {
                                this.f36831b = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (r2) {
                                    case 0:
                                        rn.T((rn) this.f36831b.f49432e, -2);
                                        return;
                                    case 1:
                                        rn.T((rn) this.f36831b.f49432e, -3);
                                        return;
                                    default:
                                        ((rn) this.f36831b.f49432e).c0(view2, (org.telegram.ui.Cells.b6) view2.getParent(), true);
                                        return;
                                }
                            }
                        }, rnVar.f36765a);
                        if (!z10) {
                            pnVar.setTextRight(140);
                            pnVar.b().setOnClickListener(new org.telegram.ui.Components.y7(4, this, pnVar));
                        }
                        int i12 = org.telegram.ui.ActionBar.n6.f29595o7;
                        pnVar.setIconsColor(i12);
                        org.telegram.ui.Components.mp mpVar = pnVar.f30448r;
                        if (mpVar != null) {
                            mpVar.getCheckBoxBase().i(org.telegram.messenger.g0.L(6.0f));
                            CheckBoxBase checkBoxBase = mpVar.getCheckBoxBase();
                            float f10 = pnVar.f30442a.f57657e;
                            if (checkBoxBase.f32843w != f10) {
                                checkBoxBase.f32843w = f10;
                                checkBoxBase.b();
                            }
                        }
                        pnVar.getCheckBox().b(-1, i12, org.telegram.ui.ActionBar.n6.f29524k7);
                        pnVar.c(new bi.v(11, this, pnVar));
                        pnVar.setShowNextButton(true);
                        EditTextBoldCursor textView = pnVar.getTextView();
                        textView.setImeOptions(textView.getImeOptions() | 5);
                        textView.setOnEditorActionListener(new ld(2, this, pnVar));
                        textView.setOnKeyListener(new org.telegram.ui.Components.ln(pnVar, 0));
                        o4Var = pnVar;
                        break;
                    case 6:
                        o4Var = new org.telegram.ui.Cells.s8(context2, i6Var6);
                        break;
                    case 7:
                        org.telegram.ui.Components.on onVar = new org.telegram.ui.Components.on(this, context2, rnVar.J ? 1 : 0);
                        onVar.d();
                        if (!z10) {
                            onVar.setTextRight(98);
                            onVar.b().setOnClickListener(new View.OnClickListener(this) {
                                public final org.telegram.ui.l4 f36831b;

                                {
                                    this.f36831b = this;
                                }

                                @Override
                                public final void onClick(View view2) {
                                    switch (r2) {
                                        case 0:
                                            rn.T((rn) this.f36831b.f49432e, -2);
                                            return;
                                        case 1:
                                            rn.T((rn) this.f36831b.f49432e, -3);
                                            return;
                                        default:
                                            ((rn) this.f36831b.f49432e).c0(view2, (org.telegram.ui.Cells.b6) view2.getParent(), true);
                                            return;
                                    }
                                }
                            });
                        }
                        onVar.setIconsColor(org.telegram.ui.ActionBar.n6.f29595o7);
                        onVar.c(new bi.v(10, this, onVar));
                        o4Var = onVar;
                        break;
                    case 8:
                        View jnVar = new org.telegram.ui.Components.jn(context2, 0);
                        jnVar.setTag(-33024);
                        view = jnVar;
                        o4Var = view;
                        break;
                    case 9:
                        View i3Var = new bi.i3(16, context2, this);
                        i3Var.setTag(-33024);
                        view = i3Var;
                        o4Var = view;
                        break;
                    case 10:
                        org.telegram.ui.Cells.z5 z5Var = new org.telegram.ui.Cells.z5(context2, i6Var6);
                        z5Var.getCheckBox().setIcon(2131232515);
                        o4Var = z5Var;
                        break;
                }
                return i5.c.q(o4Var, o4Var, -1, -2);
            case 2:
                return new v4.f1(new org.telegram.ui.Components.nz((org.telegram.ui.Components.pz) obj, (Context) obj2));
            case 3:
                org.telegram.ui.ActionBar.q2 q2Var = new org.telegram.ui.ActionBar.q2(0, (Context) obj2, null);
                q2Var.setBackground(null);
                q2Var.setLayoutParams(new v4.q0(-1, -2));
                return new v4.f1(q2Var);
            case 4:
                Context context3 = (Context) obj2;
                if (i7 == 0) {
                    org.telegram.ui.ActionBar.i6 i6Var7 = ((org.telegram.ui.Components.de0) obj).J0;
                    ?? frameLayout3 = new FrameLayout(context3);
                    frameLayout3.f32027e = new j6.o((Object) frameLayout3, 23);
                    TextView textView2 = new TextView(context3);
                    frameLayout3.f32024a = textView2;
                    textView2.setGravity(5);
                    textView2.setTextColor(-1);
                    textView2.setTextSize(1, 12.0f);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    frameLayout3.addView(textView2, c8.ma.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
                    TextView textView3 = new TextView(context3);
                    frameLayout3.f32025b = textView3;
                    org.telegram.ui.ActionBar.u6.U(textView3, org.telegram.ui.ActionBar.n6.f29643qg, i6Var7);
                    textView3.setTextSize(1, 12.0f);
                    textView3.setGravity(5);
                    textView3.setSingleLine(true);
                    frameLayout3.addView(textView3, c8.ma.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
                    ?? view2 = new View(context3);
                    Paint paint = new Paint();
                    view2.f39606a = paint;
                    Paint paint2 = new Paint(1);
                    view2.f39607b = paint2;
                    view2.f39608c = org.telegram.messenger.g0.L(16.0f);
                    view2.d = 0;
                    view2.f39609e = 0.0f;
                    view2.f39610f = false;
                    paint.setColor(-11711155);
                    paint2.setColor(-1);
                    frameLayout3.f32026c = view2;
                    frameLayout3.addView(view2, c8.ma.d(-1, 40.0f, 19, 96.0f, 0.0f, 24.0f, 0.0f));
                    frameLayout3.setSeekBarDelegate(new org.telegram.ui.Components.iy(this, 10));
                    t5Var = frameLayout3;
                } else {
                    org.telegram.ui.Cells.t5 t5Var2 = new org.telegram.ui.Cells.t5(context3);
                    t5Var2.setOnClickListener(new org.telegram.ui.Components.h70(this, 5));
                    t5Var = t5Var2;
                }
                return new v4.f1(t5Var);
            case 5:
                Context context4 = (Context) obj2;
                org.telegram.ui.Components.jt0 jt0Var = (org.telegram.ui.Components.jt0) obj;
                if (i7 != 0) {
                    FrameLayout p2Var = new bi.p2(context4, 21);
                    p2Var.setWillNotDraw(false);
                    jt0Var.f36526p1 = new TextView(context4);
                    org.telegram.ui.ActionBar.u6.U(jt0Var.f36526p1, org.telegram.ui.ActionBar.n6.J5, jt0Var.J0);
                    jt0Var.f36526p1.setTextSize(1, 14.0f);
                    jt0Var.f36526p1.setGravity(17);
                    jt0Var.f36526p1.setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
                    p2Var.addView(jt0Var.f36526p1, c8.ma.c(40.0f, -1));
                    frameLayout = p2Var;
                } else {
                    frameLayout = new org.telegram.ui.Cells.s7(54, context4, jt0Var.J0, false);
                }
                return new v4.f1(frameLayout);
            case 6:
                return new v4.f1(new org.telegram.ui.Components.xw0((org.telegram.ui.Components.yw0) obj, ((org.telegram.ui.Components.yw0) obj2).getContext()));
            case 7:
                return new v4.f1(new org.telegram.ui.Components.d71((org.telegram.ui.Components.f71) obj, (Context) obj2));
            case 8:
                Context context5 = (Context) obj2;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                if (i7 != 4) {
                                    eu0Var = new org.telegram.ui.Cells.a9(context5);
                                } else {
                                    eu0Var = new org.telegram.ui.Cells.j5(context5);
                                }
                            } else {
                                org.telegram.ui.Components.eu0 eu0Var2 = new org.telegram.ui.Components.eu0(context5, null);
                                eu0Var2.setCallback(new zr(this, 3));
                                eu0Var = eu0Var2;
                            }
                        } else {
                            eu0Var = new org.telegram.ui.Cells.o4(context5);
                        }
                    } else {
                        eu0Var = new org.telegram.ui.Cells.z6(context5, (org.telegram.ui.Cells.c0) null);
                    }
                } else {
                    org.telegram.ui.Cells.s8 s8Var2 = new org.telegram.ui.Cells.s8(context5);
                    s8Var2.d(org.telegram.ui.ActionBar.n6.f29449g6, org.telegram.ui.ActionBar.n6.O6, org.telegram.ui.ActionBar.n6.P6, org.telegram.ui.ActionBar.n6.Q6, org.telegram.ui.ActionBar.n6.R6);
                    s8Var2.setTypeface(org.telegram.messenger.g0.o());
                    s8Var2.setHeight(56);
                    eu0Var = s8Var2;
                }
                return i5.c.q(eu0Var, eu0Var, -1, -2);
            case 9:
                Context context6 = (Context) obj2;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                if (i7 != 4) {
                                    if (i7 != 5) {
                                        z6Var = new org.telegram.ui.Cells.n8(context6);
                                    } else {
                                        z6Var = new org.telegram.ui.Cells.j5(context6);
                                    }
                                } else {
                                    z6Var = new org.telegram.ui.Cells.a9(context6);
                                }
                            } else {
                                z6Var = new org.telegram.ui.Cells.s8(context6);
                            }
                        } else {
                            z6Var = new org.telegram.ui.Cells.o4(context6, 22);
                        }
                    } else {
                        z6Var = new org.telegram.ui.Cells.x9(context6);
                    }
                } else {
                    z6Var = new org.telegram.ui.Cells.z6(context6, (org.telegram.ui.Cells.c0) null);
                }
                return i5.c.q(z6Var, z6Var, -1, -2);
            case 10:
                Context context7 = (Context) obj2;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                z8Var = new org.telegram.ui.Cells.a9(context7);
                            } else {
                                View x9Var4 = new org.telegram.ui.Cells.x9(context7);
                                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394d6, x9Var4, null);
                                z8Var = x9Var4;
                            }
                        } else {
                            z8Var = new org.telegram.ui.Cells.z6(context7, (org.telegram.ui.Cells.c0) null);
                        }
                    } else {
                        org.telegram.ui.Cells.z8 z8Var2 = new org.telegram.ui.Cells.z8(context7);
                        z8Var2.setMultilineDetail(true);
                        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394d6, z8Var2, null);
                        z8Var = z8Var2;
                    }
                } else {
                    View o4Var3 = new org.telegram.ui.Cells.o4(context7);
                    org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394d6, o4Var3, null);
                    z8Var = o4Var3;
                }
                return i5.c.q(z8Var, z8Var, -1, -2);
            case 11:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                Context context8 = (Context) obj2;
                if (i7 == 0) {
                    i6Var = ((org.telegram.ui.ActionBar.h2) notificationsSettingsActivity).resourceProvider;
                    o4Var2 = new org.telegram.ui.Cells.o4(context8, i6Var);
                } else if (i7 == 1) {
                    i6Var2 = ((org.telegram.ui.ActionBar.h2) notificationsSettingsActivity).resourceProvider;
                    o4Var2 = new org.telegram.ui.Cells.s8(context8, i6Var2);
                } else if (i7 != 2) {
                    if (i7 == 3) {
                        i6Var3 = ((org.telegram.ui.ActionBar.h2) notificationsSettingsActivity).resourceProvider;
                        o4Var2 = new org.telegram.ui.Cells.j5((Context) obj2, 21, 64, true, i6Var3);
                    } else if (i7 != 4) {
                        if (i7 != 5) {
                            i6Var5 = ((org.telegram.ui.ActionBar.h2) notificationsSettingsActivity).resourceProvider;
                            o4Var2 = new org.telegram.ui.Cells.a9(context8, i6Var5);
                        } else {
                            i6Var4 = ((org.telegram.ui.ActionBar.h2) notificationsSettingsActivity).resourceProvider;
                            o4Var2 = new org.telegram.ui.Cells.x9(0, context8, i6Var4);
                        }
                    } else {
                        o4Var2 = new org.telegram.ui.Cells.z6(context8, (org.telegram.ui.Cells.c0) null);
                    }
                } else {
                    o4Var2 = new org.telegram.ui.Cells.z8(context8);
                }
                return new v4.f1(o4Var2);
            case 12:
                Context context9 = (Context) obj2;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 3) {
                            if (i7 != 4) {
                                s8Var = new org.telegram.ui.Cells.a9(context9);
                            } else {
                                s8Var = new oi0(context9);
                                s8Var.setTag(-33024);
                            }
                        } else {
                            s8Var = new org.telegram.ui.Cells.o4(context9);
                        }
                    } else {
                        s8Var = new org.telegram.ui.Cells.x9(context9);
                    }
                } else {
                    s8Var = new org.telegram.ui.Cells.s8(context9);
                }
                return new v4.f1(s8Var);
            case 13:
                Context context10 = (Context) obj2;
                ?? frameLayout4 = new FrameLayout(context10);
                frameLayout4.f32315e = new Paint();
                frameLayout4.f32313b = new org.telegram.messenger.ue[4];
                frameLayout4.f32312a = new org.telegram.ui.Cells.v5[4];
                for (int i13 = 0; i13 < 4; i13++) {
                    frameLayout4.f32312a[i13] = new org.telegram.ui.Cells.v5((org.telegram.ui.Cells.x5) frameLayout4, context10);
                    frameLayout4.addView(frameLayout4.f32312a[i13]);
                    frameLayout4.f32312a[i13].setVisibility(4);
                    frameLayout4.f32312a[i13].setTag(Integer.valueOf(i13));
                    frameLayout4.f32312a[i13].setOnClickListener(new org.telegram.ui.Cells.a(frameLayout4, 9));
                }
                frameLayout4.setDelegate(new qi0(this, 1));
                return new v4.f1(frameLayout4);
            case 14:
                cn0 cn0Var = (cn0) obj;
                boolean z11 = cn0Var.f46562s0;
                Context context11 = (Context) obj2;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                org.telegram.ui.Cells.f3 f3Var = new org.telegram.ui.Cells.f3(context11, null);
                                f3Var.setForceDarkTheme(z11);
                                n8Var = f3Var;
                            } else {
                                org.telegram.ui.Cells.n8 n8Var2 = new org.telegram.ui.Cells.n8(23, context11, true);
                                n8Var2.setLayoutParams(new v4.q0(-1, -2));
                                if (z11) {
                                    org.telegram.ui.ActionBar.u6.X(n8Var2.f31134a, cn0Var.f46567w0, null);
                                    org.telegram.ui.ActionBar.u6.s(n8Var2.f31137e, org.telegram.ui.ActionBar.n6.f29495ih, null, PorterDuff.Mode.MULTIPLY);
                                }
                                n8Var = n8Var2;
                            }
                        } else {
                            n8Var = new org.telegram.ui.Cells.i7(1, context11, null);
                        }
                    } else {
                        ViewGroup frameLayout5 = new FrameLayout(context11);
                        frameLayout5.setLayoutParams(new v4.q0(-1, -2));
                        RadialProgressView radialProgressView = new RadialProgressView(context11, null);
                        radialProgressView.setProgressColor(-11371101);
                        frameLayout5.addView(radialProgressView, c8.ma.c(-1.0f, -1));
                        n8Var = frameLayout5;
                    }
                } else {
                    org.telegram.ui.Cells.s5 s5Var = new org.telegram.ui.Cells.s5(context11, null);
                    s5Var.setDelegate(new an0(this));
                    FrameLayout checkFrame = s5Var.getCheckFrame();
                    if (cn0Var.U == 0) {
                        i11 = 0;
                    }
                    checkFrame.setVisibility(i11);
                    n8Var = s5Var;
                }
                return new v4.f1(n8Var);
            case 15:
                Context context12 = (Context) obj2;
                ?? frameLayout6 = new FrameLayout(context12);
                new Paint();
                frameLayout6.setWillNotDraw(false);
                org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context12);
                frameLayout6.f32465a = q9Var;
                q9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
                frameLayout6.addView(q9Var, c8.ma.c(-1.0f, -1));
                FrameLayout frameLayout7 = new FrameLayout(context12);
                frameLayout6.f32466b = frameLayout7;
                frameLayout6.addView(frameLayout7, c8.ma.e(42, 42, 53));
                di.n4 n4Var = new di.n4(context12);
                n4Var.d = new Path();
                n4Var.f9372e = new float[8];
                n4Var.f9370b = new RectF();
                n4Var.f9371c = new Paint(1);
                frameLayout6.f32468e = n4Var;
                n4Var.setWillNotDraw(false);
                n4Var.setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), 0);
                frameLayout6.addView(n4Var, c8.ma.e(-1, 16, 83));
                n4Var.addView(org.telegram.messenger.n10.e(context12, 2131231463), c8.ma.e(-2, -2, 19));
                TextView textView4 = new TextView(context12);
                frameLayout6.d = textView4;
                textView4.setTextColor(-1);
                textView4.setTextSize(1, 12.0f);
                textView4.setImportantForAccessibility(2);
                n4Var.addView(textView4, c8.ma.d(-2, -2.0f, 19, 18.0f, -0.7f, 0.0f, 0.0f));
                org.telegram.ui.Components.mp mpVar2 = new org.telegram.ui.Components.mp(24, context12, null);
                frameLayout6.f32467c = mpVar2;
                mpVar2.setDrawBackgroundAsArc(11);
                mpVar2.b(org.telegram.ui.ActionBar.n6.W9, org.telegram.ui.ActionBar.n6.X9, org.telegram.ui.ActionBar.n6.V9);
                frameLayout6.addView(mpVar2, c8.ma.d(26, 26.0f, 51, 55.0f, 4.0f, 0.0f, 0.0f));
                mpVar2.setVisibility(0);
                frameLayout6.setFocusable(true);
                frameLayout7.setOnClickListener(new j40(this, 21));
                return new v4.f1(frameLayout6);
            case 16:
                Context context13 = (Context) obj2;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                if (i7 != 4) {
                                    if (i7 != 6) {
                                        z6Var2 = new rx0((ProxyListActivity) obj, context13);
                                        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394d6, z6Var2, null);
                                    } else {
                                        z6Var2 = new org.telegram.ui.Components.eu0(context13, null);
                                        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394d6, z6Var2, null);
                                    }
                                } else {
                                    z6Var2 = new org.telegram.ui.Cells.a9(context13);
                                }
                            } else {
                                z6Var2 = new org.telegram.ui.Cells.s8(context13);
                                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394d6, z6Var2, null);
                            }
                        } else {
                            z6Var2 = new org.telegram.ui.Cells.o4(context13);
                            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394d6, z6Var2, null);
                        }
                    } else {
                        z6Var2 = new org.telegram.ui.Cells.x9(context13);
                        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394d6, z6Var2, null);
                    }
                } else {
                    z6Var2 = new org.telegram.ui.Cells.z6(context13, (org.telegram.ui.Cells.c0) null);
                }
                return i5.c.q(z6Var2, z6Var2, -1, -2);
            case 17:
                Context context14 = (Context) obj2;
                if (i7 == 0) {
                    x9Var2 = new org.telegram.ui.Cells.o4(context14);
                } else if (i7 == 1) {
                    x9Var2 = new org.telegram.ui.Cells.s8(context14);
                } else if (i7 == 2) {
                    org.telegram.ui.Cells.x9 x9Var5 = new org.telegram.ui.Cells.x9(context14);
                    x9Var5.setCanDisable(true);
                    x9Var2 = x9Var5;
                } else {
                    x9Var2 = new org.telegram.ui.Cells.a9(context14);
                }
                x9Var2.setLayoutParams(new v4.q0(-1, -2));
                return new v4.f1(x9Var2);
            case 18:
                Context context15 = (Context) obj2;
                if (i7 == 0) {
                    u4Var = new org.telegram.ui.Cells.u2(context15, false);
                } else {
                    u4Var = new org.telegram.ui.Cells.u4(context15);
                }
                u4Var.setLayoutParams(new v4.q0(-1, -2));
                return new v4.f1(u4Var);
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
                        org.telegram.ui.Components.ym0 ym0Var = new org.telegram.ui.Components.ym0(context16);
                        frameLayout8.f55610a = ym0Var;
                        ym0Var.setReportChanges(true);
                        ym0Var.setDelegate(new org.telegram.ui.Components.hn((Object) frameLayout8, 9));
                        ym0Var.setImportantForAccessibility(2);
                        frameLayout8.addView(ym0Var, c8.ma.d(-1, 38.0f, 83, 5.0f, 29.0f, 47.0f, 0.0f));
                        frameLayout2 = frameLayout8;
                    }
                } else {
                    frameLayout2 = new org.telegram.ui.Cells.o4(context16);
                }
                frameLayout2.setLayoutParams(new v4.q0(-1, -2));
                return new v4.f1(frameLayout2);
        }
    }

    @Override
    public void y(v4.f1 f1Var) {
        int i7;
        int i10;
        int i11 = this.f49431c;
        Object obj = this.f49432e;
        switch (i11) {
            case 1:
                org.telegram.ui.Components.rn rnVar = (org.telegram.ui.Components.rn) obj;
                sh.e eVar = rnVar.n1;
                boolean z10 = rnVar.f39231n;
                int i12 = f1Var.f59127f;
                View view = f1Var.f59123a;
                CharSequence charSequence = "";
                if (i12 == 4) {
                    org.telegram.ui.Cells.b6 b6Var = (org.telegram.ui.Cells.b6) view;
                    b6Var.setTag(1);
                    CharSequence charSequence2 = rnVar.O;
                    if (charSequence2 != null) {
                        charSequence = charSequence2;
                    }
                    if (z10) {
                        i10 = 2131743818;
                    } else {
                        i10 = 2131746253;
                    }
                    b6Var.o(charSequence, org.telegram.messenger.gd.M0(i10, null), true);
                    b6Var.setTag(null);
                    org.telegram.ui.Components.rn.Q(rnVar, view, f1Var.b());
                    return;
                } else if (i12 == 11) {
                    org.telegram.ui.Cells.b6 b6Var2 = (org.telegram.ui.Cells.b6) view;
                    b6Var2.setTag(1);
                    CharSequence charSequence3 = rnVar.P;
                    if (charSequence3 != null) {
                        charSequence = charSequence3;
                    }
                    b6Var2.o(charSequence, org.telegram.messenger.gd.M0(2131746254, null), false);
                    b6Var2.setTag(null);
                    b6Var2.f30445e.b(eVar.b(-2), false);
                    org.telegram.ui.Components.rn.Q(rnVar, view, f1Var.b());
                    return;
                } else if (i12 == 5) {
                    int b10 = f1Var.b();
                    org.telegram.ui.Cells.b6 b6Var3 = (org.telegram.ui.Cells.b6) view;
                    b6Var3.setTag(1);
                    b6Var3.f30442a.a(rnVar.f39211c0, false);
                    int i13 = b10 - rnVar.f39245u0;
                    CharSequence charSequence4 = rnVar.L[i13];
                    if (z10) {
                        i7 = 2131743820;
                    } else {
                        i7 = 2131747581;
                    }
                    b6Var3.o(charSequence4, org.telegram.messenger.gd.M0(i7, null), true);
                    b6Var3.setTag(null);
                    if (rnVar.f39229l0 == b10) {
                        EditTextBoldCursor textView = b6Var3.getTextView();
                        textView.requestFocus();
                        org.telegram.messenger.g0.I3(textView);
                        rnVar.f39229l0 = -1;
                    }
                    if (!z10) {
                        b6Var3.f30445e.b(eVar.b(i13), false);
                    }
                    org.telegram.ui.Components.rn.Q(rnVar, view, b10);
                    return;
                } else if (i12 == 7) {
                    org.telegram.ui.Cells.b6 b6Var4 = (org.telegram.ui.Cells.b6) view;
                    b6Var4.setTag(1);
                    CharSequence charSequence5 = rnVar.Q;
                    if (charSequence5 != null) {
                        charSequence = charSequence5;
                    }
                    b6Var4.o(charSequence, org.telegram.messenger.gd.M0(2131754472, null), false);
                    b6Var4.setTag(null);
                    if (!z10) {
                        b6Var4.f30445e.b(eVar.b(-3), false);
                    }
                    org.telegram.ui.Components.rn.Q(rnVar, view, f1Var.b());
                    return;
                } else {
                    return;
                }
            case 9:
                if (f1Var.f59127f == 3) {
                    org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) f1Var.f59123a;
                    int b11 = f1Var.b();
                    DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) obj;
                    if (b11 == dataSettingsActivity.F) {
                        s8Var.setChecked(org.telegram.messenger.bz.E0);
                        return;
                    } else if (b11 == dataSettingsActivity.E) {
                        s8Var.setChecked(org.telegram.messenger.bz.B0);
                        return;
                    } else if (b11 == dataSettingsActivity.G) {
                        s8Var.setChecked(org.telegram.messenger.bz.C0);
                        return;
                    } else if (b11 == dataSettingsActivity.H) {
                        s8Var.setChecked(org.telegram.messenger.bz.D0);
                        return;
                    } else if (b11 == dataSettingsActivity.K) {
                        int i14 = org.telegram.messenger.bz.f23145a;
                        s8Var.setChecked(org.telegram.messenger.pc.e(2048));
                        return;
                    } else if (b11 == dataSettingsActivity.L) {
                        int i15 = org.telegram.messenger.bz.f23145a;
                        s8Var.setChecked(org.telegram.messenger.pc.e(1024));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 16:
                ProxyListActivity proxyListActivity = (ProxyListActivity) obj;
                if (f1Var.f59127f == 3) {
                    org.telegram.ui.Cells.s8 s8Var2 = (org.telegram.ui.Cells.s8) f1Var.f59123a;
                    int b12 = f1Var.b();
                    if (b12 == ProxyListActivity.g0(proxyListActivity)) {
                        s8Var2.setChecked(proxyListActivity.d);
                        return;
                    } else if (b12 == proxyListActivity.f43701w) {
                        s8Var2.setChecked(org.telegram.messenger.bz.f23147a1);
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
    public void z(v4.f1 f1Var) {
        switch (this.f49431c) {
            case 1:
                org.telegram.ui.Components.rn rnVar = (org.telegram.ui.Components.rn) this.f49432e;
                int i7 = f1Var.f59127f;
                if (i7 == 4 || i7 == 11 || i7 == 5) {
                    EditTextBoldCursor textView = ((org.telegram.ui.Cells.b6) f1Var.f59123a).getTextView();
                    if (textView.isFocused()) {
                        if (rnVar.J) {
                            org.telegram.ui.Components.in inVar = rnVar.f39251y;
                            if (inVar != null) {
                                inVar.f();
                            }
                            rnVar.e0(true);
                        }
                        rnVar.f39222h1 = null;
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
        this.f49431c = 19;
        this.f49432e = iVar;
        this.d = launchActivity;
    }

    public l4(Context context) {
        this.f49431c = 18;
        this.d = context;
        ArrayList arrayList = new ArrayList();
        this.f49432e = arrayList;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        org.telegram.ui.Cells.p2 p2Var = new org.telegram.ui.Cells.p2();
        p2Var.f31196a = org.telegram.messenger.gd.M0(2131743936, null);
        p2Var.f31197b = org.telegram.messenger.gd.M0(2131743928, null);
        p2Var.f31198c = 0;
        p2Var.d = 0;
        p2Var.f31199e = true;
        p2Var.f31200f = false;
        p2Var.f31201g = 0;
        p2Var.h = currentTimeMillis;
        p2Var.f31202i = false;
        p2Var.f31203j = false;
        p2Var.f31204k = 2;
        arrayList.add(p2Var);
        org.telegram.ui.Cells.p2 p2Var2 = new org.telegram.ui.Cells.p2();
        p2Var2.f31196a = org.telegram.messenger.gd.M0(2131743935, null);
        p2Var2.f31197b = org.telegram.messenger.gd.M0(2131743927, null);
        p2Var2.f31198c = 1;
        p2Var2.d = 2;
        p2Var2.f31199e = false;
        p2Var2.f31200f = false;
        p2Var2.f31201g = 0;
        p2Var2.h = currentTimeMillis - 3600;
        p2Var2.f31202i = false;
        p2Var2.f31203j = false;
        p2Var2.f31204k = -1;
        arrayList.add(p2Var2);
        org.telegram.ui.Cells.p2 p2Var3 = new org.telegram.ui.Cells.p2();
        p2Var3.f31196a = org.telegram.messenger.gd.M0(2131743934, null);
        p2Var3.f31197b = org.telegram.messenger.gd.M0(2131743926, null);
        p2Var3.f31198c = 2;
        p2Var3.d = 3;
        p2Var3.f31199e = false;
        p2Var3.f31200f = true;
        p2Var3.f31201g = 0;
        p2Var3.h = currentTimeMillis - 7200;
        p2Var3.f31202i = false;
        p2Var3.f31203j = true;
        p2Var3.f31204k = -1;
        arrayList.add(p2Var3);
        org.telegram.ui.Cells.p2 p2Var4 = new org.telegram.ui.Cells.p2();
        p2Var4.f31196a = org.telegram.messenger.gd.M0(2131743933, null);
        p2Var4.f31197b = org.telegram.messenger.gd.M0(2131743925, null);
        p2Var4.f31198c = 3;
        p2Var4.d = 0;
        p2Var4.f31199e = false;
        p2Var4.f31200f = false;
        p2Var4.f31201g = 2;
        p2Var4.h = currentTimeMillis - 10800;
        p2Var4.f31202i = false;
        p2Var4.f31203j = false;
        p2Var4.f31204k = -1;
        arrayList.add(p2Var4);
        org.telegram.ui.Cells.p2 p2Var5 = new org.telegram.ui.Cells.p2();
        p2Var5.f31196a = org.telegram.messenger.gd.M0(2131743932, null);
        p2Var5.f31197b = org.telegram.messenger.gd.M0(2131743924, null);
        p2Var5.f31198c = 4;
        p2Var5.d = 0;
        p2Var5.f31199e = false;
        p2Var5.f31200f = false;
        p2Var5.f31201g = 1;
        p2Var5.h = currentTimeMillis - 14400;
        p2Var5.f31202i = false;
        p2Var5.f31203j = false;
        p2Var5.f31204k = 2;
        arrayList.add(p2Var5);
        org.telegram.ui.Cells.p2 p2Var6 = new org.telegram.ui.Cells.p2();
        p2Var6.f31196a = org.telegram.messenger.gd.M0(2131743931, null);
        p2Var6.f31197b = org.telegram.messenger.gd.M0(2131743923, null);
        p2Var6.f31198c = 5;
        p2Var6.d = 0;
        p2Var6.f31199e = false;
        p2Var6.f31200f = false;
        p2Var6.f31201g = 0;
        p2Var6.h = currentTimeMillis - 18000;
        p2Var6.f31202i = false;
        p2Var6.f31203j = false;
        p2Var6.f31204k = -1;
        arrayList.add(p2Var6);
        org.telegram.ui.Cells.p2 p2Var7 = new org.telegram.ui.Cells.p2();
        p2Var7.f31196a = org.telegram.messenger.gd.M0(2131743930, null);
        p2Var7.f31197b = org.telegram.messenger.gd.M0(2131743922, null);
        p2Var7.f31198c = 6;
        p2Var7.d = 0;
        p2Var7.f31199e = false;
        p2Var7.f31200f = false;
        p2Var7.f31201g = 0;
        p2Var7.h = currentTimeMillis - 21600;
        p2Var7.f31202i = true;
        p2Var7.f31203j = false;
        p2Var7.f31204k = -1;
        arrayList.add(p2Var7);
        org.telegram.ui.Cells.p2 p2Var8 = new org.telegram.ui.Cells.p2();
        p2Var8.f31196a = org.telegram.messenger.gd.M0(2131743929, null);
        p2Var8.f31197b = org.telegram.messenger.gd.M0(2131743921, null);
        p2Var8.f31198c = 0;
        p2Var8.d = 0;
        p2Var8.f31199e = false;
        p2Var8.f31200f = false;
        p2Var8.f31201g = 0;
        p2Var8.h = currentTimeMillis - 25200;
        p2Var8.f31202i = true;
        p2Var8.f31203j = false;
        p2Var8.f31204k = -1;
        arrayList.add(p2Var8);
    }

    public l4(ProxyListActivity proxyListActivity, Context context) {
        this.f49431c = 16;
        this.f49432e = proxyListActivity;
        this.d = context;
        C(true);
    }
}
