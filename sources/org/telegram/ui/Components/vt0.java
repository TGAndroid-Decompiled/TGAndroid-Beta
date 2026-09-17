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
public final class vt0 extends ll0 {
    public final Context f29404c;
    public br0 e;
    public int f29406n;
    public final int f29407r;
    public int f29408s;
    public final zu0 v;
    public ArrayList d = new ArrayList();
    public ArrayList f29405f = new ArrayList();
    public int h = 0;

    public vt0(zu0 zu0Var, Context context, int i10) {
        this.v = zu0Var;
        this.f29404c = context;
        this.f29407r = i10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (this.f29405f.size() + this.d.size() != 0) {
            return true;
        }
        return false;
    }

    public final MessageObject E(int i10) {
        if (i10 < this.d.size()) {
            return (MessageObject) this.d.get(i10);
        }
        return (MessageObject) this.f29405f.get(i10 - this.d.size());
    }

    public final void F(final int i10, final String str, long j3, long j10) {
        org.telegram.ui.ActionBar.o2 o2Var = this.v.f30656v1;
        if (!DialogObject.isEncryptedDialog(j3)) {
            if (this.h != 0) {
                o2Var.getConnectionsManager().cancelRequest(this.h, true);
                this.h = 0;
                this.f29408s--;
            }
            if (str != null && str.length() != 0) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.limit = 50;
                tL_messages_search.offset_id = i10;
                int i11 = this.f29407r;
                if (i11 == 1) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterDocument();
                } else if (i11 == 3) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterUrl();
                } else if (i11 == 4) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterMusic();
                }
                tL_messages_search.f18230q = str;
                tL_messages_search.peer = o2Var.getMessagesController().getInputPeer(j3);
                if (j10 != 0) {
                    if (j3 == o2Var.getUserConfig().getClientUserId()) {
                        tL_messages_search.flags |= 4;
                        tL_messages_search.saved_peer_id = o2Var.getMessagesController().getInputPeer(j10);
                    } else {
                        tL_messages_search.flags |= 2;
                        tL_messages_search.top_msg_id = (int) j10;
                    }
                }
                if (tL_messages_search.peer == null) {
                    return;
                }
                final int i12 = this.f29406n + 1;
                this.f29406n = i12;
                this.f29408s++;
                this.h = o2Var.getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        ArrayList arrayList = new ArrayList();
                        vt0 vt0Var = vt0.this;
                        if (tL_error == null) {
                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                            for (int i13 = 0; i13 < messages_messages.messages.size(); i13++) {
                                TLRPC.Message message = messages_messages.messages.get(i13);
                                int i14 = i10;
                                if (i14 == 0 || message.f18142id <= i14) {
                                    arrayList.add(new MessageObject(vt0Var.v.f30656v1.getCurrentAccount(), message, false, true));
                                }
                            }
                        }
                        AndroidUtilities.runOnUIThread(new ai.c9(vt0Var, i12, arrayList, str, 26));
                    }
                }, 2);
                o2Var.getConnectionsManager().bindRequestToGuid(this.h, o2Var.getClassGuid());
                return;
            }
            this.f29405f.clear();
            this.f29406n = 0;
            l();
        }
    }

    public final void G(String str, boolean z10) {
        br0 br0Var = this.e;
        if (br0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(br0Var);
            this.e = null;
        }
        if (!this.d.isEmpty() || !this.f29405f.isEmpty()) {
            this.d.clear();
            this.f29405f.clear();
            l();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        int i10 = 0;
        zu0 zu0Var = this.v;
        if (isEmpty) {
            if (!this.d.isEmpty() || !this.f29405f.isEmpty() || this.f29408s != 0) {
                this.d.clear();
                this.f29405f.clear();
                if (this.h != 0) {
                    zu0Var.f30656v1.getConnectionsManager().cancelRequest(this.h, true);
                    this.h = 0;
                    this.f29408s--;
                    return;
                }
                return;
            }
            return;
        }
        while (true) {
            st0[] st0VarArr = zu0Var.f30632k0;
            if (i10 < st0VarArr.length) {
                st0 st0Var = st0VarArr[i10];
                if (st0Var.F == this.f29407r) {
                    st0Var.f27924w.e(true, z10);
                }
                i10++;
            } else {
                br0 br0Var2 = new br0(3, this, str);
                this.e = br0Var2;
                AndroidUtilities.runOnUIThread(br0Var2, 300L);
                return;
            }
        }
    }

    @Override
    public final int h() {
        int size = this.d.size();
        int size2 = this.f29405f.size();
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
        View view = c1Var.f42697a;
        zu0 zu0Var = this.v;
        long j3 = zu0Var.f30631j1;
        SparseArray[] sparseArrayArr = zu0Var.Z0;
        boolean z13 = false;
        int i11 = this.f29407r;
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
                if (zu0Var.C1) {
                    if (E.getDialogId() == j3) {
                        c12 = 0;
                    } else {
                        c12 = 1;
                    }
                    if (sparseArrayArr[c12].indexOfKey(E.getId()) >= 0) {
                        z13 = true;
                    }
                    j7Var.b(z13, !zu0Var.f30611b1);
                    return;
                }
                j7Var.b(false, !zu0Var.f30611b1);
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
                n7Var.f20511y = z11;
                n7Var.e();
                n7Var.f20493b0 = E2;
                n7Var.requestLayout();
                if (zu0Var.C1) {
                    if (E2.getDialogId() == j3) {
                        c11 = 0;
                    } else {
                        c11 = 1;
                    }
                    if (sparseArrayArr[c11].indexOfKey(E2.getId()) >= 0) {
                        z13 = true;
                    }
                    n7Var.f(z13, !zu0Var.f30611b1);
                    return;
                }
                n7Var.f(false, !zu0Var.f30611b1);
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
            if (zu0Var.C1) {
                if (E3.getDialogId() == j3) {
                    c10 = 0;
                } else {
                    c10 = 1;
                }
                if (sparseArrayArr[c10].indexOfKey(E3.getId()) >= 0) {
                    z13 = true;
                }
                i7Var.e(z13, !zu0Var.f30611b1);
                return;
            }
            i7Var.e(false, !zu0Var.f30611b1);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        zu0 zu0Var = this.v;
        org.telegram.ui.ActionBar.f6 f6Var = zu0Var.F1;
        Context context = this.f29404c;
        int i11 = this.f29407r;
        if (i11 == 1) {
            view = new org.telegram.ui.Cells.j7(context, 0, f6Var);
        } else if (i11 == 4) {
            view = new ut0(this, context, f6Var, 0);
        } else {
            org.telegram.ui.Cells.n7 n7Var = new org.telegram.ui.Cells.n7(context, 0, f6Var);
            n7Var.setDelegate(zu0Var.S1);
            view = n7Var;
        }
        view.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(view);
    }
}
