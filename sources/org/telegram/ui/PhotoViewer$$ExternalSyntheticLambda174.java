package org.telegram.ui;

import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FactCheckController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda23;

public final class PhotoViewer$$ExternalSyntheticLambda174 implements Utilities.Callback {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final long f$3;

    public PhotoViewer$$ExternalSyntheticLambda174(Object obj, long j, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$3 = j;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                String str = (String) this.f$1;
                Bitmap bitmap = (Bitmap) obj;
                PhotoViewer photoViewer = (PhotoViewer) this.f$0;
                photoViewer.getClass();
                if (bitmap == null) {
                    AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda16(photoViewer, 15));
                } else {
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                        fileOutputStream.close();
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        Paint paint = new Paint(3);
                        canvas.translate(bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                        float fMax = Math.max(bitmapCreateBitmap.getWidth() / bitmap.getWidth(), bitmapCreateBitmap.getHeight() / bitmap.getHeight());
                        canvas.scale(fMax, fMax);
                        canvas.drawBitmap(bitmap, (-bitmap.getWidth()) / 2.0f, (-bitmap.getHeight()) / 2.0f, paint);
                        AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda177(photoViewer, (MediaController.PhotoEntry) this.f$2, this.f$3, str, bitmapCreateBitmap, 0));
                    } catch (Exception e) {
                        FileLog.e(e);
                        AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda16(photoViewer, 16));
                        return;
                    }
                }
                break;
            case 1:
                ((FactCheckController) this.f$0).lambda$loadMissing$3(this.f$3, (ArrayList) this.f$1, (HashMap) this.f$2, (ArrayList) obj);
                break;
            case 2:
                ((MessagesController) this.f$0).lambda$checkSensitive$448(this.f$3, (boolean[]) this.f$1, (Runnable) this.f$2, (Boolean) obj);
                break;
            case 3:
                ((TranslateController) this.f$0).lambda$checkTranslation$6((MessageObject) this.f$2, (String) this.f$1, this.f$3, (TLRPC.TL_textWithEntities) obj);
                break;
            case 4:
                DialogsActivity.AnonymousClass30 anonymousClass30 = (DialogsActivity.AnonymousClass30) this.f$0;
                anonymousClass30.getClass();
                ((AlertDialog) this.f$1).dismiss();
                DialogsActivity dialogsActivity = DialogsActivity.this;
                MessagesController messagesController = dialogsActivity.getMessagesController();
                long j = this.f$3;
                messagesController.loadChannelParticipants(Long.valueOf(j));
                DialogsActivity.DialogsActivityDelegate dialogsActivityDelegate = dialogsActivity.delegate;
                dialogsActivity.removeSelfFromStack();
                BaseFragment[] baseFragmentArr = (BaseFragment[]) this.f$2;
                if (baseFragmentArr[1] != null) {
                    baseFragmentArr[0].removeSelfFromStack();
                    baseFragmentArr[1].finishFragment();
                } else {
                    baseFragmentArr[0].finishFragment();
                }
                if (dialogsActivityDelegate != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(-j, 0L));
                    dialogsActivityDelegate.didSelectDialogs(dialogsActivity, arrayList, null, false, dialogsActivity.notify, dialogsActivity.scheduleDate, dialogsActivity.scheduleRepeatPeriod, null);
                }
                break;
            default:
                Browser.Progress progress = (Browser.Progress) obj;
                GiftSheet giftSheet = (GiftSheet) this.f$0;
                giftSheet.getClass();
                progress.init();
                GiftSheet.AnonymousClass8 anonymousClass8 = (GiftSheet.AnonymousClass8) this.f$1;
                anonymousClass8.doTransfer(this.f$3, new GiftSheet$$ExternalSyntheticLambda23(giftSheet, progress, (Utilities.Callback) this.f$2, anonymousClass8, 0));
                break;
        }
    }

    public PhotoViewer$$ExternalSyntheticLambda174(Object obj, Dialog dialog, long j, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = dialog;
        this.f$3 = j;
        this.f$2 = obj2;
    }

    public PhotoViewer$$ExternalSyntheticLambda174(TranslateController translateController, MessageObject messageObject, String str, long j) {
        this.$r8$classId = 3;
        this.f$0 = translateController;
        this.f$2 = messageObject;
        this.f$1 = str;
        this.f$3 = j;
    }

    public PhotoViewer$$ExternalSyntheticLambda174(PhotoViewer photoViewer, String str, MediaController.PhotoEntry photoEntry, long j) {
        this.$r8$classId = 0;
        this.f$0 = photoViewer;
        this.f$1 = str;
        this.f$2 = photoEntry;
        this.f$3 = j;
    }
}
