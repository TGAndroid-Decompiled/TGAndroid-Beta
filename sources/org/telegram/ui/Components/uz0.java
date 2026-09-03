package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.fk;
import org.telegram.ui.LaunchActivity;
public final class uz0 implements View.OnClickListener {
    public final int f31714a = 0;
    public final qh.d f31715b;
    public final int f31716c;
    public final org.telegram.ui.ActionBar.h3 d;
    public final long f31717e;
    public final boolean f31718f;
    public final org.telegram.ui.ActionBar.g6 h;
    public final TLRPC.User f31719n;
    public final Object f31720r;
    public final Object f31721s;
    public final Object v;

    public uz0(qh.d dVar, f01 f01Var, MessagesController messagesController, long j10, TLRPC.User user, String[] strArr, int i10, org.telegram.ui.ActionBar.h3 h3Var, boolean z4, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f31715b = dVar;
        this.f31720r = f01Var;
        this.f31721s = messagesController;
        this.f31717e = j10;
        this.f31719n = user;
        this.v = strArr;
        this.f31716c = i10;
        this.d = h3Var;
        this.f31718f = z4;
        this.h = g6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31714a) {
            case 0:
                f01 f01Var = (f01) this.f31720r;
                org.telegram.ui.Cells.c6 c6Var = f01Var.h;
                final MessagesController messagesController = (MessagesController) this.f31721s;
                String[] strArr = (String[]) this.v;
                final qh.d dVar = this.f31715b;
                if (!dVar.K) {
                    EditTextBoldCursor textView = c6Var.getTextView();
                    if (textView.getText().toString().trim().length() <= 16) {
                        dVar.setLoading(true);
                        AndroidUtilities.hideKeyboard(c6Var);
                        final TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank = new TLRPC.TL_messages_editChatParticipantRank();
                        final long j10 = this.f31717e;
                        tL_messages_editChatParticipantRank.peer = messagesController.getInputPeer(j10);
                        final TLRPC.User user = this.f31719n;
                        tL_messages_editChatParticipantRank.participant = MessagesController.getInputPeer(user);
                        tL_messages_editChatParticipantRank.rank = strArr[0];
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.f31716c);
                        ?? obj = new Object();
                        final org.telegram.ui.ActionBar.h3 h3Var = this.d;
                        final boolean z4 = this.f31718f;
                        final org.telegram.ui.ActionBar.g6 g6Var = this.h;
                        connectionsManager.sendRequestTyped(tL_messages_editChatParticipantRank, obj, new Utilities.Callback2() {
                            @Override
                            public final void run(Object obj2, Object obj3) {
                                int i10;
                                TLRPC.Updates updates = (TLRPC.Updates) obj2;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                                org.telegram.ui.ActionBar.h3 h3Var2 = h3Var;
                                if (updates != null) {
                                    long j11 = user.f20992id;
                                    TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank2 = tL_messages_editChatParticipantRank;
                                    String str = tL_messages_editChatParticipantRank2.rank;
                                    MessagesController messagesController2 = MessagesController.this;
                                    messagesController2.updateRank(-j10, j11, str);
                                    messagesController2.processUpdates(updates, false);
                                    h3Var2.dismiss();
                                    org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                                    if (!TextUtils.isEmpty(tL_messages_editChatParticipantRank2.rank) && U != null) {
                                        qc a02 = qc.a0(U);
                                        int i11 = R.raw.contact_check;
                                        if (z4) {
                                            i10 = R.string.TagAdded;
                                        } else {
                                            i10 = R.string.TagEdited;
                                        }
                                        ic M = a02.M(LocaleController.getString(i10), tL_messages_editChatParticipantRank2.rank, i11);
                                        nb nbVar = M.f27774e;
                                        if (nbVar.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                                            ((FrameLayout.LayoutParams) nbVar.getLayoutParams()).width = -2;
                                            ((FrameLayout.LayoutParams) nbVar.getLayoutParams()).gravity |= 1;
                                        }
                                        M.j();
                                    }
                                } else if (tL_error != null) {
                                    org.telegram.ui.yh.u(h3Var2.topBulletinContainer, g6Var, tL_error, false);
                                    dVar.setLoading(false);
                                }
                            }
                        });
                        return;
                    }
                    float f10 = -f01Var.f26742y;
                    f01Var.f26742y = f10;
                    AndroidUtilities.shakeViewSpring(textView, f10);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    return;
                }
                return;
            default:
                long[] jArr = (long[]) this.f31720r;
                final TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) this.f31721s;
                final Context context = (Context) this.v;
                final qh.d dVar2 = this.f31715b;
                if (!dVar2.K) {
                    dVar2.setLoading(true);
                    final long j11 = jArr[0];
                    TL_payments.connectStarRefBot connectstarrefbot = new TL_payments.connectStarRefBot();
                    final int i10 = this.f31716c;
                    connectstarrefbot.bot = MessagesController.getInstance(i10).getInputUser(starrefprogram.bot_id);
                    connectstarrefbot.peer = MessagesController.getInstance(i10).getInputPeer(j11);
                    ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(i10);
                    final org.telegram.ui.ActionBar.h3 h3Var2 = this.d;
                    final long j12 = this.f31717e;
                    final boolean z10 = this.f31718f;
                    final org.telegram.ui.ActionBar.g6 g6Var2 = this.h;
                    final TLRPC.User user2 = this.f31719n;
                    connectionsManager2.sendRequest(connectstarrefbot, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            AndroidUtilities.runOnUIThread(new fk(qh.d.this, tLObject, i10, j11, h3Var2, starrefprogram, j12, z10, context, g6Var2, user2, tL_error));
                        }
                    });
                    return;
                }
                return;
        }
    }

    public uz0(qh.d dVar, long[] jArr, int i10, TL_payments.starRefProgram starrefprogram, org.telegram.ui.ActionBar.h3 h3Var, long j10, boolean z4, Context context, org.telegram.ui.ActionBar.g6 g6Var, TLRPC.User user) {
        this.f31715b = dVar;
        this.f31720r = jArr;
        this.f31716c = i10;
        this.f31721s = starrefprogram;
        this.d = h3Var;
        this.f31717e = j10;
        this.f31718f = z4;
        this.v = context;
        this.h = g6Var;
        this.f31719n = user;
    }
}
