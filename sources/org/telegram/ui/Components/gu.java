package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
public final class gu extends oj0 {
    public final qu f33997c;

    public gu(qu quVar) {
        this.f33997c = quVar;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f56955f == 1) {
            return true;
        }
        return false;
    }

    public final int E(int i7) {
        int i10;
        qu quVar = this.f33997c;
        cu cuVar = quVar.l1;
        if (quVar.f37405z1) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        int i11 = 0;
        while (true) {
            ArrayList[] arrayListArr = cuVar.f36677c;
            if (i11 >= arrayListArr.length || i11 == i7) {
                break;
            }
            int size = arrayListArr[i11].size();
            if (cuVar.f36677c.length > 1) {
                size = Math.min(quVar.f37400u1.J * 2, size);
            }
            i10 += size + 2;
            i11++;
        }
        return i10;
    }

    @Override
    public final int b() {
        ?? r22;
        int i7;
        int min;
        ArrayList arrayList;
        qu quVar = this.f33997c;
        cu cuVar = quVar.l1;
        if (!org.telegram.messenger.p10.i(quVar.f28613a).q() && (arrayList = cuVar.f36676b) != null && arrayList.size() == 1 && org.telegram.messenger.ij.W3((TLRPC.TL_messages_stickerSet) cuVar.f36676b.get(0))) {
            r22 = 1;
        } else {
            r22 = 0;
        }
        quVar.f37405z1 = r22;
        int i10 = r22 + 1;
        if (cuVar.f36677c == null) {
            i7 = 0;
        } else {
            int i11 = 0;
            i7 = 0;
            while (true) {
                ArrayList[] arrayListArr = cuVar.f36677c;
                if (i11 >= arrayListArr.length) {
                    break;
                }
                ArrayList arrayList2 = arrayListArr[i11];
                if (arrayList2 != null) {
                    if (arrayListArr.length == 1) {
                        min = arrayList2.size();
                    } else {
                        min = Math.min(cuVar.f36679f.f37400u1.J * 2, arrayList2.size());
                    }
                    i7 = min + i7 + 1;
                }
                i11++;
            }
        }
        return Math.max(0, cuVar.f36677c.length - 1) + i10 + i7;
    }

    @Override
    public final int d(int i7) {
        qu quVar = this.f33997c;
        cu cuVar = quVar.l1;
        int i10 = 0;
        if (i7 == 0) {
            return 0;
        }
        int i11 = i7 - 1;
        if (quVar.f37405z1) {
            if (i11 == 1) {
                return 3;
            }
            if (i11 > 0) {
                i11 = i7 - 2;
            }
        }
        int i12 = 0;
        while (true) {
            ArrayList[] arrayListArr = cuVar.f36677c;
            if (i10 >= arrayListArr.length) {
                return 1;
            }
            if (i11 == i12) {
                return 2;
            }
            int size = arrayListArr[i10].size();
            if (cuVar.f36677c.length > 1) {
                size = Math.min(quVar.f37400u1.J * 2, size);
            }
            int i13 = size + 1 + i12;
            if (i11 == i13) {
                return 4;
            }
            i12 = i13 + 1;
            i10++;
        }
    }

    @Override
    public final void t(v4.d1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gu.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        View view2;
        qu quVar = this.f33997c;
        if (i7 == 0) {
            view = quVar.f37392k1;
        } else {
            boolean z9 = true;
            if (i7 == 1) {
                ?? view3 = new View(quVar.getContext());
                view3.f35070a = new org.telegram.messenger.ic[2];
                view2 = view3;
            } else if (i7 == 2) {
                Context context = quVar.getContext();
                if (quVar.l1.f36677c.length > 1) {
                    z9 = false;
                }
                view2 = new mu(quVar, context, z9);
            } else if (i7 == 3) {
                view2 = new TextView(quVar.getContext());
            } else if (i7 == 4) {
                View view4 = new View(quVar.getContext());
                int i10 = org.telegram.ui.ActionBar.k6.f28267zf;
                Pattern pattern = qu.M1;
                org.telegram.ui.ActionBar.r6.i(i10, view4, quVar.I0);
                v4.o0 o0Var = new v4.o0(-1, org.telegram.messenger.g0.f1());
                ((ViewGroup.MarginLayoutParams) o0Var).topMargin = org.telegram.messenger.g0.L(14.0f);
                view4.setLayoutParams(o0Var);
                view2 = view4;
            } else {
                view = null;
            }
            view = view2;
        }
        return new v4.d1(view);
    }
}
