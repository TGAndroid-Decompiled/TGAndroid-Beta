package org.telegram.ui.Components.poll;

import android.net.Uri;
import android.util.Base64;
import android.util.SparseArray;
import org.telegram.messenger.utils.tlutils.TlUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.poll.attached.PollAttachedMediaLink;
import org.telegram.ui.Components.poll.attached.PollAttachedMediaLocation;
import org.telegram.ui.Components.poll.attached.PollAttachedMediaSticker;

public class PollAttachedMediaPack {
    public final SparseArray medias = new SparseArray();

    public PollAttachedMedia get(int i) {
        return (PollAttachedMedia) this.medias.get(i);
    }

    public void set(int i, PollAttachedMedia pollAttachedMedia) {
        this.medias.put(i, pollAttachedMedia);
    }

    public void remove(int i) {
        this.medias.remove(i);
    }

    public void removeAnswerAndShift(int i) {
        if (hasKeyBiggerThan(i)) {
            removeAndShiftKeys(i);
        } else {
            this.medias.remove(i);
        }
    }

    private boolean hasKeyBiggerThan(int i) {
        int size = this.medias.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.medias.keyAt(i2) > i) {
                return true;
            }
        }
        return false;
    }

    private void removeAndShiftKeys(int i) {
        if (i < 0) {
            return;
        }
        SparseArray sparseArrayClone = this.medias.clone();
        this.medias.clear();
        int size = sparseArrayClone.size();
        for (int i2 = 0; i2 < size; i2++) {
            int iKeyAt = sparseArrayClone.keyAt(i2);
            PollAttachedMedia pollAttachedMedia = (PollAttachedMedia) sparseArrayClone.valueAt(i2);
            if (iKeyAt < i) {
                this.medias.put(iKeyAt, pollAttachedMedia);
            }
            if (iKeyAt > i) {
                this.medias.put(iKeyAt - 1, pollAttachedMedia);
            }
        }
    }

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

    public static void removeInputMedia(TLRPC.TL_inputMediaPoll tL_inputMediaPoll, int i) {
        TLRPC.PollAnswer pollAnswer;
        if (i == -2) {
            tL_inputMediaPoll.attached_media = null;
            return;
        }
        if (i == -3) {
            tL_inputMediaPoll.solution_media = null;
        } else {
            if (i < 0 || i >= tL_inputMediaPoll.poll.answers.size() || (pollAnswer = tL_inputMediaPoll.poll.answers.get(i)) == null) {
                return;
            }
            pollAnswer.input_media = null;
        }
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

    public void applyAllQuickMedia(TLRPC.TL_inputMediaPoll tL_inputMediaPoll) {
        int size = this.medias.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = this.medias.keyAt(i);
            PollAttachedMedia pollAttachedMedia = (PollAttachedMedia) this.medias.valueAt(i);
            if (pollAttachedMedia instanceof PollAttachedMediaLink) {
                TLRPC.TL_inputMediaWebPage tL_inputMediaWebPage = new TLRPC.TL_inputMediaWebPage();
                tL_inputMediaWebPage.url = ((PollAttachedMediaLink) pollAttachedMedia).url;
                tL_inputMediaWebPage.optional = true;
                setInputMedia(tL_inputMediaPoll, iKeyAt, tL_inputMediaWebPage);
            } else if (pollAttachedMedia instanceof PollAttachedMediaLocation) {
                setInputMedia(tL_inputMediaPoll, iKeyAt, TlUtils.toInputMediaGeo(((PollAttachedMediaLocation) pollAttachedMedia).media));
            } else if (pollAttachedMedia instanceof PollAttachedMediaSticker) {
                TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                TLRPC.Document document = ((PollAttachedMediaSticker) pollAttachedMedia).sticker;
                tL_inputDocument.id = document.id;
                tL_inputDocument.access_hash = document.access_hash;
                tL_inputDocument.file_reference = document.file_reference;
                tL_inputMediaDocument.id = tL_inputDocument;
                setInputMedia(tL_inputMediaPoll, iKeyAt, tL_inputMediaDocument);
            }
        }
    }

    public void applyAllQuickMedia(TLRPC.TL_messageMediaPoll tL_messageMediaPoll) {
        int size = this.medias.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = this.medias.keyAt(i);
            PollAttachedMedia pollAttachedMedia = (PollAttachedMedia) this.medias.valueAt(i);
            if (pollAttachedMedia instanceof PollAttachedMediaLink) {
                TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                TLRPC.TL_webPage tL_webPage = new TLRPC.TL_webPage();
                tL_messageMediaWebPage.webpage = tL_webPage;
                String str = ((PollAttachedMediaLink) pollAttachedMedia).url;
                tL_webPage.display_url = str;
                tL_webPage.url = str;
                setMessageMedia(tL_messageMediaPoll, iKeyAt, tL_messageMediaWebPage);
            } else if (pollAttachedMedia instanceof PollAttachedMediaLocation) {
                setMessageMedia(tL_messageMediaPoll, iKeyAt, ((PollAttachedMediaLocation) pollAttachedMedia).media);
            } else if (pollAttachedMedia instanceof PollAttachedMediaSticker) {
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                tL_messageMediaDocument.document = ((PollAttachedMediaSticker) pollAttachedMedia).sticker;
                setMessageMedia(tL_messageMediaPoll, iKeyAt, tL_messageMediaDocument);
            }
        }
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

    public static byte[] getOptionIdQueryParameter(Uri uri, String str) {
        try {
            String queryParameter = uri.getQueryParameter(str);
            if (queryParameter != null) {
                return Base64.decode(queryParameter, 9);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean hasWrongInputMediaTypes(TLRPC.TL_inputMediaPoll tL_inputMediaPoll) {
        TLRPC.InputMedia inputMedia = getInputMedia(tL_inputMediaPoll, -2);
        if (!(inputMedia instanceof TLRPC.TL_inputMediaUploadedPhoto) && !(inputMedia instanceof TLRPC.TL_inputMediaUploadedDocument)) {
            TLRPC.InputMedia inputMedia2 = getInputMedia(tL_inputMediaPoll, -3);
            if (!(inputMedia2 instanceof TLRPC.TL_inputMediaUploadedPhoto) && !(inputMedia2 instanceof TLRPC.TL_inputMediaUploadedDocument)) {
                int size = tL_inputMediaPoll.poll.answers.size();
                for (int i = 0; i < size; i++) {
                    TLRPC.InputMedia inputMedia3 = getInputMedia(tL_inputMediaPoll, i);
                    if ((inputMedia3 instanceof TLRPC.TL_inputMediaUploadedPhoto) || (inputMedia3 instanceof TLRPC.TL_inputMediaUploadedDocument)) {
                        return true;
                    }
                }
                return false;
            }
        }
        return true;
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

    public static String getAttachPath(TLRPC.Message message, int i) {
        SparseArray<String> sparseArray;
        if (message == null || (sparseArray = message.pollMediaAttachPaths) == null) {
            return null;
        }
        return sparseArray.get(i);
    }
}
