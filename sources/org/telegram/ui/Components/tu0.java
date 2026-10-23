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
    public final Context f30909c;
    public ko0 e;
    public int f30911n;
    public final int f30912r;
    public int f30913s;
    public final xv0 v;
    public ArrayList d = new ArrayList();
    public ArrayList f30910f = new ArrayList();
    public int h = 0;

    public tu0(xv0 xv0Var, Context context, int i10) {
        this.v = xv0Var;
        this.f30909c = context;
        this.f30912r = i10;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (this.f30910f.size() + this.d.size() != 0) {
            return true;
        }
        return false;
    }

    public final MessageObject E(int i10) {
        if (i10 < this.d.size()) {
            return (MessageObject) this.d.get(i10);
        }
        return (MessageObject) this.f30910f.get(i10 - this.d.size());
    }

    public final void F(final int i10, final String str, long j10, long j11) {
        org.telegram.ui.ActionBar.o2 o2Var = this.v.f32711v1;
        if (!DialogObject.isEncryptedDialog(j10)) {
            if (this.h != 0) {
                o2Var.getConnectionsManager().cancelRequest(this.h, true);
                this.h = 0;
                this.f30913s--;
            }
            if (str != null && str.length() != 0) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.limit = 50;
                tL_messages_search.offset_id = i10;
                int i11 = this.f30912r;
                if (i11 == 1) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterDocument();
                } else if (i11 == 3) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterUrl();
                } else if (i11 == 4) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterMusic();
                }
                tL_messages_search.f20452q = str;
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
                final int i12 = this.f30911n + 1;
                this.f30911n = i12;
                this.f30913s++;
                this.h = o2Var.getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        ArrayList arrayList = new ArrayList();
                        tu0 tu0Var = tu0.this;
                        if (tL_error == null) {
                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                            for (int i13 = 0; i13 < messages_messages.messages.size(); i13++) {
                                TLRPC.Message message = messages_messages.messages.get(i13);
                                int i14 = i10;
                                if (i14 == 0 || message.f20364id <= i14) {
                                    arrayList.add(new MessageObject(tu0Var.v.f32711v1.getCurrentAccount(), message, false, true));
                                }
                            }
                        }
                        AndroidUtilities.runOnUIThread(new ai.db(tu0Var, i12, arrayList, str, 29));
                    }
                }, 2);
                o2Var.getConnectionsManager().bindRequestToGuid(this.h, o2Var.getClassGuid());
                return;
            }
            this.f30910f.clear();
            this.f30911n = 0;
            l();
        }
    }

    public final void G(String str, boolean z10) {
        ko0 ko0Var = this.e;
        if (ko0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(ko0Var);
            this.e = null;
        }
        if (!this.d.isEmpty() || !this.f30910f.isEmpty()) {
            this.d.clear();
            this.f30910f.clear();
            l();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        int i10 = 0;
        xv0 xv0Var = this.v;
        if (isEmpty) {
            if (!this.d.isEmpty() || !this.f30910f.isEmpty() || this.f30913s != 0) {
                this.d.clear();
                this.f30910f.clear();
                if (this.h != 0) {
                    xv0Var.f32711v1.getConnectionsManager().cancelRequest(this.h, true);
                    this.h = 0;
                    this.f30913s--;
                    return;
                }
                return;
            }
            return;
        }
        while (true) {
            qu0[] qu0VarArr = xv0Var.f32687k0;
            if (i10 < qu0VarArr.length) {
                qu0 qu0Var = qu0VarArr[i10];
                if (qu0Var.F == this.f30912r) {
                    qu0Var.f30006w.e(true, z10);
                }
                i10++;
            } else {
                ko0 ko0Var2 = new ko0(9, this, str);
                this.e = ko0Var2;
                AndroidUtilities.runOnUIThread(ko0Var2, 300L);
                return;
            }
        }
    }

    @Override
    public final int h() {
        int size = this.d.size();
        int size2 = this.f30910f.size();
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
        View view = b1Var.f46343a;
        xv0 xv0Var = this.v;
        long j10 = xv0Var.f32686j1;
        SparseArray[] sparseArrayArr = xv0Var.Z0;
        boolean z13 = false;
        int i11 = this.f30912r;
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
                if (xv0Var.C1) {
                    if (E.getDialogId() == j10) {
                        c12 = 0;
                    } else {
                        c12 = 1;
                    }
                    if (sparseArrayArr[c12].indexOfKey(E.getId()) >= 0) {
                        z13 = true;
                    }
                    k7Var.b(z13, !xv0Var.f32663b1);
                    return;
                }
                k7Var.b(false, !xv0Var.f32663b1);
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
                n7Var.f22815y = z11;
                n7Var.e();
                n7Var.f22797b0 = E2;
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
                    n7Var.f(z13, !xv0Var.f32663b1);
                    return;
                }
                n7Var.f(false, !xv0Var.f32663b1);
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
            if (xv0Var.C1) {
                if (E3.getDialogId() == j10) {
                    c10 = 0;
                } else {
                    c10 = 1;
                }
                if (sparseArrayArr[c10].indexOfKey(E3.getId()) >= 0) {
                    z13 = true;
                }
                j7Var.e(z13, !xv0Var.f32663b1);
                return;
            }
            j7Var.e(false, !xv0Var.f32663b1);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        xv0 xv0Var = this.v;
        org.telegram.ui.ActionBar.g6 g6Var = xv0Var.F1;
        Context context = this.f30909c;
        int i11 = this.f30912r;
        if (i11 == 1) {
            view = new org.telegram.ui.Cells.k7(context, 0, g6Var);
        } else if (i11 == 4) {
            view = new su0(this, context, g6Var, 0);
        } else {
            org.telegram.ui.Cells.n7 n7Var = new org.telegram.ui.Cells.n7(context, 0, g6Var);
            n7Var.setDelegate(xv0Var.T1);
            view = n7Var;
        }
        view.setLayoutParams(new s4.o0(-1, -2));
        return new s4.b1(view);
    }
}
