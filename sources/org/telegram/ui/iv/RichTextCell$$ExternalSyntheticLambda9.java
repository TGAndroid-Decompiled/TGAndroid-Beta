package org.telegram.ui.iv;

import android.content.Context;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.ButtonSpan;
import org.telegram.ui.DialogsActivity$$ExternalSyntheticLambda10;
import org.telegram.ui.Gifts.AuctionBidSheet$$ExternalSyntheticLambda18;
import org.telegram.ui.bots.BotBiometry$$ExternalSyntheticLambda8;

public final class RichTextCell$$ExternalSyntheticLambda9 implements Utilities.Callback {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;
    public final Object f$2;
    public final Object f$3;

    public RichTextCell$$ExternalSyntheticLambda9(Object obj, int i, Object obj2, Object obj3, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
        this.f$2 = obj2;
        this.f$3 = obj3;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                SpannableString spannableString = (SpannableString) obj;
                RichTextCell richTextCell = (RichTextCell) this.f$0;
                if (this.f$1 == richTextCell.highlightGeneration && richTextCell.currentRow == ((BlockRow) this.f$2)) {
                    Editable text = richTextCell.editText.getText();
                    String str = (String) this.f$3;
                    if (TextUtils.equals(str, text)) {
                        for (CodeHighlighting.ColorSpan colorSpan : (CodeHighlighting.ColorSpan[]) text.getSpans(0, text.length(), CodeHighlighting.ColorSpan.class)) {
                            text.removeSpan(colorSpan);
                        }
                        CodeHighlighting.ColorSpan[] colorSpanArr = (CodeHighlighting.ColorSpan[]) spannableString.getSpans(0, spannableString.length(), CodeHighlighting.ColorSpan.class);
                        int length = text.length();
                        for (int i = 0; i < colorSpanArr.length; i++) {
                            int spanStart = spannableString.getSpanStart(colorSpanArr[i]);
                            int spanEnd = spannableString.getSpanEnd(colorSpanArr[i]);
                            if (spanStart >= 0 && spanEnd <= length && spanStart < spanEnd) {
                                text.setSpan(colorSpanArr[i], spanStart, spanEnd, 33);
                            }
                        }
                        richTextCell.highlightedSnapshot = str;
                        break;
                    }
                }
                break;
            case 1:
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                if (savedStarGift != null) {
                    ButtonSpan.TextViewButtons textViewButtons = (ButtonSpan.TextViewButtons) this.f$0;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(textViewButtons.getText());
                    SpannableStringBuilder spannableStringBuilderAppend = spannableStringBuilder.append((CharSequence) " ");
                    String string = LocaleController.getString(R.string.StarGiftReasonUpgradeView);
                    int i2 = this.f$1;
                    Context context = (Context) this.f$2;
                    Theme.ResourcesProvider resourcesProvider = (Theme.ResourcesProvider) this.f$3;
                    spannableStringBuilderAppend.append(ButtonSpan.make(string, new BotBiometry$$ExternalSyntheticLambda8(i2, context, resourcesProvider, savedStarGift, 10), resourcesProvider));
                    textViewButtons.setText(spannableStringBuilder);
                }
                break;
            default:
                long j = ((TLRPC.Chat) this.f$3).id;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                TLRPC.Chat chat = (TLRPC.Chat) this.f$2;
                boolean zIsChannel = ChatObject.isChannel(chat);
                BaseFragment baseFragment = (BaseFragment) this.f$0;
                int i3 = this.f$1;
                if (zIsChannel) {
                    long j2 = chat.id;
                    MessagesController.getInstance(i3).linkCommunity(-j2, j, zBooleanValue, new AuctionBidSheet$$ExternalSyntheticLambda18(baseFragment, j2, 2));
                } else {
                    AlertDialog alertDialog = new AlertDialog(baseFragment.getContext(), 3, null);
                    AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
                    AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
                    AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 250L);
                    MessagesController.getInstance(i3).convertToMegaGroup(baseFragment.getParentActivity(), chat.id, baseFragment, new DialogsActivity$$ExternalSyntheticLambda10(alertDialog, baseFragment, i3, j, zBooleanValue));
                }
                break;
        }
    }
}
