package org.telegram.ui.Components;

import android.view.View;

public final class TranslateAlert3$$ExternalSyntheticLambda2 implements View.OnClickListener {
    public final int $r8$classId;
    public final TranslateAlert3 f$0;

    public TranslateAlert3$$ExternalSyntheticLambda2(TranslateAlert3 translateAlert3, int i) {
        this.$r8$classId = i;
        this.f$0 = translateAlert3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.onToLangMenu(view);
                break;
            case 1:
                this.f$0.lambda$requestTranslate$12(view);
                break;
            case 2:
                this.f$0.lambda$requestTranslate$13(view);
                break;
            case 3:
                this.f$0.lambda$new$0(view);
                break;
            case 4:
                this.f$0.lambda$show$9(view);
                break;
            default:
                this.f$0.lambda$requestTranslate$10(view);
                break;
        }
    }
}
