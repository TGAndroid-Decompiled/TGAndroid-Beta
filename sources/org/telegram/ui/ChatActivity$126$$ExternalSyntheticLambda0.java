package org.telegram.ui;

import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.ExoPlayerImpl;
import com.google.android.gms.internal.mlkit_vision_common.zzlb;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Stories.recorder.HintView2;

public final class ChatActivity$126$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;
    public final int f$2;
    public final Object f$3;

    public ChatActivity$126$$ExternalSyntheticLambda0(int i, int i2, String str, String str2) {
        this.$r8$classId = 2;
        this.f$1 = i;
        this.f$0 = str;
        this.f$3 = str2;
        this.f$2 = i2;
    }

    @Override
    public final void run() {
        final int i = 0;
        final int i2 = 1;
        int i3 = this.f$1;
        int i4 = this.f$2;
        Object obj = this.f$3;
        Object obj2 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                ((ChatActivity) obj2).didReceivedNotification(i3, i4, (Object[]) obj);
                break;
            case 1:
                int i5 = ExoPlayerImpl.$r8$clinit;
                ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
                exoPlayerImpl.getClass();
                Surface surface = new Surface((SurfaceTexture) obj);
                exoPlayerImpl.setVideoOutputInternal(surface);
                exoPlayerImpl.ownedSurface = surface;
                exoPlayerImpl.maybeNotifySurfaceSizeChanged(i3, i4);
                break;
            case 2:
                ConnectionsManager.lambda$onIntegrityCheckClassic$27(i3, (String) obj2, (String) obj, i4);
                break;
            case 3:
                ChatActivity.ChatActivityAdapter.AnonymousClass2 anonymousClass2 = (ChatActivity.ChatActivityAdapter.AnonymousClass2) obj2;
                anonymousClass2.getClass();
                MessageObject messageObject = ((ChatActionCell) obj).getMessageObject();
                ChatActivity.ChatActivityAdapter chatActivityAdapter = ChatActivity.ChatActivityAdapter.this;
                ChatActivity.this.scrollToMessageId(this.f$1, messageObject.getId(), true, messageObject.getDialogId() == ChatActivity.this.mergeDialogId ? 1 : 0, true, 0, Integer.valueOf(i4), null, null);
                break;
            case 4:
                ChatActivity chatActivity = ChatActivity.this;
                if (chatActivity.factCheckHint != null) {
                    int[] iArr = new int[2];
                    ((ChatMessageCell) obj).getLocationInWindow(iArr);
                    HintView2 hintView2 = chatActivity.factCheckHint;
                    hintView2.setTranslationY(zzlb.m(iArr[1] - hintView2.getTop(), 520.0f, i3));
                    chatActivity.factCheckHint.setJointPx(0.0f, (-AndroidUtilities.dp(16.0f)) + iArr[0] + i4);
                    chatActivity.factCheckHint.show();
                    break;
                }
                break;
            default:
                final DialogsActivity.SwipeController swipeController = (DialogsActivity.SwipeController) obj2;
                DialogsActivity dialogsActivity = DialogsActivity.this;
                ArrayList arrayList = dialogsActivity.frozenDialogsList;
                if (arrayList != null) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) obj;
                    arrayList.remove(dialog);
                    int i6 = dialog.pinnedNum;
                    dialogsActivity.slidingView = null;
                    DialogsActivity.ViewPage viewPage = swipeController.parentPage;
                    viewPage.listView.invalidate();
                    int iFindLastVisibleItemPosition = viewPage.layoutManager.findLastVisibleItemPosition();
                    if (iFindLastVisibleItemPosition == i3 - 1) {
                        viewPage.layoutManager.findViewByPosition(iFindLastVisibleItemPosition).requestLayout();
                    }
                    if (!dialogsActivity.getMessagesController().isPromoDialog(dialog.id, false)) {
                        int iAddDialogToFolder = dialogsActivity.getMessagesController().addDialogToFolder(dialog.id, dialogsActivity.folderId == 0 ? 1 : 0, -1, 0L);
                        if (iAddDialogToFolder != 2 || i4 != 0) {
                            viewPage.dialogsItemAnimator.prepareForRemove();
                            viewPage.updateList(true);
                        }
                        if (dialogsActivity.folderId == 0) {
                            if (iAddDialogToFolder == 2) {
                                if (SharedConfig.archiveHidden) {
                                    SharedConfig.toggleArchiveHidden();
                                }
                                viewPage.dialogsItemAnimator.prepareForRemove();
                                if (i4 == 0) {
                                    dialogsActivity.setDialogsListFrozen(true, true);
                                    viewPage.updateList(true);
                                    dialogsActivity.checkAnimationFinished();
                                } else {
                                    viewPage.updateList(true);
                                    if (!SharedConfig.archiveHidden && viewPage.layoutManager.findFirstVisibleItemPosition() == 0) {
                                        dialogsActivity.disableActionBarScrolling = true;
                                        viewPage.listView.smoothScrollBy(0, -AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 76.0f : 70.0f), null);
                                    }
                                }
                                dialogsActivity.frozenDialogsList.add(0, (TLRPC.Dialog) dialogsActivity.getDialogsArray(((BaseFragment) dialogsActivity).currentAccount, viewPage.dialogsType, dialogsActivity.folderId, false).get(0));
                                viewPage.updateList(true);
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (i) {
                                            case 0:
                                                DialogsActivity.this.setDialogsListFrozen(false, true);
                                                break;
                                            default:
                                                DialogsActivity.this.setDialogsListFrozen(false, true);
                                                break;
                                        }
                                    }
                                }, 300L);
                            } else if (iAddDialogToFolder == 1) {
                                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = viewPage.listView.findViewHolderForAdapterPosition(0);
                                if (viewHolderFindViewHolderForAdapterPosition != null) {
                                    View view = viewHolderFindViewHolderForAdapterPosition.itemView;
                                    if (view instanceof DialogCell) {
                                        DialogCell dialogCell = (DialogCell) view;
                                        dialogCell.getClass();
                                        dialogCell.animateArchiveAvatar();
                                    }
                                }
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (i2) {
                                            case 0:
                                                DialogsActivity.this.setDialogsListFrozen(false, true);
                                                break;
                                            default:
                                                DialogsActivity.this.setDialogsListFrozen(false, true);
                                                break;
                                        }
                                    }
                                }, 300L);
                            }
                            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                            i = (globalMainSettings.getBoolean("archivehint_l", false) || SharedConfig.archiveHidden) ? 1 : 0;
                            if (i == 0) {
                                globalMainSettings.edit().putBoolean("archivehint_l", true).commit();
                            }
                            UndoView undoView = dialogsActivity.getUndoView();
                            if (undoView != null) {
                                undoView.showWithAction(dialog.id, i != 0 ? 2 : 3, (Object) null, (Object) null, (Runnable) null, new PollItemMenu$$ExternalSyntheticLambda17(swipeController, dialog, i6, 18));
                            }
                        }
                        if (dialogsActivity.folderId != 0 && dialogsActivity.frozenDialogsList.isEmpty()) {
                            viewPage.listView.setEmptyView(null);
                            viewPage.progressView.setVisibility(4);
                            break;
                        }
                    } else {
                        dialogsActivity.getMessagesController().hidePromoDialog();
                        viewPage.dialogsItemAnimator.prepareForRemove();
                        viewPage.updateList(true);
                        break;
                    }
                }
                break;
        }
    }

    public ChatActivity$126$$ExternalSyntheticLambda0(Object obj, Object obj2, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$3 = obj2;
        this.f$1 = i;
        this.f$2 = i2;
    }

    public ChatActivity$126$$ExternalSyntheticLambda0(ChatActivity chatActivity, int i, int i2, Object[] objArr) {
        this.$r8$classId = 0;
        this.f$0 = chatActivity;
        this.f$1 = i;
        this.f$2 = i2;
        this.f$3 = objArr;
    }
}
