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
public final class wu0 extends lm0 {
    public final Context f34536c;
    public t90 e;
    public int f34538n;
    public final int f34539r;
    public int f34540s;
    public final aw0 v;
    public ArrayList d = new ArrayList();
    public ArrayList f34537f = new ArrayList();
    public int h = 0;

    public wu0(aw0 aw0Var, Context context, int i10) {
        this.v = aw0Var;
        this.f34536c = context;
        this.f34539r = i10;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        if (this.f34537f.size() + this.d.size() != 0) {
            return true;
        }
        return false;
    }

    public final MessageObject E(int i10) {
        if (i10 < this.d.size()) {
            return (MessageObject) this.d.get(i10);
        }
        return (MessageObject) this.f34537f.get(i10 - this.d.size());
    }

    public final void F(final int i10, final String str, long j10, long j11) {
        org.telegram.ui.ActionBar.r2 r2Var = this.v.f26704x1;
        if (!DialogObject.isEncryptedDialog(j10)) {
            if (this.h != 0) {
                r2Var.getConnectionsManager().cancelRequest(this.h, true);
                this.h = 0;
                this.f34540s--;
            }
            if (str != null && str.length() != 0) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.limit = 50;
                tL_messages_search.offset_id = i10;
                int i11 = this.f34539r;
                if (i11 == 1) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterDocument();
                } else if (i11 == 3) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterUrl();
                } else if (i11 == 4) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterMusic();
                }
                tL_messages_search.f22138q = str;
                tL_messages_search.peer = r2Var.getMessagesController().getInputPeer(j10);
                if (j11 != 0) {
                    if (j10 == r2Var.getUserConfig().getClientUserId()) {
                        tL_messages_search.flags |= 4;
                        tL_messages_search.saved_peer_id = r2Var.getMessagesController().getInputPeer(j11);
                    } else {
                        tL_messages_search.flags |= 2;
                        tL_messages_search.top_msg_id = (int) j11;
                    }
                }
                if (tL_messages_search.peer == null) {
                    return;
                }
                final int i12 = this.f34538n + 1;
                this.f34538n = i12;
                this.f34540s++;
                this.h = r2Var.getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        ArrayList arrayList = new ArrayList();
                        wu0 wu0Var = wu0.this;
                        if (tL_error == null) {
                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                            for (int i13 = 0; i13 < messages_messages.messages.size(); i13++) {
                                TLRPC.Message message = messages_messages.messages.get(i13);
                                int i14 = i10;
                                if (i14 == 0 || message.f22048id <= i14) {
                                    arrayList.add(new MessageObject(wu0Var.v.f26704x1.getCurrentAccount(), message, false, true));
                                }
                            }
                        }
                        AndroidUtilities.runOnUIThread(new zr0(wu0Var, i12, arrayList, str, 1));
                    }
                }, 2);
                r2Var.getConnectionsManager().bindRequestToGuid(this.h, r2Var.getClassGuid());
                return;
            }
            this.f34537f.clear();
            this.f34538n = 0;
            l();
        }
    }

    public final void G(String str, boolean z10) {
        t90 t90Var = this.e;
        if (t90Var != null) {
            AndroidUtilities.cancelRunOnUIThread(t90Var);
            this.e = null;
        }
        if (!this.d.isEmpty() || !this.f34537f.isEmpty()) {
            this.d.clear();
            this.f34537f.clear();
            l();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        int i10 = 0;
        aw0 aw0Var = this.v;
        if (isEmpty) {
            if (!this.d.isEmpty() || !this.f34537f.isEmpty() || this.f34540s != 0) {
                this.d.clear();
                this.f34537f.clear();
                if (this.h != 0) {
                    aw0Var.f26704x1.getConnectionsManager().cancelRequest(this.h, true);
                    this.h = 0;
                    this.f34540s--;
                    return;
                }
                return;
            }
            return;
        }
        while (true) {
            tu0[] tu0VarArr = aw0Var.m0;
            if (i10 < tu0VarArr.length) {
                tu0 tu0Var = tu0VarArr[i10];
                if (tu0Var.E == this.f34539r) {
                    tu0Var.v.e(true, z10);
                }
                i10++;
            } else {
                t90 t90Var2 = new t90(20, this, str);
                this.e = t90Var2;
                AndroidUtilities.runOnUIThread(t90Var2, 300L);
                return;
            }
        }
    }

    @Override
    public final int h() {
        int size = this.d.size();
        int size2 = this.f34537f.size();
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
    public final void v(s4.e1 e1Var, int i10) {
        boolean z10;
        char c10;
        boolean z11;
        char c11;
        boolean z12;
        char c12;
        View view = e1Var.f47738a;
        aw0 aw0Var = this.v;
        long j10 = aw0Var.l1;
        SparseArray[] sparseArrayArr = aw0Var.f26641b1;
        boolean z13 = false;
        int i11 = this.f34539r;
        if (i11 == 1) {
            if (view instanceof org.telegram.ui.Cells.o7) {
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
                MessageObject E = E(i10);
                if (i10 != h() - 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                o7Var.c(E, z12);
                if (aw0Var.E1) {
                    if (E.getDialogId() == j10) {
                        c12 = 0;
                    } else {
                        c12 = 1;
                    }
                    if (sparseArrayArr[c12].indexOfKey(E.getId()) >= 0) {
                        z13 = true;
                    }
                    o7Var.b(z13, !aw0Var.f26648d1);
                    return;
                }
                o7Var.b(false, !aw0Var.f26648d1);
            }
        } else if (i11 == 3) {
            if (view instanceof org.telegram.ui.Cells.r7) {
                org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) view;
                MessageObject E2 = E(i10);
                if (i10 != h() - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                r7Var.f24995y = z11;
                r7Var.e();
                r7Var.f24977b0 = E2;
                r7Var.requestLayout();
                if (aw0Var.E1) {
                    if (E2.getDialogId() == j10) {
                        c11 = 0;
                    } else {
                        c11 = 1;
                    }
                    if (sparseArrayArr[c11].indexOfKey(E2.getId()) >= 0) {
                        z13 = true;
                    }
                    r7Var.f(z13, !aw0Var.f26648d1);
                    return;
                }
                r7Var.f(false, !aw0Var.f26648d1);
            }
        } else if (i11 == 4 && (view instanceof org.telegram.ui.Cells.n7)) {
            org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
            MessageObject E3 = E(i10);
            if (i10 != h() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            n7Var.f(E3, z10);
            if (aw0Var.E1) {
                if (E3.getDialogId() == j10) {
                    c10 = 0;
                } else {
                    c10 = 1;
                }
                if (sparseArrayArr[c10].indexOfKey(E3.getId()) >= 0) {
                    z13 = true;
                }
                n7Var.e(z13, !aw0Var.f26648d1);
                return;
            }
            n7Var.e(false, !aw0Var.f26648d1);
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View view;
        aw0 aw0Var = this.v;
        org.telegram.ui.ActionBar.u6 u6Var = aw0Var.H1;
        Context context = this.f34536c;
        int i11 = this.f34539r;
        if (i11 == 1) {
            view = new org.telegram.ui.Cells.o7(context, 0, u6Var);
        } else if (i11 == 4) {
            view = new vu0(this, context, u6Var, 0);
        } else {
            org.telegram.ui.Cells.r7 r7Var = new org.telegram.ui.Cells.r7(context, 0, u6Var);
            r7Var.setDelegate(aw0Var.V1);
            view = r7Var;
        }
        view.setLayoutParams(new s4.q0(-1, -2));
        return new s4.e1(view);
    }
}
