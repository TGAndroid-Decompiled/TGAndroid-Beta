package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

public final class EmojiView$$ExternalSyntheticLambda18 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final Object f$0;

    public EmojiView$$ExternalSyntheticLambda18(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((EmojiView) this.f$0).lambda$new$15((Integer) obj, (Integer) obj2);
                break;
            case 1:
                ((EmojiView.EmojiSearchAdapter) this.f$0).foundPackListFillItems((ArrayList) obj, (UniversalAdapter) obj2);
                break;
            case 2:
                ((EmojiView.StickersSearchGridAdapter) this.f$0).foundPackListFillItems((ArrayList) obj, (UniversalAdapter) obj2);
                break;
            case 3:
                ((AIEditorAlert) this.f$0).fillItems((ArrayList) obj, (UniversalAdapter) obj2);
                break;
            case 4:
                ((AIEditorAlert.AiStyleAlert) this.f$0).fillItems((ArrayList) obj, (UniversalAdapter) obj2);
                break;
            case 5:
                ((AIEditorAlert.CreateAiStyleAlert) this.f$0).fillItems((ArrayList) obj, (UniversalAdapter) obj2);
                break;
            case 6:
                ((AdminLogFilterAlert2) this.f$0).fillItems((ArrayList) obj, (UniversalAdapter) obj2);
                break;
            case 7:
                ((ChatActivityEnterView) this.f$0).drawMessageEditText((Canvas) obj, (Utilities.Callback0Return) obj2);
                break;
            case 8:
                ((ChatAttachAlertAudioLayout) this.f$0).fillItems((ArrayList) obj, (UniversalAdapter) obj2);
                break;
            case 9:
                ((ChatAttachAlertPhotoLayout) this.f$0).lambda$onMenuItemClick$26((Long) obj, (Runnable) obj2);
                break;
            case 10:
                ((CreateRtmpStreamBottomSheet) this.f$0).fillItems((ArrayList) obj, (UniversalAdapter) obj2);
                break;
            case 11:
                ((DialogsBotsAdapter) this.f$0).fillItems((ArrayList) obj, (UniversalAdapter) obj2);
                break;
            case 12:
                ((DialogsChannelsAdapter) this.f$0).fillItems((ArrayList) obj, (UniversalAdapter) obj2);
                break;
            case 13:
                ((FragmentContextView) this.f$0).lambda$createPlaybackSpeedButton$10((Float) obj, (Boolean) obj2);
                break;
            case 14:
                ((GuardBotReplaceSheet) this.f$0).fillItems((ArrayList) obj, (UniversalAdapter) obj2);
                break;
            case 15:
                ((HashtagHistoryView) this.f$0).fillItems((ArrayList) obj, (UniversalAdapter) obj2);
                break;
            case 16:
                ((HashtagsSearchAdapter) this.f$0).fillItems((ArrayList) obj, (UniversalAdapter) obj2);
                break;
            case 17:
                ((ItemOptions.DimView) this.f$0).lambda$new$0((Bitmap) obj, (Bitmap) obj2);
                break;
            case 18:
                ((PostsSearchContainer) this.f$0).fillItems((ArrayList) obj, (UniversalAdapter) obj2);
                break;
            case 19:
                ((StickersAlert) this.f$0).lambda$onSubItemClick$24((CharSequence) obj, (Utilities.Callback) obj2);
                break;
            case 20:
                ((TranslateAlert2) this.f$0).lambda$translateAlt$6((String) obj, (Boolean) obj2);
                break;
            default:
                ((UniversalFragment) this.f$0).fillItems((ArrayList) obj, (UniversalAdapter) obj2);
                break;
        }
    }
}
