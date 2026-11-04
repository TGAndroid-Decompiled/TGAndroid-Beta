package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class mm0 extends eq0 {
    public final sm0 f47713a;

    public mm0(sm0 sm0Var) {
        this.f47713a = sm0Var;
    }

    @Override
    public final mq0 E(org.telegram.messenger.zi ziVar, TLRPC.FileLocation fileLocation, int i3, boolean z10, boolean z11) {
        sm0 sm0Var = this.f47713a;
        org.telegram.ui.Cells.q5 a02 = sm0.a0(sm0Var, i3);
        if (a02 != null) {
            org.telegram.ui.Components.k9 imageView = a02.getImageView();
            int[] iArr = new int[2];
            imageView.getLocationInWindow(iArr);
            mq0 mq0Var = new mq0();
            mq0Var.f47752b = iArr[0];
            mq0Var.f47753c = iArr[1];
            mq0Var.d = sm0Var.L;
            ImageReceiver imageReceiver = imageView.getImageReceiver();
            mq0Var.f47751a = imageReceiver;
            mq0Var.f47754e = imageReceiver.p();
            mq0Var.f47759k = a02.getScale();
            a02.g(false);
            return mq0Var;
        }
        return null;
    }

    @Override
    public final void G() {
        sm0 sm0Var = this.f47713a;
        int childCount = sm0Var.L.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = sm0Var.L.getChildAt(i3);
            if (childAt instanceof org.telegram.ui.Cells.q5) {
                ((org.telegram.ui.Cells.q5) childAt).g(true);
            }
        }
    }

    @Override
    public final int H() {
        return this.f47713a.f49540b.size();
    }

    @Override
    public final int R(Object obj) {
        Object obj2;
        if (obj instanceof org.telegram.messenger.ye) {
            obj2 = Integer.valueOf(((org.telegram.messenger.ye) obj).C);
        } else if (obj instanceof org.telegram.messenger.bf) {
            obj2 = ((org.telegram.messenger.bf) obj).B;
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return -1;
        }
        sm0 sm0Var = this.f47713a;
        if (!sm0Var.f49540b.containsKey(obj2)) {
            return -1;
        }
        sm0Var.f49540b.remove(obj2);
        int indexOf = sm0Var.f49542c.indexOf(obj2);
        if (indexOf >= 0) {
            sm0Var.f49542c.remove(indexOf);
        }
        if (sm0Var.f49545e) {
            sm0Var.m0();
        }
        return indexOf;
    }

    @Override
    public final void X(int i3) {
        sm0 sm0Var = this.f47713a;
        org.telegram.messenger.pe peVar = sm0Var.K;
        org.telegram.ui.Cells.q5 a02 = sm0.a0(sm0Var, i3);
        if (a02 != null) {
            if (peVar != null) {
                org.telegram.ui.Components.k9 imageView = a02.getImageView();
                imageView.r();
                org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) peVar.f24738e.get(i3);
                String str = yeVar.f25311c;
                int i10 = yeVar.C;
                String str2 = yeVar.I;
                if (str != null) {
                    imageView.h(str, null, org.telegram.ui.ActionBar.k6.R4);
                    return;
                } else if (str2 != null) {
                    imageView.s(yeVar.J, yeVar.K, true);
                    if (yeVar.f25310b && !yeVar.d()) {
                        imageView.h("vthumb://" + i10 + ":" + str2, null, org.telegram.ui.ActionBar.k6.R4);
                        return;
                    }
                    imageView.h("thumb://" + i10 + ":" + str2, null, org.telegram.ui.ActionBar.k6.R4);
                    return;
                } else {
                    imageView.setImageDrawable(org.telegram.ui.ActionBar.k6.R4);
                    return;
                }
            }
            a02.e((org.telegram.messenger.bf) sm0Var.f49547f.get(i3));
        }
    }

    @Override
    public final void a0(int i3) {
        sm0 sm0Var = this.f47713a;
        int childCount = sm0Var.L.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = sm0Var.L.getChildAt(i10);
            if (childAt.getTag() != null) {
                org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                int intValue = ((Integer) childAt.getTag()).intValue();
                org.telegram.messenger.pe peVar = sm0Var.K;
                if (peVar == null ? !(intValue < 0 || intValue >= sm0Var.f49547f.size()) : !(intValue < 0 || intValue >= peVar.f24738e.size())) {
                    if (intValue == i3) {
                        q5Var.g(true);
                        return;
                    }
                }
            }
        }
    }

    @Override
    public final ArrayList c() {
        return this.f47713a.f49542c;
    }

    @Override
    public final org.telegram.messenger.cc j(int i3) {
        org.telegram.ui.Cells.q5 a02 = sm0.a0(this.f47713a, i3);
        if (a02 != null) {
            return a02.getImageView().getImageReceiver().p();
        }
        return null;
    }

    @Override
    public final int k(int i3, org.telegram.messenger.b20 b20Var) {
        int d02;
        boolean z10;
        sm0 sm0Var = this.f47713a;
        org.telegram.messenger.pe peVar = sm0Var.K;
        int i10 = -1;
        int i11 = 1;
        if (peVar != null) {
            if (i3 < 0 || i3 >= peVar.f24738e.size()) {
                return -1;
            }
            org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) sm0Var.K.f24738e.get(i3);
            d02 = sm0Var.d0(-1, yeVar);
            if (d02 == -1) {
                yeVar.f25325s = b20Var;
                d02 = sm0Var.f49542c.indexOf(Integer.valueOf(yeVar.C));
                z10 = true;
            } else {
                yeVar.f25325s = null;
                z10 = false;
            }
        } else if (i3 < 0 || i3 >= sm0Var.f49547f.size()) {
            return -1;
        } else {
            org.telegram.messenger.bf bfVar = (org.telegram.messenger.bf) sm0Var.f49547f.get(i3);
            d02 = sm0Var.d0(-1, bfVar);
            if (d02 == -1) {
                bfVar.f25325s = b20Var;
                d02 = sm0Var.f49542c.indexOf(bfVar.B);
                z10 = true;
            } else {
                bfVar.f25325s = null;
                z10 = false;
            }
        }
        int childCount = sm0Var.L.getChildCount();
        int i12 = 0;
        while (true) {
            if (i12 >= childCount) {
                break;
            }
            View childAt = sm0Var.L.getChildAt(i12);
            if (((Integer) childAt.getTag()).intValue() == i3) {
                org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                if (sm0Var.f49545e) {
                    i10 = d02;
                }
                q5Var.b(i10, z10, false);
            } else {
                i12++;
            }
        }
        if (!z10) {
            i11 = 2;
        }
        sm0Var.n0(i11);
        sm0Var.f49564t0.m();
        return d02;
    }

    @Override
    public final void o(int i3, org.telegram.messenger.b20 b20Var, boolean z10, int i10, int i11, boolean z11) {
        sm0 sm0Var = this.f47713a;
        ArrayList arrayList = sm0Var.f49547f;
        org.telegram.messenger.pe peVar = sm0Var.K;
        if (sm0Var.f49540b.isEmpty()) {
            if (peVar != null) {
                if (i3 >= 0 && i3 < peVar.f24738e.size()) {
                    org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) peVar.f24738e.get(i3);
                    yeVar.f25325s = b20Var;
                    sm0Var.d0(-1, yeVar);
                } else {
                    return;
                }
            } else if (i3 >= 0 && i3 < arrayList.size()) {
                org.telegram.messenger.bf bfVar = (org.telegram.messenger.bf) arrayList.get(i3);
                bfVar.f25325s = b20Var;
                sm0Var.d0(-1, bfVar);
            } else {
                return;
            }
        }
        sm0Var.j0(i10, z10);
    }

    @Override
    public final boolean u() {
        sm0 sm0Var = this.f47713a;
        sm0Var.f49564t0.v0(0, true, true);
        sm0Var.finishFragment();
        return true;
    }

    @Override
    public final HashMap v() {
        return this.f47713a.f49540b;
    }

    @Override
    public final boolean x(int i3) {
        sm0 sm0Var = this.f47713a;
        org.telegram.messenger.pe peVar = sm0Var.K;
        if (peVar != null) {
            if (i3 < 0 || i3 >= peVar.f24738e.size() || !sm0Var.f49540b.containsKey(Integer.valueOf(((org.telegram.messenger.ye) sm0Var.K.f24738e.get(i3)).C))) {
                return false;
            }
            return true;
        } else if (i3 < 0 || i3 >= sm0Var.f49547f.size() || !sm0Var.f49540b.containsKey(((org.telegram.messenger.bf) sm0Var.f49547f.get(i3)).B)) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final boolean z() {
        return this.f47713a.F;
    }
}
