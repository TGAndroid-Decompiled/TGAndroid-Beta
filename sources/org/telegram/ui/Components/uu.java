package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
public final class uu extends dk0 {
    public final ev f40587c;

    public uu(ev evVar) {
        this.f40587c = evVar;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.f59169f == 1) {
            return true;
        }
        return false;
    }

    public final int E(int i7) {
        int i10;
        ev evVar = this.f40587c;
        qu quVar = evVar.f34992p1;
        if (evVar.D1) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        int i11 = 0;
        while (true) {
            ArrayList[] arrayListArr = quVar.f34305c;
            if (i11 >= arrayListArr.length || i11 == i7) {
                break;
            }
            int size = arrayListArr[i11].size();
            if (quVar.f34305c.length > 1) {
                size = Math.min(evVar.f35001y1.J * 2, size);
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
        ev evVar = this.f40587c;
        qu quVar = evVar.f34992p1;
        if (!org.telegram.messenger.k10.i(evVar.f30173a).q() && (arrayList = quVar.f34304b) != null && arrayList.size() == 1 && org.telegram.messenger.gj.V3((TLRPC.TL_messages_stickerSet) quVar.f34304b.get(0))) {
            r22 = 1;
        } else {
            r22 = 0;
        }
        evVar.D1 = r22;
        int i10 = r22 + 1;
        if (quVar.f34305c == null) {
            i7 = 0;
        } else {
            int i11 = 0;
            i7 = 0;
            while (true) {
                ArrayList[] arrayListArr = quVar.f34305c;
                if (i11 >= arrayListArr.length) {
                    break;
                }
                ArrayList arrayList2 = arrayListArr[i11];
                if (arrayList2 != null) {
                    if (arrayListArr.length == 1) {
                        min = arrayList2.size();
                    } else {
                        min = Math.min(quVar.f34307f.f35001y1.J * 2, arrayList2.size());
                    }
                    i7 = min + i7 + 1;
                }
                i11++;
            }
        }
        return Math.max(0, quVar.f34305c.length - 1) + i10 + i7;
    }

    @Override
    public final int d(int i7) {
        ev evVar = this.f40587c;
        qu quVar = evVar.f34992p1;
        int i10 = 0;
        if (i7 == 0) {
            return 0;
        }
        int i11 = i7 - 1;
        if (evVar.D1) {
            if (i11 == 1) {
                return 3;
            }
            if (i11 > 0) {
                i11 = i7 - 2;
            }
        }
        int i12 = 0;
        while (true) {
            ArrayList[] arrayListArr = quVar.f34305c;
            if (i10 >= arrayListArr.length) {
                return 1;
            }
            if (i11 == i12) {
                return 2;
            }
            int size = arrayListArr[i10].size();
            if (quVar.f34305c.length > 1) {
                size = Math.min(evVar.f35001y1.J * 2, size);
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
    public final void t(v4.f1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.uu.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        View view2;
        ev evVar = this.f40587c;
        if (i7 == 0) {
            view = evVar.f34991o1;
        } else {
            boolean z10 = true;
            if (i7 == 1) {
                ?? view3 = new View(evVar.getContext());
                view3.f42219a = new org.telegram.messenger.hc[2];
                view2 = view3;
            } else if (i7 == 2) {
                Context context = evVar.getContext();
                if (evVar.f34992p1.f34305c.length > 1) {
                    z10 = false;
                }
                view2 = new av(evVar, context, z10);
            } else if (i7 == 3) {
                view2 = new TextView(evVar.getContext());
            } else if (i7 == 4) {
                View view4 = new View(evVar.getContext());
                int i10 = org.telegram.ui.ActionBar.m6.Cf;
                Pattern pattern = ev.Q1;
                org.telegram.ui.ActionBar.t6.h(i10, view4, evVar.J0);
                v4.q0 q0Var = new v4.q0(-1, org.telegram.messenger.g0.f1());
                ((ViewGroup.MarginLayoutParams) q0Var).topMargin = org.telegram.messenger.g0.L(14.0f);
                view4.setLayoutParams(q0Var);
                view2 = view4;
            } else {
                view = null;
            }
            view = view2;
        }
        return new v4.f1(view);
    }
}
