package org.telegram.ui.Components.poll;

import android.net.Uri;
import android.util.Base64;
import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

public final class PollAttachedMediaPack {
    public final SparseArray medias = new SparseArray();

    public static int findInputMedia(TLRPC.TL_inputMediaPoll tL_inputMediaPoll, TLRPC.InputMedia inputMedia) {
        if (tL_inputMediaPoll.attached_media == inputMedia) {
            return -2;
        }
        if (tL_inputMediaPoll.solution_media == inputMedia) {
            return -3;
        }
        int size = tL_inputMediaPoll.poll.answers.size();
        for (int i = 0; i < size; i++) {
            if (tL_inputMediaPoll.poll.answers.get(i).input_media == inputMedia) {
                return i;
            }
        }
        return -1;
    }

    public static String getAttachPath(int i, TLRPC.Message message) {
        SparseArray<String> sparseArray;
        if (message == null || (sparseArray = message.pollMediaAttachPaths) == null) {
            return null;
        }
        return sparseArray.get(i);
    }

    public static TLRPC.InputMedia getFirstInputMedia(TLRPC.TL_inputMediaPoll tL_inputMediaPoll) {
        TLRPC.InputMedia inputMedia = tL_inputMediaPoll.attached_media;
        if (inputMedia != null) {
            return inputMedia;
        }
        TLRPC.InputMedia inputMedia2 = tL_inputMediaPoll.solution_media;
        if (inputMedia2 != null) {
            return inputMedia2;
        }
        int size = tL_inputMediaPoll.poll.answers.size();
        for (int i = 0; i < size; i++) {
            TLRPC.InputMedia inputMedia3 = tL_inputMediaPoll.poll.answers.get(i).input_media;
            if (inputMedia3 != null) {
                return inputMedia3;
            }
        }
        return null;
    }

    public static TLRPC.InputMedia getInputMedia(TLRPC.TL_inputMediaPoll tL_inputMediaPoll, int i) {
        TLRPC.PollAnswer pollAnswer;
        if (i == -2) {
            return tL_inputMediaPoll.attached_media;
        }
        if (i == -3) {
            return tL_inputMediaPoll.solution_media;
        }
        if (i < 0 || i >= tL_inputMediaPoll.poll.answers.size() || (pollAnswer = tL_inputMediaPoll.poll.answers.get(i)) == null) {
            return null;
        }
        return pollAnswer.input_media;
    }

    public static TLRPC.MessageMedia getMedia(TLRPC.TL_messageMediaPoll tL_messageMediaPoll, int i) {
        TLRPC.PollAnswer pollAnswer;
        if (i == -2) {
            return tL_messageMediaPoll.attached_media;
        }
        if (i == -3) {
            return tL_messageMediaPoll.results.solution_media;
        }
        if (i < 0 || i >= tL_messageMediaPoll.poll.answers.size() || (pollAnswer = tL_messageMediaPoll.poll.answers.get(i)) == null) {
            return null;
        }
        return pollAnswer.media;
    }

    public static byte[] getOptionIdQueryParameter(Uri uri) {
        try {
            String queryParameter = uri.getQueryParameter("option");
            if (queryParameter != null) {
                return Base64.decode(queryParameter, 9);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void setAttachPath(TLRPC.Message message, String str, int i) {
        if (message == null) {
            return;
        }
        if (message.pollMediaAttachPaths == null) {
            message.pollMediaAttachPaths = new SparseArray<>();
        }
        message.pollMediaAttachPaths.put(i, str);
    }

    public static void setInputMedia(TLRPC.TL_inputMediaPoll tL_inputMediaPoll, int i, TLRPC.InputMedia inputMedia) {
        if (i == -2) {
            tL_inputMediaPoll.attached_media = inputMedia;
            return;
        }
        if (i == -3) {
            tL_inputMediaPoll.solution_media = inputMedia;
            return;
        }
        if (i < 0 || i >= tL_inputMediaPoll.poll.answers.size()) {
            return;
        }
        TLRPC.PollAnswer pollAnswer = tL_inputMediaPoll.poll.answers.get(i);
        if (pollAnswer instanceof TLRPC.TL_inputPollAnswer) {
            pollAnswer.input_media = inputMedia;
            return;
        }
        TLRPC.TL_inputPollAnswer tL_inputPollAnswer = new TLRPC.TL_inputPollAnswer();
        tL_inputPollAnswer.input_media = inputMedia;
        tL_inputPollAnswer.text = pollAnswer.text;
        tL_inputPollAnswer.media = pollAnswer.media;
        tL_inputPollAnswer.option = pollAnswer.option;
        tL_inputMediaPoll.poll.answers.set(i, tL_inputPollAnswer);
    }

    public static void setMessageMedia(TLRPC.TL_messageMediaPoll tL_messageMediaPoll, int i, TLRPC.MessageMedia messageMedia) {
        if (i == -2) {
            tL_messageMediaPoll.attached_media = messageMedia;
            return;
        }
        if (i == -3) {
            tL_messageMediaPoll.results.solution_media = messageMedia;
            return;
        }
        if (i < 0 || i >= tL_messageMediaPoll.poll.answers.size()) {
            return;
        }
        TLRPC.PollAnswer pollAnswer = tL_messageMediaPoll.poll.answers.get(i);
        if (pollAnswer instanceof TLRPC.TL_inputPollAnswer) {
            TLRPC.TL_pollAnswer tL_pollAnswer = new TLRPC.TL_pollAnswer();
            tL_pollAnswer.text = pollAnswer.text;
            tL_pollAnswer.option = new byte[]{(byte) (i + 48)};
            tL_pollAnswer.media = messageMedia;
            tL_messageMediaPoll.poll.answers.set(i, tL_pollAnswer);
            return;
        }
        pollAnswer.media = messageMedia;
        TLRPC.TL_inputPollAnswer tL_inputPollAnswer = new TLRPC.TL_inputPollAnswer();
        tL_inputPollAnswer.text = pollAnswer.text;
        tL_inputPollAnswer.media = pollAnswer.media;
        tL_inputPollAnswer.option = pollAnswer.option;
    }

    public final void removeAnswerAndShift(int i) {
        SparseArray sparseArray = this.medias;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (sparseArray.keyAt(i2) > i) {
                if (i < 0) {
                    return;
                }
                SparseArray sparseArrayClone = sparseArray.clone();
                sparseArray.clear();
                int size2 = sparseArrayClone.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    int iKeyAt = sparseArrayClone.keyAt(i3);
                    PollAttachedMedia pollAttachedMedia = (PollAttachedMedia) sparseArrayClone.valueAt(i3);
                    if (iKeyAt < i) {
                        sparseArray.put(iKeyAt, pollAttachedMedia);
                    }
                    if (iKeyAt > i) {
                        sparseArray.put(iKeyAt - 1, pollAttachedMedia);
                    }
                }
                return;
            }
        }
        sparseArray.remove(i);
    }
}
