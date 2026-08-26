package org.telegram.ui.iv;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticLambda14;
import org.telegram.ui.Cells.SharedPhotoVideoCell2;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.Gifts.SendGiftSheet$$ExternalSyntheticLambda16;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.bots.BotPreviewsEditContainer;
import org.telegram.ui.TopicsFragment;
import org.telegram.ui.bots.AffiliateProgramFragment;
import org.telegram.ui.bots.AffiliateProgramFragment$$ExternalSyntheticLambda13;
import org.telegram.ui.bots.AffiliateProgramFragment$$ExternalSyntheticLambda4;
import org.telegram.ui.bots.SuggestedAffiliateProgramsFragment;

public final class RichEditor$3$$ExternalSyntheticLambda0 implements OnApplyWindowInsetsListener, Utilities.Callback2Return, RecyclerListView.OnItemLongClickListener, AlertDialog.OnButtonClickListener, Utilities.Callback5, EditTextCaption.EditTextCaptionDelegate, RichCommandSuggestions$MenuFactory, DialogsActivity.DialogsActivityDelegate, RichTableCellGrid.CellSelectionProvider {
    public final int $r8$classId;
    public final Object f$0;

    public RichEditor$3$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public boolean canSelectStories() {
        return DialogsActivity.DialogsActivityDelegate.CC.$default$canSelectStories(this);
    }

    @Override
    public boolean didSelectDialogs(DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
        if (arrayList == null || arrayList.isEmpty() || ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId <= 0) {
            return false;
        }
        ((RichInlineButtonEditor.UserPicked) this.f$0).run(((MessagesStorage.TopicKey) arrayList.get(0)).dialogId);
        dialogsActivity.finishFragment();
        return true;
    }

    @Override
    public boolean didSelectStories(DialogsActivity dialogsActivity) {
        return DialogsActivity.DialogsActivityDelegate.CC.$default$didSelectStories(this, dialogsActivity);
    }

    @Override
    public ItemOptions make(RichEditText richEditText) {
        return ItemOptions.makeOptions((RichEditor) ((RichEditor.AnonymousClass3) this.f$0).this$0, richEditText);
    }

    @Override
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        StoryViewer storyViewer = (StoryViewer) this.f$0;
        storyViewer.getClass();
        Insets defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(windowInsetsCompat, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) storyViewer.containerView.getLayoutParams();
        marginLayoutParams.topMargin = storyViewer.ATTACHED_FRAGMENT_IS_EDGE_TO_EDGE ? 0 : windowInsetsCompat.getSystemWindowInsetTop();
        marginLayoutParams.bottomMargin = storyViewer.ATTACHED_FRAGMENT_IS_EDGE_TO_EDGE ? windowInsetsCompat.mImpl.getInsets(2).bottom : windowInsetsCompat.getSystemWindowInsetBottom();
        marginLayoutParams.leftMargin = defaultWindowInsets.left;
        marginLayoutParams.rightMargin = defaultWindowInsets.right;
        StoryViewer.AnonymousClass2 anonymousClass2 = storyViewer.windowView;
        if (anonymousClass2 != null) {
            anonymousClass2.requestLayout();
        }
        StoryViewer.AnonymousClass3 anonymousClass3 = storyViewer.containerView;
        if (anonymousClass3 != null) {
            anonymousClass3.requestLayout();
        }
        return WindowInsetsCompat.CONSUMED;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) throws Throwable {
        switch (this.$r8$classId) {
            case 4:
                ((AffiliateProgramFragment$$ExternalSyntheticLambda4) this.f$0).run();
                break;
            case 5:
                AffiliateProgramFragment affiliateProgramFragment = (AffiliateProgramFragment) this.f$0;
                affiliateProgramFragment.getClass();
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = affiliateProgramFragment.getMessagesController().getInputUser(affiliateProgramFragment.bot_id);
                updatestarrefprogram.commission_permille = 0;
                AlertDialog alertDialog2 = new AlertDialog(affiliateProgramFragment.getContext(), 3, null);
                AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog2.showRunnable;
                AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
                AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 150L);
                affiliateProgramFragment.getConnectionsManager().sendRequest(updatestarrefprogram, new AffiliateProgramFragment$$ExternalSyntheticLambda13(affiliateProgramFragment, alertDialog2, 0));
                break;
            case 6:
                try {
                    ((Context) this.f$0).startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                } catch (Exception unused) {
                    return;
                }
                break;
            case 7:
            case 8:
            case 9:
            default:
                ((SendGiftSheet$$ExternalSyntheticLambda16) this.f$0).run();
                break;
            case 10:
                ((Theme$$ExternalSyntheticLambda14) this.f$0).run();
                break;
        }
    }

    @Override
    public boolean onItemClick(View view, int i) {
        BotPreviewsEditContainer botPreviewsEditContainer = BotPreviewsEditContainer.this;
        if (botPreviewsEditContainer.isActionModeShowed() || !(view instanceof SharedPhotoVideoCell2)) {
            return false;
        }
        MessageObject messageObject = ((SharedPhotoVideoCell2) view).getMessageObject();
        if (botPreviewsEditContainer.isSelected(messageObject)) {
            botPreviewsEditContainer.unselect(messageObject);
            return true;
        }
        botPreviewsEditContainer.select(messageObject);
        return true;
    }

    @Override
    public void onSpansChanged() {
        switch (this.$r8$classId) {
            case 8:
                RichDetailsCell richDetailsCell = (RichDetailsCell) this.f$0;
                BlockRow blockRow = richDetailsCell.currentRow;
                RichEditText richEditText = richDetailsCell.editText;
                if (blockRow != null) {
                    blockRow.titleAutoBoldInitialized = true;
                    blockRow.titleAutoBold = richEditText.autoBold;
                }
                if (blockRow != null) {
                    TL_iv.PageBlock pageBlock = blockRow.block;
                    if (pageBlock instanceof TL_iv.pageBlockDetails) {
                        ((TL_iv.pageBlockDetails) pageBlock).title = RichTextStyle.fromSpannable(richEditText.getText());
                    }
                }
                RichEditorListView.AnonymousClass13 anonymousClass13 = richDetailsCell.delegate;
                if (anonymousClass13 != null && richDetailsCell.currentRow != null) {
                    RichEditorListView.access$3700(RichEditorListView.this);
                    break;
                }
                break;
            case 12:
                ((RichQuoteAuthorCell) this.f$0).persist();
                break;
            default:
                RichTableCell richTableCell = (RichTableCell) this.f$0;
                BlockRow blockRow2 = richTableCell.currentRow;
                RichEditText richEditText2 = richTableCell.titleEditText;
                if (blockRow2 != null) {
                    blockRow2.titleAutoBoldInitialized = true;
                    blockRow2.titleAutoBold = richEditText2.autoBold;
                }
                if (blockRow2 != null) {
                    TL_iv.PageBlock pageBlock2 = blockRow2.block;
                    if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                        ((TL_iv.pageBlockTable) pageBlock2).title = RichTextStyle.fromSpannable(richEditText2.getText());
                    }
                }
                RichEditorListView.AnonymousClass12 anonymousClass12 = richTableCell.delegate;
                if (anonymousClass12 != null && richTableCell.currentRow != null) {
                    RichEditorListView.access$3700(RichEditorListView.this);
                    break;
                }
                break;
        }
    }

    @Override
    public Object run(Object obj, Object obj2) {
        return ((BotPreviewsEditContainer) this.f$0).lambda$new$0((Integer) obj, (Integer) obj2);
    }

    @Override
    public void mo1122run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        UItem uItem = (UItem) obj;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        switch (this.$r8$classId) {
            case 7:
                num.getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                ((SuggestedAffiliateProgramsFragment) this.f$0).onItemClick(uItem);
                break;
            default:
                Float f = (Float) obj4;
                Float f2 = (Float) obj5;
                if (((RichEditorListView[]) this.f$0)[0] != null) {
                    num.getClass();
                    f.getClass();
                    f2.getClass();
                    if (view instanceof RichTextCell) {
                        ((RichTextCell) view).editText.requestEditFocus();
                    }
                }
                break;
        }
    }
}
