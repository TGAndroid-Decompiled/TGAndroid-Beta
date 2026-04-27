package org.telegram.ui.Components.poll;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.tgnet.TLRPC;

public class PollSendParams {
    public final String caption;
    public final ArrayList entities;
    public final long groupId;
    public final TLRPC.TL_inputMediaPoll inputMediaPoll;
    public final PollAttachedMediaPack mediaPack;
    public final TLRPC.TL_messageMediaPoll poll;

    public PollSendParams(PollAttachedMediaPack pollAttachedMediaPack, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, long j, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.mediaPack = pollAttachedMediaPack;
        this.groupId = j;
        this.caption = str;
        this.entities = arrayList;
        TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
        TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
        tL_inputMediaPoll.poll = tL_poll;
        TLRPC.Poll poll = tL_messageMediaPoll.poll;
        tL_poll.id = poll.id;
        tL_poll.flags = poll.flags;
        tL_poll.closed = poll.closed;
        tL_poll.public_voters = poll.public_voters;
        tL_poll.multiple_choice = poll.multiple_choice;
        tL_poll.open_answers = poll.open_answers;
        tL_poll.revoting_disabled = poll.revoting_disabled;
        tL_poll.shuffle_answers = poll.shuffle_answers;
        tL_poll.subscribers_only = poll.subscribers_only;
        tL_poll.countries_iso2 = poll.countries_iso2;
        tL_poll.hide_results_until_close = poll.hide_results_until_close;
        tL_poll.creator = poll.creator;
        tL_poll.quiz = poll.quiz;
        tL_poll.answers = new ArrayList<>(tL_messageMediaPoll.poll.answers);
        Iterator<TLRPC.PollAnswer> it = tL_messageMediaPoll.poll.answers.iterator();
        while (it.hasNext()) {
            new TLRPC.TL_inputPollAnswer().text = it.next().text;
        }
        TLRPC.Poll poll2 = tL_inputMediaPoll.poll;
        TLRPC.Poll poll3 = tL_messageMediaPoll.poll;
        poll2.question = poll3.question;
        poll2.close_period = poll3.close_period;
        poll2.close_date = poll3.close_date;
        poll2.hash = poll3.hash;
        TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
        if (pollResults != null && !TextUtils.isEmpty(pollResults.solution)) {
            TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
            tL_inputMediaPoll.solution = pollResults2.solution;
            tL_inputMediaPoll.solution_entities = pollResults2.solution_entities;
            tL_inputMediaPoll.flags |= 2;
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            tL_inputMediaPoll.correct_answers = new ArrayList<>(arrayList2);
            tL_inputMediaPoll.flags |= 1;
        }
        if (pollAttachedMediaPack != null) {
            pollAttachedMediaPack.applyAllQuickMedia(tL_inputMediaPoll);
            pollAttachedMediaPack.applyAllQuickMedia(tL_messageMediaPoll);
        }
        this.poll = tL_messageMediaPoll;
        this.inputMediaPoll = tL_inputMediaPoll;
    }
}
