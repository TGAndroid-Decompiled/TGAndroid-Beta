package org.telegram.ui.Components;

import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class lm extends org.telegram.ui.oq0 {
    public ArrayList f37148a = new ArrayList();
    public final om f37149b;

    public lm(om omVar) {
        this.f37149b = omVar;
    }

    @Override
    public final void D() {
        om omVar = this.f37149b;
        omVar.c();
        omVar.i(omVar.Q.Q, false);
    }

    @Override
    public final org.telegram.ui.wq0 E(org.telegram.messenger.fj fjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        org.telegram.messenger.ef efVar;
        ArrayList arrayList;
        om omVar = this.f37149b;
        ArrayList arrayList2 = omVar.f38125b;
        pm pmVar = omVar.Q;
        if (i7 >= 0 && i7 < this.f37148a.size() && x(i7) && (efVar = (org.telegram.messenger.ef) this.f37148a.get(i7)) != null) {
            int size = arrayList2.size();
            nm nmVar = null;
            mm mmVar = null;
            for (int i10 = 0; i10 < size; i10++) {
                nmVar = (nm) arrayList2.get(i10);
                if (nmVar != null && (arrayList = nmVar.h) != null) {
                    int size2 = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size2) {
                            break;
                        }
                        mm mmVar2 = (mm) arrayList.get(i11);
                        if (mmVar2 != null && mmVar2.f37562b == efVar && mmVar2.f37569k > 0.5d) {
                            mmVar = (mm) arrayList.get(i11);
                            break;
                        }
                        i11++;
                    }
                    if (mmVar != null) {
                        break;
                    }
                }
            }
            if (nmVar != null && mmVar != null) {
                org.telegram.ui.wq0 wq0Var = new org.telegram.ui.wq0();
                int[] iArr = new int[2];
                omVar.getLocationInWindow(iArr);
                if (Build.VERSION.SDK_INT < 26) {
                    iArr[0] = iArr[0] - pmVar.f36766b.T();
                }
                wq0Var.f53448b = iArr[0];
                wq0Var.f53449c = iArr[1] + ((int) nmVar.f37806a);
                wq0Var.f53455k = 1.0f;
                wq0Var.d = omVar;
                ImageReceiver imageReceiver = mmVar.f37563c;
                wq0Var.f53447a = imageReceiver;
                wq0Var.f53450e = imageReceiver.p();
                wq0Var.h = r5;
                RectF rectF = mmVar.f37575q;
                int[] iArr2 = {(int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom};
                wq0Var.f53454j = (int) (-omVar.getY());
                wq0Var.f53453i = omVar.getHeight() - ((int) (((-omVar.getY()) + pmVar.f38487r.getHeight()) - pmVar.f36766b.a1()));
                return wq0Var;
            }
        }
        return null;
    }

    @Override
    public final int H() {
        return this.f37149b.h.size();
    }

    @Override
    public final int R(Object obj) {
        int indexOf;
        Integer valueOf = Integer.valueOf(((org.telegram.messenger.ef) obj).C);
        om omVar = this.f37149b;
        if (omVar.h.size() <= 1 || (indexOf = omVar.h.indexOf(valueOf)) < 0) {
            return -1;
        }
        omVar.h.remove(indexOf);
        omVar.c();
        return indexOf;
    }

    @Override
    public final int S(int i7) {
        org.telegram.messenger.ef efVar;
        if (i7 < 0 || i7 >= this.f37148a.size() || (efVar = (org.telegram.messenger.ef) this.f37148a.get(i7)) == null) {
            return -1;
        }
        return this.f37149b.h.indexOf(Integer.valueOf(efVar.C));
    }

    @Override
    public final void X(int i7) {
        org.telegram.messenger.ef efVar;
        ArrayList arrayList;
        boolean z10;
        if (i7 >= 0 && i7 < this.f37148a.size() && (efVar = (org.telegram.messenger.ef) this.f37148a.get(i7)) != null) {
            int i10 = efVar.C;
            om omVar = this.f37149b;
            omVar.invalidate();
            for (int i11 = 0; i11 < omVar.f38125b.size(); i11++) {
                nm nmVar = (nm) omVar.f38125b.get(i11);
                if (nmVar != null && (arrayList = nmVar.h) != null) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        mm mmVar = (mm) arrayList.get(i12);
                        if (mmVar != null && mmVar.f37562b.C == i10) {
                            mm.a(mmVar, efVar);
                        }
                    }
                    jm jmVar = nmVar.f37814k;
                    if (jmVar != null && ((ArrayList) jmVar.f36490f) != null) {
                        z10 = false;
                        for (int i13 = 0; i13 < ((ArrayList) nmVar.f37814k.f36490f).size(); i13++) {
                            if (((org.telegram.messenger.ef) ((ArrayList) nmVar.f37814k.f36490f).get(i13)).C == i10) {
                                ((ArrayList) nmVar.f37814k.f36490f).set(i13, efVar);
                                z10 = true;
                            }
                        }
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        nm.a(nmVar, nmVar.f37814k, true);
                    }
                }
            }
            omVar.g();
            omVar.invalidate();
        }
    }

    @Override
    public final ArrayList c() {
        return this.f37149b.h;
    }

    @Override
    public final int k(int i7, org.telegram.messenger.e20 e20Var) {
        if (i7 < 0 || i7 >= this.f37148a.size()) {
            return -1;
        }
        Integer valueOf = Integer.valueOf(((org.telegram.messenger.ef) this.f37148a.get(i7)).C);
        om omVar = this.f37149b;
        int indexOf = omVar.h.indexOf(valueOf);
        if (indexOf >= 0) {
            if (omVar.h.size() <= 1) {
                return -1;
            }
            omVar.h.remove(indexOf);
            omVar.c();
            return indexOf;
        }
        omVar.h.add(valueOf);
        omVar.c();
        return omVar.h.size() - 1;
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final HashMap v() {
        return this.f37149b.d;
    }

    @Override
    public final boolean x(int i7) {
        if (i7 >= 0 && i7 < this.f37148a.size()) {
            return this.f37149b.h.contains(Integer.valueOf(((org.telegram.messenger.ef) this.f37148a.get(i7)).C));
        }
        return false;
    }
}
