package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class vr0 extends tj0 {
    public final Context f41137c;
    public hh0 f41138e;
    public int f41140n;
    public final int f41141r;
    public int f41142s;
    public final ys0 f41143w;
    public ArrayList d = new ArrayList();
    public ArrayList f41139f = new ArrayList();
    public int h = 0;

    public vr0(ys0 ys0Var, Context context, int i7) {
        this.f41143w = ys0Var;
        this.f41137c = context;
        this.f41141r = i7;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        if (this.f41139f.size() + this.d.size() != 0) {
            return true;
        }
        return false;
    }

    public final org.telegram.messenger.gj E(int i7) {
        if (i7 < this.d.size()) {
            return (org.telegram.messenger.gj) this.d.get(i7);
        }
        return (org.telegram.messenger.gj) this.f41139f.get(i7 - this.d.size());
    }

    public final void F(int i7, long j3, long j10, String str) {
        org.telegram.ui.ActionBar.e2 e2Var = this.f41143w.f42152y1;
        if (!org.telegram.messenger.m5.C(j3)) {
            if (this.h != 0) {
                e2Var.getConnectionsManager().cancelRequest(this.h, true);
                this.h = 0;
                this.f41142s--;
            }
            if (str != null && str.length() != 0) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.limit = 50;
                tL_messages_search.offset_id = i7;
                int i10 = this.f41141r;
                if (i10 == 1) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterDocument();
                } else if (i10 == 3) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterUrl();
                } else if (i10 == 4) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterMusic();
                }
                tL_messages_search.f28162q = str;
                tL_messages_search.peer = e2Var.getMessagesController().j1(j3);
                if (j10 != 0) {
                    if (j3 == e2Var.getUserConfig().e()) {
                        tL_messages_search.flags |= 4;
                        tL_messages_search.saved_peer_id = e2Var.getMessagesController().j1(j10);
                    } else {
                        tL_messages_search.flags |= 2;
                        tL_messages_search.top_msg_id = (int) j10;
                    }
                }
                if (tL_messages_search.peer == null) {
                    return;
                }
                int i11 = this.f41140n + 1;
                this.f41140n = i11;
                this.f41142s++;
                this.h = e2Var.getConnectionsManager().sendRequest(tL_messages_search, new org.telegram.messenger.pf(this, i7, i11, str, 2), 2);
                e2Var.getConnectionsManager().bindRequestToGuid(this.h, e2Var.getClassGuid());
                return;
            }
            this.f41139f.clear();
            this.f41140n = 0;
            f();
        }
    }

    public final void G(String str, boolean z10) {
        hh0 hh0Var = this.f41138e;
        if (hh0Var != null) {
            org.telegram.messenger.g0.r(hh0Var);
            this.f41138e = null;
        }
        if (!this.d.isEmpty() || !this.f41139f.isEmpty()) {
            this.d.clear();
            this.f41139f.clear();
            f();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        int i7 = 0;
        ys0 ys0Var = this.f41143w;
        if (isEmpty) {
            if (!this.d.isEmpty() || !this.f41139f.isEmpty() || this.f41142s != 0) {
                this.d.clear();
                this.f41139f.clear();
                if (this.h != 0) {
                    ys0Var.f42152y1.getConnectionsManager().cancelRequest(this.h, true);
                    this.h = 0;
                    this.f41142s--;
                    return;
                }
                return;
            }
            return;
        }
        while (true) {
            tr0[] tr0VarArr = ys0Var.f42119n0;
            if (i7 < tr0VarArr.length) {
                tr0 tr0Var = tr0VarArr[i7];
                if (tr0Var.F == this.f41141r) {
                    tr0Var.f39795w.e(true, z10);
                }
                i7++;
            } else {
                hh0 hh0Var2 = new hh0(11, this, str);
                this.f41138e = hh0Var2;
                org.telegram.messenger.g0.i3(hh0Var2, 300L);
                return;
            }
        }
    }

    @Override
    public final int b() {
        int size = this.d.size();
        int size2 = this.f41139f.size();
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
    public final void t(v4.e1 e1Var, int i7) {
        boolean z10;
        char c10;
        boolean z11;
        char c11;
        boolean z12;
        char c12;
        View view = e1Var.f58535a;
        ys0 ys0Var = this.f41143w;
        long j3 = ys0Var.f42116m1;
        SparseArray[] sparseArrayArr = ys0Var.f42087c1;
        boolean z13 = false;
        int i10 = this.f41141r;
        if (i10 == 1) {
            if (view instanceof org.telegram.ui.Cells.g7) {
                org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
                org.telegram.messenger.gj E = E(i7);
                if (i7 != b() - 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                g7Var.c(E, z12);
                if (ys0Var.F1) {
                    if (org.telegram.messenger.gj.B0(E.f23819k) == j3) {
                        c12 = 0;
                    } else {
                        c12 = 1;
                    }
                    if (sparseArrayArr[c12].indexOfKey(E.e1()) >= 0) {
                        z13 = true;
                    }
                    g7Var.b(z13, !ys0Var.f42093e1);
                    return;
                }
                g7Var.b(false, !ys0Var.f42093e1);
            }
        } else if (i10 == 3) {
            if (view instanceof org.telegram.ui.Cells.j7) {
                org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
                org.telegram.messenger.gj E2 = E(i7);
                if (i7 != b() - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                j7Var.E = z11;
                j7Var.e();
                j7Var.f30499c0 = E2;
                j7Var.requestLayout();
                if (ys0Var.F1) {
                    if (org.telegram.messenger.gj.B0(E2.f23819k) == j3) {
                        c11 = 0;
                    } else {
                        c11 = 1;
                    }
                    if (sparseArrayArr[c11].indexOfKey(E2.e1()) >= 0) {
                        z13 = true;
                    }
                    j7Var.f(z13, !ys0Var.f42093e1);
                    return;
                }
                j7Var.f(false, !ys0Var.f42093e1);
            }
        } else if (i10 == 4 && (view instanceof org.telegram.ui.Cells.f7)) {
            org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view;
            org.telegram.messenger.gj E3 = E(i7);
            if (i7 != b() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            f7Var.f(E3, z10);
            if (ys0Var.F1) {
                if (org.telegram.messenger.gj.B0(E3.f23819k) == j3) {
                    c10 = 0;
                } else {
                    c10 = 1;
                }
                if (sparseArrayArr[c10].indexOfKey(E3.e1()) >= 0) {
                    z13 = true;
                }
                f7Var.e(z13, !ys0Var.f42093e1);
                return;
            }
            f7Var.e(false, !ys0Var.f42093e1);
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View view;
        ys0 ys0Var = this.f41143w;
        org.telegram.ui.ActionBar.e6 e6Var = ys0Var.I1;
        Context context = this.f41137c;
        int i10 = this.f41141r;
        if (i10 == 1) {
            view = new org.telegram.ui.Cells.g7(0, context, e6Var);
        } else if (i10 == 4) {
            view = new ur0(this, context, e6Var, 0);
        } else {
            org.telegram.ui.Cells.j7 j7Var = new org.telegram.ui.Cells.j7(0, context, e6Var);
            j7Var.setDelegate(ys0Var.W1);
            view = j7Var;
        }
        view.setLayoutParams(new v4.p0(-1, -2));
        return new v4.e1(view);
    }
}
