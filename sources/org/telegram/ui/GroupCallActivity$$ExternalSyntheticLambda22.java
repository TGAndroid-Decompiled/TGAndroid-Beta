package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import java.util.Calendar;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.video.VideoAds$$ExternalSyntheticLambda17;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.NumberPicker;

public final class GroupCallActivity$$ExternalSyntheticLambda22 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;
    public final Object f$5;
    public final Object f$6;

    public GroupCallActivity$$ExternalSyntheticLambda22(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = obj5;
        this.f$5 = obj6;
        this.f$6 = obj7;
    }

    @Override
    public final void onClick(View view) {
        int i = 1;
        Object obj = this.f$4;
        Object obj2 = this.f$3;
        Object obj3 = this.f$2;
        Object obj4 = this.f$1;
        Object obj5 = this.f$0;
        Object obj6 = this.f$6;
        Object obj7 = this.f$5;
        switch (this.$r8$classId) {
            case 0:
                final GroupCallActivity groupCallActivity = (GroupCallActivity) obj5;
                groupCallActivity.getClass();
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                groupCallActivity.scheduleAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.setDuration(600L);
                groupCallActivity.scheduleAnimator.addUpdateListener(new PhotoViewer$73$$ExternalSyntheticLambda0(groupCallActivity, 15));
                groupCallActivity.scheduleAnimator.addListener(new AnimatorListenerAdapter() {
                    public AnonymousClass43() {
                    }

                    @Override
                    public final void onAnimationEnd(Animator animator) {
                        GroupCallActivity.this.scheduleAnimator = null;
                    }
                });
                groupCallActivity.scheduleAnimator.start();
                boolean zIsChannelOrGiga = ChatObject.isChannelOrGiga(groupCallActivity.currentChat);
                GroupCallActivity.AnonymousClass20 anonymousClass20 = groupCallActivity.titleTextView;
                if (zIsChannelOrGiga) {
                    anonymousClass20.setText(LocaleController.getString(R.string.VoipChannelVoiceChat), true);
                } else {
                    anonymousClass20.setText(LocaleController.getString(R.string.VoipGroupVoiceChat), true);
                }
                Calendar calendar = Calendar.getInstance();
                NumberPicker numberPicker = (NumberPicker) obj4;
                GroupCallActivity.AnonymousClass40 anonymousClass40 = (GroupCallActivity.AnonymousClass40) obj3;
                GroupCallActivity.AnonymousClass41 anonymousClass41 = (GroupCallActivity.AnonymousClass41) obj2;
                boolean zCheckScheduleDate = AlertsCreator.checkScheduleDate(null, null, 0L, 604800L, 3, numberPicker, anonymousClass40, anonymousClass41);
                calendar.setTimeInMillis((((long) numberPicker.getValue()) * 86400000) + System.currentTimeMillis());
                calendar.set(11, anonymousClass40.getValue());
                calendar.set(12, anonymousClass41.getValue());
                if (zCheckScheduleDate) {
                    calendar.set(13, 0);
                }
                groupCallActivity.scheduleStartAt = (int) (calendar.getTimeInMillis() / 1000);
                groupCallActivity.updateScheduleUI(false);
                TL_phone.createGroupCall creategroupcall = new TL_phone.createGroupCall();
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                creategroupcall.peer = MessagesController.getInputPeer(chat);
                creategroupcall.random_id = Utilities.random.nextInt();
                creategroupcall.schedule_date = groupCallActivity.scheduleStartAt;
                creategroupcall.flags |= 2;
                ((AccountInstance) obj7).getConnectionsManager().sendRequest(creategroupcall, new LinkManager$$ExternalSyntheticLambda0(groupCallActivity, chat, (TLRPC.InputPeer) obj6, i), 2);
                break;
            default:
                ((VideoAds) obj5).lambda$show$17((Bulletin) obj4, (TLRPC.TL_sponsoredMessage) obj3, (Context) obj2, (Theme.ResourcesProvider) obj, (VideoAds.AdLayout) obj7, (VideoAds$$ExternalSyntheticLambda17) obj6, view);
                break;
        }
    }
}
