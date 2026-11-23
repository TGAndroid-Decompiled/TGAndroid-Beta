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
public final class l4 extends org.telegram.ui.Components.dk0 {
    public final int f49582c;
    public final Object d;
    public final Object f49583e;

    public l4(int i7, Object obj, Object obj2) {
        this.f49582c = i7;
        this.f49583e = obj;
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
        an0 an0Var = (an0) this.f49583e;
        org.telegram.messenger.ue ueVar = an0Var.K;
        ArrayList arrayList = an0Var.f45760n;
        ArrayList arrayList2 = an0Var.f45747c;
        HashMap hashMap = an0Var.f45745b;
        int i10 = f1Var.f59249f;
        View view = f1Var.f59245a;
        int i11 = -1;
        int i12 = 0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                        if (i7 < arrayList.size()) {
                            m8Var.o(2131232332, (CharSequence) arrayList.get(i7), false);
                            return;
                        } else {
                            m8Var.o(2131232099, org.telegram.messenger.gd.N0(2131752055, null), false);
                            return;
                        }
                    }
                    return;
                }
                org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) ueVar.f27262e.get(i7);
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                h7Var.setPhotoEntry(efVar);
                h7Var.b(hashMap.containsKey(Integer.valueOf(efVar.C)), false);
                h7Var.setTag(Integer.valueOf(i7));
                return;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -1;
                layoutParams.height = an0Var.S;
                view.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) view;
        r5Var.setItemSize(an0Var.S);
        org.telegram.ui.Components.p9 imageView = r5Var.getImageView();
        r5Var.setTag(Integer.valueOf(i7));
        imageView.r();
        if (ueVar != null) {
            org.telegram.messenger.ef efVar2 = (org.telegram.messenger.ef) ueVar.f27262e.get(i7);
            if (arrayList2.size() > 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            r5Var.d(efVar2, z10, true, false, false);
            int i13 = efVar2.C;
            if (an0Var.f45750e) {
                i11 = arrayList2.indexOf(Integer.valueOf(i13));
            }
            r5Var.b(i11, hashMap.containsKey(Integer.valueOf(i13)), false);
            K1 = PhotoViewer.K1(efVar2.I);
        } else {
            org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) an0Var.f45752f.get(i7);
            r5Var.e(hfVar);
            r5Var.getVideoInfoContainer().setVisibility(4);
            if (an0Var.f45750e) {
                i11 = arrayList2.indexOf(hfVar.B);
            }
            r5Var.b(i11, hashMap.containsKey(hfVar.B), false);
            K1 = PhotoViewer.K1(hfVar.g());
        }
        imageView.getImageReceiver().P0(!K1, true);
        r5Var.getCheckBox().setVisibility((an0Var.U != 0 || K1) ? 8 : 8);
    }

    private final void J(v4.f1 f1Var, int i7) {
        int i10;
        PhotoViewer photoViewer = (PhotoViewer) this.f49583e;
        Context context = (Context) this.d;
        org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) f1Var.f59245a;
        int L = org.telegram.messenger.g0.L(85.0f);
        if (i7 != 0) {
            i10 = org.telegram.messenger.g0.L(6.0f);
        } else {
            i10 = 0;
        }
        x5Var.f32415f = L;
        org.telegram.ui.Components.lp lpVar = x5Var.f32413c;
        org.telegram.ui.Components.p9 p9Var = x5Var.f32411a;
        di.n4 n4Var = x5Var.f32414e;
        x5Var.h = i10;
        ((FrameLayout.LayoutParams) x5Var.f32412b.getLayoutParams()).rightMargin = i10;
        ((FrameLayout.LayoutParams) p9Var.getLayoutParams()).rightMargin = i10;
        ((FrameLayout.LayoutParams) n4Var.getLayoutParams()).rightMargin = i10;
        p9Var.r();
        Object obj = photoViewer.d.v().get(photoViewer.d.c().get(i7));
        if (obj instanceof org.telegram.messenger.ef) {
            org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj;
            int i11 = efVar.C;
            String str = efVar.I;
            x5Var.setTag(efVar);
            n4Var.setVisibility(4);
            String str2 = efVar.f27964c;
            if (str2 != null) {
                p9Var.h(str2, null, context.getResources().getDrawable(2131232455));
            } else if (str != null) {
                p9Var.s(efVar.J, efVar.K, true);
                if (efVar.f27963b && !efVar.d()) {
                    n4Var.setVisibility(0);
                    x5Var.d.setText(org.telegram.messenger.g0.g0(efVar.E, false, false));
                    p9Var.h("vthumb://" + i11 + ":" + str, null, context.getResources().getDrawable(2131232455));
                } else {
                    p9Var.h("thumb://" + i11 + ":" + str, null, context.getResources().getDrawable(2131232455));
                }
            } else {
                p9Var.setImageResource(2131232455);
            }
            lpVar.f37189a.f(-1, true, false);
            lpVar.setVisibility(0);
        } else if (obj instanceof org.telegram.messenger.hf) {
            org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) obj;
            x5Var.setTag(hfVar);
            x5Var.setImage(hfVar);
            n4Var.setVisibility(4);
            lpVar.f37189a.f(-1, true, false);
            lpVar.setVisibility(0);
        }
    }

    private final void K(v4.f1 f1Var, int i7) {
        boolean z10;
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.f49583e;
        ArrayList arrayList = proxyListActivity.F;
        ArrayList arrayList2 = proxyListActivity.G;
        int i10 = f1Var.f59249f;
        View view = f1Var.f59245a;
        boolean z11 = true;
        switch (i10) {
            case 1:
                org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) view;
                org.telegram.ui.ActionBar.u6.U(w9Var.getTextView(), org.telegram.ui.ActionBar.n6.G6, null);
                if (i7 == ProxyListActivity.f0(proxyListActivity)) {
                    String N0 = org.telegram.messenger.gd.N0(2131754388, null);
                    if (proxyListActivity.E == -1) {
                        z11 = false;
                    }
                    w9Var.b(N0, z11);
                    return;
                } else if (i7 == proxyListActivity.E) {
                    org.telegram.ui.ActionBar.u6.U(w9Var.getTextView(), org.telegram.ui.ActionBar.n6.f29672p7, null);
                    w9Var.b(org.telegram.messenger.gd.N0(2131751568, null), false);
                    return;
                } else {
                    return;
                }
            case 2:
                org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
                if (i7 == proxyListActivity.h) {
                    o4Var.setText(org.telegram.messenger.gd.N0(2131746409, null));
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                if (i7 == ProxyListActivity.g0(proxyListActivity)) {
                    String N02 = org.telegram.messenger.gd.N0(2131743536, null);
                    boolean z12 = proxyListActivity.d;
                    if (proxyListActivity.f43827w == -1) {
                        z11 = false;
                    }
                    r8Var.f(N02, z12, z11);
                    return;
                } else if (i7 == proxyListActivity.f43827w) {
                    r8Var.f(org.telegram.messenger.gd.N0(2131743538, null), org.telegram.messenger.bz.f23272a1, true);
                    return;
                } else {
                    return;
                }
            case 4:
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                if (i7 == proxyListActivity.f43829y) {
                    z8Var.setText(org.telegram.messenger.gd.N0(2131746407, null));
                    return;
                }
                return;
            case 5:
                px0 px0Var = (px0) view;
                org.telegram.messenger.az azVar = (org.telegram.messenger.az) arrayList2.get(i7 - proxyListActivity.f43824n);
                px0Var.setProxy(azVar);
                if (org.telegram.messenger.bz.B1 == azVar) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                px0Var.setChecked(z10);
                boolean contains = arrayList.contains(arrayList2.get(i7 - proxyListActivity.f43824n));
                px0Var.h = contains;
                px0Var.f51169f.a(contains, false);
                px0Var.a(!arrayList.isEmpty(), false);
                return;
            case 6:
                if (i7 == proxyListActivity.f43828x) {
                    org.telegram.ui.Components.gu0 gu0Var = (org.telegram.ui.Components.gu0) view;
                    ArrayList arrayList3 = new ArrayList(org.telegram.messenger.kt.d);
                    String[] strArr = new String[arrayList3.size()];
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        strArr[i11] = org.telegram.messenger.gd.a0(null, null, 2131746406, arrayList3.get(i11));
                    }
                    gu0Var.setCallback(new l60(12));
                    gu0Var.b(org.telegram.messenger.bz.f23275b1, null, strArr);
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final void L(v4.f1 f1Var, int i7) {
        String N0;
        String N02;
        boolean z10;
        String N03;
        boolean e10 = org.telegram.ui.Components.e50.e(yy0.d0((yy0) this.f49583e));
        int i10 = f1Var.f59249f;
        if (i10 == 0) {
            org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) f1Var.f59245a;
            if (i7 == 0) {
                N03 = org.telegram.messenger.gd.N0(2131745792, null);
            } else {
                N03 = org.telegram.messenger.gd.N0(2131745796, null);
            }
            o4Var.setText(N03);
        } else if (i10 == 1) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) f1Var.f59245a;
            if (i7 != 1 && !e10) {
                z10 = false;
            } else {
                z10 = true;
            }
            r8Var.setEnabled(z10);
            if (i7 == 1) {
                r8Var.f(org.telegram.messenger.gd.N0(2131745788, null), e10, false);
                return;
            }
            String N04 = org.telegram.messenger.gd.N0(2131745795, null);
            aj.a aVar = aj.e.f1626i;
            aVar.a();
            r8Var.f(N04, aVar.d, false);
        } else if (i10 == 2) {
            org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) f1Var.f59245a;
            w9Var.setEnabled(e10);
            if (i7 == 2) {
                w9Var.c(org.telegram.messenger.gd.N0(2131745790, null), a8.p0.n(((zi.s0) aj.e.f1623e.a()).f62385a, "p", new StringBuilder()), false, true);
            } else if (i7 == 3) {
                String N05 = org.telegram.messenger.gd.N0(2131745800, null);
                zi.o0 o0Var = (zi.o0) aj.e.f1624f.a();
                if (o0Var == zi.o0.f62364a) {
                    N02 = org.telegram.messenger.gd.N0(2131745799, null);
                } else if (o0Var == zi.o0.f62365b) {
                    N02 = org.telegram.messenger.gd.N0(2131745797, null);
                } else {
                    N02 = org.telegram.messenger.gd.N0(2131745798, null);
                }
                w9Var.c(N05, N02, false, true);
            } else if (i7 == 4) {
                w9Var.c(org.telegram.messenger.gd.N0(2131745793, null), a8.p0.n(((zi.p0) aj.e.f1625g.a()).f62371a, " FPS", new StringBuilder()), false, true);
            } else {
                w9Var.c(org.telegram.messenger.gd.N0(2131745801, null), yy0.f0(aj.e.h.a()), false, false);
            }
        } else {
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) f1Var.f59245a;
            if (i7 == 6) {
                N0 = org.telegram.messenger.gd.N0(2131745791, null);
            } else {
                N0 = org.telegram.messenger.gd.N0(2131745794, null);
            }
            z8Var.setText(N0);
        }
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        switch (this.f49582c) {
            case 0:
                int b10 = f1Var.b();
                if (b10 == 1) {
                    return true;
                }
                if (MediaController.s0(yy0.c0((yy0) this.f49583e)) && b10 == 2) {
                    return true;
                }
                return false;
            case 1:
                int b11 = f1Var.b();
                org.telegram.ui.Components.qn qnVar = (org.telegram.ui.Components.qn) this.f49583e;
                if (b11 != qnVar.f38948v0 && b11 != qnVar.H0 && b11 != qnVar.C0 && b11 != qnVar.G0 && b11 != qnVar.D0 && b11 != qnVar.I0 && b11 != qnVar.E0 && b11 != qnVar.F0 && b11 != qnVar.J0 && b11 != qnVar.K0 && b11 != qnVar.O0.f3325b && b11 != qnVar.N0.f3325b && b11 != qnVar.M0) {
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
                if (f1Var.f59249f == 0) {
                    return true;
                }
                return false;
            case 6:
                return true;
            case 7:
                return true;
            case 8:
                int b12 = f1Var.b();
                DataAutoDownloadActivity dataAutoDownloadActivity = (DataAutoDownloadActivity) this.f49583e;
                if (b12 != DataAutoDownloadActivity.n0(dataAutoDownloadActivity) && b12 != DataAutoDownloadActivity.o0(dataAutoDownloadActivity) && b12 != DataAutoDownloadActivity.g0(dataAutoDownloadActivity) && b12 != DataAutoDownloadActivity.p0(dataAutoDownloadActivity)) {
                    return false;
                }
                return true;
            case 9:
                int b13 = f1Var.b();
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.f49583e;
                if (b13 != dataSettingsActivity.f43135e && b13 != dataSettingsActivity.f43136f && b13 != dataSettingsActivity.h && b13 != dataSettingsActivity.f43139s && b13 != DataSettingsActivity.c0(dataSettingsActivity) && b13 != dataSettingsActivity.f43140w && b13 != DataSettingsActivity.d0(dataSettingsActivity) && b13 != DataSettingsActivity.e0(dataSettingsActivity) && b13 != dataSettingsActivity.F && b13 != dataSettingsActivity.E && b13 != dataSettingsActivity.G && b13 != dataSettingsActivity.H && b13 != dataSettingsActivity.L && b13 != dataSettingsActivity.K && b13 != dataSettingsActivity.f43137n && b13 != DataSettingsActivity.h0(dataSettingsActivity) && b13 != DataSettingsActivity.f0(dataSettingsActivity) && b13 != DataSettingsActivity.j0(dataSettingsActivity) && b13 != DataSettingsActivity.b0(dataSettingsActivity)) {
                    return false;
                }
                return true;
            case 10:
                int b14 = f1Var.b();
                fe0 fe0Var = (fe0) this.f49583e;
                if (b14 != fe0Var.f47807c && b14 != fe0Var.d && b14 != fe0Var.f47808e && b14 != fe0Var.f47809f && b14 != fe0Var.h && b14 != fe0Var.f47811r) {
                    return false;
                }
                return true;
            case 11:
                int b15 = f1Var.b();
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.f49583e;
                if (b15 != notificationsSettingsActivity.f43257y && b15 != notificationsSettingsActivity.E && b15 != notificationsSettingsActivity.F && b15 != notificationsSettingsActivity.L && b15 != notificationsSettingsActivity.N && b15 != notificationsSettingsActivity.T && b15 != notificationsSettingsActivity.O && b15 != notificationsSettingsActivity.M && b15 != notificationsSettingsActivity.S && b15 != notificationsSettingsActivity.G && b15 != notificationsSettingsActivity.H && b15 != notificationsSettingsActivity.P && b15 != notificationsSettingsActivity.f43253r && b15 != notificationsSettingsActivity.f43254s && b15 != notificationsSettingsActivity.U && b15 != notificationsSettingsActivity.K) {
                    return true;
                }
                return false;
            case 12:
                int b16 = f1Var.b();
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f49583e;
                if (b16 != PasscodeActivity.c0(passcodeActivity) && b16 != PasscodeActivity.d0(passcodeActivity) && b16 != passcodeActivity.O && b16 != PasscodeActivity.e0(passcodeActivity) && b16 != PasscodeActivity.f0(passcodeActivity) && b16 != passcodeActivity.K && b16 != passcodeActivity.L) {
                    return false;
                }
                return true;
            case 13:
                return true;
            case 14:
                an0 an0Var = (an0) this.f49583e;
                if (an0Var.K == null && (!TextUtils.isEmpty(an0Var.f45772w) ? f1Var.b() >= an0Var.f45752f.size() : f1Var.f59249f != 3)) {
                    return false;
                }
                return true;
            case 15:
                return false;
            case 16:
                int b17 = f1Var.b();
                ProxyListActivity proxyListActivity = (ProxyListActivity) this.f49583e;
                if (b17 != ProxyListActivity.g0(proxyListActivity) && b17 != proxyListActivity.f43827w && b17 != ProxyListActivity.f0(proxyListActivity) && b17 != proxyListActivity.E && (b17 < proxyListActivity.f43824n || b17 >= proxyListActivity.f43825r)) {
                    return false;
                }
                return true;
            case 17:
                int b18 = f1Var.b();
                if (b18 == 1) {
                    return true;
                }
                if (org.telegram.ui.Components.e50.e(yy0.b0((yy0) this.f49583e)) && (b18 == 2 || b18 == 3 || b18 == 4 || b18 == 5 || b18 == 8)) {
                    return true;
                }
                return false;
            case 18:
                if (f1Var.f59249f != 1) {
                    return true;
                }
                return false;
            default:
                if (p1.g.d(3)[f1Var.f59249f] == 1) {
                    return true;
                }
                return false;
        }
    }

    public void E() {
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.f49583e;
        int size = proxyListActivity.F.size();
        boolean x10 = ProxyListActivity.b0(proxyListActivity).x();
        if (size > 0) {
            ProxyListActivity.c0(proxyListActivity).D(size, x10);
            if (!x10) {
                ProxyListActivity.d0(proxyListActivity).I();
                int i7 = proxyListActivity.f43824n;
                n(i7, proxyListActivity.f43825r - i7, 2);
            }
        } else if (x10) {
            ProxyListActivity.e0(proxyListActivity).w();
            int i10 = proxyListActivity.f43824n;
            n(i10, proxyListActivity.f43825r - i10, 2);
        }
    }

    public void F() {
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.f49583e;
        proxyListActivity.F.clear();
        int i7 = proxyListActivity.f43824n;
        n(i7, proxyListActivity.f43825r - i7, 1);
        E();
    }

    public void M(int i7) {
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.f49583e;
        ArrayList arrayList = proxyListActivity.F;
        int i10 = proxyListActivity.f43824n;
        if (i7 >= i10 && i7 < proxyListActivity.f43825r) {
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
        switch (this.f49582c) {
            case 0:
                return 4;
            case 1:
                return ((org.telegram.ui.Components.qn) this.f49583e).R0;
            case 2:
                return ((org.telegram.ui.Components.oz) this.f49583e).h.size();
            case 3:
                int size = ((org.telegram.ui.Components.pz) this.f49583e).f38629v1.size();
                if (size < 10) {
                    return size + 1;
                }
                return size;
            case 4:
                return ((org.telegram.ui.Components.de0) this.f49583e).G;
            case 5:
                return org.telegram.messenger.qd.g() + 1;
            case 6:
                ArrayList arrayList = ((org.telegram.ui.Components.zw0) this.d).f43070x;
                if (arrayList == null) {
                    return 0;
                }
                return arrayList.size();
            case 7:
                return ((org.telegram.ui.Components.j71) this.f49583e).h.size();
            case 8:
                return ((DataAutoDownloadActivity) this.f49583e).f43131y;
            case 9:
                return ((DataSettingsActivity) this.f49583e).U;
            case 10:
                return ((fe0) this.f49583e).f47813w;
            case 11:
                return ((NotificationsSettingsActivity) this.f49583e).V;
            case 12:
                return ((PasscodeActivity) this.f49583e).Q;
            case 13:
                om0 om0Var = (om0) this.f49583e;
                ArrayList arrayList2 = om0Var.d;
                if (arrayList2 != null) {
                    return (int) Math.ceil(arrayList2.size() / om0Var.f50721f);
                }
                return 0;
            case 14:
                an0 an0Var = (an0) this.f49583e;
                org.telegram.messenger.ue ueVar = an0Var.K;
                if (ueVar == null) {
                    if (an0Var.f45752f.isEmpty()) {
                        if (!TextUtils.isEmpty(an0Var.f45772w) || an0Var.f45760n.isEmpty()) {
                            return 0;
                        }
                        return an0Var.f45760n.size() + 2;
                    }
                    return an0Var.f45752f.size() + (!an0Var.f45767s ? 1 : 0);
                }
                return ueVar.f27262e.size();
            case 15:
                PhotoViewer photoViewer = (PhotoViewer) this.f49583e;
                uq0 uq0Var = photoViewer.d;
                if (uq0Var != null && uq0Var.c() != null) {
                    return photoViewer.d.c().size();
                }
                return 0;
            case 16:
                return ((ProxyListActivity) this.f49583e).f43822e;
            case 17:
                return 7;
            case 18:
                return ((ArrayList) this.f49583e).size();
            default:
                return ((pg.i) this.f49583e).F.size();
        }
    }

    @Override
    public long c(int i7) {
        int i10;
        switch (this.f49582c) {
            case 2:
                i10 = ((org.telegram.ui.Components.oz) this.f49583e).f38305l0.get(i7);
                break;
            case 4:
                return i7;
            case 6:
                ArrayList arrayList = ((org.telegram.ui.Components.zw0) this.d).f43070x;
                if (arrayList == null) {
                    return 0L;
                }
                return ((org.telegram.messenger.ni) arrayList.get(i7)).f26023a.hashCode();
            case 7:
                i10 = ((org.telegram.ui.Components.g71) ((org.telegram.ui.Components.j71) this.f49583e).h.get(i7)).f35349a;
                break;
            case 14:
                return i7;
            case 16:
                ProxyListActivity proxyListActivity = (ProxyListActivity) this.f49583e;
                if (i7 == proxyListActivity.f43823f) {
                    return -1L;
                }
                if (i7 == proxyListActivity.f43826s) {
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
                if (i7 == proxyListActivity.f43827w) {
                    return -9L;
                }
                if (i7 == proxyListActivity.f43828x) {
                    return -10L;
                }
                if (i7 == proxyListActivity.f43829y) {
                    return -11L;
                }
                int i11 = proxyListActivity.f43824n;
                if (i7 >= i11 && i7 < proxyListActivity.f43825r) {
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
        switch (this.f49582c) {
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
                org.telegram.ui.Components.qn qnVar = (org.telegram.ui.Components.qn) this.f49583e;
                if (i7 != qnVar.C0 && i7 != qnVar.G0 && i7 != qnVar.H0 && i7 != qnVar.D0 && i7 != qnVar.E0 && i7 != qnVar.F0 && i7 != qnVar.I0 && i7 != qnVar.N0.f3325b && i7 != qnVar.O0.f3325b) {
                    if (i7 != qnVar.m0 && i7 != qnVar.f38946t0 && i7 != qnVar.f38952x0 && i7 != qnVar.f38937p0) {
                        if (i7 == qnVar.f38945s0) {
                            return 1;
                        }
                        if (i7 != qnVar.f38950w0 && i7 != qnVar.f38954y0 && i7 != qnVar.f38942r0 && i7 != qnVar.L0) {
                            if (i7 != qnVar.f38948v0 && i7 != qnVar.J0 && i7 != qnVar.M0) {
                                if (i7 == qnVar.f38934n0) {
                                    return 4;
                                }
                                if (i7 == qnVar.f38935o0) {
                                    return 11;
                                }
                                if (i7 == qnVar.f38939q0) {
                                    return 7;
                                }
                                if (i7 != qnVar.f38955z0 && i7 != qnVar.A0 && i7 != qnVar.K0) {
                                    if (i7 == qnVar.B0) {
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
                org.telegram.ui.Components.de0 de0Var = (org.telegram.ui.Components.de0) this.f49583e;
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
                DataAutoDownloadActivity dataAutoDownloadActivity = (DataAutoDownloadActivity) this.f49583e;
                if (i7 == DataAutoDownloadActivity.c0(dataAutoDownloadActivity)) {
                    return 0;
                }
                if (i7 == dataAutoDownloadActivity.f43128s) {
                    return 1;
                }
                if (i7 != dataAutoDownloadActivity.f43127r && i7 != dataAutoDownloadActivity.f43129w) {
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
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.f49583e;
                if (i7 != dataSettingsActivity.f43138r && i7 != dataSettingsActivity.f43141x && i7 != dataSettingsActivity.O && i7 != dataSettingsActivity.Q && i7 != dataSettingsActivity.M && i7 != dataSettingsActivity.R && i7 != dataSettingsActivity.T) {
                    if (i7 != dataSettingsActivity.d && i7 != dataSettingsActivity.f43142y && i7 != dataSettingsActivity.N && i7 != 0 && i7 != dataSettingsActivity.P && i7 != dataSettingsActivity.J && i7 != dataSettingsActivity.S) {
                        if (i7 != dataSettingsActivity.F && i7 != dataSettingsActivity.E && i7 != dataSettingsActivity.G && i7 != dataSettingsActivity.H && i7 != dataSettingsActivity.K && i7 != dataSettingsActivity.L) {
                            if (i7 == dataSettingsActivity.I) {
                                return 4;
                            }
                            if (i7 != dataSettingsActivity.f43135e && i7 != dataSettingsActivity.h && i7 != dataSettingsActivity.f43136f && i7 != DataSettingsActivity.h0(dataSettingsActivity) && i7 != DataSettingsActivity.f0(dataSettingsActivity) && i7 != DataSettingsActivity.j0(dataSettingsActivity)) {
                                if (i7 != dataSettingsActivity.f43139s && i7 != dataSettingsActivity.f43140w && i7 != dataSettingsActivity.f43137n) {
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
                fe0 fe0Var = (fe0) this.f49583e;
                fe0Var.getClass();
                if (i7 == 0) {
                    return 0;
                }
                if (i7 != fe0Var.f47807c && i7 != fe0Var.d && i7 != fe0Var.f47808e && i7 != fe0Var.f47809f && i7 != fe0Var.h) {
                    if (i7 == fe0Var.f47810n) {
                        return 2;
                    }
                    if (i7 == fe0Var.f47811r) {
                        return 3;
                    }
                    return 4;
                }
                return 1;
            case 11:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.f49583e;
                if (i7 != notificationsSettingsActivity.L && i7 != notificationsSettingsActivity.N && i7 != notificationsSettingsActivity.T && i7 != notificationsSettingsActivity.H && i7 != notificationsSettingsActivity.O && i7 != notificationsSettingsActivity.F && i7 != notificationsSettingsActivity.f43257y && i7 != notificationsSettingsActivity.f43253r) {
                    i10 = notificationsSettingsActivity.inappSoundRow;
                    if (i7 != i10) {
                        i11 = notificationsSettingsActivity.inappVibrateRow;
                        if (i7 != i11 && i7 != notificationsSettingsActivity.f43256x) {
                            i12 = notificationsSettingsActivity.inappPreviewRow;
                            if (i7 != i12) {
                                i13 = notificationsSettingsActivity.contactJoinedRow;
                                if (i7 != i13) {
                                    i14 = notificationsSettingsActivity.pinnedMessageRow;
                                    if (i7 != i14 && i7 != notificationsSettingsActivity.f43255w) {
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
                                                                                            if (i7 == notificationsSettingsActivity.f43254s) {
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
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f49583e;
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
                an0 an0Var = (an0) this.f49583e;
                if (an0Var.Z) {
                    return 2;
                }
                if (an0Var.K == null) {
                    if (an0Var.f45752f.isEmpty()) {
                        if (i7 == an0Var.f45760n.size()) {
                            return 4;
                        }
                        return 3;
                    } else if (i7 >= an0Var.f45752f.size()) {
                        return 1;
                    }
                }
                return 0;
            case 15:
                return 0;
            case 16:
                ProxyListActivity proxyListActivity = (ProxyListActivity) this.f49583e;
                if (i7 != proxyListActivity.f43823f && i7 != proxyListActivity.f43826s) {
                    if (i7 != ProxyListActivity.f0(proxyListActivity) && i7 != proxyListActivity.E) {
                        if (i7 != ProxyListActivity.g0(proxyListActivity) && i7 != proxyListActivity.f43827w) {
                            if (i7 == proxyListActivity.h) {
                                return 2;
                            }
                            if (i7 == proxyListActivity.f43828x) {
                                return 6;
                            }
                            if (i7 >= proxyListActivity.f43824n && i7 < proxyListActivity.f43825r) {
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
                if (i7 == ((ArrayList) this.f49583e).size()) {
                    return 1;
                }
                return 0;
            case 19:
                return p1.g.c(((pg.a) ((pg.i) this.f49583e).F.get(i7)).f55717b);
        }
    }

    @Override
    public final void t(v4.f1 r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l4.t(v4.f1, int):void");
    }

    @Override
    public void v(v4.f1 f1Var, int i7, List list) {
        boolean contains;
        switch (this.f49582c) {
            case 16:
                ProxyListActivity proxyListActivity = (ProxyListActivity) this.f49583e;
                ArrayList arrayList = proxyListActivity.F;
                int i10 = f1Var.f59249f;
                View view = f1Var.f59245a;
                if (i10 == 5 && !list.isEmpty()) {
                    px0 px0Var = (px0) view;
                    if (list.contains(1) && (contains = arrayList.contains(proxyListActivity.G.get(i7 - proxyListActivity.f43824n))) != px0Var.h) {
                        px0Var.h = contains;
                        px0Var.f51169f.a(contains, true);
                    }
                    if (list.contains(2)) {
                        px0Var.a(!arrayList.isEmpty(), true);
                        return;
                    }
                    return;
                } else if (f1Var.f59249f == 3 && list.contains(0)) {
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    if (i7 == ProxyListActivity.g0(proxyListActivity)) {
                        r8Var.setChecked(proxyListActivity.d);
                        return;
                    } else if (i7 == proxyListActivity.f43827w) {
                        r8Var.setChecked(org.telegram.messenger.bz.f23272a1);
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
        org.telegram.ui.Cells.w9 w9Var;
        org.telegram.ui.Components.on o4Var;
        View view;
        org.telegram.ui.Cells.s5 s5Var;
        FrameLayout frameLayout;
        org.telegram.ui.Components.gu0 gu0Var;
        View y6Var;
        org.telegram.ui.Cells.y8 y8Var;
        View o4Var2;
        org.telegram.ui.ActionBar.i6 i6Var;
        View view2;
        org.telegram.ui.ActionBar.i6 i6Var2;
        org.telegram.ui.ActionBar.i6 i6Var3;
        org.telegram.ui.ActionBar.i6 i6Var4;
        org.telegram.ui.ActionBar.i6 i6Var5;
        View r8Var;
        org.telegram.ui.Cells.m8 m8Var;
        View y6Var2;
        org.telegram.ui.Cells.w9 w9Var2;
        View u4Var;
        FrameLayout frameLayout2;
        int i10 = this.f49582c;
        int i11 = 8;
        Object obj = this.f49583e;
        Object obj2 = this.d;
        switch (i10) {
            case 0:
                Context context = (Context) obj2;
                if (i7 == 0) {
                    w9Var = new org.telegram.ui.Cells.o4(context);
                } else if (i7 == 1) {
                    w9Var = new org.telegram.ui.Cells.r8(context);
                } else if (i7 == 2) {
                    org.telegram.ui.Cells.w9 w9Var3 = new org.telegram.ui.Cells.w9(context);
                    w9Var3.setCanDisable(true);
                    w9Var = w9Var3;
                } else {
                    w9Var = new org.telegram.ui.Cells.z8(context);
                }
                w9Var.setLayoutParams(new v4.q0(-1, -2));
                return new v4.f1(w9Var);
            case 1:
                Context context2 = (Context) obj2;
                org.telegram.ui.Components.qn qnVar = (org.telegram.ui.Components.qn) obj;
                boolean z10 = qnVar.f38933n;
                org.telegram.ui.ActionBar.i6 i6Var6 = qnVar.f37134a;
                switch (i7) {
                    case 0:
                        o4Var = new org.telegram.ui.Cells.o4((Context) obj2, org.telegram.ui.ActionBar.n6.L6, 21, 15, false, qnVar.f37134a);
                        break;
                    case 1:
                        View y6Var3 = new org.telegram.ui.Cells.y6(context2, (org.telegram.ui.Cells.c0) null);
                        new org.telegram.ui.Components.lq(new ColorDrawable(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29394a7, i6Var6)), org.telegram.ui.ActionBar.n6.Y0(context2, 2131231232, org.telegram.ui.ActionBar.n6.f29415b7)).f37204x = true;
                        o4Var = y6Var3;
                        break;
                    case 2:
                        o4Var = new org.telegram.ui.Cells.z8(context2, i6Var6);
                        break;
                    case 3:
                        o4Var = new org.telegram.ui.Cells.m8(context2, i6Var6);
                        break;
                    case 4:
                    case 11:
                        org.telegram.ui.Components.ln lnVar = new org.telegram.ui.Components.ln(this, (Context) obj2, qnVar.J ? 1 : 0, qnVar.f37134a, i7);
                        if (i7 == 11 && !z10) {
                            lnVar.setTextRight(98);
                            lnVar.b().setOnClickListener(new View.OnClickListener(this) {
                                public final org.telegram.ui.l4 f36463b;

                                {
                                    this.f36463b = this;
                                }

                                @Override
                                public final void onClick(View view3) {
                                    switch (r2) {
                                        case 0:
                                            qn.T((qn) this.f36463b.f49583e, -2);
                                            return;
                                        case 1:
                                            qn.T((qn) this.f36463b.f49583e, -3);
                                            return;
                                        default:
                                            ((qn) this.f36463b.f49583e).c0(view3, (org.telegram.ui.Cells.a6) view3.getParent(), true);
                                            return;
                                    }
                                }
                            });
                        }
                        lnVar.d();
                        lnVar.setIconsColor(org.telegram.ui.ActionBar.n6.f29652o7);
                        lnVar.c(new org.telegram.ui.Components.mn(this, lnVar, i7));
                        o4Var = lnVar;
                        break;
                    case 5:
                    default:
                        org.telegram.ui.Components.on onVar = new org.telegram.ui.Components.on(this, (Context) obj2, qnVar.J ? 1 : 0, new View.OnClickListener(this) {
                            public final org.telegram.ui.l4 f36463b;

                            {
                                this.f36463b = this;
                            }

                            @Override
                            public final void onClick(View view3) {
                                switch (r2) {
                                    case 0:
                                        qn.T((qn) this.f36463b.f49583e, -2);
                                        return;
                                    case 1:
                                        qn.T((qn) this.f36463b.f49583e, -3);
                                        return;
                                    default:
                                        ((qn) this.f36463b.f49583e).c0(view3, (org.telegram.ui.Cells.a6) view3.getParent(), true);
                                        return;
                                }
                            }
                        }, qnVar.f37134a);
                        if (!z10) {
                            onVar.setTextRight(140);
                            onVar.b().setOnClickListener(new org.telegram.ui.Components.l8(3, this, onVar));
                        }
                        int i12 = org.telegram.ui.ActionBar.n6.f29652o7;
                        onVar.setIconsColor(i12);
                        org.telegram.ui.Components.lp lpVar = onVar.f30479r;
                        if (lpVar != null) {
                            lpVar.getCheckBoxBase().i(org.telegram.messenger.g0.L(6.0f));
                            CheckBoxBase checkBoxBase = lpVar.getCheckBoxBase();
                            float f10 = onVar.f30473a.f57779e;
                            if (checkBoxBase.f32943w != f10) {
                                checkBoxBase.f32943w = f10;
                                checkBoxBase.b();
                            }
                        }
                        onVar.getCheckBox().b(-1, i12, org.telegram.ui.ActionBar.n6.f29581k7);
                        onVar.c(new bi.v(11, this, onVar));
                        onVar.setShowNextButton(true);
                        EditTextBoldCursor textView = onVar.getTextView();
                        textView.setImeOptions(textView.getImeOptions() | 5);
                        textView.setOnEditorActionListener(new ld(2, this, onVar));
                        textView.setOnKeyListener(new org.telegram.ui.Components.kn(onVar, 0));
                        o4Var = onVar;
                        break;
                    case 6:
                        o4Var = new org.telegram.ui.Cells.r8(context2, i6Var6);
                        break;
                    case 7:
                        org.telegram.ui.Components.nn nnVar = new org.telegram.ui.Components.nn(this, context2, qnVar.J ? 1 : 0);
                        nnVar.d();
                        if (!z10) {
                            nnVar.setTextRight(98);
                            nnVar.b().setOnClickListener(new View.OnClickListener(this) {
                                public final org.telegram.ui.l4 f36463b;

                                {
                                    this.f36463b = this;
                                }

                                @Override
                                public final void onClick(View view3) {
                                    switch (r2) {
                                        case 0:
                                            qn.T((qn) this.f36463b.f49583e, -2);
                                            return;
                                        case 1:
                                            qn.T((qn) this.f36463b.f49583e, -3);
                                            return;
                                        default:
                                            ((qn) this.f36463b.f49583e).c0(view3, (org.telegram.ui.Cells.a6) view3.getParent(), true);
                                            return;
                                    }
                                }
                            });
                        }
                        nnVar.setIconsColor(org.telegram.ui.ActionBar.n6.f29652o7);
                        nnVar.c(new bi.v(10, this, nnVar));
                        o4Var = nnVar;
                        break;
                    case 8:
                        View inVar = new org.telegram.ui.Components.in(context2, 0);
                        inVar.setTag(-33024);
                        view = inVar;
                        o4Var = view;
                        break;
                    case 9:
                        View o3Var = new bi.o3(16, context2, this);
                        o3Var.setTag(-33024);
                        view = o3Var;
                        o4Var = view;
                        break;
                    case 10:
                        org.telegram.ui.Cells.y5 y5Var = new org.telegram.ui.Cells.y5(context2, i6Var6);
                        y5Var.getCheckBox().setIcon(2131232518);
                        o4Var = y5Var;
                        break;
                }
                return i5.c.q(o4Var, o4Var, -1, -2);
            case 2:
                return new v4.f1(new org.telegram.ui.Components.mz((org.telegram.ui.Components.oz) obj, (Context) obj2));
            case 3:
                org.telegram.ui.ActionBar.p2 p2Var = new org.telegram.ui.ActionBar.p2(0, (Context) obj2, null);
                p2Var.setBackground(null);
                p2Var.setLayoutParams(new v4.q0(-1, -2));
                return new v4.f1(p2Var);
            case 4:
                Context context3 = (Context) obj2;
                if (i7 == 0) {
                    org.telegram.ui.ActionBar.i6 i6Var7 = ((org.telegram.ui.Components.de0) obj).J0;
                    ?? frameLayout3 = new FrameLayout(context3);
                    frameLayout3.f31927e = new i6.g((Object) frameLayout3, 24);
                    TextView textView2 = new TextView(context3);
                    frameLayout3.f31924a = textView2;
                    textView2.setGravity(5);
                    textView2.setTextColor(-1);
                    textView2.setTextSize(1, 12.0f);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    frameLayout3.addView(textView2, c8.na.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
                    TextView textView3 = new TextView(context3);
                    frameLayout3.f31925b = textView3;
                    org.telegram.ui.ActionBar.u6.U(textView3, org.telegram.ui.ActionBar.n6.f29700qg, i6Var7);
                    textView3.setTextSize(1, 12.0f);
                    textView3.setGravity(5);
                    textView3.setSingleLine(true);
                    frameLayout3.addView(textView3, c8.na.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
                    ?? view3 = new View(context3);
                    Paint paint = new Paint();
                    view3.f39577a = paint;
                    Paint paint2 = new Paint(1);
                    view3.f39578b = paint2;
                    view3.f39579c = org.telegram.messenger.g0.L(16.0f);
                    view3.d = 0;
                    view3.f39580e = 0.0f;
                    view3.f39581f = false;
                    paint.setColor(-11711155);
                    paint2.setColor(-1);
                    frameLayout3.f31926c = view3;
                    frameLayout3.addView(view3, c8.na.d(-1, 40.0f, 19, 96.0f, 0.0f, 24.0f, 0.0f));
                    frameLayout3.setSeekBarDelegate(new org.telegram.ui.Components.hy(this, 10));
                    s5Var = frameLayout3;
                } else {
                    org.telegram.ui.Cells.s5 s5Var2 = new org.telegram.ui.Cells.s5(context3);
                    s5Var2.setOnClickListener(new org.telegram.ui.Components.g70(this, 5));
                    s5Var = s5Var2;
                }
                return new v4.f1(s5Var);
            case 5:
                Context context4 = (Context) obj2;
                org.telegram.ui.Components.lt0 lt0Var = (org.telegram.ui.Components.lt0) obj;
                if (i7 != 0) {
                    FrameLayout v2Var = new bi.v2(context4, 21);
                    v2Var.setWillNotDraw(false);
                    lt0Var.f37215p1 = new TextView(context4);
                    org.telegram.ui.ActionBar.u6.U(lt0Var.f37215p1, org.telegram.ui.ActionBar.n6.J5, lt0Var.J0);
                    lt0Var.f37215p1.setTextSize(1, 14.0f);
                    lt0Var.f37215p1.setGravity(17);
                    lt0Var.f37215p1.setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
                    v2Var.addView(lt0Var.f37215p1, c8.na.c(40.0f, -1));
                    frameLayout = v2Var;
                } else {
                    frameLayout = new org.telegram.ui.Cells.r7(54, context4, lt0Var.J0, false);
                }
                return new v4.f1(frameLayout);
            case 6:
                return new v4.f1(new org.telegram.ui.Components.yw0((org.telegram.ui.Components.zw0) obj, ((org.telegram.ui.Components.zw0) obj2).getContext()));
            case 7:
                return new v4.f1(new org.telegram.ui.Components.h71((org.telegram.ui.Components.j71) obj, (Context) obj2));
            case 8:
                Context context5 = (Context) obj2;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                if (i7 != 4) {
                                    gu0Var = new org.telegram.ui.Cells.z8(context5);
                                } else {
                                    gu0Var = new org.telegram.ui.Cells.i5(context5);
                                }
                            } else {
                                org.telegram.ui.Components.gu0 gu0Var2 = new org.telegram.ui.Components.gu0(context5, null);
                                gu0Var2.setCallback(new zr(this, 3));
                                gu0Var = gu0Var2;
                            }
                        } else {
                            gu0Var = new org.telegram.ui.Cells.o4(context5);
                        }
                    } else {
                        gu0Var = new org.telegram.ui.Cells.y6(context5, (org.telegram.ui.Cells.c0) null);
                    }
                } else {
                    org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(context5);
                    r8Var2.d(org.telegram.ui.ActionBar.n6.f29506g6, org.telegram.ui.ActionBar.n6.O6, org.telegram.ui.ActionBar.n6.P6, org.telegram.ui.ActionBar.n6.Q6, org.telegram.ui.ActionBar.n6.R6);
                    r8Var2.setTypeface(org.telegram.messenger.g0.o());
                    r8Var2.setHeight(56);
                    gu0Var = r8Var2;
                }
                return i5.c.q(gu0Var, gu0Var, -1, -2);
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
                                        y6Var = new org.telegram.ui.Cells.i5(context6);
                                    }
                                } else {
                                    y6Var = new org.telegram.ui.Cells.z8(context6);
                                }
                            } else {
                                y6Var = new org.telegram.ui.Cells.r8(context6);
                            }
                        } else {
                            y6Var = new org.telegram.ui.Cells.o4(context6, 22);
                        }
                    } else {
                        y6Var = new org.telegram.ui.Cells.w9(context6);
                    }
                } else {
                    y6Var = new org.telegram.ui.Cells.y6(context6, (org.telegram.ui.Cells.c0) null);
                }
                return i5.c.q(y6Var, y6Var, -1, -2);
            case 10:
                Context context7 = (Context) obj2;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                y8Var = new org.telegram.ui.Cells.z8(context7);
                            } else {
                                View w9Var4 = new org.telegram.ui.Cells.w9(context7);
                                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, w9Var4, null);
                                y8Var = w9Var4;
                            }
                        } else {
                            y8Var = new org.telegram.ui.Cells.y6(context7, (org.telegram.ui.Cells.c0) null);
                        }
                    } else {
                        org.telegram.ui.Cells.y8 y8Var2 = new org.telegram.ui.Cells.y8(context7);
                        y8Var2.setMultilineDetail(true);
                        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, y8Var2, null);
                        y8Var = y8Var2;
                    }
                } else {
                    View o4Var3 = new org.telegram.ui.Cells.o4(context7);
                    org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, o4Var3, null);
                    y8Var = o4Var3;
                }
                return i5.c.q(y8Var, y8Var, -1, -2);
            case 11:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                Context context8 = (Context) obj2;
                if (i7 == 0) {
                    i6Var = ((org.telegram.ui.ActionBar.g2) notificationsSettingsActivity).resourceProvider;
                    o4Var2 = new org.telegram.ui.Cells.o4(context8, i6Var);
                } else if (i7 == 1) {
                    i6Var2 = ((org.telegram.ui.ActionBar.g2) notificationsSettingsActivity).resourceProvider;
                    o4Var2 = new org.telegram.ui.Cells.r8(context8, i6Var2);
                } else {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 != 4) {
                                if (i7 != 5) {
                                    i6Var5 = ((org.telegram.ui.ActionBar.g2) notificationsSettingsActivity).resourceProvider;
                                    view2 = new org.telegram.ui.Cells.z8(context8, i6Var5);
                                } else {
                                    i6Var4 = ((org.telegram.ui.ActionBar.g2) notificationsSettingsActivity).resourceProvider;
                                    view2 = new org.telegram.ui.Cells.w9(0, context8, i6Var4);
                                }
                            } else {
                                view2 = new org.telegram.ui.Cells.y6(context8, (org.telegram.ui.Cells.c0) null);
                            }
                        } else {
                            Context context9 = (Context) obj2;
                            i6Var3 = ((org.telegram.ui.ActionBar.g2) notificationsSettingsActivity).resourceProvider;
                            o4Var2 = new org.telegram.ui.Cells.i5(context9, 21, 64, true, i6Var3);
                        }
                    } else {
                        view2 = new org.telegram.ui.Cells.y8(context8);
                    }
                    return new v4.f1(view2);
                }
                view2 = o4Var2;
                return new v4.f1(view2);
            case 12:
                Context context10 = (Context) obj2;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 3) {
                            if (i7 != 4) {
                                r8Var = new org.telegram.ui.Cells.z8(context10);
                            } else {
                                r8Var = new mi0(context10);
                                r8Var.setTag(-33024);
                            }
                        } else {
                            r8Var = new org.telegram.ui.Cells.o4(context10);
                        }
                    } else {
                        r8Var = new org.telegram.ui.Cells.w9(context10);
                    }
                } else {
                    r8Var = new org.telegram.ui.Cells.r8(context10);
                }
                return new v4.f1(r8Var);
            case 13:
                Context context11 = (Context) obj2;
                ?? frameLayout4 = new FrameLayout(context11);
                frameLayout4.f32339e = new Paint();
                frameLayout4.f32337b = new org.telegram.messenger.ue[4];
                frameLayout4.f32336a = new org.telegram.ui.Cells.u5[4];
                for (int i13 = 0; i13 < 4; i13++) {
                    frameLayout4.f32336a[i13] = new org.telegram.ui.Cells.u5((org.telegram.ui.Cells.w5) frameLayout4, context11);
                    frameLayout4.addView(frameLayout4.f32336a[i13]);
                    frameLayout4.f32336a[i13].setVisibility(4);
                    frameLayout4.f32336a[i13].setTag(Integer.valueOf(i13));
                    frameLayout4.f32336a[i13].setOnClickListener(new org.telegram.ui.Cells.a(frameLayout4, 9));
                }
                frameLayout4.setDelegate(new oi0(this, 1));
                return new v4.f1(frameLayout4);
            case 14:
                an0 an0Var = (an0) obj;
                boolean z11 = an0Var.f45768s0;
                Context context12 = (Context) obj2;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                org.telegram.ui.Cells.f3 f3Var = new org.telegram.ui.Cells.f3(context12, null);
                                f3Var.setForceDarkTheme(z11);
                                m8Var = f3Var;
                            } else {
                                org.telegram.ui.Cells.m8 m8Var2 = new org.telegram.ui.Cells.m8(23, context12, true);
                                m8Var2.setLayoutParams(new v4.q0(-1, -2));
                                m8Var = m8Var2;
                                if (z11) {
                                    org.telegram.ui.ActionBar.u6.X(m8Var2.f31173a, an0Var.f45773w0, null);
                                    org.telegram.ui.ActionBar.u6.s(m8Var2.f31176e, org.telegram.ui.ActionBar.n6.f29552ih, null, PorterDuff.Mode.MULTIPLY);
                                    m8Var = m8Var2;
                                }
                            }
                        } else {
                            m8Var = new org.telegram.ui.Cells.h7(1, context12, null);
                        }
                    } else {
                        ViewGroup frameLayout5 = new FrameLayout(context12);
                        frameLayout5.setLayoutParams(new v4.q0(-1, -2));
                        RadialProgressView radialProgressView = new RadialProgressView(context12, null);
                        radialProgressView.setProgressColor(-11371101);
                        frameLayout5.addView(radialProgressView, c8.na.c(-1.0f, -1));
                        m8Var = frameLayout5;
                    }
                } else {
                    org.telegram.ui.Cells.r5 r5Var = new org.telegram.ui.Cells.r5(context12, null);
                    r5Var.setDelegate(new ym0(this));
                    FrameLayout checkFrame = r5Var.getCheckFrame();
                    if (an0Var.U == 0) {
                        i11 = 0;
                    }
                    checkFrame.setVisibility(i11);
                    m8Var = r5Var;
                }
                return new v4.f1(m8Var);
            case 15:
                Context context13 = (Context) obj2;
                ?? frameLayout6 = new FrameLayout(context13);
                new Paint();
                frameLayout6.setWillNotDraw(false);
                org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context13);
                frameLayout6.f32411a = p9Var;
                p9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
                frameLayout6.addView(p9Var, c8.na.c(-1.0f, -1));
                FrameLayout frameLayout7 = new FrameLayout(context13);
                frameLayout6.f32412b = frameLayout7;
                frameLayout6.addView(frameLayout7, c8.na.e(42, 42, 53));
                di.n4 n4Var = new di.n4(context13);
                n4Var.d = new Path();
                n4Var.f9358e = new float[8];
                n4Var.f9356b = new RectF();
                n4Var.f9357c = new Paint(1);
                frameLayout6.f32414e = n4Var;
                n4Var.setWillNotDraw(false);
                n4Var.setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), 0);
                frameLayout6.addView(n4Var, c8.na.e(-1, 16, 83));
                n4Var.addView(org.telegram.messenger.m10.e(context13, 2131231466), c8.na.e(-2, -2, 19));
                TextView textView4 = new TextView(context13);
                frameLayout6.d = textView4;
                textView4.setTextColor(-1);
                textView4.setTextSize(1, 12.0f);
                textView4.setImportantForAccessibility(2);
                n4Var.addView(textView4, c8.na.d(-2, -2.0f, 19, 18.0f, -0.7f, 0.0f, 0.0f));
                org.telegram.ui.Components.lp lpVar2 = new org.telegram.ui.Components.lp(24, context13, null);
                frameLayout6.f32413c = lpVar2;
                lpVar2.setDrawBackgroundAsArc(11);
                lpVar2.b(org.telegram.ui.ActionBar.n6.W9, org.telegram.ui.ActionBar.n6.X9, org.telegram.ui.ActionBar.n6.V9);
                frameLayout6.addView(lpVar2, c8.na.d(26, 26.0f, 51, 55.0f, 4.0f, 0.0f, 0.0f));
                lpVar2.setVisibility(0);
                frameLayout6.setFocusable(true);
                frameLayout7.setOnClickListener(new i40(this, 21));
                return new v4.f1(frameLayout6);
            case 16:
                Context context14 = (Context) obj2;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                if (i7 != 4) {
                                    if (i7 != 6) {
                                        y6Var2 = new px0((ProxyListActivity) obj, context14);
                                        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, y6Var2, null);
                                    } else {
                                        y6Var2 = new org.telegram.ui.Components.gu0(context14, null);
                                        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, y6Var2, null);
                                    }
                                } else {
                                    y6Var2 = new org.telegram.ui.Cells.z8(context14);
                                }
                            } else {
                                y6Var2 = new org.telegram.ui.Cells.r8(context14);
                                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, y6Var2, null);
                            }
                        } else {
                            y6Var2 = new org.telegram.ui.Cells.o4(context14);
                            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, y6Var2, null);
                        }
                    } else {
                        y6Var2 = new org.telegram.ui.Cells.w9(context14);
                        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, y6Var2, null);
                    }
                } else {
                    y6Var2 = new org.telegram.ui.Cells.y6(context14, (org.telegram.ui.Cells.c0) null);
                }
                return i5.c.q(y6Var2, y6Var2, -1, -2);
            case 17:
                Context context15 = (Context) obj2;
                if (i7 == 0) {
                    w9Var2 = new org.telegram.ui.Cells.o4(context15);
                } else if (i7 == 1) {
                    w9Var2 = new org.telegram.ui.Cells.r8(context15);
                } else if (i7 == 2) {
                    org.telegram.ui.Cells.w9 w9Var5 = new org.telegram.ui.Cells.w9(context15);
                    w9Var5.setCanDisable(true);
                    w9Var2 = w9Var5;
                } else {
                    w9Var2 = new org.telegram.ui.Cells.z8(context15);
                }
                w9Var2.setLayoutParams(new v4.q0(-1, -2));
                return new v4.f1(w9Var2);
            case 18:
                Context context16 = (Context) obj2;
                if (i7 == 0) {
                    u4Var = new org.telegram.ui.Cells.u2(context16, false);
                } else {
                    u4Var = new org.telegram.ui.Cells.u4(context16);
                }
                u4Var.setLayoutParams(new v4.q0(-1, -2));
                return new v4.f1(u4Var);
            default:
                Context context17 = (Context) obj2;
                int c10 = p1.g.c(p1.g.d(3)[i7]);
                if (c10 != 1) {
                    if (c10 != 2) {
                        frameLayout2 = new org.telegram.ui.ActionBar.n1(context17, null);
                    } else {
                        ?? frameLayout8 = new FrameLayout(context17);
                        frameLayout8.setWillNotDraw(false);
                        TextPaint textPaint = new TextPaint(1);
                        frameLayout8.h = textPaint;
                        textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
                        org.telegram.ui.Components.an0 an0Var2 = new org.telegram.ui.Components.an0(context17);
                        frameLayout8.f55733a = an0Var2;
                        an0Var2.setReportChanges(true);
                        an0Var2.setDelegate(new org.telegram.ui.Components.nd0((Object) frameLayout8, 6));
                        an0Var2.setImportantForAccessibility(2);
                        frameLayout8.addView(an0Var2, c8.na.d(-1, 38.0f, 83, 5.0f, 29.0f, 47.0f, 0.0f));
                        frameLayout2 = frameLayout8;
                    }
                } else {
                    frameLayout2 = new org.telegram.ui.Cells.o4(context17);
                }
                frameLayout2.setLayoutParams(new v4.q0(-1, -2));
                return new v4.f1(frameLayout2);
        }
    }

    @Override
    public void y(v4.f1 f1Var) {
        int i7;
        int i10;
        int i11 = this.f49582c;
        Object obj = this.f49583e;
        switch (i11) {
            case 1:
                org.telegram.ui.Components.qn qnVar = (org.telegram.ui.Components.qn) obj;
                sh.d dVar = qnVar.n1;
                boolean z10 = qnVar.f38933n;
                int i12 = f1Var.f59249f;
                View view = f1Var.f59245a;
                CharSequence charSequence = "";
                if (i12 == 4) {
                    org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view;
                    a6Var.setTag(1);
                    CharSequence charSequence2 = qnVar.O;
                    if (charSequence2 != null) {
                        charSequence = charSequence2;
                    }
                    if (z10) {
                        i10 = 2131743808;
                    } else {
                        i10 = 2131746252;
                    }
                    a6Var.o(charSequence, org.telegram.messenger.gd.N0(i10, null), true);
                    a6Var.setTag(null);
                    org.telegram.ui.Components.qn.Q(qnVar, view, f1Var.b());
                    return;
                } else if (i12 == 11) {
                    org.telegram.ui.Cells.a6 a6Var2 = (org.telegram.ui.Cells.a6) view;
                    a6Var2.setTag(1);
                    CharSequence charSequence3 = qnVar.P;
                    if (charSequence3 != null) {
                        charSequence = charSequence3;
                    }
                    a6Var2.o(charSequence, org.telegram.messenger.gd.N0(2131746253, null), false);
                    a6Var2.setTag(null);
                    a6Var2.f30476e.b(dVar.b(-2), false);
                    org.telegram.ui.Components.qn.Q(qnVar, view, f1Var.b());
                    return;
                } else if (i12 == 5) {
                    int b10 = f1Var.b();
                    org.telegram.ui.Cells.a6 a6Var3 = (org.telegram.ui.Cells.a6) view;
                    a6Var3.setTag(1);
                    a6Var3.f30473a.a(qnVar.f38913c0, false);
                    int i13 = b10 - qnVar.f38947u0;
                    CharSequence charSequence4 = qnVar.L[i13];
                    if (z10) {
                        i7 = 2131743810;
                    } else {
                        i7 = 2131747580;
                    }
                    a6Var3.o(charSequence4, org.telegram.messenger.gd.N0(i7, null), true);
                    a6Var3.setTag(null);
                    if (qnVar.f38931l0 == b10) {
                        EditTextBoldCursor textView = a6Var3.getTextView();
                        textView.requestFocus();
                        org.telegram.messenger.g0.I3(textView);
                        qnVar.f38931l0 = -1;
                    }
                    if (!z10) {
                        a6Var3.f30476e.b(dVar.b(i13), false);
                    }
                    org.telegram.ui.Components.qn.Q(qnVar, view, b10);
                    return;
                } else if (i12 == 7) {
                    org.telegram.ui.Cells.a6 a6Var4 = (org.telegram.ui.Cells.a6) view;
                    a6Var4.setTag(1);
                    CharSequence charSequence5 = qnVar.Q;
                    if (charSequence5 != null) {
                        charSequence = charSequence5;
                    }
                    a6Var4.o(charSequence, org.telegram.messenger.gd.N0(2131754471, null), false);
                    a6Var4.setTag(null);
                    if (!z10) {
                        a6Var4.f30476e.b(dVar.b(-3), false);
                    }
                    org.telegram.ui.Components.qn.Q(qnVar, view, f1Var.b());
                    return;
                } else {
                    return;
                }
            case 9:
                if (f1Var.f59249f == 3) {
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) f1Var.f59245a;
                    int b11 = f1Var.b();
                    DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) obj;
                    if (b11 == dataSettingsActivity.F) {
                        r8Var.setChecked(org.telegram.messenger.bz.E0);
                        return;
                    } else if (b11 == dataSettingsActivity.E) {
                        r8Var.setChecked(org.telegram.messenger.bz.B0);
                        return;
                    } else if (b11 == dataSettingsActivity.G) {
                        r8Var.setChecked(org.telegram.messenger.bz.C0);
                        return;
                    } else if (b11 == dataSettingsActivity.H) {
                        r8Var.setChecked(org.telegram.messenger.bz.D0);
                        return;
                    } else if (b11 == dataSettingsActivity.K) {
                        int i14 = org.telegram.messenger.bz.f23270a;
                        r8Var.setChecked(org.telegram.messenger.pc.e(2048));
                        return;
                    } else if (b11 == dataSettingsActivity.L) {
                        int i15 = org.telegram.messenger.bz.f23270a;
                        r8Var.setChecked(org.telegram.messenger.pc.e(1024));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 16:
                ProxyListActivity proxyListActivity = (ProxyListActivity) obj;
                if (f1Var.f59249f == 3) {
                    org.telegram.ui.Cells.r8 r8Var2 = (org.telegram.ui.Cells.r8) f1Var.f59245a;
                    int b12 = f1Var.b();
                    if (b12 == ProxyListActivity.g0(proxyListActivity)) {
                        r8Var2.setChecked(proxyListActivity.d);
                        return;
                    } else if (b12 == proxyListActivity.f43827w) {
                        r8Var2.setChecked(org.telegram.messenger.bz.f23272a1);
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
        switch (this.f49582c) {
            case 1:
                org.telegram.ui.Components.qn qnVar = (org.telegram.ui.Components.qn) this.f49583e;
                int i7 = f1Var.f59249f;
                if (i7 == 4 || i7 == 11 || i7 == 5) {
                    EditTextBoldCursor textView = ((org.telegram.ui.Cells.a6) f1Var.f59245a).getTextView();
                    if (textView.isFocused()) {
                        if (qnVar.J) {
                            org.telegram.ui.Components.hn hnVar = qnVar.f38953y;
                            if (hnVar != null) {
                                hnVar.f();
                            }
                            qnVar.e0(true);
                        }
                        qnVar.f38924h1 = null;
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
        this.f49582c = 19;
        this.f49583e = iVar;
        this.d = launchActivity;
    }

    public l4(Context context) {
        this.f49582c = 18;
        this.d = context;
        ArrayList arrayList = new ArrayList();
        this.f49583e = arrayList;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        org.telegram.ui.Cells.p2 p2Var = new org.telegram.ui.Cells.p2();
        p2Var.f31304a = org.telegram.messenger.gd.N0(2131743926, null);
        p2Var.f31305b = org.telegram.messenger.gd.N0(2131743918, null);
        p2Var.f31306c = 0;
        p2Var.d = 0;
        p2Var.f31307e = true;
        p2Var.f31308f = false;
        p2Var.f31309g = 0;
        p2Var.h = currentTimeMillis;
        p2Var.f31310i = false;
        p2Var.f31311j = false;
        p2Var.f31312k = 2;
        arrayList.add(p2Var);
        org.telegram.ui.Cells.p2 p2Var2 = new org.telegram.ui.Cells.p2();
        p2Var2.f31304a = org.telegram.messenger.gd.N0(2131743925, null);
        p2Var2.f31305b = org.telegram.messenger.gd.N0(2131743917, null);
        p2Var2.f31306c = 1;
        p2Var2.d = 2;
        p2Var2.f31307e = false;
        p2Var2.f31308f = false;
        p2Var2.f31309g = 0;
        p2Var2.h = currentTimeMillis - 3600;
        p2Var2.f31310i = false;
        p2Var2.f31311j = false;
        p2Var2.f31312k = -1;
        arrayList.add(p2Var2);
        org.telegram.ui.Cells.p2 p2Var3 = new org.telegram.ui.Cells.p2();
        p2Var3.f31304a = org.telegram.messenger.gd.N0(2131743924, null);
        p2Var3.f31305b = org.telegram.messenger.gd.N0(2131743916, null);
        p2Var3.f31306c = 2;
        p2Var3.d = 3;
        p2Var3.f31307e = false;
        p2Var3.f31308f = true;
        p2Var3.f31309g = 0;
        p2Var3.h = currentTimeMillis - 7200;
        p2Var3.f31310i = false;
        p2Var3.f31311j = true;
        p2Var3.f31312k = -1;
        arrayList.add(p2Var3);
        org.telegram.ui.Cells.p2 p2Var4 = new org.telegram.ui.Cells.p2();
        p2Var4.f31304a = org.telegram.messenger.gd.N0(2131743923, null);
        p2Var4.f31305b = org.telegram.messenger.gd.N0(2131743915, null);
        p2Var4.f31306c = 3;
        p2Var4.d = 0;
        p2Var4.f31307e = false;
        p2Var4.f31308f = false;
        p2Var4.f31309g = 2;
        p2Var4.h = currentTimeMillis - 10800;
        p2Var4.f31310i = false;
        p2Var4.f31311j = false;
        p2Var4.f31312k = -1;
        arrayList.add(p2Var4);
        org.telegram.ui.Cells.p2 p2Var5 = new org.telegram.ui.Cells.p2();
        p2Var5.f31304a = org.telegram.messenger.gd.N0(2131743922, null);
        p2Var5.f31305b = org.telegram.messenger.gd.N0(2131743914, null);
        p2Var5.f31306c = 4;
        p2Var5.d = 0;
        p2Var5.f31307e = false;
        p2Var5.f31308f = false;
        p2Var5.f31309g = 1;
        p2Var5.h = currentTimeMillis - 14400;
        p2Var5.f31310i = false;
        p2Var5.f31311j = false;
        p2Var5.f31312k = 2;
        arrayList.add(p2Var5);
        org.telegram.ui.Cells.p2 p2Var6 = new org.telegram.ui.Cells.p2();
        p2Var6.f31304a = org.telegram.messenger.gd.N0(2131743921, null);
        p2Var6.f31305b = org.telegram.messenger.gd.N0(2131743913, null);
        p2Var6.f31306c = 5;
        p2Var6.d = 0;
        p2Var6.f31307e = false;
        p2Var6.f31308f = false;
        p2Var6.f31309g = 0;
        p2Var6.h = currentTimeMillis - 18000;
        p2Var6.f31310i = false;
        p2Var6.f31311j = false;
        p2Var6.f31312k = -1;
        arrayList.add(p2Var6);
        org.telegram.ui.Cells.p2 p2Var7 = new org.telegram.ui.Cells.p2();
        p2Var7.f31304a = org.telegram.messenger.gd.N0(2131743920, null);
        p2Var7.f31305b = org.telegram.messenger.gd.N0(2131743912, null);
        p2Var7.f31306c = 6;
        p2Var7.d = 0;
        p2Var7.f31307e = false;
        p2Var7.f31308f = false;
        p2Var7.f31309g = 0;
        p2Var7.h = currentTimeMillis - 21600;
        p2Var7.f31310i = true;
        p2Var7.f31311j = false;
        p2Var7.f31312k = -1;
        arrayList.add(p2Var7);
        org.telegram.ui.Cells.p2 p2Var8 = new org.telegram.ui.Cells.p2();
        p2Var8.f31304a = org.telegram.messenger.gd.N0(2131743919, null);
        p2Var8.f31305b = org.telegram.messenger.gd.N0(2131743911, null);
        p2Var8.f31306c = 0;
        p2Var8.d = 0;
        p2Var8.f31307e = false;
        p2Var8.f31308f = false;
        p2Var8.f31309g = 0;
        p2Var8.h = currentTimeMillis - 25200;
        p2Var8.f31310i = true;
        p2Var8.f31311j = false;
        p2Var8.f31312k = -1;
        arrayList.add(p2Var8);
    }

    public l4(ProxyListActivity proxyListActivity, Context context) {
        this.f49582c = 16;
        this.f49583e = proxyListActivity;
        this.d = context;
        C(true);
    }
}
