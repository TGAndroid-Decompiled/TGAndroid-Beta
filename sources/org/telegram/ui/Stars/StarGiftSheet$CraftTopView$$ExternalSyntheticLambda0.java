package org.telegram.ui.Stars;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda13;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda18;
import org.telegram.ui.ProfileActivity$9$$ExternalSyntheticLambda1;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.bots.AffiliateProgramFragment;

public final class StarGiftSheet$CraftTopView$$ExternalSyntheticLambda0 implements View.OnClickListener {
    public final int $r8$classId;
    public final StarGiftSheet.CraftTopView f$0;

    public StarGiftSheet$CraftTopView$$ExternalSyntheticLambda0(StarGiftSheet.CraftTopView craftTopView, int i) {
        this.$r8$classId = i;
        this.f$0 = craftTopView;
    }

    @Override
    public final void onClick(View view) {
        ArrayList arrayList;
        TL_stars.StarGift starGift;
        TL_stars.StarGift starGift2;
        StarGiftSheet.CraftTopView.SelectGiftView selectGiftView;
        boolean z = false;
        StarGiftSheet.CraftTopView craftTopView = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                if (craftTopView.buttonsLayout.getAlpha() >= 1.0f) {
                    craftTopView.onClose.run();
                    break;
                }
                break;
            case 1:
                if (craftTopView.buttonsLayout.getAlpha() >= 1.0f) {
                    craftTopView.onClose.run();
                    break;
                }
                break;
            case 2:
                craftTopView.getClass();
                craftTopView.showHint((StarGiftSheet.CraftTopView.AttributeView) view);
                break;
            case 3:
                craftTopView.getClass();
                craftTopView.showHint((StarGiftSheet.CraftTopView.AttributeView) view);
                break;
            case 4:
                StarGiftSheet.CraftTopView craftTopView2 = this.f$0;
                if (craftTopView2.getAlpha() >= 1.0f && !craftTopView2.crafting) {
                    if (craftTopView2.failed) {
                        craftTopView2.setup(craftTopView2.currentAccount, craftTopView2.giftId, craftTopView2.document, craftTopView2.collectionTitle);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        int i = 0;
                        while (true) {
                            StarGiftSheet.CraftTopView.SelectGiftView[] selectGiftViewArr = craftTopView2.gifts;
                            if (i >= selectGiftViewArr.length) {
                                boolean zIsEmpty = arrayList2.isEmpty();
                                LinearLayout linearLayout = craftTopView2.button;
                                if (zIsEmpty || craftTopView2.onCraft == null) {
                                    AndroidUtilities.shakeViewSpring(linearLayout);
                                } else {
                                    craftTopView2.crafting = true;
                                    craftTopView2.failed = false;
                                    HintView2 hintView2 = craftTopView2.currentHint;
                                    if (hintView2 != null) {
                                        hintView2.hide(true);
                                        craftTopView2.currentHint = null;
                                    }
                                    TextView textView = craftTopView2.craftingSubtitleView;
                                    textView.setText("");
                                    craftTopView2.craftingChanceView.setText(LocaleController.formatString(R.string.GiftCraftProgressSuccessChance, AffiliateProgramFragment.percents(craftTopView2.getGiftsSuccessChance())));
                                    for (int i2 = 0; i2 < selectGiftViewArr.length; i2++) {
                                        StarGiftSheet.CraftTopView.SelectGiftView selectGiftView2 = selectGiftViewArr[i2];
                                        if (selectGiftView2 != null) {
                                            selectGiftView2.setClickable(false);
                                            StarGiftSheet.CraftTopView.SelectGiftView selectGiftView3 = selectGiftViewArr[i2];
                                            TL_stars.StarGift starGift3 = selectGiftView3.gift;
                                            if (starGift3 == null) {
                                                starGift3 = null;
                                            }
                                            if (starGift3 == null) {
                                                selectGiftView3.animate().alpha(0.0f).start();
                                            }
                                        }
                                    }
                                    for (StarGiftSheet.CraftTopView.SelectGiftView selectGiftView4 : selectGiftViewArr) {
                                        if (selectGiftView4 != null) {
                                            TL_stars.StarGift starGift4 = selectGiftView4.gift;
                                            if ((starGift4 != null ? starGift4 : null) != null) {
                                                if (starGift4 == null) {
                                                    starGift4 = null;
                                                }
                                                textView.setText(starGift4.title + " #" + LocaleController.formatNumber(starGift4.num, ','));
                                                craftTopView2.precraftingLayout.animate().alpha(0.0f).start();
                                                linearLayout.animate().alpha(0.0f).start();
                                                craftTopView2.craftingLayout.animate().alpha(1.0f).start();
                                                craftTopView2.buttonsLayout.animate().alpha(0.25f).start();
                                                craftTopView2.craftingIconView.playAnimation();
                                                arrayList = new ArrayList();
                                                for (StarGiftSheet.CraftTopView.SelectGiftView selectGiftView5 : selectGiftViewArr) {
                                                    starGift = selectGiftView5.gift;
                                                    if (starGift != null) {
                                                        starGift2 = starGift;
                                                    } else {
                                                        starGift2 = null;
                                                    }
                                                    if (starGift2 == null) {
                                                        if (starGift == null) {
                                                            starGift = null;
                                                        }
                                                        arrayList.add(starGift);
                                                    }
                                                }
                                                craftTopView2.onCraft.run(arrayList, new OAuthSheet$$ExternalSyntheticLambda18(20, craftTopView2, arrayList), new ProfileActivity$9$$ExternalSyntheticLambda1(craftTopView2, 23));
                                                break;
                                            }
                                        }
                                    }
                                    craftTopView2.precraftingLayout.animate().alpha(0.0f).start();
                                    linearLayout.animate().alpha(0.0f).start();
                                    craftTopView2.craftingLayout.animate().alpha(1.0f).start();
                                    craftTopView2.buttonsLayout.animate().alpha(0.25f).start();
                                    craftTopView2.craftingIconView.playAnimation();
                                    arrayList = new ArrayList();
                                    while (i < selectGiftViewArr.length) {
                                        starGift = selectGiftView5.gift;
                                        if (starGift != null) {
                                            starGift2 = starGift;
                                        } else {
                                            starGift2 = null;
                                        }
                                        if (starGift2 == null) {
                                            if (starGift == null) {
                                                starGift = null;
                                            }
                                            arrayList.add(starGift);
                                        }
                                    }
                                    craftTopView2.onCraft.run(arrayList, new OAuthSheet$$ExternalSyntheticLambda18(20, craftTopView2, arrayList), new ProfileActivity$9$$ExternalSyntheticLambda1(craftTopView2, 23));
                                }
                            } else {
                                StarGiftSheet.CraftTopView.SelectGiftView selectGiftView6 = selectGiftViewArr[i];
                                if (selectGiftView6 != null) {
                                    TL_stars.StarGift starGift5 = selectGiftView6.gift;
                                    if ((starGift5 != null ? starGift5 : null) != null) {
                                        if (starGift5 == null) {
                                            starGift5 = null;
                                        }
                                        arrayList2.add(starGift5);
                                    }
                                }
                                i++;
                            }
                        }
                    }
                }
                break;
            default:
                craftTopView.getClass();
                StarGiftSheet.CraftTopView.SelectGiftView selectGiftView7 = (StarGiftSheet.CraftTopView.SelectGiftView) view;
                TL_stars.StarGift starGift6 = selectGiftView7.gift;
                if (starGift6 == null) {
                    starGift6 = null;
                }
                if (starGift6 == null || selectGiftView7.isReplaceIcon) {
                    int i3 = 0;
                    while (true) {
                        StarGiftSheet.CraftTopView.SelectGiftView[] selectGiftViewArr2 = craftTopView.gifts;
                        if (i3 < selectGiftViewArr2.length && (selectGiftView = selectGiftViewArr2[i3]) != view) {
                            if (selectGiftView != null) {
                                TL_stars.StarGift starGift7 = selectGiftView.gift;
                                if (starGift7 == null) {
                                    starGift7 = null;
                                }
                                if (starGift7 != null) {
                                }
                            }
                            i3++;
                        }
                        craftTopView.onAddGift.run(new OAuthSheet$$ExternalSyntheticLambda13(27, craftTopView, selectGiftView7), Boolean.valueOf(z));
                        break;
                    }
                    z = true;
                    craftTopView.onAddGift.run(new OAuthSheet$$ExternalSyntheticLambda13(27, craftTopView, selectGiftView7), Boolean.valueOf(z));
                } else {
                    selectGiftView7.setGift(null, true);
                    craftTopView.updateCounts(true);
                }
                break;
        }
    }
}
