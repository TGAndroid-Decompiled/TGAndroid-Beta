package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Business.ChatbotsActivity;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ContentPreviewViewer;
import org.telegram.ui.Delegates.MemberRequestsDelegate;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.TwoStepVerificationSetupActivity;

public final class StickersAlert$$ExternalSyntheticLambda35 implements Runnable {
    public final int $r8$classId = 0;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;
    public final boolean f$5;
    public final TLObject f$6;

    public StickersAlert$$ExternalSyntheticLambda35(File file, ArrayList arrayList, BaseFragment baseFragment, ChatActivity chatActivity, TLRPC.Document document, boolean z, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.f$0 = file;
        this.f$1 = arrayList;
        this.f$2 = baseFragment;
        this.f$3 = chatActivity;
        this.f$4 = document;
        this.f$5 = z;
        this.f$6 = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter;
        MemberRequestsDelegate.Adapter adapter;
        MemberRequestsDelegate memberRequestsDelegate;
        int i;
        boolean z = this.f$5;
        TLObject tLObject = this.f$6;
        Object obj = this.f$4;
        Object obj2 = this.f$1;
        Object obj3 = this.f$0;
        Object obj4 = this.f$3;
        Object obj5 = this.f$2;
        switch (this.$r8$classId) {
            case 0:
                ArrayList arrayList2 = (ArrayList) obj2;
                arrayList2.add(new MediaController.PhotoEntry(0, 0, 0L, ((File) obj3).getAbsolutePath(), 0, false, 0, 0, 0L));
                BaseFragment baseFragment = (BaseFragment) obj5;
                PhotoViewer.getInstance().setParentActivity(baseFragment.getParentActivity(), null, baseFragment.getResourceProvider());
                PhotoViewer.getInstance().openPhotoForSelect(arrayList2, 0, 11, false, new StickersAlert.AnonymousClass2(), (ChatActivity) obj4);
                TLRPC.Document document = (TLRPC.Document) obj;
                PhotoViewer.getInstance().enableStickerMode(document, z ? document : null, false, null);
                ContentPreviewViewer.getInstance().stickerSetForCustomSticker = z ? (TLRPC.TL_messages_stickerSet) tLObject : null;
                break;
            case 1:
                ((SendMessagesHelper) obj3).lambda$performSendMessageRequestMulti$73((TLRPC.TL_error) obj5, (TLObject) obj4, this.f$5, (ArrayList) obj2, (ArrayList) obj, this.f$6);
                break;
            case 2:
                ((ChatbotsActivity) obj3).lambda$processDone$19((TLRPC.TL_error) obj5, (TLObject) obj4, (int[]) obj, (ArrayList) obj2, this.f$5, (TLRPC.User) tLObject);
                break;
            case 3:
                MemberRequestsDelegate memberRequestsDelegate2 = (MemberRequestsDelegate) obj3;
                BaseFragment baseFragment2 = memberRequestsDelegate2.fragment;
                if (baseFragment2 != null && baseFragment2.getParentActivity() != null) {
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                    int i2 = memberRequestsDelegate2.currentAccount;
                    if (tL_error != null) {
                        AlertsCreator.processError(i2, tL_error, baseFragment2, (TLRPC.TL_messages_hideChatJoinRequest) tLObject, new Object[0]);
                        break;
                    } else {
                        TLRPC.TL_updates tL_updates = (TLRPC.TL_updates) ((TLObject) obj5);
                        if (!tL_updates.chats.isEmpty()) {
                            MessagesController.getInstance(i2).loadFullChat(tL_updates.chats.get(0).id, 0, true);
                        }
                        int i3 = 0;
                        while (true) {
                            arrayList = memberRequestsDelegate2.allImporters;
                            tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) obj4;
                            if (i3 < arrayList.size()) {
                                if (((TLRPC.TL_chatInviteImporter) arrayList.get(i3)).user_id == tL_chatInviteImporter.user_id) {
                                    arrayList.remove(i3);
                                } else {
                                    i3++;
                                }
                            }
                        }
                        int i4 = 0;
                        while (true) {
                            adapter = memberRequestsDelegate2.adapter;
                            int size = MemberRequestsDelegate.this.currentImporters.size();
                            memberRequestsDelegate = MemberRequestsDelegate.this;
                            if (i4 < size) {
                                int i5 = i4;
                                if (((TLRPC.TL_chatInviteImporter) memberRequestsDelegate.currentImporters.get(i4)).user_id == tL_chatInviteImporter.user_id) {
                                    i = i5;
                                } else {
                                    i4 = i5 + 1;
                                }
                            } else {
                                i = -1;
                            }
                        }
                        if (i >= 0) {
                            memberRequestsDelegate.currentImporters.remove(i);
                            int i6 = (!memberRequestsDelegate.isShowLastItemDivider ? 1 : 0) + i;
                            RecyclerView.AdapterDataObservable adapterDataObservable = adapter.mObservable;
                            adapterDataObservable.notifyItemRangeRemoved(i6, 1);
                            if (memberRequestsDelegate.currentImporters.isEmpty()) {
                                adapterDataObservable.notifyItemRangeRemoved(1, 1);
                            }
                        }
                        memberRequestsDelegate2.onImportersChanged(memberRequestsDelegate2.query, false, true);
                        if (z) {
                            Bulletin.MultiLineLayout multiLineLayout = new Bulletin.MultiLineLayout(baseFragment2.getParentActivity(), baseFragment2.getResourceProvider());
                            BackupImageView backupImageView = multiLineLayout.imageView;
                            backupImageView.setRoundRadius(AndroidUtilities.dp(15.0f));
                            TLRPC.User user = (TLRPC.User) obj;
                            backupImageView.imageReceiver.setForUserOrChat(user, new AvatarDrawable(user));
                            backupImageView.onNewImageSet();
                            String firstName = UserObject.getFirstName(user);
                            String string = memberRequestsDelegate2.isChannel ? LocaleController.formatString("HasBeenAddedToChannel", R.string.HasBeenAddedToChannel, firstName) : LocaleController.formatString("HasBeenAddedToGroup", R.string.HasBeenAddedToGroup, firstName);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            int iIndexOf = string.indexOf(firstName);
                            spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold()), iIndexOf, firstName.length() + iIndexOf, 18);
                            multiLineLayout.textView.setText(spannableStringBuilder);
                            if (arrayList.isEmpty()) {
                                Bulletin.make(baseFragment2, multiLineLayout, 2750).show();
                            } else {
                                Bulletin.make(memberRequestsDelegate2.layoutContainer, multiLineLayout, 2750).show();
                            }
                        }
                        ActionBarMenu actionBarMenuCreateMenu = baseFragment2.getActionBar().createMenu();
                        if (TextUtils.isEmpty(memberRequestsDelegate2.query) && memberRequestsDelegate2.showSearchMenu) {
                            actionBarMenuCreateMenu.getItem(0).setVisibility(arrayList.isEmpty() ? 8 : 0);
                            break;
                        }
                    }
                }
                break;
            default:
                ((TwoStepVerificationSetupActivity) obj3).lambda$setNewPassword$48((TLRPC.TL_error) obj2, this.f$5, (TLObject) obj5, (byte[]) obj4, (String) obj, (TL_account.passwordInputSettings) tLObject);
                break;
        }
    }

    public StickersAlert$$ExternalSyntheticLambda35(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, TLObject tLObject, boolean z, ArrayList arrayList, ArrayList arrayList2, TLObject tLObject2) {
        this.f$0 = sendMessagesHelper;
        this.f$2 = tL_error;
        this.f$3 = tLObject;
        this.f$5 = z;
        this.f$1 = arrayList;
        this.f$4 = arrayList2;
        this.f$6 = tLObject2;
    }

    public StickersAlert$$ExternalSyntheticLambda35(ChatbotsActivity chatbotsActivity, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z, TLRPC.User user) {
        this.f$0 = chatbotsActivity;
        this.f$2 = tL_error;
        this.f$3 = tLObject;
        this.f$4 = iArr;
        this.f$1 = arrayList;
        this.f$5 = z;
        this.f$6 = user;
    }

    public StickersAlert$$ExternalSyntheticLambda35(MemberRequestsDelegate memberRequestsDelegate, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.f$0 = memberRequestsDelegate;
        this.f$1 = tL_error;
        this.f$2 = tLObject;
        this.f$3 = tL_chatInviteImporter;
        this.f$5 = z;
        this.f$4 = user;
        this.f$6 = tL_messages_hideChatJoinRequest;
    }

    public StickersAlert$$ExternalSyntheticLambda35(TwoStepVerificationSetupActivity twoStepVerificationSetupActivity, TLRPC.TL_error tL_error, boolean z, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.f$0 = twoStepVerificationSetupActivity;
        this.f$1 = tL_error;
        this.f$5 = z;
        this.f$2 = tLObject;
        this.f$3 = bArr;
        this.f$4 = str;
        this.f$6 = passwordinputsettings;
    }
}
