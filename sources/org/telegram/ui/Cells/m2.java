package org.telegram.ui.Cells;

import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class m2 {

    public long f24653a;

    public long f24654b;

    public boolean f24655c;
    public boolean d;

    public long f24656e;

    public int f24657f;

    public Integer f24658g;
    public int h;

    public int f24659i;

    public boolean f24660j;

    public boolean f24661k;

    public float f24662l;

    public boolean f24663m;

    public int f24664n;

    public boolean f24665o = false;

    public long f24666p;

    public final p2 f24667q;

    public m2(p2 p2Var) {
        this.f24667q = p2Var;
    }

    public final boolean a() {
        int iHashCode;
        int size;
        boolean z10;
        boolean z11;
        TLRPC.DraftMessage draft;
        int i10;
        boolean z12;
        p2 p2Var = this.f24667q;
        int i11 = p2Var.B0;
        TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(i11).dialogs_dict.f(p2Var.D0);
        if (dialog == null) {
            if (p2Var.f24862f1 == 3) {
                long j10 = this.f24653a;
                long j11 = p2Var.D0;
                if (j10 != j11) {
                    this.f24653a = j11;
                    return true;
                }
            }
            return false;
        }
        MessageObject messageObject = p2Var.f24841b1;
        if (messageObject == null) {
            iHashCode = 0;
        } else {
            iHashCode = p2Var.f24841b1.hashCode() + messageObject.getId();
        }
        long j12 = ((long) dialog.read_inbox_max_id) + (((long) dialog.read_outbox_max_id) << 8) + (((long) (dialog.unread_count + (dialog.unread_mark ? -1 : 0))) << 16) + ((long) (dialog.unread_reactions_count > 0 ? 262144 : 0)) + ((long) (dialog.unread_mentions_count > 0 ? 524288 : 0)) + ((long) (dialog.unread_poll_votes_count > 0 ? 2097152 : 0));
        if (p2Var.Q()) {
            int[] forumUnreadCount = MessagesController.getInstance(i11).getTopicsController().getForumUnreadCount(-p2Var.D0);
            if (forumUnreadCount[2] > 0) {
                j12 |= 1048576;
            }
            if (forumUnreadCount[4] > 0) {
                j12 |= 4194304;
            }
        }
        Integer printingStringType = (p2Var.Q() || !(p2Var.J0 || p2Var.L) || TextUtils.isEmpty(MessagesController.getInstance(i11).getPrintingString(p2Var.D0, (long) p2Var.getTopicId(), true))) ? null : MessagesController.getInstance(i11).getPrintingStringType(p2Var.D0, p2Var.getTopicId());
        int measuredWidth = p2Var.getMeasuredWidth() + (p2Var.getMeasuredHeight() << 16);
        if (p2Var.Q()) {
            ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(i11).getTopicsController().getTopics(-p2Var.D0);
            size = topics == null ? -1 : topics.size();
            if (size == -1 && MessagesController.getInstance(i11).getTopicsController().endIsReached(-p2Var.D0)) {
                size = 0;
            }
        } else {
            size = 0;
        }
        if (p2Var.L) {
            z10 = false;
            z11 = MediaDataController.getInstance(i11).getDraftVoice(p2Var.D0, (long) p2Var.getTopicId()) != null;
            draft = !z11 ? MediaDataController.getInstance(i11).getDraft(p2Var.D0, p2Var.getTopicId()) : null;
            if (draft != null && TextUtils.isEmpty(draft.message)) {
                draft = null;
            }
        } else {
            j12 = j12;
            z10 = false;
            if (p2Var.J0) {
                z11 = MediaDataController.getInstance(i11).getDraftVoice(p2Var.D0, 0L) != null;
                draft = !z11 ? MediaDataController.getInstance(i11).getDraft(p2Var.D0, 0L) : null;
            } else {
                z11 = false;
                draft = null;
            }
        }
        if (draft == null) {
            i10 = 0;
        } else {
            int iHashCode2 = draft.message.hashCode();
            TLRPC.InputReplyTo inputReplyTo = draft.reply_to;
            i10 = (inputReplyTo != null ? inputReplyTo.reply_to_msg_id << 16 : 0) + iHashCode2;
        }
        TLRPC.Chat chat = p2Var.f24847c2;
        boolean z13 = chat != null && chat.call_active && chat.call_not_empty;
        boolean zIsTranslatingDialog = MessagesController.getInstance(i11).getTranslateController().isTranslatingDialog(p2Var.D0);
        if (this.h == measuredWidth && this.f24654b == iHashCode && this.f24655c == zIsTranslatingDialog && this.f24653a == p2Var.D0 && this.d == dialog.isFolder && this.f24656e == j12 && Objects.equals(this.f24658g, printingStringType) && this.f24659i == size && i10 == this.f24657f && this.f24660j == p2Var.f24950w3 && this.f24661k == z13 && p2Var.f24868g2 == z11) {
            return z10;
        }
        if (this.f24653a != p2Var.D0) {
            this.f24662l = printingStringType == null ? 0.0f : 1.0f;
            this.f24665o = false;
        } else if (!Objects.equals(this.f24658g, printingStringType) || this.f24665o) {
            boolean z14 = this.f24665o;
            if (z14 || printingStringType != null) {
                if (z14 && this.f24654b != iHashCode) {
                    z12 = false;
                    this.f24665o = false;
                }
                if (this.f24654b != iHashCode) {
                    this.f24663m = z12;
                } else {
                    this.f24663m = true;
                }
            } else {
                this.f24665o = true;
                this.f24666p = System.currentTimeMillis();
            }
            z12 = false;
            if (this.f24654b != iHashCode) {
                this.f24663m = z12;
            } else {
                this.f24663m = true;
            }
        }
        if (printingStringType != null) {
            this.f24664n = printingStringType.intValue();
        }
        this.f24653a = p2Var.D0;
        this.f24654b = iHashCode;
        this.d = dialog.isFolder;
        this.f24656e = j12;
        this.f24658g = printingStringType;
        this.h = measuredWidth;
        this.f24657f = i10;
        this.f24659i = size;
        this.f24660j = p2Var.f24950w3;
        this.f24661k = z13;
        this.f24655c = zIsTranslatingDialog;
        return true;
    }

    public final void b() {
        float f10;
        boolean z10 = this.f24665o;
        p2 p2Var = this.f24667q;
        if (z10) {
            if (System.currentTimeMillis() - this.f24666p > 100) {
                this.f24665o = false;
            }
            p2Var.invalidate();
            return;
        }
        Integer num = this.f24658g;
        if (num != null && p2Var.f24843b3 != null) {
            float f11 = this.f24662l;
            if (f11 != 1.0f) {
                this.f24662l = f11 + 0.08f;
                p2Var.invalidate();
            } else if (num == null) {
                f10 = this.f24662l;
                if (f10 != 0.0f) {
                    this.f24662l = f10 - 0.08f;
                    p2Var.invalidate();
                }
            }
        } else if (num == null) {
            f10 = this.f24662l;
            if (f10 != 0.0f) {
                this.f24662l = f10 - 0.08f;
                p2Var.invalidate();
            }
        }
        this.f24662l = Utilities.clamp(this.f24662l, 1.0f, 0.0f);
    }
}
