package org.telegram.ui.iv;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda326;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda133;
import org.telegram.ui.ThemeActivity$$ExternalSyntheticLambda19;

public final class RichEditorToolbar$$ExternalSyntheticLambda17 implements View.OnClickListener {
    public final int $r8$classId;
    public final RichEditorToolbar f$0;
    public final int f$1;

    public RichEditorToolbar$$ExternalSyntheticLambda17(RichEditorToolbar richEditorToolbar, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = richEditorToolbar;
        this.f$1 = i;
    }

    @Override
    public final void onClick(View view) {
        boolean zCanIndentTarget;
        int iIndexOf;
        boolean z;
        int i;
        BlockRow blockRowRowForCell;
        int iIndexOf2;
        int i2;
        RichTableCellHost richTableCellHostFindHostContaining;
        switch (this.$r8$classId) {
            case 0:
                final ChatAttachAlertRichLayout chatAttachAlertRichLayout = ChatAttachAlertRichLayout.this;
                RichEditorListView richEditorListView = chatAttachAlertRichLayout.listView;
                BlockRow blockRowFindFocusedRow = richEditorListView.findFocusedRow();
                int i3 = this.f$1;
                Theme.ResourcesProvider resourcesProvider = chatAttachAlertRichLayout.resourcesProvider;
                if (i3 == 1) {
                    ItemOptions itemOptions = chatAttachAlertRichLayout.menu;
                    if (itemOptions != null) {
                        itemOptions.dismiss();
                    }
                    ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(chatAttachAlertRichLayout, resourcesProvider, view, true);
                    itemOptionsMakeOptions.dontFocus = true;
                    ItemOptions itemOptionsMakeSwipeback = itemOptionsMakeOptions.makeSwipeback();
                    int i4 = chatAttachAlertRichLayout.currentAccount;
                    boolean z2 = (MessagesController.getInstance(i4).richEditorAllowed() || UserConfig.getInstance(i4).isPremium()) ? false : true;
                    itemOptionsMakeSwipeback.add(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new ChatActivity$$ExternalSyntheticLambda326(9, itemOptionsMakeOptions), false);
                    itemOptionsMakeSwipeback.addGap();
                    TL_iv.pageBlockHeading1 pageblockheading1 = new TL_iv.pageBlockHeading1();
                    int i5 = R.drawable.iv_h1;
                    chatAttachAlertRichLayout.addHeadingItem(itemOptionsMakeSwipeback, blockRowFindFocusedRow, pageblockheading1, i5, LocaleController.getString(R.string.ArticleHeading1), SharedConfig.fontSize + 2, itemOptionsMakeOptions);
                    chatAttachAlertRichLayout.addHeadingItem(itemOptionsMakeSwipeback, blockRowFindFocusedRow, new TL_iv.pageBlockHeading2(), R.drawable.iv_h2, LocaleController.getString(R.string.ArticleHeading2), SharedConfig.fontSize + 1, itemOptionsMakeOptions);
                    chatAttachAlertRichLayout.addHeadingItem(itemOptionsMakeSwipeback, blockRowFindFocusedRow, new TL_iv.pageBlockHeading3(), R.drawable.iv_h3, LocaleController.getString(R.string.ArticleHeading3), SharedConfig.fontSize, itemOptionsMakeOptions);
                    chatAttachAlertRichLayout.addHeadingItem(itemOptionsMakeSwipeback, blockRowFindFocusedRow, new TL_iv.pageBlockHeading4(), R.drawable.iv_h4, LocaleController.getString(R.string.ArticleHeading4), SharedConfig.fontSize - 1, itemOptionsMakeOptions);
                    chatAttachAlertRichLayout.addHeadingItem(itemOptionsMakeSwipeback, blockRowFindFocusedRow, new TL_iv.pageBlockHeading5(), R.drawable.iv_h5, LocaleController.getString(R.string.ArticleHeading5), SharedConfig.fontSize - 2, itemOptionsMakeOptions);
                    chatAttachAlertRichLayout.addHeadingItem(itemOptionsMakeSwipeback, blockRowFindFocusedRow, new TL_iv.pageBlockHeading6(), R.drawable.iv_h6, LocaleController.getString(R.string.ArticleHeading6), SharedConfig.fontSize - 3, itemOptionsMakeOptions);
                    boolean z3 = blockRowFindFocusedRow != null && RichEditorListView.isHeading(blockRowFindFocusedRow.block);
                    RichEditor.RequiresPremiumDrawable requiresPremiumDrawable = new RichEditor.RequiresPremiumDrawable(chatAttachAlertRichLayout.getContext(), i5);
                    requiresPremiumDrawable.setPremium(z2);
                    itemOptionsMakeOptions.addChecked(z3, 0, requiresPremiumDrawable, LocaleController.getString(R.string.ArticleHeading), new PhotoViewer$$ExternalSyntheticLambda133(itemOptionsMakeOptions, itemOptionsMakeSwipeback, 10));
                    itemOptionsMakeOptions.addChecked(blockRowFindFocusedRow != null && (blockRowFindFocusedRow.block instanceof TL_iv.pageBlockParagraph), R.drawable.iv_text, null, LocaleController.getString(R.string.ArticleText), new ChatAttachAlertRichLayout$$ExternalSyntheticLambda25(chatAttachAlertRichLayout, blockRowFindFocusedRow, 5));
                    itemOptionsMakeOptions.addChecked(blockRowFindFocusedRow != null && (blockRowFindFocusedRow.block instanceof TL_iv.pageBlockBlockquote), R.drawable.iv_quote, null, LocaleController.getString(R.string.ArticleQuote), new ChatAttachAlertRichLayout$$ExternalSyntheticLambda25(chatAttachAlertRichLayout, blockRowFindFocusedRow, 6));
                    boolean z4 = blockRowFindFocusedRow != null && (blockRowFindFocusedRow.block instanceof TL_iv.pageBlockPullquote);
                    RichEditor.RequiresPremiumDrawable requiresPremiumDrawable2 = new RichEditor.RequiresPremiumDrawable(chatAttachAlertRichLayout.getContext(), R.drawable.iv_pullquote);
                    requiresPremiumDrawable2.setPremium(z2);
                    itemOptionsMakeOptions.addChecked(z4, 0, requiresPremiumDrawable2, LocaleController.getString(R.string.ArticlePullquote), new ChatAttachAlertRichLayout$$ExternalSyntheticLambda25(chatAttachAlertRichLayout, blockRowFindFocusedRow, 7));
                    itemOptionsMakeOptions.addChecked(blockRowFindFocusedRow != null && (blockRowFindFocusedRow.block instanceof TL_iv.pageBlockPreformatted), R.drawable.iv_code, null, LocaleController.getString(R.string.ArticleCode), new ChatAttachAlertRichLayout$$ExternalSyntheticLambda25(chatAttachAlertRichLayout, blockRowFindFocusedRow, 8));
                    boolean z5 = blockRowFindFocusedRow != null && (blockRowFindFocusedRow.block instanceof TL_iv.pageBlockFooter);
                    RichEditor.RequiresPremiumDrawable requiresPremiumDrawable3 = new RichEditor.RequiresPremiumDrawable(chatAttachAlertRichLayout.getContext(), R.drawable.iv_footer);
                    requiresPremiumDrawable3.setPremium(z2);
                    itemOptionsMakeOptions.addChecked(z5, 0, requiresPremiumDrawable3, LocaleController.getString(R.string.ArticleFooter), new ChatAttachAlertRichLayout$$ExternalSyntheticLambda25(chatAttachAlertRichLayout, blockRowFindFocusedRow, 9));
                    itemOptionsMakeOptions.show();
                    chatAttachAlertRichLayout.menu = itemOptionsMakeOptions;
                    break;
                } else {
                    BlockRow blockRow = null;
                    pageblockmath = null;
                    TL_iv.pageBlockMath pageblockmath = null;
                    pagetablecell = null;
                    TL_iv.pageTableCell pagetablecell = null;
                    blockRow = null;
                    blockRow = null;
                    if (i3 == 2) {
                        ItemOptions itemOptions2 = chatAttachAlertRichLayout.menu;
                        if (itemOptions2 != null) {
                            itemOptions2.dismiss();
                        }
                        final ItemOptions itemOptionsMakeOptions2 = ItemOptions.makeOptions(chatAttachAlertRichLayout, resourcesProvider, view);
                        itemOptionsMakeOptions2.dontFocus = true;
                        itemOptionsMakeOptions2.addChecked(blockRowFindFocusedRow == null || !blockRowFindFocusedRow.isInList(), R.drawable.field_carret_empty, null, LocaleController.getString(R.string.ArticleNone), new ChatAttachAlertRichLayout$$ExternalSyntheticLambda25(chatAttachAlertRichLayout, blockRowFindFocusedRow, 1));
                        itemOptionsMakeOptions2.addChecked((blockRowFindFocusedRow == null || !blockRowFindFocusedRow.isInList() || blockRowFindFocusedRow.isChecklist() || blockRowFindFocusedRow.isOrdered()) ? false : true, R.drawable.iv_list, null, LocaleController.getString(R.string.ArticleListBulleted), new ChatAttachAlertRichLayout$$ExternalSyntheticLambda25(chatAttachAlertRichLayout, blockRowFindFocusedRow, 2));
                        itemOptionsMakeOptions2.addChecked(blockRowFindFocusedRow != null && blockRowFindFocusedRow.isInList() && !blockRowFindFocusedRow.isChecklist() && blockRowFindFocusedRow.isOrdered(), R.drawable.iv_ordered_list, null, LocaleController.getString(R.string.ArticleListNumbered), new ChatAttachAlertRichLayout$$ExternalSyntheticLambda25(chatAttachAlertRichLayout, blockRowFindFocusedRow, 3));
                        itemOptionsMakeOptions2.addChecked(blockRowFindFocusedRow != null && blockRowFindFocusedRow.isInList() && blockRowFindFocusedRow.isChecklist() && !blockRowFindFocusedRow.isOrdered(), R.drawable.iv_todo, null, LocaleController.getString(R.string.ArticleListTodo), new ChatAttachAlertRichLayout$$ExternalSyntheticLambda25(chatAttachAlertRichLayout, blockRowFindFocusedRow, 4));
                        itemOptionsMakeOptions2.addChecked(blockRowFindFocusedRow != null && (blockRowFindFocusedRow.block instanceof TL_iv.pageBlockDetails), R.drawable.iv_details, null, LocaleController.getString(R.string.ArticleToggleBlock), new RichEditorListView$$ExternalSyntheticLambda4(richEditorListView, 2));
                        int[] iArrSelectionRowRange = richEditorListView.selectionRowRange();
                        ArrayList arrayList = richEditorListView.rows;
                        RichEditorListView.AnonymousClass1 anonymousClass1 = richEditorListView.textSelectionHelper;
                        if (iArrSelectionRowRange == null) {
                            BlockRow blockRowFindFocusedRow2 = richEditorListView.findFocusedRow();
                            if (blockRowFindFocusedRow2 == null && (anonymousClass1 == null || (i2 = anonymousClass1.startViewPosition) < 0 || (blockRowFindFocusedRow2 = richEditorListView.rowForCell(i2)) == null)) {
                                blockRowFindFocusedRow2 = null;
                            }
                            zCanIndentTarget = richEditorListView.canIndentTarget(blockRowFindFocusedRow2);
                        } else {
                            int i6 = iArrSelectionRowRange[0];
                            while (true) {
                                if (i6 > iArrSelectionRowRange[1]) {
                                    zCanIndentTarget = false;
                                } else if (richEditorListView.canIndentTarget((BlockRow) arrayList.get(i6))) {
                                    zCanIndentTarget = true;
                                } else {
                                    i6++;
                                }
                            }
                        }
                        int[] iArrSelectionRowRange2 = richEditorListView.selectionRowRange();
                        if (iArrSelectionRowRange2 == null) {
                            BlockRow blockRowFindFocusedRow3 = richEditorListView.findFocusedRow();
                            if (blockRowFindFocusedRow3 != null) {
                                blockRow = blockRowFindFocusedRow3;
                            } else if (anonymousClass1 != null && (i = anonymousClass1.startViewPosition) >= 0 && (blockRowRowForCell = richEditorListView.rowForCell(i)) != null) {
                                blockRow = blockRowRowForCell;
                            }
                            z = blockRow != null && (iIndexOf2 = arrayList.indexOf(blockRow)) >= 0 && blockRow.level > 0 && iIndexOf2 >= 0 && iIndexOf2 < arrayList.size() && ((BlockRow) arrayList.get(iIndexOf2)).level > 0;
                        } else {
                            int i7 = iArrSelectionRowRange2[0];
                            while (true) {
                                if (i7 <= iArrSelectionRowRange2[1]) {
                                    BlockRow blockRow2 = (BlockRow) arrayList.get(i7);
                                    if (blockRow2 == null || (iIndexOf = arrayList.indexOf(blockRow2)) < 0 || blockRow2.level <= 0 || iIndexOf < 0 || iIndexOf >= arrayList.size() || ((BlockRow) arrayList.get(iIndexOf)).level <= 0) {
                                        i7++;
                                    }
                                }
                            }
                        }
                        if (zCanIndentTarget || z) {
                            itemOptionsMakeOptions2.addGap();
                            if (zCanIndentTarget) {
                                final int i8 = 0;
                                itemOptionsMakeOptions2.add(R.drawable.iv_list_tab, LocaleController.getString(R.string.ArticleIndent), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (i8) {
                                            case 0:
                                                chatAttachAlertRichLayout.listView.indentSelection(false);
                                                itemOptionsMakeOptions2.dismiss();
                                                break;
                                            default:
                                                chatAttachAlertRichLayout.listView.indentSelection(true);
                                                itemOptionsMakeOptions2.dismiss();
                                                break;
                                        }
                                    }
                                }, false);
                            }
                            if (z) {
                                final int i9 = 1;
                                itemOptionsMakeOptions2.add(R.drawable.iv_list_untab, LocaleController.getString(R.string.ArticleOutdent), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (i9) {
                                            case 0:
                                                chatAttachAlertRichLayout.listView.indentSelection(false);
                                                itemOptionsMakeOptions2.dismiss();
                                                break;
                                            default:
                                                chatAttachAlertRichLayout.listView.indentSelection(true);
                                                itemOptionsMakeOptions2.dismiss();
                                                break;
                                        }
                                    }
                                }, false);
                            }
                        }
                        itemOptionsMakeOptions2.forceTop = true;
                        itemOptionsMakeOptions2.show();
                        chatAttachAlertRichLayout.menu = itemOptionsMakeOptions2;
                        break;
                    } else if (i3 == 4) {
                        RichTableCell richTableCell = richEditorListView.activeCellSelectionTable;
                        if (richTableCell == null) {
                            View viewFindFocus = richEditorListView.findFocus();
                            RichTableCell richTableCellFindTableCellAncestor = viewFindFocus instanceof RichEditText ? RichEditorListView.findTableCellAncestor((RichEditText) viewFindFocus) : null;
                            if (richTableCellFindTableCellAncestor != null && richTableCellFindTableCellAncestor.getModel() != null) {
                                View viewFindFocus2 = richEditorListView.findFocus();
                                if ((viewFindFocus2 instanceof RichEditText) && (richTableCellHostFindHostContaining = richTableCellFindTableCellAncestor.findHostContaining((RichEditText) viewFindFocus2)) != null) {
                                    pagetablecell = richTableCellHostFindHostContaining.cell;
                                }
                                if (pagetablecell != null) {
                                    richEditorListView.beginCellSelection(richTableCellFindTableCellAncestor);
                                    if (richTableCellFindTableCellAncestor.selectedCells.add(pagetablecell)) {
                                        richTableCellFindTableCellAncestor.grid.invalidate();
                                        richTableCellFindTableCellAncestor.notifyCellSelectionChanged();
                                    }
                                    richTableCell = richTableCellFindTableCellAncestor;
                                }
                            }
                        }
                        if (richTableCell == null || richTableCell.getModel() == null || richTableCell.selectedCells.isEmpty()) {
                            richEditorListView.addBlock(RichTextCell.newEmptyTable(2, 2));
                        } else {
                            richEditorListView.showTableCellMenu(richTableCell);
                        }
                        break;
                    } else if (i3 == 7) {
                        if (blockRowFindFocusedRow != null) {
                            TL_iv.PageBlock pageBlock = blockRowFindFocusedRow.block;
                            if (pageBlock instanceof TL_iv.pageBlockMath) {
                                pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                            }
                        }
                        ChatAttachAlertRichLayout.showEditLatexSheet(chatAttachAlertRichLayout.getContext(), (pageblockmath == null || TextUtils.isEmpty(pageblockmath.source)) ? "" : pageblockmath.source, new ThemeActivity$$ExternalSyntheticLambda19(17, chatAttachAlertRichLayout, pageblockmath), resourcesProvider);
                        break;
                    } else if (i3 == 9) {
                        richEditorListView.insertDetails();
                        break;
                    }
                }
                break;
            default:
                ChatAttachAlertRichLayout.this.listView.onFormattingClicked(this.f$1);
                break;
        }
    }
}
