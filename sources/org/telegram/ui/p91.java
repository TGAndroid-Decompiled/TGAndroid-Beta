package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_stats;
public final class p91 {
    public TL_stats.PostInteractionCounters f41380a;
    public MessageObject f41381b;

    public final int a() {
        TL_stats.PostInteractionCounters postInteractionCounters = this.f41380a;
        if (postInteractionCounters instanceof TL_stats.TL_postInteractionCountersMessage) {
            return ((TL_stats.TL_postInteractionCountersMessage) postInteractionCounters).forwards;
        }
        if (postInteractionCounters instanceof TL_stats.TL_postInteractionCountersStory) {
            return ((TL_stats.TL_postInteractionCountersStory) postInteractionCounters).forwards;
        }
        return 0;
    }

    public final int b() {
        TL_stats.PostInteractionCounters postInteractionCounters = this.f41380a;
        if (postInteractionCounters instanceof TL_stats.TL_postInteractionCountersMessage) {
            return ((TL_stats.TL_postInteractionCountersMessage) postInteractionCounters).msg_id;
        }
        if (postInteractionCounters instanceof TL_stats.TL_postInteractionCountersStory) {
            return ((TL_stats.TL_postInteractionCountersStory) postInteractionCounters).story_id;
        }
        return 0;
    }

    public final int c() {
        TL_stats.PostInteractionCounters postInteractionCounters = this.f41380a;
        if (postInteractionCounters instanceof TL_stats.TL_postInteractionCountersMessage) {
            return ((TL_stats.TL_postInteractionCountersMessage) postInteractionCounters).reactions;
        }
        if (postInteractionCounters instanceof TL_stats.TL_postInteractionCountersStory) {
            return ((TL_stats.TL_postInteractionCountersStory) postInteractionCounters).reactions;
        }
        return 0;
    }

    public final int d() {
        TL_stats.PostInteractionCounters postInteractionCounters = this.f41380a;
        if (postInteractionCounters instanceof TL_stats.TL_postInteractionCountersMessage) {
            return ((TL_stats.TL_postInteractionCountersMessage) postInteractionCounters).views;
        }
        if (postInteractionCounters instanceof TL_stats.TL_postInteractionCountersStory) {
            return ((TL_stats.TL_postInteractionCountersStory) postInteractionCounters).views;
        }
        return 0;
    }
}
