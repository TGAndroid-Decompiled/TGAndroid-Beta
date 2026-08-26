package org.telegram.ui.iv;

import android.text.TextUtils;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.common.AutoValue_CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.common.Utils;
import com.google.firebase.crashlytics.internal.send.ReportQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import me.vkryl.android.util.ClickHelper$$ExternalSyntheticLambda0;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticLambda14;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.community.CommunityCreateActivity;

public final class RichInlineButtonEditor$$ExternalSyntheticLambda12 implements TransportScheduleCallback, MessagesStorage.LongCallback, AlertDialog.OnButtonClickListener {
    public final boolean f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;

    public RichInlineButtonEditor$$ExternalSyntheticLambda12(ReportQueue reportQueue, TaskCompletionSource taskCompletionSource, boolean z, AutoValue_CrashlyticsReportWithSessionId autoValue_CrashlyticsReportWithSessionId) {
        this.f$1 = reportQueue;
        this.f$2 = taskCompletionSource;
        this.f$0 = z;
        this.f$3 = autoValue_CrashlyticsReportWithSessionId;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) throws Throwable {
        TL_iv.pageBlockButtonRow pageblockbuttonrow;
        TL_iv.pageBlockButtonRow pageblockbuttonrow2;
        if (!this.f$0) {
            ((Theme$$ExternalSyntheticLambda14) this.f$1).run();
            return;
        }
        String strTrim = ((EditTextBoldCursor) this.f$2).getText().toString().trim();
        if (TextUtils.isEmpty(strTrim)) {
            return;
        }
        RichEditorListView.BlockButtonEdit blockButtonEdit = (RichEditorListView.BlockButtonEdit) this.f$3;
        BlockRow blockRow = blockButtonEdit.row;
        if (blockRow != null) {
            TL_iv.PageBlock pageBlock = blockRow.block;
            if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
            } else {
                pageblockbuttonrow = null;
            }
        } else {
            pageblockbuttonrow = null;
        }
        int i2 = blockButtonEdit.index;
        TL_keyboard.PageButton pageButton = (pageblockbuttonrow == null || i2 < 0 || i2 >= pageblockbuttonrow.buttons.size()) ? null : pageblockbuttonrow.buttons.get(i2);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton == null ? null : pageButton.type;
        if ((inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile ? ((TL_keyboard.TL_inlineButtonTypeUserProfile) inlineButtonType).user_id : 0L) <= 0) {
            return;
        }
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        if (blockRow != null) {
            TL_iv.PageBlock pageBlock2 = blockRow.block;
            if (pageBlock2 instanceof TL_iv.pageBlockButtonRow) {
                pageblockbuttonrow2 = (TL_iv.pageBlockButtonRow) pageBlock2;
            } else {
                pageblockbuttonrow2 = null;
            }
        } else {
            pageblockbuttonrow2 = null;
        }
        TL_keyboard.PageButton pageButton2 = (pageblockbuttonrow2 == null || i2 < 0 || i2 >= pageblockbuttonrow2.buttons.size()) ? null : pageblockbuttonrow2.buttons.get(i2);
        TL_keyboard.InlineButtonType inlineButtonType2 = pageButton2 != null ? pageButton2.type : null;
        tL_inlineButtonTypeUserProfile.user_id = inlineButtonType2 instanceof TL_keyboard.TL_inlineButtonTypeUserProfile ? ((TL_keyboard.TL_inlineButtonTypeUserProfile) inlineButtonType2).user_id : 0L;
        blockButtonEdit.apply(strTrim, tL_inlineButtonTypeUserProfile);
    }

    @Override
    public void onSchedule(Exception exc) throws Throwable {
        boolean z = true;
        ReportQueue reportQueue = (ReportQueue) this.f$1;
        reportQueue.getClass();
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f$2;
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (this.f$0) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new ClickHelper$$ExternalSyntheticLambda0(1, reportQueue, countDownLatch)).start();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            ExecutorService executorService = Utils.TASK_CONTINUATION_EXECUTOR_SERVICE;
            boolean z2 = false;
            try {
                long nanos = timeUnit.toNanos(2L);
                long jNanoTime = System.nanoTime() + nanos;
                while (true) {
                    try {
                        try {
                            countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                            break;
                        } catch (Throwable th) {
                            th = th;
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    } catch (InterruptedException unused) {
                        nanos = jNanoTime - System.nanoTime();
                        z2 = true;
                    } catch (Throwable th2) {
                        th = th2;
                        z = z2;
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                }
                if (z2) {
                    Thread.currentThread().interrupt();
                }
            } catch (Throwable th3) {
                th = th3;
                z = false;
            }
        }
        taskCompletionSource.trySetResult((AutoValue_CrashlyticsReportWithSessionId) this.f$3);
    }

    @Override
    public void run(long j) {
        CommunityCreateActivity communityCreateActivity = (CommunityCreateActivity) this.f$1;
        communityCreateActivity.getClass();
        ((AlertDialog) this.f$2).dismiss();
        if (j == 0) {
            return;
        }
        communityCreateActivity.dialogId = -j;
        communityCreateActivity.currentChat = communityCreateActivity.getMessagesController().getChat(Long.valueOf(j));
        communityCreateActivity.createNewCommunity((String) this.f$3, this.f$0);
    }

    public RichInlineButtonEditor$$ExternalSyntheticLambda12(CommunityCreateActivity communityCreateActivity, AlertDialog alertDialog, String str, boolean z) {
        this.f$1 = communityCreateActivity;
        this.f$2 = alertDialog;
        this.f$3 = str;
        this.f$0 = z;
    }

    public RichInlineButtonEditor$$ExternalSyntheticLambda12(boolean z, Theme$$ExternalSyntheticLambda14 theme$$ExternalSyntheticLambda14, EditTextBoldCursor editTextBoldCursor, RichEditorListView.BlockButtonEdit blockButtonEdit) {
        this.f$0 = z;
        this.f$1 = theme$$ExternalSyntheticLambda14;
        this.f$2 = editTextBoldCursor;
        this.f$3 = blockButtonEdit;
    }
}
