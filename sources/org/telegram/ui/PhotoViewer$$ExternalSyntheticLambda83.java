package org.telegram.ui;

import android.view.View;

public final class PhotoViewer$$ExternalSyntheticLambda83 implements View.OnLongClickListener {
    public final int $r8$classId;
    public final Object f$0;

    public PhotoViewer$$ExternalSyntheticLambda83(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                return ((PhotoViewer) this.f$0).lambda$setParentActivity$64(view);
            case 1:
                return ((CalendarActivity.MonthView) this.f$0).lambda$new$0(view);
            case 2:
                return ((ChatActivity.AnonymousClass67) this.f$0).lambda$new$0(view);
            case 3:
                return ((ArticleViewer) this.f$0).lambda$setParentActivity$32(view);
            case 4:
                return ((PhotoAlbumPickerActivity) this.f$0).lambda$createView$7(view);
            case 5:
                return ((PhotoPickerActivity) this.f$0).lambda$createView$9(view);
            case 6:
                return ((ProfileActivity) this.f$0).lambda$createView$38(view);
            default:
                return ((SelectAnimatedEmojiDialog) this.f$0).lambda$new$2(view);
        }
    }
}
