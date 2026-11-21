package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class gs0 extends dk0 {
    public final Context f35640c;
    public fm0 f35641e;
    public int f35643n;
    public final int f35644r;
    public int f35645s;
    public final jt0 f35646w;
    public ArrayList d = new ArrayList();
    public ArrayList f35642f = new ArrayList();
    public int h = 0;

    public gs0(jt0 jt0Var, Context context, int i7) {
        this.f35646w = jt0Var;
        this.f35640c = context;
        this.f35644r = i7;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (this.f35642f.size() + this.d.size() != 0) {
            return true;
        }
        return false;
    }

    public final org.telegram.messenger.fj E(int i7) {
        if (i7 < this.d.size()) {
            return (org.telegram.messenger.fj) this.d.get(i7);
        }
        return (org.telegram.messenger.fj) this.f35642f.get(i7 - this.d.size());
    }

    public final void F(int i7, long j3, long j10, String str) {
        org.telegram.ui.ActionBar.g2 g2Var = this.f35646w.f36689y1;
        if (!org.telegram.messenger.n5.C(j3)) {
            if (this.h != 0) {
                g2Var.getConnectionsManager().cancelRequest(this.h, true);
                this.h = 0;
                this.f35645s--;
            }
            if (str != null && str.length() != 0) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.limit = 50;
                tL_messages_search.offset_id = i7;
                int i10 = this.f35644r;
                if (i10 == 1) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterDocument();
                } else if (i10 == 3) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterUrl();
                } else if (i10 == 4) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterMusic();
                }
                tL_messages_search.f28542q = str;
                tL_messages_search.peer = g2Var.getMessagesController().l1(j3);
                if (j10 != 0) {
                    if (j3 == g2Var.getUserConfig().e()) {
                        tL_messages_search.flags |= 4;
                        tL_messages_search.saved_peer_id = g2Var.getMessagesController().l1(j10);
                    } else {
                        tL_messages_search.flags |= 2;
                        tL_messages_search.top_msg_id = (int) j10;
                    }
                }
                if (tL_messages_search.peer == null) {
                    return;
                }
                int i11 = this.f35643n + 1;
                this.f35643n = i11;
                this.f35645s++;
                this.h = g2Var.getConnectionsManager().sendRequest(tL_messages_search, new org.telegram.messenger.qf(this, i7, i11, str, 2), 2);
                g2Var.getConnectionsManager().bindRequestToGuid(this.h, g2Var.getClassGuid());
                return;
            }
            this.f35642f.clear();
            this.f35643n = 0;
            f();
        }
    }

    public final void G(String str, boolean z10) {
        fm0 fm0Var = this.f35641e;
        if (fm0Var != null) {
            org.telegram.messenger.g0.r(fm0Var);
            this.f35641e = null;
        }
        if (!this.d.isEmpty() || !this.f35642f.isEmpty()) {
            this.d.clear();
            this.f35642f.clear();
            f();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        int i7 = 0;
        jt0 jt0Var = this.f35646w;
        if (isEmpty) {
            if (!this.d.isEmpty() || !this.f35642f.isEmpty() || this.f35645s != 0) {
                this.d.clear();
                this.f35642f.clear();
                if (this.h != 0) {
                    jt0Var.f36689y1.getConnectionsManager().cancelRequest(this.h, true);
                    this.h = 0;
                    this.f35645s--;
                    return;
                }
                return;
            }
            return;
        }
        while (true) {
            ds0[] ds0VarArr = jt0Var.f36656n0;
            if (i7 < ds0VarArr.length) {
                ds0 ds0Var = ds0VarArr[i7];
                if (ds0Var.F == this.f35644r) {
                    ds0Var.f34569w.e(true, z10);
                }
                i7++;
            } else {
                fm0 fm0Var2 = new fm0(9, this, str);
                this.f35641e = fm0Var2;
                org.telegram.messenger.g0.h3(fm0Var2, 300L);
                return;
            }
        }
    }

    @Override
    public final int b() {
        int size = this.d.size();
        int size2 = this.f35642f.size();
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
        View view = f1Var.f59161a;
        jt0 jt0Var = this.f35646w;
        long j3 = jt0Var.f36653m1;
        SparseArray[] sparseArrayArr = jt0Var.f36624c1;
        boolean z13 = false;
        int i10 = this.f35644r;
        if (i10 == 1) {
            if (view instanceof org.telegram.ui.Cells.i7) {
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
                org.telegram.messenger.fj E = E(i7);
                if (i7 != b() - 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                i7Var.c(E, z12);
                if (jt0Var.F1) {
                    if (org.telegram.messenger.fj.B0(E.f23993k) == j3) {
                        c12 = 0;
                    } else {
                        c12 = 1;
                    }
                    if (sparseArrayArr[c12].indexOfKey(E.e1()) >= 0) {
                        z13 = true;
                    }
                    i7Var.b(z13, !jt0Var.f36630e1);
                    return;
                }
                i7Var.b(false, !jt0Var.f36630e1);
            }
        } else if (i10 == 3) {
            if (view instanceof org.telegram.ui.Cells.l7) {
                org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
                org.telegram.messenger.fj E2 = E(i7);
                if (i7 != b() - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                l7Var.E = z11;
                l7Var.e();
                l7Var.f31027c0 = E2;
                l7Var.requestLayout();
                if (jt0Var.F1) {
                    if (org.telegram.messenger.fj.B0(E2.f23993k) == j3) {
                        c11 = 0;
                    } else {
                        c11 = 1;
                    }
                    if (sparseArrayArr[c11].indexOfKey(E2.e1()) >= 0) {
                        z13 = true;
                    }
                    l7Var.f(z13, !jt0Var.f36630e1);
                    return;
                }
                l7Var.f(false, !jt0Var.f36630e1);
            }
        } else if (i10 == 4 && (view instanceof org.telegram.ui.Cells.h7)) {
            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
            org.telegram.messenger.fj E3 = E(i7);
            if (i7 != b() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            h7Var.f(E3, z10);
            if (jt0Var.F1) {
                if (org.telegram.messenger.fj.B0(E3.f23993k) == j3) {
                    c10 = 0;
                } else {
                    c10 = 1;
                }
                if (sparseArrayArr[c10].indexOfKey(E3.e1()) >= 0) {
                    z13 = true;
                }
                h7Var.e(z13, !jt0Var.f36630e1);
                return;
            }
            h7Var.e(false, !jt0Var.f36630e1);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        jt0 jt0Var = this.f35646w;
        org.telegram.ui.ActionBar.h6 h6Var = jt0Var.I1;
        Context context = this.f35640c;
        int i10 = this.f35644r;
        if (i10 == 1) {
            view = new org.telegram.ui.Cells.i7(0, context, h6Var);
        } else if (i10 == 4) {
            view = new fs0(this, context, h6Var, 0);
        } else {
            org.telegram.ui.Cells.l7 l7Var = new org.telegram.ui.Cells.l7(0, context, h6Var);
            l7Var.setDelegate(jt0Var.W1);
            view = l7Var;
        }
        view.setLayoutParams(new v4.q0(-1, -2));
        return new v4.f1(view);
    }
}
