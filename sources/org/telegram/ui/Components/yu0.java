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
public final class yu0 extends qm0 {
    public final Context f33408c;
    public di0 f33409e;
    public int f33411n;
    public final int f33412r;
    public int f33413s;
    public final cw0 v;
    public ArrayList d = new ArrayList();
    public ArrayList f33410f = new ArrayList();
    public int h = 0;

    public yu0(cw0 cw0Var, Context context, int i10) {
        this.v = cw0Var;
        this.f33408c = context;
        this.f33412r = i10;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (this.f33410f.size() + this.d.size() != 0) {
            return true;
        }
        return false;
    }

    public final MessageObject E(int i10) {
        if (i10 < this.d.size()) {
            return (MessageObject) this.d.get(i10);
        }
        return (MessageObject) this.f33410f.get(i10 - this.d.size());
    }

    public final void F(final int i10, final String str, long j3, long j10) {
        org.telegram.ui.ActionBar.n2 n2Var = this.v.f25474v1;
        if (!DialogObject.isEncryptedDialog(j3)) {
            if (this.h != 0) {
                n2Var.getConnectionsManager().cancelRequest(this.h, true);
                this.h = 0;
                this.f33413s--;
            }
            if (str != null && str.length() != 0) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.limit = 50;
                tL_messages_search.offset_id = i10;
                int i11 = this.f33412r;
                if (i11 == 1) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterDocument();
                } else if (i11 == 3) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterUrl();
                } else if (i11 == 4) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterMusic();
                }
                tL_messages_search.f20151q = str;
                tL_messages_search.peer = n2Var.getMessagesController().getInputPeer(j3);
                if (j10 != 0) {
                    if (j3 == n2Var.getUserConfig().getClientUserId()) {
                        tL_messages_search.flags |= 4;
                        tL_messages_search.saved_peer_id = n2Var.getMessagesController().getInputPeer(j10);
                    } else {
                        tL_messages_search.flags |= 2;
                        tL_messages_search.top_msg_id = (int) j10;
                    }
                }
                if (tL_messages_search.peer == null) {
                    return;
                }
                final int i12 = this.f33411n + 1;
                this.f33411n = i12;
                this.f33413s++;
                this.h = n2Var.getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        ArrayList arrayList = new ArrayList();
                        yu0 yu0Var = yu0.this;
                        if (tL_error == null) {
                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                            for (int i13 = 0; i13 < messages_messages.messages.size(); i13++) {
                                TLRPC.Message message = messages_messages.messages.get(i13);
                                int i14 = i10;
                                if (i14 == 0 || message.f20063id <= i14) {
                                    arrayList.add(new MessageObject(yu0Var.v.f25474v1.getCurrentAccount(), message, false, true));
                                }
                            }
                        }
                        AndroidUtilities.runOnUIThread(new ai.d9(yu0Var, i12, arrayList, str, 27));
                    }
                }, 2);
                n2Var.getConnectionsManager().bindRequestToGuid(this.h, n2Var.getClassGuid());
                return;
            }
            this.f33410f.clear();
            this.f33411n = 0;
            l();
        }
    }

    public final void G(String str, boolean z10) {
        di0 di0Var = this.f33409e;
        if (di0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(di0Var);
            this.f33409e = null;
        }
        if (!this.d.isEmpty() || !this.f33410f.isEmpty()) {
            this.d.clear();
            this.f33410f.clear();
            l();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        int i10 = 0;
        cw0 cw0Var = this.v;
        if (isEmpty) {
            if (!this.d.isEmpty() || !this.f33410f.isEmpty() || this.f33413s != 0) {
                this.d.clear();
                this.f33410f.clear();
                if (this.h != 0) {
                    cw0Var.f25474v1.getConnectionsManager().cancelRequest(this.h, true);
                    this.h = 0;
                    this.f33413s--;
                    return;
                }
                return;
            }
            return;
        }
        while (true) {
            vu0[] vu0VarArr = cw0Var.f25450k0;
            if (i10 < vu0VarArr.length) {
                vu0 vu0Var = vu0VarArr[i10];
                if (vu0Var.F == this.f33412r) {
                    vu0Var.f32521w.e(true, z10);
                }
                i10++;
            } else {
                di0 di0Var2 = new di0(15, this, str);
                this.f33409e = di0Var2;
                AndroidUtilities.runOnUIThread(di0Var2, 300L);
                return;
            }
        }
    }

    @Override
    public final int h() {
        int size = this.d.size();
        int size2 = this.f33410f.size();
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
        View view = d1Var.f47702a;
        cw0 cw0Var = this.v;
        long j3 = cw0Var.f25449j1;
        SparseArray[] sparseArrayArr = cw0Var.Z0;
        boolean z13 = false;
        int i11 = this.f33412r;
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
                if (cw0Var.C1) {
                    if (E.getDialogId() == j3) {
                        c12 = 0;
                    } else {
                        c12 = 1;
                    }
                    if (sparseArrayArr[c12].indexOfKey(E.getId()) >= 0) {
                        z13 = true;
                    }
                    k7Var.b(z13, !cw0Var.f25428b1);
                    return;
                }
                k7Var.b(false, !cw0Var.f25428b1);
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
                n7Var.f22550y = z11;
                n7Var.e();
                n7Var.f22531b0 = E2;
                n7Var.requestLayout();
                if (cw0Var.C1) {
                    if (E2.getDialogId() == j3) {
                        c11 = 0;
                    } else {
                        c11 = 1;
                    }
                    if (sparseArrayArr[c11].indexOfKey(E2.getId()) >= 0) {
                        z13 = true;
                    }
                    n7Var.f(z13, !cw0Var.f25428b1);
                    return;
                }
                n7Var.f(false, !cw0Var.f25428b1);
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
            if (cw0Var.C1) {
                if (E3.getDialogId() == j3) {
                    c10 = 0;
                } else {
                    c10 = 1;
                }
                if (sparseArrayArr[c10].indexOfKey(E3.getId()) >= 0) {
                    z13 = true;
                }
                j7Var.e(z13, !cw0Var.f25428b1);
                return;
            }
            j7Var.e(false, !cw0Var.f25428b1);
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View view;
        cw0 cw0Var = this.v;
        org.telegram.ui.ActionBar.e6 e6Var = cw0Var.F1;
        Context context = this.f33408c;
        int i11 = this.f33412r;
        if (i11 == 1) {
            view = new org.telegram.ui.Cells.k7(context, 0, e6Var);
        } else if (i11 == 4) {
            view = new xu0(this, context, e6Var, 0);
        } else {
            org.telegram.ui.Cells.n7 n7Var = new org.telegram.ui.Cells.n7(context, 0, e6Var);
            n7Var.setDelegate(cw0Var.S1);
            view = n7Var;
        }
        view.setLayoutParams(new s4.q0(-1, -2));
        return new s4.d1(view);
    }
}
