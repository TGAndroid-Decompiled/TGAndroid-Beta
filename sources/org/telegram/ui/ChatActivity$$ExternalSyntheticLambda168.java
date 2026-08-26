package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.pip.utils.PipUtils;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.utils.CountdownTimer;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Business.BusinessRecipientsHelper;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.JoinGroupAlert;
import org.telegram.ui.Components.JoinGroupAlert$$ExternalSyntheticLambda12;
import org.telegram.ui.Components.spoilers.SpoilerEffect;
import org.telegram.ui.Components.spoilers.SpoilersClickDetector;
import org.telegram.ui.Components.spoilers.SpoilersTextView;
import org.telegram.ui.Components.spoilers.SpoilersTextView$$ExternalSyntheticLambda2;
import org.telegram.ui.Stories.DialogStoriesCell;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesListPlaceProvider;

public final class ChatActivity$$ExternalSyntheticLambda168 implements UsersSelectActivity.FilterUsersActivityDelegate, AlertDialog.OnButtonClickListener, CountdownTimer.Callback, MessagesController.ErrorDelegate, SpoilersClickDetector.OnSpoilerClickedListener, StoriesListPlaceProvider.LoadNextInterface {
    public final int $r8$classId;
    public final Object f$0;
    public final boolean f$1;

    public ChatActivity$$ExternalSyntheticLambda168(int i, Object obj, boolean z) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = z;
    }

    @Override
    public void didSelectChats(int i, ArrayList arrayList) {
        switch (this.$r8$classId) {
            case 1:
                BusinessRecipientsHelper businessRecipientsHelper = (BusinessRecipientsHelper) this.f$0;
                ArrayList arrayList2 = businessRecipientsHelper.neverShow;
                ArrayList arrayList3 = businessRecipientsHelper.alwaysShow;
                int i2 = 0;
                if (this.f$1) {
                    businessRecipientsHelper.includeFlags = i;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList);
                    while (i2 < arrayList3.size()) {
                        arrayList2.remove(arrayList3.get(i2));
                        i2++;
                    }
                } else {
                    businessRecipientsHelper.excludeFlags = i;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    while (i2 < arrayList2.size()) {
                        arrayList3.remove(arrayList2.get(i2));
                        i2++;
                    }
                }
                businessRecipientsHelper.update.run();
                break;
            default:
                FilterCreateActivity filterCreateActivity = (FilterCreateActivity) this.f$0;
                filterCreateActivity.newFilterFlags = i;
                boolean z = this.f$1;
                LongSparseIntArray longSparseIntArray = filterCreateActivity.newPinned;
                if (z) {
                    filterCreateActivity.onUpdate(filterCreateActivity.newAlwaysShow, arrayList, true);
                    filterCreateActivity.newAlwaysShow = arrayList;
                    for (int i3 = 0; i3 < filterCreateActivity.newAlwaysShow.size(); i3++) {
                        filterCreateActivity.newNeverShow.remove(filterCreateActivity.newAlwaysShow.get(i3));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    int size = longSparseIntArray.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        long jKeyAt = longSparseIntArray.keyAt(i4);
                        Long lValueOf = Long.valueOf(jKeyAt);
                        if (!DialogObject.isEncryptedDialog(jKeyAt) && !filterCreateActivity.newAlwaysShow.contains(lValueOf)) {
                            arrayList4.add(lValueOf);
                        }
                    }
                    int size2 = arrayList4.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        longSparseIntArray.delete(((Long) arrayList4.get(i5)).longValue());
                    }
                } else {
                    filterCreateActivity.onUpdate(filterCreateActivity.newNeverShow, arrayList, false);
                    filterCreateActivity.newNeverShow = arrayList;
                    for (int i6 = 0; i6 < filterCreateActivity.newNeverShow.size(); i6++) {
                        Long l = (Long) filterCreateActivity.newNeverShow.get(i6);
                        filterCreateActivity.newAlwaysShow.remove(l);
                        longSparseIntArray.delete(l.longValue());
                    }
                }
                filterCreateActivity.fillFilterName();
                filterCreateActivity.checkDoneButton(false);
                filterCreateActivity.updateRows$12();
                break;
        }
    }

    @Override
    public void loadNext(boolean z) {
        DialogStoriesCell dialogStoriesCell = (DialogStoriesCell) this.f$0;
        dialogStoriesCell.getClass();
        if (!this.f$1 && z) {
            boolean z2 = dialogStoriesCell.type == 1;
            StoriesController storiesController = dialogStoriesCell.storiesController;
            if (z2) {
                if (!storiesController.hasMoreHidden) {
                    return;
                }
            } else if (!storiesController.hasMore) {
                return;
            }
            storiesController.loadFromServer(z2);
        }
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                ChatActivity chatActivity = (ChatActivity) this.f$0;
                ChatActivity.AnonymousClass39 anonymousClass39 = chatActivity.chatActivityEnterView;
                if (anonymousClass39 != null) {
                    if (!this.f$1) {
                        anonymousClass39.cancelRecordingAudioVideo();
                    } else {
                        chatActivity.finishFragment();
                    }
                }
                break;
            case 1:
            case 3:
            default:
                GroupCallActivity groupCallActivity = GroupCallActivity.this;
                groupCallActivity.call.toggleRecord(null, 0);
                groupCallActivity.getUndoView().showWithAction(0L, this.f$1 ? 101 : 40, (Object) null, (Object) null, (Runnable) null, (Runnable) null);
                break;
            case 2:
                ((CacheControlActivity) this.f$0).lambda$clearDatabase$24(this.f$1);
                break;
            case 4:
                Activity activity = (Activity) this.f$0;
                if (activity != null && Build.VERSION.SDK_INT >= 23) {
                    if (this.f$1 && PipUtils.checkPermissions(activity) == -2) {
                        try {
                            activity.startActivity(new Intent("android.settings.PICTURE_IN_PICTURE_SETTINGS", Uri.parse("package:" + activity.getPackageName())));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    try {
                        activity.startActivity(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + activity.getPackageName())));
                    } catch (Exception e2) {
                        FileLog.e(e2);
                        return;
                    }
                    break;
                }
                break;
        }
    }

    @Override
    public void onSpoilerClicked(SpoilerEffect spoilerEffect, float f, float f2) {
        SpoilersTextView spoilersTextView = (SpoilersTextView) this.f$0;
        if (spoilersTextView.isSpoilersRevealed || !this.f$1) {
            return;
        }
        spoilerEffect.onRippleEndCallback = new SpoilersTextView$$ExternalSyntheticLambda2(spoilersTextView, 0);
        float fSqrt = (float) Math.sqrt(Math.pow(spoilersTextView.getHeight(), 2.0d) + Math.pow(spoilersTextView.getWidth(), 2.0d));
        ArrayList arrayList = spoilersTextView.spoilers;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((SpoilerEffect) obj).startRipple(f, f2, fSqrt, false);
        }
    }

    @Override
    public void onTimerUpdate(long j) {
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = ((ChatMessageCell) this.f$0).animatedInfoLayout2;
        if (animatedTextDrawable != null) {
            animatedTextDrawable.setText(LocaleController.formatPollEndTime((int) j, this.f$1), true, true);
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        JoinGroupAlert joinGroupAlert = (JoinGroupAlert) this.f$0;
        if (tL_error != null) {
            joinGroupAlert.getClass();
            if ("INVITE_REQUEST_SENT".equals(tL_error.text)) {
                joinGroupAlert.setOnDismissListener(new JoinGroupAlert$$ExternalSyntheticLambda12(0, joinGroupAlert, this.f$1));
            }
        }
        joinGroupAlert.lambda$showGiftOfferSheet$15();
        return false;
    }
}
