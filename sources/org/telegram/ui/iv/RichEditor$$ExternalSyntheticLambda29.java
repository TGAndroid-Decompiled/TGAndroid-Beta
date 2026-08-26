package org.telegram.ui.iv;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.chat.layouts.ButtonOnClickListener;
import org.telegram.ui.Components.chat.layouts.ChatActivityChannelButtonsLayout;
import org.telegram.ui.Components.chat.layouts.ChatActivitySideControlsButtonsLayout;
import org.telegram.ui.Components.glass.GlassTabView;
import org.telegram.ui.Components.voip.PrivateVideoPreviewDialog;
import org.telegram.ui.Components.voip.PrivateVideoPreviewDialogNew;
import org.telegram.ui.Stars.StarGiftPreviewSheet;
import org.telegram.ui.Stories.recorder.PreviewButtons;
import org.telegram.ui.Stories.recorder.SelectAudioAlert$$ExternalSyntheticLambda5;
import org.telegram.ui.Stories.recorder.StoryRecorder;

public final class RichEditor$$ExternalSyntheticLambda29 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;

    public RichEditor$$ExternalSyntheticLambda29(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
    }

    @Override
    public final void onClick(View view) {
        Utilities.Callback callback;
        int i = 1;
        int i2 = this.f$1;
        Object obj = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                ((RichEditor) obj).listView.onFormattingClicked(i2);
                break;
            case 1:
                ((ChatActivityChannelButtonsLayout) obj).lambda$showButton$0(i2, view);
                break;
            case 2:
                ButtonOnClickListener buttonOnClickListener = ((ChatActivitySideControlsButtonsLayout) obj).onClickListener;
                if (buttonOnClickListener != null) {
                    buttonOnClickListener.onClick(i2, view);
                }
                break;
            case 3:
                ((PrivateVideoPreviewDialog) obj).lambda$new$1(i2, view);
                break;
            case 4:
                ((PrivateVideoPreviewDialogNew) obj).lambda$new$1$1(i2, view);
                break;
            case 5:
                Utilities.Callback callback2 = (Utilities.Callback) obj;
                if (callback2 != null) {
                    callback2.run(Integer.valueOf(i2));
                }
                break;
            case 6:
                StarGiftPreviewSheet starGiftPreviewSheet = (StarGiftPreviewSheet) obj;
                starGiftPreviewSheet.getClass();
                int i3 = StarGiftPreviewSheet.TabsSelectorView.$r8$clinit;
                StarGiftPreviewSheet.TabsSelectorView tabsSelectorView = starGiftPreviewSheet.tabsSelectorView;
                int i4 = tabsSelectorView.selectedTab;
                if (i4 != i2) {
                    GlassTabView[] glassTabViewArr = tabsSelectorView.tabs;
                    glassTabViewArr[i4].setSelected(false, true);
                    glassTabViewArr[i2].setSelected(true, true);
                    tabsSelectorView.selectedTab = i2;
                    tabsSelectorView.animator.animateTo(i2);
                    tabsSelectorView.onTabSelectListener.run(Integer.valueOf(i2));
                }
                break;
            case 7:
                StarGiftPreviewSheet.TabsSelectorView tabsSelectorView2 = (StarGiftPreviewSheet.TabsSelectorView) obj;
                int i5 = tabsSelectorView2.selectedTab;
                if (i5 != i2) {
                    GlassTabView[] glassTabViewArr2 = tabsSelectorView2.tabs;
                    glassTabViewArr2[i5].setSelected(false, true);
                    glassTabViewArr2[i2].setSelected(true, true);
                    tabsSelectorView2.selectedTab = i2;
                    tabsSelectorView2.animator.animateTo(i2);
                    tabsSelectorView2.onTabSelectListener.run(Integer.valueOf(i2));
                }
                break;
            case 8:
                StoryRecorder.AnonymousClass11 anonymousClass11 = (StoryRecorder.AnonymousClass11) obj;
                if (!anonymousClass11.selectedStories.contains(Integer.valueOf(i2))) {
                    anonymousClass11.selectedStories.add(Integer.valueOf(i2));
                } else if (anonymousClass11.selectedStories.size() > 1) {
                    anonymousClass11.selectedStories.remove(Integer.valueOf(i2));
                }
                AndroidUtilities.forEachViews((RecyclerView) anonymousClass11.listView, (Consumer) new SelectAudioAlert$$ExternalSyntheticLambda5(anonymousClass11, i));
                break;
            default:
                PreviewButtons previewButtons = PreviewButtons.this;
                if (previewButtons.appearing && (callback = previewButtons.onClickListener) != null) {
                    callback.run(Integer.valueOf(i2));
                    break;
                }
                break;
        }
    }
}
