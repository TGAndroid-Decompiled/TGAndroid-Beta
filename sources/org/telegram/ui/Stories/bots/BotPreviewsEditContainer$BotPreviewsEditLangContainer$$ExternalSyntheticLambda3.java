package org.telegram.ui.Stories.bots;

import android.view.View;
import org.telegram.ui.Stories.StoriesController;

public final class BotPreviewsEditContainer$BotPreviewsEditLangContainer$$ExternalSyntheticLambda3 implements View.OnClickListener {
    public final int $r8$classId;
    public final BotPreviewsEditContainer.BotPreviewsEditLangContainer f$0;

    public BotPreviewsEditContainer$BotPreviewsEditLangContainer$$ExternalSyntheticLambda3(BotPreviewsEditContainer.BotPreviewsEditLangContainer botPreviewsEditLangContainer, int i) {
        this.$r8$classId = i;
        this.f$0 = botPreviewsEditLangContainer;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                BotPreviewsEditContainer.BotPreviewsEditLangContainer botPreviewsEditLangContainer = this.f$0;
                StoriesController.BotPreviewsList botPreviewsList = botPreviewsEditLangContainer.list;
                botPreviewsEditLangContainer.this$0.createStory(botPreviewsList == null ? "" : botPreviewsList.lang_code);
                break;
            default:
                BotPreviewsEditContainer.BotPreviewsEditLangContainer botPreviewsEditLangContainer2 = this.f$0;
                botPreviewsEditLangContainer2.this$0.deleteLang(botPreviewsEditLangContainer2.list.lang_code);
                break;
        }
    }
}
