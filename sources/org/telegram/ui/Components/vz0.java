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
public final class vz0 implements View.OnClickListener {
    public final int f32578a = 0;
    public final qh.d f32579b;
    public final int f32580c;
    public final org.telegram.ui.ActionBar.h3 d;
    public final long f32581e;
    public final boolean f32582f;
    public final org.telegram.ui.ActionBar.g6 h;
    public final TLRPC.User f32583n;
    public final Object f32584r;
    public final Object f32585s;
    public final Object v;

    public vz0(qh.d dVar, g01 g01Var, MessagesController messagesController, long j10, TLRPC.User user, String[] strArr, int i10, org.telegram.ui.ActionBar.h3 h3Var, boolean z4, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f32579b = dVar;
        this.f32584r = g01Var;
        this.f32585s = messagesController;
        this.f32581e = j10;
        this.f32583n = user;
        this.v = strArr;
        this.f32580c = i10;
        this.d = h3Var;
        this.f32582f = z4;
        this.h = g6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32578a) {
            case 0:
                g01 g01Var = (g01) this.f32584r;
                org.telegram.ui.Cells.c6 c6Var = g01Var.h;
                final MessagesController messagesController = (MessagesController) this.f32585s;
                String[] strArr = (String[]) this.v;
                final qh.d dVar = this.f32579b;
                if (!dVar.K) {
                    EditTextBoldCursor textView = c6Var.getTextView();
                    if (textView.getText().toString().trim().length() <= 16) {
                        dVar.setLoading(true);
                        AndroidUtilities.hideKeyboard(c6Var);
                        final TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank = new TLRPC.TL_messages_editChatParticipantRank();
                        final long j10 = this.f32581e;
                        tL_messages_editChatParticipantRank.peer = messagesController.getInputPeer(j10);
                        final TLRPC.User user = this.f32583n;
                        tL_messages_editChatParticipantRank.participant = MessagesController.getInputPeer(user);
                        tL_messages_editChatParticipantRank.rank = strArr[0];
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.f32580c);
                        ?? obj = new Object();
                        final org.telegram.ui.ActionBar.h3 h3Var = this.d;
                        final boolean z4 = this.f32582f;
                        final org.telegram.ui.ActionBar.g6 g6Var = this.h;
                        connectionsManager.sendRequestTyped(tL_messages_editChatParticipantRank, obj, new Utilities.Callback2() {
                            @Override
                            public final void run(Object obj2, Object obj3) {
                                int i10;
                                TLRPC.Updates updates = (TLRPC.Updates) obj2;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                                org.telegram.ui.ActionBar.h3 h3Var2 = h3Var;
                                if (updates != null) {
                                    long j11 = user.f20990id;
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
                                        nb nbVar = M.f27741e;
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
                    float f10 = -g01Var.f27067y;
                    g01Var.f27067y = f10;
                    AndroidUtilities.shakeViewSpring(textView, f10);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    return;
                }
                return;
            default:
                long[] jArr = (long[]) this.f32584r;
                final TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) this.f32585s;
                final Context context = (Context) this.v;
                final qh.d dVar2 = this.f32579b;
                if (!dVar2.K) {
                    dVar2.setLoading(true);
                    final long j11 = jArr[0];
                    TL_payments.connectStarRefBot connectstarrefbot = new TL_payments.connectStarRefBot();
                    final int i10 = this.f32580c;
                    connectstarrefbot.bot = MessagesController.getInstance(i10).getInputUser(starrefprogram.bot_id);
                    connectstarrefbot.peer = MessagesController.getInstance(i10).getInputPeer(j11);
                    ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(i10);
                    final org.telegram.ui.ActionBar.h3 h3Var2 = this.d;
                    final long j12 = this.f32581e;
                    final boolean z10 = this.f32582f;
                    final org.telegram.ui.ActionBar.g6 g6Var2 = this.h;
                    final TLRPC.User user2 = this.f32583n;
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

    public vz0(qh.d dVar, long[] jArr, int i10, TL_payments.starRefProgram starrefprogram, org.telegram.ui.ActionBar.h3 h3Var, long j10, boolean z4, Context context, org.telegram.ui.ActionBar.g6 g6Var, TLRPC.User user) {
        this.f32579b = dVar;
        this.f32584r = jArr;
        this.f32580c = i10;
        this.f32585s = starrefprogram;
        this.d = h3Var;
        this.f32581e = j10;
        this.f32582f = z4;
        this.v = context;
        this.h = g6Var;
        this.f32583n = user;
    }
}
