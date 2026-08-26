package org.telegram.ui;

import android.text.style.CharacterStyle;
import com.stripe.android.Stripe;
import java.util.ArrayList;
import kotlinx.coroutines.flow.SafeFlow;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Adapters.SearchAdapter;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.bots.SetupEmojiStatusSheet;
import org.telegram.ui.bots.SetupEmojiStatusSheet$$ExternalSyntheticLambda1;
import org.telegram.ui.iv.RichDetailsCell;
import org.telegram.ui.iv.RichEditText;
import org.telegram.ui.iv.RichQuoteAuthorCell;
import org.telegram.ui.iv.RichTableCell;
import org.telegram.ui.iv.RichTextCell;
import org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda22;

public final class ChatActivity$$ExternalSyntheticLambda153 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;
    public final int f$2;
    public final Object f$3;
    public final Object f$4;

    public ChatActivity$$ExternalSyntheticLambda153(int i, int i2, MediaController mediaController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.$r8$classId = 1;
        this.f$0 = mediaController;
        this.f$1 = i;
        this.f$3 = tL_error;
        this.f$4 = tLObject;
        this.f$2 = i2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((ChatActivity) this.f$0).lambda$openLinkInternally$394(this.f$1, this.f$2, (CharacterStyle) this.f$3, (ChatMessageCell) this.f$4);
                break;
            case 1:
                ((MediaController) this.f$0).lambda$loadMoreMusic$11(this.f$1, (TLRPC.TL_error) this.f$3, (TLObject) this.f$4, this.f$2);
                break;
            case 2:
                ((SearchAdapter) this.f$0).lambda$processSearch$0((String) this.f$3, this.f$1, (ArrayList) this.f$4, this.f$2);
                break;
            case 3:
                BotWebViewContainer$$ExternalSyntheticLambda22 botWebViewContainer$$ExternalSyntheticLambda22 = (BotWebViewContainer$$ExternalSyntheticLambda22) this.f$4;
                TLRPC.Document document = (TLRPC.Document) this.f$3;
                SetupEmojiStatusSheet$$ExternalSyntheticLambda1 setupEmojiStatusSheet$$ExternalSyntheticLambda1 = new SetupEmojiStatusSheet$$ExternalSyntheticLambda1(botWebViewContainer$$ExternalSyntheticLambda22, document, 1);
                SetupEmojiStatusSheet.show(this.f$1, (TLRPC.User) this.f$0, document, this.f$2, setupEmojiStatusSheet$$ExternalSyntheticLambda1);
                break;
            case 4:
                RichDetailsCell.AnonymousClass3 anonymousClass3 = (RichDetailsCell.AnonymousClass3) this.f$0;
                anonymousClass3.getClass();
                RichEditText richEditText = (RichEditText) this.f$3;
                int length = richEditText.length();
                int i = this.f$1;
                if (length >= i && richEditText.getSelectionStart() != richEditText.getSelectionEnd()) {
                    TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = (TextSelectionHelper.ArticleTextSelectionHelper) this.f$4;
                    RichDetailsCell richDetailsCell = RichDetailsCell.this;
                    if (articleTextSelectionHelper.selectRangeOf(richDetailsCell, 0, this.f$2, i)) {
                        richDetailsCell.hijackingSelection = true;
                        richEditText.setSelection(i);
                        richDetailsCell.hijackingSelection = false;
                    }
                    break;
                }
                break;
            case 5:
                SafeFlow safeFlow = (SafeFlow) this.f$0;
                safeFlow.getClass();
                RichEditText richEditText2 = (RichEditText) this.f$3;
                int length2 = richEditText2.length();
                int i2 = this.f$1;
                if (length2 >= i2 && richEditText2.getSelectionStart() != richEditText2.getSelectionEnd()) {
                    TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper2 = (TextSelectionHelper.ArticleTextSelectionHelper) this.f$4;
                    boolean zIsInSelectionMode = articleTextSelectionHelper2.isInSelectionMode();
                    RichQuoteAuthorCell richQuoteAuthorCell = (RichQuoteAuthorCell) safeFlow.block;
                    if (zIsInSelectionMode) {
                        richQuoteAuthorCell.hijackingSelection = true;
                        richEditText2.setSelection(i2);
                        richQuoteAuthorCell.hijackingSelection = false;
                    } else if (articleTextSelectionHelper2.selectRangeOf(richQuoteAuthorCell, 0, this.f$2, i2)) {
                        richQuoteAuthorCell.hijackingSelection = true;
                        richEditText2.setSelection(i2);
                        richQuoteAuthorCell.hijackingSelection = false;
                    }
                    break;
                }
                break;
            case 6:
                Stripe.AnonymousClass1 anonymousClass1 = (Stripe.AnonymousClass1) this.f$0;
                anonymousClass1.getClass();
                RichEditText richEditText3 = (RichEditText) this.f$3;
                int length3 = richEditText3.length();
                int i3 = this.f$1;
                if (length3 >= i3 && richEditText3.getSelectionStart() != richEditText3.getSelectionEnd()) {
                    TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper3 = (TextSelectionHelper.ArticleTextSelectionHelper) this.f$4;
                    RichTableCell richTableCell = (RichTableCell) anonymousClass1.this$0;
                    if (articleTextSelectionHelper3.selectRangeOf(richTableCell, 0, this.f$2, i3)) {
                        richTableCell.hijackingSelection = true;
                        richEditText3.setSelection(i3);
                        richTableCell.hijackingSelection = false;
                    }
                    break;
                }
                break;
            case 7:
                RichTextCell.AnonymousClass2 anonymousClass2 = (RichTextCell.AnonymousClass2) this.f$0;
                anonymousClass2.getClass();
                RichEditText richEditText4 = (RichEditText) this.f$3;
                int length4 = richEditText4.length();
                int i4 = this.f$1;
                if (length4 >= i4 && richEditText4.getSelectionStart() != richEditText4.getSelectionEnd()) {
                    TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper4 = (TextSelectionHelper.ArticleTextSelectionHelper) this.f$4;
                    boolean zIsInSelectionMode2 = articleTextSelectionHelper4.isInSelectionMode();
                    RichTextCell richTextCell = RichTextCell.this;
                    if (zIsInSelectionMode2) {
                        richTextCell.hijackingSelection = true;
                        richEditText4.setSelection(i4);
                        richTextCell.hijackingSelection = false;
                    } else if (articleTextSelectionHelper4.selectRangeOf(richTextCell, 0, this.f$2, i4)) {
                        richTextCell.hijackingSelection = true;
                        richEditText4.setSelection(i4);
                        richTextCell.hijackingSelection = false;
                    }
                    break;
                }
                break;
            default:
                RichTextCell.AnonymousClass3 anonymousClass4 = (RichTextCell.AnonymousClass3) this.f$0;
                anonymousClass4.getClass();
                RichEditText richEditText5 = (RichEditText) this.f$3;
                int length5 = richEditText5.length();
                int i5 = this.f$1;
                if (length5 >= i5 && richEditText5.getSelectionStart() != richEditText5.getSelectionEnd()) {
                    TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper5 = (TextSelectionHelper.ArticleTextSelectionHelper) this.f$4;
                    boolean zIsInSelectionMode3 = articleTextSelectionHelper5.isInSelectionMode();
                    RichTextCell richTextCell2 = RichTextCell.this;
                    if (zIsInSelectionMode3) {
                        richTextCell2.hijackingAuthorSelection = true;
                        richEditText5.setSelection(i5);
                        richTextCell2.hijackingAuthorSelection = false;
                    } else if (articleTextSelectionHelper5.selectRangeOf(richTextCell2, 1, this.f$2, i5)) {
                        richTextCell2.hijackingAuthorSelection = true;
                        richEditText5.setSelection(i5);
                        richTextCell2.hijackingAuthorSelection = false;
                    }
                    break;
                }
                break;
        }
    }

    public ChatActivity$$ExternalSyntheticLambda153(int i, TLRPC.User user, TLRPC.Document document, int i2, BotWebViewContainer$$ExternalSyntheticLambda22 botWebViewContainer$$ExternalSyntheticLambda22) {
        this.$r8$classId = 3;
        this.f$1 = i;
        this.f$0 = user;
        this.f$3 = document;
        this.f$2 = i2;
        this.f$4 = botWebViewContainer$$ExternalSyntheticLambda22;
    }

    public ChatActivity$$ExternalSyntheticLambda153(Object obj, Object obj2, int i, Object obj3, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$3 = obj2;
        this.f$1 = i;
        this.f$4 = obj3;
        this.f$2 = i2;
    }

    public ChatActivity$$ExternalSyntheticLambda153(ChatActivity chatActivity, int i, int i2, CharacterStyle characterStyle, ChatMessageCell chatMessageCell) {
        this.$r8$classId = 0;
        this.f$0 = chatActivity;
        this.f$1 = i;
        this.f$2 = i2;
        this.f$3 = characterStyle;
        this.f$4 = chatMessageCell;
    }
}
