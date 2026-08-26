package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.BulletinFactory;

public final class ManageLinksActivity$$ExternalSyntheticLambda11 implements RequestDelegate {
    public final int $r8$classId;
    public final ManageLinksActivity f$0;
    public final TLRPC.TL_chatInviteExported f$1;

    public ManageLinksActivity$$ExternalSyntheticLambda11(ManageLinksActivity manageLinksActivity, TLRPC.TL_chatInviteExported tL_chatInviteExported, int i) {
        this.$r8$classId = i;
        this.f$0 = manageLinksActivity;
        this.f$1 = tL_chatInviteExported;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                final ManageLinksActivity manageLinksActivity = this.f$0;
                manageLinksActivity.getClass();
                final TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f$1;
                final int i = 0;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i) {
                            case 0:
                                ManageLinksActivity manageLinksActivity2 = manageLinksActivity;
                                manageLinksActivity2.getClass();
                                if (tL_error == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) tLObject;
                                    manageLinksActivity2.invite = tL_chatInviteExported2;
                                    TLRPC.ChatFull chatFull = manageLinksActivity2.info;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported2;
                                    }
                                    if (manageLinksActivity2.getParentActivity() != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported3 = tL_chatInviteExported;
                                        tL_chatInviteExported3.revoked = true;
                                        ManageLinksActivity.DiffCallback diffCallbackSaveListState = manageLinksActivity2.saveListState();
                                        manageLinksActivity2.revokedInvites.add(0, tL_chatInviteExported3);
                                        manageLinksActivity2.updateRecyclerViewAnimated(diffCallbackSaveListState);
                                        FactCheckController$$ExternalSyntheticOutline0.m(R.string.InviteRevokedHint, BulletinFactory.of(manageLinksActivity2), R.raw.linkbroken, 36);
                                        break;
                                    }
                                }
                                break;
                            default:
                                ManageLinksActivity manageLinksActivity3 = manageLinksActivity;
                                manageLinksActivity3.getClass();
                                if (tL_error == null) {
                                    TLObject tLObject2 = tLObject;
                                    boolean z = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = tL_chatInviteExported;
                                    if (z) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!manageLinksActivity3.isPublic) {
                                            manageLinksActivity3.invite = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported4.revoked = true;
                                        ManageLinksActivity.DiffCallback diffCallbackSaveListState2 = manageLinksActivity3.saveListState();
                                        if (manageLinksActivity3.isPublic) {
                                            if (manageLinksActivity3.adminId == manageLinksActivity3.getAccountInstance().getUserConfig().getClientUserId()) {
                                                ArrayList arrayList = manageLinksActivity3.invites;
                                                arrayList.remove(tL_chatInviteExported4);
                                                arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                            } else if (manageLinksActivity3.invite != null) {
                                                manageLinksActivity3.invite = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                            }
                                        } else if (manageLinksActivity3.invite != null) {
                                            manageLinksActivity3.invite = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        manageLinksActivity3.revokedInvites.add(0, tL_chatInviteExported4);
                                        manageLinksActivity3.updateRecyclerViewAnimated(diffCallbackSaveListState2);
                                    } else {
                                        manageLinksActivity3.linkEditActivityCallback.onLinkEdited(tL_chatInviteExported4, tLObject2);
                                        TLRPC.ChatFull chatFull2 = manageLinksActivity3.info;
                                        if (chatFull2 != null) {
                                            int i2 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i2;
                                            if (i2 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            manageLinksActivity3.getMessagesStorage().saveChatLinksCount(manageLinksActivity3.currentChatId, manageLinksActivity3.info.invitesCount);
                                        }
                                    }
                                    if (manageLinksActivity3.getParentActivity() != null) {
                                        FactCheckController$$ExternalSyntheticOutline0.m(R.string.InviteRevokedHint, BulletinFactory.of(manageLinksActivity3), R.raw.linkbroken, 36);
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                ManageLinksActivity manageLinksActivity2 = this.f$0;
                manageLinksActivity2.getClass();
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda21(manageLinksActivity2, tL_error, this.f$1, 21));
                break;
            default:
                final ManageLinksActivity manageLinksActivity3 = this.f$0;
                manageLinksActivity3.getClass();
                final TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.f$1;
                final int i2 = 1;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i2) {
                            case 0:
                                ManageLinksActivity manageLinksActivity4 = manageLinksActivity3;
                                manageLinksActivity4.getClass();
                                if (tL_error == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject;
                                    manageLinksActivity4.invite = tL_chatInviteExported3;
                                    TLRPC.ChatFull chatFull = manageLinksActivity4.info;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported3;
                                    }
                                    if (manageLinksActivity4.getParentActivity() != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported4 = tL_chatInviteExported2;
                                        tL_chatInviteExported4.revoked = true;
                                        ManageLinksActivity.DiffCallback diffCallbackSaveListState = manageLinksActivity4.saveListState();
                                        manageLinksActivity4.revokedInvites.add(0, tL_chatInviteExported4);
                                        manageLinksActivity4.updateRecyclerViewAnimated(diffCallbackSaveListState);
                                        FactCheckController$$ExternalSyntheticOutline0.m(R.string.InviteRevokedHint, BulletinFactory.of(manageLinksActivity4), R.raw.linkbroken, 36);
                                        break;
                                    }
                                }
                                break;
                            default:
                                ManageLinksActivity manageLinksActivity5 = manageLinksActivity3;
                                manageLinksActivity5.getClass();
                                if (tL_error == null) {
                                    TLObject tLObject2 = tLObject;
                                    boolean z = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported5 = tL_chatInviteExported2;
                                    if (z) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!manageLinksActivity5.isPublic) {
                                            manageLinksActivity5.invite = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported5.revoked = true;
                                        ManageLinksActivity.DiffCallback diffCallbackSaveListState2 = manageLinksActivity5.saveListState();
                                        if (manageLinksActivity5.isPublic) {
                                            if (manageLinksActivity5.adminId == manageLinksActivity5.getAccountInstance().getUserConfig().getClientUserId()) {
                                                ArrayList arrayList = manageLinksActivity5.invites;
                                                arrayList.remove(tL_chatInviteExported5);
                                                arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                            } else if (manageLinksActivity5.invite != null) {
                                                manageLinksActivity5.invite = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                            }
                                        } else if (manageLinksActivity5.invite != null) {
                                            manageLinksActivity5.invite = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        manageLinksActivity5.revokedInvites.add(0, tL_chatInviteExported5);
                                        manageLinksActivity5.updateRecyclerViewAnimated(diffCallbackSaveListState2);
                                    } else {
                                        manageLinksActivity5.linkEditActivityCallback.onLinkEdited(tL_chatInviteExported5, tLObject2);
                                        TLRPC.ChatFull chatFull2 = manageLinksActivity5.info;
                                        if (chatFull2 != null) {
                                            int i3 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i3;
                                            if (i3 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            manageLinksActivity5.getMessagesStorage().saveChatLinksCount(manageLinksActivity5.currentChatId, manageLinksActivity5.info.invitesCount);
                                        }
                                    }
                                    if (manageLinksActivity5.getParentActivity() != null) {
                                        FactCheckController$$ExternalSyntheticOutline0.m(R.string.InviteRevokedHint, BulletinFactory.of(manageLinksActivity5), R.raw.linkbroken, 36);
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
