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
public final class lt0 extends il0 {
    public final Context f30427c;
    public ii0 f30428e;
    public int f30430n;
    public final int f30431r;
    public int f30432s;
    public final qu0 v;
    public ArrayList d = new ArrayList();
    public ArrayList f30429f = new ArrayList();
    public int h = 0;

    public lt0(qu0 qu0Var, Context context, int i10) {
        this.v = qu0Var;
        this.f30427c = context;
        this.f30431r = i10;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        if (this.f30429f.size() + this.d.size() != 0) {
            return true;
        }
        return false;
    }

    public final MessageObject E(int i10) {
        if (i10 < this.d.size()) {
            return (MessageObject) this.d.get(i10);
        }
        return (MessageObject) this.f30429f.get(i10 - this.d.size());
    }

    public final void F(final int i10, final String str, long j10, long j11) {
        org.telegram.ui.ActionBar.o2 o2Var = this.v.f32093r1;
        if (!DialogObject.isEncryptedDialog(j10)) {
            if (this.h != 0) {
                o2Var.getConnectionsManager().cancelRequest(this.h, true);
                this.h = 0;
                this.f30432s--;
            }
            if (str != null && str.length() != 0) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.limit = 50;
                tL_messages_search.offset_id = i10;
                int i11 = this.f30431r;
                if (i11 == 1) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterDocument();
                } else if (i11 == 3) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterUrl();
                } else if (i11 == 4) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterMusic();
                }
                tL_messages_search.f22501q = str;
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
                final int i12 = this.f30430n + 1;
                this.f30430n = i12;
                this.f30432s++;
                this.h = o2Var.getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        ArrayList arrayList = new ArrayList();
                        lt0 lt0Var = lt0.this;
                        if (tL_error == null) {
                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                            for (int i13 = 0; i13 < messages_messages.messages.size(); i13++) {
                                TLRPC.Message message = messages_messages.messages.get(i13);
                                int i14 = i10;
                                if (i14 == 0 || message.f22413id <= i14) {
                                    arrayList.add(new MessageObject(lt0Var.v.f32093r1.getCurrentAccount(), message, false, true));
                                }
                            }
                        }
                        AndroidUtilities.runOnUIThread(new ag.z1((Object) lt0Var, i12, arrayList, (Serializable) str, 25));
                    }
                }, 2);
                o2Var.getConnectionsManager().bindRequestToGuid(this.h, o2Var.getClassGuid());
                return;
            }
            this.f30429f.clear();
            this.f30430n = 0;
            l();
        }
    }

    public final void G(String str, boolean z10) {
        ii0 ii0Var = this.f30428e;
        if (ii0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(ii0Var);
            this.f30428e = null;
        }
        if (!this.d.isEmpty() || !this.f30429f.isEmpty()) {
            this.d.clear();
            this.f30429f.clear();
            l();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        int i10 = 0;
        qu0 qu0Var = this.v;
        if (isEmpty) {
            if (!this.d.isEmpty() || !this.f30429f.isEmpty() || this.f30432s != 0) {
                this.d.clear();
                this.f30429f.clear();
                if (this.h != 0) {
                    qu0Var.f32093r1.getConnectionsManager().cancelRequest(this.h, true);
                    this.h = 0;
                    this.f30432s--;
                    return;
                }
                return;
            }
            return;
        }
        while (true) {
            it0[] it0VarArr = qu0Var.f32070g0;
            if (i10 < it0VarArr.length) {
                it0 it0Var = it0VarArr[i10];
                if (it0Var.B == this.f30431r) {
                    it0Var.f29471w.e(true, z10);
                }
                i10++;
            } else {
                ii0 ii0Var2 = new ii0(12, this, str);
                this.f30428e = ii0Var2;
                AndroidUtilities.runOnUIThread(ii0Var2, 300L);
                return;
            }
        }
    }

    @Override
    public final int h() {
        int size = this.d.size();
        int size2 = this.f30429f.size();
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
    public final void v(f2.n1 n1Var, int i10) {
        boolean z10;
        char c3;
        boolean z11;
        char c6;
        boolean z12;
        char c10;
        View view = n1Var.f6432a;
        qu0 qu0Var = this.v;
        long j10 = qu0Var.f32069f1;
        SparseArray[] sparseArrayArr = qu0Var.V0;
        boolean z13 = false;
        int i11 = this.f30431r;
        if (i11 == 1) {
            if (view instanceof org.telegram.ui.Cells.g7) {
                org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
                MessageObject E = E(i10);
                if (i10 != h() - 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                g7Var.c(E, z12);
                if (qu0Var.f32111y1) {
                    if (E.getDialogId() == j10) {
                        c10 = 0;
                    } else {
                        c10 = 1;
                    }
                    if (sparseArrayArr[c10].indexOfKey(E.getId()) >= 0) {
                        z13 = true;
                    }
                    g7Var.b(z13, !qu0Var.X0);
                    return;
                }
                g7Var.b(false, !qu0Var.X0);
            }
        } else if (i11 == 3) {
            if (view instanceof org.telegram.ui.Cells.j7) {
                org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
                MessageObject E2 = E(i10);
                if (i10 != h() - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                j7Var.f24561y = z11;
                j7Var.e();
                j7Var.U = E2;
                j7Var.requestLayout();
                if (qu0Var.f32111y1) {
                    if (E2.getDialogId() == j10) {
                        c6 = 0;
                    } else {
                        c6 = 1;
                    }
                    if (sparseArrayArr[c6].indexOfKey(E2.getId()) >= 0) {
                        z13 = true;
                    }
                    j7Var.f(z13, !qu0Var.X0);
                    return;
                }
                j7Var.f(false, !qu0Var.X0);
            }
        } else if (i11 == 4 && (view instanceof org.telegram.ui.Cells.f7)) {
            org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view;
            MessageObject E3 = E(i10);
            if (i10 != h() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            f7Var.f(E3, z10);
            if (qu0Var.f32111y1) {
                if (E3.getDialogId() == j10) {
                    c3 = 0;
                } else {
                    c3 = 1;
                }
                if (sparseArrayArr[c3].indexOfKey(E3.getId()) >= 0) {
                    z13 = true;
                }
                f7Var.e(z13, !qu0Var.X0);
                return;
            }
            f7Var.e(false, !qu0Var.X0);
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View view;
        qu0 qu0Var = this.v;
        org.telegram.ui.ActionBar.c6 c6Var = qu0Var.B1;
        Context context = this.f30427c;
        int i11 = this.f30431r;
        if (i11 == 1) {
            view = new org.telegram.ui.Cells.g7(context, 0, c6Var);
        } else if (i11 == 4) {
            view = new kt0(this, context, c6Var, 0);
        } else {
            org.telegram.ui.Cells.j7 j7Var = new org.telegram.ui.Cells.j7(context, 0, c6Var);
            j7Var.setDelegate(qu0Var.O1);
            view = j7Var;
        }
        view.setLayoutParams(new f2.x0(-1, -2));
        return new f2.n1(view);
    }
}
