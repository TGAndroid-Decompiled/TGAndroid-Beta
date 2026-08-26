package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.fido.zzfz;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.PollCreateCheckCell;
import org.telegram.ui.Cells.PollEditTextCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda17;
import org.telegram.ui.ChatUsersActivity$$ExternalSyntheticLambda13;
import org.telegram.ui.Components.poll.sheets.CountrySelectBottomSheet;
import org.telegram.ui.MessageSeenView;

public final class EmojiPacksAlert$$ExternalSyntheticLambda0 implements RecyclerListView.OnItemClickListener {
    public final int $r8$classId = 1;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Theme.ResourcesProvider f$3;

    public EmojiPacksAlert$$ExternalSyntheticLambda0(ChatAttachAlertPollLayout chatAttachAlertPollLayout, Theme.ResourcesProvider resourcesProvider, ChatAttachAlert chatAttachAlert, Context context) {
        this.f$0 = chatAttachAlertPollLayout;
        this.f$3 = resourcesProvider;
        this.f$1 = chatAttachAlert;
        this.f$2 = context;
    }

    @Override
    public final void onItemClick(int i, View view) {
        boolean z;
        boolean z2;
        switch (this.$r8$classId) {
            case 0:
                ((EmojiPacksAlert) this.f$0).lambda$new$0((ArrayList) this.f$1, (BaseFragment) this.f$2, this.f$3, view, i);
                break;
            default:
                ChatAttachAlertPollLayout chatAttachAlertPollLayout = (ChatAttachAlertPollLayout) this.f$0;
                Theme.ResourcesProvider resourcesProvider = this.f$3;
                ChatAttachAlert chatAttachAlert = (ChatAttachAlert) this.f$1;
                Context context = (Context) this.f$2;
                if (i == chatAttachAlertPollLayout.poll2vLimitByCountryListRow) {
                    CountrySelectBottomSheet countrySelectBottomSheet = new CountrySelectBottomSheet(chatAttachAlertPollLayout.getContext(), resourcesProvider);
                    countrySelectBottomSheet.listener = new ChatActivity.AnonymousClass1(chatAttachAlertPollLayout, 22);
                    ArrayList arrayList = chatAttachAlertPollLayout.countriesList;
                    countrySelectBottomSheet.query = null;
                    countrySelectBottomSheet.countriesToSelect = new HashSet(arrayList);
                    countrySelectBottomSheet.show();
                } else {
                    boolean z3 = false;
                    if (i == chatAttachAlertPollLayout.poll2vLimitDurationTimeRow) {
                        ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(chatAttachAlert.container, resourcesProvider, view);
                        int i2 = 0;
                        while (true) {
                            int[] iArr = chatAttachAlertPollLayout.POLL_DURATION_OPTIONS;
                            if (i2 >= iArr.length) {
                                itemOptionsMakeOptions.add(R.drawable.msg_customize, LocaleController.getString(R.string.PollV2PollDurationOptionCustom), new ChatUsersActivity$$ExternalSyntheticLambda13(chatAttachAlertPollLayout, context, view, resourcesProvider, 7), false);
                                itemOptionsMakeOptions.drawScrim = false;
                                itemOptionsMakeOptions.dimAlpha = 0;
                                itemOptionsMakeOptions.show();
                            } else {
                                int i3 = iArr[i2];
                                TimerDrawable timerDrawable = new TimerDrawable(ApplicationLoader.applicationContext, null);
                                timerDrawable.setTime(i3);
                                timerDrawable.isStaticIcon = true;
                                int i4 = Theme.key_actionBarDefaultSubmenuItemIcon;
                                timerDrawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i4, chatAttachAlertPollLayout.resourcesProvider), PorterDuff.Mode.SRC_IN));
                                itemOptionsMakeOptions.add(0, timerDrawable, LocaleController.formatPluralString("Hours", i3 / 3600, new Object[0]), i4, Theme.key_actionBarDefaultSubmenuItem, new ChatActivity$$ExternalSyntheticLambda17(chatAttachAlertPollLayout, i3, view, 17));
                                i2++;
                            }
                        }
                    } else if (i == chatAttachAlertPollLayout.addAnswerRow) {
                        chatAttachAlertPollLayout.addNewField();
                    } else {
                        boolean z4 = view instanceof TextCheckCell;
                        if (z4 || (view instanceof PollCreateCheckCell)) {
                            boolean z5 = chatAttachAlertPollLayout.quizPoll;
                            ChatAttachAlertPollLayout.AnonymousClass7 anonymousClass7 = chatAttachAlertPollLayout.suggestEmojiPanel;
                            if (anonymousClass7 != null) {
                                anonymousClass7.forceClose();
                            }
                            zzfz[] zzfzVarArr = chatAttachAlertPollLayout.toggleRows;
                            int length = zzfzVarArr.length;
                            int i5 = 0;
                            while (true) {
                                if (i5 < length) {
                                    zzfz zzfzVar = zzfzVarArr[i5];
                                    if (i == zzfzVar.zzb) {
                                        boolean z6 = zzfzVar.zzc;
                                        z2 = !z6;
                                        zzfzVar.zzc = z2;
                                        if (i == chatAttachAlertPollLayout.poll2vLimitByCountryRow.zzb) {
                                            chatAttachAlertPollLayout.listView.setItemAnimator(chatAttachAlertPollLayout.itemAnimator);
                                            zzfz zzfzVar2 = chatAttachAlertPollLayout.poll2vLimitByCountryRow;
                                            int i6 = zzfzVar2.zzb;
                                            if (i6 >= 0) {
                                                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = ((ChatAttachAlertPollLayout) zzfzVar2.zza).listView.findViewHolderForAdapterPosition(i6);
                                                if (viewHolderFindViewHolderForAdapterPosition != null) {
                                                    View view2 = viewHolderFindViewHolderForAdapterPosition.itemView;
                                                    if (view2 instanceof PollCreateCheckCell) {
                                                        ((PollCreateCheckCell) view2).setDivider(z2);
                                                    } else {
                                                        ((ChatAttachAlertPollLayout) zzfzVar2.zza).listAdapter.notifyItemChanged(zzfzVar2.zzb);
                                                    }
                                                } else {
                                                    ((ChatAttachAlertPollLayout) zzfzVar2.zza).listAdapter.notifyItemChanged(zzfzVar2.zzb);
                                                }
                                            }
                                            if (z6) {
                                                zzfz zzfzVar3 = chatAttachAlertPollLayout.poll2vLimitByCountryRow;
                                                ((ChatAttachAlertPollLayout) zzfzVar3.zza).listAdapter.mObservable.notifyItemRangeRemoved(zzfzVar3.zzb + 1, 1);
                                            } else {
                                                zzfz zzfzVar4 = chatAttachAlertPollLayout.poll2vLimitByCountryRow;
                                                ((ChatAttachAlertPollLayout) zzfzVar4.zza).listAdapter.mObservable.notifyItemRangeInserted(zzfzVar4.zzb + 1, 1);
                                            }
                                            chatAttachAlertPollLayout.updateRows$5();
                                        }
                                        z = true;
                                    } else {
                                        i5++;
                                    }
                                } else {
                                    z = false;
                                    z2 = false;
                                }
                            }
                            if (z) {
                                z3 = z2;
                            } else if (i == chatAttachAlertPollLayout.poll2vAnonymousRow) {
                                z3 = chatAttachAlertPollLayout.anonymousPoll;
                                chatAttachAlertPollLayout.anonymousPoll = !z3;
                                chatAttachAlertPollLayout.checkAllowAddingOptionsRow();
                            } else {
                                int i7 = chatAttachAlertPollLayout.allowAddingRow;
                                if (i == i7) {
                                    z3 = !chatAttachAlertPollLayout.allowAdding;
                                    chatAttachAlertPollLayout.allowAdding = z3;
                                } else if (i == chatAttachAlertPollLayout.poll2vAllowAddingRow) {
                                    if (!chatAttachAlertPollLayout.quizPoll && !chatAttachAlertPollLayout.anonymousPoll) {
                                        chatAttachAlertPollLayout.allowAddingOptions = !chatAttachAlertPollLayout.allowAddingOptions;
                                    }
                                    z3 = chatAttachAlertPollLayout.allowAddingOptions;
                                } else if (i == chatAttachAlertPollLayout.poll2vShuffleRow) {
                                    z3 = !chatAttachAlertPollLayout.shuffleOptions;
                                    chatAttachAlertPollLayout.shuffleOptions = z3;
                                } else if (i == chatAttachAlertPollLayout.poll2vLimitDurationRow) {
                                    if (chatAttachAlertPollLayout.pollLimitDuration == 0 && chatAttachAlertPollLayout.pollLimitDeadline == 0) {
                                        chatAttachAlertPollLayout.pollLimitDuration = 86400;
                                        chatAttachAlertPollLayout.pollLimitDeadline = 0;
                                        int i8 = chatAttachAlertPollLayout.poll2vLimitDurationTimeRow;
                                        chatAttachAlertPollLayout.updateRows$5();
                                        if (i8 < 0) {
                                            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition2 = chatAttachAlertPollLayout.listView.findViewHolderForAdapterPosition(chatAttachAlertPollLayout.poll2vLimitDurationRow);
                                            if (viewHolderFindViewHolderForAdapterPosition2 != null) {
                                                View view3 = viewHolderFindViewHolderForAdapterPosition2.itemView;
                                                if (view3 instanceof PollCreateCheckCell) {
                                                    ((PollCreateCheckCell) view3).setDivider(true);
                                                }
                                            }
                                            chatAttachAlertPollLayout.listView.setItemAnimator(chatAttachAlertPollLayout.itemAnimator);
                                            chatAttachAlertPollLayout.listAdapter.mObservable.notifyItemRangeInserted(chatAttachAlertPollLayout.poll2vLimitDurationTimeRow, 3);
                                        }
                                    } else {
                                        chatAttachAlertPollLayout.pollLimitDuration = 0;
                                        chatAttachAlertPollLayout.pollLimitDeadline = 0;
                                        int i9 = chatAttachAlertPollLayout.poll2vLimitDurationTimeRow;
                                        chatAttachAlertPollLayout.updateRows$5();
                                        chatAttachAlertPollLayout.listView.setItemAnimator(chatAttachAlertPollLayout.itemAnimator);
                                        chatAttachAlertPollLayout.listAdapter.mObservable.notifyItemRangeRemoved(i9, 3);
                                        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition3 = chatAttachAlertPollLayout.listView.findViewHolderForAdapterPosition(chatAttachAlertPollLayout.poll2vLimitDurationRow);
                                        if (viewHolderFindViewHolderForAdapterPosition3 != null) {
                                            View view4 = viewHolderFindViewHolderForAdapterPosition3.itemView;
                                            if (view4 instanceof PollCreateCheckCell) {
                                                ((PollCreateCheckCell) view4).setDivider(false);
                                            }
                                        }
                                    }
                                    if (chatAttachAlertPollLayout.pollLimitDuration != 0 || chatAttachAlertPollLayout.pollLimitDeadline != 0) {
                                        z3 = true;
                                    }
                                } else if (i == chatAttachAlertPollLayout.poll2vAllowRevotingRow) {
                                    z3 = !chatAttachAlertPollLayout.allowRevoting;
                                    chatAttachAlertPollLayout.allowRevoting = z3;
                                } else if (i == chatAttachAlertPollLayout.allowMarkingRow) {
                                    z3 = !chatAttachAlertPollLayout.allowMarking;
                                    chatAttachAlertPollLayout.allowMarking = z3;
                                    chatAttachAlertPollLayout.updateRows$5();
                                    int i10 = chatAttachAlertPollLayout.allowAddingRow;
                                    if (i10 >= 0 && i7 < 0) {
                                        chatAttachAlertPollLayout.listView.setItemAnimator(chatAttachAlertPollLayout.itemAnimator);
                                        chatAttachAlertPollLayout.listAdapter.mObservable.notifyItemRangeInserted(chatAttachAlertPollLayout.allowAddingRow, 1);
                                    } else if (i7 >= 0 && i10 < 0) {
                                        chatAttachAlertPollLayout.listView.setItemAnimator(chatAttachAlertPollLayout.itemAnimator);
                                        chatAttachAlertPollLayout.listAdapter.mObservable.notifyItemRangeRemoved(i7, 1);
                                    }
                                } else {
                                    if (i == chatAttachAlertPollLayout.poll2vMultipleRow) {
                                        boolean z7 = chatAttachAlertPollLayout.multipleChoise;
                                        z2 = !z7;
                                        chatAttachAlertPollLayout.multipleChoise = z2;
                                        if (z7 && chatAttachAlertPollLayout.quizPoll) {
                                            int i11 = 0;
                                            boolean z8 = false;
                                            while (true) {
                                                boolean[] zArr = chatAttachAlertPollLayout.answersChecks;
                                                if (i11 < zArr.length) {
                                                    if (z8) {
                                                        zArr[i11] = false;
                                                    } else if (zArr[i11]) {
                                                        z8 = true;
                                                    }
                                                    i11++;
                                                }
                                            }
                                        }
                                        int childCount = chatAttachAlertPollLayout.listView.getChildCount();
                                        for (int i12 = 0; i12 < childCount; i12++) {
                                            MessageSeenView.AnonymousClass1 anonymousClass1 = chatAttachAlertPollLayout.listView;
                                            RecyclerView.ViewHolder childViewHolder = anonymousClass1.getChildViewHolder(anonymousClass1.getChildAt(i12));
                                            if (childViewHolder.mItemViewType == 5) {
                                                ((PollEditTextCell) childViewHolder.itemView).animatorCheckboxMultiselect.setValue(chatAttachAlertPollLayout.multipleChoise, true);
                                            }
                                        }
                                    } else if (i == chatAttachAlertPollLayout.poll2vLimitDurationHideResultsRow) {
                                        z3 = !chatAttachAlertPollLayout.hideResults;
                                        chatAttachAlertPollLayout.hideResults = z3;
                                    } else if (i == chatAttachAlertPollLayout.poll2vQuizRow) {
                                        if (!chatAttachAlertPollLayout.quizOnly) {
                                            chatAttachAlertPollLayout.listView.setItemAnimator(chatAttachAlertPollLayout.itemAnimator);
                                            boolean z9 = !chatAttachAlertPollLayout.quizPoll;
                                            chatAttachAlertPollLayout.quizPoll = z9;
                                            int i13 = chatAttachAlertPollLayout.solutionRowHeader;
                                            chatAttachAlertPollLayout.updateRows$5();
                                            if (chatAttachAlertPollLayout.quizPoll) {
                                                chatAttachAlertPollLayout.listAdapter.mObservable.notifyItemRangeInserted(chatAttachAlertPollLayout.solutionRowHeader, 3);
                                            } else {
                                                chatAttachAlertPollLayout.listAdapter.mObservable.notifyItemRangeRemoved(i13, 3);
                                            }
                                            chatAttachAlertPollLayout.listAdapter.notifyItemChanged(chatAttachAlertPollLayout.emptyRow);
                                            if (chatAttachAlertPollLayout.quizPoll) {
                                                chatAttachAlertPollLayout.allowRevoting = false;
                                                int i14 = chatAttachAlertPollLayout.poll2vAllowRevotingRow;
                                                if (i14 >= 0) {
                                                    RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition4 = chatAttachAlertPollLayout.listView.findViewHolderForAdapterPosition(i14);
                                                    if (viewHolderFindViewHolderForAdapterPosition4 != null) {
                                                        ((PollCreateCheckCell) viewHolderFindViewHolderForAdapterPosition4.itemView).setChecked(false);
                                                    } else {
                                                        chatAttachAlertPollLayout.listAdapter.notifyItemChanged(chatAttachAlertPollLayout.poll2vAllowRevotingRow);
                                                    }
                                                }
                                            } else {
                                                int i15 = chatAttachAlertPollLayout.poll2vAllowRevotingRow;
                                                if (i15 >= 0 && chatAttachAlertPollLayout.listView.findViewHolderForAdapterPosition(i15) == null) {
                                                    chatAttachAlertPollLayout.listAdapter.notifyItemChanged(chatAttachAlertPollLayout.poll2vAllowRevotingRow);
                                                }
                                            }
                                            chatAttachAlertPollLayout.checkAllowAddingOptionsRow();
                                            if (chatAttachAlertPollLayout.quizPoll && !chatAttachAlertPollLayout.multipleChoise) {
                                                int i16 = 0;
                                                boolean z10 = false;
                                                while (true) {
                                                    boolean[] zArr2 = chatAttachAlertPollLayout.answersChecks;
                                                    if (i16 < zArr2.length) {
                                                        if (z10) {
                                                            zArr2[i16] = false;
                                                        } else if (zArr2[i16]) {
                                                            z10 = true;
                                                        }
                                                        i16++;
                                                    }
                                                }
                                            }
                                            z3 = z9;
                                        }
                                    }
                                    z3 = z2;
                                }
                            }
                            if (chatAttachAlertPollLayout.hintShowed && !chatAttachAlertPollLayout.quizPoll) {
                                chatAttachAlertPollLayout.hintView.hide(true);
                            }
                            chatAttachAlertPollLayout.listView.getChildCount();
                            for (int i17 = chatAttachAlertPollLayout.answerStartRow; i17 < chatAttachAlertPollLayout.answerStartRow + chatAttachAlertPollLayout.answersCount; i17++) {
                                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition5 = chatAttachAlertPollLayout.listView.findViewHolderForAdapterPosition(i17);
                                if (viewHolderFindViewHolderForAdapterPosition5 != null) {
                                    View view5 = viewHolderFindViewHolderForAdapterPosition5.itemView;
                                    if (view5 instanceof PollEditTextCell) {
                                        PollEditTextCell pollEditTextCell = (PollEditTextCell) view5;
                                        pollEditTextCell.setShowCheckBox(chatAttachAlertPollLayout.quizPoll, true);
                                        pollEditTextCell.checkBox.checkBoxBase.setChecked(-1, chatAttachAlertPollLayout.answersChecks[i17 - chatAttachAlertPollLayout.answerStartRow], z5);
                                        if (pollEditTextCell.getTop() > AndroidUtilities.dp(40.0f) && i == chatAttachAlertPollLayout.poll2vQuizRow && !chatAttachAlertPollLayout.hintShowed) {
                                            chatAttachAlertPollLayout.hintView.setText(LocaleController.getString(R.string.PollTapToSelect));
                                            chatAttachAlertPollLayout.hintView.showForView(pollEditTextCell.getCheckBox(), true);
                                            chatAttachAlertPollLayout.hintShowed = true;
                                        }
                                    }
                                }
                            }
                            if (z4) {
                                ((TextCheckCell) view).setChecked(z3);
                            } else if (view instanceof PollCreateCheckCell) {
                                ((PollCreateCheckCell) view).setChecked(z3);
                            }
                            chatAttachAlertPollLayout.checkDoneButton$1();
                        }
                    }
                }
                break;
        }
    }

    public EmojiPacksAlert$$ExternalSyntheticLambda0(EmojiPacksAlert emojiPacksAlert, ArrayList arrayList, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider) {
        this.f$0 = emojiPacksAlert;
        this.f$1 = arrayList;
        this.f$2 = baseFragment;
        this.f$3 = resourcesProvider;
    }
}
