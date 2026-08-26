package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Cells.TextCheckCell2;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.LaunchActivity;

public final class DeleteMessagesBottomSheet$$ExternalSyntheticLambda1 implements MessagesStorage.LongCallback, RecyclerListView.OnItemClickListenerExtended {
    public final int $r8$classId;
    public final DeleteMessagesBottomSheet f$0;

    public DeleteMessagesBottomSheet$$ExternalSyntheticLambda1(DeleteMessagesBottomSheet deleteMessagesBottomSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = deleteMessagesBottomSheet;
    }

    @Override
    public boolean hasDoubleTap(View view) {
        return false;
    }

    @Override
    public void onDoubleTap(View view, float f, float f2) {
    }

    @Override
    public void onItemClick(View view, int i, float f, float f2) {
        boolean z;
        DeleteMessagesBottomSheet deleteMessagesBottomSheet = this.f$0;
        UItem item = deleteMessagesBottomSheet.adapter.getItem(i - 1);
        if (item == null) {
            return;
        }
        int i2 = item.id;
        if (i2 == 103) {
            boolean z2 = !deleteMessagesBottomSheet.banFromCommunity;
            deleteMessagesBottomSheet.banFromCommunity = z2;
            ((TextCheckCell2) view).setChecked(z2);
            return;
        }
        int i3 = item.viewType;
        DeleteMessagesBottomSheet.Action action = deleteMessagesBottomSheet.deleteAllReactions;
        DeleteMessagesBottomSheet.Action action2 = deleteMessagesBottomSheet.deleteAll;
        DeleteMessagesBottomSheet.Action action3 = deleteMessagesBottomSheet.report;
        DeleteMessagesBottomSheet.Action action4 = deleteMessagesBottomSheet.banOrRestrict;
        if (i3 == 37) {
            int i4 = i2 >>> 24;
            int i5 = 16777215 & i2;
            if (i4 == 0) {
                action3.toggleCheck(i5);
                return;
            }
            if (i4 == 1) {
                action2.toggleCheck(i5);
                if (deleteMessagesBottomSheet.participantMessageCountsLoaded) {
                    deleteMessagesBottomSheet.updateTitleAnimated();
                    return;
                } else {
                    deleteMessagesBottomSheet.updateParticipantMessageCounts();
                    return;
                }
            }
            if (i2 != 3) {
                if (i4 == 2) {
                    action4.toggleCheck(i5);
                    return;
                }
                return;
            } else {
                action.toggleCheck(i5);
                if (deleteMessagesBottomSheet.participantMessageCountsLoaded) {
                    deleteMessagesBottomSheet.updateTitleAnimated();
                    return;
                } else {
                    deleteMessagesBottomSheet.updateParticipantMessageCounts();
                    return;
                }
            }
        }
        TLRPC.TL_chatBannedRights tL_chatBannedRights = deleteMessagesBottomSheet.bannedRights;
        if (i3 != 36 && i3 != 35) {
            if (i3 == 39) {
                if (item.locked) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(deleteMessagesBottomSheet.getContext(), 0, null);
                    String string = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    AlertDialog alertDialog = builder.alertDialog;
                    alertDialog.title = string;
                    alertDialog.message = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
                    alertDialog.show();
                    return;
                }
                if (i2 == 2) {
                    tL_chatBannedRights.invite_users = !tL_chatBannedRights.invite_users;
                    deleteMessagesBottomSheet.onRestrictionsChanged();
                } else if (i2 == 3) {
                    tL_chatBannedRights.pin_messages = !tL_chatBannedRights.pin_messages;
                    deleteMessagesBottomSheet.onRestrictionsChanged();
                } else if (i2 == 4) {
                    tL_chatBannedRights.change_info = !tL_chatBannedRights.change_info;
                    deleteMessagesBottomSheet.onRestrictionsChanged();
                } else if (i2 == 5) {
                    tL_chatBannedRights.manage_topics = !tL_chatBannedRights.manage_topics;
                    deleteMessagesBottomSheet.onRestrictionsChanged();
                } else if (i2 == 0) {
                    tL_chatBannedRights.send_plain = !tL_chatBannedRights.send_plain;
                    deleteMessagesBottomSheet.onRestrictionsChanged();
                }
                deleteMessagesBottomSheet.adapter.update(true);
                return;
            }
            if (i3 == 40) {
                deleteMessagesBottomSheet.sendMediaCollapsed = !deleteMessagesBottomSheet.sendMediaCollapsed;
                deleteMessagesBottomSheet.saveScrollPosition$2();
                deleteMessagesBottomSheet.adapter.update(true);
                deleteMessagesBottomSheet.applyScrolledPosition$1();
                return;
            }
            if (i2 == 100) {
                deleteMessagesBottomSheet.restrictUserCollapsed = false;
                boolean z3 = !deleteMessagesBottomSheet.restrictUserDeleteAllMessages;
                deleteMessagesBottomSheet.restrictUserDeleteAllMessages = z3;
                deleteMessagesBottomSheet.restrictUserDeleteAllReactions = z3;
                deleteMessagesBottomSheet.saveScrollPosition$2();
                deleteMessagesBottomSheet.adapter.update(true);
                deleteMessagesBottomSheet.applyScrolledPosition$1();
                deleteMessagesBottomSheet.updateTitleAnimated();
                return;
            }
            if (i3 == 38) {
                boolean z4 = deleteMessagesBottomSheet.restrict;
                deleteMessagesBottomSheet.restrict = !z4;
                boolean[] zArr = !z4 ? deleteMessagesBottomSheet.restrictFilter : deleteMessagesBottomSheet.banFilter;
                if (action4.totalCount != 0) {
                    action4.filter = zArr;
                    action4.updateCounters();
                    action4.updateTitle();
                }
                deleteMessagesBottomSheet.adapter.update(true);
                deleteMessagesBottomSheet.onRestrictionsChanged();
                return;
            }
            return;
        }
        if (i2 == 0) {
            action3.toggleAllChecks();
            return;
        }
        if (i2 == 1) {
            action2.toggleAllChecks();
            if (deleteMessagesBottomSheet.participantMessageCountsLoaded) {
                deleteMessagesBottomSheet.updateTitleAnimated();
                return;
            } else {
                deleteMessagesBottomSheet.updateParticipantMessageCounts();
                return;
            }
        }
        if (i2 == 3) {
            action.toggleAllChecks();
            if (deleteMessagesBottomSheet.participantMessageCountsLoaded) {
                deleteMessagesBottomSheet.updateTitleAnimated();
                return;
            } else {
                deleteMessagesBottomSheet.updateParticipantMessageCounts();
                return;
            }
        }
        if (i2 == 2) {
            action4.toggleAllChecks();
            return;
        }
        if (i3 == 35) {
            if (item.locked) {
                AlertDialog.Builder builder2 = new AlertDialog.Builder(deleteMessagesBottomSheet.getContext(), 0, null);
                String string2 = LocaleController.getString(R.string.UserRestrictionsCantModify);
                AlertDialog alertDialog2 = builder2.alertDialog;
                alertDialog2.title = string2;
                alertDialog2.message = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                builder2.setPositiveButton(LocaleController.getString(R.string.OK), null);
                alertDialog2.show();
                return;
            }
            if (i2 == 6) {
                z = true;
                tL_chatBannedRights.send_photos = !tL_chatBannedRights.send_photos;
                deleteMessagesBottomSheet.onRestrictionsChanged();
            } else {
                z = true;
                if (i2 == 7) {
                    tL_chatBannedRights.send_videos = !tL_chatBannedRights.send_videos;
                    deleteMessagesBottomSheet.onRestrictionsChanged();
                } else if (i2 == 9) {
                    tL_chatBannedRights.send_audios = !tL_chatBannedRights.send_audios;
                    deleteMessagesBottomSheet.onRestrictionsChanged();
                } else if (i2 == 8) {
                    tL_chatBannedRights.send_docs = !tL_chatBannedRights.send_docs;
                    deleteMessagesBottomSheet.onRestrictionsChanged();
                } else if (i2 == 11) {
                    tL_chatBannedRights.send_roundvideos = !tL_chatBannedRights.send_roundvideos;
                    deleteMessagesBottomSheet.onRestrictionsChanged();
                } else if (i2 == 10) {
                    tL_chatBannedRights.send_voices = !tL_chatBannedRights.send_voices;
                    deleteMessagesBottomSheet.onRestrictionsChanged();
                } else if (i2 == 15) {
                    tL_chatBannedRights.send_reactions = !tL_chatBannedRights.send_reactions;
                    deleteMessagesBottomSheet.onRestrictionsChanged();
                } else {
                    if (i2 == 12) {
                        boolean z5 = !tL_chatBannedRights.send_stickers;
                        tL_chatBannedRights.send_inline = z5;
                        tL_chatBannedRights.send_gifs = z5;
                        tL_chatBannedRights.send_games = z5;
                        tL_chatBannedRights.send_stickers = z5;
                        deleteMessagesBottomSheet.onRestrictionsChanged();
                    } else if (i2 == 14) {
                        if (tL_chatBannedRights.send_plain || deleteMessagesBottomSheet.defaultBannedRights.send_plain) {
                            for (int i6 = 0; i6 < deleteMessagesBottomSheet.adapter.items.size(); i6++) {
                                UItem item2 = deleteMessagesBottomSheet.adapter.getItem(i6);
                                if (item2.viewType == 39 && item2.id == 0) {
                                    RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = deleteMessagesBottomSheet.recyclerListView.findViewHolderForAdapterPosition(i6 + 1);
                                    if (viewHolderFindViewHolderForAdapterPosition == null) {
                                        break;
                                    }
                                    float f3 = -deleteMessagesBottomSheet.shiftDp;
                                    deleteMessagesBottomSheet.shiftDp = f3;
                                    AndroidUtilities.shakeViewSpring(viewHolderFindViewHolderForAdapterPosition.itemView, f3);
                                    break;
                                }
                            }
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            return;
                        }
                        tL_chatBannedRights.embed_links = !tL_chatBannedRights.embed_links;
                        deleteMessagesBottomSheet.onRestrictionsChanged();
                    } else if (i2 == 13) {
                        z = true;
                        tL_chatBannedRights.send_polls = !tL_chatBannedRights.send_polls;
                        deleteMessagesBottomSheet.onRestrictionsChanged();
                    } else {
                        z = true;
                        if (i2 == 101) {
                            deleteMessagesBottomSheet.restrictUserDeleteAllMessages = !deleteMessagesBottomSheet.restrictUserDeleteAllMessages;
                            deleteMessagesBottomSheet.updateTitleAnimated();
                        } else if (i2 == 102) {
                            deleteMessagesBottomSheet.restrictUserDeleteAllReactions = !deleteMessagesBottomSheet.restrictUserDeleteAllReactions;
                            deleteMessagesBottomSheet.updateTitleAnimated();
                        }
                    }
                    z = true;
                }
            }
            deleteMessagesBottomSheet.adapter.update(z);
        }
    }

    @Override
    public void run(long j) {
        switch (this.$r8$classId) {
            case 1:
                DeleteMessagesBottomSheet deleteMessagesBottomSheet = this.f$0;
                deleteMessagesBottomSheet.getClass();
                BaseFragment lastFragment = LaunchActivity.getLastFragment();
                if (lastFragment != null) {
                    lastFragment.presentFragment(ChatActivity.of(j));
                }
                deleteMessagesBottomSheet.lambda$showGiftOfferSheet$15();
                break;
            default:
                DeleteMessagesBottomSheet deleteMessagesBottomSheet2 = this.f$0;
                deleteMessagesBottomSheet2.getClass();
                BaseFragment lastFragment2 = LaunchActivity.getLastFragment();
                if (lastFragment2 != null) {
                    lastFragment2.presentFragment(ChatActivity.of(j));
                }
                deleteMessagesBottomSheet2.lambda$showGiftOfferSheet$15();
                break;
        }
    }
}
