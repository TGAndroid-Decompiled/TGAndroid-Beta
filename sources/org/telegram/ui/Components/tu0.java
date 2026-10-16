package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tu0 extends lm0 {
    public final Context f29193c;
    public g90 e;
    public int f29195n;
    public final int f29196r;
    public int f29197s;
    public final xv0 v;
    public ArrayList d = new ArrayList();
    public ArrayList f29194f = new ArrayList();
    public int h = 0;

    public tu0(xv0 xv0Var, Context context, int i10) {
        this.v = xv0Var;
        this.f29193c = context;
        this.f29196r = i10;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (this.f29194f.size() + this.d.size() != 0) {
            return true;
        }
        return false;
    }

    public final MessageObject E(int i10) {
        if (i10 < this.d.size()) {
            return (MessageObject) this.d.get(i10);
        }
        return (MessageObject) this.f29194f.get(i10 - this.d.size());
    }

    public final void F(final int i10, final String str, long j10, long j11) {
        org.telegram.ui.ActionBar.m2 m2Var = this.v.f31069v1;
        if (!DialogObject.isEncryptedDialog(j10)) {
            if (this.h != 0) {
                m2Var.getConnectionsManager().cancelRequest(this.h, true);
                this.h = 0;
                this.f29197s--;
            }
            if (str != null && str.length() != 0) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.limit = 50;
                tL_messages_search.offset_id = i10;
                int i11 = this.f29196r;
                if (i11 == 1) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterDocument();
                } else if (i11 == 3) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterUrl();
                } else if (i11 == 4) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterMusic();
                }
                tL_messages_search.f19025q = str;
                tL_messages_search.peer = m2Var.getMessagesController().getInputPeer(j10);
                if (j11 != 0) {
                    if (j10 == m2Var.getUserConfig().getClientUserId()) {
                        tL_messages_search.flags |= 4;
                        tL_messages_search.saved_peer_id = m2Var.getMessagesController().getInputPeer(j11);
                    } else {
                        tL_messages_search.flags |= 2;
                        tL_messages_search.top_msg_id = (int) j11;
                    }
                }
                if (tL_messages_search.peer == null) {
                    return;
                }
                final int i12 = this.f29195n + 1;
                this.f29195n = i12;
                this.f29197s++;
                this.h = m2Var.getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        ArrayList arrayList = new ArrayList();
                        tu0 tu0Var = tu0.this;
                        if (tL_error == null) {
                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                            for (int i13 = 0; i13 < messages_messages.messages.size(); i13++) {
                                TLRPC.Message message = messages_messages.messages.get(i13);
                                int i14 = i10;
                                if (i14 == 0 || message.f18937id <= i14) {
                                    arrayList.add(new MessageObject(tu0Var.v.f31069v1.getCurrentAccount(), message, false, true));
                                }
                            }
                        }
                        AndroidUtilities.runOnUIThread(new bi.n8(tu0Var, i12, arrayList, str, 27));
                    }
                }, 2);
                m2Var.getConnectionsManager().bindRequestToGuid(this.h, m2Var.getClassGuid());
                return;
            }
            this.f29194f.clear();
            this.f29195n = 0;
            l();
        }
    }

    public final void G(String str, boolean z10) {
        g90 g90Var = this.e;
        if (g90Var != null) {
            AndroidUtilities.cancelRunOnUIThread(g90Var);
            this.e = null;
        }
        if (!this.d.isEmpty() || !this.f29194f.isEmpty()) {
            this.d.clear();
            this.f29194f.clear();
            l();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        int i10 = 0;
        xv0 xv0Var = this.v;
        if (isEmpty) {
            if (!this.d.isEmpty() || !this.f29194f.isEmpty() || this.f29197s != 0) {
                this.d.clear();
                this.f29194f.clear();
                if (this.h != 0) {
                    xv0Var.f31069v1.getConnectionsManager().cancelRequest(this.h, true);
                    this.h = 0;
                    this.f29197s--;
                    return;
                }
                return;
            }
            return;
        }
        while (true) {
            qu0[] qu0VarArr = xv0Var.f31045k0;
            if (i10 < qu0VarArr.length) {
                qu0 qu0Var = qu0VarArr[i10];
                if (qu0Var.F == this.f29196r) {
                    qu0Var.f28368w.e(true, z10);
                }
                i10++;
            } else {
                g90 g90Var2 = new g90(21, this, str);
                this.e = g90Var2;
                AndroidUtilities.runOnUIThread(g90Var2, 300L);
                return;
            }
        }
    }

    @Override
    public final int h() {
        int size = this.d.size();
        int size2 = this.f29194f.size();
        if (size2 != 0) {
            return size + size2;
        }
        return size;
    }

    @Override
    public final int j(int i10) {
        return 24;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        char c10;
        boolean z11;
        char c11;
        boolean z12;
        char c12;
        View view = b1Var.f44838a;
        xv0 xv0Var = this.v;
        long j10 = xv0Var.f31044j1;
        SparseArray[] sparseArrayArr = xv0Var.Z0;
        boolean z13 = false;
        int i11 = this.f29196r;
        if (i11 == 1) {
            if (view instanceof org.telegram.ui.Cells.j7) {
                org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
                MessageObject E = E(i10);
                if (i10 != h() - 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                j7Var.c(E, z12);
                if (xv0Var.C1) {
                    if (E.getDialogId() == j10) {
                        c12 = 0;
                    } else {
                        c12 = 1;
                    }
                    if (sparseArrayArr[c12].indexOfKey(E.getId()) >= 0) {
                        z13 = true;
                    }
                    j7Var.b(z13, !xv0Var.f31024b1);
                    return;
                }
                j7Var.b(false, !xv0Var.f31024b1);
            }
        } else if (i11 == 3) {
            if (view instanceof org.telegram.ui.Cells.n7) {
                org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
                MessageObject E2 = E(i10);
                if (i10 != h() - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                n7Var.f21295y = z11;
                n7Var.e();
                n7Var.f21277b0 = E2;
                n7Var.requestLayout();
                if (xv0Var.C1) {
                    if (E2.getDialogId() == j10) {
                        c11 = 0;
                    } else {
                        c11 = 1;
                    }
                    if (sparseArrayArr[c11].indexOfKey(E2.getId()) >= 0) {
                        z13 = true;
                    }
                    n7Var.f(z13, !xv0Var.f31024b1);
                    return;
                }
                n7Var.f(false, !xv0Var.f31024b1);
            }
        } else if (i11 == 4 && (view instanceof org.telegram.ui.Cells.i7)) {
            org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
            MessageObject E3 = E(i10);
            if (i10 != h() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            i7Var.f(E3, z10);
            if (xv0Var.C1) {
                if (E3.getDialogId() == j10) {
                    c10 = 0;
                } else {
                    c10 = 1;
                }
                if (sparseArrayArr[c10].indexOfKey(E3.getId()) >= 0) {
                    z13 = true;
                }
                i7Var.e(z13, !xv0Var.f31024b1);
                return;
            }
            i7Var.e(false, !xv0Var.f31024b1);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        xv0 xv0Var = this.v;
        org.telegram.ui.ActionBar.c6 c6Var = xv0Var.F1;
        Context context = this.f29193c;
        int i11 = this.f29196r;
        if (i11 == 1) {
            view = new org.telegram.ui.Cells.j7(context, 0, c6Var);
        } else if (i11 == 4) {
            view = new su0(this, context, c6Var, 0);
        } else {
            org.telegram.ui.Cells.n7 n7Var = new org.telegram.ui.Cells.n7(context, 0, c6Var);
            n7Var.setDelegate(xv0Var.S1);
            view = n7Var;
        }
        view.setLayoutParams(new s4.o0(-1, -2));
        return new s4.b1(view);
    }
}
