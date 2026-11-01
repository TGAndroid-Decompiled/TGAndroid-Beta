package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
public final class su extends tk0 {
    public final cv f30450c;

    public su(cv cvVar) {
        this.f30450c = cvVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f47912f == 1) {
            return true;
        }
        return false;
    }

    public final int E(int i10) {
        int i11;
        cv cvVar = this.f30450c;
        ou ouVar = cvVar.l1;
        if (cvVar.f25258z1) {
            i11 = 2;
        } else {
            i11 = 1;
        }
        int i12 = 0;
        while (true) {
            ArrayList[] arrayListArr = ouVar.f24576c;
            if (i12 >= arrayListArr.length || i12 == i10) {
                break;
            }
            int size = arrayListArr[i12].size();
            if (ouVar.f24576c.length > 1) {
                size = Math.min(cvVar.f25253u1.J * 2, size);
            }
            i11 += size + 2;
            i12++;
        }
        return i11;
    }

    @Override
    public final int b() {
        ?? r22;
        int i10;
        int min;
        ArrayList arrayList;
        cv cvVar = this.f30450c;
        ou ouVar = cvVar.l1;
        if (!org.telegram.messenger.e20.i(cvVar.f21584a).q() && (arrayList = ouVar.f24575b) != null && arrayList.size() == 1 && org.telegram.messenger.kj.V3((TLRPC.TL_messages_stickerSet) ouVar.f24575b.get(0))) {
            r22 = 1;
        } else {
            r22 = 0;
        }
        cvVar.f25258z1 = r22;
        int i11 = r22 + 1;
        if (ouVar.f24576c == null) {
            i10 = 0;
        } else {
            int i12 = 0;
            i10 = 0;
            while (true) {
                ArrayList[] arrayListArr = ouVar.f24576c;
                if (i12 >= arrayListArr.length) {
                    break;
                }
                ArrayList arrayList2 = arrayListArr[i12];
                if (arrayList2 != null) {
                    if (arrayListArr.length == 1) {
                        min = arrayList2.size();
                    } else {
                        min = Math.min(ouVar.f24577f.f25253u1.J * 2, arrayList2.size());
                    }
                    i10 = min + i10 + 1;
                }
                i12++;
            }
        }
        return Math.max(0, ouVar.f24576c.length - 1) + i11 + i10;
    }

    @Override
    public final int d(int i10) {
        cv cvVar = this.f30450c;
        ou ouVar = cvVar.l1;
        int i11 = 0;
        if (i10 == 0) {
            return 0;
        }
        int i12 = i10 - 1;
        if (cvVar.f25258z1) {
            if (i12 == 1) {
                return 3;
            }
            if (i12 > 0) {
                i12 = i10 - 2;
            }
        }
        int i13 = 0;
        while (true) {
            ArrayList[] arrayListArr = ouVar.f24576c;
            if (i11 >= arrayListArr.length) {
                return 1;
            }
            if (i12 == i13) {
                return 2;
            }
            int size = arrayListArr[i11].size();
            if (ouVar.f24576c.length > 1) {
                size = Math.min(cvVar.f25253u1.J * 2, size);
            }
            int i14 = size + 1 + i13;
            if (i12 == i14) {
                return 4;
            }
            i13 = i14 + 1;
            i11++;
        }
    }

    @Override
    public final void t(s4.c1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.su.t(s4.c1, int):void");
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        cv cvVar = this.f30450c;
        if (i10 == 0) {
            view = cvVar.f25244k1;
        } else {
            boolean z10 = true;
            if (i10 == 1) {
                ?? view3 = new View(cvVar.getContext());
                view3.f31905a = new org.telegram.messenger.kc[2];
                view2 = view3;
            } else if (i10 == 2) {
                Context context = cvVar.getContext();
                if (cvVar.l1.f24576c.length > 1) {
                    z10 = false;
                }
                view2 = new yu(cvVar, context, z10);
            } else if (i10 == 3) {
                view2 = new TextView(cvVar.getContext());
            } else if (i10 == 4) {
                View view4 = new View(cvVar.getContext());
                int i11 = org.telegram.ui.ActionBar.t6.f21338zf;
                Pattern pattern = cv.M1;
                org.telegram.ui.ActionBar.a7.i(i11, view4, cvVar.I0);
                s4.o0 o0Var = new s4.o0(-1, org.telegram.messenger.i0.f1());
                ((ViewGroup.MarginLayoutParams) o0Var).topMargin = org.telegram.messenger.i0.L(14.0f);
                view4.setLayoutParams(o0Var);
                view2 = view4;
            } else {
                view = null;
            }
            view = view2;
        }
        return new s4.c1(view);
    }
}
