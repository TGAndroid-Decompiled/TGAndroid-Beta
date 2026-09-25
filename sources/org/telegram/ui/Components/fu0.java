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
public final class fu0 extends vl0 {
    public final Context f24275c;
    public wn0 e;
    public int f24277n;
    public final int f24278r;
    public int f24279s;
    public final jv0 v;
    public ArrayList d = new ArrayList();
    public ArrayList f24276f = new ArrayList();
    public int h = 0;

    public fu0(jv0 jv0Var, Context context, int i10) {
        this.v = jv0Var;
        this.f24275c = context;
        this.f24278r = i10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (this.f24276f.size() + this.d.size() != 0) {
            return true;
        }
        return false;
    }

    public final MessageObject E(int i10) {
        if (i10 < this.d.size()) {
            return (MessageObject) this.d.get(i10);
        }
        return (MessageObject) this.f24276f.get(i10 - this.d.size());
    }

    public final void F(final int i10, final String str, long j3, long j10) {
        org.telegram.ui.ActionBar.m2 m2Var = this.v.f25560v1;
        if (!DialogObject.isEncryptedDialog(j3)) {
            if (this.h != 0) {
                m2Var.getConnectionsManager().cancelRequest(this.h, true);
                this.h = 0;
                this.f24279s--;
            }
            if (str != null && str.length() != 0) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.limit = 50;
                tL_messages_search.offset_id = i10;
                int i11 = this.f24278r;
                if (i11 == 1) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterDocument();
                } else if (i11 == 3) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterUrl();
                } else if (i11 == 4) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterMusic();
                }
                tL_messages_search.f18445q = str;
                tL_messages_search.peer = m2Var.getMessagesController().getInputPeer(j3);
                if (j10 != 0) {
                    if (j3 == m2Var.getUserConfig().getClientUserId()) {
                        tL_messages_search.flags |= 4;
                        tL_messages_search.saved_peer_id = m2Var.getMessagesController().getInputPeer(j10);
                    } else {
                        tL_messages_search.flags |= 2;
                        tL_messages_search.top_msg_id = (int) j10;
                    }
                }
                if (tL_messages_search.peer == null) {
                    return;
                }
                final int i12 = this.f24277n + 1;
                this.f24277n = i12;
                this.f24279s++;
                this.h = m2Var.getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        ArrayList arrayList = new ArrayList();
                        fu0 fu0Var = fu0.this;
                        if (tL_error == null) {
                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                            for (int i13 = 0; i13 < messages_messages.messages.size(); i13++) {
                                TLRPC.Message message = messages_messages.messages.get(i13);
                                int i14 = i10;
                                if (i14 == 0 || message.f18357id <= i14) {
                                    arrayList.add(new MessageObject(fu0Var.v.f25560v1.getCurrentAccount(), message, false, true));
                                }
                            }
                        }
                        AndroidUtilities.runOnUIThread(new ai.c9(fu0Var, i12, arrayList, str, 26));
                    }
                }, 2);
                m2Var.getConnectionsManager().bindRequestToGuid(this.h, m2Var.getClassGuid());
                return;
            }
            this.f24276f.clear();
            this.f24277n = 0;
            l();
        }
    }

    public final void G(String str, boolean z10) {
        wn0 wn0Var = this.e;
        if (wn0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(wn0Var);
            this.e = null;
        }
        if (!this.d.isEmpty() || !this.f24276f.isEmpty()) {
            this.d.clear();
            this.f24276f.clear();
            l();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        int i10 = 0;
        jv0 jv0Var = this.v;
        if (isEmpty) {
            if (!this.d.isEmpty() || !this.f24276f.isEmpty() || this.f24279s != 0) {
                this.d.clear();
                this.f24276f.clear();
                if (this.h != 0) {
                    jv0Var.f25560v1.getConnectionsManager().cancelRequest(this.h, true);
                    this.h = 0;
                    this.f24279s--;
                    return;
                }
                return;
            }
            return;
        }
        while (true) {
            cu0[] cu0VarArr = jv0Var.f25536k0;
            if (i10 < cu0VarArr.length) {
                cu0 cu0Var = cu0VarArr[i10];
                if (cu0Var.F == this.f24278r) {
                    cu0Var.f23402w.e(true, z10);
                }
                i10++;
            } else {
                wn0 wn0Var2 = new wn0(8, this, str);
                this.e = wn0Var2;
                AndroidUtilities.runOnUIThread(wn0Var2, 300L);
                return;
            }
        }
    }

    @Override
    public final int h() {
        int size = this.d.size();
        int size2 = this.f24276f.size();
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
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        char c10;
        boolean z11;
        char c11;
        boolean z12;
        char c12;
        View view = c1Var.f42961a;
        jv0 jv0Var = this.v;
        long j3 = jv0Var.f25535j1;
        SparseArray[] sparseArrayArr = jv0Var.Z0;
        boolean z13 = false;
        int i11 = this.f24278r;
        if (i11 == 1) {
            if (view instanceof org.telegram.ui.Cells.k7) {
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
                MessageObject E = E(i10);
                if (i10 != h() - 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                k7Var.c(E, z12);
                if (jv0Var.C1) {
                    if (E.getDialogId() == j3) {
                        c12 = 0;
                    } else {
                        c12 = 1;
                    }
                    if (sparseArrayArr[c12].indexOfKey(E.getId()) >= 0) {
                        z13 = true;
                    }
                    k7Var.b(z13, !jv0Var.f25515b1);
                    return;
                }
                k7Var.b(false, !jv0Var.f25515b1);
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
                n7Var.f20721y = z11;
                n7Var.e();
                n7Var.f20703b0 = E2;
                n7Var.requestLayout();
                if (jv0Var.C1) {
                    if (E2.getDialogId() == j3) {
                        c11 = 0;
                    } else {
                        c11 = 1;
                    }
                    if (sparseArrayArr[c11].indexOfKey(E2.getId()) >= 0) {
                        z13 = true;
                    }
                    n7Var.f(z13, !jv0Var.f25515b1);
                    return;
                }
                n7Var.f(false, !jv0Var.f25515b1);
            }
        } else if (i11 == 4 && (view instanceof org.telegram.ui.Cells.j7)) {
            org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
            MessageObject E3 = E(i10);
            if (i10 != h() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            j7Var.f(E3, z10);
            if (jv0Var.C1) {
                if (E3.getDialogId() == j3) {
                    c10 = 0;
                } else {
                    c10 = 1;
                }
                if (sparseArrayArr[c10].indexOfKey(E3.getId()) >= 0) {
                    z13 = true;
                }
                j7Var.e(z13, !jv0Var.f25515b1);
                return;
            }
            j7Var.e(false, !jv0Var.f25515b1);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        jv0 jv0Var = this.v;
        org.telegram.ui.ActionBar.d6 d6Var = jv0Var.F1;
        Context context = this.f24275c;
        int i11 = this.f24278r;
        if (i11 == 1) {
            view = new org.telegram.ui.Cells.k7(context, 0, d6Var);
        } else if (i11 == 4) {
            view = new eu0(this, context, d6Var, 0);
        } else {
            org.telegram.ui.Cells.n7 n7Var = new org.telegram.ui.Cells.n7(context, 0, d6Var);
            n7Var.setDelegate(jv0Var.S1);
            view = n7Var;
        }
        view.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(view);
    }
}
