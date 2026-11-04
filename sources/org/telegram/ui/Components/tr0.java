package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class tr0 extends sj0 {
    public final Context f38538c;
    public j50 f38539e;
    public int f38541n;
    public final int f38542r;
    public int f38543s;
    public final ws0 f38544w;
    public ArrayList d = new ArrayList();
    public ArrayList f38540f = new ArrayList();
    public int h = 0;

    public tr0(ws0 ws0Var, Context context, int i3) {
        this.f38544w = ws0Var;
        this.f38538c = context;
        this.f38542r = i3;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        if (this.f38540f.size() + this.d.size() != 0) {
            return true;
        }
        return false;
    }

    public final org.telegram.messenger.zi E(int i3) {
        if (i3 < this.d.size()) {
            return (org.telegram.messenger.zi) this.d.get(i3);
        }
        return (org.telegram.messenger.zi) this.f38540f.get(i3 - this.d.size());
    }

    public final void F(int i3, long j10, long j11, String str) {
        org.telegram.ui.ActionBar.d2 d2Var = this.f38544w.f40142y1;
        if (!org.telegram.messenger.m5.C(j10)) {
            if (this.h != 0) {
                d2Var.getConnectionsManager().cancelRequest(this.h, true);
                this.h = 0;
                this.f38543s--;
            }
            if (str != null && str.length() != 0) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.limit = 50;
                tL_messages_search.offset_id = i3;
                int i10 = this.f38542r;
                if (i10 == 1) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterDocument();
                } else if (i10 == 3) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterUrl();
                } else if (i10 == 4) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterMusic();
                }
                tL_messages_search.f27112q = str;
                tL_messages_search.peer = d2Var.getMessagesController().j1(j10);
                if (j11 != 0) {
                    if (j10 == d2Var.getUserConfig().e()) {
                        tL_messages_search.flags |= 4;
                        tL_messages_search.saved_peer_id = d2Var.getMessagesController().j1(j11);
                    } else {
                        tL_messages_search.flags |= 2;
                        tL_messages_search.top_msg_id = (int) j11;
                    }
                }
                if (tL_messages_search.peer == null) {
                    return;
                }
                int i11 = this.f38541n + 1;
                this.f38541n = i11;
                this.f38543s++;
                this.h = d2Var.getConnectionsManager().sendRequest(tL_messages_search, new org.telegram.messenger.hf(this, i3, i11, str, 2), 2);
                d2Var.getConnectionsManager().bindRequestToGuid(this.h, d2Var.getClassGuid());
                return;
            }
            this.f38540f.clear();
            this.f38541n = 0;
            f();
        }
    }

    public final void G(String str, boolean z10) {
        j50 j50Var = this.f38539e;
        if (j50Var != null) {
            org.telegram.messenger.g0.r(j50Var);
            this.f38539e = null;
        }
        if (!this.d.isEmpty() || !this.f38540f.isEmpty()) {
            this.d.clear();
            this.f38540f.clear();
            f();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        int i3 = 0;
        ws0 ws0Var = this.f38544w;
        if (isEmpty) {
            if (!this.d.isEmpty() || !this.f38540f.isEmpty() || this.f38543s != 0) {
                this.d.clear();
                this.f38540f.clear();
                if (this.h != 0) {
                    ws0Var.f40142y1.getConnectionsManager().cancelRequest(this.h, true);
                    this.h = 0;
                    this.f38543s--;
                    return;
                }
                return;
            }
            return;
        }
        while (true) {
            rr0[] rr0VarArr = ws0Var.f40108n0;
            if (i3 < rr0VarArr.length) {
                rr0 rr0Var = rr0VarArr[i3];
                if (rr0Var.F == this.f38542r) {
                    rr0Var.f37790w.e(true, z10);
                }
                i3++;
            } else {
                j50 j50Var2 = new j50(22, this, str);
                this.f38539e = j50Var2;
                org.telegram.messenger.g0.i3(j50Var2, 300L);
                return;
            }
        }
    }

    @Override
    public final int b() {
        int size = this.d.size();
        int size2 = this.f38540f.size();
        if (size2 != 0) {
            return size + size2;
        }
        return size;
    }

    @Override
    public final int d(int i3) {
        return 24;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        boolean z10;
        char c2;
        boolean z11;
        char c10;
        boolean z12;
        char c11;
        View view = d1Var.f55540a;
        ws0 ws0Var = this.f38544w;
        long j10 = ws0Var.m1;
        SparseArray[] sparseArrayArr = ws0Var.f40077c1;
        boolean z13 = false;
        int i10 = this.f38542r;
        if (i10 == 1) {
            if (view instanceof org.telegram.ui.Cells.g7) {
                org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
                org.telegram.messenger.zi E = E(i3);
                if (i3 != b() - 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                g7Var.c(E, z12);
                if (ws0Var.F1) {
                    if (org.telegram.messenger.zi.B0(E.f26868k) == j10) {
                        c11 = 0;
                    } else {
                        c11 = 1;
                    }
                    if (sparseArrayArr[c11].indexOfKey(E.f1()) >= 0) {
                        z13 = true;
                    }
                    g7Var.b(z13, !ws0Var.f40083e1);
                    return;
                }
                g7Var.b(false, !ws0Var.f40083e1);
            }
        } else if (i10 == 3) {
            if (view instanceof org.telegram.ui.Cells.j7) {
                org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
                org.telegram.messenger.zi E2 = E(i3);
                if (i3 != b() - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                j7Var.E = z11;
                j7Var.e();
                j7Var.f29438c0 = E2;
                j7Var.requestLayout();
                if (ws0Var.F1) {
                    if (org.telegram.messenger.zi.B0(E2.f26868k) == j10) {
                        c10 = 0;
                    } else {
                        c10 = 1;
                    }
                    if (sparseArrayArr[c10].indexOfKey(E2.f1()) >= 0) {
                        z13 = true;
                    }
                    j7Var.f(z13, !ws0Var.f40083e1);
                    return;
                }
                j7Var.f(false, !ws0Var.f40083e1);
            }
        } else if (i10 == 4 && (view instanceof org.telegram.ui.Cells.f7)) {
            org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view;
            org.telegram.messenger.zi E3 = E(i3);
            if (i3 != b() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            f7Var.f(E3, z10);
            if (ws0Var.F1) {
                if (org.telegram.messenger.zi.B0(E3.f26868k) == j10) {
                    c2 = 0;
                } else {
                    c2 = 1;
                }
                if (sparseArrayArr[c2].indexOfKey(E3.f1()) >= 0) {
                    z13 = true;
                }
                f7Var.e(z13, !ws0Var.f40083e1);
                return;
            }
            f7Var.e(false, !ws0Var.f40083e1);
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View view;
        ws0 ws0Var = this.f38544w;
        org.telegram.ui.ActionBar.e6 e6Var = ws0Var.I1;
        Context context = this.f38538c;
        int i10 = this.f38542r;
        if (i10 == 1) {
            view = new org.telegram.ui.Cells.g7(0, context, e6Var);
        } else if (i10 == 4) {
            view = new sr0(this, context, e6Var, 0);
        } else {
            org.telegram.ui.Cells.j7 j7Var = new org.telegram.ui.Cells.j7(0, context, e6Var);
            j7Var.setDelegate(ws0Var.W1);
            view = j7Var;
        }
        view.setLayoutParams(new u4.p0(-1, -2));
        return new u4.d1(view);
    }
}
