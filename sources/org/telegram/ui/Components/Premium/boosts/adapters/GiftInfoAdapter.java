package org.telegram.ui.Components.Premium.boosts.adapters;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.Premium.boosts.BoostDialogs;
import org.telegram.ui.Components.Premium.boosts.BoostRepository;
import org.telegram.ui.Components.Premium.boosts.cells.ActionBtnCell;
import org.telegram.ui.Components.Premium.boosts.cells.HeaderCell;
import org.telegram.ui.Components.Premium.boosts.cells.LinkCell;
import org.telegram.ui.Components.Premium.boosts.cells.TableCell;
import org.telegram.ui.Components.Premium.boosts.cells.TextInfoCell;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.TopicsFragment;

public abstract class GiftInfoAdapter extends RecyclerListView.SelectionAdapter {
    private BaseFragment baseFragment;
    private FrameLayout container;
    private TLRPC.TL_payments_checkedGiftCode giftCode;
    private boolean isUnused;
    private final Theme.ResourcesProvider resourcesProvider;
    private String slug;

    protected abstract void afterCodeApplied();

    public abstract void dismiss();

    @Override
    public int getItemCount() {
        return 5;
    }

    @Override
    public int getItemViewType(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        return 5;
                    }
                }
            }
        }
        return i2;
    }

    @Override
    public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
        return false;
    }

    protected abstract void onHiddenLinkClicked();

    protected abstract void onObjectClicked(TLObject tLObject);

    public GiftInfoAdapter(Theme.ResourcesProvider resourcesProvider) {
        this.resourcesProvider = resourcesProvider;
    }

    public void init(BaseFragment baseFragment, TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode, String str, FrameLayout frameLayout) {
        this.isUnused = tL_payments_checkedGiftCode.used_date == 0;
        this.baseFragment = baseFragment;
        this.giftCode = tL_payments_checkedGiftCode;
        this.slug = str;
        this.container = frameLayout;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View linkCell;
        Context context = viewGroup.getContext();
        if (i == 1) {
            linkCell = new LinkCell(context, this.baseFragment, this.resourcesProvider);
        } else if (i == 2) {
            linkCell = new TableCell(context, this.resourcesProvider);
        } else if (i == 3) {
            linkCell = new TextInfoCell(context, this.resourcesProvider);
        } else if (i == 4) {
            linkCell = new ActionBtnCell(context, this.resourcesProvider);
            linkCell.setPadding(0, 0, 0, AndroidUtilities.dp(14.0f));
        } else if (i != 5) {
            linkCell = new HeaderCell(context, this.resourcesProvider);
        } else {
            linkCell = new View(context);
        }
        linkCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        return new RecyclerListView.Holder(linkCell);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        String string;
        int itemViewType = viewHolder.getItemViewType();
        if (itemViewType == 0) {
            HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
            if (this.isUnused) {
                headerCell.setGiftLinkText();
            } else {
                headerCell.setUsedGiftLinkText();
            }
            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = this.giftCode;
            if (tL_payments_checkedGiftCode.boost != null) {
                headerCell.setGiftLinkToUserText(tL_payments_checkedGiftCode.to_id, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        this.f$0.onObjectClicked((TLObject) obj);
                    }
                });
            }
            if (this.giftCode.to_id == -1) {
                headerCell.setUnclaimedText();
                return;
            }
            return;
        }
        if (itemViewType == 1) {
            LinkCell linkCell = (LinkCell) viewHolder.itemView;
            linkCell.setSlug(this.slug);
            if (this.giftCode.boost != null && this.slug == null) {
                linkCell.hideSlug(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.onHiddenLinkClicked();
                    }
                });
            }
            String str = this.slug;
            if ((str == null || str.isEmpty()) && this.giftCode.to_id == -1) {
                linkCell.hideSlug(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.onHiddenLinkClicked();
                    }
                });
                return;
            }
            return;
        }
        if (itemViewType == 2) {
            ((TableCell) viewHolder.itemView).setData(this.giftCode, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    this.f$0.onObjectClicked((TLObject) obj);
                }
            });
            return;
        }
        if (itemViewType != 3) {
            if (itemViewType != 4) {
                return;
            }
            final ActionBtnCell actionBtnCell = (ActionBtnCell) viewHolder.itemView;
            actionBtnCell.setOkStyle(this.isUnused);
            actionBtnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    GiftInfoAdapter.$r8$lambda$h0vGbgoMo7ZLA76X70xFF3x1IIU(this.f$0, actionBtnCell, view);
                }
            });
            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode2 = this.giftCode;
            if (tL_payments_checkedGiftCode2.boost != null || tL_payments_checkedGiftCode2.flags == -1) {
                actionBtnCell.setCloseStyle();
                actionBtnCell.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        this.f$0.dismiss();
                    }
                });
                return;
            }
            return;
        }
        TextInfoCell textInfoCell = (TextInfoCell) viewHolder.itemView;
        textInfoCell.setTextGravity(17);
        textInfoCell.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
        textInfoCell.setTopPadding(14);
        textInfoCell.setBottomPadding(15);
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode3 = this.giftCode;
        if (tL_payments_checkedGiftCode3.boost != null) {
            String str2 = this.slug;
            if (str2 == null || str2.isEmpty()) {
                textInfoCell.setText(LocaleController.getString(R.string.BoostingLinkNotActivated));
                return;
            } else {
                textInfoCell.setFixedSize(14);
                textInfoCell.setText(null);
                return;
            }
        }
        if (this.isUnused) {
            if (tL_payments_checkedGiftCode3.to_id == -1) {
                string = LocaleController.getString(R.string.BoostingSendLinkToAnyone);
            } else {
                string = LocaleController.getString(R.string.BoostingSendLinkToFriends);
            }
            textInfoCell.setText(AndroidUtilities.replaceSingleTag(string, Theme.key_chat_messageLinkIn, 0, new GiftInfoAdapter$$ExternalSyntheticLambda2(this), this.resourcesProvider));
            return;
        }
        Date date = new Date(((long) this.giftCode.used_date) * 1000);
        textInfoCell.setText(LocaleController.formatString("BoostingUsedLinkDate", R.string.BoostingUsedLinkDate, LocaleController.formatString("formatDateAtTime", R.string.formatDateAtTime, LocaleController.getInstance().getFormatterYear().format(date), LocaleController.getInstance().getFormatterDay().format(date))));
    }

    public static void $r8$lambda$h0vGbgoMo7ZLA76X70xFF3x1IIU(final GiftInfoAdapter giftInfoAdapter, final ActionBtnCell actionBtnCell, View view) {
        if (giftInfoAdapter.isUnused) {
            if (actionBtnCell.isLoading()) {
                return;
            }
            actionBtnCell.updateLoading(true);
            BoostRepository.applyGiftCode(giftInfoAdapter.slug, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    GiftInfoAdapter.$r8$lambda$fjrnpH7dJv9ZfyEvZe8WUJIaqVE(this.f$0, actionBtnCell, (Void) obj);
                }
            }, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    GiftInfoAdapter.$r8$lambda$4ObwOuFEVWilRpdMhPy_pSxyTR8(this.f$0, actionBtnCell, (TLRPC.TL_error) obj);
                }
            });
            return;
        }
        giftInfoAdapter.dismiss();
    }

    public static void $r8$lambda$fjrnpH7dJv9ZfyEvZe8WUJIaqVE(GiftInfoAdapter giftInfoAdapter, ActionBtnCell actionBtnCell, Void r2) {
        giftInfoAdapter.getClass();
        actionBtnCell.updateLoading(false);
        giftInfoAdapter.afterCodeApplied();
        giftInfoAdapter.dismiss();
    }

    public static void $r8$lambda$4ObwOuFEVWilRpdMhPy_pSxyTR8(GiftInfoAdapter giftInfoAdapter, ActionBtnCell actionBtnCell, TLRPC.TL_error tL_error) {
        giftInfoAdapter.getClass();
        actionBtnCell.updateLoading(false);
        BoostDialogs.processApplyGiftCodeError(tL_error, giftInfoAdapter.container, giftInfoAdapter.resourcesProvider, new GiftInfoAdapter$$ExternalSyntheticLambda2(giftInfoAdapter));
    }

    public void share() {
        final String str = "https://t.me/giftcode/" + this.slug;
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putInt("dialogsType", 3);
        DialogsActivity dialogsActivity = new DialogsActivity(bundle);
        dialogsActivity.setDelegate(new DialogsActivity.DialogsActivityDelegate() {
            @Override
            public boolean canSelectStories() {
                return DialogsActivity.DialogsActivityDelegate.CC.$default$canSelectStories(this);
            }

            @Override
            public final boolean didSelectDialogs(DialogsActivity dialogsActivity2, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
                return GiftInfoAdapter.$r8$lambda$fvJJIO_FvgA9NTYBbnGh8dHiyx4(this.f$0, str, dialogsActivity2, arrayList, charSequence, z, z2, i, i2, topicsFragment);
            }

            @Override
            public boolean didSelectStories(DialogsActivity dialogsActivity2) {
                return DialogsActivity.DialogsActivityDelegate.CC.$default$didSelectStories(this, dialogsActivity2);
            }
        });
        this.baseFragment.presentFragment(dialogsActivity);
        dismiss();
    }

    public static boolean $r8$lambda$fvJJIO_FvgA9NTYBbnGh8dHiyx4(GiftInfoAdapter giftInfoAdapter, String str, DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
        giftInfoAdapter.getClass();
        long j = 0;
        int i3 = 0;
        while (i3 < arrayList.size()) {
            long j2 = ((MessagesStorage.TopicKey) arrayList.get(i3)).dialogId;
            giftInfoAdapter.baseFragment.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str, j2, null, null, null, true, null, null, null, true, 0, 0, null, false));
            i3++;
            j = j2;
        }
        dialogsActivity.finishFragment();
        BoostDialogs.showGiftLinkForwardedBulletin(j);
        return true;
    }
}
