package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class gs0 extends dk0 {
    public final Context f35659c;
    public fm0 f35660e;
    public int f35662n;
    public final int f35663r;
    public int f35664s;
    public final jt0 f35665w;
    public ArrayList d = new ArrayList();
    public ArrayList f35661f = new ArrayList();
    public int h = 0;

    public gs0(jt0 jt0Var, Context context, int i7) {
        this.f35665w = jt0Var;
        this.f35659c = context;
        this.f35663r = i7;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (this.f35661f.size() + this.d.size() != 0) {
            return true;
        }
        return false;
    }

    public final org.telegram.messenger.gj E(int i7) {
        if (i7 < this.d.size()) {
            return (org.telegram.messenger.gj) this.d.get(i7);
        }
        return (org.telegram.messenger.gj) this.f35661f.get(i7 - this.d.size());
    }

    public final void F(int i7, long j3, long j10, String str) {
        org.telegram.ui.ActionBar.g2 g2Var = this.f35665w.f36684y1;
        if (!org.telegram.messenger.n5.C(j3)) {
            if (this.h != 0) {
                g2Var.getConnectionsManager().cancelRequest(this.h, true);
                this.h = 0;
                this.f35664s--;
            }
            if (str != null && str.length() != 0) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.limit = 50;
                tL_messages_search.offset_id = i7;
                int i10 = this.f35663r;
                if (i10 == 1) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterDocument();
                } else if (i10 == 3) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterUrl();
                } else if (i10 == 4) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterMusic();
                }
                tL_messages_search.f28545q = str;
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
                int i11 = this.f35662n + 1;
                this.f35662n = i11;
                this.f35664s++;
                this.h = g2Var.getConnectionsManager().sendRequest(tL_messages_search, new org.telegram.messenger.rf(this, i7, i11, str, 2), 2);
                g2Var.getConnectionsManager().bindRequestToGuid(this.h, g2Var.getClassGuid());
                return;
            }
            this.f35661f.clear();
            this.f35662n = 0;
            f();
        }
    }

    public final void G(String str, boolean z10) {
        fm0 fm0Var = this.f35660e;
        if (fm0Var != null) {
            org.telegram.messenger.g0.r(fm0Var);
            this.f35660e = null;
        }
        if (!this.d.isEmpty() || !this.f35661f.isEmpty()) {
            this.d.clear();
            this.f35661f.clear();
            f();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        int i7 = 0;
        jt0 jt0Var = this.f35665w;
        if (isEmpty) {
            if (!this.d.isEmpty() || !this.f35661f.isEmpty() || this.f35664s != 0) {
                this.d.clear();
                this.f35661f.clear();
                if (this.h != 0) {
                    jt0Var.f36684y1.getConnectionsManager().cancelRequest(this.h, true);
                    this.h = 0;
                    this.f35664s--;
                    return;
                }
                return;
            }
            return;
        }
        while (true) {
            ds0[] ds0VarArr = jt0Var.f36651n0;
            if (i7 < ds0VarArr.length) {
                ds0 ds0Var = ds0VarArr[i7];
                if (ds0Var.F == this.f35663r) {
                    ds0Var.f34564w.e(true, z10);
                }
                i7++;
            } else {
                fm0 fm0Var2 = new fm0(9, this, str);
                this.f35660e = fm0Var2;
                org.telegram.messenger.g0.h3(fm0Var2, 300L);
                return;
            }
        }
    }

    @Override
    public final int b() {
        int size = this.d.size();
        int size2 = this.f35661f.size();
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
        View view = f1Var.f59165a;
        jt0 jt0Var = this.f35665w;
        long j3 = jt0Var.f36648m1;
        SparseArray[] sparseArrayArr = jt0Var.f36619c1;
        boolean z13 = false;
        int i10 = this.f35663r;
        if (i10 == 1) {
            if (view instanceof org.telegram.ui.Cells.i7) {
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
                org.telegram.messenger.gj E = E(i7);
                if (i7 != b() - 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                i7Var.c(E, z12);
                if (jt0Var.F1) {
                    if (org.telegram.messenger.gj.B0(E.f24213k) == j3) {
                        c12 = 0;
                    } else {
                        c12 = 1;
                    }
                    if (sparseArrayArr[c12].indexOfKey(E.e1()) >= 0) {
                        z13 = true;
                    }
                    i7Var.b(z13, !jt0Var.f36625e1);
                    return;
                }
                i7Var.b(false, !jt0Var.f36625e1);
            }
        } else if (i10 == 3) {
            if (view instanceof org.telegram.ui.Cells.l7) {
                org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
                org.telegram.messenger.gj E2 = E(i7);
                if (i7 != b() - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                l7Var.E = z11;
                l7Var.e();
                l7Var.f31030c0 = E2;
                l7Var.requestLayout();
                if (jt0Var.F1) {
                    if (org.telegram.messenger.gj.B0(E2.f24213k) == j3) {
                        c11 = 0;
                    } else {
                        c11 = 1;
                    }
                    if (sparseArrayArr[c11].indexOfKey(E2.e1()) >= 0) {
                        z13 = true;
                    }
                    l7Var.f(z13, !jt0Var.f36625e1);
                    return;
                }
                l7Var.f(false, !jt0Var.f36625e1);
            }
        } else if (i10 == 4 && (view instanceof org.telegram.ui.Cells.h7)) {
            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
            org.telegram.messenger.gj E3 = E(i7);
            if (i7 != b() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            h7Var.f(E3, z10);
            if (jt0Var.F1) {
                if (org.telegram.messenger.gj.B0(E3.f24213k) == j3) {
                    c10 = 0;
                } else {
                    c10 = 1;
                }
                if (sparseArrayArr[c10].indexOfKey(E3.e1()) >= 0) {
                    z13 = true;
                }
                h7Var.e(z13, !jt0Var.f36625e1);
                return;
            }
            h7Var.e(false, !jt0Var.f36625e1);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        jt0 jt0Var = this.f35665w;
        org.telegram.ui.ActionBar.h6 h6Var = jt0Var.I1;
        Context context = this.f35659c;
        int i10 = this.f35663r;
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
