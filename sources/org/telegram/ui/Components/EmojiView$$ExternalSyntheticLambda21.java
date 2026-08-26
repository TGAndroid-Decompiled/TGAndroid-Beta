package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.os.Bundle;
import android.view.View;
import androidx.collection.LongSparseArray;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.inputmethod.InputConnectionCompat$OnCommitContentListener;
import androidx.core.view.inputmethod.InputContentInfoCompat;
import java.util.ArrayList;
import java.util.HashMap;
import me.vkryl.android.animator.ListAnimator;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.Cells.PhotoAttachPhotoCell;
import org.telegram.ui.Components.blur3.ViewGroupPartRenderer;
import org.telegram.ui.Components.quickforward.BlurVisibilityDrawable;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.StoryViewer$$ExternalSyntheticLambda2;

public final class EmojiView$$ExternalSyntheticLambda21 implements AlertDialog.OnButtonClickListener, InputConnectionCompat$OnCommitContentListener, CameraController.VideoTakeCallback, PhotoAttachPhotoCell.ParentFastScrollDelegate, StoryViewer.PlaceProvider, ActionBarMenuItem.ActionBarMenuItemDelegate, ViewGroupPartRenderer.DrawChildMethod, Utilities.Callback5, SearchAdapterHelper.SearchAdapterHelperDelegate, ProfileGooeyView.Drawer, MessagesStorage.StringCallback, RecyclerListView.OnItemClickListenerExtended, NumberPicker.OnScrollListener, NumberPicker.OnValueChangeListener, NumberPicker.Formatter, ListAnimator.Callback, AlertsCreator.ScheduleDatePickerDelegate, OnApplyWindowInsetsListener, BlurVisibilityDrawable.DrawRunnable, RecyclerListView.OnItemLongClickListener {
    public final int $r8$classId;
    public final Object f$0;

    public EmojiView$$ExternalSyntheticLambda21(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public boolean canApplySearchResults(int i) {
        return true;
    }

    @Override
    public void didSelectDate(boolean z, int i, int i2) {
        AutoDeletePopupWrapper.lambda$new$4((AutoDeletePopupWrapper.Callback) this.f$0, z, i, i2);
    }

    @Override
    public void draw(Canvas canvas) {
        ((ProfileGooeyView) this.f$0).lambda$draw$0(canvas);
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j) {
        return ((EmojiView.EmojiGridView) this.f$0).drawChild(canvas, view, j);
    }

    @Override
    public boolean findView(long j, int i, int i2, int i3, StoryViewer.TransitionViewHolder transitionViewHolder) {
        return ((ChatAvatarContainer.AnonymousClass1.C00161) this.f$0).lambda$openStory$0(j, i, i2, i3, transitionViewHolder);
    }

    @Override
    public String format(int i) {
        return AlertsCreator.lambda$createCustomPicker$263((String[]) this.f$0, i);
    }

    @Override
    public LongSparseArray getExcludeCallParticipants() {
        return null;
    }

    @Override
    public LongSparseArray getExcludeUsers() {
        return null;
    }

    @Override
    public boolean hasChanges(ListAnimator listAnimator) {
        return false;
    }

    @Override
    public boolean hasDoubleTap(View view, int i) {
        return RecyclerListView.OnItemClickListenerExtended.CC.$default$hasDoubleTap(this, view, i);
    }

    public boolean isInFastScroll() {
        return ((ChatAttachAlertPhotoLayout.PhotoAttachAdapter) this.f$0).isInFastScroll();
    }

    @Override
    public void loadNext(boolean z) {
    }

    @Override
    public boolean onApplyMetadataAnimation(ListAnimator listAnimator, float f) {
        return false;
    }

    @Override
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        return ((Bulletin.BulletinWindow) this.f$0).lambda$new$0(view, windowInsetsCompat);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 1:
                ((ChatActivityEnterView.AnonymousClass79) this.f$0).lambda$onClearEmojiRecent$4(alertDialog, i);
                break;
            case 5:
                ((ChatAttachAlertPollLayout.AnonymousClass10) this.f$0).lambda$onClearEmojiRecent$0(alertDialog, i);
                break;
            case 7:
                ((EditTextEmoji.AnonymousClass7) this.f$0).lambda$onClearEmojiRecent$0(alertDialog, i);
                break;
            case 10:
                ((EmojiView.StickersGridAdapter) this.f$0).lambda$onCreateViewHolder$0(alertDialog, i);
                break;
            case 16:
                ((AIEditorAlert.CreateAiStyleAlert) this.f$0).lambda$new$4(alertDialog, i);
                break;
            case 21:
                ((AlertsCreator$$ExternalSyntheticLambda254) this.f$0).run();
                break;
            case 22:
                ((ShareAlert$$ExternalSyntheticLambda1) this.f$0).run();
                break;
            case 27:
                ChatActivityEnterView.ControlsView.lambda$onTouchEvent$6((FilterGLThread$$ExternalSyntheticLambda7) this.f$0, alertDialog, i);
                break;
            default:
                ((ChatAttachAlertPollLayout) this.f$0).lambda$checkDiscard$9(alertDialog, i);
                break;
        }
    }

    @Override
    public boolean onCommitContent(InputContentInfoCompat inputContentInfoCompat, int i, Bundle bundle) {
        return ((ChatActivityEnterView.ChatActivityEditTextCaption) this.f$0).lambda$onCreateInputConnection$1(inputContentInfoCompat, i, bundle);
    }

    @Override
    public void onDataSetChanged(int i) {
        ((InviteMembersBottomSheet.SearchAdapter) this.f$0).lambda$new$0(i);
    }

    @Override
    public void onDoubleTap(View view, int i, float f, float f2) {
        RecyclerListView.OnItemClickListenerExtended.CC.$default$onDoubleTap(this, view, i, f, f2);
    }

    @Override
    public void onFinishMetadataAnimation(ListAnimator listAnimator, boolean z) {
    }

    @Override
    public void onFinishVideoRecording(String str, long j) {
        ((ChatAttachAlertPhotoLayout.AnonymousClass10) this.f$0).lambda$shutterLongPressed$1(str, j);
    }

    @Override
    public void onForceApplyChanges(ListAnimator listAnimator) {
    }

    @Override
    public void onItemClick(int i) {
        EmojiPacksAlert.access$6500((EmojiPacksAlert) this.f$0, i);
    }

    @Override
    public void onItemsChanged(ListAnimator listAnimator) {
        ((AnimatedLinearLayout) this.f$0).lambda$new$0(listAnimator);
    }

    @Override
    public void onPrepareMetadataAnimation(ListAnimator listAnimator) {
    }

    @Override
    public void onScrollStateChange(NumberPicker numberPicker, int i) {
        AlertsCreator.lambda$createBirthdayPickerDialog$145((AlertsCreator$$ExternalSyntheticLambda127) this.f$0, numberPicker, i);
    }

    @Override
    public void onSetHashtags(ArrayList arrayList, HashMap map) {
    }

    @Override
    public void onValueChange(NumberPicker numberPicker, int i, int i2) {
        AlertsCreator.lambda$createAutoDeleteDatePickerDialog$179((AnimatedTextView) this.f$0, numberPicker, i, i2);
    }

    @Override
    public void preLayout(long j, int i, Runnable runnable) {
        ((StoryViewer$$ExternalSyntheticLambda2) runnable).run();
    }

    @Override
    public void mo1122run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.$r8$classId) {
            case 9:
                int iIntValue = ((Integer) obj3).intValue();
                float fFloatValue = ((Float) obj4).floatValue();
                float fFloatValue2 = ((Float) obj5).floatValue();
                ((EmojiView.EmojiSearchAdapter) this.f$0).foundPackListOnClickItem((UItem) obj, (View) obj2, iIntValue, fFloatValue, fFloatValue2);
                break;
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                float fFloatValue3 = ((Float) obj4).floatValue();
                float fFloatValue4 = ((Float) obj5).floatValue();
                ((EmojiView.StickersSearchGridAdapter) this.f$0).foundPackListOnClickItem((UItem) obj, (View) obj2, iIntValue2, fFloatValue3, fFloatValue4);
                break;
        }
    }

    @Override
    public void draw(Canvas canvas, int i) {
        ((Bulletin.Layout) this.f$0).dispatchDrawImplBlur(canvas, i);
    }

    @Override
    public void onItemClick(View view, int i, float f, float f2) {
        ((AdminLogFilterAlert2) this.f$0).lambda$new$0(view, i, f, f2);
    }

    @Override
    public void run(String str) {
        switch (this.$r8$classId) {
            case 14:
                ((SharedMediaLayout.AnonymousClass14) this.f$0).lambda$onTabAlbumCreateCollection$1(str);
                break;
            default:
                ((SharedMediaLayout.AnonymousClass5) this.f$0).lambda$onClick$13(str);
                break;
        }
    }

    @Override
    public boolean onItemClick(View view, int i) {
        return ((ChatAttachAlertDocumentLayout) this.f$0).lambda$new$2(view, i);
    }
}
