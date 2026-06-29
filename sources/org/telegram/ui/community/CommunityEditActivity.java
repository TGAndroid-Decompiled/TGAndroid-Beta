package org.telegram.ui.community;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;
import java.util.Iterator;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.DrawableUtils;
import org.telegram.messenger.utils.GradientProtectionDrawable;
import org.telegram.messenger.utils.TextWatcherImpl;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.RadioButtonCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ImageUpdater;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.PhotoViewer;

public class CommunityEditActivity extends BaseFragment implements ImageUpdater.ImageUpdaterDelegate, NotificationCenter.NotificationCenterDelegate, FactorAnimator.Target {
    private final BoolAnimator animatorDoneVisible;
    private TLRPC.FileLocation avatar;
    private AnimatorSet avatarAnimation;
    private AvatarDrawable avatarDrawable;
    private BackupImageView avatarImage;
    private View avatarOverlay;
    private RadialProgressView avatarProgressView;
    private boolean canAllManageLinkedPeers;
    private boolean canAllManageLinkedPeersOriginal;
    private CommunityHeaderView communityHeaderView;
    private long communityId;
    private String communityNameOriginal;
    private FrameLayout containerView;
    private TLRPC.Chat currentChat;
    private TextView doneItem;
    private EditTextCell editTextCell;
    private ImageUpdater imageUpdater;
    private TLRPC.ChatFull info;
    private UniversalRecyclerView listView;
    private final AlertDialog[] progressDialog;
    private PhotoViewer.PhotoViewerProvider provider;

    public static void lambda$openSetPhotoAlert$7(DialogInterface dialogInterface) {
    }

    @Override
    public boolean canFinishFragment() {
        return ImageUpdater.ImageUpdaterDelegate.CC.$default$canFinishFragment(this);
    }

    @Override
    public void didUploadFailed() {
        ImageUpdater.ImageUpdaterDelegate.CC.$default$didUploadFailed(this);
    }

    @Override
    public boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public PhotoViewer.PlaceProviderObject getCloseIntoObject() {
        return ImageUpdater.ImageUpdaterDelegate.CC.$default$getCloseIntoObject(this);
    }

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
        FactorAnimator.Target.CC.$default$onFactorChangeFinished(this, i, f, factorAnimator);
    }

    @Override
    public boolean supportsBulletin() {
        return ImageUpdater.ImageUpdaterDelegate.CC.$default$supportsBulletin(this);
    }

    public CommunityEditActivity(Bundle bundle) {
        super(bundle);
        this.animatorDoneVisible = new BoolAnimator(0, this, CubicBezierInterpolator.EASE_OUT_QUINT, 320L);
        this.progressDialog = new AlertDialog[1];
        this.provider = new PhotoViewer.EmptyPhotoViewerProvider() {
            @Override
            public boolean canLoadMoreAvatars() {
                return false;
            }

            @Override
            public int getTotalImageCount() {
                return 1;
            }

            @Override
            public boolean onDeletePhoto(int i) {
                return true;
            }

            @Override
            public PhotoViewer.PlaceProviderObject getPlaceForPhoto(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
                TLRPC.FileLocation fileLocation2;
                TLRPC.ChatPhoto chatPhoto;
                if (fileLocation == null) {
                    return null;
                }
                TLRPC.Chat chat = CommunityEditActivity.this.getMessagesController().getChat(Long.valueOf(CommunityEditActivity.this.communityId));
                if (chat == null || (chatPhoto = chat.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null) {
                    fileLocation2 = null;
                }
                if (fileLocation2 == null || fileLocation2.local_id != fileLocation.local_id || fileLocation2.volume_id != fileLocation.volume_id || fileLocation2.dc_id != fileLocation.dc_id) {
                    return null;
                }
                int[] iArr = new int[2];
                CommunityEditActivity.this.avatarImage.getLocationInWindow(iArr);
                PhotoViewer.PlaceProviderObject placeProviderObject = new PhotoViewer.PlaceProviderObject();
                placeProviderObject.viewX = iArr[0];
                placeProviderObject.viewY = iArr[1];
                placeProviderObject.parentView = CommunityEditActivity.this.avatarImage;
                placeProviderObject.imageReceiver = CommunityEditActivity.this.avatarImage.getImageReceiver();
                placeProviderObject.dialogId = -CommunityEditActivity.this.communityId;
                placeProviderObject.thumb = placeProviderObject.imageReceiver.getBitmapSafe();
                placeProviderObject.size = -1L;
                placeProviderObject.radius = CommunityEditActivity.this.avatarImage.getImageReceiver().getRoundRadius(true);
                placeProviderObject.scale = 1.0f;
                placeProviderObject.canEdit = true;
                return placeProviderObject;
            }

            @Override
            public void willHidePhotoViewer() {
                CommunityEditActivity.this.avatarImage.getImageReceiver().setVisible(true, true);
            }

            @Override
            public void openPhotoForEdit(String str, String str2, boolean z) {
                CommunityEditActivity.this.imageUpdater.openPhotoForEdit(str, str2, 0, z);
            }
        };
    }

    @Override
    public boolean onFragmentCreate() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        this.communityId = this.arguments.getLong("community_id", 0L);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.communityId));
        this.currentChat = chat;
        boolean z = chat != null && ((tL_chatBannedRights = chat.default_banned_rights) == null || !tL_chatBannedRights.manage_linked_peers);
        this.canAllManageLinkedPeersOriginal = z;
        this.canAllManageLinkedPeers = z;
        this.info = getMessagesController().getChatFull(this.communityId);
        ImageUpdater imageUpdater = new ImageUpdater(true, 3, true);
        this.imageUpdater = imageUpdater;
        imageUpdater.parentFragment = this;
        imageUpdater.setDelegate(this);
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override
    public View createView(Context context) {
        setHasOwnBackground(true);
        this.actionBar.setBackButtonDrawable(new BackDrawable(false));
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    CommunityEditActivity.this.finishFragment();
                }
            }
        });
        BlurredBackgroundSourceColor blurredBackgroundSourceColor = new BlurredBackgroundSourceColor();
        blurredBackgroundSourceColor.setColor(getThemedColor(Theme.key_windowBackgroundWhite));
        this.actionBar.setupGlass(new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceColor), BlurredBackgroundProviderImpl.topPanelChatActivity(this.resourceProvider));
        this.actionBar.setGlassOnlyBack();
        FrameLayout frameLayout = new FrameLayout(context) {
            final GradientProtectionDrawable gradientProtectionDrawable = new GradientProtectionDrawable(2);
            final GradientProtectionDrawable gradientProtectionDrawableBottom = new GradientProtectionDrawable(8);

            @Override
            protected boolean drawChild(Canvas canvas, View view, long j) {
                boolean zDrawChild = super.drawChild(canvas, view, j);
                if (view == CommunityEditActivity.this.listView) {
                    GradientProtectionDrawable gradientProtectionDrawable = this.gradientProtectionDrawable;
                    CommunityEditActivity communityEditActivity = CommunityEditActivity.this;
                    int i = Theme.key_windowBackgroundGray;
                    gradientProtectionDrawable.setColor(communityEditActivity.getThemedColor(i));
                    this.gradientProtectionDrawable.setBounds(0, 0, getWidth(), AndroidUtilities.statusBarHeight);
                    this.gradientProtectionDrawable.draw(canvas);
                    float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(AndroidUtilities.navigationBarHeight);
                    if (navigationBarThirdButtonsFactor > 0.0f) {
                        this.gradientProtectionDrawableBottom.setAlpha((int) (navigationBarThirdButtonsFactor * 255.0f));
                        this.gradientProtectionDrawableBottom.setColor(CommunityEditActivity.this.getThemedColor(i));
                        this.gradientProtectionDrawableBottom.setBounds(0, getHeight() - AndroidUtilities.navigationBarHeight, getWidth(), getHeight());
                        this.gradientProtectionDrawableBottom.draw(canvas);
                    }
                }
                return zDrawChild;
            }
        };
        this.containerView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
        this.avatarDrawable = new AvatarDrawable(this.currentChat);
        CommunityHeaderView communityHeaderView = new CommunityHeaderView(context, this.resourceProvider);
        this.communityHeaderView = communityHeaderView;
        communityHeaderView.avatarView.setForUserOrChat(this.currentChat, this.avatarDrawable);
        this.avatarImage = this.communityHeaderView.avatarView;
        String name = DialogObject.getName(this.currentChat);
        this.communityNameOriginal = name;
        EditTextCell editTextCell = new EditTextCell(context, this.resourceProvider);
        this.editTextCell = editTextCell;
        editTextCell.textView.setText(name);
        this.editTextCell.textView.setSelection(name.length());
        this.editTextCell.textView.addTextChangedListener(new TextWatcherImpl() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                TextWatcherImpl.CC.$default$beforeTextChanged(this, charSequence, i, i2, i3);
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                TextWatcherImpl.CC.$default$onTextChanged(this, charSequence, i, i2, i3);
            }

            @Override
            public void afterTextChanged(Editable editable) {
                CommunityEditActivity.this.checkSaveButtonVisible();
            }
        });
        TextView textView = new TextView(context) {
            Paint p = new Paint(1);

            @Override
            protected void onDraw(Canvas canvas) {
                this.p.setColor(CommunityEditActivity.this.getThemedColor(Theme.key_featuredStickers_addButton));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.p);
                super.onDraw(canvas);
            }
        };
        this.doneItem = textView;
        textView.setTextColor(getThemedColor(Theme.key_featuredStickers_buttonText));
        this.doneItem.setText(LocaleController.getString(R.string.Save));
        this.doneItem.setTypeface(AndroidUtilities.bold());
        this.doneItem.setTextSize(1, 14.0f);
        this.doneItem.setGravity(17);
        this.doneItem.setVisibility(8);
        this.doneItem.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        this.doneItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$createView$0(view);
            }
        });
        ScaleStateListAnimator.apply(this.doneItem);
        this.actionBar.addView(this.doneItem, LayoutHelper.createFrame(-2, 56.0f, 85, 0.0f, 0.0f, 12.0f, 0.0f));
        View view = new View(context) {
            final Paint paint = new Paint(1);

            @Override
            protected void onDraw(Canvas canvas) {
                if (CommunityEditActivity.this.avatarImage == null || !CommunityEditActivity.this.avatarImage.getImageReceiver().hasNotThumb()) {
                    return;
                }
                this.paint.setColor(1426063360);
                this.paint.setAlpha((int) (CommunityEditActivity.this.avatarImage.getImageReceiver().getCurrentAlpha() * 85.0f));
                canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), this.paint);
            }
        };
        this.avatarOverlay = view;
        this.communityHeaderView.addView(view, LayoutHelper.createFrame(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context);
        this.avatarProgressView = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(30.0f));
        this.avatarProgressView.setProgressColor(-1);
        this.avatarProgressView.setNoProgress(false);
        this.communityHeaderView.addView(this.avatarProgressView, LayoutHelper.createFrame(64, 64.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
        showAvatarProgress(false, false);
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(this, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, new Utilities.Callback5() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                this.f$0.onClick((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
            }
        }, new Utilities.Callback5Return() {
            @Override
            public final Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return Boolean.valueOf(this.f$0.onLongClick((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue()));
            }
        });
        this.listView = universalRecyclerView;
        universalRecyclerView.setClipToPadding(false);
        this.listView.adapter.setApplyBackground(false);
        this.listView.setSections();
        this.actionBar.setBackground(null);
        this.containerView.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.containerView.addView(this.actionBar, LayoutHelper.createFrame(-1, -2, 48));
        ViewCompat.setOnApplyWindowInsetsListener(this.containerView, new OnApplyWindowInsetsListener() {
            @Override
            public final WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat windowInsetsCompat) {
                return this.f$0.onApplyWindowInsets(view2, windowInsetsCompat);
            }
        });
        FrameLayout frameLayout2 = this.containerView;
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    public void lambda$createView$0(View view) {
        processDone();
        finishFragment();
    }

    public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        ArrayList<TL_communities.CommunityPeer> arrayList2;
        int i;
        arrayList.add(UItem.asCustomShadow(140, this.communityHeaderView));
        if (ChatObject.canUserDoAdminAction(this.currentChat, 1)) {
            int i2 = R.drawable.outline_profile_photo;
            if (ChatObject.hasPhoto(this.currentChat)) {
                i = R.string.CommunitySettingsChangePhoto;
            } else {
                i = R.string.CommunitySettingsSetPhoto;
            }
            arrayList.add(UItem.asButton(141, i2, LocaleController.getString(i)).accent());
            arrayList.add(UItem.asSpace(2, AndroidUtilities.dp(14.0f)));
            arrayList.add(UItem.asHeader(0, LocaleController.getString(R.string.CommunitySectionCommunityName)));
            arrayList.add(UItem.asCustom(7, this.editTextCell));
            arrayList.add(UItem.asSpace(1, AndroidUtilities.dp(14.0f)));
        }
        if (ChatObject.canBlockUsers(this.currentChat)) {
            arrayList.add(UItem.asHeader(3, LocaleController.getString(R.string.CommunitySectionWhoCanAddChats)));
            arrayList.add(UItem.asRadio2(150, LocaleController.getString(R.string.CommunityWhoCanAddChatsAllMembers), LocaleController.getString(R.string.CommunityWhoCanAddChatsAllMembersInfo)).setChecked(this.canAllManageLinkedPeers));
            arrayList.add(UItem.asRadio2(151, LocaleController.getString(R.string.CommunityWhoCanAddChatsOnlyAdmins), LocaleController.getString(R.string.CommunityWhoCanAddChatsOnlyAdminsInfo)).setChecked(true ^ this.canAllManageLinkedPeers));
            arrayList.add(UItem.asSpace(4, AndroidUtilities.dp(14.0f)));
        }
        if (ChatObject.hasAdminRights(this.currentChat)) {
            int i3 = R.drawable.msg_admins;
            String string = LocaleController.getString(R.string.CommunityAdministrators);
            TLRPC.ChatFull chatFull = this.info;
            arrayList.add(UItem.asButton(142, i3, string, chatFull != null ? Integer.toString(chatFull.admins_count) : ""));
            int i4 = R.drawable.community_requests_outline_24;
            String string2 = LocaleController.getString(R.string.CommunityPendingRequests);
            TLRPC.ChatFull chatFull2 = this.info;
            arrayList.add(UItem.asButton(143, i4, string2, chatFull2 != null ? Integer.toString(chatFull2.requests_pending) : ""));
            int i5 = R.drawable.msg_user_remove;
            String string3 = LocaleController.getString(R.string.CommunityRemovedUsers);
            TLRPC.ChatFull chatFull3 = this.info;
            arrayList.add(UItem.asButton(144, i5, string3, chatFull3 != null ? Integer.toString(chatFull3.kicked_count) : ""));
        }
        arrayList.add(UItem.asSpace(5, AndroidUtilities.dp(14.0f)));
        arrayList.add(UItem.asButton(146, R.drawable.msg_groups_create, LocaleController.getString(R.string.CommunityMenuAddChat)).accent());
        TLRPC.ChatFull chatFull4 = this.info;
        if (chatFull4 == null || (arrayList2 = chatFull4.linked_peers) == null) {
            return;
        }
        Iterator<TL_communities.CommunityPeer> it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.add(UItem.asProfileCell(getMessagesStorage().getChat(-DialogObject.getPeerDialogId(it.next().peer))));
        }
    }

    public void onClick(org.telegram.ui.Components.UItem r10, android.view.View r11, int r12, float r13, float r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.community.CommunityEditActivity.onClick(org.telegram.ui.Components.UItem, android.view.View, int, float, float):void");
    }

    public void lambda$onClick$1(boolean z) {
        finishFragment();
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-this.communityId), null, this.currentChat, Boolean.valueOf(z));
    }

    private void setAllowedManageLinkedPeers(boolean z) {
        if (this.canAllManageLinkedPeers == z) {
            return;
        }
        RadioButtonCell radioButtonCell = (RadioButtonCell) this.listView.findViewByItemId(151);
        if (radioButtonCell != null) {
            radioButtonCell.setChecked(!z, true);
        }
        RadioButtonCell radioButtonCell2 = (RadioButtonCell) this.listView.findViewByItemId(150);
        if (radioButtonCell2 != null) {
            radioButtonCell2.setChecked(z, true);
        }
        this.canAllManageLinkedPeers = z;
        checkSaveButtonVisible();
    }

    public boolean onLongClick(UItem uItem, View view, int i, float f, float f2) {
        Object obj = uItem.object;
        if (!(obj instanceof TLRPC.Chat)) {
            return false;
        }
        TLRPC.Chat chat = (TLRPC.Chat) obj;
        final long j = -chat.id;
        boolean zCanRemoveChatFromCommunity = ChatObject.canRemoveChatFromCommunity(chat, this.currentChat);
        ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(this.containerView, view);
        itemOptionsMakeOptions.add(R.drawable.msg_viewintopic, LocaleController.getString(R.string.CommunityMenuViewGroup), new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$onLongClick$2(j);
            }
        });
        itemOptionsMakeOptions.addIf(zCanRemoveChatFromCommunity, R.drawable.msg_cancel, (CharSequence) LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity), true, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$onLongClick$5(j);
            }
        });
        itemOptionsMakeOptions.setScrimViewBackground(this.listView.getClipBackground(view, true));
        itemOptionsMakeOptions.show();
        return true;
    }

    public void lambda$onLongClick$2(long j) {
        presentFragment(ChatActivity.of(j));
    }

    public void lambda$onLongClick$5(final long j) {
        AlertsCreator.showSimpleConfirmAlert(this, LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity), LocaleController.getString(R.string.CommunityMenuRemoveFromCommunityConfirm), LocaleController.getString(R.string.Remove), true, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$onLongClick$4(j);
            }
        });
    }

    public void lambda$onLongClick$4(long j) {
        MessagesController.getInstance(this.currentAccount).unlinkCommunity(j, this.communityId, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.lambda$onLongClick$3((TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    public void lambda$onLongClick$3(TLRPC.Bool bool, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            BulletinFactory.of(this).showForError(tL_error);
        }
    }

    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        this.listView.setPadding(0, insets.top, 0, insets.bottom);
        return WindowInsetsCompat.CONSUMED;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        ImageUpdater imageUpdater = this.imageUpdater;
        if (imageUpdater != null) {
            imageUpdater.clear();
        }
    }

    private void processDone() {
        TLRPC.Chat chat = this.currentChat;
        if (chat != null && !chat.title.equals(this.editTextCell.getText())) {
            getMessagesController().changeChatTitle(this.currentChat.id, this.editTextCell.getText());
        }
        TLRPC.Chat chat2 = this.currentChat;
        if (chat2 == null || this.canAllManageLinkedPeers == this.canAllManageLinkedPeersOriginal) {
            return;
        }
        if (chat2.default_banned_rights == null) {
            chat2.default_banned_rights = new TLRPC.TL_chatBannedRights();
        }
        this.currentChat.default_banned_rights.manage_linked_peers = !this.canAllManageLinkedPeers;
        getMessagesController().setDefaultBannedRole(this.communityId, this.currentChat.default_banned_rights, false, this);
    }

    @Override
    public void onResume() {
        super.onResume();
        this.imageUpdater.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        this.imageUpdater.onPause();
    }

    @Override
    public void dismissCurrentDialog() {
        if (this.imageUpdater.dismissCurrentDialog(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public boolean dismissDialogOnPause(Dialog dialog) {
        return this.imageUpdater.dismissDialogOnPause(dialog) && super.dismissDialogOnPause(dialog);
    }

    @Override
    public void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        this.imageUpdater.onRequestPermissionsResultFragment(i, strArr, iArr);
    }

    @Override
    public void onActivityResultFragment(int i, int i2, Intent intent) {
        this.imageUpdater.onActivityResult(i, i2, intent);
    }

    @Override
    public void saveSelfArgs(Bundle bundle) {
        String str;
        ImageUpdater imageUpdater = this.imageUpdater;
        if (imageUpdater != null && (str = imageUpdater.currentPicturePath) != null) {
            bundle.putString("path", str);
        }
        EditTextCell editTextCell = this.editTextCell;
        if (editTextCell != null) {
            String text = editTextCell.getText();
            if (text.isEmpty()) {
                return;
            }
            bundle.putString("nameTextView", text);
        }
    }

    @Override
    public void restoreSelfArgs(Bundle bundle) {
        ImageUpdater imageUpdater = this.imageUpdater;
        if (imageUpdater != null) {
            imageUpdater.currentPicturePath = bundle.getString("path");
        }
    }

    public void openSetPhotoAlert() {
        this.imageUpdater.openMenu(this.avatar != null, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$openSetPhotoAlert$6();
            }
        }, new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                CommunityEditActivity.lambda$openSetPhotoAlert$7(dialogInterface);
            }
        }, 0);
    }

    public void lambda$openSetPhotoAlert$6() {
        this.avatar = null;
        MessagesController.getInstance(this.currentAccount).changeChatAvatar(this.communityId, null, null, null, null, 0.0d, null, null, null, null);
        showAvatarProgress(false, true);
        this.avatarImage.setImage((ImageLocation) null, (String) null, this.avatarDrawable, this.currentChat);
    }

    @Override
    public void onUploadProgressChanged(float f) {
        RadialProgressView radialProgressView = this.avatarProgressView;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f);
    }

    @Override
    public void didStartUpload(boolean z, boolean z2) {
        RadialProgressView radialProgressView = this.avatarProgressView;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override
    public void didUploadPhoto(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, final String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$didUploadPhoto$8(photoSize2, inputFile, inputFile2, videoSize, d, str, photoSize);
            }
        });
    }

    public void lambda$didUploadPhoto$8(TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize2) {
        TLRPC.FileLocation fileLocation = photoSize.location;
        this.avatar = fileLocation;
        if (inputFile != null || inputFile2 != null || videoSize != null) {
            getMessagesController().changeChatAvatar(this.communityId, null, inputFile, inputFile2, videoSize, d, str, photoSize.location, photoSize2.location, null);
            showAvatarProgress(false, true);
        } else {
            this.avatarImage.setImage(ImageLocation.getForLocal(fileLocation), "50_50", this.avatarDrawable, this.currentChat);
            showAvatarProgress(true, false);
        }
        this.listView.adapter.update(true);
    }

    @Override
    public String getInitialSearchString() {
        return this.editTextCell.getText();
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.communityId) {
                this.info = chatFull;
                this.listView.adapter.update(true);
            }
        }
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        this.doneItem.setAlpha(f);
        this.doneItem.setScaleX(AndroidUtilities.lerp(0.75f, 1.0f, f));
        this.doneItem.setScaleY(AndroidUtilities.lerp(0.75f, 1.0f, f));
        this.doneItem.setVisibility(f > 0.0f ? 0 : 8);
    }

    private static class EditTextCell extends FrameLayout {
        private final Theme.ResourcesProvider resourcesProvider;
        public EditTextBoldCursor textView;

        public EditTextCell(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.resourcesProvider = resourcesProvider;
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context) {
                @Override
                public boolean onTouchEvent(MotionEvent motionEvent) {
                    if (isEnabled()) {
                        return super.onTouchEvent(motionEvent);
                    }
                    return false;
                }
            };
            this.textView = editTextBoldCursor;
            editTextBoldCursor.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            this.textView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
            this.textView.setHintTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteHintText, resourcesProvider));
            this.textView.setTextSize(1, 16.0f);
            this.textView.setMaxLines(Integer.MAX_VALUE);
            this.textView.setBackground(null);
            EditTextBoldCursor editTextBoldCursor2 = this.textView;
            editTextBoldCursor2.setImeOptions(editTextBoldCursor2.getImeOptions() | 268435456);
            EditTextBoldCursor editTextBoldCursor3 = this.textView;
            editTextBoldCursor3.setInputType(editTextBoldCursor3.getInputType() | 16384);
            this.textView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
            this.textView.setMinHeight(AndroidUtilities.dp(50.0f));
            addView(this.textView, LayoutHelper.createFrame(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 16, 13.0f, 0.0f, 13.0f, 0.0f));
        }

        public String getText() {
            return this.textView.getText().toString();
        }
    }

    private static class CommunityHeaderView extends FrameLayout implements Theme.Colorable {
        public final BackupImageView avatarView;
        private final Drawable communityCardsDrawable;
        private final Theme.ResourcesProvider resourcesProvider;

        public CommunityHeaderView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.resourcesProvider = resourcesProvider;
            this.communityCardsDrawable = context.getResources().getDrawable(R.drawable.community_cards).mutate();
            BackupImageView backupImageView = new BackupImageView(context);
            this.avatarView = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(20.0f));
            addView(backupImageView, LayoutHelper.createFrame(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
            updateColors();
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            DrawableUtils.drawCommunityCardDrawable(canvas, this.communityCardsDrawable, this.avatarView.getLeft() + (this.avatarView.getWidth() / 2.0f), this.avatarView.getTop() + (this.avatarView.getHeight() / 2.0f), this.avatarView.getHeight());
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(136.0f), 1073741824));
        }

        @Override
        public void updateColors() {
            this.communityCardsDrawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider), PorterDuff.Mode.MULTIPLY));
        }
    }

    private void showAvatarProgress(final boolean z, boolean z2) {
        if (this.avatarProgressView == null) {
            return;
        }
        AnimatorSet animatorSet = this.avatarAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.avatarAnimation = null;
        }
        if (!z2) {
            if (z) {
                this.avatarProgressView.setAlpha(1.0f);
                this.avatarProgressView.setVisibility(0);
                this.avatarOverlay.setAlpha(1.0f);
                this.avatarOverlay.setVisibility(0);
                return;
            }
            this.avatarProgressView.setAlpha(0.0f);
            this.avatarProgressView.setVisibility(4);
            this.avatarOverlay.setAlpha(0.0f);
            this.avatarOverlay.setVisibility(4);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.avatarAnimation = animatorSet2;
        if (z) {
            this.avatarProgressView.setVisibility(0);
            this.avatarOverlay.setVisibility(0);
            AnimatorSet animatorSet3 = this.avatarAnimation;
            RadialProgressView radialProgressView = this.avatarProgressView;
            Property property = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, (Property<RadialProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.avatarOverlay, (Property<View, Float>) property, 1.0f));
        } else {
            RadialProgressView radialProgressView2 = this.avatarProgressView;
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, (Property<RadialProgressView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.avatarOverlay, (Property<View, Float>) property2, 0.0f));
        }
        this.avatarAnimation.setDuration(180L);
        this.avatarAnimation.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (CommunityEditActivity.this.avatarAnimation == null || CommunityEditActivity.this.avatarProgressView == null) {
                    return;
                }
                if (!z) {
                    CommunityEditActivity.this.avatarProgressView.setVisibility(4);
                    CommunityEditActivity.this.avatarOverlay.setVisibility(4);
                }
                CommunityEditActivity.this.avatarAnimation = null;
            }

            @Override
            public void onAnimationCancel(Animator animator) {
                CommunityEditActivity.this.avatarAnimation = null;
            }
        });
        this.avatarAnimation.start();
    }

    public void checkSaveButtonVisible() {
        this.animatorDoneVisible.setValue((this.canAllManageLinkedPeersOriginal == this.canAllManageLinkedPeers && TextUtils.equals(this.editTextCell.getText(), this.communityNameOriginal)) ? false : true, true);
    }
}
