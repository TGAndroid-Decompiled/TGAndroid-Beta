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

public final class ct0 extends yk0 {

    public final Context f27540c;

    public lg0 f27541e;

    public int f27543n;

    public final int f27544r;

    public int f27545s;
    public final hu0 v;
    public ArrayList d = new ArrayList();

    public ArrayList f27542f = new ArrayList();
    public int h = 0;

    public ct0(hu0 hu0Var, Context context, int i10) {
        this.v = hu0Var;
        this.f27540c = context;
        this.f27544r = i10;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return this.f27542f.size() + this.d.size() != 0;
    }

    public final MessageObject E(int i10) {
        return i10 < this.d.size() ? (MessageObject) this.d.get(i10) : (MessageObject) this.f27542f.get(i10 - this.d.size());
    }

    public final void F(final int i10, final String str, long j10, long j11) {
        org.telegram.ui.ActionBar.n2 n2Var = this.v.f29145r1;
        if (DialogObject.isEncryptedDialog(j10)) {
            return;
        }
        if (this.h != 0) {
            n2Var.getConnectionsManager().cancelRequest(this.h, true);
            this.h = 0;
            this.f27545s--;
        }
        if (str == null || str.length() == 0) {
            this.f27542f.clear();
            this.f27543n = 0;
            l();
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.limit = 50;
        tL_messages_search.offset_id = i10;
        int i11 = this.f27544r;
        if (i11 == 1) {
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterDocument();
        } else if (i11 == 3) {
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterUrl();
        } else if (i11 == 4) {
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterMusic();
        }
        tL_messages_search.f22489q = str;
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
        final int i12 = this.f27543n + 1;
        this.f27543n = i12;
        this.f27545s++;
        this.h = n2Var.getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ArrayList arrayList = new ArrayList();
                ct0 ct0Var = this.f26823a;
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    for (int i13 = 0; i13 < messages_messages.messages.size(); i13++) {
                        TLRPC.Message message = messages_messages.messages.get(i13);
                        int i14 = i10;
                        if (i14 == 0 || message.f22401id <= i14) {
                            arrayList.add(new MessageObject(ct0Var.v.f29145r1.getCurrentAccount(), message, false, true));
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new ag.k0(ct0Var, i12, arrayList, str, 25));
            }
        }, 2);
        n2Var.getConnectionsManager().bindRequestToGuid(this.h, n2Var.getClassGuid());
    }

    public final void G(String str, boolean z10) {
        lg0 lg0Var = this.f27541e;
        if (lg0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(lg0Var);
            this.f27541e = null;
        }
        if (!this.d.isEmpty() || !this.f27542f.isEmpty()) {
            this.d.clear();
            this.f27542f.clear();
            l();
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        int i10 = 0;
        hu0 hu0Var = this.v;
        if (zIsEmpty) {
            if (this.d.isEmpty() && this.f27542f.isEmpty() && this.f27545s == 0) {
                return;
            }
            this.d.clear();
            this.f27542f.clear();
            if (this.h != 0) {
                hu0Var.f29145r1.getConnectionsManager().cancelRequest(this.h, true);
                this.h = 0;
                this.f27545s--;
                return;
            }
            return;
        }
        while (true) {
            zs0[] zs0VarArr = hu0Var.f29122g0;
            if (i10 >= zs0VarArr.length) {
                lg0 lg0Var2 = new lg0(15, this, str);
                this.f27541e = lg0Var2;
                AndroidUtilities.runOnUIThread(lg0Var2, 300L);
                return;
            } else {
                zs0 zs0Var = zs0VarArr[i10];
                if (zs0Var.B == this.f27544r) {
                    zs0Var.f35342w.e(true, z10);
                }
                i10++;
            }
        }
    }

    @Override
    public final int h() {
        int size = this.d.size();
        int size2 = this.f27542f.size();
        return size2 != 0 ? size + size2 : size;
    }

    @Override
    public final int j(int i10) {
        return 24;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        View view = o1Var.f5789a;
        hu0 hu0Var = this.v;
        long j10 = hu0Var.f29121f1;
        SparseArray[] sparseArrayArr = hu0Var.V0;
        int i11 = this.f27544r;
        if (i11 == 1) {
            if (view instanceof org.telegram.ui.Cells.f7) {
                org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view;
                MessageObject messageObjectE = E(i10);
                f7Var.c(messageObjectE, i10 != h() - 1);
                if (hu0Var.f29163y1) {
                    f7Var.b(sparseArrayArr[(messageObjectE.getDialogId() > j10 ? 1 : (messageObjectE.getDialogId() == j10 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObjectE.getId()) >= 0, !hu0Var.X0);
                    return;
                } else {
                    f7Var.b(false, !hu0Var.X0);
                    return;
                }
            }
            return;
        }
        if (i11 != 3) {
            if (i11 == 4 && (view instanceof org.telegram.ui.Cells.e7)) {
                org.telegram.ui.Cells.e7 e7Var = (org.telegram.ui.Cells.e7) view;
                MessageObject messageObjectE2 = E(i10);
                e7Var.f(messageObjectE2, i10 != h() - 1);
                if (hu0Var.f29163y1) {
                    e7Var.e(sparseArrayArr[(messageObjectE2.getDialogId() > j10 ? 1 : (messageObjectE2.getDialogId() == j10 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObjectE2.getId()) >= 0, !hu0Var.X0);
                    return;
                } else {
                    e7Var.e(false, !hu0Var.X0);
                    return;
                }
            }
            return;
        }
        if (view instanceof org.telegram.ui.Cells.i7) {
            org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
            MessageObject messageObjectE3 = E(i10);
            i7Var.f24497y = i10 != h() - 1;
            i7Var.e();
            i7Var.U = messageObjectE3;
            i7Var.requestLayout();
            if (hu0Var.f29163y1) {
                i7Var.f(sparseArrayArr[(messageObjectE3.getDialogId() > j10 ? 1 : (messageObjectE3.getDialogId() == j10 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObjectE3.getId()) >= 0, !hu0Var.X0);
            } else {
                i7Var.f(false, !hu0Var.X0);
            }
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View bt0Var;
        hu0 hu0Var = this.v;
        org.telegram.ui.ActionBar.c6 c6Var = hu0Var.B1;
        Context context = this.f27540c;
        int i11 = this.f27544r;
        if (i11 == 1) {
            bt0Var = new org.telegram.ui.Cells.f7(context, 0, c6Var);
        } else if (i11 == 4) {
            bt0Var = new bt0(this, context, c6Var, 0);
        } else {
            org.telegram.ui.Cells.i7 i7Var = new org.telegram.ui.Cells.i7(context, 0, c6Var);
            i7Var.setDelegate(hu0Var.O1);
            bt0Var = i7Var;
        }
        bt0Var.setLayoutParams(new f2.y0(-1, -2));
        return new lk0(bt0Var);
    }
}
