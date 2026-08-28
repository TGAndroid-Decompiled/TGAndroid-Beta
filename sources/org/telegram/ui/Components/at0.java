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
public final class at0 extends vk0 {
    public final Context f26899c;
    public jg0 f26900e;
    public int f26902n;
    public final int f26903r;
    public int f26904s;
    public final eu0 v;
    public ArrayList d = new ArrayList();
    public ArrayList f26901f = new ArrayList();
    public int h = 0;

    public at0(eu0 eu0Var, Context context, int i9) {
        this.v = eu0Var;
        this.f26899c = context;
        this.f26903r = i9;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        if (this.f26901f.size() + this.d.size() != 0) {
            return true;
        }
        return false;
    }

    public final MessageObject E(int i9) {
        if (i9 < this.d.size()) {
            return (MessageObject) this.d.get(i9);
        }
        return (MessageObject) this.f26901f.get(i9 - this.d.size());
    }

    public final void F(final int i9, final String str, long j10, long j11) {
        org.telegram.ui.ActionBar.o2 o2Var = this.v.f28160r1;
        if (!DialogObject.isEncryptedDialog(j10)) {
            if (this.h != 0) {
                o2Var.getConnectionsManager().cancelRequest(this.h, true);
                this.h = 0;
                this.f26904s--;
            }
            if (str != null && str.length() != 0) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.limit = 50;
                tL_messages_search.offset_id = i9;
                int i10 = this.f26903r;
                if (i10 == 1) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterDocument();
                } else if (i10 == 3) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterUrl();
                } else if (i10 == 4) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterMusic();
                }
                tL_messages_search.f22489q = str;
                tL_messages_search.peer = o2Var.getMessagesController().getInputPeer(j10);
                if (j11 != 0) {
                    if (j10 == o2Var.getUserConfig().getClientUserId()) {
                        tL_messages_search.flags |= 4;
                        tL_messages_search.saved_peer_id = o2Var.getMessagesController().getInputPeer(j11);
                    } else {
                        tL_messages_search.flags |= 2;
                        tL_messages_search.top_msg_id = (int) j11;
                    }
                }
                if (tL_messages_search.peer == null) {
                    return;
                }
                final int i11 = this.f26902n + 1;
                this.f26902n = i11;
                this.f26904s++;
                this.h = o2Var.getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        ArrayList arrayList = new ArrayList();
                        at0 at0Var = at0.this;
                        if (tL_error == null) {
                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                            for (int i12 = 0; i12 < messages_messages.messages.size(); i12++) {
                                TLRPC.Message message = messages_messages.messages.get(i12);
                                int i13 = i9;
                                if (i13 == 0 || message.f22401id <= i13) {
                                    arrayList.add(new MessageObject(at0Var.v.f28160r1.getCurrentAccount(), message, false, true));
                                }
                            }
                        }
                        AndroidUtilities.runOnUIThread(new c3.d(at0Var, i11, arrayList, str, 26));
                    }
                }, 2);
                o2Var.getConnectionsManager().bindRequestToGuid(this.h, o2Var.getClassGuid());
                return;
            }
            this.f26901f.clear();
            this.f26902n = 0;
            l();
        }
    }

    public final void G(String str, boolean z10) {
        jg0 jg0Var = this.f26900e;
        if (jg0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(jg0Var);
            this.f26900e = null;
        }
        if (!this.d.isEmpty() || !this.f26901f.isEmpty()) {
            this.d.clear();
            this.f26901f.clear();
            l();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        int i9 = 0;
        eu0 eu0Var = this.v;
        if (isEmpty) {
            if (!this.d.isEmpty() || !this.f26901f.isEmpty() || this.f26904s != 0) {
                this.d.clear();
                this.f26901f.clear();
                if (this.h != 0) {
                    eu0Var.f28160r1.getConnectionsManager().cancelRequest(this.h, true);
                    this.h = 0;
                    this.f26904s--;
                    return;
                }
                return;
            }
            return;
        }
        while (true) {
            xs0[] xs0VarArr = eu0Var.f28137g0;
            if (i9 < xs0VarArr.length) {
                xs0 xs0Var = xs0VarArr[i9];
                if (xs0Var.B == this.f26903r) {
                    xs0Var.f34763w.e(true, z10);
                }
                i9++;
            } else {
                jg0 jg0Var2 = new jg0(15, this, str);
                this.f26900e = jg0Var2;
                AndroidUtilities.runOnUIThread(jg0Var2, 300L);
                return;
            }
        }
    }

    @Override
    public final int h() {
        int size = this.d.size();
        int size2 = this.f26901f.size();
        if (size2 != 0) {
            return size + size2;
        }
        return size;
    }

    @Override
    public final int j(int i9) {
        return 24;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        boolean z10;
        char c10;
        boolean z11;
        char c11;
        boolean z12;
        char c12;
        View view = q1Var.f5501a;
        eu0 eu0Var = this.v;
        long j10 = eu0Var.f28136f1;
        SparseArray[] sparseArrayArr = eu0Var.V0;
        boolean z13 = false;
        int i10 = this.f26903r;
        if (i10 == 1) {
            if (view instanceof org.telegram.ui.Cells.i7) {
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
                MessageObject E = E(i9);
                if (i9 != h() - 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                i7Var.c(E, z12);
                if (eu0Var.f28178y1) {
                    if (E.getDialogId() == j10) {
                        c12 = 0;
                    } else {
                        c12 = 1;
                    }
                    if (sparseArrayArr[c12].indexOfKey(E.getId()) >= 0) {
                        z13 = true;
                    }
                    i7Var.b(z13, !eu0Var.X0);
                    return;
                }
                i7Var.b(false, !eu0Var.X0);
            }
        } else if (i10 == 3) {
            if (view instanceof org.telegram.ui.Cells.l7) {
                org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
                MessageObject E2 = E(i9);
                if (i9 != h() - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                l7Var.f24671y = z11;
                l7Var.e();
                l7Var.U = E2;
                l7Var.requestLayout();
                if (eu0Var.f28178y1) {
                    if (E2.getDialogId() == j10) {
                        c11 = 0;
                    } else {
                        c11 = 1;
                    }
                    if (sparseArrayArr[c11].indexOfKey(E2.getId()) >= 0) {
                        z13 = true;
                    }
                    l7Var.f(z13, !eu0Var.X0);
                    return;
                }
                l7Var.f(false, !eu0Var.X0);
            }
        } else if (i10 == 4 && (view instanceof org.telegram.ui.Cells.h7)) {
            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
            MessageObject E3 = E(i9);
            if (i9 != h() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            h7Var.f(E3, z10);
            if (eu0Var.f28178y1) {
                if (E3.getDialogId() == j10) {
                    c10 = 0;
                } else {
                    c10 = 1;
                }
                if (sparseArrayArr[c10].indexOfKey(E3.getId()) >= 0) {
                    z13 = true;
                }
                h7Var.e(z13, !eu0Var.X0);
                return;
            }
            h7Var.e(false, !eu0Var.X0);
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View view;
        eu0 eu0Var = this.v;
        org.telegram.ui.ActionBar.b6 b6Var = eu0Var.B1;
        Context context = this.f26899c;
        int i10 = this.f26903r;
        if (i10 == 1) {
            view = new org.telegram.ui.Cells.i7(context, 0, b6Var);
        } else if (i10 == 4) {
            view = new zs0(this, context, b6Var, 0);
        } else {
            org.telegram.ui.Cells.l7 l7Var = new org.telegram.ui.Cells.l7(context, 0, b6Var);
            l7Var.setDelegate(eu0Var.O1);
            view = l7Var;
        }
        view.setLayoutParams(new f2.a1(-1, -2));
        return new f2.q1(view);
    }
}
