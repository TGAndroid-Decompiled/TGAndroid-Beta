package org.telegram.ui;

import android.graphics.Bitmap;
import android.text.TextUtils;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.SecureDocument;
import org.telegram.messenger.SecureDocumentKey;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoIPService$$ExternalSyntheticLambda89;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.DialogsBotsAdapter;
import org.telegram.ui.Components.DialogsChannelsAdapter;
import org.telegram.ui.Components.SlotsDrawable;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.web.MHTML;

public final class ChatActivity$70$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final boolean f$1;
    public final Object f$2;
    public final int f$3;

    public ChatActivity$70$$ExternalSyntheticLambda1(int i, int i2, Object obj, Object obj2, boolean z) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$3 = i;
        this.f$1 = z;
    }

    @Override
    public final void run() {
        TLRPC.PhotoSize photoSizeScaleAndSaveImage;
        RandomAccessFile randomAccessFile;
        switch (this.$r8$classId) {
            case 0:
                ChatActivity chatActivity = ChatActivity.this;
                if (!this.f$1) {
                    if (chatActivity.isTopic) {
                        int i = 0;
                        while (true) {
                            ArrayList arrayList = (ArrayList) this.f$2;
                            if (i < arrayList.size()) {
                                chatActivity.getMessagesController().pinMessage(chatActivity.currentChat, chatActivity.currentUser, ((Integer) arrayList.get(i)).intValue(), true, false, false);
                                i++;
                            }
                        }
                    } else {
                        chatActivity.getMessagesController().unpinAllMessages(chatActivity.currentChat, chatActivity.currentUser);
                    }
                }
                if (this.f$3 == chatActivity.pinBullerinTag) {
                    chatActivity.pinBulletin = null;
                }
                break;
            case 1:
                ((VoIPService) this.f$0).lambda$startConferenceGroupCall$55((String) this.f$2, this.f$3, this.f$1);
                break;
            case 2:
                ((ConnectionsManager) this.f$0).lambda$cancelRequest$10((Runnable) this.f$2, this.f$3, this.f$1);
                break;
            case 3:
                DialogsBotsAdapter dialogsBotsAdapter = (DialogsBotsAdapter) this.f$0;
                int i2 = dialogsBotsAdapter.searchBotsId;
                int i3 = this.f$3;
                if (i3 == i2) {
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.f$2;
                    if (TextUtils.equals(tL_messages_searchGlobal.q, dialogsBotsAdapter.query)) {
                        ConnectionsManager.getInstance(dialogsBotsAdapter.currentAccount).sendRequest(tL_messages_searchGlobal, new VoIPService$$ExternalSyntheticLambda89(dialogsBotsAdapter, i3, tL_messages_searchGlobal, this.f$1, 1));
                        break;
                    }
                }
                break;
            case 4:
                DialogsChannelsAdapter dialogsChannelsAdapter = (DialogsChannelsAdapter) this.f$0;
                int i4 = dialogsChannelsAdapter.searchChannelsId;
                int i5 = this.f$3;
                if (i5 == i4) {
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) this.f$2;
                    if (TextUtils.equals(tL_messages_searchGlobal2.q, dialogsChannelsAdapter.query)) {
                        ConnectionsManager.getInstance(dialogsChannelsAdapter.currentAccount).sendRequest(tL_messages_searchGlobal2, new VoIPService$$ExternalSyntheticLambda89(dialogsChannelsAdapter, i5, tL_messages_searchGlobal2, this.f$1, 2));
                        break;
                    }
                }
                break;
            case 5:
                SlotsDrawable slotsDrawable = (SlotsDrawable) this.f$0;
                boolean z = this.f$1;
                int i6 = this.f$3;
                ChatMessageCell chatMessageCell = (ChatMessageCell) this.f$2;
                if (z && slotsDrawable.nextRenderingBitmap == null && slotsDrawable.renderingBitmap == null && slotsDrawable.loadFrameTask == null) {
                    slotsDrawable.isDice = 2;
                    slotsDrawable.setLastFrame = true;
                }
                slotsDrawable.secondLoadingInBackground = false;
                if (slotsDrawable.loadingInBackground || !slotsDrawable.destroyAfterLoading) {
                    slotsDrawable.secondNativePtr = slotsDrawable.secondLottieNatives[0];
                    DownloadController.getInstance(i6).removeLoadingFileObserver(chatMessageCell);
                    slotsDrawable.scheduleNextGetFrame();
                    slotsDrawable.invalidateInternal();
                } else {
                    slotsDrawable.recycle(true);
                }
                break;
            case 6:
                GroupCallActivity groupCallActivity = (GroupCallActivity) this.f$0;
                groupCallActivity.getClass();
                TLObject tLObject = (TLObject) this.f$2;
                boolean z2 = tLObject instanceof TL_phone.exportedGroupCallInvite;
                int i7 = this.f$3;
                String[] strArr = groupCallActivity.invites;
                if (z2) {
                    strArr[i7] = ((TL_phone.exportedGroupCallInvite) tLObject).link;
                } else {
                    strArr[i7] = "";
                }
                for (int i8 = 0; i8 < 2; i8++) {
                    String str = strArr[i8];
                    if (str != null) {
                        if (str.length() == 0) {
                            strArr[i8] = null;
                        }
                    }
                    break;
                }
                boolean z3 = this.f$1;
                if (!z3 && groupCallActivity.canManageCall() && !groupCallActivity.call.call.join_muted) {
                    strArr[0] = null;
                }
                if (strArr[0] == null && strArr[1] == null && ChatObject.isPublic(groupCallActivity.currentChat)) {
                    groupCallActivity.openShareAlert(null, groupCallActivity.accountInstance.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(groupCallActivity.currentChat), true, z3);
                } else {
                    groupCallActivity.openShareAlert(strArr[0], strArr[1], false, z3);
                }
                break;
            default:
                PassportActivity passportActivity = (PassportActivity) this.f$0;
                int i9 = passportActivity.uploadingFileType;
                int i10 = 4;
                int i11 = (i9 == 0 || i9 == 4) ? 20 : 1;
                ArrayList arrayList2 = (ArrayList) this.f$2;
                int iMin = Math.min(i11, arrayList2.size());
                int i12 = 0;
                boolean z4 = false;
                while (i12 < iMin) {
                    SendMessagesHelper.SendingMediaInfo sendingMediaInfo = (SendMessagesHelper.SendingMediaInfo) arrayList2.get(i12);
                    Bitmap bitmapLoadBitmap = ImageLoader.loadBitmap(sendingMediaInfo.path, sendingMediaInfo.uri, 2048.0f, 2048.0f, false);
                    if (bitmapLoadBitmap != null && (photoSizeScaleAndSaveImage = ImageLoader.scaleAndSaveImage(bitmapLoadBitmap, 2048.0f, 2048.0f, 89, false, 320, 320)) != null) {
                        TLRPC.TL_secureFile tL_secureFile = new TLRPC.TL_secureFile();
                        TLRPC.FileLocation fileLocation = photoSizeScaleAndSaveImage.location;
                        tL_secureFile.dc_id = (int) fileLocation.volume_id;
                        tL_secureFile.id = fileLocation.local_id;
                        tL_secureFile.date = (int) (System.currentTimeMillis() / 1000);
                        PassportActivity.AnonymousClass20 anonymousClass20 = (PassportActivity.AnonymousClass20) passportActivity.delegate;
                        anonymousClass20.getClass();
                        StringBuilder sb = new StringBuilder();
                        sb.append(FileLoader.getDirectory(i10));
                        sb.append("/");
                        sb.append(tL_secureFile.dc_id);
                        sb.append("_");
                        String strM = SurfaceContainer$$ExternalSyntheticOutline0.m(sb, tL_secureFile.id, ".jpg");
                        PassportActivity passportActivity2 = PassportActivity.this;
                        passportActivity2.getClass();
                        byte[] bArr = new byte[(int) new File(strM).length()];
                        try {
                            randomAccessFile = new RandomAccessFile(strM, "rws");
                            try {
                                randomAccessFile.readFully(bArr);
                                break;
                            } catch (Exception unused) {
                            }
                        } catch (Exception unused2) {
                            randomAccessFile = null;
                        }
                        MHTML mhtmlEncryptData = passportActivity2.encryptData(bArr);
                        try {
                            randomAccessFile.seek(0L);
                            randomAccessFile.write((byte[]) mhtmlEncryptData.entries);
                            randomAccessFile.close();
                            break;
                        } catch (Exception unused3) {
                        }
                        SecureDocument secureDocument = new SecureDocument((SecureDocumentKey) mhtmlEncryptData.filePos, tL_secureFile, strM, (byte[]) mhtmlEncryptData.entriesByLocation, (byte[]) mhtmlEncryptData.file);
                        int i13 = this.f$3;
                        secureDocument.type = i13;
                        AndroidUtilities.runOnUIThread(new PollItemMenu$$ExternalSyntheticLambda17(passportActivity, secureDocument, i13, 24));
                        if (this.f$1 && !z4) {
                            try {
                                MrzRecognizer.Result resultRecognize = MrzRecognizer.recognize(bitmapLoadBitmap, passportActivity.currentDocumentsType.type instanceof TLRPC.TL_secureValueTypeDriverLicense);
                                if (resultRecognize != null) {
                                    try {
                                        AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda2(28, passportActivity, resultRecognize));
                                        z4 = true;
                                    } catch (Throwable th) {
                                        th = th;
                                        z4 = true;
                                        FileLog.e(th);
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    }
                    i12++;
                    i10 = 4;
                }
                SharedConfig.saveConfig();
                break;
        }
    }

    public ChatActivity$70$$ExternalSyntheticLambda1(ChatActivity.AnonymousClass70 anonymousClass70, boolean z, ArrayList arrayList, int i) {
        this.$r8$classId = 0;
        this.f$0 = anonymousClass70;
        this.f$1 = z;
        this.f$2 = arrayList;
        this.f$3 = i;
    }

    public ChatActivity$70$$ExternalSyntheticLambda1(SlotsDrawable slotsDrawable, boolean z, int i, ChatMessageCell chatMessageCell) {
        this.$r8$classId = 5;
        this.f$0 = slotsDrawable;
        this.f$1 = z;
        this.f$3 = i;
        this.f$2 = chatMessageCell;
    }

    public ChatActivity$70$$ExternalSyntheticLambda1(UniversalAdapter universalAdapter, int i, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z, int i2) {
        this.$r8$classId = i2;
        this.f$0 = universalAdapter;
        this.f$3 = i;
        this.f$2 = tL_messages_searchGlobal;
        this.f$1 = z;
    }
}
