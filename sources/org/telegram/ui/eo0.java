package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class eo0 extends yr0 {
    public final lo0 f37091a;

    public eo0(lo0 lo0Var) {
        this.f37091a = lo0Var;
    }

    @Override
    public final gs0 E(org.telegram.messenger.jj jjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        lo0 lo0Var = this.f37091a;
        org.telegram.ui.Cells.v5 Z = lo0.Z(lo0Var, i10);
        if (Z != null) {
            org.telegram.ui.Components.g9 imageView = Z.getImageView();
            int[] iArr = new int[2];
            imageView.getLocationInWindow(iArr);
            gs0 gs0Var = new gs0();
            gs0Var.f37628b = iArr[0];
            gs0Var.f37629c = iArr[1];
            gs0Var.d = lo0Var.K;
            ImageReceiver imageReceiver = imageView.getImageReceiver();
            gs0Var.f37627a = imageReceiver;
            gs0Var.e = imageReceiver.p();
            gs0Var.f37634k = Z.getScale();
            Z.g(false);
            return gs0Var;
        }
        return null;
    }

    @Override
    public final void G() {
        lo0 lo0Var = this.f37091a;
        int childCount = lo0Var.K.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = lo0Var.K.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.v5) {
                ((org.telegram.ui.Cells.v5) childAt).g(true);
            }
        }
    }

    @Override
    public final int H() {
        return this.f37091a.f39329b.size();
    }

    @Override
    public final int R(Object obj) {
        Object obj2;
        if (obj instanceof org.telegram.messenger.ef) {
            obj2 = Integer.valueOf(((org.telegram.messenger.ef) obj).C);
        } else if (obj instanceof org.telegram.messenger.hf) {
            obj2 = ((org.telegram.messenger.hf) obj).B;
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return -1;
        }
        lo0 lo0Var = this.f37091a;
        if (!lo0Var.f39329b.containsKey(obj2)) {
            return -1;
        }
        lo0Var.f39329b.remove(obj2);
        int indexOf = lo0Var.f39331c.indexOf(obj2);
        if (indexOf >= 0) {
            lo0Var.f39331c.remove(indexOf);
        }
        if (lo0Var.e) {
            lo0Var.l0();
        }
        return indexOf;
    }

    @Override
    public final void X(int i10) {
        lo0 lo0Var = this.f37091a;
        org.telegram.messenger.we weVar = lo0Var.J;
        org.telegram.ui.Cells.v5 Z = lo0.Z(lo0Var, i10);
        if (Z != null) {
            if (weVar != null) {
                org.telegram.ui.Components.g9 imageView = Z.getImageView();
                imageView.r();
                org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) weVar.e.get(i10);
                String str = efVar.f19508c;
                int i11 = efVar.C;
                String str2 = efVar.I;
                if (str != null) {
                    imageView.h(str, null, org.telegram.ui.ActionBar.t6.R4);
                    return;
                } else if (str2 != null) {
                    imageView.s(efVar.J, efVar.K, true);
                    if (efVar.f19507b && !efVar.d()) {
                        imageView.h("vthumb://" + i11 + ":" + str2, null, org.telegram.ui.ActionBar.t6.R4);
                        return;
                    }
                    imageView.h("thumb://" + i11 + ":" + str2, null, org.telegram.ui.ActionBar.t6.R4);
                    return;
                } else {
                    imageView.setImageDrawable(org.telegram.ui.ActionBar.t6.R4);
                    return;
                }
            }
            Z.e((org.telegram.messenger.hf) lo0Var.f39335f.get(i10));
        }
    }

    @Override
    public final void a0(int i10) {
        lo0 lo0Var = this.f37091a;
        int childCount = lo0Var.K.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = lo0Var.K.getChildAt(i11);
            if (childAt.getTag() != null) {
                org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) childAt;
                int intValue = ((Integer) childAt.getTag()).intValue();
                org.telegram.messenger.we weVar = lo0Var.J;
                if (weVar == null ? !(intValue < 0 || intValue >= lo0Var.f39335f.size()) : !(intValue < 0 || intValue >= weVar.e.size())) {
                    if (intValue == i10) {
                        v5Var.g(true);
                        return;
                    }
                }
            }
        }
    }

    @Override
    public final ArrayList c() {
        return this.f37091a.f39331c;
    }

    @Override
    public final org.telegram.messenger.kc j(int i10) {
        org.telegram.ui.Cells.v5 Z = lo0.Z(this.f37091a, i10);
        if (Z != null) {
            return Z.getImageView().getImageReceiver().p();
        }
        return null;
    }

    @Override
    public final int k(int i10, org.telegram.messenger.x20 x20Var) {
        int c02;
        boolean z10;
        lo0 lo0Var = this.f37091a;
        org.telegram.messenger.we weVar = lo0Var.J;
        int i11 = -1;
        int i12 = 1;
        if (weVar != null) {
            if (i10 < 0 || i10 >= weVar.e.size()) {
                return -1;
            }
            org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) lo0Var.J.e.get(i10);
            c02 = lo0Var.c0(-1, efVar);
            if (c02 == -1) {
                efVar.f19521s = x20Var;
                c02 = lo0Var.f39331c.indexOf(Integer.valueOf(efVar.C));
                z10 = true;
            } else {
                efVar.f19521s = null;
                z10 = false;
            }
        } else if (i10 < 0 || i10 >= lo0Var.f39335f.size()) {
            return -1;
        } else {
            org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) lo0Var.f39335f.get(i10);
            c02 = lo0Var.c0(-1, hfVar);
            if (c02 == -1) {
                hfVar.f19521s = x20Var;
                c02 = lo0Var.f39331c.indexOf(hfVar.B);
                z10 = true;
            } else {
                hfVar.f19521s = null;
                z10 = false;
            }
        }
        int childCount = lo0Var.K.getChildCount();
        int i13 = 0;
        while (true) {
            if (i13 >= childCount) {
                break;
            }
            View childAt = lo0Var.K.getChildAt(i13);
            if (((Integer) childAt.getTag()).intValue() == i10) {
                org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) childAt;
                if (lo0Var.e) {
                    i11 = c02;
                }
                v5Var.b(i11, z10, false);
            } else {
                i13++;
            }
        }
        if (!z10) {
            i12 = 2;
        }
        lo0Var.m0(i12);
        lo0Var.f39351s0.y();
        return c02;
    }

    @Override
    public final void o(int i10, org.telegram.messenger.x20 x20Var, boolean z10, int i11, int i12, boolean z11) {
        lo0 lo0Var = this.f37091a;
        ArrayList arrayList = lo0Var.f39335f;
        org.telegram.messenger.we weVar = lo0Var.J;
        if (lo0Var.f39329b.isEmpty()) {
            if (weVar != null) {
                if (i10 >= 0 && i10 < weVar.e.size()) {
                    org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) weVar.e.get(i10);
                    efVar.f19521s = x20Var;
                    lo0Var.c0(-1, efVar);
                } else {
                    return;
                }
            } else if (i10 >= 0 && i10 < arrayList.size()) {
                org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) arrayList.get(i10);
                hfVar.f19521s = x20Var;
                lo0Var.c0(-1, hfVar);
            } else {
                return;
            }
        }
        lo0Var.i0(i11, z10);
    }

    @Override
    public final boolean u() {
        lo0 lo0Var = this.f37091a;
        lo0Var.f39351s0.u0(0, true, true);
        lo0Var.finishFragment();
        return true;
    }

    @Override
    public final HashMap v() {
        return this.f37091a.f39329b;
    }

    @Override
    public final boolean x(int i10) {
        lo0 lo0Var = this.f37091a;
        org.telegram.messenger.we weVar = lo0Var.J;
        if (weVar != null) {
            if (i10 < 0 || i10 >= weVar.e.size() || !lo0Var.f39329b.containsKey(Integer.valueOf(((org.telegram.messenger.ef) lo0Var.J.e.get(i10)).C))) {
                return false;
            }
            return true;
        } else if (i10 < 0 || i10 >= lo0Var.f39335f.size() || !lo0Var.f39329b.containsKey(((org.telegram.messenger.hf) lo0Var.f39335f.get(i10)).B)) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final boolean z() {
        return this.f37091a.E;
    }
}
