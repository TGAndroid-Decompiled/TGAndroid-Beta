package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.util.Consumer;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.common.AutoValue_CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.common.Utils;
import com.google.firebase.crashlytics.internal.send.ReportQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import me.vkryl.android.util.ClickHelper$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.StickersDialogs;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.community.CommunityCreateActivity;
import org.telegram.ui.iv.BlockRow;
import org.telegram.ui.iv.RichEditorListView;

public final class ChatActivity$$ExternalSyntheticLambda454 implements TransportScheduleCallback, AlertDialog.OnButtonClickListener, MessagesController.ErrorDelegate, MessagesStorage.LongCallback {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final boolean f$3;

    public ChatActivity$$ExternalSyntheticLambda454(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = z;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        TL_iv.pageBlockButtonRow pageblockbuttonrow;
        TL_iv.pageBlockButtonRow pageblockbuttonrow2;
        switch (this.$r8$classId) {
            case 0:
                ChatActivity chatActivity = (ChatActivity) this.f$0;
                chatActivity.getClass();
                ((MessagesController) this.f$1).secretWebpagePreview = 1;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", chatActivity.getMessagesController().secretWebpagePreview).commit();
                chatActivity.foundUrls = null;
                chatActivity.searchLinks((CharSequence) this.f$2, this.f$3);
                break;
            case 1:
            default:
                if (!this.f$3) {
                    ((QrActivity$$ExternalSyntheticLambda15) this.f$0).run();
                    break;
                } else {
                    String strTrim = ((EditTextBoldCursor) this.f$1).getText().toString().trim();
                    if (!TextUtils.isEmpty(strTrim)) {
                        RichEditorListView.BlockButtonEdit blockButtonEdit = (RichEditorListView.BlockButtonEdit) this.f$2;
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
                        if ((inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile ? ((TL_keyboard.TL_inlineButtonTypeUserProfile) inlineButtonType).user_id : 0L) > 0) {
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
                            break;
                        }
                    }
                }
                break;
            case 2:
                boolean z = this.f$3;
                Context context = (Context) this.f$0;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f$1;
                Consumer consumer = (Consumer) this.f$2;
                if (!z) {
                    atomicBoolean.set(true);
                    consumer.accept(Boolean.TRUE);
                } else {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                        context.startActivity(intent);
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                break;
            case 3:
                StickersDialogs.AnonymousClass1 anonymousClass1 = (StickersDialogs.AnonymousClass1) this.f$0;
                String strTrim2 = anonymousClass1.getText().toString().trim();
                if (TextUtils.isEmpty(strTrim2) || TextUtils.isEmpty(AndroidUtilities.translitSafe(strTrim2.toString()))) {
                    anonymousClass1.setErrorText(".");
                    AndroidUtilities.shakeViewSpring(anonymousClass1, -6.0f);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    AndroidUtilities.showKeyboard(anonymousClass1);
                } else {
                    AndroidUtilities.hideKeyboard(anonymousClass1);
                    Utilities.Callback2 callback2 = (Utilities.Callback2) this.f$1;
                    AlertDialog alertDialog2 = new AlertDialog((Context) this.f$2, 3, this.f$3 ? null : new DarkThemeResourceProvider());
                    AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog2.showRunnable;
                    AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
                    AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 250L);
                    callback2.run(strTrim2, new ArticleViewer$$ExternalSyntheticLambda33(alertDialog2, alertDialog, anonymousClass1, 9));
                }
                break;
        }
    }

    @Override
    public void onSchedule(Exception exc) throws Throwable {
        ReportQueue reportQueue = (ReportQueue) this.f$0;
        reportQueue.getClass();
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f$1;
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (this.f$3) {
            boolean z = true;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new ClickHelper$$ExternalSyntheticLambda0(2, reportQueue, countDownLatch)).start();
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
        taskCompletionSource.trySetResult((AutoValue_CrashlyticsReportWithSessionId) this.f$2);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        return ((ProfileActivity) this.f$0).lambda$onJoinClicked$55((boolean[]) this.f$1, this.f$3, (BaseFragment) this.f$2, tL_error);
    }

    public ChatActivity$$ExternalSyntheticLambda454(Object obj, Object obj2, boolean z, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$3 = z;
        this.f$2 = obj3;
    }

    @Override
    public void run(long j) {
        CommunityCreateActivity communityCreateActivity = (CommunityCreateActivity) this.f$0;
        communityCreateActivity.getClass();
        ((AlertDialog) this.f$1).dismiss();
        if (j == 0) {
            return;
        }
        communityCreateActivity.dialogId = -j;
        communityCreateActivity.currentChat = communityCreateActivity.getMessagesController().getChat(Long.valueOf(j));
        communityCreateActivity.createNewCommunity((String) this.f$2, this.f$3);
    }

    public ChatActivity$$ExternalSyntheticLambda454(boolean z, Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$3 = z;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }
}
