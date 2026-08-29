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
public final class jz0 implements View.OnClickListener {
    public final int f29855a = 0;
    public final nh.d f29856b;
    public final int f29857c;
    public final org.telegram.ui.ActionBar.f3 d;
    public final long f29858e;
    public final boolean f29859f;
    public final org.telegram.ui.ActionBar.c6 h;
    public final TLRPC.User f29860n;
    public final Object f29861r;
    public final Object f29862s;
    public final Object v;

    public jz0(nh.d dVar, uz0 uz0Var, MessagesController messagesController, long j10, TLRPC.User user, String[] strArr, int i10, org.telegram.ui.ActionBar.f3 f3Var, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f29856b = dVar;
        this.f29861r = uz0Var;
        this.f29862s = messagesController;
        this.f29858e = j10;
        this.f29860n = user;
        this.v = strArr;
        this.f29857c = i10;
        this.d = f3Var;
        this.f29859f = z10;
        this.h = c6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f29855a) {
            case 0:
                uz0 uz0Var = (uz0) this.f29861r;
                org.telegram.ui.Cells.a6 a6Var = uz0Var.h;
                final MessagesController messagesController = (MessagesController) this.f29862s;
                String[] strArr = (String[]) this.v;
                final nh.d dVar = this.f29856b;
                if (!dVar.J) {
                    EditTextBoldCursor textView = a6Var.getTextView();
                    if (textView.getText().toString().trim().length() <= 16) {
                        dVar.setLoading(true);
                        AndroidUtilities.hideKeyboard(a6Var);
                        final TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank = new TLRPC.TL_messages_editChatParticipantRank();
                        final long j10 = this.f29858e;
                        tL_messages_editChatParticipantRank.peer = messagesController.getInputPeer(j10);
                        final TLRPC.User user = this.f29860n;
                        tL_messages_editChatParticipantRank.participant = MessagesController.getInputPeer(user);
                        tL_messages_editChatParticipantRank.rank = strArr[0];
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.f29857c);
                        ?? obj = new Object();
                        final org.telegram.ui.ActionBar.f3 f3Var = this.d;
                        final boolean z10 = this.f29859f;
                        final org.telegram.ui.ActionBar.c6 c6Var = this.h;
                        connectionsManager.sendRequestTyped(tL_messages_editChatParticipantRank, obj, new Utilities.Callback2() {
                            @Override
                            public final void run(Object obj2, Object obj3) {
                                int i10;
                                TLRPC.Updates updates = (TLRPC.Updates) obj2;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                                org.telegram.ui.ActionBar.f3 f3Var2 = f3Var;
                                if (updates != null) {
                                    long j11 = user.f22539id;
                                    TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank2 = tL_messages_editChatParticipantRank;
                                    String str = tL_messages_editChatParticipantRank2.rank;
                                    MessagesController messagesController2 = MessagesController.this;
                                    messagesController2.updateRank(-j10, j11, str);
                                    messagesController2.processUpdates(updates, false);
                                    f3Var2.dismiss();
                                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                    if (!TextUtils.isEmpty(tL_messages_editChatParticipantRank2.rank) && U != null) {
                                        tc a02 = tc.a0(U);
                                        int i11 = R.raw.contact_check;
                                        if (z10) {
                                            i10 = R.string.TagAdded;
                                        } else {
                                            i10 = R.string.TagEdited;
                                        }
                                        mc M = a02.M(LocaleController.getString(i10), tL_messages_editChatParticipantRank2.rank, i11);
                                        rb rbVar = M.f30648e;
                                        if (rbVar.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                                            ((FrameLayout.LayoutParams) rbVar.getLayoutParams()).width = -2;
                                            ((FrameLayout.LayoutParams) rbVar.getLayoutParams()).gravity |= 1;
                                        }
                                        M.j();
                                    }
                                } else if (tL_error != null) {
                                    org.telegram.ui.th.t(f3Var2.topBulletinContainer, c6Var, tL_error, false);
                                    dVar.setLoading(false);
                                }
                            }
                        });
                        return;
                    }
                    float f9 = -uz0Var.f33407y;
                    uz0Var.f33407y = f9;
                    AndroidUtilities.shakeViewSpring(textView, f9);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    return;
                }
                return;
            default:
                long[] jArr = (long[]) this.f29861r;
                final TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) this.f29862s;
                final Context context = (Context) this.v;
                final nh.d dVar2 = this.f29856b;
                if (!dVar2.J) {
                    dVar2.setLoading(true);
                    final long j11 = jArr[0];
                    TL_payments.connectStarRefBot connectstarrefbot = new TL_payments.connectStarRefBot();
                    final int i10 = this.f29857c;
                    connectstarrefbot.bot = MessagesController.getInstance(i10).getInputUser(starrefprogram.bot_id);
                    connectstarrefbot.peer = MessagesController.getInstance(i10).getInputPeer(j11);
                    ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(i10);
                    final org.telegram.ui.ActionBar.f3 f3Var2 = this.d;
                    final long j12 = this.f29858e;
                    final boolean z11 = this.f29859f;
                    final org.telegram.ui.ActionBar.c6 c6Var2 = this.h;
                    final TLRPC.User user2 = this.f29860n;
                    connectionsManager2.sendRequest(connectstarrefbot, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            AndroidUtilities.runOnUIThread(new fk(nh.d.this, tLObject, i10, j11, f3Var2, starrefprogram, j12, z11, context, c6Var2, user2, tL_error));
                        }
                    });
                    return;
                }
                return;
        }
    }

    public jz0(nh.d dVar, long[] jArr, int i10, TL_payments.starRefProgram starrefprogram, org.telegram.ui.ActionBar.f3 f3Var, long j10, boolean z10, Context context, org.telegram.ui.ActionBar.c6 c6Var, TLRPC.User user) {
        this.f29856b = dVar;
        this.f29861r = jArr;
        this.f29857c = i10;
        this.f29862s = starrefprogram;
        this.d = f3Var;
        this.f29858e = j10;
        this.f29859f = z10;
        this.v = context;
        this.h = c6Var;
        this.f29860n = user;
    }
}
