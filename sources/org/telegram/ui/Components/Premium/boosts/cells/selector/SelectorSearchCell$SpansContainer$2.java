package org.telegram.ui.Components.Premium.boosts.cells.selector;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;

public final class SelectorSearchCell$SpansContainer$2 extends AnimatorListenerAdapter {
    public final int $r8$classId;
    public final StoryPrivacyBottomSheet.SearchUsersCell.SpansContainer this$1;
    public final ArrayList val$toDelete;

    public SelectorSearchCell$SpansContainer$2(StoryPrivacyBottomSheet.SearchUsersCell.SpansContainer spansContainer, ArrayList arrayList, int i) {
        this.$r8$classId = i;
        this.this$1 = spansContainer;
        this.val$toDelete = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.$r8$classId) {
            case 0:
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.val$toDelete;
                    int size = arrayList.size();
                    StoryPrivacyBottomSheet.SearchUsersCell.SpansContainer spansContainer = this.this$1;
                    if (i >= size) {
                        spansContainer.getClass();
                        spansContainer.removingSpans.clear();
                        spansContainer.currentAnimation = null;
                        spansContainer.animationStarted = false;
                        ((SelectorSearchCell) spansContainer.this$0).editText.setAllowDrawCursor(true);
                        ((SelectorSearchCell) spansContainer.this$0).getClass();
                        ((SelectorSearchCell) spansContainer.this$0).getClass();
                    } else {
                        spansContainer.removeView((View) arrayList.get(i));
                        i++;
                    }
                    break;
                }
                break;
            default:
                int i2 = 0;
                while (true) {
                    ArrayList arrayList2 = this.val$toDelete;
                    int size2 = arrayList2.size();
                    StoryPrivacyBottomSheet.SearchUsersCell.SpansContainer spansContainer2 = this.this$1;
                    if (i2 >= size2) {
                        spansContainer2.removingSpans.clear();
                        spansContainer2.currentAnimation = null;
                        spansContainer2.animationStarted = false;
                        ((SelectorSearchCell) spansContainer2.this$0).editText.setAllowDrawCursor(true);
                        ((SelectorSearchCell) spansContainer2.this$0).getClass();
                        ((SelectorSearchCell) spansContainer2.this$0).getClass();
                    } else {
                        spansContainer2.removeView((View) arrayList2.get(i2));
                        i2++;
                    }
                    break;
                }
                break;
        }
    }
}
