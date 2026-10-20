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
public final class qu0 extends im0 {
    public final Context f29719c;
    public ho0 e;
    public int f29721n;
    public final int f29722r;
    public int f29723s;
    public final uv0 v;
    public ArrayList d = new ArrayList();
    public ArrayList f29720f = new ArrayList();
    public int h = 0;

    public qu0(uv0 uv0Var, Context context, int i10) {
        this.v = uv0Var;
        this.f29719c = context;
        this.f29722r = i10;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (this.f29720f.size() + this.d.size() != 0) {
            return true;
        }
        return false;
    }

    public final MessageObject E(int i10) {
        if (i10 < this.d.size()) {
            return (MessageObject) this.d.get(i10);
        }
        return (MessageObject) this.f29720f.get(i10 - this.d.size());
    }

    public final void F(final int i10, final String str, long j10, long j11) {
        org.telegram.ui.ActionBar.n2 n2Var = this.v.f31070v1;
        if (!DialogObject.isEncryptedDialog(j10)) {
            if (this.h != 0) {
                n2Var.getConnectionsManager().cancelRequest(this.h, true);
                this.h = 0;
                this.f29723s--;
            }
            if (str != null && str.length() != 0) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.limit = 50;
                tL_messages_search.offset_id = i10;
                int i11 = this.f29722r;
                if (i11 == 1) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterDocument();
                } else if (i11 == 3) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterUrl();
                } else if (i11 == 4) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterMusic();
                }
                tL_messages_search.f20385q = str;
                tL_messages_search.peer = n2Var.getMessagesController().getInputPeer(j10);
                if (j11 != 0) {
                    if (j10 == n2Var.getUserConfig().getClientUserId()) {
                        tL_messages_search.flags |= 4;
                        tL_messages_search.saved_peer_id = n2Var.getMessagesController().getInputPeer(j11);
                    } else {
                        tL_messages_search.flags |= 2;
                        tL_messages_search.top_msg_id = (int) j11;
                    }
                }
                if (tL_messages_search.peer == null) {
                    return;
                }
                final int i12 = this.f29721n + 1;
                this.f29721n = i12;
                this.f29723s++;
                this.h = n2Var.getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        ArrayList arrayList = new ArrayList();
                        qu0 qu0Var = qu0.this;
                        if (tL_error == null) {
                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                            for (int i13 = 0; i13 < messages_messages.messages.size(); i13++) {
                                TLRPC.Message message = messages_messages.messages.get(i13);
                                int i14 = i10;
                                if (i14 == 0 || message.f20297id <= i14) {
                                    arrayList.add(new MessageObject(qu0Var.v.f31070v1.getCurrentAccount(), message, false, true));
                                }
                            }
                        }
                        AndroidUtilities.runOnUIThread(new ai.cb(qu0Var, i12, arrayList, str, 28));
                    }
                }, 2);
                n2Var.getConnectionsManager().bindRequestToGuid(this.h, n2Var.getClassGuid());
                return;
            }
            this.f29720f.clear();
            this.f29721n = 0;
            l();
        }
    }

    public final void G(String str, boolean z10) {
        ho0 ho0Var = this.e;
        if (ho0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(ho0Var);
            this.e = null;
        }
        if (!this.d.isEmpty() || !this.f29720f.isEmpty()) {
            this.d.clear();
            this.f29720f.clear();
            l();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        int i10 = 0;
        uv0 uv0Var = this.v;
        if (isEmpty) {
            if (!this.d.isEmpty() || !this.f29720f.isEmpty() || this.f29723s != 0) {
                this.d.clear();
                this.f29720f.clear();
                if (this.h != 0) {
                    uv0Var.f31070v1.getConnectionsManager().cancelRequest(this.h, true);
                    this.h = 0;
                    this.f29723s--;
                    return;
                }
                return;
            }
            return;
        }
        while (true) {
            nu0[] nu0VarArr = uv0Var.f31046k0;
            if (i10 < nu0VarArr.length) {
                nu0 nu0Var = nu0VarArr[i10];
                if (nu0Var.F == this.f29722r) {
                    nu0Var.f28882w.e(true, z10);
                }
                i10++;
            } else {
                ho0 ho0Var2 = new ho0(9, this, str);
                this.e = ho0Var2;
                AndroidUtilities.runOnUIThread(ho0Var2, 300L);
                return;
            }
        }
    }

    @Override
    public final int h() {
        int size = this.d.size();
        int size2 = this.f29720f.size();
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
        View view = b1Var.f45917a;
        uv0 uv0Var = this.v;
        long j10 = uv0Var.f31045j1;
        SparseArray[] sparseArrayArr = uv0Var.Z0;
        boolean z13 = false;
        int i11 = this.f29722r;
        if (i11 == 1) {
            if (view instanceof org.telegram.ui.Cells.i7) {
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
                MessageObject E = E(i10);
                if (i10 != h() - 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                i7Var.c(E, z12);
                if (uv0Var.C1) {
                    if (E.getDialogId() == j10) {
                        c12 = 0;
                    } else {
                        c12 = 1;
                    }
                    if (sparseArrayArr[c12].indexOfKey(E.getId()) >= 0) {
                        z13 = true;
                    }
                    i7Var.b(z13, !uv0Var.f31025b1);
                    return;
                }
                i7Var.b(false, !uv0Var.f31025b1);
            }
        } else if (i11 == 3) {
            if (view instanceof org.telegram.ui.Cells.m7) {
                org.telegram.ui.Cells.m7 m7Var = (org.telegram.ui.Cells.m7) view;
                MessageObject E2 = E(i10);
                if (i10 != h() - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                m7Var.f22608y = z11;
                m7Var.e();
                m7Var.f22590b0 = E2;
                m7Var.requestLayout();
                if (uv0Var.C1) {
                    if (E2.getDialogId() == j10) {
                        c11 = 0;
                    } else {
                        c11 = 1;
                    }
                    if (sparseArrayArr[c11].indexOfKey(E2.getId()) >= 0) {
                        z13 = true;
                    }
                    m7Var.f(z13, !uv0Var.f31025b1);
                    return;
                }
                m7Var.f(false, !uv0Var.f31025b1);
            }
        } else if (i11 == 4 && (view instanceof org.telegram.ui.Cells.h7)) {
            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
            MessageObject E3 = E(i10);
            if (i10 != h() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            h7Var.f(E3, z10);
            if (uv0Var.C1) {
                if (E3.getDialogId() == j10) {
                    c10 = 0;
                } else {
                    c10 = 1;
                }
                if (sparseArrayArr[c10].indexOfKey(E3.getId()) >= 0) {
                    z13 = true;
                }
                h7Var.e(z13, !uv0Var.f31025b1);
                return;
            }
            h7Var.e(false, !uv0Var.f31025b1);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        uv0 uv0Var = this.v;
        org.telegram.ui.ActionBar.d6 d6Var = uv0Var.F1;
        Context context = this.f29719c;
        int i11 = this.f29722r;
        if (i11 == 1) {
            view = new org.telegram.ui.Cells.i7(context, 0, d6Var);
        } else if (i11 == 4) {
            view = new pu0(this, context, d6Var, 0);
        } else {
            org.telegram.ui.Cells.m7 m7Var = new org.telegram.ui.Cells.m7(context, 0, d6Var);
            m7Var.setDelegate(uv0Var.S1);
            view = m7Var;
        }
        view.setLayoutParams(new s4.o0(-1, -2));
        return new s4.b1(view);
    }
}
