package org.telegram.ui.Stars;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class StarGiftSheet$$ExternalSyntheticLambda15 implements View.OnClickListener {
    public final int $r8$classId;
    public final StarGiftSheet f$0;

    public StarGiftSheet$$ExternalSyntheticLambda15(StarGiftSheet starGiftSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = starGiftSheet;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.openUpgrade();
                break;
            case 1:
                this.f$0.doUpgrade();
                break;
            case 2:
                this.f$0.lambda$set$61(view);
                break;
            case 3:
                this.f$0.lambda$openAsLearnMore$99(view);
                break;
            case 4:
                this.f$0.openUpgrade();
                break;
            case 5:
                this.f$0.lambda$set$79(view);
                break;
            case 6:
                this.f$0.onBuyPressed();
                break;
            case 7:
                this.f$0.openUpgrade();
                break;
            case 8:
                this.f$0.lambda$set$92(view);
                break;
            case 9:
                this.f$0.openCrafting(true);
                break;
            case 10:
                this.f$0.openUpgrade();
                break;
            case 11:
                StarGiftSheet starGiftSheet = this.f$0;
                starGiftSheet.shownWearInfo = true;
                starGiftSheet.toggleWear(false);
                break;
            case 12:
                StarGiftSheet starGiftSheet2 = this.f$0;
                if (!starGiftSheet2.button.loading) {
                    CheckBoxBase checkBoxBase = starGiftSheet2.checkbox.checkBoxBase;
                    checkBoxBase.setChecked(-1, !checkBoxBase.isChecked, true);
                    break;
                }
                break;
            case 13:
                this.f$0.onMenuPressed(view);
                break;
            case 14:
                this.f$0.openCrafting(true);
                break;
            case 15:
                StarGiftSheet starGiftSheet3 = this.f$0;
                starGiftSheet3.getClass();
                if (view.getAlpha() >= 0.99f) {
                    starGiftSheet3.openTransfer();
                } else {
                    starGiftSheet3.cantWithBlockchainGiftAlert();
                }
                break;
            case 16:
                this.f$0.onWearPressed();
                break;
            case 17:
                this.f$0.onSharePressed();
                break;
            case 18:
                this.f$0.onResellPressed(view);
                break;
            case 19:
                this.f$0.onUpdatePriceClick();
                break;
            case 20:
                StarGiftSheet starGiftSheet4 = this.f$0;
                if (view.getAlpha() >= 1.0f) {
                    ButtonWithCounterView buttonWithCounterView = starGiftSheet4.button;
                    buttonWithCounterView.setText(LocaleController.getString(R.string.GiftCraftInfoButton), true, true);
                    buttonWithCounterView.setSubText(null, true);
                    buttonWithCounterView.setOnClickListener(new StarGiftSheet$$ExternalSyntheticLambda15(starGiftSheet4, 21));
                    starGiftSheet4.topView.setText(3, LocaleController.getString(R.string.GiftCraftInfoTitle), LocaleController.getString(R.string.GiftCraftInfoText), null, null, null, null);
                    starGiftSheet4.switchPage(3, true, null);
                    break;
                }
                break;
            case 21:
                this.f$0.openCrafting(false);
                break;
            case 22:
                StarGiftSheet.Roller roller = this.f$0.roller;
                roller.modelRoller.skip();
                roller.symbolRoller.skip();
                roller.backdropRoller.skip();
                roller.backdropRoller2.skip();
                break;
            case 23:
                this.f$0.onBuyPressed();
                break;
            case 24:
                this.f$0.lambda$set$59(view);
                break;
            case 25:
                StarGiftSheet starGiftSheet5 = this.f$0;
                starGiftSheet5.shownWearInfo = true;
                starGiftSheet5.toggleWear(false);
                break;
            default:
                this.f$0.lambda$toggleWear$25(view);
                break;
        }
    }
}
