package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class vr0 extends oj0 {
    public final Context f39719c;
    public r80 f39720e;
    public int f39722n;
    public final int f39723r;
    public int f39724s;
    public final ys0 f39725w;
    public ArrayList d = new ArrayList();
    public ArrayList f39721f = new ArrayList();
    public int h = 0;

    public vr0(ys0 ys0Var, Context context, int i7) {
        this.f39725w = ys0Var;
        this.f39719c = context;
        this.f39723r = i7;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (this.f39721f.size() + this.d.size() != 0) {
            return true;
        }
        return false;
    }

    public final org.telegram.messenger.ij E(int i7) {
        if (i7 < this.d.size()) {
            return (org.telegram.messenger.ij) this.d.get(i7);
        }
        return (org.telegram.messenger.ij) this.f39721f.get(i7 - this.d.size());
    }

    public final void F(int i7, long j3, long j10, String str) {
        org.telegram.ui.ActionBar.f2 f2Var = this.f39725w.f40719x1;
        if (!org.telegram.messenger.m5.C(j3)) {
            if (this.h != 0) {
                f2Var.getConnectionsManager().cancelRequest(this.h, true);
                this.h = 0;
                this.f39724s--;
            }
            if (str != null && str.length() != 0) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.limit = 50;
                tL_messages_search.offset_id = i7;
                int i10 = this.f39723r;
                if (i10 == 1) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterDocument();
                } else if (i10 == 3) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterUrl();
                } else if (i10 == 4) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterMusic();
                }
                tL_messages_search.f27071q = str;
                tL_messages_search.peer = f2Var.getMessagesController().j1(j3);
                if (j10 != 0) {
                    if (j3 == f2Var.getUserConfig().e()) {
                        tL_messages_search.flags |= 4;
                        tL_messages_search.saved_peer_id = f2Var.getMessagesController().j1(j10);
                    } else {
                        tL_messages_search.flags |= 2;
                        tL_messages_search.top_msg_id = (int) j10;
                    }
                }
                if (tL_messages_search.peer == null) {
                    return;
                }
                int i11 = this.f39722n + 1;
                this.f39722n = i11;
                this.f39724s++;
                this.h = f2Var.getConnectionsManager().sendRequest(tL_messages_search, new org.telegram.messenger.qf(this, i7, i11, str, 2), 2);
                f2Var.getConnectionsManager().bindRequestToGuid(this.h, f2Var.getClassGuid());
                return;
            }
            this.f39721f.clear();
            this.f39722n = 0;
            f();
        }
    }

    public final void G(String str, boolean z9) {
        r80 r80Var = this.f39720e;
        if (r80Var != null) {
            org.telegram.messenger.g0.r(r80Var);
            this.f39720e = null;
        }
        if (!this.d.isEmpty() || !this.f39721f.isEmpty()) {
            this.d.clear();
            this.f39721f.clear();
            f();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        int i7 = 0;
        ys0 ys0Var = this.f39725w;
        if (isEmpty) {
            if (!this.d.isEmpty() || !this.f39721f.isEmpty() || this.f39724s != 0) {
                this.d.clear();
                this.f39721f.clear();
                if (this.h != 0) {
                    ys0Var.f40719x1.getConnectionsManager().cancelRequest(this.h, true);
                    this.h = 0;
                    this.f39724s--;
                    return;
                }
                return;
            }
            return;
        }
        while (true) {
            tr0[] tr0VarArr = ys0Var.m0;
            if (i7 < tr0VarArr.length) {
                tr0 tr0Var = tr0VarArr[i7];
                if (tr0Var.E == this.f39723r) {
                    tr0Var.f38389w.e(true, z9);
                }
                i7++;
            } else {
                r80 r80Var2 = new r80(18, this, str);
                this.f39720e = r80Var2;
                org.telegram.messenger.g0.i3(r80Var2, 300L);
                return;
            }
        }
    }

    @Override
    public final int b() {
        int size = this.d.size();
        int size2 = this.f39721f.size();
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
    public final void t(v4.d1 d1Var, int i7) {
        boolean z9;
        char c10;
        boolean z10;
        char c11;
        boolean z11;
        char c12;
        View view = d1Var.f57052a;
        ys0 ys0Var = this.f39725w;
        long j3 = ys0Var.l1;
        SparseArray[] sparseArrayArr = ys0Var.f40654b1;
        boolean z12 = false;
        int i10 = this.f39723r;
        if (i10 == 1) {
            if (view instanceof org.telegram.ui.Cells.h7) {
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                org.telegram.messenger.ij E = E(i7);
                if (i7 != b() - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                h7Var.c(E, z11);
                if (ys0Var.E1) {
                    if (org.telegram.messenger.ij.B0(E.f23266k) == j3) {
                        c12 = 0;
                    } else {
                        c12 = 1;
                    }
                    if (sparseArrayArr[c12].indexOfKey(E.e1()) >= 0) {
                        z12 = true;
                    }
                    h7Var.b(z12, !ys0Var.f40661d1);
                    return;
                }
                h7Var.b(false, !ys0Var.f40661d1);
            }
        } else if (i10 == 3) {
            if (view instanceof org.telegram.ui.Cells.k7) {
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
                org.telegram.messenger.ij E2 = E(i7);
                if (i7 != b() - 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                k7Var.D = z10;
                k7Var.e();
                k7Var.f29450b0 = E2;
                k7Var.requestLayout();
                if (ys0Var.E1) {
                    if (org.telegram.messenger.ij.B0(E2.f23266k) == j3) {
                        c11 = 0;
                    } else {
                        c11 = 1;
                    }
                    if (sparseArrayArr[c11].indexOfKey(E2.e1()) >= 0) {
                        z12 = true;
                    }
                    k7Var.f(z12, !ys0Var.f40661d1);
                    return;
                }
                k7Var.f(false, !ys0Var.f40661d1);
            }
        } else if (i10 == 4 && (view instanceof org.telegram.ui.Cells.g7)) {
            org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
            org.telegram.messenger.ij E3 = E(i7);
            if (i7 != b() - 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            g7Var.f(E3, z9);
            if (ys0Var.E1) {
                if (org.telegram.messenger.ij.B0(E3.f23266k) == j3) {
                    c10 = 0;
                } else {
                    c10 = 1;
                }
                if (sparseArrayArr[c10].indexOfKey(E3.e1()) >= 0) {
                    z12 = true;
                }
                g7Var.e(z12, !ys0Var.f40661d1);
                return;
            }
            g7Var.e(false, !ys0Var.f40661d1);
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        ys0 ys0Var = this.f39725w;
        org.telegram.ui.ActionBar.h6 h6Var = ys0Var.H1;
        Context context = this.f39719c;
        int i10 = this.f39723r;
        if (i10 == 1) {
            view = new org.telegram.ui.Cells.h7(0, context, h6Var);
        } else if (i10 == 4) {
            view = new ur0(this, context, h6Var, 0);
        } else {
            org.telegram.ui.Cells.k7 k7Var = new org.telegram.ui.Cells.k7(0, context, h6Var);
            k7Var.setDelegate(ys0Var.V1);
            view = k7Var;
        }
        view.setLayoutParams(new v4.o0(-1, -2));
        return new v4.d1(view);
    }
}
