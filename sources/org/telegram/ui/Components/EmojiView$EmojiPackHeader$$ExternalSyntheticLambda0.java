package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.Premium.PremiumButtonView;
import org.telegram.ui.Gifts.SendGiftSheet;

public final class EmojiView$EmojiPackHeader$$ExternalSyntheticLambda0 implements View.OnClickListener {
    public final int $r8$classId;
    public final EmojiView.EmojiPackHeader f$0;

    public EmojiView$EmojiPackHeader$$ExternalSyntheticLambda0(EmojiView.EmojiPackHeader emojiPackHeader, int i) {
        this.$r8$classId = i;
        this.f$0 = emojiPackHeader;
    }

    @Override
    public final void onClick(View view) {
        final TLRPC.StickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        EmojiView.EmojiGridAdapter emojiGridAdapter;
        Integer numValueOf;
        View childAt;
        int childAdapterPosition;
        int i;
        TLRPC.StickerSet stickerSet3;
        switch (this.$r8$classId) {
            case 0:
                EmojiView.EmojiPackHeader emojiPackHeader = this.f$0;
                EmojiView.EmojiPack emojiPack = emojiPackHeader.pack;
                if (emojiPack != null && (stickerSet = emojiPack.set) != null) {
                    final EmojiView emojiView = EmojiView.this;
                    if (!emojiView.emojiPackAlertOpened) {
                        emojiView.emojiPackAlertOpened = true;
                        ArrayList arrayList = new ArrayList(1);
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.id = stickerSet.id;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        arrayList.add(tL_inputStickerSetID);
                        new EmojiPacksAlert(emojiView.fragment, emojiView.getContext(), emojiView.resourcesProvider, arrayList) {
                            public final TLRPC.StickerSet val$set;

                            public AnonymousClass30(BaseFragment baseFragment, Context context, Theme.ResourcesProvider resourcesProvider, ArrayList arrayList2) {
                                super(baseFragment, context, resourcesProvider, arrayList2);
                                stickerSet = stickerSet;
                            }

                            @Override
                            public final void lambda$showGiftOfferSheet$15() {
                                EmojiView.this.emojiPackAlertOpened = false;
                                super.lambda$showGiftOfferSheet$15();
                            }

                            @Override
                            public final void onButtonClicked(boolean z) {
                                EmojiView emojiView2 = EmojiView.this;
                                TLRPC.StickerSet stickerSet4 = stickerSet;
                                ArrayList arrayList2 = emojiView2.installedEmojiSets;
                                if (!z) {
                                    arrayList2.remove(Long.valueOf(stickerSet4.id));
                                } else if (!arrayList2.contains(Long.valueOf(stickerSet4.id))) {
                                    arrayList2.add(Long.valueOf(stickerSet4.id));
                                }
                                AnonymousClass5 anonymousClass5 = emojiView2.emojiGridView;
                                if (anonymousClass5 == null) {
                                    return;
                                }
                                for (int i2 = 0; i2 < anonymousClass5.getChildCount(); i2++) {
                                    View childAt2 = anonymousClass5.getChildAt(i2);
                                    if (childAt2 instanceof EmojiPackHeader) {
                                        ((EmojiPackHeader) childAt2).updateState$1(true);
                                    }
                                }
                            }
                        }.show();
                        break;
                    }
                }
                break;
            case 1:
                EmojiView.EmojiPackHeader emojiPackHeader2 = this.f$0;
                TextView textView = emojiPackHeader2.addButtonView;
                if (textView == null || textView.getVisibility() != 0 || !textView.isEnabled()) {
                    TextView textView2 = emojiPackHeader2.removeButtonView;
                    if (textView2 != null && textView2.getVisibility() == 0 && textView2.isEnabled()) {
                        textView2.performClick();
                        break;
                    } else {
                        PremiumButtonView premiumButtonView = emojiPackHeader2.premiumButtonView;
                        if (premiumButtonView != null && premiumButtonView.getVisibility() == 0 && premiumButtonView.buttonLayout.isEnabled()) {
                            premiumButtonView.performClick();
                            break;
                        }
                    }
                } else {
                    textView.performClick();
                    break;
                }
                break;
            case 2:
                EmojiView.EmojiPackHeader emojiPackHeader3 = this.f$0;
                EmojiView.EmojiPack emojiPack2 = emojiPackHeader3.pack;
                if (emojiPack2 != null && (stickerSet2 = emojiPack2.set) != null) {
                    emojiPack2.installed = true;
                    EmojiView emojiView2 = EmojiView.this;
                    ArrayList arrayList2 = emojiView2.installedEmojiSets;
                    if (!arrayList2.contains(Long.valueOf(stickerSet2.id))) {
                        arrayList2.add(Long.valueOf(emojiPackHeader3.pack.set.id));
                    }
                    emojiPackHeader3.updateState$1(true);
                    int i2 = 0;
                    while (true) {
                        EmojiView.AnonymousClass5 anonymousClass5 = emojiView2.emojiGridView;
                        int childCount = anonymousClass5.getChildCount();
                        emojiGridAdapter = emojiView2.emojiAdapter;
                        if (i2 < childCount) {
                            if ((anonymousClass5.getChildAt(i2) instanceof EmojiView.EmojiPackExpand) && (childAdapterPosition = RecyclerView.getChildAdapterPosition((childAt = anonymousClass5.getChildAt(i2)))) >= 0 && (i = emojiGridAdapter.positionToExpand.get(childAdapterPosition)) >= 0) {
                                ArrayList arrayList3 = emojiView2.emojipacksProcessed;
                                if (i < arrayList3.size() && arrayList3.get(i) != null && emojiPackHeader3.pack != null && ((EmojiView.EmojiPack) arrayList3.get(i)).set.id == emojiPackHeader3.pack.set.id) {
                                    numValueOf = Integer.valueOf(childAdapterPosition);
                                }
                            }
                            i2++;
                        } else {
                            numValueOf = null;
                            childAt = null;
                        }
                    }
                    if (numValueOf != null) {
                        emojiGridAdapter.expand(numValueOf.intValue(), childAt);
                    }
                    if (emojiPackHeader3.toInstall == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet4 = emojiPackHeader3.pack.set;
                        tL_inputStickerSetID2.id = stickerSet4.id;
                        tL_inputStickerSetID2.access_hash = stickerSet4.access_hash;
                        int i3 = emojiView2.currentAccount;
                        TLRPC.TL_messages_stickerSet stickerSet5 = MediaDataController.getInstance(i3).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID2, true);
                        if (stickerSet5 == null || stickerSet5.set == null) {
                            NotificationCenter.getInstance(i3).addObserver(emojiPackHeader3, NotificationCenter.groupStickersDidLoad);
                            MediaDataController mediaDataController = MediaDataController.getInstance(i3);
                            emojiPackHeader3.toInstall = tL_inputStickerSetID2;
                            mediaDataController.getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID2, false);
                        } else {
                            BaseFragment anonymousClass8 = emojiView2.fragment;
                            if (anonymousClass8 == null) {
                                anonymousClass8 = new SendGiftSheet.AnonymousClass8(emojiPackHeader3, 3);
                            }
                            EmojiPacksAlert.installSet(anonymousClass8, stickerSet5, true, null, new HintView$1$$ExternalSyntheticLambda0(emojiPackHeader3, 6));
                        }
                        break;
                    }
                }
                break;
            case 3:
                EmojiView.EmojiPackHeader emojiPackHeader4 = this.f$0;
                EmojiView.EmojiPack emojiPack3 = emojiPackHeader4.pack;
                if (emojiPack3 != null && (stickerSet3 = emojiPack3.set) != null) {
                    emojiPack3.installed = false;
                    EmojiView emojiView3 = EmojiView.this;
                    emojiView3.installedEmojiSets.remove(Long.valueOf(stickerSet3.id));
                    emojiPackHeader4.updateState$1(true);
                    EmojiView.AnonymousClass10 anonymousClass10 = emojiView3.emojiTabs;
                    if (anonymousClass10 != null) {
                        anonymousClass10.updateEmojiPacks(emojiView3.getEmojipacks());
                    }
                    emojiView3.updateEmojiTabsPosition(emojiView3.emojiLayoutManager.findFirstCompletelyVisibleItemPosition());
                    if (emojiPackHeader4.toUninstall == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet6 = emojiPackHeader4.pack.set;
                        tL_inputStickerSetID3.id = stickerSet6.id;
                        tL_inputStickerSetID3.access_hash = stickerSet6.access_hash;
                        int i4 = emojiView3.currentAccount;
                        TLRPC.TL_messages_stickerSet stickerSet7 = MediaDataController.getInstance(i4).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID3, true);
                        if (stickerSet7 == null || stickerSet7.set == null) {
                            NotificationCenter.getInstance(i4).addObserver(emojiPackHeader4, NotificationCenter.groupStickersDidLoad);
                            MediaDataController mediaDataController2 = MediaDataController.getInstance(i4);
                            emojiPackHeader4.toUninstall = tL_inputStickerSetID3;
                            mediaDataController2.getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID3, false);
                        } else {
                            emojiPackHeader4.uninstall(stickerSet7);
                        }
                        break;
                    }
                }
                break;
            case 4:
                EmojiView.EmojiViewDelegate emojiViewDelegate = EmojiView.this.delegate;
                if (emojiViewDelegate != null) {
                    emojiViewDelegate.onAnimatedEmojiUnlockClick();
                }
                break;
            case 5:
                EmojiView.EmojiViewDelegate emojiViewDelegate2 = EmojiView.this.delegate;
                if (emojiViewDelegate2 != null) {
                    emojiViewDelegate2.onAnimatedEmojiUnlockClick();
                }
                break;
            default:
                EmojiView.EmojiViewDelegate emojiViewDelegate3 = EmojiView.this.delegate;
                if (emojiViewDelegate3 != null) {
                    emojiViewDelegate3.onAnimatedEmojiUnlockClick();
                }
                break;
        }
    }
}
