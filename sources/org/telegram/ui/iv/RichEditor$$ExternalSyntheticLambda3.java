package org.telegram.ui.iv;

import android.text.SpannableString;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.ChatActivityEnterViewAnimatedIconView;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.TrendingStickersLayout;
import org.telegram.ui.MessageSendPreview;
import org.telegram.ui.StickersActivity;

public final class RichEditor$$ExternalSyntheticLambda3 implements View.OnClickListener {
    public final int $r8$classId;
    public final RichEditor f$0;

    public RichEditor$$ExternalSyntheticLambda3(RichEditor richEditor, int i) {
        this.$r8$classId = i;
        this.f$0 = richEditor;
    }

    @Override
    public final void onClick(View view) {
        ChatActivity chatActivity;
        int i;
        int i2;
        boolean zCanIndentTarget;
        int iIndexOf;
        int i3;
        BlockRow blockRowRowForCell;
        int iIndexOf2;
        RichEditorListView.AnonymousClass1 anonymousClass1;
        int i4;
        RichTableCellHost richTableCellHostFindHostContaining;
        ChatActivity chatActivity2;
        switch (this.$r8$classId) {
            case 0:
                RichEditor richEditor = this.f$0;
                ItemOptions itemOptions = richEditor.currentMenuVisible;
                TL_iv.pageBlockMath pageblockmath = null;
                if (itemOptions != null) {
                    itemOptions.dismiss();
                    richEditor.currentMenuVisible = null;
                }
                BlockRow blockRowFindFocusedRow = richEditor.listView.findFocusedRow();
                if (blockRowFindFocusedRow != null) {
                    TL_iv.PageBlock pageBlock = blockRowFindFocusedRow.block;
                    if (pageBlock instanceof TL_iv.pageBlockMath) {
                        pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                    }
                }
                ChatAttachAlertRichLayout.showEditLatexSheet(richEditor.getContext(), (pageblockmath == null || TextUtils.isEmpty(pageblockmath.source)) ? "" : pageblockmath.source, new RichEditor$$ExternalSyntheticLambda51(0, richEditor, pageblockmath), richEditor.getResourceProvider());
                break;
            case 1:
                this.f$0.onAiStyleSelection();
                break;
            case 2:
                final RichEditor richEditor2 = this.f$0;
                if (richEditor2.isSendLocked$1()) {
                    richEditor2.showConversionSheet$1();
                } else if (richEditor2.editingMessageObject == null && (chatActivity = richEditor2.chatActivity) != null && chatActivity.isInScheduleMode()) {
                    AlertsCreator.createScheduleDatePickerDialog(richEditor2.getParentActivity(), richEditor2.chatActivity.getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() {
                        public AnonymousClass13() {
                        }

                        @Override
                        public final void didSelectDate(boolean z, int i5, int i6) {
                            RichEditor.this.sendMessage(i5, i6, z);
                        }
                    }, richEditor2.getResourceProvider());
                } else {
                    richEditor2.sendMessage(0, 0, true);
                }
                break;
            case 3:
                RichEditor richEditor3 = this.f$0;
                if (!richEditor3.listView.deselectIfAny()) {
                    richEditor3.finishFragment();
                }
                break;
            case 4:
                RichEditorHistory richEditorHistory = this.f$0.listView.history;
                if (richEditorHistory != null) {
                    richEditorHistory.undo();
                }
                break;
            case 5:
                RichEditorHistory richEditorHistory2 = this.f$0.listView.history;
                if (richEditorHistory2 != null) {
                    richEditorHistory2.redo();
                }
                break;
            case 6:
                this.f$0.lambda$createView$5$2$1();
                break;
            case 7:
                final RichEditor richEditor4 = this.f$0;
                if (richEditor4.emojiViewVisible) {
                    richEditor4.hideEmojiPopup$2(true);
                    RichEditText richEditTextFindFocusedEditText = richEditor4.listView.findFocusedEditText();
                    if (richEditTextFindFocusedEditText != null) {
                        richEditTextFindFocusedEditText.requestEditFocus();
                        AndroidUtilities.showKeyboard(richEditTextFindFocusedEditText);
                    }
                } else {
                    if (richEditor4.emojiView != null) {
                        i = -1;
                        i2 = 0;
                    } else {
                        i = -1;
                        i2 = 0;
                        EmojiView emojiView = new EmojiView(richEditor4, true, false, false, richEditor4.getContext(), true, null, richEditor4.container, true, richEditor4.getResourceProvider(), false);
                        richEditor4.emojiView = emojiView;
                        emojiView.setVisibility(8);
                        EmojiView emojiView2 = richEditor4.emojiView;
                        emojiView2.fixBottomTabContainerTranslation = false;
                        emojiView2.setDelegate(new EmojiView.EmojiViewDelegate() {
                            public AnonymousClass15() {
                            }

                            @Override
                            public final boolean canAddCaptionToGif(TLRPC.Document document) {
                                return EmojiView.EmojiViewDelegate.CC.$default$canAddCaptionToGif(this, document);
                            }

                            @Override
                            public final boolean canSchedule() {
                                return EmojiView.EmojiViewDelegate.CC.$default$canSchedule(this);
                            }

                            @Override
                            public final long getDialogId() {
                                return EmojiView.EmojiViewDelegate.CC.$default$getDialogId(this);
                            }

                            @Override
                            public final float getProgressToSearchOpened() {
                                return EmojiView.EmojiViewDelegate.CC.$default$getProgressToSearchOpened(this);
                            }

                            @Override
                            public final int getThreadId() {
                                return EmojiView.EmojiViewDelegate.CC.$default$getThreadId(this);
                            }

                            @Override
                            public final void invalidateEnterView() {
                                EmojiView.EmojiViewDelegate.CC.$default$invalidateEnterView(this);
                            }

                            @Override
                            public final boolean isExpanded() {
                                return EmojiView.EmojiViewDelegate.CC.$default$isExpanded(this);
                            }

                            @Override
                            public final boolean isInScheduleMode() {
                                return EmojiView.EmojiViewDelegate.CC.$default$isInScheduleMode(this);
                            }

                            @Override
                            public final boolean isSearchOpened() {
                                return RichEditor.this.emojiSearchOpened;
                            }

                            @Override
                            public final boolean isUserSelf() {
                                return EmojiView.EmojiViewDelegate.CC.$default$isUserSelf(this);
                            }

                            @Override
                            public final void onAnimatedEmojiUnlockClick() {
                                EmojiView.EmojiViewDelegate.CC.$default$onAnimatedEmojiUnlockClick(this);
                            }

                            @Override
                            public final boolean onBackspace() {
                                RichEditor richEditor5 = RichEditor.this;
                                RichEditText focusedEditTextOrNull = richEditor5.listView.getFocusedEditTextOrNull();
                                if (focusedEditTextOrNull != null) {
                                    richEditor5.emojiTargetEditText = focusedEditTextOrNull;
                                    richEditor5.emojiTargetSelection = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
                                } else {
                                    focusedEditTextOrNull = richEditor5.emojiTargetEditText;
                                    if (focusedEditTextOrNull == null) {
                                        focusedEditTextOrNull = richEditor5.listView.findFocusedEditText();
                                    }
                                }
                                if (focusedEditTextOrNull == null || focusedEditTextOrNull.length() == 0) {
                                    return false;
                                }
                                focusedEditTextOrNull.dispatchKeyEvent(new KeyEvent(0, 67));
                                return true;
                            }

                            @Override
                            public final void onClearEmojiRecent() {
                                EmojiView.EmojiViewDelegate.CC.$default$onClearEmojiRecent(this);
                            }

                            @Override
                            public final void onCustomEmojiSelected(long j, TLRPC.Document document, String str, boolean z) {
                                RichEditor richEditor5 = RichEditor.this;
                                RichEditText focusedEditTextOrNull = richEditor5.listView.getFocusedEditTextOrNull();
                                if (focusedEditTextOrNull != null) {
                                    richEditor5.emojiTargetEditText = focusedEditTextOrNull;
                                    richEditor5.emojiTargetSelection = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
                                } else {
                                    focusedEditTextOrNull = richEditor5.emojiTargetEditText;
                                    if (focusedEditTextOrNull == null) {
                                        focusedEditTextOrNull = richEditor5.listView.findFocusedEditText();
                                    }
                                }
                                if (focusedEditTextOrNull == null) {
                                    return;
                                }
                                int iMax = (focusedEditTextOrNull != richEditor5.emojiTargetEditText || richEditor5.listView.getFocusedEditTextOrNull() == focusedEditTextOrNull) ? Math.max(0, focusedEditTextOrNull.getSelectionEnd()) : Math.min(richEditor5.emojiTargetSelection, focusedEditTextOrNull.length());
                                try {
                                    if (str == null) {
                                        str = "😀";
                                    }
                                    SpannableString spannableString = new SpannableString(str);
                                    AnimatedEmojiSpan animatedEmojiSpan = document != null ? new AnimatedEmojiSpan(document, focusedEditTextOrNull.getPaint().getFontMetricsInt()) : new AnimatedEmojiSpan(j, focusedEditTextOrNull.getPaint().getFontMetricsInt());
                                    animatedEmojiSpan.cacheType = AnimatedEmojiDrawable.getCacheTypeForEnterView();
                                    spannableString.setSpan(animatedEmojiSpan, 0, spannableString.length(), 33);
                                    focusedEditTextOrNull.setText(focusedEditTextOrNull.getText().insert(iMax, spannableString));
                                    int length = iMax + spannableString.length();
                                    focusedEditTextOrNull.setSelection(length, length);
                                    if (focusedEditTextOrNull == richEditor5.emojiTargetEditText) {
                                        richEditor5.emojiTargetSelection = length;
                                    }
                                } catch (Exception unused) {
                                }
                            }

                            @Override
                            public final void onEmojiSelected(String str) {
                                RichEditor richEditor5 = RichEditor.this;
                                RichEditText focusedEditTextOrNull = richEditor5.listView.getFocusedEditTextOrNull();
                                if (focusedEditTextOrNull != null) {
                                    richEditor5.emojiTargetEditText = focusedEditTextOrNull;
                                    richEditor5.emojiTargetSelection = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
                                } else {
                                    focusedEditTextOrNull = richEditor5.emojiTargetEditText;
                                    if (focusedEditTextOrNull == null) {
                                        focusedEditTextOrNull = richEditor5.listView.findFocusedEditText();
                                    }
                                }
                                if (focusedEditTextOrNull == null) {
                                    return;
                                }
                                int iMax = (focusedEditTextOrNull != richEditor5.emojiTargetEditText || richEditor5.listView.getFocusedEditTextOrNull() == focusedEditTextOrNull) ? Math.max(0, focusedEditTextOrNull.getSelectionEnd()) : Math.min(richEditor5.emojiTargetSelection, focusedEditTextOrNull.length());
                                try {
                                    CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji((CharSequence) str, focusedEditTextOrNull.getPaint().getFontMetricsInt(), false, (int[]) null);
                                    focusedEditTextOrNull.setText(focusedEditTextOrNull.getText().insert(iMax, charSequenceReplaceEmoji));
                                    int length = iMax + charSequenceReplaceEmoji.length();
                                    focusedEditTextOrNull.setSelection(length, length);
                                    if (focusedEditTextOrNull == richEditor5.emojiTargetEditText) {
                                        richEditor5.emojiTargetSelection = length;
                                    }
                                } catch (Exception unused) {
                                }
                            }

                            @Override
                            public final void onEmojiSettingsClick(ArrayList arrayList) {
                                RichEditor.this.presentFragment(new StickersActivity(5, arrayList));
                            }

                            @Override
                            public final void onGifSelected(View view2, Object obj, String str, Object obj2, boolean z, int i5, int i6) {
                                EmojiView.EmojiViewDelegate.CC.$default$onGifSelected(this, view2, obj, str, obj2, z, i5, i6);
                            }

                            @Override
                            public final void onGifSelectedForAddCaption(View view2, Object obj, String str, Object obj2, boolean z, int i5, int i6) {
                                EmojiView.EmojiViewDelegate.CC.$default$onGifSelectedForAddCaption(this, view2, obj, str, obj2, z, i5, i6);
                            }

                            @Override
                            public final void onSearchOpenClose(int i5) {
                                RichEditText focusedEditTextOrNull;
                                RichEditor richEditor5 = RichEditor.this;
                                if (i5 != 0 && (focusedEditTextOrNull = richEditor5.listView.getFocusedEditTextOrNull()) != null) {
                                    richEditor5.emojiTargetEditText = focusedEditTextOrNull;
                                    richEditor5.emojiTargetSelection = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
                                }
                                boolean z = i5 != 0;
                                richEditor5.emojiSearchOpened = z;
                                richEditor5.animateEmojiSearch(z);
                            }

                            @Override
                            public final void onShowStickerSet(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z) {
                                EmojiView.EmojiViewDelegate.CC.$default$onShowStickerSet(this, stickerSet, inputStickerSet, z);
                            }

                            @Override
                            public final void onStickerSelected(View view2, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z, int i5, int i6) {
                                EmojiView.EmojiViewDelegate.CC.$default$onStickerSelected(this, view2, document, str, obj, sendAnimationData, z, i5, i6);
                            }

                            @Override
                            public final void onStickerSetAdd(TLRPC.StickerSetCovered stickerSetCovered) {
                                EmojiView.EmojiViewDelegate.CC.$default$onStickerSetAdd(this, stickerSetCovered);
                            }

                            @Override
                            public final void onStickerSetRemove(TLRPC.StickerSetCovered stickerSetCovered) {
                                EmojiView.EmojiViewDelegate.CC.$default$onStickerSetRemove(this, stickerSetCovered);
                            }

                            @Override
                            public final void onStickersGroupClick(long j) {
                                EmojiView.EmojiViewDelegate.CC.$default$onStickersGroupClick(this, j);
                            }

                            @Override
                            public final void onStickersSettingsClick() {
                                RichEditor.this.presentFragment(new StickersActivity(0, null));
                            }

                            @Override
                            public final void onTabOpened(int i5) {
                                EmojiView.EmojiViewDelegate.CC.$default$onTabOpened(this, i5);
                            }

                            @Override
                            public final void showTrendingStickersAlert(TrendingStickersLayout trendingStickersLayout) {
                                EmojiView.EmojiViewDelegate.CC.$default$showTrendingStickersAlert(this, trendingStickersLayout);
                            }
                        });
                        int iIndexOfChild = richEditor4.container.indexOfChild(richEditor4.bottomPanel);
                        if (iIndexOfChild < 0) {
                            iIndexOfChild = richEditor4.container.getChildCount();
                        }
                        FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(-1, richEditor4.getEmojiPanelHeight(), 87);
                        layoutParamsCreateFrame.bottomMargin = richEditor4.bottomInset;
                        richEditor4.container.addView(richEditor4.emojiView, iIndexOfChild, layoutParamsCreateFrame);
                    }
                    int emojiPanelHeight = richEditor4.getEmojiPanelHeight();
                    FrameLayout.LayoutParams layoutParamsCreateFrame2 = (FrameLayout.LayoutParams) richEditor4.emojiView.getLayoutParams();
                    if (layoutParamsCreateFrame2 == null) {
                        layoutParamsCreateFrame2 = LayoutHelper.createFrame(i, emojiPanelHeight, 87);
                    } else {
                        layoutParamsCreateFrame2.height = emojiPanelHeight;
                    }
                    layoutParamsCreateFrame2.bottomMargin = richEditor4.bottomInset;
                    richEditor4.emojiView.setLayoutParams(layoutParamsCreateFrame2);
                    richEditor4.emojiView.setVisibility(i2);
                    richEditor4.emojiViewVisible = true;
                    richEditor4.emojiPadding = emojiPanelHeight + richEditor4.bottomInset;
                    RichEditText richEditTextFindFocusedEditText2 = richEditor4.listView.findFocusedEditText();
                    if (richEditTextFindFocusedEditText2 != null) {
                        AndroidUtilities.hideKeyboard(richEditTextFindFocusedEditText2);
                    }
                    richEditor4.checkUI_listViewPadding();
                    richEditor4.emojiButton.setState(ChatActivityEnterViewAnimatedIconView.State.KEYBOARD, true);
                }
                break;
            case 8:
                final RichEditor richEditor5 = this.f$0;
                ItemOptions itemOptions2 = richEditor5.currentMenuVisible;
                BlockRow blockRow = null;
                if (itemOptions2 != null) {
                    itemOptions2.dismiss();
                    richEditor5.currentMenuVisible = null;
                }
                final ItemOptions itemOptionsDontFocus = ItemOptions.makeOptions(richEditor5, view).dontFocus();
                BlockRow blockRowFindFocusedRow2 = richEditor5.listView.findFocusedRow();
                boolean z = false;
                ItemOptions itemOptionsAddChecked = itemOptionsDontFocus.addChecked(blockRowFindFocusedRow2 == null || !blockRowFindFocusedRow2.isInList(), R.drawable.field_carret_empty, LocaleController.getString(R.string.ArticleNone), new RichEditor$$ExternalSyntheticLambda31(richEditor5, blockRowFindFocusedRow2, 5)).addChecked((blockRowFindFocusedRow2 == null || !blockRowFindFocusedRow2.isInList() || blockRowFindFocusedRow2.isChecklist() || blockRowFindFocusedRow2.isOrdered()) ? false : true, R.drawable.iv_list, LocaleController.getString(R.string.ArticleListBulletedList), new RichEditor$$ExternalSyntheticLambda31(richEditor5, blockRowFindFocusedRow2, 6)).addChecked(blockRowFindFocusedRow2 != null && blockRowFindFocusedRow2.isInList() && !blockRowFindFocusedRow2.isChecklist() && blockRowFindFocusedRow2.isOrdered(), R.drawable.iv_ordered_list, LocaleController.getString(R.string.ArticleListNumberedList), new RichEditor$$ExternalSyntheticLambda31(richEditor5, blockRowFindFocusedRow2, 7)).addChecked(blockRowFindFocusedRow2 != null && blockRowFindFocusedRow2.isInList() && blockRowFindFocusedRow2.isChecklist() && !blockRowFindFocusedRow2.isOrdered(), R.drawable.iv_todo, LocaleController.getString(R.string.ArticleListChecklist), new RichEditor$$ExternalSyntheticLambda31(richEditor5, blockRowFindFocusedRow2, 8));
                boolean z2 = blockRowFindFocusedRow2 != null && (blockRowFindFocusedRow2.block instanceof TL_iv.pageBlockDetails);
                int i5 = R.drawable.iv_details;
                String string = LocaleController.getString(R.string.ArticleToggleBlock);
                RichEditorListView richEditorListView = richEditor5.listView;
                Objects.requireNonNull(richEditorListView);
                itemOptionsAddChecked.addChecked(z2, i5, string, new RichEditorListView$$ExternalSyntheticLambda4(richEditorListView, 2));
                RichEditorListView richEditorListView2 = richEditor5.listView;
                int[] iArrSelectionRowRange = richEditorListView2.selectionRowRange();
                if (iArrSelectionRowRange == null) {
                    BlockRow blockRowFindFocusedRow3 = richEditorListView2.findFocusedRow();
                    if (blockRowFindFocusedRow3 == null && ((anonymousClass1 = richEditorListView2.textSelectionHelper) == null || (i4 = anonymousClass1.startViewPosition) < 0 || (blockRowFindFocusedRow3 = richEditorListView2.rowForCell(i4)) == null)) {
                        blockRowFindFocusedRow3 = null;
                    }
                    zCanIndentTarget = richEditorListView2.canIndentTarget(blockRowFindFocusedRow3);
                } else {
                    int i6 = iArrSelectionRowRange[0];
                    while (true) {
                        if (i6 > iArrSelectionRowRange[1]) {
                            zCanIndentTarget = false;
                        } else if (richEditorListView2.canIndentTarget((BlockRow) richEditorListView2.rows.get(i6))) {
                            zCanIndentTarget = true;
                        } else {
                            i6++;
                        }
                    }
                }
                RichEditorListView richEditorListView3 = richEditor5.listView;
                int[] iArrSelectionRowRange2 = richEditorListView3.selectionRowRange();
                ArrayList arrayList = richEditorListView3.rows;
                if (iArrSelectionRowRange2 == null) {
                    BlockRow blockRowFindFocusedRow4 = richEditorListView3.findFocusedRow();
                    if (blockRowFindFocusedRow4 != null) {
                        blockRow = blockRowFindFocusedRow4;
                    } else {
                        RichEditorListView.AnonymousClass1 anonymousClass2 = richEditorListView3.textSelectionHelper;
                        if (anonymousClass2 != null && (i3 = anonymousClass2.startViewPosition) >= 0 && (blockRowRowForCell = richEditorListView3.rowForCell(i3)) != null) {
                            blockRow = blockRowRowForCell;
                        }
                    }
                    if (blockRow != null && (iIndexOf2 = arrayList.indexOf(blockRow)) >= 0 && blockRow.level > 0 && iIndexOf2 >= 0 && iIndexOf2 < arrayList.size() && ((BlockRow) arrayList.get(iIndexOf2)).level > 0) {
                        z = true;
                    }
                } else {
                    for (int i7 = iArrSelectionRowRange2[0]; i7 <= iArrSelectionRowRange2[1]; i7++) {
                        BlockRow blockRow2 = (BlockRow) arrayList.get(i7);
                        if (blockRow2 != null && (iIndexOf = arrayList.indexOf(blockRow2)) >= 0 && blockRow2.level > 0 && iIndexOf >= 0 && iIndexOf < arrayList.size() && ((BlockRow) arrayList.get(iIndexOf)).level > 0) {
                            z = true;
                        }
                    }
                }
                if (zCanIndentTarget || z) {
                    itemOptionsDontFocus.addGap();
                    if (zCanIndentTarget) {
                        final int i8 = 0;
                        itemOptionsDontFocus.add(R.drawable.iv_list_tab, LocaleController.getString(R.string.ArticleIndent), new Runnable() {
                            @Override
                            public final void run() {
                                switch (i8) {
                                    case 0:
                                        richEditor5.listView.indentSelection(false);
                                        itemOptionsDontFocus.dismiss();
                                        break;
                                    default:
                                        richEditor5.listView.indentSelection(true);
                                        itemOptionsDontFocus.dismiss();
                                        break;
                                }
                            }
                        });
                    }
                    if (z) {
                        final int i9 = 1;
                        itemOptionsDontFocus.add(R.drawable.iv_list_untab, LocaleController.getString(R.string.ArticleOutdent), new Runnable() {
                            @Override
                            public final void run() {
                                switch (i9) {
                                    case 0:
                                        richEditor5.listView.indentSelection(false);
                                        itemOptionsDontFocus.dismiss();
                                        break;
                                    default:
                                        richEditor5.listView.indentSelection(true);
                                        itemOptionsDontFocus.dismiss();
                                        break;
                                }
                            }
                        });
                    }
                }
                richEditor5.currentMenuVisible = itemOptionsDontFocus.forceTop(true).show();
                break;
            case 9:
                RichEditor richEditor6 = this.f$0;
                ItemOptions itemOptions3 = richEditor6.currentMenuVisible;
                TL_iv.pageTableCell pagetablecell = null;
                if (itemOptions3 != null) {
                    itemOptions3.dismiss();
                    richEditor6.currentMenuVisible = null;
                }
                RichEditorListView richEditorListView4 = richEditor6.listView;
                RichTableCell richTableCell = richEditorListView4.activeCellSelectionTable;
                if (richTableCell == null) {
                    View viewFindFocus = richEditorListView4.findFocus();
                    RichTableCell richTableCellFindTableCellAncestor = viewFindFocus instanceof RichEditText ? RichEditorListView.findTableCellAncestor((RichEditText) viewFindFocus) : null;
                    if (richTableCellFindTableCellAncestor != null && richTableCellFindTableCellAncestor.getModel() != null) {
                        View viewFindFocus2 = richEditor6.listView.findFocus();
                        if ((viewFindFocus2 instanceof RichEditText) && (richTableCellHostFindHostContaining = richTableCellFindTableCellAncestor.findHostContaining((RichEditText) viewFindFocus2)) != null) {
                            pagetablecell = richTableCellHostFindHostContaining.cell;
                        }
                        if (pagetablecell != null) {
                            richEditor6.listView.beginCellSelection(richTableCellFindTableCellAncestor);
                            if (richTableCellFindTableCellAncestor.selectedCells.add(pagetablecell)) {
                                richTableCellFindTableCellAncestor.grid.invalidate();
                                richTableCellFindTableCellAncestor.notifyCellSelectionChanged();
                            }
                            richTableCell = richTableCellFindTableCellAncestor;
                        }
                    }
                }
                if (richTableCell == null || richTableCell.getModel() == null || richTableCell.selectedCells.isEmpty()) {
                    richEditor6.listView.addBlock(RichTextCell.newEmptyTable(2, 2));
                } else {
                    richEditor6.listView.showTableCellMenu(richTableCell);
                }
                break;
            case 10:
                final RichEditor richEditor7 = this.f$0;
                if (richEditor7.isSendLocked$1()) {
                    richEditor7.showConversionSheet$1();
                } else if (richEditor7.editingMessageObject == null && (chatActivity2 = richEditor7.chatActivity) != null && chatActivity2.isInScheduleMode()) {
                    AlertsCreator.createScheduleDatePickerDialog(richEditor7.getParentActivity(), richEditor7.chatActivity.getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() {
                        public AnonymousClass13() {
                        }

                        @Override
                        public final void didSelectDate(boolean z3, int i10, int i11) {
                            RichEditor.this.sendMessage(i10, i11, z3);
                        }
                    }, richEditor7.getResourceProvider());
                } else {
                    richEditor7.sendMessage(0, 0, true);
                }
                MessageSendPreview messageSendPreview = richEditor7.messageSendPreview;
                if (messageSendPreview != null) {
                    messageSendPreview.dismiss(true);
                    richEditor7.messageSendPreview = null;
                }
                break;
            case 11:
                RichEditor richEditor8 = this.f$0;
                richEditor8.listView.pendingMediaRow = null;
                richEditor8.openAttach$1(90, 0);
                break;
            case 12:
                RichEditor richEditor9 = this.f$0;
                richEditor9.listView.toggleQuoteOnSelection();
                richEditor9.updateFormattingButtons$1();
                break;
            case 13:
                this.f$0.listView.onInlineButtonClicked(view);
                break;
            case 14:
                this.f$0.listView.onLinkClicked();
                break;
            case 15:
                this.f$0.listView.onDateClicked();
                break;
            default:
                this.f$0.listView.onMathClicked();
                break;
        }
    }
}
