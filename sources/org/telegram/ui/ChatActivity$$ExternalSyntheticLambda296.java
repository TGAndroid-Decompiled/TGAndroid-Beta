package org.telegram.ui;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Stars.StarGiftSheet;

public final class ChatActivity$$ExternalSyntheticLambda296 implements Utilities.Callback {
    public final int $r8$classId;
    public final Object f$0;
    public final long f$1;
    public final long f$2;

    public ChatActivity$$ExternalSyntheticLambda296(Object obj, long j, long j2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = j;
        this.f$2 = j2;
    }

    @Override
    public final void run(Object obj) {
        SpannableStringBuilder spannableStringBuilder;
        int size;
        int i;
        Object obj2 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                ((ChatActivity) obj2).lambda$updateTopPanel$241(this.f$1, this.f$2, (Long) obj);
                break;
            case 1:
                Long l = (Long) obj;
                ChatActivity.AnonymousClass16 anonymousClass16 = (ChatActivity.AnonymousClass16) obj2;
                ChatActivity chatActivity = ChatActivity.this;
                if (chatActivity.getParentActivity() != null) {
                    Activity parentActivity = chatActivity.getParentActivity();
                    String string = LocaleController.getString(R.string.RemoveMessageFeeTitle);
                    int i2 = ChatObject.isMonoForum(chatActivity.currentChat) ? R.string.RemoveMessageFeeMessageChannel : R.string.RemoveMessageFeeMessage;
                    long j = this.f$1;
                    AlertsCreator.showAlertWithCheckbox(parentActivity, string, AndroidUtilities.replaceTags(LocaleController.formatString(i2, DialogObject.getShortName(j))), l.longValue() > 0 ? LocaleController.formatPluralStringComma("RemoveMessageFeeRefund", (int) l.longValue()) : null, LocaleController.getString(R.string.Confirm), new ChatActivity$$ExternalSyntheticLambda447(anonymousClass16, j, this.f$2, l, 1), ((BaseFragment) chatActivity).resourceProvider, true);
                    break;
                }
                break;
            default:
                ArrayList arrayList = (ArrayList) obj;
                StarGiftSheet.CraftTopView craftTopView = (StarGiftSheet.CraftTopView) obj2;
                if (this.f$1 != this.f$2) {
                    craftTopView.getClass();
                } else {
                    craftTopView.previewAttributes = arrayList;
                    AnimatedEmojiSpan.TextViewEmojis textViewEmojis = craftTopView.variantsButton;
                    textViewEmojis.animate().alpha(craftTopView.attributesTwoLines ? 0.0f : craftTopView.previewAttributes != null ? 1.0f : 0.25f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(420L).start();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        if ((arrayList.get(i3) instanceof TL_stars.starGiftAttributeModel) && !(((TL_stars.StarGiftAttribute) arrayList.get(i3)).rarity instanceof TL_stars.TL_starGiftAttributeRarity)) {
                            arrayList2.add((TL_stars.starGiftAttributeModel) arrayList.get(i3));
                            if (arrayList2.size() >= 3) {
                                spannableStringBuilder = new SpannableStringBuilder();
                                size = arrayList2.size();
                                i = 0;
                                while (i < size) {
                                    Object obj3 = arrayList2.get(i);
                                    i++;
                                    spannableStringBuilder.append((CharSequence) "x");
                                    TLRPC.Document document = ((TL_stars.starGiftAttributeModel) obj3).document;
                                    AnimatedEmojiSpan animatedEmojiSpan = new AnimatedEmojiSpan(document.id, 1.2f, textViewEmojis.getPaint().getFontMetricsInt());
                                    animatedEmojiSpan.document = document;
                                    spannableStringBuilder.setSpan(animatedEmojiSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                                    spannableStringBuilder.append((CharSequence) " ");
                                }
                                if (spannableStringBuilder.length() > 0) {
                                    spannableStringBuilder.append((CharSequence) " ");
                                }
                                spannableStringBuilder.append(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.GiftCraftViewAllVariants), false, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
                                textViewEmojis.setText(spannableStringBuilder);
                                break;
                            }
                        }
                    }
                    spannableStringBuilder = new SpannableStringBuilder();
                    size = arrayList2.size();
                    i = 0;
                    while (i < size) {
                        Object obj4 = arrayList2.get(i);
                        i++;
                        spannableStringBuilder.append((CharSequence) "x");
                        TLRPC.Document document2 = ((TL_stars.starGiftAttributeModel) obj4).document;
                        AnimatedEmojiSpan animatedEmojiSpan2 = new AnimatedEmojiSpan(document2.id, 1.2f, textViewEmojis.getPaint().getFontMetricsInt());
                        animatedEmojiSpan2.document = document2;
                        spannableStringBuilder.setSpan(animatedEmojiSpan2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    if (spannableStringBuilder.length() > 0) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    spannableStringBuilder.append(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.GiftCraftViewAllVariants), false, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
                    textViewEmojis.setText(spannableStringBuilder);
                }
                break;
        }
    }
}
