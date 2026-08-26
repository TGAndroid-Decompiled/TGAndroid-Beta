package org.telegram.ui.Components;

import io.noties.markwon.html.HtmlTag;
import java.util.function.ToIntFunction;
import org.telegram.tgnet.TLRPC;

public final class MarkdownParser$$ExternalSyntheticLambda0 implements ToIntFunction {
    public final int $r8$classId;

    public MarkdownParser$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                return MarkdownParser.lambda$pairHtmlConcat$3((HtmlTag) obj);
            case 1:
                return AnimatedLinearLayout.Holder.access$100((AnimatedLinearLayout.Holder) obj);
            case 2:
                return AnimatedLinearLayout.Holder.access$400((AnimatedLinearLayout.Holder) obj);
            case 3:
                return ReactedUsersListView.lambda$setSeenUsers$2((TLRPC.MessagePeerReaction) obj);
            default:
                return ReactedUsersListView.lambda$load$3((TLRPC.MessagePeerReaction) obj);
        }
    }
}
