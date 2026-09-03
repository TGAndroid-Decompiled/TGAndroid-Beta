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
public final class tt0 extends rl0 {
    public final Context f31409c;
    public b90 f31410e;
    public int f31412n;
    public final int f31413r;
    public int f31414s;
    public final yu0 v;
    public ArrayList d = new ArrayList();
    public ArrayList f31411f = new ArrayList();
    public int h = 0;

    public tt0(yu0 yu0Var, Context context, int i10) {
        this.v = yu0Var;
        this.f31409c = context;
        this.f31413r = i10;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        if (this.f31411f.size() + this.d.size() != 0) {
            return true;
        }
        return false;
    }

    public final MessageObject E(int i10) {
        if (i10 < this.d.size()) {
            return (MessageObject) this.d.get(i10);
        }
        return (MessageObject) this.f31411f.get(i10 - this.d.size());
    }

    public final void F(final int i10, final String str, long j10, long j11) {
        org.telegram.ui.ActionBar.p2 p2Var = this.v.f33649s1;
        if (!DialogObject.isEncryptedDialog(j10)) {
            if (this.h != 0) {
                p2Var.getConnectionsManager().cancelRequest(this.h, true);
                this.h = 0;
                this.f31414s--;
            }
            if (str != null && str.length() != 0) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.limit = 50;
                tL_messages_search.offset_id = i10;
                int i11 = this.f31413r;
                if (i11 == 1) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterDocument();
                } else if (i11 == 3) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterUrl();
                } else if (i11 == 4) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterMusic();
                }
                tL_messages_search.f20954q = str;
                tL_messages_search.peer = p2Var.getMessagesController().getInputPeer(j10);
                if (j11 != 0) {
                    if (j10 == p2Var.getUserConfig().getClientUserId()) {
                        tL_messages_search.flags |= 4;
                        tL_messages_search.saved_peer_id = p2Var.getMessagesController().getInputPeer(j11);
                    } else {
                        tL_messages_search.flags |= 2;
                        tL_messages_search.top_msg_id = (int) j11;
                    }
                }
                if (tL_messages_search.peer == null) {
                    return;
                }
                final int i12 = this.f31412n + 1;
                this.f31412n = i12;
                this.f31414s++;
                this.h = p2Var.getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        ArrayList arrayList = new ArrayList();
                        tt0 tt0Var = tt0.this;
                        if (tL_error == null) {
                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                            for (int i13 = 0; i13 < messages_messages.messages.size(); i13++) {
                                TLRPC.Message message = messages_messages.messages.get(i13);
                                int i14 = i10;
                                if (i14 == 0 || message.f20866id <= i14) {
                                    arrayList.add(new MessageObject(tt0Var.v.f33649s1.getCurrentAccount(), message, false, true));
                                }
                            }
                        }
                        AndroidUtilities.runOnUIThread(new dg.u1((Object) tt0Var, i12, arrayList, (Serializable) str, 25));
                    }
                }, 2);
                p2Var.getConnectionsManager().bindRequestToGuid(this.h, p2Var.getClassGuid());
                return;
            }
            this.f31411f.clear();
            this.f31412n = 0;
            l();
        }
    }

    public final void G(String str, boolean z4) {
        b90 b90Var = this.f31410e;
        if (b90Var != null) {
            AndroidUtilities.cancelRunOnUIThread(b90Var);
            this.f31410e = null;
        }
        if (!this.d.isEmpty() || !this.f31411f.isEmpty()) {
            this.d.clear();
            this.f31411f.clear();
            l();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        int i10 = 0;
        yu0 yu0Var = this.v;
        if (isEmpty) {
            if (!this.d.isEmpty() || !this.f31411f.isEmpty() || this.f31414s != 0) {
                this.d.clear();
                this.f31411f.clear();
                if (this.h != 0) {
                    yu0Var.f33649s1.getConnectionsManager().cancelRequest(this.h, true);
                    this.h = 0;
                    this.f31414s--;
                    return;
                }
                return;
            }
            return;
        }
        while (true) {
            qt0[] qt0VarArr = yu0Var.f33625h0;
            if (i10 < qt0VarArr.length) {
                qt0 qt0Var = qt0VarArr[i10];
                if (qt0Var.C == this.f31413r) {
                    qt0Var.f30524w.e(true, z4);
                }
                i10++;
            } else {
                b90 b90Var2 = new b90(19, this, str);
                this.f31410e = b90Var2;
                AndroidUtilities.runOnUIThread(b90Var2, 300L);
                return;
            }
        }
    }

    @Override
    public final int h() {
        int size = this.d.size();
        int size2 = this.f31411f.size();
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
    public final void v(f2.m1 m1Var, int i10) {
        boolean z4;
        char c3;
        boolean z10;
        char c10;
        boolean z11;
        char c11;
        View view = m1Var.f5875a;
        yu0 yu0Var = this.v;
        long j10 = yu0Var.f33624g1;
        SparseArray[] sparseArrayArr = yu0Var.W0;
        boolean z12 = false;
        int i11 = this.f31413r;
        if (i11 == 1) {
            if (view instanceof org.telegram.ui.Cells.i7) {
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
                MessageObject E = E(i10);
                if (i10 != h() - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                i7Var.c(E, z11);
                if (yu0Var.f33666z1) {
                    if (E.getDialogId() == j10) {
                        c11 = 0;
                    } else {
                        c11 = 1;
                    }
                    if (sparseArrayArr[c11].indexOfKey(E.getId()) >= 0) {
                        z12 = true;
                    }
                    i7Var.b(z12, !yu0Var.Y0);
                    return;
                }
                i7Var.b(false, !yu0Var.Y0);
            }
        } else if (i11 == 3) {
            if (view instanceof org.telegram.ui.Cells.l7) {
                org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
                MessageObject E2 = E(i10);
                if (i10 != h() - 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                l7Var.f23134y = z10;
                l7Var.e();
                l7Var.V = E2;
                l7Var.requestLayout();
                if (yu0Var.f33666z1) {
                    if (E2.getDialogId() == j10) {
                        c10 = 0;
                    } else {
                        c10 = 1;
                    }
                    if (sparseArrayArr[c10].indexOfKey(E2.getId()) >= 0) {
                        z12 = true;
                    }
                    l7Var.f(z12, !yu0Var.Y0);
                    return;
                }
                l7Var.f(false, !yu0Var.Y0);
            }
        } else if (i11 == 4 && (view instanceof org.telegram.ui.Cells.h7)) {
            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
            MessageObject E3 = E(i10);
            if (i10 != h() - 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            h7Var.f(E3, z4);
            if (yu0Var.f33666z1) {
                if (E3.getDialogId() == j10) {
                    c3 = 0;
                } else {
                    c3 = 1;
                }
                if (sparseArrayArr[c3].indexOfKey(E3.getId()) >= 0) {
                    z12 = true;
                }
                h7Var.e(z12, !yu0Var.Y0);
                return;
            }
            h7Var.e(false, !yu0Var.Y0);
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View view;
        yu0 yu0Var = this.v;
        org.telegram.ui.ActionBar.g6 g6Var = yu0Var.C1;
        Context context = this.f31409c;
        int i11 = this.f31413r;
        if (i11 == 1) {
            view = new org.telegram.ui.Cells.i7(context, 0, g6Var);
        } else if (i11 == 4) {
            view = new st0(this, context, g6Var, 0);
        } else {
            org.telegram.ui.Cells.l7 l7Var = new org.telegram.ui.Cells.l7(context, 0, g6Var);
            l7Var.setDelegate(yu0Var.P1);
            view = l7Var;
        }
        view.setLayoutParams(new f2.x0(-1, -2));
        return new f2.m1(view);
    }
}
