package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class du0 extends ul0 {
    public final Context f22481c;
    public yo0 e;
    public int f22483n;
    public final int f22484r;
    public int f22485s;
    public final iv0 v;
    public ArrayList d = new ArrayList();
    public ArrayList f22482f = new ArrayList();
    public int h = 0;

    public du0(iv0 iv0Var, Context context, int i10) {
        this.v = iv0Var;
        this.f22481c = context;
        this.f22484r = i10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (this.f22482f.size() + this.d.size() != 0) {
            return true;
        }
        return false;
    }

    public final MessageObject E(int i10) {
        if (i10 < this.d.size()) {
            return (MessageObject) this.d.get(i10);
        }
        return (MessageObject) this.f22482f.get(i10 - this.d.size());
    }

    public final void F(final int i10, final String str, long j3, long j10) {
        org.telegram.ui.ActionBar.p2 p2Var = this.v.f24131v1;
        if (!DialogObject.isEncryptedDialog(j3)) {
            if (this.h != 0) {
                p2Var.getConnectionsManager().cancelRequest(this.h, true);
                this.h = 0;
                this.f22485s--;
            }
            if (str != null && str.length() != 0) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.limit = 50;
                tL_messages_search.offset_id = i10;
                int i11 = this.f22484r;
                if (i11 == 1) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterDocument();
                } else if (i11 == 3) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterUrl();
                } else if (i11 == 4) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterMusic();
                }
                tL_messages_search.f17304q = str;
                tL_messages_search.peer = p2Var.getMessagesController().getInputPeer(j3);
                if (j10 != 0) {
                    if (j3 == p2Var.getUserConfig().getClientUserId()) {
                        tL_messages_search.flags |= 4;
                        tL_messages_search.saved_peer_id = p2Var.getMessagesController().getInputPeer(j10);
                    } else {
                        tL_messages_search.flags |= 2;
                        tL_messages_search.top_msg_id = (int) j10;
                    }
                }
                if (tL_messages_search.peer == null) {
                    return;
                }
                final int i12 = this.f22483n + 1;
                this.f22483n = i12;
                this.f22485s++;
                this.h = p2Var.getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        ArrayList arrayList = new ArrayList();
                        du0 du0Var = du0.this;
                        if (tL_error == null) {
                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                            for (int i13 = 0; i13 < messages_messages.messages.size(); i13++) {
                                TLRPC.Message message = messages_messages.messages.get(i13);
                                int i14 = i10;
                                if (i14 == 0 || message.f17216id <= i14) {
                                    arrayList.add(new MessageObject(du0Var.v.f24131v1.getCurrentAccount(), message, false, true));
                                }
                            }
                        }
                        AndroidUtilities.runOnUIThread(new di.q((Object) du0Var, i12, arrayList, (Serializable) str, 26));
                    }
                }, 2);
                p2Var.getConnectionsManager().bindRequestToGuid(this.h, p2Var.getClassGuid());
                return;
            }
            this.f22482f.clear();
            this.f22483n = 0;
            l();
        }
    }

    public final void G(String str, boolean z10) {
        yo0 yo0Var = this.e;
        if (yo0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(yo0Var);
            this.e = null;
        }
        if (!this.d.isEmpty() || !this.f22482f.isEmpty()) {
            this.d.clear();
            this.f22482f.clear();
            l();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        int i10 = 0;
        iv0 iv0Var = this.v;
        if (isEmpty) {
            if (!this.d.isEmpty() || !this.f22482f.isEmpty() || this.f22485s != 0) {
                this.d.clear();
                this.f22482f.clear();
                if (this.h != 0) {
                    iv0Var.f24131v1.getConnectionsManager().cancelRequest(this.h, true);
                    this.h = 0;
                    this.f22485s--;
                    return;
                }
                return;
            }
            return;
        }
        while (true) {
            au0[] au0VarArr = iv0Var.f24107k0;
            if (i10 < au0VarArr.length) {
                au0 au0Var = au0VarArr[i10];
                if (au0Var.F == this.f22484r) {
                    au0Var.f21597w.e(true, z10);
                }
                i10++;
            } else {
                yo0 yo0Var2 = new yo0(6, this, str);
                this.e = yo0Var2;
                AndroidUtilities.runOnUIThread(yo0Var2, 300L);
                return;
            }
        }
    }

    @Override
    public final int h() {
        int size = this.d.size();
        int size2 = this.f22482f.size();
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
        View view = c1Var.f41610a;
        iv0 iv0Var = this.v;
        long j3 = iv0Var.f24106j1;
        SparseArray[] sparseArrayArr = iv0Var.Z0;
        boolean z13 = false;
        int i11 = this.f22484r;
        if (i11 == 1) {
            if (view instanceof org.telegram.ui.Cells.l7) {
                org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
                MessageObject E = E(i10);
                if (i10 != h() - 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                l7Var.c(E, z12);
                if (iv0Var.C1) {
                    if (E.getDialogId() == j3) {
                        c12 = 0;
                    } else {
                        c12 = 1;
                    }
                    if (sparseArrayArr[c12].indexOfKey(E.getId()) >= 0) {
                        z13 = true;
                    }
                    l7Var.b(z13, !iv0Var.f24086b1);
                    return;
                }
                l7Var.b(false, !iv0Var.f24086b1);
            }
        } else if (i11 == 3) {
            if (view instanceof org.telegram.ui.Cells.o7) {
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
                MessageObject E2 = E(i10);
                if (i10 != h() - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                o7Var.f19660y = z11;
                o7Var.e();
                o7Var.f19642b0 = E2;
                o7Var.requestLayout();
                if (iv0Var.C1) {
                    if (E2.getDialogId() == j3) {
                        c11 = 0;
                    } else {
                        c11 = 1;
                    }
                    if (sparseArrayArr[c11].indexOfKey(E2.getId()) >= 0) {
                        z13 = true;
                    }
                    o7Var.f(z13, !iv0Var.f24086b1);
                    return;
                }
                o7Var.f(false, !iv0Var.f24086b1);
            }
        } else if (i11 == 4 && (view instanceof org.telegram.ui.Cells.k7)) {
            org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
            MessageObject E3 = E(i10);
            if (i10 != h() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            k7Var.f(E3, z10);
            if (iv0Var.C1) {
                if (E3.getDialogId() == j3) {
                    c10 = 0;
                } else {
                    c10 = 1;
                }
                if (sparseArrayArr[c10].indexOfKey(E3.getId()) >= 0) {
                    z13 = true;
                }
                k7Var.e(z13, !iv0Var.f24086b1);
                return;
            }
            k7Var.e(false, !iv0Var.f24086b1);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        iv0 iv0Var = this.v;
        org.telegram.ui.ActionBar.f6 f6Var = iv0Var.F1;
        Context context = this.f22481c;
        int i11 = this.f22484r;
        if (i11 == 1) {
            view = new org.telegram.ui.Cells.l7(context, 0, f6Var);
        } else if (i11 == 4) {
            view = new cu0(this, context, f6Var, 0);
        } else {
            org.telegram.ui.Cells.o7 o7Var = new org.telegram.ui.Cells.o7(context, 0, f6Var);
            o7Var.setDelegate(iv0Var.S1);
            view = o7Var;
        }
        view.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(view);
    }
}
