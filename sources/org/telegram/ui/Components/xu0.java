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
public final class xu0 extends mm0 {
    public final Context f34850c;
    public u90 e;
    public int f34852n;
    public final int f34853r;
    public int f34854s;
    public final bw0 v;
    public ArrayList d = new ArrayList();
    public ArrayList f34851f = new ArrayList();
    public int h = 0;

    public xu0(bw0 bw0Var, Context context, int i10) {
        this.v = bw0Var;
        this.f34850c = context;
        this.f34853r = i10;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        if (this.f34851f.size() + this.d.size() != 0) {
            return true;
        }
        return false;
    }

    public final MessageObject E(int i10) {
        if (i10 < this.d.size()) {
            return (MessageObject) this.d.get(i10);
        }
        return (MessageObject) this.f34851f.get(i10 - this.d.size());
    }

    public final void F(final int i10, final String str, long j10, long j11) {
        org.telegram.ui.ActionBar.r2 r2Var = this.v.f26992x1;
        if (!DialogObject.isEncryptedDialog(j10)) {
            if (this.h != 0) {
                r2Var.getConnectionsManager().cancelRequest(this.h, true);
                this.h = 0;
                this.f34854s--;
            }
            if (str != null && str.length() != 0) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.limit = 50;
                tL_messages_search.offset_id = i10;
                int i11 = this.f34853r;
                if (i11 == 1) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterDocument();
                } else if (i11 == 3) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterUrl();
                } else if (i11 == 4) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterMusic();
                }
                tL_messages_search.f22139q = str;
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
                final int i12 = this.f34852n + 1;
                this.f34852n = i12;
                this.f34854s++;
                this.h = r2Var.getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        ArrayList arrayList = new ArrayList();
                        xu0 xu0Var = xu0.this;
                        if (tL_error == null) {
                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                            for (int i13 = 0; i13 < messages_messages.messages.size(); i13++) {
                                TLRPC.Message message = messages_messages.messages.get(i13);
                                int i14 = i10;
                                if (i14 == 0 || message.f22049id <= i14) {
                                    arrayList.add(new MessageObject(xu0Var.v.f26992x1.getCurrentAccount(), message, false, true));
                                }
                            }
                        }
                        AndroidUtilities.runOnUIThread(new as0(xu0Var, i12, arrayList, str, 1));
                    }
                }, 2);
                r2Var.getConnectionsManager().bindRequestToGuid(this.h, r2Var.getClassGuid());
                return;
            }
            this.f34851f.clear();
            this.f34852n = 0;
            l();
        }
    }

    public final void G(String str, boolean z10) {
        u90 u90Var = this.e;
        if (u90Var != null) {
            AndroidUtilities.cancelRunOnUIThread(u90Var);
            this.e = null;
        }
        if (!this.d.isEmpty() || !this.f34851f.isEmpty()) {
            this.d.clear();
            this.f34851f.clear();
            l();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        int i10 = 0;
        bw0 bw0Var = this.v;
        if (isEmpty) {
            if (!this.d.isEmpty() || !this.f34851f.isEmpty() || this.f34854s != 0) {
                this.d.clear();
                this.f34851f.clear();
                if (this.h != 0) {
                    bw0Var.f26992x1.getConnectionsManager().cancelRequest(this.h, true);
                    this.h = 0;
                    this.f34854s--;
                    return;
                }
                return;
            }
            return;
        }
        while (true) {
            uu0[] uu0VarArr = bw0Var.m0;
            if (i10 < uu0VarArr.length) {
                uu0 uu0Var = uu0VarArr[i10];
                if (uu0Var.E == this.f34853r) {
                    uu0Var.v.e(true, z10);
                }
                i10++;
            } else {
                u90 u90Var2 = new u90(20, this, str);
                this.e = u90Var2;
                AndroidUtilities.runOnUIThread(u90Var2, 300L);
                return;
            }
        }
    }

    @Override
    public final int h() {
        int size = this.d.size();
        int size2 = this.f34851f.size();
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
        View view = e1Var.f47773a;
        bw0 bw0Var = this.v;
        long j10 = bw0Var.l1;
        SparseArray[] sparseArrayArr = bw0Var.f26929b1;
        boolean z13 = false;
        int i11 = this.f34853r;
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
                if (bw0Var.E1) {
                    if (E.getDialogId() == j10) {
                        c12 = 0;
                    } else {
                        c12 = 1;
                    }
                    if (sparseArrayArr[c12].indexOfKey(E.getId()) >= 0) {
                        z13 = true;
                    }
                    o7Var.b(z13, !bw0Var.f26936d1);
                    return;
                }
                o7Var.b(false, !bw0Var.f26936d1);
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
                r7Var.f24997y = z11;
                r7Var.e();
                r7Var.f24979b0 = E2;
                r7Var.requestLayout();
                if (bw0Var.E1) {
                    if (E2.getDialogId() == j10) {
                        c11 = 0;
                    } else {
                        c11 = 1;
                    }
                    if (sparseArrayArr[c11].indexOfKey(E2.getId()) >= 0) {
                        z13 = true;
                    }
                    r7Var.f(z13, !bw0Var.f26936d1);
                    return;
                }
                r7Var.f(false, !bw0Var.f26936d1);
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
            if (bw0Var.E1) {
                if (E3.getDialogId() == j10) {
                    c10 = 0;
                } else {
                    c10 = 1;
                }
                if (sparseArrayArr[c10].indexOfKey(E3.getId()) >= 0) {
                    z13 = true;
                }
                n7Var.e(z13, !bw0Var.f26936d1);
                return;
            }
            n7Var.e(false, !bw0Var.f26936d1);
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View view;
        bw0 bw0Var = this.v;
        org.telegram.ui.ActionBar.u6 u6Var = bw0Var.H1;
        Context context = this.f34850c;
        int i11 = this.f34853r;
        if (i11 == 1) {
            view = new org.telegram.ui.Cells.o7(context, 0, u6Var);
        } else if (i11 == 4) {
            view = new wu0(this, context, u6Var, 0);
        } else {
            org.telegram.ui.Cells.r7 r7Var = new org.telegram.ui.Cells.r7(context, 0, u6Var);
            r7Var.setDelegate(bw0Var.V1);
            view = r7Var;
        }
        view.setLayoutParams(new s4.q0(-1, -2));
        return new s4.e1(view);
    }
}
