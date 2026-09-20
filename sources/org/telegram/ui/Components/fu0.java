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
public final class fu0 extends ul0 {
    public final Context f24188c;
    public wn0 e;
    public int f24190n;
    public final int f24191r;
    public int f24192s;
    public final jv0 v;
    public ArrayList d = new ArrayList();
    public ArrayList f24189f = new ArrayList();
    public int h = 0;

    public fu0(jv0 jv0Var, Context context, int i10) {
        this.v = jv0Var;
        this.f24188c = context;
        this.f24191r = i10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (this.f24189f.size() + this.d.size() != 0) {
            return true;
        }
        return false;
    }

    public final MessageObject E(int i10) {
        if (i10 < this.d.size()) {
            return (MessageObject) this.d.get(i10);
        }
        return (MessageObject) this.f24189f.get(i10 - this.d.size());
    }

    public final void F(final int i10, final String str, long j3, long j10) {
        org.telegram.ui.ActionBar.n2 n2Var = this.v.f25528v1;
        if (!DialogObject.isEncryptedDialog(j3)) {
            if (this.h != 0) {
                n2Var.getConnectionsManager().cancelRequest(this.h, true);
                this.h = 0;
                this.f24192s--;
            }
            if (str != null && str.length() != 0) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.limit = 50;
                tL_messages_search.offset_id = i10;
                int i11 = this.f24191r;
                if (i11 == 1) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterDocument();
                } else if (i11 == 3) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterUrl();
                } else if (i11 == 4) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterMusic();
                }
                tL_messages_search.f18437q = str;
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
                final int i12 = this.f24190n + 1;
                this.f24190n = i12;
                this.f24192s++;
                this.h = n2Var.getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        ArrayList arrayList = new ArrayList();
                        fu0 fu0Var = fu0.this;
                        if (tL_error == null) {
                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                            for (int i13 = 0; i13 < messages_messages.messages.size(); i13++) {
                                TLRPC.Message message = messages_messages.messages.get(i13);
                                int i14 = i10;
                                if (i14 == 0 || message.f18349id <= i14) {
                                    arrayList.add(new MessageObject(fu0Var.v.f25528v1.getCurrentAccount(), message, false, true));
                                }
                            }
                        }
                        AndroidUtilities.runOnUIThread(new ai.c9(fu0Var, i12, arrayList, str, 26));
                    }
                }, 2);
                n2Var.getConnectionsManager().bindRequestToGuid(this.h, n2Var.getClassGuid());
                return;
            }
            this.f24189f.clear();
            this.f24190n = 0;
            l();
        }
    }

    public final void G(String str, boolean z10) {
        wn0 wn0Var = this.e;
        if (wn0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(wn0Var);
            this.e = null;
        }
        if (!this.d.isEmpty() || !this.f24189f.isEmpty()) {
            this.d.clear();
            this.f24189f.clear();
            l();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        int i10 = 0;
        jv0 jv0Var = this.v;
        if (isEmpty) {
            if (!this.d.isEmpty() || !this.f24189f.isEmpty() || this.f24192s != 0) {
                this.d.clear();
                this.f24189f.clear();
                if (this.h != 0) {
                    jv0Var.f25528v1.getConnectionsManager().cancelRequest(this.h, true);
                    this.h = 0;
                    this.f24192s--;
                    return;
                }
                return;
            }
            return;
        }
        while (true) {
            cu0[] cu0VarArr = jv0Var.f25504k0;
            if (i10 < cu0VarArr.length) {
                cu0 cu0Var = cu0VarArr[i10];
                if (cu0Var.F == this.f24191r) {
                    cu0Var.f23409w.e(true, z10);
                }
                i10++;
            } else {
                wn0 wn0Var2 = new wn0(9, this, str);
                this.e = wn0Var2;
                AndroidUtilities.runOnUIThread(wn0Var2, 300L);
                return;
            }
        }
    }

    @Override
    public final int h() {
        int size = this.d.size();
        int size2 = this.f24189f.size();
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
        View view = c1Var.f42974a;
        jv0 jv0Var = this.v;
        long j3 = jv0Var.f25503j1;
        SparseArray[] sparseArrayArr = jv0Var.Z0;
        boolean z13 = false;
        int i11 = this.f24191r;
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
                if (jv0Var.C1) {
                    if (E.getDialogId() == j3) {
                        c12 = 0;
                    } else {
                        c12 = 1;
                    }
                    if (sparseArrayArr[c12].indexOfKey(E.getId()) >= 0) {
                        z13 = true;
                    }
                    l7Var.b(z13, !jv0Var.f25483b1);
                    return;
                }
                l7Var.b(false, !jv0Var.f25483b1);
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
                o7Var.f20777y = z11;
                o7Var.e();
                o7Var.f20759b0 = E2;
                o7Var.requestLayout();
                if (jv0Var.C1) {
                    if (E2.getDialogId() == j3) {
                        c11 = 0;
                    } else {
                        c11 = 1;
                    }
                    if (sparseArrayArr[c11].indexOfKey(E2.getId()) >= 0) {
                        z13 = true;
                    }
                    o7Var.f(z13, !jv0Var.f25483b1);
                    return;
                }
                o7Var.f(false, !jv0Var.f25483b1);
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
            if (jv0Var.C1) {
                if (E3.getDialogId() == j3) {
                    c10 = 0;
                } else {
                    c10 = 1;
                }
                if (sparseArrayArr[c10].indexOfKey(E3.getId()) >= 0) {
                    z13 = true;
                }
                k7Var.e(z13, !jv0Var.f25483b1);
                return;
            }
            k7Var.e(false, !jv0Var.f25483b1);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        jv0 jv0Var = this.v;
        org.telegram.ui.ActionBar.f6 f6Var = jv0Var.F1;
        Context context = this.f24188c;
        int i11 = this.f24191r;
        if (i11 == 1) {
            view = new org.telegram.ui.Cells.l7(context, 0, f6Var);
        } else if (i11 == 4) {
            view = new eu0(this, context, f6Var, 0);
        } else {
            org.telegram.ui.Cells.o7 o7Var = new org.telegram.ui.Cells.o7(context, 0, f6Var);
            o7Var.setDelegate(jv0Var.S1);
            view = o7Var;
        }
        view.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(view);
    }
}
