package org.telegram.ui.iv;

import android.view.KeyEvent;
import android.view.TextureView;
import org.telegram.messenger.MessagesStorage;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.Premium.VideoScreenPreview;
import org.telegram.ui.Stories.recorder.CollageLayoutView2;
import org.telegram.ui.Stories.recorder.StoryEntry;

public final class RichEditorListView$$ExternalSyntheticLambda53 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;
    public final int f$2;
    public final int f$3;

    public RichEditorListView$$ExternalSyntheticLambda53(Object obj, int i, int i2, int i3, int i4) {
        this.$r8$classId = i4;
        this.f$0 = obj;
        this.f$1 = i;
        this.f$2 = i2;
        this.f$3 = i3;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                RichEditorListView richEditorListView = (RichEditorListView) this.f$0;
                KeyEvent.Callback callbackSelectableAt = richEditorListView.selectableAt(this.f$1);
                if (callbackSelectableAt instanceof TextSelectionHelper.ArticleSelectableView) {
                    richEditorListView.textSelectionHelper.extendSelectionTo(this.f$2, this.f$3, (TextSelectionHelper.ArticleSelectableView) callbackSelectableAt);
                }
                break;
            case 1:
                ((MessagesStorage) this.f$0).lambda$setMessageSeq$211(this.f$1, this.f$2, this.f$3);
                break;
            case 2:
                CollageLayoutView2.Part part = (CollageLayoutView2.Part) ((VideoScreenPreview.AnonymousClass3) this.f$0).this$0;
                StoryEntry storyEntry = part.content;
                if (storyEntry != null) {
                    int i = storyEntry.width;
                    int i2 = this.f$1;
                    int i3 = this.f$2;
                    int i4 = this.f$3;
                    if (i != i2 || storyEntry.height != i3 || storyEntry.orientation != i4) {
                        storyEntry.width = i2;
                        storyEntry.height = i3;
                        storyEntry.orientation = i4;
                        TextureView textureView = part.textureView;
                        if (textureView != null) {
                            textureView.requestLayout();
                        }
                    }
                    break;
                }
                break;
            default:
                RichEditorListView.access$1400(RichEditorListView.this, this.f$1, this.f$2, this.f$3);
                break;
        }
    }
}
