package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class TagEditCell$$ExternalSyntheticLambda1 implements View.OnClickListener {
    public final int $r8$classId = 0;
    public final ButtonWithCounterView f$0;
    public final Object f$1;
    public final Object f$2;
    public final long f$3;
    public final TLRPC.User f$4;
    public final Object f$5;
    public final int f$6;
    public final BottomSheet f$7;
    public final boolean f$8;
    public final Theme.ResourcesProvider f$9;

    public TagEditCell$$ExternalSyntheticLambda1(ButtonWithCounterView buttonWithCounterView, TagEditCell tagEditCell, MessagesController messagesController, long j, TLRPC.User user, String[] strArr, int i, BottomSheet bottomSheet, boolean z, Theme.ResourcesProvider resourcesProvider) {
        this.f$0 = buttonWithCounterView;
        this.f$1 = tagEditCell;
        this.f$2 = messagesController;
        this.f$3 = j;
        this.f$4 = user;
        this.f$5 = strArr;
        this.f$6 = i;
        this.f$7 = bottomSheet;
        this.f$8 = z;
        this.f$9 = resourcesProvider;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                TagEditCell.lambda$showSheet$3(this.f$0, (TagEditCell) this.f$1, (MessagesController) this.f$2, this.f$3, this.f$4, (String[]) this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, view);
                break;
            default:
                final ButtonWithCounterView buttonWithCounterView = this.f$0;
                if (!buttonWithCounterView.isLoading()) {
                    buttonWithCounterView.setLoading(true);
                    final long j = ((long[]) this.f$1)[0];
                    TL_payments.connectStarRefBot connectstarrefbot = new TL_payments.connectStarRefBot();
                    final int i = this.f$6;
                    MessagesController messagesController = MessagesController.getInstance(i);
                    final TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) this.f$2;
                    connectstarrefbot.bot = messagesController.getInputUser(starrefprogram.bot_id);
                    connectstarrefbot.peer = MessagesController.getInstance(i).getInputPeer(j);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i);
                    final Theme.ResourcesProvider resourcesProvider = this.f$9;
                    final TLRPC.User user = this.f$4;
                    final BottomSheet bottomSheet = this.f$7;
                    final long j2 = this.f$3;
                    final boolean z = this.f$8;
                    final Context context = (Context) this.f$5;
                    connectionsManager.sendRequest(connectstarrefbot, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            AndroidUtilities.runOnUIThread(new ChannelAffiliateProgramsFragment$$ExternalSyntheticLambda26(buttonWithCounterView, tLObject, i, j, bottomSheet, starrefprogram, j2, z, context, resourcesProvider, user, tL_error));
                        }
                    });
                    break;
                }
                break;
        }
    }

    public TagEditCell$$ExternalSyntheticLambda1(ButtonWithCounterView buttonWithCounterView, long[] jArr, int i, TL_payments.starRefProgram starrefprogram, BottomSheet bottomSheet, long j, boolean z, Context context, Theme.ResourcesProvider resourcesProvider, TLRPC.User user) {
        this.f$0 = buttonWithCounterView;
        this.f$1 = jArr;
        this.f$6 = i;
        this.f$2 = starrefprogram;
        this.f$7 = bottomSheet;
        this.f$3 = j;
        this.f$8 = z;
        this.f$5 = context;
        this.f$9 = resourcesProvider;
        this.f$4 = user;
    }
}
