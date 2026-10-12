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
public final class dv0 extends vm0 {
    public final Context f25467c;
    public sj0 f25468e;
    public int f25470n;
    public final int f25471r;
    public int f25472s;
    public final hw0 v;
    public ArrayList d = new ArrayList();
    public ArrayList f25469f = new ArrayList();
    public int h = 0;

    public dv0(hw0 hw0Var, Context context, int i10) {
        this.v = hw0Var;
        this.f25467c = context;
        this.f25471r = i10;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (this.f25469f.size() + this.d.size() != 0) {
            return true;
        }
        return false;
    }

    public final MessageObject E(int i10) {
        if (i10 < this.d.size()) {
            return (MessageObject) this.d.get(i10);
        }
        return (MessageObject) this.f25469f.get(i10 - this.d.size());
    }

    public final void F(final int i10, final String str, long j3, long j10) {
        org.telegram.ui.ActionBar.m2 m2Var = this.v.f26972v1;
        if (!DialogObject.isEncryptedDialog(j3)) {
            if (this.h != 0) {
                m2Var.getConnectionsManager().cancelRequest(this.h, true);
                this.h = 0;
                this.f25472s--;
            }
            if (str != null && str.length() != 0) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.limit = 50;
                tL_messages_search.offset_id = i10;
                int i11 = this.f25471r;
                if (i11 == 1) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterDocument();
                } else if (i11 == 3) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterUrl();
                } else if (i11 == 4) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterMusic();
                }
                tL_messages_search.f19911q = str;
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
                final int i12 = this.f25470n + 1;
                this.f25470n = i12;
                this.f25472s++;
                this.h = m2Var.getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        ArrayList arrayList = new ArrayList();
                        dv0 dv0Var = dv0.this;
                        if (tL_error == null) {
                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                            for (int i13 = 0; i13 < messages_messages.messages.size(); i13++) {
                                TLRPC.Message message = messages_messages.messages.get(i13);
                                int i14 = i10;
                                if (i14 == 0 || message.f19823id <= i14) {
                                    arrayList.add(new MessageObject(dv0Var.v.f26972v1.getCurrentAccount(), message, false, true));
                                }
                            }
                        }
                        AndroidUtilities.runOnUIThread(new ai.d9(dv0Var, i12, arrayList, str, 27));
                    }
                }, 2);
                m2Var.getConnectionsManager().bindRequestToGuid(this.h, m2Var.getClassGuid());
                return;
            }
            this.f25469f.clear();
            this.f25470n = 0;
            l();
        }
    }

    public final void G(String str, boolean z10) {
        sj0 sj0Var = this.f25468e;
        if (sj0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(sj0Var);
            this.f25468e = null;
        }
        if (!this.d.isEmpty() || !this.f25469f.isEmpty()) {
            this.d.clear();
            this.f25469f.clear();
            l();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        int i10 = 0;
        hw0 hw0Var = this.v;
        if (isEmpty) {
            if (!this.d.isEmpty() || !this.f25469f.isEmpty() || this.f25472s != 0) {
                this.d.clear();
                this.f25469f.clear();
                if (this.h != 0) {
                    hw0Var.f26972v1.getConnectionsManager().cancelRequest(this.h, true);
                    this.h = 0;
                    this.f25472s--;
                    return;
                }
                return;
            }
            return;
        }
        while (true) {
            av0[] av0VarArr = hw0Var.f26948k0;
            if (i10 < av0VarArr.length) {
                av0 av0Var = av0VarArr[i10];
                if (av0Var.F == this.f25471r) {
                    av0Var.f24502w.e(true, z10);
                }
                i10++;
            } else {
                sj0 sj0Var2 = new sj0(12, this, str);
                this.f25468e = sj0Var2;
                AndroidUtilities.runOnUIThread(sj0Var2, 300L);
                return;
            }
        }
    }

    @Override
    public final int h() {
        int size = this.d.size();
        int size2 = this.f25469f.size();
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
    public final void v(s4.d1 d1Var, int i10) {
        boolean z10;
        char c10;
        boolean z11;
        char c11;
        boolean z12;
        char c12;
        View view = d1Var.f47889a;
        hw0 hw0Var = this.v;
        long j3 = hw0Var.f26947j1;
        SparseArray[] sparseArrayArr = hw0Var.Z0;
        boolean z13 = false;
        int i11 = this.f25471r;
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
                if (hw0Var.C1) {
                    if (E.getDialogId() == j3) {
                        c12 = 0;
                    } else {
                        c12 = 1;
                    }
                    if (sparseArrayArr[c12].indexOfKey(E.getId()) >= 0) {
                        z13 = true;
                    }
                    j7Var.b(z13, !hw0Var.f26926b1);
                    return;
                }
                j7Var.b(false, !hw0Var.f26926b1);
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
                n7Var.f22309y = z11;
                n7Var.e();
                n7Var.f22290b0 = E2;
                n7Var.requestLayout();
                if (hw0Var.C1) {
                    if (E2.getDialogId() == j3) {
                        c11 = 0;
                    } else {
                        c11 = 1;
                    }
                    if (sparseArrayArr[c11].indexOfKey(E2.getId()) >= 0) {
                        z13 = true;
                    }
                    n7Var.f(z13, !hw0Var.f26926b1);
                    return;
                }
                n7Var.f(false, !hw0Var.f26926b1);
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
            if (hw0Var.C1) {
                if (E3.getDialogId() == j3) {
                    c10 = 0;
                } else {
                    c10 = 1;
                }
                if (sparseArrayArr[c10].indexOfKey(E3.getId()) >= 0) {
                    z13 = true;
                }
                i7Var.e(z13, !hw0Var.f26926b1);
                return;
            }
            i7Var.e(false, !hw0Var.f26926b1);
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View view;
        hw0 hw0Var = this.v;
        org.telegram.ui.ActionBar.c6 c6Var = hw0Var.F1;
        Context context = this.f25467c;
        int i11 = this.f25471r;
        if (i11 == 1) {
            view = new org.telegram.ui.Cells.j7(context, 0, c6Var);
        } else if (i11 == 4) {
            view = new cv0(this, context, c6Var, 0);
        } else {
            org.telegram.ui.Cells.n7 n7Var = new org.telegram.ui.Cells.n7(context, 0, c6Var);
            n7Var.setDelegate(hw0Var.S1);
            view = n7Var;
        }
        view.setLayoutParams(new s4.q0(-1, -2));
        return new s4.d1(view);
    }
}
