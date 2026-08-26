package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.ButtonSpan;
import org.telegram.ui.Components.EmojiPacksAlert;
import org.telegram.ui.Components.StickerSetBulletinLayout;
import org.telegram.ui.iv.BlockRow;
import org.telegram.ui.iv.RichTextCell;

public final class PhotoViewer$$ExternalSyntheticLambda68 implements Utilities.Callback {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;
    public final Object f$2;
    public final Object f$3;

    public PhotoViewer$$ExternalSyntheticLambda68(Object obj, int i, Object obj2, Object obj3, int i2) {
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
                String str = (String) obj;
                PhotoViewer photoViewer = (PhotoViewer) this.f$0;
                if (this.f$1 == photoViewer.switchingToIndex) {
                    photoViewer.captionDetectedLanguage = str;
                    TranslateController translateController = (TranslateController) this.f$2;
                    if (translateController.isContextTranslateEnabled()) {
                        if (translateController.canTranslatePhoto((MessageObject) this.f$3, photoViewer.captionDetectedLanguage)) {
                            if (photoViewer.captionTranslated) {
                                photoViewer.menuItem.showSubItem$1(20);
                                photoViewer.menuItem.hideSubItem(19);
                            } else {
                                photoViewer.menuItem.showSubItem$1(19);
                                photoViewer.menuItem.hideSubItem(20);
                            }
                        }
                    }
                    photoViewer.menuItem.hideSubItem(19);
                    photoViewer.menuItem.hideSubItem(20);
                    break;
                }
                break;
            case 1:
                EmojiPacksAlert emojiPacksAlert = (EmojiPacksAlert) this.f$0;
                emojiPacksAlert.getClass();
                int[] iArr = (int[]) this.f$2;
                iArr[0] = iArr[0] + 1;
                if (((Boolean) obj).booleanValue()) {
                    iArr[1] = iArr[1] + 1;
                }
                if (iArr[0] == this.f$1 && iArr[1] > 0) {
                    emojiPacksAlert.lambda$showGiftOfferSheet$15();
                    BaseFragment baseFragment = emojiPacksAlert.fragment;
                    Bulletin.make(baseFragment, new StickerSetBulletinLayout(baseFragment.getFragmentView().getContext(), (TLObject) ((ArrayList) this.f$3).get(0), iArr[1], 2, null, baseFragment.getResourceProvider()), 1500).show();
                    break;
                }
                break;
            case 2:
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                if (savedStarGift != null) {
                    ButtonSpan.TextViewButtons textViewButtons = (ButtonSpan.TextViewButtons) this.f$0;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(textViewButtons.getText());
                    SpannableStringBuilder spannableStringBuilderAppend = spannableStringBuilder.append((CharSequence) " ");
                    String string = LocaleController.getString(R.string.StarGiftReasonUpgradeView);
                    int i = this.f$1;
                    Context context = (Context) this.f$2;
                    Theme.ResourcesProvider resourcesProvider = (Theme.ResourcesProvider) this.f$3;
                    spannableStringBuilderAppend.append((CharSequence) ButtonSpan.make(string, new OAuthSheet$$ExternalSyntheticLambda2(i, context, resourcesProvider, savedStarGift, 11), resourcesProvider, null));
                    textViewButtons.setText(spannableStringBuilder);
                }
                break;
            case 3:
                long j = ((TLRPC.Chat) this.f$3).id;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                TLRPC.Chat chat = (TLRPC.Chat) this.f$2;
                boolean zIsChannel = ChatObject.isChannel(chat);
                BaseFragment baseFragment2 = (BaseFragment) this.f$0;
                int i2 = this.f$1;
                if (zIsChannel) {
                    long j2 = chat.id;
                    MessagesController.getInstance(i2).linkCommunity(-j2, j, zBooleanValue, new LaunchActivity$$ExternalSyntheticLambda149(baseFragment2, j2, 3));
                } else {
                    AlertDialog alertDialog = new AlertDialog(baseFragment2.getContext(), 3, null);
                    AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
                    AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
                    AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 250L);
                    MessagesController.getInstance(i2).convertToMegaGroup(baseFragment2.getParentActivity(), chat.id, baseFragment2, new DialogsActivity$$ExternalSyntheticLambda93(alertDialog, baseFragment2, i2, j, zBooleanValue));
                }
                break;
            default:
                SpannableString spannableString = (SpannableString) obj;
                RichTextCell richTextCell = (RichTextCell) this.f$0;
                if (this.f$1 == richTextCell.highlightGeneration && richTextCell.currentRow == ((BlockRow) this.f$2)) {
                    Editable text = richTextCell.editText.getText();
                    String str2 = (String) this.f$3;
                    if (TextUtils.equals(str2, text)) {
                        for (CodeHighlighting.ColorSpan colorSpan : (CodeHighlighting.ColorSpan[]) text.getSpans(0, text.length(), CodeHighlighting.ColorSpan.class)) {
                            text.removeSpan(colorSpan);
                        }
                        CodeHighlighting.ColorSpan[] colorSpanArr = (CodeHighlighting.ColorSpan[]) spannableString.getSpans(0, spannableString.length(), CodeHighlighting.ColorSpan.class);
                        int length = text.length();
                        for (int i3 = 0; i3 < colorSpanArr.length; i3++) {
                            int spanStart = spannableString.getSpanStart(colorSpanArr[i3]);
                            int spanEnd = spannableString.getSpanEnd(colorSpanArr[i3]);
                            if (spanStart >= 0 && spanEnd <= length && spanStart < spanEnd) {
                                text.setSpan(colorSpanArr[i3], spanStart, spanEnd, 33);
                            }
                        }
                        richTextCell.highlightedSnapshot = str2;
                        break;
                    }
                }
                break;
        }
    }

    public PhotoViewer$$ExternalSyntheticLambda68(EmojiPacksAlert emojiPacksAlert, int[] iArr, int i, ArrayList arrayList) {
        this.$r8$classId = 1;
        this.f$0 = emojiPacksAlert;
        this.f$2 = iArr;
        this.f$1 = i;
        this.f$3 = arrayList;
    }
}
