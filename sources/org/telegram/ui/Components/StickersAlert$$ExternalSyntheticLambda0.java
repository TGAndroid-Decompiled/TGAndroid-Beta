package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.StickerSetCell;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.ContactsActivity$$ExternalSyntheticLambda18;
import org.telegram.ui.GroupCallActivity$6$$ExternalSyntheticLambda2;
import org.telegram.ui.GroupCallActivity$6$$ExternalSyntheticLambda3;
import org.telegram.ui.GroupStickersActivity;
import org.telegram.ui.IntroActivity$$ExternalSyntheticLambda6;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PassportActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.WearAuthSheet$$ExternalSyntheticLambda1;

public final class StickersAlert$$ExternalSyntheticLambda0 implements View.OnClickListener {
    public final int $r8$classId;
    public final StickersAlert f$0;

    public StickersAlert$$ExternalSyntheticLambda0(StickersAlert stickersAlert, int i) {
        this.$r8$classId = i;
        this.f$0 = stickersAlert;
    }

    @Override
    public final void onClick(View view) {
        StickersAlert stickersAlert = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                BaseFragment baseFragment = stickersAlert.parentFragment;
                if (baseFragment != null) {
                    new PremiumFeatureBottomSheet(baseFragment, 11, false).show();
                } else if (stickersAlert.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) stickersAlert.getContext()).presentFragment(new PremiumPreviewFragment(0, null));
                }
                break;
            case 1:
                stickersAlert.lambda$init$13();
                break;
            case 2:
                stickersAlert.getClass();
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(stickersAlert.stickerPreviewLayout, (Property<FrameLayout, Float>) View.ALPHA, 0.0f));
                animatorSet.setDuration(200L);
                animatorSet.addListener(new Tooltip.AnonymousClass1(stickersAlert, 8));
                animatorSet.start();
                break;
            case 3:
                if (stickersAlert.importingStickersPaths == null) {
                    stickersAlert.delegate.onStickerSelected(stickersAlert.selectedSticker, null, stickersAlert.stickerSet, null, stickersAlert.clearsInputField, true, 0, 0);
                    stickersAlert.lambda$showGiftOfferSheet$15();
                } else {
                    stickersAlert.removeSticker(stickersAlert.selectedStickerPath);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(stickersAlert.stickerPreviewLayout, (Property<FrameLayout, Float>) View.ALPHA, 0.0f));
                    animatorSet2.setDuration(200L);
                    animatorSet2.addListener(new Tooltip.AnonymousClass1(stickersAlert, 8));
                    animatorSet2.start();
                    stickersAlert.selectedStickerPath = null;
                }
                break;
            case 4:
                stickersAlert.optionsButton.getPopupLayout().getSwipeBack().closeForeground(true);
                break;
            case 5:
                GroupStickersActivity.AnonymousClass4 anonymousClass4 = stickersAlert.customButtonDelegate;
                GroupStickersActivity groupStickersActivity = GroupStickersActivity.this;
                int iFindFirstVisibleItemPosition = groupStickersActivity.layoutManager.findFirstVisibleItemPosition();
                RecyclerListView.Holder holder = (RecyclerListView.Holder) groupStickersActivity.listView.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition);
                int top = holder != null ? holder.itemView.getTop() : Integer.MAX_VALUE;
                int i = groupStickersActivity.selectedStickerSetIndex;
                if (anonymousClass4.val$isSelected) {
                    groupStickersActivity.selectedStickerSet = null;
                    groupStickersActivity.removeStickerSet = true;
                } else {
                    groupStickersActivity.selectedStickerSet = anonymousClass4.val$stickerSet;
                    groupStickersActivity.removeStickerSet = false;
                }
                boolean z = groupStickersActivity.isEmoji;
                if (z) {
                    AndroidUtilities.runOnUIThread(new IntroActivity$$ExternalSyntheticLambda6(anonymousClass4, 7), 350L);
                }
                groupStickersActivity.updateSelectedStickerSetIndex();
                groupStickersActivity.updateCurrentPackVisibility(groupStickersActivity.selectedStickerSet, true);
                if (i != -1) {
                    if (groupStickersActivity.searching) {
                        groupStickersActivity.listAdapter.notifyItemChanged(i);
                    } else {
                        int i2 = 0;
                        while (true) {
                            if (i2 < groupStickersActivity.listView.getChildCount()) {
                                View childAt = groupStickersActivity.listView.getChildAt(i2);
                                if (groupStickersActivity.listView.getChildViewHolder(childAt).getAdapterPosition() == groupStickersActivity.stickersStartRow + i) {
                                    ((StickerSetCell) childAt).setChecked(false, true);
                                } else {
                                    i2++;
                                }
                            } else {
                                groupStickersActivity.listAdapter.notifyItemChanged(i);
                            }
                        }
                    }
                }
                if (groupStickersActivity.selectedStickerSetIndex != -1) {
                    if (groupStickersActivity.searching) {
                        groupStickersActivity.listAdapter.notifyItemChanged(groupStickersActivity.selectedStickerSetIndex);
                    } else {
                        int i3 = 0;
                        while (true) {
                            if (i3 < groupStickersActivity.listView.getChildCount()) {
                                View childAt2 = groupStickersActivity.listView.getChildAt(i3);
                                if (groupStickersActivity.listView.getChildViewHolder(childAt2).getAdapterPosition() == groupStickersActivity.stickersStartRow + groupStickersActivity.selectedStickerSetIndex) {
                                    ((StickerSetCell) childAt2).setChecked(true, true);
                                } else {
                                    i3++;
                                }
                            } else {
                                groupStickersActivity.listAdapter.notifyItemChanged(groupStickersActivity.selectedStickerSetIndex);
                            }
                        }
                    }
                }
                if (top != Integer.MAX_VALUE && !z) {
                    LinearLayoutManager linearLayoutManager = groupStickersActivity.layoutManager;
                    linearLayoutManager.scrollToPositionWithOffset(iFindFirstVisibleItemPosition + 1, top, linearLayoutManager.mShouldReverseLayout);
                }
                if (groupStickersActivity.searching) {
                    groupStickersActivity.searchItem.setSearchFieldText("", false);
                    ((BaseFragment) groupStickersActivity).actionBar.closeSearchField(true);
                }
                stickersAlert.lambda$showGiftOfferSheet$15();
                break;
            case 6:
                stickersAlert.lambda$checkOptions$17();
                break;
            case 7:
                stickersAlert.lambda$checkOptions$19();
                break;
            case 8:
                stickersAlert.optionsButton.closeSubMenu();
                stickersAlert.lambda$showGiftOfferSheet$15();
                AndroidUtilities.runOnUIThread(new StickersAlert$$ExternalSyntheticLambda30(stickersAlert, 3), 200L);
                break;
            case 9:
                stickersAlert.lambda$updateFields$30();
                break;
            case 10:
                if (!stickersAlert.isEditModeEnabled) {
                    stickersAlert.enableEditMode();
                } else {
                    stickersAlert.disableEditMode();
                }
                break;
            case 11:
                stickersAlert.lambda$updateFields$32();
                break;
            case 12:
                stickersAlert.lambda$updateFields$33();
                break;
            case 13:
                StickersAlert stickersAlert2 = this.f$0;
                Context context = stickersAlert2.getContext();
                int[] iArr = {0};
                FrameLayout frameLayout = new FrameLayout(context);
                AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, null);
                String string = LocaleController.getString(R.string.ImportStickersEnterName);
                AlertDialog alertDialog = builder.alertDialog;
                alertDialog.title = string;
                builder.setPositiveButton(LocaleController.getString(R.string.Next), new ContactsActivity$$ExternalSyntheticLambda18(4));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                builder.setView(linearLayout);
                linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, 36, 51, 24, 6, 24, 0));
                TextView textView = new TextView(context);
                TextView textViewM = RichMessageLayout$$ExternalSyntheticOutline0.m(context, 1, 16.0f);
                textViewM.setTextColor(stickersAlert2.getThemedColor(Theme.key_dialogTextHint));
                textViewM.setMaxLines(1);
                textViewM.setLines(1);
                textViewM.setText("t.me/addstickers/");
                textViewM.setInputType(16385);
                textViewM.setGravity(51);
                textViewM.setSingleLine(true);
                textViewM.setVisibility(4);
                textViewM.setImeOptions(6);
                textViewM.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                frameLayout.addView(textViewM, LayoutHelper.createFrame(-2, 36, 51));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                editTextBoldCursor.setBackground(null);
                editTextBoldCursor.setLineColors(Theme.getColor(null, Theme.key_dialogInputField, false), Theme.getColor(null, Theme.key_dialogInputFieldActivated, false), Theme.getColor(null, Theme.key_text_RedBold, false));
                editTextBoldCursor.setTextSize(1, 16.0f);
                editTextBoldCursor.setTextColor(stickersAlert2.getThemedColor(Theme.key_dialogTextBlack));
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(5);
                editTextBoldCursor.setCursorColor(stickersAlert2.getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
                editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                editTextBoldCursor.addTextChangedListener(new PassportActivity.AnonymousClass17(stickersAlert2, iArr, textView, editTextBoldCursor));
                frameLayout.addView(editTextBoldCursor, LayoutHelper.createFrame(-1, 36, 51));
                editTextBoldCursor.setOnEditorActionListener(new GroupCallActivity$6$$ExternalSyntheticLambda3(1, builder));
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new GroupCallActivity$6$$ExternalSyntheticLambda2(1, editTextBoldCursor));
                textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ImportStickersEnterNameInfo)));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
                textView.setTextColor(stickersAlert2.getThemedColor(Theme.key_dialogTextGray2));
                linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2));
                alertDialog.setOnShowListener(new AlertsCreator$$ExternalSyntheticLambda55(3, editTextBoldCursor));
                alertDialog.show();
                editTextBoldCursor.requestFocus();
                alertDialog.getButton(-1).setOnClickListener(new WearAuthSheet$$ExternalSyntheticLambda1(stickersAlert2, iArr, editTextBoldCursor, textView, textViewM, builder));
                break;
            default:
                stickersAlert.lambda$updateFields$35(view);
                break;
        }
    }
}
