package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.tj;
import org.telegram.ui.LaunchActivity;
public final class zy0 implements View.OnClickListener {
    public final int f33264a = 0;
    public final vh.d f33265b;
    public final int f33266c;
    public final org.telegram.ui.ActionBar.z2 d;
    public final long e;
    public final boolean f33267f;
    public final org.telegram.ui.ActionBar.p6 h;
    public final TLRPC.User f33268n;
    public final Object f33269r;
    public final Object f33270s;
    public final Object f33271w;

    public zy0(vh.d dVar, jz0 jz0Var, org.telegram.messenger.wp wpVar, long j10, TLRPC.User user, String[] strArr, int i10, org.telegram.ui.ActionBar.z2 z2Var, boolean z10, org.telegram.ui.ActionBar.p6 p6Var) {
        this.f33265b = dVar;
        this.f33269r = jz0Var;
        this.f33270s = wpVar;
        this.e = j10;
        this.f33268n = user;
        this.f33271w = strArr;
        this.f33266c = i10;
        this.d = z2Var;
        this.f33267f = z10;
        this.h = p6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33264a) {
            case 0:
                jz0 jz0Var = (jz0) this.f33269r;
                org.telegram.ui.Cells.e6 e6Var = jz0Var.h;
                final org.telegram.messenger.wp wpVar = (org.telegram.messenger.wp) this.f33270s;
                String[] strArr = (String[]) this.f33271w;
                final vh.d dVar = this.f33265b;
                if (!dVar.Q) {
                    EditTextBoldCursor textView = e6Var.getTextView();
                    if (textView.getText().toString().trim().length() <= 16) {
                        dVar.setLoading(true);
                        org.telegram.messenger.i0.v1(e6Var);
                        final TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank = new TLRPC.TL_messages_editChatParticipantRank();
                        final long j10 = this.e;
                        tL_messages_editChatParticipantRank.peer = wpVar.i1(j10);
                        final TLRPC.User user = this.f33268n;
                        tL_messages_editChatParticipantRank.participant = org.telegram.messenger.wp.m1(user);
                        tL_messages_editChatParticipantRank.rank = strArr[0];
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.f33266c);
                        a3.b bVar = new a3.b(1);
                        final org.telegram.ui.ActionBar.z2 z2Var = this.d;
                        final boolean z10 = this.f33267f;
                        final org.telegram.ui.ActionBar.p6 p6Var = this.h;
                        connectionsManager.sendRequestTyped(tL_messages_editChatParticipantRank, bVar, new org.telegram.messenger.k20() {
                            @Override
                            public final void a(Object obj, Object obj2) {
                                int i10;
                                TLRPC.Updates updates = (TLRPC.Updates) obj;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                org.telegram.ui.ActionBar.z2 z2Var2 = z2Var;
                                if (updates != null) {
                                    long j11 = user.f19943id;
                                    TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank2 = tL_messages_editChatParticipantRank;
                                    String str = tL_messages_editChatParticipantRank2.rank;
                                    org.telegram.messenger.wp wpVar2 = org.telegram.messenger.wp.this;
                                    wpVar2.m5(-j10, str, j11);
                                    wpVar2.L3(updates, false);
                                    z2Var2.dismiss();
                                    org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                                    if (!TextUtils.isEmpty(tL_messages_editChatParticipantRank2.rank) && T != null) {
                                        cc a02 = cc.a0(T);
                                        if (z10) {
                                            i10 = 2131744314;
                                        } else {
                                            i10 = 2131744313;
                                        }
                                        wb I = a02.I(2131623989, org.telegram.messenger.dd.L0(i10, null), tL_messages_editChatParticipantRank2.rank);
                                        bb bbVar = I.e;
                                        if (bbVar.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                                            ((FrameLayout.LayoutParams) bbVar.getLayoutParams()).width = -2;
                                            ((FrameLayout.LayoutParams) bbVar.getLayoutParams()).gravity |= 1;
                                        }
                                        I.j();
                                    }
                                } else if (tL_error != null) {
                                    org.telegram.ui.Cells.f1.s(z2Var2.E, p6Var, tL_error, false);
                                    dVar.setLoading(false);
                                }
                            }
                        });
                        return;
                    }
                    float f7 = -jz0Var.D;
                    jz0Var.D = f7;
                    org.telegram.messenger.i0.F3(f7, textView, null);
                    org.telegram.messenger.t2.APP_ERROR.a();
                    return;
                }
                return;
            default:
                long[] jArr = (long[]) this.f33269r;
                final TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) this.f33270s;
                final Context context = (Context) this.f33271w;
                final vh.d dVar2 = this.f33265b;
                if (!dVar2.Q) {
                    dVar2.setLoading(true);
                    final long j11 = jArr[0];
                    TL_payments.connectStarRefBot connectstarrefbot = new TL_payments.connectStarRefBot();
                    final int i10 = this.f33266c;
                    connectstarrefbot.bot = org.telegram.messenger.wp.r1(i10).n1(starrefprogram.bot_id);
                    connectstarrefbot.peer = org.telegram.messenger.wp.r1(i10).i1(j11);
                    ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(i10);
                    final org.telegram.ui.ActionBar.z2 z2Var2 = this.d;
                    final long j12 = this.e;
                    final boolean z11 = this.f33267f;
                    final org.telegram.ui.ActionBar.p6 p6Var2 = this.h;
                    final TLRPC.User user2 = this.f33268n;
                    connectionsManager2.sendRequest(connectstarrefbot, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            org.telegram.messenger.i0.g3(new tj(vh.d.this, tLObject, i10, j11, z2Var2, starrefprogram, j12, z11, context, p6Var2, user2, tL_error));
                        }
                    });
                    return;
                }
                return;
        }
    }

    public zy0(vh.d dVar, long[] jArr, int i10, TL_payments.starRefProgram starrefprogram, org.telegram.ui.ActionBar.z2 z2Var, long j10, boolean z10, Context context, org.telegram.ui.ActionBar.p6 p6Var, TLRPC.User user) {
        this.f33265b = dVar;
        this.f33269r = jArr;
        this.f33266c = i10;
        this.f33270s = starrefprogram;
        this.d = z2Var;
        this.e = j10;
        this.f33267f = z10;
        this.f33271w = context;
        this.h = p6Var;
        this.f33268n = user;
    }
}
