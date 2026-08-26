package org.telegram.ui.Stars;

import android.text.Layout;
import android.text.Spanned;
import android.view.View;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.ButtonSpan;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Gifts.AuctionJoinSheet;
import org.telegram.ui.Gifts.ResaleGiftsFragment;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.web.BotWebViewContainer;

public final class GiftOfferSheet$$ExternalSyntheticLambda12 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public GiftOfferSheet$$ExternalSyntheticLambda12(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        ButtonSpan buttonSpan;
        ButtonSpan buttonSpan2;
        switch (this.$r8$classId) {
            case 0:
                ((GiftOfferSheet) this.f$0).lambda$openConfirmAlert$8((Browser.Progress) this.f$1, (AlertDialog) this.f$2, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            case 1:
                ((ConnectionsManager) this.f$0).lambda$sendRequestTypedAndProcessUpdates$5((Executor) this.f$1, (Utilities.Callback2) this.f$2, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            case 2:
                View view = (View) obj;
                CharSequence charSequence = (CharSequence) obj2;
                AuctionJoinSheet auctionJoinSheet = (AuctionJoinSheet) this.f$0;
                auctionJoinSheet.getClass();
                HintView2[] hintView2Arr = (HintView2[]) this.f$1;
                HintView2 hintView2 = hintView2Arr[0];
                if (hintView2 != null) {
                    hintView2.hide();
                }
                CharSequence charSequenceReplaceTags = AndroidUtilities.replaceTags(charSequence);
                float x = ((View) ((View) view.getParent()).getParent()).getX() + ((View) view.getParent()).getX() + view.getX();
                float y = ((View) ((View) view.getParent()).getParent()).getY() + ((View) view.getParent()).getY() + view.getY();
                if (view instanceof ButtonSpan.TextViewButtons) {
                    Layout layout = ((ButtonSpan.TextViewButtons) view).getLayout();
                    CharSequence text = layout.getText();
                    if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        ButtonSpan[] buttonSpanArr = (ButtonSpan[]) spanned.getSpans(0, text.length(), ButtonSpan.class);
                        if (buttonSpanArr.length > 0 && (buttonSpan = buttonSpanArr[0]) != null) {
                            int spanStart = spanned.getSpanStart(buttonSpan);
                            x += layout.getPrimaryHorizontal(spanStart) + (buttonSpanArr[0].getSize() / 2);
                            y += layout.getLineTop(layout.getLineForOffset(spanStart));
                        }
                    }
                }
                HintView2 hintView3 = new HintView2(auctionJoinSheet.getContext(), 3);
                hintView2Arr[0] = hintView3;
                hintView3.setMultilineText(true);
                hintView3.setInnerPadding(11.0f, 8.0f, 11.0f, 7.0f);
                hintView3.setRounding(10.0f);
                hintView3.setText(charSequenceReplaceTags);
                hintView3.setOnHiddenListener(new StarGiftSheet$$ExternalSyntheticLambda114(hintView3, 1));
                hintView3.setTranslationY((-AndroidUtilities.dp(100.0f)) + y);
                hintView3.setMaxWidthPx(AndroidUtilities.dp(300.0f));
                hintView3.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                hintView3.setJointPx(0.0f, x - AndroidUtilities.dp(4.0f));
                ((FrameLayout) this.f$2).addView(hintView3, LayoutHelper.createFrame(-1, 100, 55));
                hintView3.show();
                break;
            case 3:
                ResaleGiftsFragment.SelectGiftSheet selectGiftSheet = (ResaleGiftsFragment.SelectGiftSheet) this.f$0;
                selectGiftSheet.getClass();
                ((Browser.Progress) this.f$1).end();
                if (((Boolean) obj).booleanValue()) {
                    StarGiftSheet$$ExternalSyntheticLambda95 starGiftSheet$$ExternalSyntheticLambda95 = selectGiftSheet.onSelect;
                    if (starGiftSheet$$ExternalSyntheticLambda95 != null) {
                        starGiftSheet$$ExternalSyntheticLambda95.run((TL_stars.TL_starGiftUnique) this.f$2);
                    }
                    selectGiftSheet.lambda$showGiftOfferSheet$15();
                }
                break;
            case 4:
                View view2 = (View) obj;
                CharSequence charSequence2 = (CharSequence) obj2;
                StarGiftSheet starGiftSheet = (StarGiftSheet) this.f$0;
                starGiftSheet.getClass();
                HintView2[] hintView2Arr2 = (HintView2[]) this.f$1;
                HintView2 hintView4 = hintView2Arr2[0];
                if (hintView4 != null) {
                    hintView4.hide();
                }
                CharSequence charSequenceReplaceTags2 = AndroidUtilities.replaceTags(charSequence2);
                float x2 = ((View) ((View) view2.getParent()).getParent()).getX() + ((View) view2.getParent()).getX() + view2.getX();
                float y2 = ((View) ((View) view2.getParent()).getParent()).getY() + ((View) view2.getParent()).getY() + view2.getY();
                if (view2 instanceof ButtonSpan.TextViewButtons) {
                    Layout layout2 = ((ButtonSpan.TextViewButtons) view2).getLayout();
                    CharSequence text2 = layout2.getText();
                    if (text2 instanceof Spanned) {
                        Spanned spanned2 = (Spanned) text2;
                        ButtonSpan[] buttonSpanArr2 = (ButtonSpan[]) spanned2.getSpans(0, text2.length(), ButtonSpan.class);
                        if (buttonSpanArr2.length > 0 && (buttonSpan2 = buttonSpanArr2[0]) != null) {
                            int spanStart2 = spanned2.getSpanStart(buttonSpan2);
                            x2 += layout2.getPrimaryHorizontal(spanStart2) + (buttonSpanArr2[0].getSize() / 2);
                            y2 += layout2.getLineTop(layout2.getLineForOffset(spanStart2));
                        }
                    }
                }
                HintView2 hintView5 = new HintView2(starGiftSheet.getContext(), 3);
                hintView2Arr2[0] = hintView5;
                hintView5.setMultilineText(true);
                hintView5.setInnerPadding(11.0f, 8.0f, 11.0f, 7.0f);
                hintView5.setRounding(10.0f);
                hintView5.setText(charSequenceReplaceTags2);
                hintView5.setOnHiddenListener(new StarGiftSheet$$ExternalSyntheticLambda114(hintView5, 2));
                hintView5.setTranslationY((-AndroidUtilities.dp(100.0f)) + y2);
                hintView5.setMaxWidthPx(AndroidUtilities.dp(300.0f));
                hintView5.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                hintView5.setJointPx(0.0f, x2 - AndroidUtilities.dp(4.0f));
                ((FrameLayout) this.f$2).addView(hintView5, LayoutHelper.createFrame(-1, 100, 55));
                hintView5.show();
                break;
            default:
                ((BotWebViewContainer) this.f$0).lambda$onEventReceived$50((String) this.f$1, (TLRPC.User) this.f$2, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
