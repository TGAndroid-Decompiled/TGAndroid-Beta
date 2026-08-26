package org.telegram.ui.iv;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.ItemOptions;
import org.webrtc.EglRenderer$$ExternalSyntheticLambda6;

public final class RichTextCell$$ExternalSyntheticLambda1 implements View.OnClickListener {
    public final int $r8$classId;
    public final RichTextCell f$0;

    public RichTextCell$$ExternalSyntheticLambda1(RichTextCell richTextCell, int i) {
        this.$r8$classId = i;
        this.f$0 = richTextCell;
    }

    @Override
    public final void onClick(View view) {
        Set<String> languages;
        switch (this.$r8$classId) {
            case 0:
                RichTextCell richTextCell = this.f$0;
                BlockRow blockRow = richTextCell.currentRow;
                if (blockRow != null && blockRow.checkbox) {
                    boolean z = !blockRow.checked;
                    blockRow.checked = z;
                    ((CheckBoxBase) richTextCell.checkBoxView.progressDrawable).setChecked(z, true);
                    RichTextCell.Delegate delegate = richTextCell.delegate;
                    if (delegate != null) {
                        BlockRow blockRow2 = richTextCell.currentRow;
                        boolean z2 = blockRow2.checked;
                        RichEditorListView richEditorListView = RichEditorListView.this;
                        richEditorListView.getClass();
                        blockRow2.checked = z2;
                        RichEditorHistory richEditorHistory = richEditorListView.history;
                        if (richEditorHistory != null) {
                            AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
                            richEditorHistory.commit();
                            richEditorListView.history.record();
                        }
                    }
                    break;
                }
                break;
            default:
                RichTextCell richTextCell2 = this.f$0;
                RichTextCell.Delegate delegate2 = richTextCell2.delegate;
                if (delegate2 != null) {
                    BlockRow blockRow3 = richTextCell2.currentRow;
                    RichEditorListView richEditorListView2 = RichEditorListView.this;
                    richEditorListView2.getClass();
                    if (blockRow3 != null && (blockRow3.block instanceof TL_iv.pageBlockPreformatted) && (languages = CodeHighlighting.getLanguages()) != null) {
                        ArrayList arrayList = new ArrayList(languages);
                        Collections.sort(arrayList);
                        TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) blockRow3.block;
                        ItemOptions itemOptionsMakeMenu = richEditorListView2.delegate.makeMenu(view);
                        itemOptionsMakeMenu.setScrimViewBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(3.0f), Theme.getColor(Theme.key_windowBackgroundWhite, richEditorListView2.resourcesProvider)));
                        itemOptionsMakeMenu.allowShowingOnTopOfKeyboard();
                        itemOptionsMakeMenu.setMaxHeight(AndroidUtilities.dp(350.0f));
                        itemOptionsMakeMenu.addChecked(TextUtils.isEmpty(pageblockpreformatted.language), LocaleController.getString(R.string.ArticleNone), new RichEditorListView$$ExternalSyntheticLambda2(richEditorListView2, blockRow3, 25));
                        if (!TextUtils.isEmpty(pageblockpreformatted.language)) {
                            itemOptionsMakeMenu.addChecked(true, MessageObject.TextLayoutBlock.capitalizeLanguage(pageblockpreformatted.language), null);
                        }
                        itemOptionsMakeMenu.addGap();
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            String str = (String) obj;
                            itemOptionsMakeMenu.addChecked(TextUtils.equals(str, pageblockpreformatted.language), MessageObject.TextLayoutBlock.capitalizeLanguage(str), new EglRenderer$$ExternalSyntheticLambda6(richEditorListView2, blockRow3, str, 12));
                        }
                        itemOptionsMakeMenu.show();
                        break;
                    }
                }
                break;
        }
    }
}
