package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class us0 extends sk0 {
    public final Context f31031c;
    public gi0 e;
    public int f31033n;
    public final int f31034r;
    public int f31035s;
    public final zt0 f31036w;
    public ArrayList d = new ArrayList();
    public ArrayList f31032f = new ArrayList();
    public int h = 0;

    public us0(zt0 zt0Var, Context context, int i10) {
        this.f31036w = zt0Var;
        this.f31031c = context;
        this.f31034r = i10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (this.f31032f.size() + this.d.size() != 0) {
            return true;
        }
        return false;
    }

    public final org.telegram.messenger.jj E(int i10) {
        if (i10 < this.d.size()) {
            return (org.telegram.messenger.jj) this.d.get(i10);
        }
        return (org.telegram.messenger.jj) this.f31032f.get(i10 - this.d.size());
    }

    public final void F(int i10, long j10, long j11, String str) {
        org.telegram.ui.ActionBar.k2 k2Var = this.f31036w.f33240x1;
        if (!org.telegram.messenger.o5.C(j10)) {
            if (this.h != 0) {
                k2Var.getConnectionsManager().cancelRequest(this.h, true);
                this.h = 0;
                this.f31035s--;
            }
            if (str != null && str.length() != 0) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.limit = 50;
                tL_messages_search.offset_id = i10;
                int i11 = this.f31034r;
                if (i11 == 1) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterDocument();
                } else if (i11 == 3) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterUrl();
                } else if (i11 == 4) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterMusic();
                }
                tL_messages_search.f19904q = str;
                tL_messages_search.peer = k2Var.getMessagesController().i1(j10);
                if (j11 != 0) {
                    if (j10 == k2Var.getUserConfig().e()) {
                        tL_messages_search.flags |= 4;
                        tL_messages_search.saved_peer_id = k2Var.getMessagesController().i1(j11);
                    } else {
                        tL_messages_search.flags |= 2;
                        tL_messages_search.top_msg_id = (int) j11;
                    }
                }
                if (tL_messages_search.peer == null) {
                    return;
                }
                int i12 = this.f31033n + 1;
                this.f31033n = i12;
                this.f31035s++;
                this.h = k2Var.getConnectionsManager().sendRequest(tL_messages_search, new org.telegram.messenger.of(this, i10, i12, str, 2), 2);
                k2Var.getConnectionsManager().bindRequestToGuid(this.h, k2Var.getClassGuid());
                return;
            }
            this.f31032f.clear();
            this.f31033n = 0;
            f();
        }
    }

    public final void G(String str, boolean z10) {
        gi0 gi0Var = this.e;
        if (gi0Var != null) {
            org.telegram.messenger.i0.r(gi0Var);
            this.e = null;
        }
        if (!this.d.isEmpty() || !this.f31032f.isEmpty()) {
            this.d.clear();
            this.f31032f.clear();
            f();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        int i10 = 0;
        zt0 zt0Var = this.f31036w;
        if (isEmpty) {
            if (!this.d.isEmpty() || !this.f31032f.isEmpty() || this.f31035s != 0) {
                this.d.clear();
                this.f31032f.clear();
                if (this.h != 0) {
                    zt0Var.f33240x1.getConnectionsManager().cancelRequest(this.h, true);
                    this.h = 0;
                    this.f31035s--;
                    return;
                }
                return;
            }
            return;
        }
        while (true) {
            ss0[] ss0VarArr = zt0Var.m0;
            if (i10 < ss0VarArr.length) {
                ss0 ss0Var = ss0VarArr[i10];
                if (ss0Var.E == this.f31034r) {
                    ss0Var.f30355w.e(true, z10);
                }
                i10++;
            } else {
                gi0 gi0Var2 = new gi0(11, this, str);
                this.e = gi0Var2;
                org.telegram.messenger.i0.h3(gi0Var2, 300L);
                return;
            }
        }
    }

    @Override
    public final int b() {
        int size = this.d.size();
        int size2 = this.f31032f.size();
        if (size2 != 0) {
            return size + size2;
        }
        return size;
    }

    @Override
    public final int d(int i10) {
        return 24;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        boolean z10;
        char c10;
        boolean z11;
        char c11;
        boolean z12;
        char c12;
        View view = c1Var.f47898a;
        zt0 zt0Var = this.f31036w;
        long j10 = zt0Var.l1;
        SparseArray[] sparseArrayArr = zt0Var.f33174b1;
        boolean z13 = false;
        int i11 = this.f31034r;
        if (i11 == 1) {
            if (view instanceof org.telegram.ui.Cells.l7) {
                org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
                org.telegram.messenger.jj E = E(i10);
                if (i10 != b() - 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                l7Var.c(E, z12);
                if (zt0Var.E1) {
                    if (org.telegram.messenger.jj.B0(E.f16337k) == j10) {
                        c12 = 0;
                    } else {
                        c12 = 1;
                    }
                    if (sparseArrayArr[c12].indexOfKey(E.f1()) >= 0) {
                        z13 = true;
                    }
                    l7Var.b(z13, !zt0Var.f33181d1);
                    return;
                }
                l7Var.b(false, !zt0Var.f33181d1);
            }
        } else if (i11 == 3) {
            if (view instanceof org.telegram.ui.Cells.o7) {
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
                org.telegram.messenger.jj E2 = E(i10);
                if (i10 != b() - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                o7Var.D = z11;
                o7Var.e();
                o7Var.f22388b0 = E2;
                o7Var.requestLayout();
                if (zt0Var.E1) {
                    if (org.telegram.messenger.jj.B0(E2.f16337k) == j10) {
                        c11 = 0;
                    } else {
                        c11 = 1;
                    }
                    if (sparseArrayArr[c11].indexOfKey(E2.f1()) >= 0) {
                        z13 = true;
                    }
                    o7Var.f(z13, !zt0Var.f33181d1);
                    return;
                }
                o7Var.f(false, !zt0Var.f33181d1);
            }
        } else if (i11 == 4 && (view instanceof org.telegram.ui.Cells.k7)) {
            org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
            org.telegram.messenger.jj E3 = E(i10);
            if (i10 != b() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            k7Var.f(E3, z10);
            if (zt0Var.E1) {
                if (org.telegram.messenger.jj.B0(E3.f16337k) == j10) {
                    c10 = 0;
                } else {
                    c10 = 1;
                }
                if (sparseArrayArr[c10].indexOfKey(E3.f1()) >= 0) {
                    z13 = true;
                }
                k7Var.e(z13, !zt0Var.f33181d1);
                return;
            }
            k7Var.e(false, !zt0Var.f33181d1);
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        zt0 zt0Var = this.f31036w;
        org.telegram.ui.ActionBar.p6 p6Var = zt0Var.H1;
        Context context = this.f31031c;
        int i11 = this.f31034r;
        if (i11 == 1) {
            view = new org.telegram.ui.Cells.l7(0, context, p6Var);
        } else if (i11 == 4) {
            view = new ts0(this, context, p6Var, 0);
        } else {
            org.telegram.ui.Cells.o7 o7Var = new org.telegram.ui.Cells.o7(0, context, p6Var);
            o7Var.setDelegate(zt0Var.V1);
            view = o7Var;
        }
        view.setLayoutParams(new s4.o0(-1, -2));
        return new s4.c1(view);
    }
}
