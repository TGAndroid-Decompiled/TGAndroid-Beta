package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;

public final class PollItemMenu$$ExternalSyntheticLambda6 implements Runnable {
    public final int $r8$classId = 1;
    public final PollItemMenu f$0;
    public final boolean f$1;
    public final BaseFragment f$2;
    public final ArrayList f$3;
    public final TLRPC.PollAnswer f$4;

    public PollItemMenu$$ExternalSyntheticLambda6(PollItemMenu pollItemMenu, boolean z, TLRPC.PollAnswer pollAnswer, BaseFragment baseFragment, ArrayList arrayList) {
        this.f$0 = pollItemMenu;
        this.f$1 = z;
        this.f$4 = pollAnswer;
        this.f$2 = baseFragment;
        this.f$3 = arrayList;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                PollItemMenu pollItemMenu = this.f$0;
                pollItemMenu.getClass();
                boolean z = this.f$1;
                BaseFragment baseFragment = this.f$2;
                if (z) {
                    ArrayList<TLRPC.PollAnswer> arrayList = this.f$3;
                    arrayList.remove(this.f$4);
                    baseFragment.getSendMessagesHelper().sendVote(pollItemMenu.messageObject, arrayList, null);
                } else {
                    baseFragment.getSendMessagesHelper().sendVote(pollItemMenu.messageObject, null, null);
                }
                pollItemMenu.dismiss(true);
                break;
            default:
                PollItemMenu pollItemMenu2 = this.f$0;
                pollItemMenu2.getClass();
                boolean z2 = this.f$1;
                TLRPC.PollAnswer pollAnswer = this.f$4;
                BaseFragment baseFragment2 = this.f$2;
                if (z2) {
                    ArrayList<TLRPC.PollAnswer> arrayList2 = this.f$3;
                    arrayList2.add(pollAnswer);
                    baseFragment2.getSendMessagesHelper().sendVote(pollItemMenu2.messageObject, arrayList2, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList3 = new ArrayList<>(1);
                    arrayList3.add(pollAnswer);
                    baseFragment2.getSendMessagesHelper().sendVote(pollItemMenu2.messageObject, arrayList3, null);
                }
                pollItemMenu2.dismiss(true);
                break;
        }
    }

    public PollItemMenu$$ExternalSyntheticLambda6(PollItemMenu pollItemMenu, boolean z, BaseFragment baseFragment, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.f$0 = pollItemMenu;
        this.f$1 = z;
        this.f$2 = baseFragment;
        this.f$3 = arrayList;
        this.f$4 = pollAnswer;
    }
}
