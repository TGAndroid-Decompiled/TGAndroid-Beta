package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class SearchTagsList$$ExternalSyntheticLambda12 implements AnimatedTextView.AnimatedTextDrawable.RegionCallback, AlertDialog.OnButtonClickListener, RecyclerListView.OnItemLongClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;
    public final Object f$2;
    public final Object f$3;

    public SearchTagsList$$ExternalSyntheticLambda12(Object obj, int i, Object obj2, Object obj3, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
        this.f$2 = obj2;
        this.f$3 = obj3;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 2:
                ((CreateRtmpStreamBottomSheet) this.f$0).lambda$new$5((ButtonWithCounterView) this.f$2, (TL_phone.getGroupCallStreamRtmpUrl) this.f$3, this.f$1, alertDialog, i);
                break;
            default:
                ((SharedMediaLayout) this.f$0).lambda$new$26((Theme.ResourcesProvider) this.f$3, (MessageObject) this.f$2, this.f$1, alertDialog, i);
                break;
        }
    }

    @Override
    public boolean onItemClick(View view, int i) {
        return ((SearchTagsList) this.f$0).lambda$new$4(this.f$1, (BaseFragment) this.f$2, (Theme.ResourcesProvider) this.f$3, view, i);
    }

    @Override
    public void run(CharSequence charSequence, int i, int i2) {
        ((AnimatedTextView.AnimatedTextDrawable) this.f$0).lambda$setText$0(this.f$1, (ArrayList) this.f$2, (ArrayList) this.f$3, charSequence, i, i2);
    }

    public SearchTagsList$$ExternalSyntheticLambda12(CreateRtmpStreamBottomSheet createRtmpStreamBottomSheet, ButtonWithCounterView buttonWithCounterView, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, int i) {
        this.$r8$classId = 2;
        this.f$0 = createRtmpStreamBottomSheet;
        this.f$2 = buttonWithCounterView;
        this.f$3 = getgroupcallstreamrtmpurl;
        this.f$1 = i;
    }

    public SearchTagsList$$ExternalSyntheticLambda12(SharedMediaLayout sharedMediaLayout, Theme.ResourcesProvider resourcesProvider, MessageObject messageObject, int i) {
        this.$r8$classId = 3;
        this.f$0 = sharedMediaLayout;
        this.f$3 = resourcesProvider;
        this.f$2 = messageObject;
        this.f$1 = i;
    }
}
