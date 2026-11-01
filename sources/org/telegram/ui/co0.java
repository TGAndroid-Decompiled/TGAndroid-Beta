package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class co0 extends xr0 {
    public final jo0 f36356a;

    public co0(jo0 jo0Var) {
        this.f36356a = jo0Var;
    }

    @Override
    public final fs0 E(org.telegram.messenger.kj kjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        jo0 jo0Var = this.f36356a;
        org.telegram.ui.Cells.v5 a02 = jo0.a0(jo0Var, i10);
        if (a02 != null) {
            org.telegram.ui.Components.g9 imageView = a02.getImageView();
            int[] iArr = new int[2];
            imageView.getLocationInWindow(iArr);
            fs0 fs0Var = new fs0();
            fs0Var.f37216b = iArr[0];
            fs0Var.f37217c = iArr[1];
            fs0Var.d = jo0Var.K;
            ImageReceiver imageReceiver = imageView.getImageReceiver();
            fs0Var.f37215a = imageReceiver;
            fs0Var.e = imageReceiver.p();
            fs0Var.f37222k = a02.getScale();
            a02.g(false);
            return fs0Var;
        }
        return null;
    }

    @Override
    public final void G() {
        jo0 jo0Var = this.f36356a;
        int childCount = jo0Var.K.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = jo0Var.K.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.v5) {
                ((org.telegram.ui.Cells.v5) childAt).g(true);
            }
        }
    }

    @Override
    public final int H() {
        return this.f36356a.f38484b.size();
    }

    @Override
    public final int R(Object obj) {
        Object obj2;
        if (obj instanceof org.telegram.messenger.ff) {
            obj2 = Integer.valueOf(((org.telegram.messenger.ff) obj).C);
        } else if (obj instanceof org.telegram.messenger.jf) {
            obj2 = ((org.telegram.messenger.jf) obj).B;
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return -1;
        }
        jo0 jo0Var = this.f36356a;
        if (!jo0Var.f38484b.containsKey(obj2)) {
            return -1;
        }
        jo0Var.f38484b.remove(obj2);
        int indexOf = jo0Var.f38486c.indexOf(obj2);
        if (indexOf >= 0) {
            jo0Var.f38486c.remove(indexOf);
        }
        if (jo0Var.e) {
            jo0Var.m0();
        }
        return indexOf;
    }

    @Override
    public final void X(int i10) {
        jo0 jo0Var = this.f36356a;
        org.telegram.messenger.xe xeVar = jo0Var.J;
        org.telegram.ui.Cells.v5 a02 = jo0.a0(jo0Var, i10);
        if (a02 != null) {
            if (xeVar != null) {
                org.telegram.ui.Components.g9 imageView = a02.getImageView();
                imageView.r();
                org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) xeVar.e.get(i10);
                String str = ffVar.f14604c;
                int i11 = ffVar.C;
                String str2 = ffVar.I;
                if (str != null) {
                    imageView.h(str, null, org.telegram.ui.ActionBar.t6.R4);
                    return;
                } else if (str2 != null) {
                    imageView.s(ffVar.J, ffVar.K, true);
                    if (ffVar.f14603b && !ffVar.d()) {
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
            a02.e((org.telegram.messenger.jf) jo0Var.f38490f.get(i10));
        }
    }

    @Override
    public final void a0(int i10) {
        jo0 jo0Var = this.f36356a;
        int childCount = jo0Var.K.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = jo0Var.K.getChildAt(i11);
            if (childAt.getTag() != null) {
                org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) childAt;
                int intValue = ((Integer) childAt.getTag()).intValue();
                org.telegram.messenger.xe xeVar = jo0Var.J;
                if (xeVar == null ? !(intValue < 0 || intValue >= jo0Var.f38490f.size()) : !(intValue < 0 || intValue >= xeVar.e.size())) {
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
        return this.f36356a.f38486c;
    }

    @Override
    public final org.telegram.messenger.lc j(int i10) {
        org.telegram.ui.Cells.v5 a02 = jo0.a0(this.f36356a, i10);
        if (a02 != null) {
            return a02.getImageView().getImageReceiver().p();
        }
        return null;
    }

    @Override
    public final int k(int i10, org.telegram.messenger.y20 y20Var) {
        int d02;
        boolean z10;
        jo0 jo0Var = this.f36356a;
        org.telegram.messenger.xe xeVar = jo0Var.J;
        int i11 = -1;
        int i12 = 1;
        if (xeVar != null) {
            if (i10 < 0 || i10 >= xeVar.e.size()) {
                return -1;
            }
            org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) jo0Var.J.e.get(i10);
            d02 = jo0Var.d0(-1, ffVar);
            if (d02 == -1) {
                ffVar.f14617s = y20Var;
                d02 = jo0Var.f38486c.indexOf(Integer.valueOf(ffVar.C));
                z10 = true;
            } else {
                ffVar.f14617s = null;
                z10 = false;
            }
        } else if (i10 < 0 || i10 >= jo0Var.f38490f.size()) {
            return -1;
        } else {
            org.telegram.messenger.jf jfVar = (org.telegram.messenger.jf) jo0Var.f38490f.get(i10);
            d02 = jo0Var.d0(-1, jfVar);
            if (d02 == -1) {
                jfVar.f14617s = y20Var;
                d02 = jo0Var.f38486c.indexOf(jfVar.B);
                z10 = true;
            } else {
                jfVar.f14617s = null;
                z10 = false;
            }
        }
        int childCount = jo0Var.K.getChildCount();
        int i13 = 0;
        while (true) {
            if (i13 >= childCount) {
                break;
            }
            View childAt = jo0Var.K.getChildAt(i13);
            if (((Integer) childAt.getTag()).intValue() == i10) {
                org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) childAt;
                if (jo0Var.e) {
                    i11 = d02;
                }
                v5Var.b(i11, z10, false);
            } else {
                i13++;
            }
        }
        if (!z10) {
            i12 = 2;
        }
        jo0Var.n0(i12);
        jo0Var.f38506s0.y();
        return d02;
    }

    @Override
    public final void o(int i10, org.telegram.messenger.y20 y20Var, boolean z10, int i11, int i12, boolean z11) {
        jo0 jo0Var = this.f36356a;
        ArrayList arrayList = jo0Var.f38490f;
        org.telegram.messenger.xe xeVar = jo0Var.J;
        if (jo0Var.f38484b.isEmpty()) {
            if (xeVar != null) {
                if (i10 >= 0 && i10 < xeVar.e.size()) {
                    org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) xeVar.e.get(i10);
                    ffVar.f14617s = y20Var;
                    jo0Var.d0(-1, ffVar);
                } else {
                    return;
                }
            } else if (i10 >= 0 && i10 < arrayList.size()) {
                org.telegram.messenger.jf jfVar = (org.telegram.messenger.jf) arrayList.get(i10);
                jfVar.f14617s = y20Var;
                jo0Var.d0(-1, jfVar);
            } else {
                return;
            }
        }
        jo0Var.j0(i11, z10);
    }

    @Override
    public final boolean u() {
        jo0 jo0Var = this.f36356a;
        jo0Var.f38506s0.u0(0, true, true);
        jo0Var.finishFragment();
        return true;
    }

    @Override
    public final HashMap v() {
        return this.f36356a.f38484b;
    }

    @Override
    public final boolean x(int i10) {
        jo0 jo0Var = this.f36356a;
        org.telegram.messenger.xe xeVar = jo0Var.J;
        if (xeVar != null) {
            if (i10 < 0 || i10 >= xeVar.e.size() || !jo0Var.f38484b.containsKey(Integer.valueOf(((org.telegram.messenger.ff) jo0Var.J.e.get(i10)).C))) {
                return false;
            }
            return true;
        } else if (i10 < 0 || i10 >= jo0Var.f38490f.size() || !jo0Var.f38484b.containsKey(((org.telegram.messenger.jf) jo0Var.f38490f.get(i10)).B)) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final boolean z() {
        return this.f36356a.E;
    }
}
