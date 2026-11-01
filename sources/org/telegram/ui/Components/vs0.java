package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class vs0 extends tk0 {
    public final Context f31899c;
    public hi0 e;
    public int f31901n;
    public final int f31902r;
    public int f31903s;
    public final au0 f31904w;
    public ArrayList d = new ArrayList();
    public ArrayList f31900f = new ArrayList();
    public int h = 0;

    public vs0(au0 au0Var, Context context, int i10) {
        this.f31904w = au0Var;
        this.f31899c = context;
        this.f31902r = i10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (this.f31900f.size() + this.d.size() != 0) {
            return true;
        }
        return false;
    }

    public final org.telegram.messenger.kj E(int i10) {
        if (i10 < this.d.size()) {
            return (org.telegram.messenger.kj) this.d.get(i10);
        }
        return (org.telegram.messenger.kj) this.f31900f.get(i10 - this.d.size());
    }

    public final void F(int i10, long j10, long j11, String str) {
        org.telegram.ui.ActionBar.k2 k2Var = this.f31904w.f24568x1;
        if (!org.telegram.messenger.o5.C(j10)) {
            if (this.h != 0) {
                k2Var.getConnectionsManager().cancelRequest(this.h, true);
                this.h = 0;
                this.f31903s--;
            }
            if (str != null && str.length() != 0) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.limit = 50;
                tL_messages_search.offset_id = i10;
                int i11 = this.f31902r;
                if (i11 == 1) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterDocument();
                } else if (i11 == 3) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterUrl();
                } else if (i11 == 4) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterMusic();
                }
                tL_messages_search.f19905q = str;
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
                int i12 = this.f31901n + 1;
                this.f31901n = i12;
                this.f31903s++;
                this.h = k2Var.getConnectionsManager().sendRequest(tL_messages_search, new org.telegram.messenger.pf(this, i10, i12, str, 2), 2);
                k2Var.getConnectionsManager().bindRequestToGuid(this.h, k2Var.getClassGuid());
                return;
            }
            this.f31900f.clear();
            this.f31901n = 0;
            f();
        }
    }

    public final void G(String str, boolean z10) {
        hi0 hi0Var = this.e;
        if (hi0Var != null) {
            org.telegram.messenger.i0.r(hi0Var);
            this.e = null;
        }
        if (!this.d.isEmpty() || !this.f31900f.isEmpty()) {
            this.d.clear();
            this.f31900f.clear();
            f();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        int i10 = 0;
        au0 au0Var = this.f31904w;
        if (isEmpty) {
            if (!this.d.isEmpty() || !this.f31900f.isEmpty() || this.f31903s != 0) {
                this.d.clear();
                this.f31900f.clear();
                if (this.h != 0) {
                    au0Var.f24568x1.getConnectionsManager().cancelRequest(this.h, true);
                    this.h = 0;
                    this.f31903s--;
                    return;
                }
                return;
            }
            return;
        }
        while (true) {
            ts0[] ts0VarArr = au0Var.m0;
            if (i10 < ts0VarArr.length) {
                ts0 ts0Var = ts0VarArr[i10];
                if (ts0Var.E == this.f31902r) {
                    ts0Var.f30722w.e(true, z10);
                }
                i10++;
            } else {
                hi0 hi0Var2 = new hi0(11, this, str);
                this.e = hi0Var2;
                org.telegram.messenger.i0.h3(hi0Var2, 300L);
                return;
            }
        }
    }

    @Override
    public final int b() {
        int size = this.d.size();
        int size2 = this.f31900f.size();
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
        View view = c1Var.f47909a;
        au0 au0Var = this.f31904w;
        long j10 = au0Var.l1;
        SparseArray[] sparseArrayArr = au0Var.f24502b1;
        boolean z13 = false;
        int i11 = this.f31902r;
        if (i11 == 1) {
            if (view instanceof org.telegram.ui.Cells.l7) {
                org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
                org.telegram.messenger.kj E = E(i10);
                if (i10 != b() - 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                l7Var.c(E, z12);
                if (au0Var.E1) {
                    if (org.telegram.messenger.kj.B0(E.f16690k) == j10) {
                        c12 = 0;
                    } else {
                        c12 = 1;
                    }
                    if (sparseArrayArr[c12].indexOfKey(E.f1()) >= 0) {
                        z13 = true;
                    }
                    l7Var.b(z13, !au0Var.f24509d1);
                    return;
                }
                l7Var.b(false, !au0Var.f24509d1);
            }
        } else if (i11 == 3) {
            if (view instanceof org.telegram.ui.Cells.o7) {
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
                org.telegram.messenger.kj E2 = E(i10);
                if (i10 != b() - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                o7Var.D = z11;
                o7Var.e();
                o7Var.f22389b0 = E2;
                o7Var.requestLayout();
                if (au0Var.E1) {
                    if (org.telegram.messenger.kj.B0(E2.f16690k) == j10) {
                        c11 = 0;
                    } else {
                        c11 = 1;
                    }
                    if (sparseArrayArr[c11].indexOfKey(E2.f1()) >= 0) {
                        z13 = true;
                    }
                    o7Var.f(z13, !au0Var.f24509d1);
                    return;
                }
                o7Var.f(false, !au0Var.f24509d1);
            }
        } else if (i11 == 4 && (view instanceof org.telegram.ui.Cells.k7)) {
            org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
            org.telegram.messenger.kj E3 = E(i10);
            if (i10 != b() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            k7Var.f(E3, z10);
            if (au0Var.E1) {
                if (org.telegram.messenger.kj.B0(E3.f16690k) == j10) {
                    c10 = 0;
                } else {
                    c10 = 1;
                }
                if (sparseArrayArr[c10].indexOfKey(E3.f1()) >= 0) {
                    z13 = true;
                }
                k7Var.e(z13, !au0Var.f24509d1);
                return;
            }
            k7Var.e(false, !au0Var.f24509d1);
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        au0 au0Var = this.f31904w;
        org.telegram.ui.ActionBar.p6 p6Var = au0Var.H1;
        Context context = this.f31899c;
        int i11 = this.f31902r;
        if (i11 == 1) {
            view = new org.telegram.ui.Cells.l7(0, context, p6Var);
        } else if (i11 == 4) {
            view = new us0(this, context, p6Var, 0);
        } else {
            org.telegram.ui.Cells.o7 o7Var = new org.telegram.ui.Cells.o7(0, context, p6Var);
            o7Var.setDelegate(au0Var.V1);
            view = o7Var;
        }
        view.setLayoutParams(new s4.o0(-1, -2));
        return new s4.c1(view);
    }
}
