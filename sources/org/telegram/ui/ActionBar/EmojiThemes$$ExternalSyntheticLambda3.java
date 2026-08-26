package org.telegram.ui.ActionBar;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import com.google.android.datatransport.runtime.AutoValue_TransportContext;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.crashlytics.internal.model.AutoValue_StaticSessionData;
import com.google.firebase.inject.Deferred$DeferredHandler;
import com.google.firebase.inject.Provider;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Stars.BotStarsActivity;
import org.telegram.ui.Stories.LivePlayer$$ExternalSyntheticLambda8;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.telegram.ui.TwoStepVerificationActivity;

public final class EmojiThemes$$ExternalSyntheticLambda3 implements SynchronizationGuard.CriticalSection, SQLiteEventStore.Function, ListenerSet.Event, Deferred$DeferredHandler, ChatObject.Call.OnParticipantsLoad, ImageReceiver.ImageReceiverDelegate, TwoStepVerificationActivity.TwoStepVerificationActivityDelegate, AlertDialog.OnButtonClickListener {
    public final Object f$0;
    public final long f$1;
    public final Object f$2;

    public EmojiThemes$$ExternalSyntheticLambda3(Object obj, long j, Object obj2) {
        this.f$0 = obj;
        this.f$1 = j;
        this.f$2 = obj2;
    }

    @Override
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i = ((LogEventDropped.Reason) this.f$2).number_;
        String string = Integer.toString(i);
        String str = (String) this.f$0;
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, string});
        try {
            boolean z = cursorRawQuery.getCount() > 0;
            cursorRawQuery.close();
            long j = this.f$1;
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
    public void didEnterPassword(TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP) {
        ((BotStarsActivity) this.f$0).initWithdraw(true, this.f$1, inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f$2);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        ResultCallback resultCallback = (ResultCallback) this.f$0;
        long j = this.f$1;
        File file = (File) this.f$2;
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
            Utilities.globalQueue.postRunnable(new EmojiThemes$$ExternalSyntheticLambda4(file, bitmap));
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
        long time = uploader.clock.getTime() + this.f$1;
        SQLiteEventStore sQLiteEventStore = (SQLiteEventStore) uploader.eventStore;
        AutoValue_TransportContext autoValue_TransportContext = (AutoValue_TransportContext) this.f$2;
        sQLiteEventStore.getClass();
        sQLiteEventStore.inTransaction(new LivePlayer$$ExternalSyntheticLambda8(time, autoValue_TransportContext));
        return null;
    }

    @Override
    public void handle(Provider provider) {
        ((CrashlyticsNativeComponentDeferredProxy) provider.get()).prepareNativeSession((String) this.f$0, this.f$1, (AutoValue_StaticSessionData) this.f$2);
    }

    @Override
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).onRenderedFirstFrame((AnalyticsListener.EventTime) this.f$0, this.f$2, this.f$1);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        StoryPrivacyBottomSheet.Page page = (StoryPrivacyBottomSheet.Page) this.f$0;
        HashMap map = page.selectedUsersByGroup;
        Long lValueOf = Long.valueOf(this.f$1);
        ArrayList arrayList = (ArrayList) this.f$2;
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
    }

    @Override
    public void onLoad(ArrayList arrayList) {
        ((VoIPService) this.f$0).lambda$createGroupInstance$69(this.f$1, (int[]) this.f$2, arrayList);
    }

    public EmojiThemes$$ExternalSyntheticLambda3(Object obj, Object obj2, long j) {
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = j;
    }
}
