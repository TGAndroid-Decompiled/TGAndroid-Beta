package org.telegram.ui.Components.poll;

import android.text.TextUtils;
import android.util.SparseArray;
import java.util.ArrayList;
import org.telegram.messenger.utils.tlutils.TlUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.poll.attached.PollAttachedMediaLink;
import org.telegram.ui.Components.poll.attached.PollAttachedMediaLocation;
import org.telegram.ui.Components.poll.attached.PollAttachedMediaSticker;

public final class PollSendParams {
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
        ArrayList<TLRPC.PollAnswer> arrayList3 = tL_messageMediaPoll.poll.answers;
        int size = arrayList3.size();
        int i = 0;
        while (i < size) {
            TLRPC.PollAnswer pollAnswer = arrayList3.get(i);
            i++;
            new TLRPC.TL_inputPollAnswer().text = pollAnswer.text;
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
            SparseArray sparseArray = pollAttachedMediaPack.medias;
            int size2 = sparseArray.size();
            for (int i2 = 0; i2 < size2; i2++) {
                int iKeyAt = sparseArray.keyAt(i2);
                PollAttachedMedia pollAttachedMedia = (PollAttachedMedia) sparseArray.valueAt(i2);
                if (pollAttachedMedia instanceof PollAttachedMediaLink) {
                    TLRPC.TL_inputMediaWebPage tL_inputMediaWebPage = new TLRPC.TL_inputMediaWebPage();
                    tL_inputMediaWebPage.url = ((PollAttachedMediaLink) pollAttachedMedia).url;
                    tL_inputMediaWebPage.optional = true;
                    PollAttachedMediaPack.setInputMedia(tL_inputMediaPoll, iKeyAt, tL_inputMediaWebPage);
                } else if (pollAttachedMedia instanceof PollAttachedMediaLocation) {
                    PollAttachedMediaPack.setInputMedia(tL_inputMediaPoll, iKeyAt, TlUtils.toInputMediaGeo(((PollAttachedMediaLocation) pollAttachedMedia).media));
                } else if (pollAttachedMedia instanceof PollAttachedMediaSticker) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    TLRPC.Document document = ((PollAttachedMediaSticker) pollAttachedMedia).sticker;
                    tL_inputDocument.id = document.id;
                    tL_inputDocument.access_hash = document.access_hash;
                    tL_inputDocument.file_reference = document.file_reference;
                    tL_inputMediaDocument.id = tL_inputDocument;
                    PollAttachedMediaPack.setInputMedia(tL_inputMediaPoll, iKeyAt, tL_inputMediaDocument);
                }
            }
            int size3 = sparseArray.size();
            for (int i3 = 0; i3 < size3; i3++) {
                int iKeyAt2 = sparseArray.keyAt(i3);
                PollAttachedMedia pollAttachedMedia2 = (PollAttachedMedia) sparseArray.valueAt(i3);
                if (pollAttachedMedia2 instanceof PollAttachedMediaLink) {
                    TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                    TLRPC.TL_webPage tL_webPage = new TLRPC.TL_webPage();
                    tL_messageMediaWebPage.webpage = tL_webPage;
                    String str2 = ((PollAttachedMediaLink) pollAttachedMedia2).url;
                    tL_webPage.display_url = str2;
                    tL_webPage.url = str2;
                    PollAttachedMediaPack.setMessageMedia(tL_messageMediaPoll, iKeyAt2, tL_messageMediaWebPage);
                } else if (pollAttachedMedia2 instanceof PollAttachedMediaLocation) {
                    PollAttachedMediaPack.setMessageMedia(tL_messageMediaPoll, iKeyAt2, ((PollAttachedMediaLocation) pollAttachedMedia2).media);
                } else if (pollAttachedMedia2 instanceof PollAttachedMediaSticker) {
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                    tL_messageMediaDocument.document = ((PollAttachedMediaSticker) pollAttachedMedia2).sticker;
                    PollAttachedMediaPack.setMessageMedia(tL_messageMediaPoll, iKeyAt2, tL_messageMediaDocument);
                }
            }
        }
        this.poll = tL_messageMediaPoll;
        this.inputMediaPoll = tL_inputMediaPoll;
    }
}
