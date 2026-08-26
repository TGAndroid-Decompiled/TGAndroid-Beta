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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.StickerEmojiCell;
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
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.ThemeActivity$$ExternalSyntheticLambda19;

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
        boolean zCanIndentTarget;
        int iIndexOf;
        boolean z;
        int i;
        BlockRow blockRowRowForCell;
        int iIndexOf2;
        RichEditorListView.AnonymousClass1 anonymousClass1;
        int i2;
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
                ChatAttachAlertRichLayout.showEditLatexSheet(richEditor.getParentActivity(), (pageblockmath == null || TextUtils.isEmpty(pageblockmath.source)) ? "" : pageblockmath.source, new ThemeActivity$$ExternalSyntheticLambda19(19, richEditor, pageblockmath), richEditor.getResourceProvider());
                break;
            case 1:
                this.f$0.onAiStyleSelection();
                break;
            case 2:
                RichEditor richEditor2 = this.f$0;
                if (richEditor2.isSendLocked$1()) {
                    richEditor2.showConversionSheet$1();
                } else if (richEditor2.editingMessageObject == null && (chatActivity = richEditor2.chatActivity) != null && chatActivity.isInScheduleMode()) {
                    AlertsCreator.createScheduleDatePickerDialog(richEditor2.getParentActivity(), richEditor2.chatActivity.getDialogId(), -1L, 0, new PhotoViewer.AnonymousClass49(richEditor2, 17), null, richEditor2.getResourceProvider());
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
                this.f$0.lambda$createView$5$12$1();
                break;
            case 7:
                final RichEditor richEditor4 = this.f$0;
                if (!richEditor4.emojiViewVisible) {
                    if (richEditor4.emojiView == null) {
                        EmojiView emojiView = new EmojiView(richEditor4, true, false, false, richEditor4.getParentActivity(), true, null, richEditor4.container, true, richEditor4.getResourceProvider(), false, false);
                        richEditor4.emojiView = emojiView;
                        emojiView.setVisibility(8);
                        EmojiView emojiView2 = richEditor4.emojiView;
                        emojiView2.fixBottomTabContainerTranslation = false;
                        emojiView2.setDelegate(new EmojiView.EmojiViewDelegate() {
                            public AnonymousClass15() {
                            }

                            @Override
                            public final boolean canAddCaptionToGif() {
                                return false;
                            }

                            @Override
                            public final boolean canSchedule() {
                                return false;
                            }

                            @Override
                            public final long getDialogId() {
                                return 0L;
                            }

                            @Override
                            public final float getProgressToSearchOpened() {
                                return 0.0f;
                            }

                            @Override
                            public final int getThreadId() {
                                return 0;
                            }

                            @Override
                            public final void invalidateEnterView() {
                            }

                            @Override
                            public final boolean isExpanded() {
                                return false;
                            }

                            @Override
                            public final boolean isInScheduleMode() {
                                return false;
                            }

                            @Override
                            public final boolean isSearchOpened() {
                                return RichEditor.this.emojiSearchOpened;
                            }

                            @Override
                            public final boolean isUserSelf() {
                                return false;
                            }

                            @Override
                            public final void onAnimatedEmojiUnlockClick() {
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
                            }

                            @Override
                            public final void onCustomEmojiSelected(long j, TLRPC.Document document, String str, boolean z2) {
                                AnimatedEmojiSpan animatedEmojiSpan;
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
                                    if (document != null) {
                                        animatedEmojiSpan = new AnimatedEmojiSpan(document.id, 1.2f, focusedEditTextOrNull.getPaint().getFontMetricsInt());
                                        animatedEmojiSpan.document = document;
                                    } else {
                                        animatedEmojiSpan = new AnimatedEmojiSpan(j, 1.2f, focusedEditTextOrNull.getPaint().getFontMetricsInt());
                                    }
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
                            public final void onGifSelected(View view2, Object obj, String str, Object obj2, boolean z2, int i3, int i4) {
                            }

                            @Override
                            public final void onGifSelectedForAddCaption(TLObject tLObject, Object obj) {
                            }

                            @Override
                            public final void onSearchOpenClose(int i3) {
                                RichEditText focusedEditTextOrNull;
                                RichEditor richEditor5 = RichEditor.this;
                                if (i3 != 0 && (focusedEditTextOrNull = richEditor5.listView.getFocusedEditTextOrNull()) != null) {
                                    richEditor5.emojiTargetEditText = focusedEditTextOrNull;
                                    richEditor5.emojiTargetSelection = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
                                }
                                boolean z2 = i3 != 0;
                                richEditor5.emojiSearchOpened = z2;
                                richEditor5.animateEmojiSearch(z2);
                            }

                            @Override
                            public final void onShowStickerSet(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z2) {
                            }

                            @Override
                            public final void onStickerSelected(StickerEmojiCell stickerEmojiCell, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z2, int i3) {
                            }

                            @Override
                            public final void onStickerSetAdd(TLRPC.StickerSetCovered stickerSetCovered) {
                            }

                            @Override
                            public final void onStickerSetRemove(TLRPC.StickerSetCovered stickerSetCovered) {
                            }

                            @Override
                            public final void onStickersGroupClick(long j) {
                            }

                            @Override
                            public final void onStickersSettingsClick() {
                                RichEditor.this.presentFragment(new StickersActivity(0, null));
                            }

                            @Override
                            public final void onTabOpened(int i3) {
                            }

                            @Override
                            public final void showTrendingStickersAlert(TrendingStickersLayout trendingStickersLayout) {
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
                        layoutParamsCreateFrame2 = LayoutHelper.createFrame(-1, emojiPanelHeight, 87);
                    } else {
                        layoutParamsCreateFrame2.height = emojiPanelHeight;
                    }
                    layoutParamsCreateFrame2.bottomMargin = richEditor4.bottomInset;
                    richEditor4.emojiView.setLayoutParams(layoutParamsCreateFrame2);
                    richEditor4.emojiView.setVisibility(0);
                    richEditor4.emojiViewVisible = true;
                    richEditor4.emojiPadding = emojiPanelHeight + richEditor4.bottomInset;
                    RichEditText richEditTextFindFocusedEditText = richEditor4.listView.findFocusedEditText();
                    if (richEditTextFindFocusedEditText != null) {
                        AndroidUtilities.hideKeyboard(richEditTextFindFocusedEditText);
                    }
                    richEditor4.checkUI_listViewPadding();
                    richEditor4.emojiButton.setState(ChatActivityEnterViewAnimatedIconView.State.KEYBOARD, true);
                } else {
                    richEditor4.hideEmojiPopup$4(true);
                    RichEditText richEditTextFindFocusedEditText2 = richEditor4.listView.findFocusedEditText();
                    if (richEditTextFindFocusedEditText2 != null) {
                        richEditTextFindFocusedEditText2.requestEditFocus();
                        AndroidUtilities.showKeyboard(richEditTextFindFocusedEditText2);
                    }
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
                final ItemOptions itemOptions3 = new ItemOptions(richEditor5, view, false, true);
                itemOptions3.dontFocus = true;
                BlockRow blockRowFindFocusedRow2 = richEditor5.listView.findFocusedRow();
                itemOptions3.addChecked(blockRowFindFocusedRow2 == null || !blockRowFindFocusedRow2.isInList(), R.drawable.field_carret_empty, null, LocaleController.getString(R.string.ArticleNone), new RichEditor$$ExternalSyntheticLambda31(richEditor5, blockRowFindFocusedRow2, 5));
                itemOptions3.addChecked((blockRowFindFocusedRow2 == null || !blockRowFindFocusedRow2.isInList() || blockRowFindFocusedRow2.isChecklist() || blockRowFindFocusedRow2.isOrdered()) ? false : true, R.drawable.iv_list, null, LocaleController.getString(R.string.ArticleListBulletedList), new RichEditor$$ExternalSyntheticLambda31(richEditor5, blockRowFindFocusedRow2, 6));
                itemOptions3.addChecked(blockRowFindFocusedRow2 != null && blockRowFindFocusedRow2.isInList() && !blockRowFindFocusedRow2.isChecklist() && blockRowFindFocusedRow2.isOrdered(), R.drawable.iv_ordered_list, null, LocaleController.getString(R.string.ArticleListNumberedList), new RichEditor$$ExternalSyntheticLambda31(richEditor5, blockRowFindFocusedRow2, 7));
                itemOptions3.addChecked(blockRowFindFocusedRow2 != null && blockRowFindFocusedRow2.isInList() && blockRowFindFocusedRow2.isChecklist() && !blockRowFindFocusedRow2.isOrdered(), R.drawable.iv_todo, null, LocaleController.getString(R.string.ArticleListChecklist), new RichEditor$$ExternalSyntheticLambda31(richEditor5, blockRowFindFocusedRow2, 8));
                boolean z2 = blockRowFindFocusedRow2 != null && (blockRowFindFocusedRow2.block instanceof TL_iv.pageBlockDetails);
                int i3 = R.drawable.iv_details;
                String string = LocaleController.getString(R.string.ArticleToggleBlock);
                RichEditorListView richEditorListView = richEditor5.listView;
                Objects.requireNonNull(richEditorListView);
                itemOptions3.addChecked(z2, i3, null, string, new RichEditorListView$$ExternalSyntheticLambda4(richEditorListView, 2));
                RichEditorListView richEditorListView2 = richEditor5.listView;
                int[] iArrSelectionRowRange = richEditorListView2.selectionRowRange();
                if (iArrSelectionRowRange == null) {
                    BlockRow blockRowFindFocusedRow3 = richEditorListView2.findFocusedRow();
                    if (blockRowFindFocusedRow3 == null && ((anonymousClass1 = richEditorListView2.textSelectionHelper) == null || (i2 = anonymousClass1.startViewPosition) < 0 || (blockRowFindFocusedRow3 = richEditorListView2.rowForCell(i2)) == null)) {
                        blockRowFindFocusedRow3 = null;
                    }
                    zCanIndentTarget = richEditorListView2.canIndentTarget(blockRowFindFocusedRow3);
                } else {
                    int i4 = iArrSelectionRowRange[0];
                    while (true) {
                        if (i4 > iArrSelectionRowRange[1]) {
                            zCanIndentTarget = false;
                        } else if (richEditorListView2.canIndentTarget((BlockRow) richEditorListView2.rows.get(i4))) {
                            zCanIndentTarget = true;
                        } else {
                            i4++;
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
                        if (anonymousClass2 != null && (i = anonymousClass2.startViewPosition) >= 0 && (blockRowRowForCell = richEditorListView3.rowForCell(i)) != null) {
                            blockRow = blockRowRowForCell;
                        }
                    }
                    z = blockRow != null && (iIndexOf2 = arrayList.indexOf(blockRow)) >= 0 && blockRow.level > 0 && iIndexOf2 >= 0 && iIndexOf2 < arrayList.size() && ((BlockRow) arrayList.get(iIndexOf2)).level > 0;
                } else {
                    int i5 = iArrSelectionRowRange2[0];
                    while (true) {
                        if (i5 <= iArrSelectionRowRange2[1]) {
                            BlockRow blockRow2 = (BlockRow) arrayList.get(i5);
                            if (blockRow2 == null || (iIndexOf = arrayList.indexOf(blockRow2)) < 0 || blockRow2.level <= 0 || iIndexOf < 0 || iIndexOf >= arrayList.size() || ((BlockRow) arrayList.get(iIndexOf)).level <= 0) {
                                i5++;
                            }
                        }
                    }
                }
                if (zCanIndentTarget || z) {
                    itemOptions3.addGap();
                    if (zCanIndentTarget) {
                        final int i6 = 0;
                        itemOptions3.add(R.drawable.iv_list_tab, LocaleController.getString(R.string.ArticleIndent), new Runnable() {
                            @Override
                            public final void run() {
                                switch (i6) {
                                    case 0:
                                        richEditor5.listView.indentSelection(false);
                                        itemOptions3.dismiss();
                                        break;
                                    default:
                                        richEditor5.listView.indentSelection(true);
                                        itemOptions3.dismiss();
                                        break;
                                }
                            }
                        }, false);
                    }
                    if (z) {
                        final int i7 = 1;
                        itemOptions3.add(R.drawable.iv_list_untab, LocaleController.getString(R.string.ArticleOutdent), new Runnable() {
                            @Override
                            public final void run() {
                                switch (i7) {
                                    case 0:
                                        richEditor5.listView.indentSelection(false);
                                        itemOptions3.dismiss();
                                        break;
                                    default:
                                        richEditor5.listView.indentSelection(true);
                                        itemOptions3.dismiss();
                                        break;
                                }
                            }
                        }, false);
                    }
                }
                itemOptions3.forceTop = true;
                itemOptions3.show();
                richEditor5.currentMenuVisible = itemOptions3;
                break;
            case 9:
                RichEditor richEditor6 = this.f$0;
                ItemOptions itemOptions4 = richEditor6.currentMenuVisible;
                TL_iv.pageTableCell pagetablecell = null;
                if (itemOptions4 != null) {
                    itemOptions4.dismiss();
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
                RichEditor richEditor7 = this.f$0;
                richEditor7.listView.pendingMediaRow = null;
                richEditor7.openAttach$1(90, 0);
                break;
            case 11:
                RichEditor richEditor8 = this.f$0;
                if (richEditor8.isSendLocked$1()) {
                    richEditor8.showConversionSheet$1();
                } else if (richEditor8.editingMessageObject == null && (chatActivity2 = richEditor8.chatActivity) != null && chatActivity2.isInScheduleMode()) {
                    AlertsCreator.createScheduleDatePickerDialog(richEditor8.getParentActivity(), richEditor8.chatActivity.getDialogId(), -1L, 0, new PhotoViewer.AnonymousClass49(richEditor8, 17), null, richEditor8.getResourceProvider());
                } else {
                    richEditor8.sendMessage(0, 0, true);
                }
                MessageSendPreview messageSendPreview = richEditor8.messageSendPreview;
                if (messageSendPreview != null) {
                    messageSendPreview.sent = true;
                    messageSendPreview.dismiss();
                    richEditor8.messageSendPreview = null;
                }
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
