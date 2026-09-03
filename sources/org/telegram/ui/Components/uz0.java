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
import org.telegram.ui.Components.dk;
import org.telegram.ui.LaunchActivity;
public final class uz0 implements View.OnClickListener {
    public final int f29322a = 0;
    public final ph.d f29323b;
    public final int f29324c;
    public final org.telegram.ui.ActionBar.g3 d;
    public final long e;
    public final boolean f29325f;
    public final org.telegram.ui.ActionBar.f6 h;
    public final TLRPC.User f29326n;
    public final Object f29327r;
    public final Object f29328s;
    public final Object v;

    public uz0(ph.d dVar, f01 f01Var, MessagesController messagesController, long j10, TLRPC.User user, String[] strArr, int i10, org.telegram.ui.ActionBar.g3 g3Var, boolean z4, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f29323b = dVar;
        this.f29327r = f01Var;
        this.f29328s = messagesController;
        this.e = j10;
        this.f29326n = user;
        this.v = strArr;
        this.f29324c = i10;
        this.d = g3Var;
        this.f29325f = z4;
        this.h = f6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f29322a) {
            case 0:
                f01 f01Var = (f01) this.f29327r;
                org.telegram.ui.Cells.b6 b6Var = f01Var.h;
                final MessagesController messagesController = (MessagesController) this.f29328s;
                String[] strArr = (String[]) this.v;
                final ph.d dVar = this.f29323b;
                if (!dVar.K) {
                    EditTextBoldCursor textView = b6Var.getTextView();
                    if (textView.getText().toString().trim().length() <= 16) {
                        dVar.setLoading(true);
                        AndroidUtilities.hideKeyboard(b6Var);
                        final TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank = new TLRPC.TL_messages_editChatParticipantRank();
                        final long j10 = this.e;
                        tL_messages_editChatParticipantRank.peer = messagesController.getInputPeer(j10);
                        final TLRPC.User user = this.f29326n;
                        tL_messages_editChatParticipantRank.participant = MessagesController.getInputPeer(user);
                        tL_messages_editChatParticipantRank.rank = strArr[0];
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.f29324c);
                        ?? obj = new Object();
                        final org.telegram.ui.ActionBar.g3 g3Var = this.d;
                        final boolean z4 = this.f29325f;
                        final org.telegram.ui.ActionBar.f6 f6Var = this.h;
                        connectionsManager.sendRequestTyped(tL_messages_editChatParticipantRank, obj, new Utilities.Callback2() {
                            @Override
                            public final void run(Object obj2, Object obj3) {
                                int i10;
                                TLRPC.Updates updates = (TLRPC.Updates) obj2;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                                org.telegram.ui.ActionBar.g3 g3Var2 = g3Var;
                                if (updates != null) {
                                    long j11 = user.f19306id;
                                    TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank2 = tL_messages_editChatParticipantRank;
                                    String str = tL_messages_editChatParticipantRank2.rank;
                                    MessagesController messagesController2 = MessagesController.this;
                                    messagesController2.updateRank(-j10, j11, str);
                                    messagesController2.processUpdates(updates, false);
                                    g3Var2.dismiss();
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
                                        nb nbVar = M.e;
                                        if (nbVar.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                                            ((FrameLayout.LayoutParams) nbVar.getLayoutParams()).width = -2;
                                            ((FrameLayout.LayoutParams) nbVar.getLayoutParams()).gravity |= 1;
                                        }
                                        M.j();
                                    }
                                } else if (tL_error != null) {
                                    org.telegram.ui.ai.u(g3Var2.topBulletinContainer, f6Var, tL_error, false);
                                    dVar.setLoading(false);
                                }
                            }
                        });
                        return;
                    }
                    float f10 = -f01Var.f24763y;
                    f01Var.f24763y = f10;
                    AndroidUtilities.shakeViewSpring(textView, f10);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    return;
                }
                return;
            default:
                long[] jArr = (long[]) this.f29327r;
                final TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) this.f29328s;
                final Context context = (Context) this.v;
                final ph.d dVar2 = this.f29323b;
                if (!dVar2.K) {
                    dVar2.setLoading(true);
                    final long j11 = jArr[0];
                    TL_payments.connectStarRefBot connectstarrefbot = new TL_payments.connectStarRefBot();
                    final int i10 = this.f29324c;
                    connectstarrefbot.bot = MessagesController.getInstance(i10).getInputUser(starrefprogram.bot_id);
                    connectstarrefbot.peer = MessagesController.getInstance(i10).getInputPeer(j11);
                    ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(i10);
                    final org.telegram.ui.ActionBar.g3 g3Var2 = this.d;
                    final long j12 = this.e;
                    final boolean z10 = this.f29325f;
                    final org.telegram.ui.ActionBar.f6 f6Var2 = this.h;
                    final TLRPC.User user2 = this.f29326n;
                    connectionsManager2.sendRequest(connectstarrefbot, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            AndroidUtilities.runOnUIThread(new dk(ph.d.this, tLObject, i10, j11, g3Var2, starrefprogram, j12, z10, context, f6Var2, user2, tL_error));
                        }
                    });
                    return;
                }
                return;
        }
    }

    public uz0(ph.d dVar, long[] jArr, int i10, TL_payments.starRefProgram starrefprogram, org.telegram.ui.ActionBar.g3 g3Var, long j10, boolean z4, Context context, org.telegram.ui.ActionBar.f6 f6Var, TLRPC.User user) {
        this.f29323b = dVar;
        this.f29327r = jArr;
        this.f29324c = i10;
        this.f29328s = starrefprogram;
        this.d = g3Var;
        this.e = j10;
        this.f29325f = z4;
        this.v = context;
        this.h = f6Var;
        this.f29326n = user;
    }
}
