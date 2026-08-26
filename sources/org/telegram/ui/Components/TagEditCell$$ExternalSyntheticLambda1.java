package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.internal.mlkit_vision_common.zzlu;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
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
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.PollEditTextCell;
import org.telegram.ui.LaunchActivity;
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
                final ButtonWithCounterView buttonWithCounterView = this.f$0;
                if (!buttonWithCounterView.loading) {
                    TagEditCell tagEditCell = (TagEditCell) this.f$1;
                    PollEditTextCell pollEditTextCell = tagEditCell.editTextCell;
                    EditTextBoldCursor textView = pollEditTextCell.getTextView();
                    if (textView.getText().toString().trim().length() > 16) {
                        float f = -tagEditCell.shakeDp;
                        tagEditCell.shakeDp = f;
                        AndroidUtilities.shakeViewSpring(textView, f);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    } else {
                        buttonWithCounterView.setLoading(true);
                        AndroidUtilities.hideKeyboard(pollEditTextCell);
                        final TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank = new TLRPC.TL_messages_editChatParticipantRank();
                        final MessagesController messagesController = (MessagesController) this.f$2;
                        final long j = this.f$3;
                        tL_messages_editChatParticipantRank.peer = messagesController.getInputPeer(j);
                        final TLRPC.User user = this.f$4;
                        tL_messages_editChatParticipantRank.participant = MessagesController.getInputPeer(user);
                        tL_messages_editChatParticipantRank.rank = ((String[]) this.f$5)[0];
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.f$6);
                        AiTonesController$$ExternalSyntheticLambda0 aiTonesController$$ExternalSyntheticLambda0 = new AiTonesController$$ExternalSyntheticLambda0();
                        final BottomSheet bottomSheet = this.f$7;
                        final boolean z = this.f$8;
                        final Theme.ResourcesProvider resourcesProvider = this.f$9;
                        connectionsManager.sendRequestTyped(tL_messages_editChatParticipantRank, aiTonesController$$ExternalSyntheticLambda0, new Utilities.Callback2() {
                            @Override
                            public final void run(Object obj, Object obj2) {
                                TLRPC.Updates updates = (TLRPC.Updates) obj;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                BottomSheet bottomSheet2 = bottomSheet;
                                if (updates == null) {
                                    if (tL_error != null) {
                                        zzlu.m(bottomSheet2.topBulletinContainer, resourcesProvider, tL_error);
                                        buttonWithCounterView.setLoading(false);
                                        return;
                                    }
                                    return;
                                }
                                long j2 = -j;
                                long j3 = user.id;
                                TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank2 = tL_messages_editChatParticipantRank;
                                String str = tL_messages_editChatParticipantRank2.rank;
                                MessagesController messagesController2 = messagesController;
                                messagesController2.updateRank(j2, j3, str);
                                messagesController2.processUpdates(updates, false);
                                bottomSheet2.lambda$showGiftOfferSheet$15();
                                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                                if (TextUtils.isEmpty(tL_messages_editChatParticipantRank2.rank) || safeLastFragment == null) {
                                    return;
                                }
                                Bulletin bulletinCreateSimpleBulletin = BulletinFactory.of(safeLastFragment).createSimpleBulletin(LocaleController.getString(z ? R.string.TagAdded : R.string.TagEdited), tL_messages_editChatParticipantRank2.rank, R.raw.contact_check);
                                Bulletin.Layout layout = bulletinCreateSimpleBulletin.layout;
                                if (layout.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                                    ((FrameLayout.LayoutParams) layout.getLayoutParams()).width = -2;
                                    ((FrameLayout.LayoutParams) layout.getLayoutParams()).gravity |= 1;
                                }
                                bulletinCreateSimpleBulletin.show();
                            }
                        });
                    }
                    break;
                }
                break;
            default:
                final ButtonWithCounterView buttonWithCounterView2 = this.f$0;
                if (!buttonWithCounterView2.loading) {
                    buttonWithCounterView2.setLoading(true);
                    final long j2 = ((long[]) this.f$1)[0];
                    TL_payments.connectStarRefBot connectstarrefbot = new TL_payments.connectStarRefBot();
                    final int i = this.f$6;
                    MessagesController messagesController2 = MessagesController.getInstance(i);
                    final TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) this.f$2;
                    connectstarrefbot.bot = messagesController2.getInputUser(starrefprogram.bot_id);
                    connectstarrefbot.peer = MessagesController.getInstance(i).getInputPeer(j2);
                    ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(i);
                    final Theme.ResourcesProvider resourcesProvider2 = this.f$9;
                    final TLRPC.User user2 = this.f$4;
                    final BottomSheet bottomSheet2 = this.f$7;
                    final long j3 = this.f$3;
                    final boolean z2 = this.f$8;
                    final Context context = (Context) this.f$5;
                    connectionsManager2.sendRequest(connectstarrefbot, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            AndroidUtilities.runOnUIThread(new ChannelAffiliateProgramsFragment$$ExternalSyntheticLambda25(buttonWithCounterView2, tLObject, i, j2, bottomSheet2, starrefprogram, j3, z2, context, resourcesProvider2, user2, tL_error));
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
