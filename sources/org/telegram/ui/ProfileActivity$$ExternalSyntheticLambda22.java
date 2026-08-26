package org.telegram.ui;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.View;
import com.google.android.datatransport.runtime.AutoValue_TransportContext;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.crashlytics.internal.model.AutoValue_StaticSessionData;
import com.google.firebase.inject.Deferred$DeferredHandler;
import com.google.firebase.inject.Provider;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.EmojiThemes$$ExternalSyntheticLambda3;
import org.telegram.ui.Components.CreateRtmpStreamBottomSheet;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Stars.BotStarsActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;

public final class ProfileActivity$$ExternalSyntheticLambda22 implements SynchronizationGuard.CriticalSection, SQLiteEventStore.Function, Deferred$DeferredHandler, ChatObject.Call.OnParticipantsLoad, ImageReceiver.ImageReceiverDelegate, AlertDialog.OnButtonClickListener, RecyclerListView.OnItemClickListenerExtended, MessagesController.IsInChatCheckedCallback, TwoStepVerificationActivity.TwoStepVerificationActivityDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final long f$2;

    public ProfileActivity$$ExternalSyntheticLambda22(Object obj, long j, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = j;
        this.f$1 = obj2;
    }

    @Override
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i = ((LogEventDropped.Reason) this.f$1).number_;
        String string = Integer.toString(i);
        String str = (String) this.f$0;
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, string});
        try {
            boolean z = cursorRawQuery.getCount() > 0;
            cursorRawQuery.close();
            long j = this.f$2;
            if (z) {
                sQLiteDatabase.execSQL(RendererCapabilities.CC.m(j, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(i)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    @Override
    public void didEnterPassword(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((BotStarsActivity) this.f$0).initWithdraw(true, this.f$2, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f$1);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        ResultCallback resultCallback = (ResultCallback) this.f$0;
        long j = this.f$2;
        File file = (File) this.f$1;
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        if (!z || bitmapSafe == null || bitmapSafe.bitmap.isRecycled()) {
            return;
        }
        Bitmap bitmap = bitmapSafe.bitmap;
        if (bitmap == null) {
            Drawable drawable = bitmapSafe.drawable;
            if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
            }
        }
        if (bitmap != null) {
            if (resultCallback != null) {
                resultCallback.onComplete(new Pair(Long.valueOf(j), bitmap));
            }
            Utilities.globalQueue.postRunnable(new EmojiThemes$$ExternalSyntheticLambda3(file, bitmap));
        } else if (resultCallback != null) {
            resultCallback.onComplete(null);
        }
    }

    @Override
    public void didSetImageBitmap(int i, String str, Drawable drawable) {
        ImageReceiver.ImageReceiverDelegate.CC.$default$didSetImageBitmap(this, i, str, drawable);
    }

    @Override
    public Object execute() {
        Uploader uploader = (Uploader) this.f$0;
        long time = uploader.clock.getTime() + this.f$2;
        SQLiteEventStore sQLiteEventStore = (SQLiteEventStore) uploader.eventStore;
        AutoValue_TransportContext autoValue_TransportContext = (AutoValue_TransportContext) this.f$1;
        sQLiteEventStore.getClass();
        sQLiteEventStore.inTransaction(new LaunchActivity$$ExternalSyntheticLambda112(time, autoValue_TransportContext));
        return null;
    }

    @Override
    public void handle(Provider provider) {
        ((CrashlyticsNativeComponentDeferredProxy) provider.get()).prepareNativeSession((String) this.f$0, this.f$2, (AutoValue_StaticSessionData) this.f$1);
    }

    @Override
    public boolean hasDoubleTap(View view) {
        return false;
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 6:
                ((CreateRtmpStreamBottomSheet) this.f$0).lambda$new$10((ButtonWithCounterView) this.f$1, this.f$2);
                break;
            case 7:
                GroupCallActivity groupCallActivity = (GroupCallActivity) this.f$0;
                BaseFragment baseFragment = (BaseFragment) ArticleViewer.IBlock.CC.m((ActionBarLayout) groupCallActivity.parentActivity.getActionBarLayout(), 1, ((ActionBarLayout) groupCallActivity.parentActivity.getActionBarLayout()).getFragmentStack());
                groupCallActivity.accountInstance.getMessagesController().addUserToChat(groupCallActivity.getChatId(), (TLRPC.User) this.f$1, 0, null, baseFragment, new LinkManager$3$$ExternalSyntheticLambda0(groupCallActivity, this.f$2, 16));
                break;
            default:
                StoryPrivacyBottomSheet.Page page = (StoryPrivacyBottomSheet.Page) this.f$0;
                HashMap map = page.selectedUsersByGroup;
                Long lValueOf = Long.valueOf(this.f$2);
                ArrayList arrayList = (ArrayList) this.f$1;
                map.put(lValueOf, arrayList);
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    long jLongValue = ((Long) obj).longValue();
                    page.changelog.put(Boolean.TRUE, jLongValue);
                }
                page.updateSpans(true);
                page.updateButton(true);
                page.updateCheckboxes$1(true);
                alertDialog.dismiss();
                page.searchField.scroll = true;
                break;
        }
    }

    @Override
    public void onDoubleTap(View view, float f, float f2) {
    }

    @Override
    public void onItemClick(View view, int i, float f, float f2) {
        ((ProfileActivity) this.f$0).lambda$createView$29((Context) this.f$1, this.f$2, view, i, f, f2);
    }

    @Override
    public void onLoad(ArrayList arrayList) {
        ((VoIPService) this.f$0).lambda$createGroupInstance$69(this.f$2, (int[]) this.f$1, arrayList);
    }

    @Override
    public void run(boolean z, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new GroupCallActivity$$ExternalSyntheticLambda88((ProfileActivity.AnonymousClass6) this.f$0, this.f$2, tL_chatAdminRights, str, z, (DialogsActivity) this.f$1));
    }

    public ProfileActivity$$ExternalSyntheticLambda22(Object obj, Object obj2, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = j;
    }
}
