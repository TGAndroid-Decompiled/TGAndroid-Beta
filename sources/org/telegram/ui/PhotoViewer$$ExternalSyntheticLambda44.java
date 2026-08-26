package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaController$$ExternalSyntheticOutline1;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.ActionBarMenuSlider;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.SharedPhotoVideoCell;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.Crop.CropRotationWheel;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.Paint.Brush;
import org.telegram.ui.Components.Paint.PersistColorPalette;
import org.telegram.ui.Components.Paint.Views.LPhotoPaintView;
import org.telegram.ui.Components.PasscodeView;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.recorder.PaintView;
import org.telegram.ui.Stories.recorder.SliderView;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.Stories.recorder.StoryRecorder$$ExternalSyntheticLambda19;
import org.telegram.ui.Stories.recorder.StoryRecorder$$ExternalSyntheticLambda7;
import org.telegram.ui.bots.BotAdView$$ExternalSyntheticLambda1;
import org.telegram.ui.iv.ChatAttachAlertRichLayout;
import org.telegram.ui.iv.ChatAttachAlertRichLayout$$ExternalSyntheticLambda2;
import org.telegram.ui.iv.RichEditText;
import org.telegram.ui.iv.RichEditor;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda57;
import org.telegram.ui.iv.RichEditorListView;
import org.telegram.ui.iv.RichEditorToolbar;
import org.telegram.ui.web.BotWebViewContainer;

public final class PhotoViewer$$ExternalSyntheticLambda44 implements View.OnLongClickListener {
    public final int $r8$classId;
    public final Object f$0;

    public PhotoViewer$$ExternalSyntheticLambda44(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final boolean onLongClick(View view) throws Throwable {
        TLRPC.User user;
        boolean zCanSchedule;
        boolean z;
        boolean z2;
        switch (this.$r8$classId) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f$0;
                PhotoViewer.PhotoViewerProvider photoViewerProvider = photoViewer.placeProvider;
                if ((photoViewerProvider != null && !photoViewerProvider.allowSendingSubmenu()) || photoViewer.sendPhotoType == 11) {
                    return false;
                }
                BaseFragment baseFragment = photoViewer.parentFragment;
                boolean z3 = (baseFragment == null || baseFragment.getLastStoryViewer() == null) ? false : true;
                ChatActivity chatActivity = photoViewer.parentChatActivity;
                if (chatActivity != null && chatActivity.isInScheduleMode()) {
                    return false;
                }
                if (photoViewer.parentChatActivity == null && !z3 && photoViewer.placeProvider == null) {
                    return false;
                }
                PhotoViewer.AnonymousClass30 anonymousClass30 = photoViewer.captionEdit;
                if (anonymousClass30.getCodePointCount() > anonymousClass30.getCaptionLimit()) {
                    return false;
                }
                ChatActivity chatActivity2 = photoViewer.parentChatActivity;
                if (chatActivity2 != null) {
                    user = chatActivity2.getCurrentUser();
                    zCanSchedule = photoViewer.parentChatActivity.canScheduleMessage();
                } else {
                    PhotoViewer.PhotoViewerProvider photoViewerProvider2 = photoViewer.placeProvider;
                    if (photoViewerProvider2 == null) {
                        return false;
                    }
                    long dialogId = photoViewerProvider2.getDialogId();
                    user = dialogId != 0 ? MessagesController.getInstance(photoViewer.currentAccount).getUser(Long.valueOf(dialogId)) : null;
                    zCanSchedule = photoViewer.placeProvider.canSchedule();
                }
                PhotoViewer.PhotoViewerProvider photoViewerProvider3 = photoViewer.placeProvider;
                boolean z4 = photoViewerProvider3 != null && photoViewerProvider3.canEdit();
                PhotoViewer.PhotoViewerProvider photoViewerProvider4 = photoViewer.placeProvider;
                boolean z5 = photoViewerProvider4 != null && photoViewerProvider4.canReplace();
                boolean zIsUserSelf = UserObject.isUserSelf(user);
                PhotoViewer.PhotoViewerProvider photoViewerProvider5 = photoViewer.placeProvider;
                if (photoViewerProvider5 == null || photoViewerProvider5.getSelectedPhotos() == null) {
                    z = false;
                } else {
                    Iterator it = photoViewer.placeProvider.getSelectedPhotos().entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object value = ((Map.Entry) it.next()).getValue();
                            if (value instanceof MediaController.PhotoEntry) {
                                if (((MediaController.PhotoEntry) value).ttl != 0) {
                                    z = true;
                                }
                            } else if ((value instanceof MediaController.SearchImage) && ((MediaController.SearchImage) value).ttl != 0) {
                                z = true;
                            }
                        } else {
                            z = false;
                        }
                    }
                }
                if (z4 || photoViewer.isCurrentVideo) {
                    z2 = false;
                } else {
                    PhotoViewer.AnonymousClass30 anonymousClass31 = photoViewer.captionEdit;
                    if (!anonymousClass31.timerVisible || anonymousClass31.timer <= 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                boolean z6 = (z4 || !zCanSchedule || z) ? false : true;
                boolean z7 = ((z4 && z5) || zIsUserSelf) ? false : true;
                PhotoViewer.PhotoViewerProvider photoViewerProvider6 = photoViewer.placeProvider;
                boolean z8 = photoViewerProvider6 != null && photoViewerProvider6.getSelectedCount() > 1;
                ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(photoViewer.containerView, new DarkThemeResourceProvider(), view);
                itemOptionsMakeOptions.addIf(R.drawable.msg_sendfile, LocaleController.getString(z8 ? R.string.SendAsFiles : R.string.SendAsFile), new PhotoViewer$$ExternalSyntheticLambda16(photoViewer, 3), z2);
                itemOptionsMakeOptions.addIf(R.drawable.msg_send, LocaleController.getString(R.string.SendAsNewPhoto), new PhotoViewer$$ExternalSyntheticLambda16(photoViewer, 4), z5);
                itemOptionsMakeOptions.addIf(R.drawable.msg_replace, LocaleController.getString(R.string.ReplacePhoto), new PhotoViewer$$ExternalSyntheticLambda16(photoViewer, 5), z5);
                itemOptionsMakeOptions.addIf(R.drawable.msg_calendar2, LocaleController.getString(zIsUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new PhotoViewer$$ExternalSyntheticLambda16(photoViewer, 6), z6);
                itemOptionsMakeOptions.addIf(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new PhotoViewer$$ExternalSyntheticLambda16(photoViewer, 7), z7);
                if (itemOptionsMakeOptions.getItemsCount() == 0) {
                    return false;
                }
                itemOptionsMakeOptions.setGravity(5);
                itemOptionsMakeOptions.show();
                return true;
            case 1:
                final ArticleViewer articleViewer = (ArticleViewer) this.f$0;
                ?? r4 = 0;
                if (articleViewer.pages[0] != null) {
                    float f = articleViewer.actionBar.backButtonDrawable.finalRotation;
                    ArticleViewer.Sheet sheet = articleViewer.sheet;
                    ItemOptions itemOptionsMakeOptions2 = ItemOptions.makeOptions(sheet != null ? sheet.windowView : articleViewer.windowView, null, view);
                    int color = SharedConfig.adaptableColorInBrowser ? Theme.getColor(null, Theme.key_iv_background, false) : articleViewer.pages[0].getBackgroundColor();
                    int color2 = SharedConfig.adaptableColorInBrowser ? Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false) : AndroidUtilities.computePerceivedBrightness(articleViewer.pages[0].getBackgroundColor()) >= 0.721f ? -16777216 : -1;
                    int iMultAlpha = Theme.multAlpha(0.65f, color2);
                    BotWebViewContainer.MyWebView webView = articleViewer.pages[0].getWebView();
                    if (webView != null) {
                        WebBackForwardList webBackForwardListCopyBackForwardList = webView.copyBackForwardList();
                        int currentIndex = webBackForwardListCopyBackForwardList.getCurrentIndex();
                        if (webBackForwardListCopyBackForwardList.getCurrentIndex() > 0) {
                            int i = 0;
                            while (i < currentIndex) {
                                WebHistoryItem itemAtIndex = webBackForwardListCopyBackForwardList.getItemAtIndex(i);
                                itemOptionsMakeOptions2.add(r4, itemAtIndex.getTitle(), new ArticleViewer$$ExternalSyntheticLambda26(currentIndex, i, webView, 0), r4);
                                ActionBarMenuSubItem last = itemOptionsMakeOptions2.getLast();
                                if (last != null) {
                                    last.setSubtext(itemAtIndex.getUrl());
                                    final Bitmap favicon = (Bitmap) webView.lastFavicons.get(itemAtIndex.getUrl());
                                    if (favicon == null) {
                                        favicon = itemAtIndex.getFavicon();
                                    }
                                    final Paint paint = new Paint(3);
                                    final int i2 = 0;
                                    last.setTextAndIcon(itemAtIndex.getTitle(), 0, new Drawable() {
                                        @Override
                                        public final void draw(Canvas canvas) {
                                            switch (i2) {
                                                case 0:
                                                    Bitmap bitmap = favicon;
                                                    if (bitmap != null) {
                                                        canvas.save();
                                                        canvas.translate(getBounds().left, getBounds().top);
                                                        canvas.scale(getBounds().width() / bitmap.getWidth(), getBounds().height() / bitmap.getHeight());
                                                        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                                                        canvas.restore();
                                                    }
                                                    break;
                                                default:
                                                    Bitmap bitmap2 = favicon;
                                                    if (bitmap2 != null) {
                                                        canvas.save();
                                                        canvas.translate(getBounds().left, getBounds().top);
                                                        canvas.scale(getBounds().width() / bitmap2.getWidth(), getBounds().height() / bitmap2.getHeight());
                                                        canvas.drawBitmap(bitmap2, 0.0f, 0.0f, paint);
                                                        canvas.restore();
                                                    }
                                                    break;
                                            }
                                        }

                                        @Override
                                        public final int getIntrinsicHeight() {
                                            switch (i2) {
                                                case 0:
                                                    break;
                                            }
                                            return AndroidUtilities.dp(24.0f);
                                        }

                                        @Override
                                        public final int getIntrinsicWidth() {
                                            switch (i2) {
                                                case 0:
                                                    break;
                                            }
                                            return AndroidUtilities.dp(24.0f);
                                        }

                                        @Override
                                        public final int getOpacity() {
                                            switch (i2) {
                                            }
                                            return -2;
                                        }

                                        @Override
                                        public final void setAlpha(int i3) {
                                            int i4 = i2;
                                        }

                                        @Override
                                        public final void setColorFilter(ColorFilter colorFilter) {
                                            int i3 = i2;
                                        }

                                        private final void setAlpha$org$telegram$ui$ArticleViewer$18(int i3) {
                                        }

                                        private final void setAlpha$org$telegram$ui$ArticleViewer$19(int i3) {
                                        }

                                        private final void setColorFilter$org$telegram$ui$ArticleViewer$18(ColorFilter colorFilter) {
                                        }

                                        private final void setColorFilter$org$telegram$ui$ArticleViewer$19(ColorFilter colorFilter) {
                                        }
                                    });
                                    last.setTextColor(color2);
                                    last.setSubtextColor(iMultAlpha);
                                }
                                i++;
                                webBackForwardListCopyBackForwardList = webBackForwardListCopyBackForwardList;
                                r4 = 0;
                            }
                        }
                    }
                    ArrayList arrayList = articleViewer.pagesStack;
                    for (final int size = arrayList.size() - 2; size >= 0; size--) {
                        Object obj = arrayList.get(size);
                        if (obj instanceof ArticleViewer.CachedWeb) {
                            ArticleViewer.CachedWeb cachedWeb = (ArticleViewer.CachedWeb) obj;
                            final int i3 = 0;
                            itemOptionsMakeOptions2.add(0, cachedWeb.getTitle(), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i3) {
                                        case 0:
                                            articleViewer.goBack(size);
                                            break;
                                        default:
                                            articleViewer.goBack(size);
                                            break;
                                    }
                                }
                            }, false);
                            ActionBarMenuSubItem last2 = itemOptionsMakeOptions2.getLast();
                            if (last2 != null) {
                                last2.setSubtext(cachedWeb.lastUrl);
                                final Bitmap bitmap = webView != null ? (Bitmap) webView.lastFavicons.get(cachedWeb.lastUrl) : null;
                                if (bitmap == null) {
                                    bitmap = cachedWeb.favicon;
                                }
                                final Paint paint2 = new Paint(3);
                                final int i4 = 1;
                                last2.setTextAndIcon(cachedWeb.getTitle(), 0, new Drawable() {
                                    @Override
                                    public final void draw(Canvas canvas) {
                                        switch (i4) {
                                            case 0:
                                                Bitmap bitmap2 = bitmap;
                                                if (bitmap2 != null) {
                                                    canvas.save();
                                                    canvas.translate(getBounds().left, getBounds().top);
                                                    canvas.scale(getBounds().width() / bitmap2.getWidth(), getBounds().height() / bitmap2.getHeight());
                                                    canvas.drawBitmap(bitmap2, 0.0f, 0.0f, paint2);
                                                    canvas.restore();
                                                }
                                                break;
                                            default:
                                                Bitmap bitmap3 = bitmap;
                                                if (bitmap3 != null) {
                                                    canvas.save();
                                                    canvas.translate(getBounds().left, getBounds().top);
                                                    canvas.scale(getBounds().width() / bitmap3.getWidth(), getBounds().height() / bitmap3.getHeight());
                                                    canvas.drawBitmap(bitmap3, 0.0f, 0.0f, paint2);
                                                    canvas.restore();
                                                }
                                                break;
                                        }
                                    }

                                    @Override
                                    public final int getIntrinsicHeight() {
                                        switch (i4) {
                                            case 0:
                                                break;
                                        }
                                        return AndroidUtilities.dp(24.0f);
                                    }

                                    @Override
                                    public final int getIntrinsicWidth() {
                                        switch (i4) {
                                            case 0:
                                                break;
                                        }
                                        return AndroidUtilities.dp(24.0f);
                                    }

                                    @Override
                                    public final int getOpacity() {
                                        switch (i4) {
                                        }
                                        return -2;
                                    }

                                    @Override
                                    public final void setAlpha(int i5) {
                                        int i6 = i4;
                                    }

                                    @Override
                                    public final void setColorFilter(ColorFilter colorFilter) {
                                        int i5 = i4;
                                    }

                                    private final void setAlpha$org$telegram$ui$ArticleViewer$18(int i5) {
                                    }

                                    private final void setAlpha$org$telegram$ui$ArticleViewer$19(int i5) {
                                    }

                                    private final void setColorFilter$org$telegram$ui$ArticleViewer$18(ColorFilter colorFilter) {
                                    }

                                    private final void setColorFilter$org$telegram$ui$ArticleViewer$19(ColorFilter colorFilter) {
                                    }
                                });
                                last2.setTextColor(color2);
                                last2.setSubtextColor(iMultAlpha);
                                last2.setTextColor(color2);
                                last2.setIconColor(color2);
                            }
                        } else {
                            if (obj instanceof TLRPC.WebPage) {
                                TLRPC.WebPage webPage = (TLRPC.WebPage) obj;
                                final int i5 = 1;
                                itemOptionsMakeOptions2.add(0, webPage.title, new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (i5) {
                                            case 0:
                                                articleViewer.goBack(size);
                                                break;
                                            default:
                                                articleViewer.goBack(size);
                                                break;
                                        }
                                    }
                                }, false);
                                ActionBarMenuSubItem last3 = itemOptionsMakeOptions2.getLast();
                                if (last3 != null) {
                                    last3.setTextAndIcon(webPage.title, R.drawable.msg_instant, null);
                                    last3.setTextColor(color2);
                                    if (!TextUtils.isEmpty(webPage.site_name)) {
                                        last3.setSubtext(webPage.site_name);
                                    }
                                    last3.setSubtextColor(iMultAlpha);
                                    RLottieImageView rLottieImageView = last3.imageView;
                                    rLottieImageView.getLayoutParams().width = AndroidUtilities.dp(24.0f);
                                    rLottieImageView.setScaleX(1.45f);
                                    rLottieImageView.setScaleY(1.45f);
                                    last3.setTextColor(color2);
                                    last3.setIconColor(color2);
                                }
                            }
                        }
                    }
                    itemOptionsMakeOptions2.setScrimViewBackground(Theme.createCircleDrawable(AndroidUtilities.dp(40.0f), articleViewer.actionBar.getBackgroundColor()));
                    itemOptionsMakeOptions2.setBackgroundColor(color);
                    if (itemOptionsMakeOptions2.getItemsCount() > 0) {
                        articleViewer.checkScrollAnimated(new ArticleViewer$$ExternalSyntheticLambda29(articleViewer, itemOptionsMakeOptions2, f, 0));
                        return true;
                    }
                }
                return false;
            case 2:
                CalendarActivity.MonthView monthView = (CalendarActivity.MonthView) this.f$0;
                if (monthView.messagesByDays != null) {
                    int i6 = -1;
                    int i7 = -1;
                    for (int i8 = 0; i8 < monthView.daysInMonth; i8++) {
                        CalendarActivity.PeriodDay periodDay = (CalendarActivity.PeriodDay) monthView.messagesByDays.get(i8, null);
                        if (periodDay != null) {
                            if (i6 == -1) {
                                i6 = periodDay.date;
                            }
                            i7 = periodDay.date;
                        }
                    }
                    if (i6 >= 0 && i7 >= 0) {
                        CalendarActivity calendarActivity = CalendarActivity.this;
                        calendarActivity.inSelectionMode = true;
                        calendarActivity.dateSelectedStart = i6;
                        calendarActivity.dateSelectedEnd = i7;
                        calendarActivity.updateTitle();
                        calendarActivity.animateSelection();
                    }
                }
                return false;
            case 3:
                SharedPhotoVideoCell sharedPhotoVideoCell = (SharedPhotoVideoCell) this.f$0;
                if (sharedPhotoVideoCell.delegate == null) {
                    return false;
                }
                int iIntValue = ((Integer) view.getTag()).intValue();
                SharedPhotoVideoCell.SharedPhotoVideoCellDelegate sharedPhotoVideoCellDelegate = sharedPhotoVideoCell.delegate;
                int i9 = sharedPhotoVideoCell.indeces[iIntValue];
                MessageObject messageObject = sharedPhotoVideoCell.messageObjects[iIntValue];
                FilteredSearchView.SharedPhotoVideoAdapter.AnonymousClass1 anonymousClass1 = (FilteredSearchView.SharedPhotoVideoAdapter.AnonymousClass1) sharedPhotoVideoCellDelegate;
                boolean zActionModeShowing = FilteredSearchView.this.uiCallback.actionModeShowing();
                FilteredSearchView filteredSearchView = FilteredSearchView.this;
                if (zActionModeShowing) {
                    filteredSearchView.onItemClick(i9, sharedPhotoVideoCell, messageObject, iIntValue);
                } else {
                    FilteredSearchView.access$400(filteredSearchView, messageObject, sharedPhotoVideoCell, iIntValue);
                }
                return true;
            case 4:
                ChatActivity.AnonymousClass67 anonymousClass67 = (ChatActivity.AnonymousClass67) this.f$0;
                anonymousClass67.getClass();
                if (!AndroidUtilities.isTablet()) {
                    ChatActivity chatActivity3 = ChatActivity.this;
                    if (!chatActivity3.isThreadChat() || UserObject.isBot(chatActivity3.currentUser)) {
                        anonymousClass67.startY = anonymousClass67.lastY;
                        chatActivity3.openPinnedMessagesList(true);
                        return true;
                    }
                }
                return false;
            case 5:
                ((CropRotationWheel) this.f$0).aspectRatioButton.callOnClick();
                return true;
            case 6:
                final FragmentContextView fragmentContextView = (FragmentContextView) this.f$0;
                fragmentContextView.getClass();
                final float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(fragmentContextView.isMusic);
                fragmentContextView.speedSlider.setSpeed(playbackSpeed, false);
                ActionBarMenuSlider.SpeedSlider speedSlider = fragmentContextView.speedSlider;
                int i10 = Theme.key_actionBarDefaultSubmenuBackground;
                speedSlider.setBackgroundColor(Theme.getColor(i10, fragmentContextView.resourcesProvider));
                ActionBarMenuSlider.SpeedSlider speedSlider2 = fragmentContextView.speedSlider;
                speedSlider2.blurIsInChat = fragmentContextView.fragment instanceof ChatActivity;
                speedSlider2.blurPaint.setShader(null);
                speedSlider2.blurBitmapShader = null;
                Bitmap bitmap2 = speedSlider2.blurBitmap;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                    speedSlider2.blurBitmap = null;
                }
                fragmentContextView.playbackSpeedButton.redrawPopup(Theme.getColor(null, i10, false));
                fragmentContextView.playbackSpeedButton.updateColor();
                fragmentContextView.updatePlaybackButton$1(false);
                fragmentContextView.playbackSpeedButton.setDimMenu(0.3f);
                fragmentContextView.playbackSpeedButton.toggleSubMenu(null, fragmentContextView.speedSlider);
                fragmentContextView.playbackSpeedButton.setOnMenuDismiss(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj2) {
                        FragmentContextView fragmentContextView2 = fragmentContextView;
                        fragmentContextView2.getClass();
                        if (((Boolean) obj2).booleanValue()) {
                            return;
                        }
                        fragmentContextView2.playbackSpeedChanged(playbackSpeed, MediaController.getInstance().getPlaybackSpeed(fragmentContextView2.isMusic), false);
                    }
                });
                MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", -15).apply();
                return true;
            case 7:
                LPhotoPaintView lPhotoPaintView = (LPhotoPaintView) this.f$0;
                if (lPhotoPaintView.popupLayout != null) {
                    int i11 = lPhotoPaintView.currentAccount;
                    PersistColorPalette persistColorPalette = PersistColorPalette.getInstance(i11);
                    persistColorPalette.fillShapes = !persistColorPalette.fillShapes;
                    persistColorPalette.mConfig.edit().putBoolean("fill_shapes", persistColorPalette.fillShapes).apply();
                    boolean z9 = PersistColorPalette.getInstance(i11).fillShapes;
                    for (int i12 = 0; i12 < lPhotoPaintView.popupLayout.getItemsCount(); i12++) {
                        View childAt = lPhotoPaintView.popupLayout.linearLayout.getChildAt(i12);
                        if (childAt instanceof LPhotoPaintView.PopupButton) {
                            Brush.Shape shape = (Brush.Shape) Brush.Shape.SHAPES_LIST.get(i12);
                            ((LPhotoPaintView.PopupButton) childAt).setIcon(z9 ? shape.getFilledIconRes() : shape.getIconRes(), z9, true);
                        }
                    }
                }
                return true;
            case 8:
                PasscodeView passcodeView = (PasscodeView) this.f$0;
                passcodeView.passwordEditText.setText("");
                PasscodeView.AnimatingTextView.access$1200(passcodeView.passwordEditText2, true);
                Drawable drawable = passcodeView.backgroundDrawable;
                if (drawable instanceof MotionBackgroundDrawable) {
                    ((MotionBackgroundDrawable) drawable).switchToPrevPosition();
                }
                return true;
            case 9:
                return ((ShareAlert) this.f$0).lambda$new$17();
            case 10:
                PhotoAlbumPickerActivity photoAlbumPickerActivity = (PhotoAlbumPickerActivity) this.f$0;
                ChatActivity chatActivity4 = photoAlbumPickerActivity.chatActivity;
                if (chatActivity4 != null && photoAlbumPickerActivity.maxSelectedPhotos != 1) {
                    TLRPC.User currentUser = chatActivity4.getCurrentUser();
                    if (photoAlbumPickerActivity.sendPopupLayout == null) {
                        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(photoAlbumPickerActivity.getParentActivity());
                        photoAlbumPickerActivity.sendPopupLayout = actionBarPopupWindowLayout;
                        actionBarPopupWindowLayout.setAnimationEnabled(false);
                        photoAlbumPickerActivity.sendPopupLayout.setOnTouchListener(new PhotoPickerActivity.AnonymousClass14(photoAlbumPickerActivity));
                        photoAlbumPickerActivity.sendPopupLayout.setDispatchKeyEventListener(new PhotoAlbumPickerActivity$$ExternalSyntheticLambda2(photoAlbumPickerActivity, 1));
                        photoAlbumPickerActivity.sendPopupLayout.setShownFromBottom(false);
                        photoAlbumPickerActivity.itemCells = new ActionBarMenuSubItem[2];
                        int i13 = 0;
                        while (i13 < 2) {
                            if ((i13 != 0 || chatActivity4.canScheduleMessage()) && (i13 != 1 || !UserObject.isUserSelf(currentUser))) {
                                photoAlbumPickerActivity.itemCells[i13] = new ActionBarMenuSubItem(0, photoAlbumPickerActivity.getParentActivity(), null, i13 == 0, i13 == 1);
                                if (i13 != 0) {
                                    photoAlbumPickerActivity.itemCells[i13].setTextAndIcon(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
                                } else if (UserObject.isUserSelf(currentUser)) {
                                    photoAlbumPickerActivity.itemCells[i13].setTextAndIcon(LocaleController.getString(R.string.SetReminder), R.drawable.msg_calendar2, null);
                                } else {
                                    photoAlbumPickerActivity.itemCells[i13].setTextAndIcon(LocaleController.getString(R.string.ScheduleMessage), R.drawable.msg_calendar2, null);
                                }
                                photoAlbumPickerActivity.itemCells[i13].setMinimumWidth(AndroidUtilities.dp(196.0f));
                                photoAlbumPickerActivity.sendPopupLayout.linearLayout.addView(photoAlbumPickerActivity.itemCells[i13], LayoutHelper.createLinear(-1, 48));
                                photoAlbumPickerActivity.itemCells[i13].setOnClickListener(new ChatActivity$$ExternalSyntheticLambda68(photoAlbumPickerActivity, i13, 18));
                            }
                            i13++;
                        }
                        photoAlbumPickerActivity.sendPopupLayout.setupRadialSelectors(Theme.getColor(null, Theme.key_dialogButtonSelector, false));
                        ActionBarPopupWindow actionBarPopupWindow = new ActionBarPopupWindow(photoAlbumPickerActivity.sendPopupLayout);
                        photoAlbumPickerActivity.sendPopupWindow = actionBarPopupWindow;
                        actionBarPopupWindow.animationEnabled = false;
                        actionBarPopupWindow.setAnimationStyle(R.style.PopupContextAnimation2);
                        photoAlbumPickerActivity.sendPopupWindow.setOutsideTouchable(true);
                        photoAlbumPickerActivity.sendPopupWindow.setClippingEnabled(true);
                        photoAlbumPickerActivity.sendPopupWindow.setInputMethodMode(2);
                        photoAlbumPickerActivity.sendPopupWindow.setSoftInputMode(0);
                        photoAlbumPickerActivity.sendPopupWindow.getContentView().setFocusableInTouchMode(true);
                    }
                    photoAlbumPickerActivity.sendPopupLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    photoAlbumPickerActivity.sendPopupWindow.setFocusable(true);
                    int[] iArr = new int[2];
                    view.getLocationInWindow(iArr);
                    photoAlbumPickerActivity.sendPopupWindow.showAtLocation(view, 51, AndroidUtilities.dp(8.0f) + ((view.getMeasuredWidth() + iArr[0]) - photoAlbumPickerActivity.sendPopupLayout.getMeasuredWidth()), (iArr[1] - photoAlbumPickerActivity.sendPopupLayout.getMeasuredHeight()) - AndroidUtilities.dp(2.0f));
                    photoAlbumPickerActivity.sendPopupWindow.dimBehind(0.2f);
                    try {
                        view.performHapticFeedback(3, 2);
                        break;
                    } catch (Exception unused) {
                    }
                }
                return false;
            case 11:
                PhotoPickerActivity photoPickerActivity = (PhotoPickerActivity) this.f$0;
                ChatActivity chatActivity5 = photoPickerActivity.chatActivity;
                if (chatActivity5 != null && photoPickerActivity.maxSelectedPhotos != 1) {
                    TLRPC.User currentUser2 = chatActivity5.getCurrentUser();
                    if (photoPickerActivity.sendPopupLayout == null) {
                        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout2 = new ActionBarPopupWindow.ActionBarPopupWindowLayout(photoPickerActivity.getParentActivity());
                        photoPickerActivity.sendPopupLayout = actionBarPopupWindowLayout2;
                        actionBarPopupWindowLayout2.setAnimationEnabled(false);
                        photoPickerActivity.sendPopupLayout.setOnTouchListener(new PhotoPickerActivity.AnonymousClass14(photoPickerActivity));
                        photoPickerActivity.sendPopupLayout.setDispatchKeyEventListener(new PhotoPickerActivity$$ExternalSyntheticLambda1(photoPickerActivity, 3));
                        photoPickerActivity.sendPopupLayout.setShownFromBottom(false);
                        photoPickerActivity.itemCells = new ActionBarMenuSubItem[2];
                        int i14 = 0;
                        while (i14 < 2) {
                            if ((i14 != 0 || chatActivity5.canScheduleMessage()) && (i14 != 1 || !UserObject.isUserSelf(currentUser2))) {
                                photoPickerActivity.itemCells[i14] = new ActionBarMenuSubItem(0, photoPickerActivity.getParentActivity(), null, i14 == 0, i14 == 1);
                                if (i14 != 0) {
                                    photoPickerActivity.itemCells[i14].setTextAndIcon(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
                                } else if (UserObject.isUserSelf(currentUser2)) {
                                    photoPickerActivity.itemCells[i14].setTextAndIcon(LocaleController.getString(R.string.SetReminder), R.drawable.msg_calendar2, null);
                                } else {
                                    photoPickerActivity.itemCells[i14].setTextAndIcon(LocaleController.getString(R.string.ScheduleMessage), R.drawable.msg_calendar2, null);
                                }
                                photoPickerActivity.itemCells[i14].setMinimumWidth(AndroidUtilities.dp(196.0f));
                                photoPickerActivity.sendPopupLayout.linearLayout.addView(photoPickerActivity.itemCells[i14], LayoutHelper.createLinear(-1, 48));
                                photoPickerActivity.itemCells[i14].setOnClickListener(new ChatActivity$$ExternalSyntheticLambda68(photoPickerActivity, i14, 19));
                            }
                            i14++;
                        }
                        photoPickerActivity.sendPopupLayout.setupRadialSelectors(Theme.getColor(null, photoPickerActivity.selectorKey, false));
                        ActionBarPopupWindow actionBarPopupWindow2 = new ActionBarPopupWindow(photoPickerActivity.sendPopupLayout);
                        photoPickerActivity.sendPopupWindow = actionBarPopupWindow2;
                        actionBarPopupWindow2.animationEnabled = false;
                        actionBarPopupWindow2.setAnimationStyle(R.style.PopupContextAnimation2);
                        photoPickerActivity.sendPopupWindow.setOutsideTouchable(true);
                        photoPickerActivity.sendPopupWindow.setClippingEnabled(true);
                        photoPickerActivity.sendPopupWindow.setInputMethodMode(2);
                        photoPickerActivity.sendPopupWindow.setSoftInputMode(0);
                        photoPickerActivity.sendPopupWindow.getContentView().setFocusableInTouchMode(true);
                    }
                    photoPickerActivity.sendPopupLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    photoPickerActivity.sendPopupWindow.setFocusable(true);
                    int[] iArr2 = new int[2];
                    view.getLocationInWindow(iArr2);
                    photoPickerActivity.sendPopupWindow.showAtLocation(view, 51, AndroidUtilities.dp(8.0f) + ((view.getMeasuredWidth() + iArr2[0]) - photoPickerActivity.sendPopupLayout.getMeasuredWidth()), (iArr2[1] - photoPickerActivity.sendPopupLayout.getMeasuredHeight()) - AndroidUtilities.dp(2.0f));
                    photoPickerActivity.sendPopupWindow.dimBehind(0.2f);
                    try {
                        view.performHapticFeedback(3, 2);
                        break;
                    } catch (Exception unused2) {
                    }
                }
                return false;
            case 12:
                ProfileActivity profileActivity = (ProfileActivity) this.f$0;
                if (profileActivity.avatarBig == null && !profileActivity.isTopic) {
                    profileActivity.openAvatar(false);
                }
                return false;
            case 13:
                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = (SelectAnimatedEmojiDialog) this.f$0;
                AlertDialog.Builder builder = new AlertDialog.Builder(selectAnimatedEmojiDialog.getContext(), 0, null);
                String string = LocaleController.getString(R.string.ClearRecentEmojiStatusesTitle);
                AlertDialog alertDialog = builder.alertDialog;
                alertDialog.title = string;
                alertDialog.message = LocaleController.getString(R.string.ClearRecentEmojiStatusesText);
                builder.setPositiveButton(LocaleController.getString(R.string.Clear), new SelectAnimatedEmojiDialog$$ExternalSyntheticLambda6(selectAnimatedEmojiDialog));
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                alertDialog.dimEnabled = false;
                alertDialog.setOnDismissListener(new OAuthSheet$$ExternalSyntheticLambda11(selectAnimatedEmojiDialog, 29));
                builder.show();
                selectAnimatedEmojiDialog.setDim(1.0f);
                try {
                    selectAnimatedEmojiDialog.performHapticFeedback(0, 1);
                    break;
                } catch (Exception unused3) {
                }
                return true;
            case 14:
                PaintView paintView = (PaintView) this.f$0;
                if (paintView.popupLayout != null) {
                    int i15 = paintView.currentAccount;
                    PersistColorPalette persistColorPalette2 = PersistColorPalette.getInstance(i15);
                    persistColorPalette2.fillShapes = !persistColorPalette2.fillShapes;
                    persistColorPalette2.mConfig.edit().putBoolean("fill_shapes", persistColorPalette2.fillShapes).apply();
                    boolean z10 = PersistColorPalette.getInstance(i15).fillShapes;
                    for (int i16 = 0; i16 < paintView.popupLayout.getItemsCount(); i16++) {
                        View childAt2 = paintView.popupLayout.linearLayout.getChildAt(i16);
                        if (childAt2 instanceof PaintView.PopupButton) {
                            Brush.Shape shape2 = (Brush.Shape) Brush.Shape.SHAPES_LIST.get(i16);
                            ((PaintView.PopupButton) childAt2).setIcon(z10 ? shape2.getFilledIconRes() : shape2.getIconRes(), z10, true);
                        }
                    }
                }
                return true;
            case 15:
                StoryRecorder storyRecorder = (StoryRecorder) this.f$0;
                StoryRecorder.AnonymousClass25 anonymousClass25 = storyRecorder.cameraView;
                if (anonymousClass25 == null || !anonymousClass25.isFrontface()) {
                    return false;
                }
                storyRecorder.checkFrontfaceFlashModes();
                storyRecorder.flashButton.setSelected(true);
                storyRecorder.flashViews.flashTo(0.85f, 240L, null);
                ItemOptions itemOptionsMakeOptions3 = ItemOptions.makeOptions(storyRecorder.containerView, storyRecorder.resourcesProvider, storyRecorder.flashButton);
                Activity activity = storyRecorder.activity;
                SliderView sliderView = new SliderView(activity, 1);
                sliderView.setValue(storyRecorder.flashViews.warmth);
                sliderView.onValueChange = new StoryRecorder$$ExternalSyntheticLambda19(storyRecorder, 1);
                itemOptionsMakeOptions3.addView(sliderView);
                itemOptionsMakeOptions3.addSpaceGap$1();
                SliderView sliderView2 = new SliderView(activity, 2);
                sliderView2.minVolume = 0.65f;
                sliderView2.maxVolume = 1.0f;
                sliderView2.setValue(storyRecorder.flashViews.intensity);
                sliderView2.onValueChange = new StoryRecorder$$ExternalSyntheticLambda19(storyRecorder, 2);
                itemOptionsMakeOptions3.addView(sliderView2);
                itemOptionsMakeOptions3.dismissListener = new StoryRecorder$$ExternalSyntheticLambda7(storyRecorder, 1);
                itemOptionsMakeOptions3.dimAlpha = 0;
                itemOptionsMakeOptions3.setGravity(5);
                itemOptionsMakeOptions3.translate(AndroidUtilities.dp(46.0f), -AndroidUtilities.dp(4.0f));
                itemOptionsMakeOptions3.setBackgroundColor(-1155851493);
                itemOptionsMakeOptions3.show();
                return true;
            case 16:
                return ((RichEditText) this.f$0).length() != 0;
            case 17:
                return ((RichEditor) this.f$0).onSendLongClick$3(view);
            default:
                ChatAttachAlertRichLayout chatAttachAlertRichLayout = ChatAttachAlertRichLayout.this;
                int i17 = chatAttachAlertRichLayout.currentAccount;
                boolean zIsPremium = UserConfig.getInstance(i17).isPremium();
                ChatAttachAlert chatAttachAlert = chatAttachAlertRichLayout.parentAlert;
                if (!zIsPremium) {
                    new PremiumFeatureBottomSheet(chatAttachAlert.baseFragment, chatAttachAlertRichLayout.getContext(), chatAttachAlertRichLayout.currentAccount, false, 43, true, null).show();
                    return true;
                }
                RichEditorListView richEditorListView = chatAttachAlertRichLayout.listView;
                if (richEditorListView.hasAnyText() && !richEditorListView.hasPendingUploads()) {
                    boolean zIsWithinLimits = richEditorListView.isWithinLimits();
                    RichEditorToolbar richEditorToolbar = chatAttachAlertRichLayout.toolbar;
                    if (zIsWithinLimits) {
                        ArrayList<TL_iv.PageBlock> arrayListFlattenRowsToBlocks = richEditorListView.flattenRowsToBlocks();
                        if (!arrayListFlattenRowsToBlocks.isEmpty()) {
                            BaseFragment baseFragment2 = chatAttachAlert.baseFragment;
                            ChatActivity chatActivity6 = baseFragment2 instanceof ChatActivity ? (ChatActivity) baseFragment2 : null;
                            MessageSendPreview messageSendPreview = chatAttachAlertRichLayout.messageSendPreview;
                            if (messageSendPreview != null) {
                                messageSendPreview.sent = false;
                                messageSendPreview.dismiss();
                                chatAttachAlertRichLayout.messageSendPreview = null;
                            }
                            Context context = chatAttachAlertRichLayout.getContext();
                            Theme.ResourcesProvider resourcesProvider = chatAttachAlertRichLayout.resourcesProvider;
                            MessageSendPreview messageSendPreview2 = new MessageSendPreview(context, resourcesProvider);
                            chatAttachAlertRichLayout.messageSendPreview = messageSendPreview2;
                            messageSendPreview2.setOnDismissListener(new ShareActivity$$ExternalSyntheticLambda0(chatAttachAlertRichLayout, 8));
                            long dialogId2 = chatAttachAlert.getDialogId();
                            MessageObject messageObject2 = chatActivity6 != null ? chatActivity6.replyingMessageObject : null;
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            tL_message.id = 0;
                            tL_message.out = true;
                            tL_message.peer_id = MessagesController.getInstance(i17).getPeer(dialogId2);
                            tL_message.from_id = MessagesController.getInstance(i17).getPeer(UserConfig.getInstance(i17).getClientUserId());
                            tL_message.flags2 |= 8192;
                            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                            tL_message.rich_message = richMessage;
                            richMessage.blocks = arrayListFlattenRowsToBlocks;
                            richMessage.photos = richEditorListView.collectPhotos();
                            tL_message.rich_message.documents = richEditorListView.collectDocuments();
                            if (messageObject2 != null && !messageObject2.isTopicMainMessage) {
                                TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                                tL_messageReplyHeader.flags |= 16;
                                tL_messageReplyHeader.reply_to_msg_id = messageObject2.getId();
                                tL_message.reply_to = tL_messageReplyHeader;
                            }
                            MessageObject messageObject3 = new MessageObject(i17, tL_message, false, false);
                            if (messageObject2 != null && !messageObject2.isTopicMainMessage) {
                                messageObject3.replyMessageObject = messageObject2;
                            }
                            messageObject3.sendPreview = true;
                            messageObject3.isOutOwnerCached = Boolean.TRUE;
                            messageObject3.generateLayout(null);
                            messageObject3.notime = true;
                            chatAttachAlertRichLayout.messageSendPreview.setMessageObjects(MediaController$$ExternalSyntheticOutline1.m(messageObject3));
                            ChatActivityEnterView.SendButton sendButton = richEditorToolbar.getSendButton();
                            sendButton.setScaleX(1.0f);
                            sendButton.setScaleY(1.0f);
                            MessageSendPreview.AnonymousClass13 sendButton2 = chatAttachAlertRichLayout.messageSendPreview.setSendButton(sendButton, true, new BotAdView$$ExternalSyntheticLambda1(chatAttachAlertRichLayout, 10));
                            if (sendButton2 != null) {
                                sendButton2.setBackground(new RichEditor.ShadowWrapperDrawable(Theme.createRoundRectDrawable(AndroidUtilities.dp(22.0f), Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider))));
                                MessageSendPreview messageSendPreview3 = chatAttachAlertRichLayout.messageSendPreview;
                                int iDp = AndroidUtilities.dp(44.0f);
                                messageSendPreview3.customSendButtonWidth = true;
                                messageSendPreview3.sendButtonWidth = iDp;
                            }
                            ItemOptions itemOptionsMakeOptions4 = ItemOptions.makeOptions(chatAttachAlertRichLayout, resourcesProvider, sendButton);
                            boolean z11 = chatActivity6 != null && UserObject.isUserSelf(chatActivity6.getCurrentUser());
                            if (chatActivity6 != null && chatActivity6.canScheduleMessage()) {
                                itemOptionsMakeOptions4.add(R.drawable.msg_calendar2, LocaleController.getString(z11 ? R.string.SetReminder : R.string.ScheduleMessage), new RichEditor$$ExternalSyntheticLambda57(chatAttachAlertRichLayout, dialogId2, 2), false);
                                if (!z11 && dialogId2 > 0) {
                                    itemOptionsMakeOptions4.add(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new ChatAttachAlertRichLayout$$ExternalSyntheticLambda2(chatAttachAlertRichLayout, 1), false);
                                }
                            }
                            if (!z11) {
                                itemOptionsMakeOptions4.add(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new ChatAttachAlertRichLayout$$ExternalSyntheticLambda2(chatAttachAlertRichLayout, 2), false);
                            }
                            itemOptionsMakeOptions4.setupSelectors();
                            chatAttachAlertRichLayout.messageSendPreview.setItemOptions(itemOptionsMakeOptions4);
                            chatAttachAlertRichLayout.messageSendPreview.show();
                            try {
                                view.performHapticFeedback(3, 2);
                                return true;
                            } catch (Exception unused4) {
                                return true;
                            }
                        }
                    } else if (richEditorToolbar != null) {
                        richEditorToolbar.setSendEnabled(richEditorListView.isWithinLimits());
                    }
                }
                return false;
        }
    }
}
