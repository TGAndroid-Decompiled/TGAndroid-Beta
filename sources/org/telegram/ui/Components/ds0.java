package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ds0 extends bk0 {
    public final Context f34493c;
    public hn0 f34494e;
    public int f34496n;
    public final int f34497r;
    public int f34498s;
    public final gt0 f34499w;
    public ArrayList d = new ArrayList();
    public ArrayList f34495f = new ArrayList();
    public int h = 0;

    public ds0(gt0 gt0Var, Context context, int i7) {
        this.f34499w = gt0Var;
        this.f34493c = context;
        this.f34497r = i7;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (this.f34495f.size() + this.d.size() != 0) {
            return true;
        }
        return false;
    }

    public final org.telegram.messenger.fj E(int i7) {
        if (i7 < this.d.size()) {
            return (org.telegram.messenger.fj) this.d.get(i7);
        }
        return (org.telegram.messenger.fj) this.f34495f.get(i7 - this.d.size());
    }

    public final void F(int i7, long j3, long j10, String str) {
        org.telegram.ui.ActionBar.h2 h2Var = this.f34499w.f35642y1;
        if (!org.telegram.messenger.n5.C(j3)) {
            if (this.h != 0) {
                h2Var.getConnectionsManager().cancelRequest(this.h, true);
                this.h = 0;
                this.f34498s--;
            }
            if (str != null && str.length() != 0) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.limit = 50;
                tL_messages_search.offset_id = i7;
                int i10 = this.f34497r;
                if (i10 == 1) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterDocument();
                } else if (i10 == 3) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterUrl();
                } else if (i10 == 4) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterMusic();
                }
                tL_messages_search.f28516q = str;
                tL_messages_search.peer = h2Var.getMessagesController().l1(j3);
                if (j10 != 0) {
                    if (j3 == h2Var.getUserConfig().e()) {
                        tL_messages_search.flags |= 4;
                        tL_messages_search.saved_peer_id = h2Var.getMessagesController().l1(j10);
                    } else {
                        tL_messages_search.flags |= 2;
                        tL_messages_search.top_msg_id = (int) j10;
                    }
                }
                if (tL_messages_search.peer == null) {
                    return;
                }
                int i11 = this.f34496n + 1;
                this.f34496n = i11;
                this.f34498s++;
                this.h = h2Var.getConnectionsManager().sendRequest(tL_messages_search, new org.telegram.messenger.qf(this, i7, i11, str, 2), 2);
                h2Var.getConnectionsManager().bindRequestToGuid(this.h, h2Var.getClassGuid());
                return;
            }
            this.f34495f.clear();
            this.f34496n = 0;
            f();
        }
    }

    public final void G(String str, boolean z10) {
        hn0 hn0Var = this.f34494e;
        if (hn0Var != null) {
            org.telegram.messenger.g0.r(hn0Var);
            this.f34494e = null;
        }
        if (!this.d.isEmpty() || !this.f34495f.isEmpty()) {
            this.d.clear();
            this.f34495f.clear();
            f();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        int i7 = 0;
        gt0 gt0Var = this.f34499w;
        if (isEmpty) {
            if (!this.d.isEmpty() || !this.f34495f.isEmpty() || this.f34498s != 0) {
                this.d.clear();
                this.f34495f.clear();
                if (this.h != 0) {
                    gt0Var.f35642y1.getConnectionsManager().cancelRequest(this.h, true);
                    this.h = 0;
                    this.f34498s--;
                    return;
                }
                return;
            }
            return;
        }
        while (true) {
            bs0[] bs0VarArr = gt0Var.f35609n0;
            if (i7 < bs0VarArr.length) {
                bs0 bs0Var = bs0VarArr[i7];
                if (bs0Var.F == this.f34497r) {
                    bs0Var.f33774w.e(true, z10);
                }
                i7++;
            } else {
                hn0 hn0Var2 = new hn0(7, this, str);
                this.f34494e = hn0Var2;
                org.telegram.messenger.g0.h3(hn0Var2, 300L);
                return;
            }
        }
    }

    @Override
    public final int b() {
        int size = this.d.size();
        int size2 = this.f34495f.size();
        if (size2 != 0) {
            return size + size2;
        }
        return size;
    }

    @Override
    public final int d(int i7) {
        return 24;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        char c10;
        boolean z11;
        char c11;
        boolean z12;
        char c12;
        View view = f1Var.f59122a;
        gt0 gt0Var = this.f34499w;
        long j3 = gt0Var.f35606m1;
        SparseArray[] sparseArrayArr = gt0Var.f35577c1;
        boolean z13 = false;
        int i10 = this.f34497r;
        if (i10 == 1) {
            if (view instanceof org.telegram.ui.Cells.h7) {
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                org.telegram.messenger.fj E = E(i7);
                if (i7 != b() - 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                h7Var.c(E, z12);
                if (gt0Var.F1) {
                    if (org.telegram.messenger.fj.B0(E.f23968k) == j3) {
                        c12 = 0;
                    } else {
                        c12 = 1;
                    }
                    if (sparseArrayArr[c12].indexOfKey(E.e1()) >= 0) {
                        z13 = true;
                    }
                    h7Var.b(z13, !gt0Var.f35583e1);
                    return;
                }
                h7Var.b(false, !gt0Var.f35583e1);
            }
        } else if (i10 == 3) {
            if (view instanceof org.telegram.ui.Cells.k7) {
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
                org.telegram.messenger.fj E2 = E(i7);
                if (i7 != b() - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                k7Var.E = z11;
                k7Var.e();
                k7Var.f30936c0 = E2;
                k7Var.requestLayout();
                if (gt0Var.F1) {
                    if (org.telegram.messenger.fj.B0(E2.f23968k) == j3) {
                        c11 = 0;
                    } else {
                        c11 = 1;
                    }
                    if (sparseArrayArr[c11].indexOfKey(E2.e1()) >= 0) {
                        z13 = true;
                    }
                    k7Var.f(z13, !gt0Var.f35583e1);
                    return;
                }
                k7Var.f(false, !gt0Var.f35583e1);
            }
        } else if (i10 == 4 && (view instanceof org.telegram.ui.Cells.g7)) {
            org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
            org.telegram.messenger.fj E3 = E(i7);
            if (i7 != b() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            g7Var.f(E3, z10);
            if (gt0Var.F1) {
                if (org.telegram.messenger.fj.B0(E3.f23968k) == j3) {
                    c10 = 0;
                } else {
                    c10 = 1;
                }
                if (sparseArrayArr[c10].indexOfKey(E3.e1()) >= 0) {
                    z13 = true;
                }
                g7Var.e(z13, !gt0Var.f35583e1);
                return;
            }
            g7Var.e(false, !gt0Var.f35583e1);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        gt0 gt0Var = this.f34499w;
        org.telegram.ui.ActionBar.i6 i6Var = gt0Var.I1;
        Context context = this.f34493c;
        int i10 = this.f34497r;
        if (i10 == 1) {
            view = new org.telegram.ui.Cells.h7(0, context, i6Var);
        } else if (i10 == 4) {
            view = new cs0(this, context, i6Var, 0);
        } else {
            org.telegram.ui.Cells.k7 k7Var = new org.telegram.ui.Cells.k7(0, context, i6Var);
            k7Var.setDelegate(gt0Var.W1);
            view = k7Var;
        }
        view.setLayoutParams(new v4.q0(-1, -2));
        return new v4.f1(view);
    }
}
