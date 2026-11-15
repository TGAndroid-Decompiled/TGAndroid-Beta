package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
public final class mu extends tj0 {
    public final wu f37379c;

    public mu(wu wuVar) {
        this.f37379c = wuVar;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        if (e1Var.f58539f == 1) {
            return true;
        }
        return false;
    }

    public final int E(int i7) {
        int i10;
        wu wuVar = this.f37379c;
        iu iuVar = wuVar.f41448p1;
        if (wuVar.D1) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        int i11 = 0;
        while (true) {
            ArrayList[] arrayListArr = iuVar.f40162c;
            if (i11 >= arrayListArr.length || i11 == i7) {
                break;
            }
            int size = arrayListArr[i11].size();
            if (iuVar.f40162c.length > 1) {
                size = Math.min(wuVar.f41457y1.J * 2, size);
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
        wu wuVar = this.f37379c;
        iu iuVar = wuVar.f41448p1;
        if (!org.telegram.messenger.m10.i(wuVar.f29679a).q() && (arrayList = iuVar.f40161b) != null && arrayList.size() == 1 && org.telegram.messenger.gj.V3((TLRPC.TL_messages_stickerSet) iuVar.f40161b.get(0))) {
            r22 = 1;
        } else {
            r22 = 0;
        }
        wuVar.D1 = r22;
        int i10 = r22 + 1;
        if (iuVar.f40162c == null) {
            i7 = 0;
        } else {
            int i11 = 0;
            i7 = 0;
            while (true) {
                ArrayList[] arrayListArr = iuVar.f40162c;
                if (i11 >= arrayListArr.length) {
                    break;
                }
                ArrayList arrayList2 = arrayListArr[i11];
                if (arrayList2 != null) {
                    if (arrayListArr.length == 1) {
                        min = arrayList2.size();
                    } else {
                        min = Math.min(iuVar.f40164f.f41457y1.J * 2, arrayList2.size());
                    }
                    i7 = min + i7 + 1;
                }
                i11++;
            }
        }
        return Math.max(0, iuVar.f40162c.length - 1) + i10 + i7;
    }

    @Override
    public final int d(int i7) {
        wu wuVar = this.f37379c;
        iu iuVar = wuVar.f41448p1;
        int i10 = 0;
        if (i7 == 0) {
            return 0;
        }
        int i11 = i7 - 1;
        if (wuVar.D1) {
            if (i11 == 1) {
                return 3;
            }
            if (i11 > 0) {
                i11 = i7 - 2;
            }
        }
        int i12 = 0;
        while (true) {
            ArrayList[] arrayListArr = iuVar.f40162c;
            if (i10 >= arrayListArr.length) {
                return 1;
            }
            if (i11 == i12) {
                return 2;
            }
            int size = arrayListArr[i10].size();
            if (iuVar.f40162c.length > 1) {
                size = Math.min(wuVar.f41457y1.J * 2, size);
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
    public final void t(v4.e1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mu.t(v4.e1, int):void");
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View view;
        View view2;
        wu wuVar = this.f37379c;
        if (i7 == 0) {
            view = wuVar.f41447o1;
        } else {
            boolean z10 = true;
            if (i7 == 1) {
                ?? view3 = new View(wuVar.getContext());
                view3.f38409a = new org.telegram.messenger.hc[2];
                view2 = view3;
            } else if (i7 == 2) {
                Context context = wuVar.getContext();
                if (wuVar.f41448p1.f40162c.length > 1) {
                    z10 = false;
                }
                view2 = new su(wuVar, context, z10);
            } else if (i7 == 3) {
                view2 = new TextView(wuVar.getContext());
            } else if (i7 == 4) {
                View view4 = new View(wuVar.getContext());
                int i10 = org.telegram.ui.ActionBar.j6.Cf;
                Pattern pattern = wu.Q1;
                org.telegram.ui.ActionBar.q6.h(i10, view4, wuVar.J0);
                v4.p0 p0Var = new v4.p0(-1, org.telegram.messenger.g0.f1());
                ((ViewGroup.MarginLayoutParams) p0Var).topMargin = org.telegram.messenger.g0.L(14.0f);
                view4.setLayoutParams(p0Var);
                view2 = view4;
            } else {
                view = null;
            }
            view = view2;
        }
        return new v4.e1(view);
    }
}
