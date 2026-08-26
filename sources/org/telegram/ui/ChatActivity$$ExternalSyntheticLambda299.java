package org.telegram.ui;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.provider.MediaStore;
import com.google.android.datatransport.runtime.AutoValue_TransportContext;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.gms.internal.mlkit_vision_common.zzkw;
import com.google.firebase.concurrent.DelegatingScheduledExecutorService;
import com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda5;
import com.google.firebase.concurrent.DelegatingScheduledFuture;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import me.vkryl.android.util.ClickHelper$$ExternalSyntheticLambda0;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.utils.PhotoUtilities$$ExternalSyntheticLambda2;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.ImageUpdater;
import org.telegram.ui.Components.ScrimOptions;
import org.telegram.ui.Stories.recorder.PreviewView;
import org.telegram.ui.Stories.recorder.StoryEntry;

public final class ChatActivity$$ExternalSyntheticLambda299 implements SynchronizationGuard.CriticalSection, DelegatingScheduledFuture.Resolver, ImageUpdater.ImageUpdaterDelegate, AlertsCreator.ScheduleDatePickerDelegate, AlertDialog.OnButtonClickListener, StoryEntry.DecodeBitmap {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final long f$2;
    public final Object f$3;

    public ChatActivity$$ExternalSyntheticLambda299(Object obj, Object obj2, long j, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = j;
        this.f$3 = obj3;
    }

    @Override
    public ScheduledFuture addCompleter(final PhotoViewer.AnonymousClass18 anonymousClass18) {
        switch (this.$r8$classId) {
            case 2:
                DelegatingScheduledExecutorService delegatingScheduledExecutorService = (DelegatingScheduledExecutorService) this.f$0;
                return delegatingScheduledExecutorService.scheduler.schedule(new DelegatingScheduledExecutorService$$ExternalSyntheticLambda5(delegatingScheduledExecutorService, (Runnable) this.f$1, anonymousClass18, 1), this.f$2, (TimeUnit) this.f$3);
            default:
                final DelegatingScheduledExecutorService delegatingScheduledExecutorService2 = (DelegatingScheduledExecutorService) this.f$0;
                final Callable callable = (Callable) this.f$1;
                return delegatingScheduledExecutorService2.scheduler.schedule(new Callable() {
                    @Override
                    public final Object call() {
                        DelegatingScheduledExecutorService delegatingScheduledExecutorService3 = delegatingScheduledExecutorService2;
                        return delegatingScheduledExecutorService3.delegate.submit(new ClickHelper$$ExternalSyntheticLambda0(1, callable, anonymousClass18));
                    }
                }, this.f$2, (TimeUnit) this.f$3);
        }
    }

    @Override
    public boolean canFinishFragment() {
        return true;
    }

    @Override
    public Bitmap decode(BitmapFactory.Options options) {
        long j = this.f$2;
        PreviewView previewView = (PreviewView) this.f$0;
        StoryEntry storyEntry = (StoryEntry) this.f$1;
        if (!storyEntry.isVideo) {
            return BitmapFactory.decodeFile((String) this.f$3, options);
        }
        String str = storyEntry.thumbPath;
        if (str != null) {
            return BitmapFactory.decodeFile(str, options);
        }
        try {
            return MediaStore.Video.Thumbnails.getThumbnail(previewView.getContext().getContentResolver(), j, 1, options);
        } catch (Throwable unused) {
            previewView.invalidate();
            return null;
        }
    }

    @Override
    public void didSelectDate(int i, int i2, boolean z) {
        ((ChatActivity) this.f$0).lambda$didLongPressFormattedDate$420((ArrayList) this.f$1, this.f$2, (ScrimOptions) this.f$3, z, i);
    }

    @Override
    public void didStartUpload(boolean z, boolean z2) {
    }

    @Override
    public void didUploadFailed() {
    }

    @Override
    public void didUploadPhoto(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z, TLRPC.VideoSize videoSize) {
        TLRPC.FileLocation[] fileLocationArr = (TLRPC.FileLocation[]) this.f$1;
        TLRPC.FileLocation[] fileLocationArr2 = (TLRPC.FileLocation[]) this.f$3;
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            fileLocationArr[0] = photoSize2.location;
            fileLocationArr2[0] = photoSize.location;
            return;
        }
        TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
        if (inputFile != null) {
            tL_photos_uploadProfilePhoto.file = inputFile;
            tL_photos_uploadProfilePhoto.flags |= 1;
        }
        if (inputFile2 != null) {
            tL_photos_uploadProfilePhoto.video = inputFile2;
            int i = tL_photos_uploadProfilePhoto.flags;
            tL_photos_uploadProfilePhoto.video_start_ts = d;
            tL_photos_uploadProfilePhoto.flags = i | 6;
        }
        if (videoSize != null) {
            tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
            tL_photos_uploadProfilePhoto.flags |= 16;
        }
        ChatActivity chatActivity = (ChatActivity) this.f$0;
        chatActivity.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new PhotoUtilities$$ExternalSyntheticLambda2(chatActivity, fileLocationArr, str, fileLocationArr2, this.f$2));
    }

    @Override
    public Object execute() {
        Uploader uploader = (Uploader) this.f$0;
        SQLiteEventStore sQLiteEventStore = (SQLiteEventStore) uploader.eventStore;
        sQLiteEventStore.getClass();
        Iterable iterable = (Iterable) this.f$1;
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + SQLiteEventStore.toIdList(iterable);
            SQLiteDatabase db = sQLiteEventStore.getDb();
            db.beginTransaction();
            try {
                db.compileStatement(str).execute();
                Cursor cursorRawQuery = db.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        sQLiteEventStore.recordLogEventDropped(cursorRawQuery.getInt(0), LogEventDropped.Reason.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                    } catch (Throwable th) {
                        cursorRawQuery.close();
                        throw th;
                    }
                }
                cursorRawQuery.close();
                db.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                db.setTransactionSuccessful();
                db.endTransaction();
            } catch (Throwable th2) {
                db.endTransaction();
                throw th2;
            }
        }
        sQLiteEventStore.inTransaction(new LaunchActivity$$ExternalSyntheticLambda112(uploader.clock.getTime() + this.f$2, (AutoValue_TransportContext) this.f$3));
        return null;
    }

    @Override
    public PhotoViewer.PlaceProviderObject getCloseIntoObject() {
        return null;
    }

    @Override
    public String getInitialSearchString() {
        return null;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 5:
                boolean z = false;
                CheckBoxCell checkBoxCell = ((CheckBoxCell[]) this.f$1)[0];
                if (checkBoxCell != null && checkBoxCell.isChecked()) {
                    z = true;
                }
                GroupCallActivity.processOnLeave((ChatObject.Call) this.f$0, z, this.f$2, (Runnable) this.f$3);
                break;
            default:
                ProfileActivity profileActivity = ProfileActivity.this;
                profileActivity.disableProfileAnimation = true;
                Bundle bundleM = zzkw.m("scrollToTopOnResume", true);
                long j = -this.f$2;
                bundleM.putLong("chat_id", j);
                if (profileActivity.getMessagesController().checkCanOpenChat(bundleM, (DialogsActivity) this.f$1)) {
                    ChatActivity chatActivity = new ChatActivity(bundleM);
                    NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                    int i2 = NotificationCenter.closeChats;
                    notificationCenter.removeObserver(profileActivity, i2);
                    profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i2, new Object[0]);
                    profileActivity.getMessagesController().addUserToChat(j, (TLRPC.User) this.f$3, 0, null, chatActivity, true, null, null);
                    profileActivity.presentFragment(chatActivity, true);
                    break;
                }
                break;
        }
    }

    @Override
    public void onUploadProgressChanged(float f) {
    }

    @Override
    public boolean supportsBulletin() {
        return false;
    }

    public ChatActivity$$ExternalSyntheticLambda299(Object obj, Object obj2, Object obj3, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$3 = obj3;
        this.f$2 = j;
    }

    public ChatActivity$$ExternalSyntheticLambda299(ProfileActivity.AnonymousClass6 anonymousClass6, long j, DialogsActivity dialogsActivity, TLRPC.User user) {
        this.$r8$classId = 6;
        this.f$0 = anonymousClass6;
        this.f$2 = j;
        this.f$1 = dialogsActivity;
        this.f$3 = user;
    }
}
