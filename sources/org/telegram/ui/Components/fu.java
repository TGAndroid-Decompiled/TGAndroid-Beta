package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
public final class fu extends sj0 {
    public final pu f33866c;

    public fu(pu puVar) {
        this.f33866c = puVar;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        if (d1Var.f55544f == 1) {
            return true;
        }
        return false;
    }

    public final int E(int i3) {
        int i10;
        pu puVar = this.f33866c;
        bu buVar = puVar.m1;
        if (puVar.A1) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        int i11 = 0;
        while (true) {
            ArrayList[] arrayListArr = buVar.f36623c;
            if (i11 >= arrayListArr.length || i11 == i3) {
                break;
            }
            int size = arrayListArr[i11].size();
            if (buVar.f36623c.length > 1) {
                size = Math.min(puVar.f37250v1.J * 2, size);
            }
            i10 += size + 2;
            i11++;
        }
        return i10;
    }

    @Override
    public final int b() {
        ?? r22;
        int i3;
        int min;
        ArrayList arrayList;
        pu puVar = this.f33866c;
        bu buVar = puVar.m1;
        if (!org.telegram.messenger.h10.i(puVar.f28583a).q() && (arrayList = buVar.f36622b) != null && arrayList.size() == 1 && org.telegram.messenger.zi.W3((TLRPC.TL_messages_stickerSet) buVar.f36622b.get(0))) {
            r22 = 1;
        } else {
            r22 = 0;
        }
        puVar.A1 = r22;
        int i10 = r22 + 1;
        if (buVar.f36623c == null) {
            i3 = 0;
        } else {
            int i11 = 0;
            i3 = 0;
            while (true) {
                ArrayList[] arrayListArr = buVar.f36623c;
                if (i11 >= arrayListArr.length) {
                    break;
                }
                ArrayList arrayList2 = arrayListArr[i11];
                if (arrayList2 != null) {
                    if (arrayListArr.length == 1) {
                        min = arrayList2.size();
                    } else {
                        min = Math.min(buVar.f36625f.f37250v1.J * 2, arrayList2.size());
                    }
                    i3 = min + i3 + 1;
                }
                i11++;
            }
        }
        return Math.max(0, buVar.f36623c.length - 1) + i10 + i3;
    }

    @Override
    public final int d(int i3) {
        pu puVar = this.f33866c;
        bu buVar = puVar.m1;
        int i10 = 0;
        if (i3 == 0) {
            return 0;
        }
        int i11 = i3 - 1;
        if (puVar.A1) {
            if (i11 == 1) {
                return 3;
            }
            if (i11 > 0) {
                i11 = i3 - 2;
            }
        }
        int i12 = 0;
        while (true) {
            ArrayList[] arrayListArr = buVar.f36623c;
            if (i10 >= arrayListArr.length) {
                return 1;
            }
            if (i11 == i12) {
                return 2;
            }
            int size = arrayListArr[i10].size();
            if (buVar.f36623c.length > 1) {
                size = Math.min(puVar.f37250v1.J * 2, size);
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
    public final void t(u4.d1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fu.t(u4.d1, int):void");
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View view;
        View view2;
        pu puVar = this.f33866c;
        if (i3 == 0) {
            view = puVar.f37241l1;
        } else {
            boolean z10 = true;
            if (i3 == 1) {
                ?? view3 = new View(puVar.getContext());
                view3.f34825a = new org.telegram.messenger.bc[2];
                view2 = view3;
            } else if (i3 == 2) {
                Context context = puVar.getContext();
                if (puVar.m1.f36623c.length > 1) {
                    z10 = false;
                }
                view2 = new lu(puVar, context, z10);
            } else if (i3 == 3) {
                view2 = new TextView(puVar.getContext());
            } else if (i3 == 4) {
                View view4 = new View(puVar.getContext());
                int i10 = org.telegram.ui.ActionBar.k6.f28299zf;
                Pattern pattern = pu.N1;
                org.telegram.ui.ActionBar.r6.i(i10, view4, puVar.J0);
                u4.p0 p0Var = new u4.p0(-1, org.telegram.messenger.g0.f1());
                ((ViewGroup.MarginLayoutParams) p0Var).topMargin = org.telegram.messenger.g0.L(14.0f);
                view4.setLayoutParams(p0Var);
                view2 = view4;
            } else {
                view = null;
            }
            view = view2;
        }
        return new u4.d1(view);
    }
}
