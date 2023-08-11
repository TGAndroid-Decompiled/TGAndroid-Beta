package org.telegram.ui;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC$BotInlineResult;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$DocumentAttribute;
import org.telegram.tgnet.TLRPC$InputStickerSet;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$TL_documentAttributeSticker;
import org.telegram.tgnet.TLRPC$TL_webDocument;
import org.telegram.tgnet.TLRPC$VideoSize;
import org.telegram.tgnet.TLRPC$WebDocument;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ContextLinkCell;
import org.telegram.ui.Cells.StickerCell;
import org.telegram.ui.Cells.StickerEmojiCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EmojiPacksAlert;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SuggestEmojiView;
import org.telegram.ui.ContentPreviewViewer;
public class ContentPreviewViewer {
    @SuppressLint({"StaticFieldLeak"})
    private static volatile ContentPreviewViewer Instance;
    private static TextPaint textPaint;
    private float blurProgress;
    private Bitmap blurrBitmap;
    private boolean clearsInputField;
    private boolean closeOnDismiss;
    private FrameLayoutDrawer containerView;
    private int currentAccount;
    private int currentContentType;
    private TLRPC$Document currentDocument;
    private float currentMoveY;
    private float currentMoveYProgress;
    private View currentPreviewCell;
    private String currentQuery;
    private TLRPC$InputStickerSet currentStickerSet;
    private ContentPreviewViewerDelegate delegate;
    private boolean drawEffect;
    private float finalMoveY;
    private SendMessagesHelper.ImportingSticker importingSticker;
    private TLRPC$BotInlineResult inlineResult;
    private boolean isRecentSticker;
    private WindowInsets lastInsets;
    private float lastTouchY;
    private long lastUpdateTime;
    private boolean menuVisible;
    private Runnable openPreviewRunnable;
    private Activity parentActivity;
    private Object parentObject;
    ActionBarPopupWindow popupWindow;
    private boolean preparingBitmap;
    private Theme.ResourcesProvider resourcesProvider;
    private float showProgress;
    private Drawable slideUpDrawable;
    private float startMoveY;
    private int startX;
    private int startY;
    private StaticLayout stickerEmojiLayout;
    private UnlockPremiumView unlockPremiumView;
    VibrationEffect vibrationEffect;
    private WindowManager.LayoutParams windowLayoutParams;
    private FrameLayout windowView;
    private float moveY = 0.0f;
    private ColorDrawable backgroundDrawable = new ColorDrawable(1895825408);
    private ImageReceiver centerImage = new ImageReceiver();
    private ImageReceiver effectImage = new ImageReceiver();
    private boolean isVisible = false;
    private int keyboardHeight = AndroidUtilities.dp(200.0f);
    private Paint paint = new Paint(1);
    private Runnable showSheetRunnable = new AnonymousClass1();

    public interface ContentPreviewViewerDelegate {

        public final class CC {
            public static boolean $default$can(ContentPreviewViewerDelegate contentPreviewViewerDelegate) {
                return true;
            }

            public static Boolean $default$canSetAsStatus(ContentPreviewViewerDelegate contentPreviewViewerDelegate, TLRPC$Document tLRPC$Document) {
                return null;
            }

            public static void $default$copyEmoji(ContentPreviewViewerDelegate contentPreviewViewerDelegate, TLRPC$Document tLRPC$Document) {
            }

            public static String $default$getQuery(ContentPreviewViewerDelegate contentPreviewViewerDelegate, boolean z) {
                return null;
            }

            public static void $default$gifAddedOrDeleted(ContentPreviewViewerDelegate contentPreviewViewerDelegate) {
            }

            public static boolean $default$needCopy(ContentPreviewViewerDelegate contentPreviewViewerDelegate, TLRPC$Document tLRPC$Document) {
                return false;
            }

            public static boolean $default$needMenu(ContentPreviewViewerDelegate contentPreviewViewerDelegate) {
                return true;
            }

            public static boolean $default$needOpen(ContentPreviewViewerDelegate contentPreviewViewerDelegate) {
                return true;
            }

            public static boolean $default$needRemove(ContentPreviewViewerDelegate contentPreviewViewerDelegate) {
                return false;
            }

            public static boolean $default$needRemoveFromRecent(ContentPreviewViewerDelegate contentPreviewViewerDelegate, TLRPC$Document tLRPC$Document) {
                return false;
            }

            public static void $default$remove(ContentPreviewViewerDelegate contentPreviewViewerDelegate, SendMessagesHelper.ImportingSticker importingSticker) {
            }

            public static void $default$removeFromRecent(ContentPreviewViewerDelegate contentPreviewViewerDelegate, TLRPC$Document tLRPC$Document) {
            }

            public static void $default$resetTouch(ContentPreviewViewerDelegate contentPreviewViewerDelegate) {
            }

            public static void $default$sendEmoji(ContentPreviewViewerDelegate contentPreviewViewerDelegate, TLRPC$Document tLRPC$Document) {
            }

            public static void $default$sendGif(ContentPreviewViewerDelegate contentPreviewViewerDelegate, Object obj, Object obj2, boolean z, int i) {
            }

            public static void $default$sendSticker(ContentPreviewViewerDelegate contentPreviewViewerDelegate, TLRPC$Document tLRPC$Document, String str, Object obj, boolean z, int i) {
            }

            public static void $default$setAsEmojiStatus(ContentPreviewViewerDelegate contentPreviewViewerDelegate, TLRPC$Document tLRPC$Document, Integer num) {
            }
        }

        boolean can();

        boolean canSchedule();

        Boolean canSetAsStatus(TLRPC$Document tLRPC$Document);

        void copyEmoji(TLRPC$Document tLRPC$Document);

        long getDialogId();

        String getQuery(boolean z);

        void gifAddedOrDeleted();

        boolean isInScheduleMode();

        boolean needCopy(TLRPC$Document tLRPC$Document);

        boolean needMenu();

        boolean needOpen();

        boolean needRemove();

        boolean needRemoveFromRecent(TLRPC$Document tLRPC$Document);

        boolean needSend(int i);

        void openSet(TLRPC$InputStickerSet tLRPC$InputStickerSet, boolean z);

        void remove(SendMessagesHelper.ImportingSticker importingSticker);

        void removeFromRecent(TLRPC$Document tLRPC$Document);

        void resetTouch();

        void sendEmoji(TLRPC$Document tLRPC$Document);

        void sendGif(Object obj, Object obj2, boolean z, int i);

        void sendSticker(TLRPC$Document tLRPC$Document, String str, Object obj, boolean z, int i);

        void setAsEmojiStatus(TLRPC$Document tLRPC$Document, Integer num);
    }

    public class FrameLayoutDrawer extends FrameLayout {
        public FrameLayoutDrawer(Context context) {
            super(context);
            ContentPreviewViewer.this = r1;
            setWillNotDraw(false);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            ContentPreviewViewer.this.onDraw(canvas);
        }
    }

    public class AnonymousClass1 implements Runnable {
        AnonymousClass1() {
            ContentPreviewViewer.this = r1;
        }

        @Override
        public void run() {
            boolean z;
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int min;
            if (ContentPreviewViewer.this.parentActivity == null) {
                return;
            }
            ContentPreviewViewer.this.closeOnDismiss = true;
            if (ContentPreviewViewer.this.currentContentType == 0) {
                if (!MessageObject.isPremiumSticker(ContentPreviewViewer.this.currentDocument) || AccountInstance.getInstance(ContentPreviewViewer.this.currentAccount).getUserConfig().isPremium()) {
                    boolean isStickerInFavorites = MediaDataController.getInstance(ContentPreviewViewer.this.currentAccount).isStickerInFavorites(ContentPreviewViewer.this.currentDocument);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    ContentPreviewViewer.this.menuVisible = true;
                    ContentPreviewViewer.this.containerView.invalidate();
                    if (ContentPreviewViewer.this.delegate != null) {
                        if (ContentPreviewViewer.this.delegate.needSend(ContentPreviewViewer.this.currentContentType) && !ContentPreviewViewer.this.delegate.isInScheduleMode()) {
                            arrayList.add(LocaleController.getString("SendStickerPreview", R.string.SendStickerPreview));
                            arrayList3.add(Integer.valueOf(R.drawable.msg_send));
                            arrayList2.add(0);
                        }
                        if (ContentPreviewViewer.this.delegate.needSend(ContentPreviewViewer.this.currentContentType) && !ContentPreviewViewer.this.delegate.isInScheduleMode()) {
                            arrayList.add(LocaleController.getString("SendWithoutSound", R.string.SendWithoutSound));
                            arrayList3.add(Integer.valueOf(R.drawable.input_notify_off));
                            arrayList2.add(6);
                        }
                        if (ContentPreviewViewer.this.delegate.canSchedule()) {
                            arrayList.add(LocaleController.getString("Schedule", R.string.Schedule));
                            arrayList3.add(Integer.valueOf(R.drawable.msg_autodelete));
                            arrayList2.add(3);
                        }
                        if (ContentPreviewViewer.this.currentStickerSet != null && ContentPreviewViewer.this.delegate.needOpen()) {
                            arrayList.add(LocaleController.formatString("ViewPackPreview", R.string.ViewPackPreview, new Object[0]));
                            arrayList3.add(Integer.valueOf(R.drawable.msg_media));
                            arrayList2.add(1);
                        }
                        if (ContentPreviewViewer.this.delegate.needRemove()) {
                            arrayList.add(LocaleController.getString("ImportStickersRemoveMenu", R.string.ImportStickersRemoveMenu));
                            arrayList3.add(Integer.valueOf(R.drawable.msg_delete));
                            arrayList2.add(5);
                        }
                    }
                    if (!MessageObject.isMaskDocument(ContentPreviewViewer.this.currentDocument) && (isStickerInFavorites || (MediaDataController.getInstance(ContentPreviewViewer.this.currentAccount).canAddStickerToFavorites() && MessageObject.isStickerHasSet(ContentPreviewViewer.this.currentDocument)))) {
                        arrayList.add(isStickerInFavorites ? LocaleController.getString("DeleteFromFavorites", R.string.DeleteFromFavorites) : LocaleController.getString("AddToFavorites", R.string.AddToFavorites));
                        arrayList3.add(Integer.valueOf(isStickerInFavorites ? R.drawable.msg_unfave : R.drawable.msg_fave));
                        arrayList2.add(2);
                    }
                    if (ContentPreviewViewer.this.isRecentSticker) {
                        arrayList.add(LocaleController.getString("DeleteFromRecent", R.string.DeleteFromRecent));
                        arrayList3.add(Integer.valueOf(R.drawable.msg_delete));
                        arrayList2.add(4);
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    int[] iArr = new int[arrayList3.size()];
                    for (int i9 = 0; i9 < arrayList3.size(); i9++) {
                        iArr[i9] = ((Integer) arrayList3.get(i9)).intValue();
                    }
                    View$OnClickListenerC00351 view$OnClickListenerC00351 = new View$OnClickListenerC00351(arrayList2, isStickerInFavorites);
                    ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(ContentPreviewViewer.this.containerView.getContext(), R.drawable.popup_fixed_alert3, ContentPreviewViewer.this.resourcesProvider);
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        ActionBarMenuSubItem addItem = ActionBarMenuItem.addItem(actionBarPopupWindowLayout, ((Integer) arrayList3.get(i10)).intValue(), (CharSequence) arrayList.get(i10), false, ContentPreviewViewer.this.resourcesProvider);
                        addItem.setTag(Integer.valueOf(i10));
                        addItem.setOnClickListener(view$OnClickListenerC00351);
                    }
                    ContentPreviewViewer.this.popupWindow = new ActionBarPopupWindow(actionBarPopupWindowLayout, -2, -2) {
                        {
                            AnonymousClass1.this = this;
                        }

                        @Override
                        public void dismiss() {
                            super.dismiss();
                            ContentPreviewViewer contentPreviewViewer = ContentPreviewViewer.this;
                            contentPreviewViewer.popupWindow = null;
                            contentPreviewViewer.menuVisible = false;
                            if (ContentPreviewViewer.this.closeOnDismiss) {
                                ContentPreviewViewer.this.close();
                            }
                        }
                    };
                    ContentPreviewViewer.this.popupWindow.setPauseNotifications(true);
                    ContentPreviewViewer.this.popupWindow.setDismissAnimationDuration(100);
                    ContentPreviewViewer.this.popupWindow.setScaleOut(true);
                    ContentPreviewViewer.this.popupWindow.setOutsideTouchable(true);
                    ContentPreviewViewer.this.popupWindow.setClippingEnabled(true);
                    ContentPreviewViewer.this.popupWindow.setAnimationStyle(R.style.PopupContextAnimation);
                    ContentPreviewViewer.this.popupWindow.setFocusable(true);
                    actionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    ContentPreviewViewer.this.popupWindow.setInputMethodMode(2);
                    ContentPreviewViewer.this.popupWindow.getContentView().setFocusableInTouchMode(true);
                    if (Build.VERSION.SDK_INT >= 21 && ContentPreviewViewer.this.lastInsets != null) {
                        i8 = ContentPreviewViewer.this.lastInsets.getStableInsetBottom() + ContentPreviewViewer.this.lastInsets.getStableInsetTop();
                        i7 = ContentPreviewViewer.this.lastInsets.getStableInsetTop();
                    } else {
                        i7 = AndroidUtilities.statusBarHeight;
                        i8 = 0;
                    }
                    int max = ((int) (ContentPreviewViewer.this.moveY + Math.max(i7 + min + (ContentPreviewViewer.this.stickerEmojiLayout != null ? AndroidUtilities.dp(40.0f) : 0), ((ContentPreviewViewer.this.containerView.getHeight() - i8) - ContentPreviewViewer.this.keyboardHeight) / 2) + ((ContentPreviewViewer.this.currentContentType == 1 ? Math.min(ContentPreviewViewer.this.containerView.getWidth(), ContentPreviewViewer.this.containerView.getHeight() - i8) - AndroidUtilities.dp(40.0f) : (int) (ContentPreviewViewer.this.drawEffect ? Math.min(ContentPreviewViewer.this.containerView.getWidth(), ContentPreviewViewer.this.containerView.getHeight() - i8) - AndroidUtilities.dpf2(40.0f) : Math.min(ContentPreviewViewer.this.containerView.getWidth(), ContentPreviewViewer.this.containerView.getHeight() - i8) / 1.8f)) / 2))) + AndroidUtilities.dp(24.0f);
                    if (ContentPreviewViewer.this.drawEffect) {
                        max += AndroidUtilities.dp(24.0f);
                    }
                    ContentPreviewViewer contentPreviewViewer = ContentPreviewViewer.this;
                    contentPreviewViewer.popupWindow.showAtLocation(contentPreviewViewer.containerView, 0, (int) ((ContentPreviewViewer.this.containerView.getMeasuredWidth() - actionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), max);
                    ContentPreviewViewer.this.containerView.performHapticFeedback(0);
                    return;
                }
                ContentPreviewViewer.this.showUnlockPremiumView();
                ContentPreviewViewer.this.menuVisible = true;
                ContentPreviewViewer.this.containerView.invalidate();
                ContentPreviewViewer.this.containerView.performHapticFeedback(0);
            } else if (ContentPreviewViewer.this.currentContentType != 2 || ContentPreviewViewer.this.delegate == null) {
                if (ContentPreviewViewer.this.delegate != null) {
                    ContentPreviewViewer.this.menuVisible = true;
                    ContentPreviewViewer.this.containerView.invalidate();
                    ArrayList arrayList4 = new ArrayList();
                    final ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    if (ContentPreviewViewer.this.delegate.needSend(ContentPreviewViewer.this.currentContentType) && !ContentPreviewViewer.this.delegate.isInScheduleMode()) {
                        arrayList4.add(LocaleController.getString("SendGifPreview", R.string.SendGifPreview));
                        arrayList6.add(Integer.valueOf(R.drawable.msg_send));
                        arrayList5.add(0);
                    }
                    if (ContentPreviewViewer.this.delegate.needSend(ContentPreviewViewer.this.currentContentType) && !ContentPreviewViewer.this.delegate.isInScheduleMode()) {
                        arrayList4.add(LocaleController.getString("SendWithoutSound", R.string.SendWithoutSound));
                        arrayList6.add(Integer.valueOf(R.drawable.input_notify_off));
                        arrayList5.add(4);
                    }
                    if (ContentPreviewViewer.this.delegate.canSchedule()) {
                        arrayList4.add(LocaleController.getString("Schedule", R.string.Schedule));
                        arrayList6.add(Integer.valueOf(R.drawable.msg_autodelete));
                        arrayList5.add(3);
                    }
                    if (ContentPreviewViewer.this.currentDocument != null) {
                        z = MediaDataController.getInstance(ContentPreviewViewer.this.currentAccount).hasRecentGif(ContentPreviewViewer.this.currentDocument);
                        if (z) {
                            arrayList4.add(LocaleController.formatString("Delete", R.string.Delete, new Object[0]));
                            arrayList6.add(Integer.valueOf(R.drawable.msg_delete));
                            arrayList5.add(1);
                        } else {
                            arrayList4.add(LocaleController.formatString("SaveToGIFs", R.string.SaveToGIFs, new Object[0]));
                            arrayList6.add(Integer.valueOf(R.drawable.msg_gif_add));
                            arrayList5.add(2);
                        }
                    } else {
                        z = false;
                    }
                    if (arrayList4.isEmpty()) {
                        return;
                    }
                    int[] iArr2 = new int[arrayList6.size()];
                    for (int i11 = 0; i11 < arrayList6.size(); i11++) {
                        iArr2[i11] = ((Integer) arrayList6.get(i11)).intValue();
                    }
                    ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout2 = new ActionBarPopupWindow.ActionBarPopupWindowLayout(ContentPreviewViewer.this.containerView.getContext(), R.drawable.popup_fixed_alert2, ContentPreviewViewer.this.resourcesProvider);
                    View.OnClickListener onClickListener = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            ContentPreviewViewer.AnonymousClass1.this.lambda$run$3(arrayList5, view);
                        }
                    };
                    for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                        ActionBarMenuSubItem addItem2 = ActionBarMenuItem.addItem(actionBarPopupWindowLayout2, ((Integer) arrayList6.get(i12)).intValue(), (CharSequence) arrayList4.get(i12), false, ContentPreviewViewer.this.resourcesProvider);
                        addItem2.setTag(Integer.valueOf(i12));
                        addItem2.setOnClickListener(onClickListener);
                        if (z && i12 == arrayList4.size() - 1) {
                            addItem2.setColors(ContentPreviewViewer.this.getThemedColor(Theme.key_text_RedBold), ContentPreviewViewer.this.getThemedColor(Theme.key_text_RedRegular));
                        }
                    }
                    ContentPreviewViewer.this.popupWindow = new ActionBarPopupWindow(actionBarPopupWindowLayout2, -2, -2) {
                        {
                            AnonymousClass1.this = this;
                        }

                        @Override
                        public void dismiss() {
                            super.dismiss();
                            ContentPreviewViewer contentPreviewViewer2 = ContentPreviewViewer.this;
                            contentPreviewViewer2.popupWindow = null;
                            contentPreviewViewer2.menuVisible = false;
                            if (ContentPreviewViewer.this.closeOnDismiss) {
                                ContentPreviewViewer.this.close();
                            }
                        }
                    };
                    ContentPreviewViewer.this.popupWindow.setPauseNotifications(true);
                    ContentPreviewViewer.this.popupWindow.setDismissAnimationDuration(ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                    ContentPreviewViewer.this.popupWindow.setScaleOut(true);
                    ContentPreviewViewer.this.popupWindow.setOutsideTouchable(true);
                    ContentPreviewViewer.this.popupWindow.setClippingEnabled(true);
                    ContentPreviewViewer.this.popupWindow.setAnimationStyle(R.style.PopupContextAnimation);
                    ContentPreviewViewer.this.popupWindow.setFocusable(true);
                    actionBarPopupWindowLayout2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    ContentPreviewViewer.this.popupWindow.setInputMethodMode(2);
                    ContentPreviewViewer.this.popupWindow.getContentView().setFocusableInTouchMode(true);
                    if (Build.VERSION.SDK_INT >= 21 && ContentPreviewViewer.this.lastInsets != null) {
                        i2 = ContentPreviewViewer.this.lastInsets.getStableInsetBottom() + ContentPreviewViewer.this.lastInsets.getStableInsetTop();
                        i = ContentPreviewViewer.this.lastInsets.getStableInsetTop();
                    } else {
                        i = AndroidUtilities.statusBarHeight;
                        i2 = 0;
                    }
                    int min2 = Math.min(ContentPreviewViewer.this.containerView.getWidth(), ContentPreviewViewer.this.containerView.getHeight() - i2) - AndroidUtilities.dp(40.0f);
                    float f = ContentPreviewViewer.this.moveY;
                    int i13 = i + (min2 / 2);
                    int dp = ContentPreviewViewer.this.stickerEmojiLayout != null ? AndroidUtilities.dp(40.0f) : 0;
                    ContentPreviewViewer contentPreviewViewer2 = ContentPreviewViewer.this;
                    contentPreviewViewer2.popupWindow.showAtLocation(contentPreviewViewer2.containerView, 0, (int) ((ContentPreviewViewer.this.containerView.getMeasuredWidth() - actionBarPopupWindowLayout2.getMeasuredWidth()) / 2.0f), (int) (((int) (f + Math.max(i13 + dp, ((ContentPreviewViewer.this.containerView.getHeight() - i2) - ContentPreviewViewer.this.keyboardHeight) / 2) + i3)) + (AndroidUtilities.dp(24.0f) - ContentPreviewViewer.this.moveY)));
                    ContentPreviewViewer.this.containerView.performHapticFeedback(0);
                    if (ContentPreviewViewer.this.moveY != 0.0f) {
                        if (ContentPreviewViewer.this.finalMoveY == 0.0f) {
                            ContentPreviewViewer.this.finalMoveY = 0.0f;
                            ContentPreviewViewer contentPreviewViewer3 = ContentPreviewViewer.this;
                            contentPreviewViewer3.startMoveY = contentPreviewViewer3.moveY;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                ContentPreviewViewer.AnonymousClass1.this.lambda$run$4(valueAnimator);
                            }
                        });
                        ofFloat.setDuration(350L);
                        ofFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
                        ofFloat.start();
                    }
                }
            } else {
                ContentPreviewViewer.this.menuVisible = true;
                ContentPreviewViewer.this.containerView.invalidate();
                ArrayList arrayList7 = new ArrayList();
                final ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                if (ContentPreviewViewer.this.delegate.needSend(ContentPreviewViewer.this.currentContentType)) {
                    arrayList7.add(LocaleController.getString("SendEmojiPreview", R.string.SendEmojiPreview));
                    arrayList9.add(Integer.valueOf(R.drawable.msg_send));
                    arrayList8.add(0);
                }
                Boolean canSetAsStatus = ContentPreviewViewer.this.delegate.canSetAsStatus(ContentPreviewViewer.this.currentDocument);
                if (canSetAsStatus != null) {
                    if (canSetAsStatus.booleanValue()) {
                        arrayList7.add(LocaleController.getString("SetAsEmojiStatus", R.string.SetAsEmojiStatus));
                        arrayList9.add(Integer.valueOf(R.drawable.msg_smile_status));
                        arrayList8.add(1);
                    } else {
                        arrayList7.add(LocaleController.getString("RemoveStatus", R.string.RemoveStatus));
                        arrayList9.add(Integer.valueOf(R.drawable.msg_smile_status));
                        arrayList8.add(2);
                    }
                }
                if (ContentPreviewViewer.this.delegate.needCopy(ContentPreviewViewer.this.currentDocument)) {
                    arrayList7.add(LocaleController.getString("CopyEmojiPreview", R.string.CopyEmojiPreview));
                    arrayList9.add(Integer.valueOf(R.drawable.msg_copy));
                    arrayList8.add(3);
                }
                if (ContentPreviewViewer.this.delegate.needRemoveFromRecent(ContentPreviewViewer.this.currentDocument)) {
                    arrayList7.add(LocaleController.getString("RemoveFromRecent", R.string.RemoveFromRecent));
                    arrayList9.add(Integer.valueOf(R.drawable.msg_delete));
                    arrayList8.add(4);
                }
                final boolean isStickerInFavorites2 = MediaDataController.getInstance(ContentPreviewViewer.this.currentAccount).isStickerInFavorites(ContentPreviewViewer.this.currentDocument);
                if (!MessageObject.isAnimatedEmoji(ContentPreviewViewer.this.currentDocument) && !MessageObject.isMaskDocument(ContentPreviewViewer.this.currentDocument) && (isStickerInFavorites2 || (MediaDataController.getInstance(ContentPreviewViewer.this.currentAccount).canAddStickerToFavorites() && MessageObject.isStickerHasSet(ContentPreviewViewer.this.currentDocument)))) {
                    arrayList7.add(isStickerInFavorites2 ? LocaleController.getString("DeleteFromFavorites", R.string.DeleteFromFavorites) : LocaleController.getString("AddToFavorites", R.string.AddToFavorites));
                    arrayList9.add(Integer.valueOf(isStickerInFavorites2 ? R.drawable.msg_unfave : R.drawable.msg_fave));
                    arrayList8.add(5);
                }
                if (arrayList7.isEmpty()) {
                    return;
                }
                int[] iArr3 = new int[arrayList9.size()];
                for (int i14 = 0; i14 < arrayList9.size(); i14++) {
                    iArr3[i14] = ((Integer) arrayList9.get(i14)).intValue();
                }
                ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout3 = new ActionBarPopupWindow.ActionBarPopupWindowLayout(ContentPreviewViewer.this.containerView.getContext(), R.drawable.popup_fixed_alert2, ContentPreviewViewer.this.resourcesProvider);
                View.OnClickListener onClickListener2 = new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        ContentPreviewViewer.AnonymousClass1.this.lambda$run$0(arrayList8, isStickerInFavorites2, view);
                    }
                };
                int i15 = 0;
                while (i15 < arrayList7.size()) {
                    ActionBarMenuSubItem addItem3 = ActionBarMenuItem.addItem(i15 == 0, i15 == arrayList7.size() - 1, actionBarPopupWindowLayout3, ((Integer) arrayList9.get(i15)).intValue(), (CharSequence) arrayList7.get(i15), false, ContentPreviewViewer.this.resourcesProvider);
                    if (((Integer) arrayList8.get(i15)).intValue() == 4) {
                        addItem3.setIconColor(ContentPreviewViewer.this.getThemedColor(Theme.key_text_RedRegular));
                        addItem3.setTextColor(ContentPreviewViewer.this.getThemedColor(Theme.key_text_RedBold));
                    }
                    addItem3.setTag(Integer.valueOf(i15));
                    addItem3.setOnClickListener(onClickListener2);
                    i15++;
                }
                ContentPreviewViewer.this.popupWindow = new ActionBarPopupWindow(actionBarPopupWindowLayout3, -2, -2) {
                    {
                        AnonymousClass1.this = this;
                    }

                    @Override
                    public void dismiss() {
                        super.dismiss();
                        ContentPreviewViewer contentPreviewViewer4 = ContentPreviewViewer.this;
                        contentPreviewViewer4.popupWindow = null;
                        contentPreviewViewer4.menuVisible = false;
                        if (ContentPreviewViewer.this.closeOnDismiss) {
                            ContentPreviewViewer.this.close();
                        }
                    }
                };
                ContentPreviewViewer.this.popupWindow.setPauseNotifications(true);
                ContentPreviewViewer.this.popupWindow.setDismissAnimationDuration(ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                ContentPreviewViewer.this.popupWindow.setScaleOut(true);
                ContentPreviewViewer.this.popupWindow.setOutsideTouchable(true);
                ContentPreviewViewer.this.popupWindow.setClippingEnabled(true);
                ContentPreviewViewer.this.popupWindow.setAnimationStyle(R.style.PopupContextAnimation);
                ContentPreviewViewer.this.popupWindow.setFocusable(true);
                actionBarPopupWindowLayout3.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                ContentPreviewViewer.this.popupWindow.setInputMethodMode(2);
                ContentPreviewViewer.this.popupWindow.getContentView().setFocusableInTouchMode(true);
                if (Build.VERSION.SDK_INT >= 21 && ContentPreviewViewer.this.lastInsets != null) {
                    i5 = ContentPreviewViewer.this.lastInsets.getStableInsetBottom() + ContentPreviewViewer.this.lastInsets.getStableInsetTop();
                    i4 = ContentPreviewViewer.this.lastInsets.getStableInsetTop();
                } else {
                    i4 = AndroidUtilities.statusBarHeight;
                    i5 = 0;
                }
                int min3 = Math.min(ContentPreviewViewer.this.containerView.getWidth(), ContentPreviewViewer.this.containerView.getHeight() - i5) - AndroidUtilities.dp(40.0f);
                float f2 = ContentPreviewViewer.this.moveY;
                int i16 = i4 + (min3 / 2);
                int dp2 = ContentPreviewViewer.this.stickerEmojiLayout != null ? AndroidUtilities.dp(40.0f) : 0;
                ContentPreviewViewer contentPreviewViewer4 = ContentPreviewViewer.this;
                contentPreviewViewer4.popupWindow.showAtLocation(contentPreviewViewer4.containerView, 0, (int) ((ContentPreviewViewer.this.containerView.getMeasuredWidth() - actionBarPopupWindowLayout3.getMeasuredWidth()) / 2.0f), (int) (((int) (f2 + Math.max(i16 + dp2, ((ContentPreviewViewer.this.containerView.getHeight() - i5) - ContentPreviewViewer.this.keyboardHeight) / 2) + i6)) + (AndroidUtilities.dp(24.0f) - ContentPreviewViewer.this.moveY)));
                ActionBarPopupWindow.startAnimation(actionBarPopupWindowLayout3);
                ContentPreviewViewer.this.containerView.performHapticFeedback(0);
                if (ContentPreviewViewer.this.moveY != 0.0f) {
                    if (ContentPreviewViewer.this.finalMoveY == 0.0f) {
                        ContentPreviewViewer.this.finalMoveY = 0.0f;
                        ContentPreviewViewer contentPreviewViewer5 = ContentPreviewViewer.this;
                        contentPreviewViewer5.startMoveY = contentPreviewViewer5.moveY;
                    }
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ContentPreviewViewer.AnonymousClass1.this.lambda$run$1(valueAnimator);
                        }
                    });
                    ofFloat2.setDuration(350L);
                    ofFloat2.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    ofFloat2.start();
                }
            }
        }

        class View$OnClickListenerC00351 implements View.OnClickListener {
            final ArrayList val$actions;
            final boolean val$inFavs;

            View$OnClickListenerC00351(ArrayList arrayList, boolean z) {
                AnonymousClass1.this = r1;
                this.val$actions = arrayList;
                this.val$inFavs = z;
            }

            @Override
            public void onClick(View view) {
                if (ContentPreviewViewer.this.parentActivity == null) {
                    return;
                }
                int intValue = ((Integer) view.getTag()).intValue();
                if (((Integer) this.val$actions.get(intValue)).intValue() == 0 || ((Integer) this.val$actions.get(intValue)).intValue() == 6) {
                    if (ContentPreviewViewer.this.delegate != null) {
                        ContentPreviewViewer.this.delegate.sendSticker(ContentPreviewViewer.this.currentDocument, ContentPreviewViewer.this.currentQuery, ContentPreviewViewer.this.parentObject, ((Integer) this.val$actions.get(intValue)).intValue() == 0, 0);
                    }
                } else if (((Integer) this.val$actions.get(intValue)).intValue() == 1) {
                    if (ContentPreviewViewer.this.delegate != null) {
                        ContentPreviewViewer.this.delegate.openSet(ContentPreviewViewer.this.currentStickerSet, ContentPreviewViewer.this.clearsInputField);
                    }
                } else if (((Integer) this.val$actions.get(intValue)).intValue() == 2) {
                    MediaDataController.getInstance(ContentPreviewViewer.this.currentAccount).addRecentSticker(2, ContentPreviewViewer.this.parentObject, ContentPreviewViewer.this.currentDocument, (int) (System.currentTimeMillis() / 1000), this.val$inFavs);
                } else if (((Integer) this.val$actions.get(intValue)).intValue() == 3) {
                    final TLRPC$Document tLRPC$Document = ContentPreviewViewer.this.currentDocument;
                    final Object obj = ContentPreviewViewer.this.parentObject;
                    final String str = ContentPreviewViewer.this.currentQuery;
                    final ContentPreviewViewerDelegate contentPreviewViewerDelegate = ContentPreviewViewer.this.delegate;
                    if (contentPreviewViewerDelegate == null) {
                        return;
                    }
                    AlertsCreator.createScheduleDatePickerDialog(ContentPreviewViewer.this.parentActivity, contentPreviewViewerDelegate.getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() {
                        @Override
                        public final void didSelectDate(boolean z, int i) {
                            ContentPreviewViewer.ContentPreviewViewerDelegate.this.sendSticker(tLRPC$Document, str, obj, z, i);
                        }
                    });
                } else if (((Integer) this.val$actions.get(intValue)).intValue() == 4) {
                    MediaDataController.getInstance(ContentPreviewViewer.this.currentAccount).addRecentSticker(0, ContentPreviewViewer.this.parentObject, ContentPreviewViewer.this.currentDocument, (int) (System.currentTimeMillis() / 1000), true);
                } else if (((Integer) this.val$actions.get(intValue)).intValue() == 5) {
                    ContentPreviewViewer.this.delegate.remove(ContentPreviewViewer.this.importingSticker);
                }
                ActionBarPopupWindow actionBarPopupWindow = ContentPreviewViewer.this.popupWindow;
                if (actionBarPopupWindow != null) {
                    actionBarPopupWindow.dismiss();
                }
            }
        }

        public void lambda$run$0(ArrayList arrayList, boolean z, View view) {
            if (ContentPreviewViewer.this.parentActivity == null || ContentPreviewViewer.this.delegate == null) {
                return;
            }
            int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
            if (intValue == 0) {
                ContentPreviewViewer.this.delegate.sendEmoji(ContentPreviewViewer.this.currentDocument);
            } else if (intValue == 1) {
                ContentPreviewViewer.this.delegate.setAsEmojiStatus(ContentPreviewViewer.this.currentDocument, null);
            } else if (intValue == 2) {
                ContentPreviewViewer.this.delegate.setAsEmojiStatus(null, null);
            } else if (intValue == 3) {
                ContentPreviewViewer.this.delegate.copyEmoji(ContentPreviewViewer.this.currentDocument);
            } else if (intValue == 4) {
                ContentPreviewViewer.this.delegate.removeFromRecent(ContentPreviewViewer.this.currentDocument);
            } else if (intValue == 5) {
                MediaDataController.getInstance(ContentPreviewViewer.this.currentAccount).addRecentSticker(2, ContentPreviewViewer.this.parentObject, ContentPreviewViewer.this.currentDocument, (int) (System.currentTimeMillis() / 1000), z);
            }
            ActionBarPopupWindow actionBarPopupWindow = ContentPreviewViewer.this.popupWindow;
            if (actionBarPopupWindow != null) {
                actionBarPopupWindow.dismiss();
            }
        }

        public void lambda$run$1(ValueAnimator valueAnimator) {
            ContentPreviewViewer.this.currentMoveYProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ContentPreviewViewer contentPreviewViewer = ContentPreviewViewer.this;
            contentPreviewViewer.moveY = contentPreviewViewer.startMoveY + ((ContentPreviewViewer.this.finalMoveY - ContentPreviewViewer.this.startMoveY) * ContentPreviewViewer.this.currentMoveYProgress);
            ContentPreviewViewer.this.containerView.invalidate();
        }

        public void lambda$run$3(ArrayList arrayList, View view) {
            if (ContentPreviewViewer.this.parentActivity == null) {
                return;
            }
            int intValue = ((Integer) view.getTag()).intValue();
            if (((Integer) arrayList.get(intValue)).intValue() == 0) {
                ContentPreviewViewer.this.delegate.sendGif(ContentPreviewViewer.this.currentDocument != null ? ContentPreviewViewer.this.currentDocument : ContentPreviewViewer.this.inlineResult, ContentPreviewViewer.this.parentObject, true, 0);
            } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
                ContentPreviewViewer.this.delegate.sendGif(ContentPreviewViewer.this.currentDocument != null ? ContentPreviewViewer.this.currentDocument : ContentPreviewViewer.this.inlineResult, ContentPreviewViewer.this.parentObject, false, 0);
            } else if (((Integer) arrayList.get(intValue)).intValue() == 1) {
                MediaDataController.getInstance(ContentPreviewViewer.this.currentAccount).removeRecentGif(ContentPreviewViewer.this.currentDocument);
                ContentPreviewViewer.this.delegate.gifAddedOrDeleted();
            } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
                MediaDataController.getInstance(ContentPreviewViewer.this.currentAccount).addRecentGif(ContentPreviewViewer.this.currentDocument, (int) (System.currentTimeMillis() / 1000), true);
                MessagesController.getInstance(ContentPreviewViewer.this.currentAccount).saveGif("gif", ContentPreviewViewer.this.currentDocument);
                ContentPreviewViewer.this.delegate.gifAddedOrDeleted();
            } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
                final TLRPC$Document tLRPC$Document = ContentPreviewViewer.this.currentDocument;
                final TLRPC$BotInlineResult tLRPC$BotInlineResult = ContentPreviewViewer.this.inlineResult;
                final Object obj = ContentPreviewViewer.this.parentObject;
                final ContentPreviewViewerDelegate contentPreviewViewerDelegate = ContentPreviewViewer.this.delegate;
                AlertsCreator.createScheduleDatePickerDialog(ContentPreviewViewer.this.parentActivity, contentPreviewViewerDelegate.getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() {
                    @Override
                    public final void didSelectDate(boolean z, int i) {
                        ContentPreviewViewer.AnonymousClass1.lambda$run$2(ContentPreviewViewer.ContentPreviewViewerDelegate.this, tLRPC$Document, tLRPC$BotInlineResult, obj, z, i);
                    }
                }, ContentPreviewViewer.this.resourcesProvider);
            }
            ActionBarPopupWindow actionBarPopupWindow = ContentPreviewViewer.this.popupWindow;
            if (actionBarPopupWindow != null) {
                actionBarPopupWindow.dismiss();
            }
        }

        public static void lambda$run$2(ContentPreviewViewerDelegate contentPreviewViewerDelegate, TLRPC$Document tLRPC$Document, TLRPC$BotInlineResult tLRPC$BotInlineResult, Object obj, boolean z, int i) {
            if (tLRPC$Document == null) {
                tLRPC$Document = tLRPC$BotInlineResult;
            }
            contentPreviewViewerDelegate.sendGif(tLRPC$Document, obj, z, i);
        }

        public void lambda$run$4(ValueAnimator valueAnimator) {
            ContentPreviewViewer.this.currentMoveYProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ContentPreviewViewer contentPreviewViewer = ContentPreviewViewer.this;
            contentPreviewViewer.moveY = contentPreviewViewer.startMoveY + ((ContentPreviewViewer.this.finalMoveY - ContentPreviewViewer.this.startMoveY) * ContentPreviewViewer.this.currentMoveYProgress);
            ContentPreviewViewer.this.containerView.invalidate();
        }
    }

    public void showUnlockPremiumView() {
        if (this.unlockPremiumView == null) {
            UnlockPremiumView unlockPremiumView = new UnlockPremiumView(this.containerView.getContext(), 0, this.resourcesProvider);
            this.unlockPremiumView = unlockPremiumView;
            this.containerView.addView(unlockPremiumView, LayoutHelper.createFrame(-1, -1.0f));
            this.unlockPremiumView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    ContentPreviewViewer.this.lambda$showUnlockPremiumView$0(view);
                }
            });
            this.unlockPremiumView.premiumButtonView.buttonLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    ContentPreviewViewer.this.lambda$showUnlockPremiumView$1(view);
                }
            });
        }
        AndroidUtilities.updateViewVisibilityAnimated(this.unlockPremiumView, false, 1.0f, false);
        AndroidUtilities.updateViewVisibilityAnimated(this.unlockPremiumView, true);
        this.unlockPremiumView.setTranslationY(0.0f);
    }

    public void lambda$showUnlockPremiumView$0(View view) {
        this.menuVisible = false;
        this.containerView.invalidate();
        close();
    }

    public void lambda$showUnlockPremiumView$1(View view) {
        Activity activity = this.parentActivity;
        if (activity instanceof LaunchActivity) {
            LaunchActivity launchActivity = (LaunchActivity) activity;
            if (launchActivity.getActionBarLayout() != null && launchActivity.getActionBarLayout().getLastFragment() != null) {
                launchActivity.getActionBarLayout().getLastFragment().dismissCurrentDialog();
            }
            launchActivity.lambda$runLinkRequest$80(new PremiumPreviewFragment(PremiumPreviewFragment.featureTypeToServerString(5)));
        }
        this.menuVisible = false;
        this.containerView.invalidate();
        close();
    }

    public static ContentPreviewViewer getInstance() {
        ContentPreviewViewer contentPreviewViewer = Instance;
        if (contentPreviewViewer == null) {
            synchronized (PhotoViewer.class) {
                contentPreviewViewer = Instance;
                if (contentPreviewViewer == null) {
                    contentPreviewViewer = new ContentPreviewViewer();
                    Instance = contentPreviewViewer;
                }
            }
        }
        return contentPreviewViewer;
    }

    public static boolean hasInstance() {
        return Instance != null;
    }

    public void reset() {
        Runnable runnable = this.openPreviewRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.openPreviewRunnable = null;
        }
        View view = this.currentPreviewCell;
        if (view != null) {
            if (view instanceof StickerEmojiCell) {
                ((StickerEmojiCell) view).setScaled(false);
            } else if (view instanceof StickerCell) {
                ((StickerCell) view).setScaled(false);
            } else if (view instanceof ContextLinkCell) {
                ((ContextLinkCell) view).setScaled(false);
            }
            this.currentPreviewCell = null;
        }
    }

    public boolean onTouch(android.view.MotionEvent r16, final org.telegram.ui.Components.RecyclerListView r17, int r18, final java.lang.Object r19, org.telegram.ui.ContentPreviewViewer.ContentPreviewViewerDelegate r20, org.telegram.ui.ActionBar.Theme.ResourcesProvider r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ContentPreviewViewer.onTouch(android.view.MotionEvent, org.telegram.ui.Components.RecyclerListView, int, java.lang.Object, org.telegram.ui.ContentPreviewViewer$ContentPreviewViewerDelegate, org.telegram.ui.ActionBar.Theme$ResourcesProvider):boolean");
    }

    public static void lambda$onTouch$2(RecyclerListView recyclerListView, Object obj) {
        if (recyclerListView instanceof RecyclerListView) {
            recyclerListView.setOnItemClickListener((RecyclerListView.OnItemClickListener) obj);
        }
    }

    protected void runSmoothHaptic() {
        if (Build.VERSION.SDK_INT >= 26) {
            Vibrator vibrator = (Vibrator) this.containerView.getContext().getSystemService("vibrator");
            if (this.vibrationEffect == null) {
                this.vibrationEffect = VibrationEffect.createWaveform(new long[]{0, 2}, -1);
            }
            vibrator.cancel();
            vibrator.vibrate(this.vibrationEffect);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent, final RecyclerListView recyclerListView, int i, ContentPreviewViewerDelegate contentPreviewViewerDelegate, final Theme.ResourcesProvider resourcesProvider) {
        this.delegate = contentPreviewViewerDelegate;
        if ((contentPreviewViewerDelegate == null || contentPreviewViewerDelegate.can()) && motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int childCount = recyclerListView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerListView.getChildAt(i2);
                if (childAt == null) {
                    return false;
                }
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                int left = childAt.getLeft();
                int right = childAt.getRight();
                if (top <= y && bottom >= y && left <= x && right >= x) {
                    final int i3 = 2;
                    if (childAt instanceof StickerEmojiCell) {
                        if (((StickerEmojiCell) childAt).showingBitmap()) {
                            this.centerImage.setRoundRadius(0);
                            i3 = 0;
                        }
                        i3 = -1;
                    } else if (childAt instanceof StickerCell) {
                        if (((StickerCell) childAt).showingBitmap()) {
                            this.centerImage.setRoundRadius(0);
                            i3 = 0;
                        }
                        i3 = -1;
                    } else if (childAt instanceof ContextLinkCell) {
                        ContextLinkCell contextLinkCell = (ContextLinkCell) childAt;
                        if (contextLinkCell.showingBitmap()) {
                            if (contextLinkCell.isSticker()) {
                                this.centerImage.setRoundRadius(0);
                                i3 = 0;
                            } else if (contextLinkCell.isGif()) {
                                this.centerImage.setRoundRadius(AndroidUtilities.dp(6.0f));
                                i3 = 1;
                            }
                        }
                        i3 = -1;
                    } else if (childAt instanceof EmojiPacksAlert.EmojiImageView) {
                        this.centerImage.setRoundRadius(0);
                    } else if ((childAt instanceof EmojiView.ImageViewEmoji) && ((EmojiView.ImageViewEmoji) childAt).getSpan() != null) {
                        this.centerImage.setRoundRadius(0);
                    } else {
                        if ((childAt instanceof SuggestEmojiView.EmojiImageView) && (((SuggestEmojiView.EmojiImageView) childAt).drawable instanceof AnimatedEmojiDrawable)) {
                            this.centerImage.setRoundRadius(0);
                        }
                        i3 = -1;
                    }
                    if (i3 == -1) {
                        return false;
                    }
                    this.startX = x;
                    this.startY = y;
                    this.currentPreviewCell = childAt;
                    Runnable runnable = new Runnable() {
                        @Override
                        public final void run() {
                            ContentPreviewViewer.this.lambda$onInterceptTouchEvent$3(recyclerListView, i3, resourcesProvider);
                        }
                    };
                    this.openPreviewRunnable = runnable;
                    AndroidUtilities.runOnUIThread(runnable, 200L);
                    return true;
                }
            }
        }
        return false;
    }

    public void lambda$onInterceptTouchEvent$3(RecyclerListView recyclerListView, int i, Theme.ResourcesProvider resourcesProvider) {
        TLRPC$Document tLRPC$Document;
        if (this.openPreviewRunnable == null) {
            return;
        }
        recyclerListView.setOnItemClickListener((RecyclerListView.OnItemClickListener) null);
        boolean z = true;
        recyclerListView.requestDisallowInterceptTouchEvent(true);
        this.openPreviewRunnable = null;
        setParentActivity(AndroidUtilities.findActivity(recyclerListView.getContext()));
        this.clearsInputField = false;
        View view = this.currentPreviewCell;
        if (view instanceof StickerEmojiCell) {
            StickerEmojiCell stickerEmojiCell = (StickerEmojiCell) view;
            TLRPC$Document sticker = stickerEmojiCell.getSticker();
            SendMessagesHelper.ImportingSticker stickerPath = stickerEmojiCell.getStickerPath();
            String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(stickerEmojiCell.getSticker(), null, Integer.valueOf(this.currentAccount));
            ContentPreviewViewerDelegate contentPreviewViewerDelegate = this.delegate;
            open(sticker, stickerPath, findAnimatedEmojiEmoticon, contentPreviewViewerDelegate != null ? contentPreviewViewerDelegate.getQuery(false) : null, null, i, stickerEmojiCell.isRecent(), stickerEmojiCell.getParentObject(), this.resourcesProvider);
            stickerEmojiCell.setScaled(true);
        } else if (view instanceof StickerCell) {
            StickerCell stickerCell = (StickerCell) view;
            TLRPC$Document sticker2 = stickerCell.getSticker();
            ContentPreviewViewerDelegate contentPreviewViewerDelegate2 = this.delegate;
            open(sticker2, null, null, contentPreviewViewerDelegate2 != null ? contentPreviewViewerDelegate2.getQuery(false) : null, null, i, false, stickerCell.getParentObject(), resourcesProvider);
            stickerCell.setScaled(true);
            this.clearsInputField = stickerCell.isClearsInputField();
        } else if (view instanceof ContextLinkCell) {
            ContextLinkCell contextLinkCell = (ContextLinkCell) view;
            TLRPC$Document document = contextLinkCell.getDocument();
            ContentPreviewViewerDelegate contentPreviewViewerDelegate3 = this.delegate;
            open(document, null, null, contentPreviewViewerDelegate3 != null ? contentPreviewViewerDelegate3.getQuery(true) : null, contextLinkCell.getBotInlineResult(), i, false, contextLinkCell.getBotInlineResult() != null ? contextLinkCell.getInlineBot() : contextLinkCell.getParentObject(), resourcesProvider);
            if (i != 1) {
                contextLinkCell.setScaled(true);
            }
        } else if (view instanceof EmojiPacksAlert.EmojiImageView) {
            TLRPC$Document document2 = ((EmojiPacksAlert.EmojiImageView) view).getDocument();
            if (document2 != null) {
                open(document2, null, MessageObject.findAnimatedEmojiEmoticon(document2, null, Integer.valueOf(this.currentAccount)), null, null, i, false, null, resourcesProvider);
            }
            z = false;
        } else if (view instanceof EmojiView.ImageViewEmoji) {
            AnimatedEmojiSpan span = ((EmojiView.ImageViewEmoji) view).getSpan();
            if (span != null) {
                tLRPC$Document = span.document;
                if (tLRPC$Document == null) {
                    tLRPC$Document = AnimatedEmojiDrawable.findDocument(this.currentAccount, span.getDocumentId());
                }
            } else {
                tLRPC$Document = null;
            }
            if (tLRPC$Document != null) {
                open(tLRPC$Document, null, MessageObject.findAnimatedEmojiEmoticon(tLRPC$Document, null, Integer.valueOf(this.currentAccount)), null, null, i, false, null, resourcesProvider);
            }
            z = false;
        } else {
            if (view instanceof SuggestEmojiView.EmojiImageView) {
                Drawable drawable = ((SuggestEmojiView.EmojiImageView) view).drawable;
                TLRPC$Document document3 = drawable instanceof AnimatedEmojiDrawable ? ((AnimatedEmojiDrawable) drawable).getDocument() : null;
                if (document3 != null) {
                    open(document3, null, MessageObject.findAnimatedEmojiEmoticon(document3, null, Integer.valueOf(this.currentAccount)), null, null, i, false, null, resourcesProvider);
                }
            }
            z = false;
        }
        if (z) {
            this.currentPreviewCell.performHapticFeedback(0, 2);
            ContentPreviewViewerDelegate contentPreviewViewerDelegate4 = this.delegate;
            if (contentPreviewViewerDelegate4 != null) {
                contentPreviewViewerDelegate4.resetTouch();
            }
        }
    }

    public void setParentActivity(Activity activity) {
        int i = UserConfig.selectedAccount;
        this.currentAccount = i;
        this.centerImage.setCurrentAccount(i);
        this.centerImage.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        this.effectImage.setCurrentAccount(this.currentAccount);
        this.effectImage.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        if (this.parentActivity == activity) {
            return;
        }
        this.parentActivity = activity;
        this.slideUpDrawable = activity.getResources().getDrawable(R.drawable.preview_arrow);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.windowView = frameLayout;
        frameLayout.setFocusable(true);
        this.windowView.setFocusableInTouchMode(true);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            this.windowView.setFitsSystemWindows(true);
            this.windowView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
                @Override
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    WindowInsets lambda$setParentActivity$4;
                    lambda$setParentActivity$4 = ContentPreviewViewer.this.lambda$setParentActivity$4(view, windowInsets);
                    return lambda$setParentActivity$4;
                }
            });
        }
        FrameLayoutDrawer frameLayoutDrawer = new FrameLayoutDrawer(activity) {
            {
                ContentPreviewViewer.this = this;
            }

            @Override
            protected void onAttachedToWindow() {
                super.onAttachedToWindow();
                ContentPreviewViewer.this.centerImage.onAttachedToWindow();
                ContentPreviewViewer.this.effectImage.onAttachedToWindow();
            }

            @Override
            protected void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                ContentPreviewViewer.this.centerImage.onDetachedFromWindow();
                ContentPreviewViewer.this.effectImage.onDetachedFromWindow();
            }
        };
        this.containerView = frameLayoutDrawer;
        frameLayoutDrawer.setFocusable(false);
        this.windowView.addView(this.containerView, LayoutHelper.createFrame(-1, -1, 51));
        this.containerView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean lambda$setParentActivity$5;
                lambda$setParentActivity$5 = ContentPreviewViewer.this.lambda$setParentActivity$5(view, motionEvent);
                return lambda$setParentActivity$5;
            }
        });
        MessagesController.getInstance(this.currentAccount);
        this.keyboardHeight = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.windowLayoutParams = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 48;
        layoutParams.type = 99;
        if (i2 >= 21) {
            layoutParams.flags = -2147417848;
        } else {
            layoutParams.flags = 8;
        }
        this.centerImage.setAspectFit(true);
        this.centerImage.setInvalidateAll(true);
        this.centerImage.setParentView(this.containerView);
        this.effectImage.setAspectFit(true);
        this.effectImage.setInvalidateAll(true);
        this.effectImage.setParentView(this.containerView);
    }

    public WindowInsets lambda$setParentActivity$4(View view, WindowInsets windowInsets) {
        this.lastInsets = windowInsets;
        return windowInsets;
    }

    public boolean lambda$setParentActivity$5(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 6 || motionEvent.getAction() == 3) {
            close();
        }
        return true;
    }

    public void open(TLRPC$Document tLRPC$Document, SendMessagesHelper.ImportingSticker importingSticker, String str, String str2, TLRPC$BotInlineResult tLRPC$BotInlineResult, int i, boolean z, Object obj, Theme.ResourcesProvider resourcesProvider) {
        TLRPC$InputStickerSet tLRPC$InputStickerSet;
        ContentPreviewViewerDelegate contentPreviewViewerDelegate;
        TLRPC$InputStickerSet tLRPC$InputStickerSet2;
        if (this.parentActivity == null || this.windowView == null) {
            return;
        }
        this.resourcesProvider = resourcesProvider;
        this.isRecentSticker = z;
        this.stickerEmojiLayout = null;
        this.backgroundDrawable.setColor(AndroidUtilities.isDarkColor(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider)) ? 1895825408 : 1692853990);
        this.drawEffect = false;
        this.centerImage.setColorFilter(null);
        if (i != 0 && i != 2) {
            if (tLRPC$Document != null) {
                TLRPC$PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tLRPC$Document.thumbs, 90);
                TLRPC$VideoSize documentVideoThumb = MessageObject.getDocumentVideoThumb(tLRPC$Document);
                ImageLocation forDocument = ImageLocation.getForDocument(tLRPC$Document);
                forDocument.imageType = 2;
                if (documentVideoThumb != null) {
                    this.centerImage.setImage(forDocument, null, ImageLocation.getForDocument(documentVideoThumb, tLRPC$Document), null, ImageLocation.getForDocument(closestPhotoSizeWithSize, tLRPC$Document), "90_90_b", null, tLRPC$Document.size, null, "gif" + tLRPC$Document, 0);
                } else {
                    this.centerImage.setImage(forDocument, null, ImageLocation.getForDocument(closestPhotoSizeWithSize, tLRPC$Document), "90_90_b", tLRPC$Document.size, null, "gif" + tLRPC$Document, 0);
                }
            } else if (tLRPC$BotInlineResult == null || tLRPC$BotInlineResult.content == null) {
                return;
            } else {
                TLRPC$WebDocument tLRPC$WebDocument = tLRPC$BotInlineResult.thumb;
                if ((tLRPC$WebDocument instanceof TLRPC$TL_webDocument) && "video/mp4".equals(tLRPC$WebDocument.mime_type)) {
                    this.centerImage.setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(tLRPC$BotInlineResult.content)), null, ImageLocation.getForWebFile(WebFile.createWithWebDocument(tLRPC$BotInlineResult.thumb)), null, ImageLocation.getForWebFile(WebFile.createWithWebDocument(tLRPC$BotInlineResult.thumb)), "90_90_b", null, tLRPC$BotInlineResult.content.size, null, "gif" + tLRPC$BotInlineResult, 1);
                } else {
                    this.centerImage.setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(tLRPC$BotInlineResult.content)), null, ImageLocation.getForWebFile(WebFile.createWithWebDocument(tLRPC$BotInlineResult.thumb)), "90_90_b", tLRPC$BotInlineResult.content.size, null, "gif" + tLRPC$BotInlineResult, 1);
                }
            }
            AndroidUtilities.cancelRunOnUIThread(this.showSheetRunnable);
            AndroidUtilities.runOnUIThread(this.showSheetRunnable, 2000L);
        } else if (tLRPC$Document == null && importingSticker == null) {
            return;
        } else {
            if (textPaint == null) {
                TextPaint textPaint2 = new TextPaint(1);
                textPaint = textPaint2;
                textPaint2.setTextSize(AndroidUtilities.dp(24.0f));
            }
            this.effectImage.clearImage();
            this.drawEffect = false;
            if (tLRPC$Document != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= tLRPC$Document.attributes.size()) {
                        tLRPC$InputStickerSet = null;
                        break;
                    }
                    TLRPC$DocumentAttribute tLRPC$DocumentAttribute = tLRPC$Document.attributes.get(i2);
                    if ((tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeSticker) && (tLRPC$InputStickerSet2 = tLRPC$DocumentAttribute.stickerset) != null) {
                        tLRPC$InputStickerSet = tLRPC$InputStickerSet2;
                        break;
                    }
                    i2++;
                }
                if (i == 2 && str != null) {
                    this.stickerEmojiLayout = new StaticLayout(Emoji.replaceEmoji(str, textPaint.getFontMetricsInt(), AndroidUtilities.dp(24.0f), false), textPaint, AndroidUtilities.dp(500.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                }
                if ((tLRPC$InputStickerSet != null || i == 2) && ((contentPreviewViewerDelegate = this.delegate) == null || contentPreviewViewerDelegate.needMenu())) {
                    AndroidUtilities.cancelRunOnUIThread(this.showSheetRunnable);
                    AndroidUtilities.runOnUIThread(this.showSheetRunnable, 1300L);
                }
                this.currentStickerSet = tLRPC$InputStickerSet;
                TLRPC$PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(tLRPC$Document.thumbs, 90);
                if (MessageObject.isVideoStickerDocument(tLRPC$Document)) {
                    this.centerImage.setImage(ImageLocation.getForDocument(tLRPC$Document), null, ImageLocation.getForDocument(closestPhotoSizeWithSize2, tLRPC$Document), null, null, 0L, "webp", this.currentStickerSet, 1);
                } else {
                    this.centerImage.setImage(ImageLocation.getForDocument(tLRPC$Document), (String) null, ImageLocation.getForDocument(closestPhotoSizeWithSize2, tLRPC$Document), (String) null, "webp", this.currentStickerSet, 1);
                    if (MessageObject.isPremiumSticker(tLRPC$Document)) {
                        this.drawEffect = true;
                        this.effectImage.setImage(ImageLocation.getForDocument(MessageObject.getPremiumStickerAnimation(tLRPC$Document), tLRPC$Document), (String) null, (ImageLocation) null, (String) null, "tgs", this.currentStickerSet, 1);
                    }
                }
                if (MessageObject.isTextColorEmoji(tLRPC$Document)) {
                    this.centerImage.setColorFilter(Theme.getAnimatedEmojiColorFilter(resourcesProvider));
                }
                if (this.stickerEmojiLayout == null) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= tLRPC$Document.attributes.size()) {
                            break;
                        }
                        TLRPC$DocumentAttribute tLRPC$DocumentAttribute2 = tLRPC$Document.attributes.get(i3);
                        if ((tLRPC$DocumentAttribute2 instanceof TLRPC$TL_documentAttributeSticker) && !TextUtils.isEmpty(tLRPC$DocumentAttribute2.alt)) {
                            this.stickerEmojiLayout = new StaticLayout(Emoji.replaceEmoji(tLRPC$DocumentAttribute2.alt, textPaint.getFontMetricsInt(), AndroidUtilities.dp(24.0f), false), textPaint, AndroidUtilities.dp(500.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                            break;
                        }
                        i3++;
                    }
                }
            } else if (importingSticker != null) {
                this.centerImage.setImage(importingSticker.path, null, null, importingSticker.animated ? "tgs" : null, 0L);
                if (str != null) {
                    this.stickerEmojiLayout = new StaticLayout(Emoji.replaceEmoji(str, textPaint.getFontMetricsInt(), AndroidUtilities.dp(24.0f), false), textPaint, AndroidUtilities.dp(500.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                }
                if (this.delegate.needMenu()) {
                    AndroidUtilities.cancelRunOnUIThread(this.showSheetRunnable);
                    AndroidUtilities.runOnUIThread(this.showSheetRunnable, 1300L);
                }
            }
        }
        if (this.centerImage.getLottieAnimation() != null) {
            this.centerImage.getLottieAnimation().setCurrentFrame(0);
        }
        if (this.drawEffect && this.effectImage.getLottieAnimation() != null) {
            this.effectImage.getLottieAnimation().setCurrentFrame(0);
        }
        this.currentContentType = i;
        this.currentDocument = tLRPC$Document;
        this.importingSticker = importingSticker;
        this.currentQuery = str2;
        this.inlineResult = tLRPC$BotInlineResult;
        this.parentObject = obj;
        this.resourcesProvider = resourcesProvider;
        this.containerView.invalidate();
        if (this.isVisible) {
            return;
        }
        AndroidUtilities.lockOrientation(this.parentActivity);
        try {
            if (this.windowView.getParent() != null) {
                ((WindowManager) this.parentActivity.getSystemService("window")).removeView(this.windowView);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        ((WindowManager) this.parentActivity.getSystemService("window")).addView(this.windowView, this.windowLayoutParams);
        this.isVisible = true;
        this.showProgress = 0.0f;
        this.lastTouchY = -10000.0f;
        this.currentMoveYProgress = 0.0f;
        this.finalMoveY = 0.0f;
        this.currentMoveY = 0.0f;
        this.moveY = 0.0f;
        this.lastUpdateTime = System.currentTimeMillis();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 8);
    }

    public boolean isVisible() {
        return this.isVisible;
    }

    public void closeWithMenu() {
        this.menuVisible = false;
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow != null) {
            actionBarPopupWindow.dismiss();
            this.popupWindow = null;
        }
        close();
    }

    public void close() {
        if (this.parentActivity == null || this.menuVisible) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.showSheetRunnable);
        this.showProgress = 1.0f;
        this.lastUpdateTime = System.currentTimeMillis();
        this.containerView.invalidate();
        this.currentDocument = null;
        this.currentStickerSet = null;
        this.currentQuery = null;
        this.delegate = null;
        this.isVisible = false;
        this.resourcesProvider = null;
        UnlockPremiumView unlockPremiumView = this.unlockPremiumView;
        if (unlockPremiumView != null) {
            unlockPremiumView.animate().alpha(0.0f).translationY(AndroidUtilities.dp(56.0f)).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 8);
    }

    public void clearDelegate(ContentPreviewViewerDelegate contentPreviewViewerDelegate) {
        if (this.delegate == contentPreviewViewerDelegate) {
            this.currentDocument = null;
            this.currentStickerSet = null;
            this.currentQuery = null;
            this.delegate = null;
            this.resourcesProvider = null;
            reset();
        }
    }

    public void destroy() {
        this.isVisible = false;
        this.delegate = null;
        this.currentDocument = null;
        this.currentQuery = null;
        this.currentStickerSet = null;
        if (this.parentActivity == null || this.windowView == null) {
            return;
        }
        Bitmap bitmap = this.blurrBitmap;
        if (bitmap != null) {
            bitmap.recycle();
            this.blurrBitmap = null;
        }
        this.blurProgress = 0.0f;
        this.menuVisible = false;
        try {
            if (this.windowView.getParent() != null) {
                ((WindowManager) this.parentActivity.getSystemService("window")).removeViewImmediate(this.windowView);
            }
            this.windowView = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        Instance = null;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 8);
    }

    private float rubberYPoisition(float f, float f2) {
        return (-((1.0f - (1.0f / (((Math.abs(f) * 0.55f) / f2) + 1.0f))) * f2)) * (f >= 0.0f ? -1.0f : 1.0f);
    }

    @SuppressLint({"DrawAllocation"})
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        float min;
        int i3;
        Drawable drawable;
        WindowInsets windowInsets;
        float f;
        if (this.containerView == null || this.backgroundDrawable == null) {
            return;
        }
        if (this.menuVisible && this.blurrBitmap == null) {
            prepareBlurBitmap();
        }
        if (this.blurrBitmap != null) {
            boolean z = this.menuVisible;
            if (z) {
                float f2 = this.blurProgress;
                if (f2 != 1.0f) {
                    float f3 = f2 + 0.13333334f;
                    this.blurProgress = f3;
                    if (f3 > 1.0f) {
                        this.blurProgress = 1.0f;
                    }
                    this.containerView.invalidate();
                    f = this.blurProgress;
                    if (f != 0.0f && this.blurrBitmap != null) {
                        this.paint.setAlpha((int) (f * 255.0f));
                        canvas.save();
                        canvas.scale(12.0f, 12.0f);
                        canvas.drawColor(Theme.multAlpha(Theme.getColor(Theme.key_windowBackgroundGray, this.resourcesProvider), this.blurProgress));
                        canvas.drawBitmap(this.blurrBitmap, 0.0f, 0.0f, this.paint);
                        canvas.restore();
                    }
                }
            }
            if (!z) {
                float f4 = this.blurProgress;
                if (f4 != 0.0f) {
                    float f5 = f4 - 0.13333334f;
                    this.blurProgress = f5;
                    if (f5 < 0.0f) {
                        this.blurProgress = 0.0f;
                    }
                    this.containerView.invalidate();
                }
            }
            f = this.blurProgress;
            if (f != 0.0f) {
                this.paint.setAlpha((int) (f * 255.0f));
                canvas.save();
                canvas.scale(12.0f, 12.0f);
                canvas.drawColor(Theme.multAlpha(Theme.getColor(Theme.key_windowBackgroundGray, this.resourcesProvider), this.blurProgress));
                canvas.drawBitmap(this.blurrBitmap, 0.0f, 0.0f, this.paint);
                canvas.restore();
            }
        }
        this.backgroundDrawable.setAlpha((int) (this.showProgress * 180.0f));
        this.backgroundDrawable.setBounds(0, 0, this.containerView.getWidth(), this.containerView.getHeight());
        this.backgroundDrawable.draw(canvas);
        canvas.save();
        if (Build.VERSION.SDK_INT >= 21 && (windowInsets = this.lastInsets) != null) {
            i2 = windowInsets.getStableInsetBottom() + this.lastInsets.getStableInsetTop();
            i = this.lastInsets.getStableInsetTop();
        } else {
            i = AndroidUtilities.statusBarHeight;
            i2 = 0;
        }
        if (this.currentContentType == 1) {
            i3 = Math.min(this.containerView.getWidth(), this.containerView.getHeight() - i2) - AndroidUtilities.dp(40.0f);
        } else {
            if (this.drawEffect) {
                min = Math.min(this.containerView.getWidth(), this.containerView.getHeight() - i2) - AndroidUtilities.dpf2(40.0f);
            } else {
                min = Math.min(this.containerView.getWidth(), this.containerView.getHeight() - i2) / 1.8f;
            }
            i3 = (int) min;
        }
        float max = Math.max((i3 / 2) + i + (this.stickerEmojiLayout != null ? AndroidUtilities.dp(40.0f) : 0), ((this.containerView.getHeight() - i2) - this.keyboardHeight) / 2);
        if (this.drawEffect) {
            max += AndroidUtilities.dp(40.0f);
        }
        canvas.translate(this.containerView.getWidth() / 2, this.moveY + max);
        float f6 = this.showProgress;
        int i4 = (int) (i3 * ((f6 * 0.8f) / 0.8f));
        if (this.drawEffect) {
            float f7 = i4;
            float f8 = 0.6669f * f7;
            this.centerImage.setAlpha(f6);
            float f9 = f7 - f8;
            float f10 = f7 / 2.0f;
            this.centerImage.setImageCoords((f9 - f10) - (0.0546875f * f7), (f9 / 2.0f) - f10, f8, f8);
            this.centerImage.draw(canvas);
            this.effectImage.setAlpha(this.showProgress);
            float f11 = (-i4) / 2.0f;
            this.effectImage.setImageCoords(f11, f11, f7, f7);
            this.effectImage.draw(canvas);
        } else {
            this.centerImage.setAlpha(f6);
            float f12 = (-i4) / 2.0f;
            float f13 = i4;
            this.centerImage.setImageCoords(f12, f12, f13, f13);
            this.centerImage.draw(canvas);
        }
        if (this.currentContentType == 1 && (drawable = this.slideUpDrawable) != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = this.slideUpDrawable.getIntrinsicHeight();
            int dp = (int) (this.centerImage.getDrawRegion().top - AndroidUtilities.dp(((this.currentMoveY / AndroidUtilities.dp(60.0f)) * 6.0f) + 17.0f));
            this.slideUpDrawable.setAlpha((int) ((1.0f - this.currentMoveYProgress) * 255.0f));
            this.slideUpDrawable.setBounds((-intrinsicWidth) / 2, (-intrinsicHeight) + dp, intrinsicWidth / 2, dp);
            this.slideUpDrawable.draw(canvas);
        }
        if (this.stickerEmojiLayout != null) {
            if (this.drawEffect) {
                canvas.translate(-AndroidUtilities.dp(250.0f), ((-this.effectImage.getImageHeight()) / 2.0f) - AndroidUtilities.dp(30.0f));
            } else {
                canvas.translate(-AndroidUtilities.dp(250.0f), ((-this.centerImage.getImageHeight()) / 2.0f) - AndroidUtilities.dp(30.0f));
            }
            textPaint.setAlpha((int) (this.showProgress * 255.0f));
            this.stickerEmojiLayout.draw(canvas);
        }
        canvas.restore();
        if (this.isVisible) {
            if (this.showProgress != 1.0f) {
                long currentTimeMillis = System.currentTimeMillis();
                this.lastUpdateTime = currentTimeMillis;
                this.showProgress += ((float) (currentTimeMillis - this.lastUpdateTime)) / 120.0f;
                this.containerView.invalidate();
                if (this.showProgress > 1.0f) {
                    this.showProgress = 1.0f;
                }
            }
        } else if (this.showProgress != 0.0f) {
            long currentTimeMillis2 = System.currentTimeMillis();
            this.lastUpdateTime = currentTimeMillis2;
            this.showProgress -= ((float) (currentTimeMillis2 - this.lastUpdateTime)) / 120.0f;
            this.containerView.invalidate();
            if (this.showProgress < 0.0f) {
                this.showProgress = 0.0f;
            }
            if (this.showProgress == 0.0f) {
                this.centerImage.setImageBitmap((Drawable) null);
                AndroidUtilities.unlockOrientation(this.parentActivity);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ContentPreviewViewer.this.lambda$onDraw$6();
                    }
                });
                Bitmap bitmap = this.blurrBitmap;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.blurrBitmap = null;
                }
                AndroidUtilities.updateViewVisibilityAnimated(this.unlockPremiumView, false, 1.0f, false);
                this.blurProgress = 0.0f;
                try {
                    if (this.windowView.getParent() != null) {
                        ((WindowManager) this.parentActivity.getSystemService("window")).removeView(this.windowView);
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
    }

    public void lambda$onDraw$6() {
        this.centerImage.setImageBitmap((Bitmap) null);
    }

    public int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    private void prepareBlurBitmap() {
        if (this.parentActivity == null || this.preparingBitmap) {
            return;
        }
        this.preparingBitmap = true;
        AndroidUtilities.makeGlobalBlurBitmap(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ContentPreviewViewer.this.lambda$prepareBlurBitmap$7((Bitmap) obj);
            }
        }, 12.0f);
    }

    public void lambda$prepareBlurBitmap$7(Bitmap bitmap) {
        this.blurrBitmap = bitmap;
        this.preparingBitmap = false;
        FrameLayoutDrawer frameLayoutDrawer = this.containerView;
        if (frameLayoutDrawer != null) {
            frameLayoutDrawer.invalidate();
        }
    }

    public boolean showMenuFor(View view) {
        if (view instanceof StickerEmojiCell) {
            Activity findActivity = AndroidUtilities.findActivity(view.getContext());
            if (findActivity == null) {
                return true;
            }
            setParentActivity(findActivity);
            StickerEmojiCell stickerEmojiCell = (StickerEmojiCell) view;
            TLRPC$Document sticker = stickerEmojiCell.getSticker();
            SendMessagesHelper.ImportingSticker stickerPath = stickerEmojiCell.getStickerPath();
            String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(stickerEmojiCell.getSticker(), null, Integer.valueOf(this.currentAccount));
            ContentPreviewViewerDelegate contentPreviewViewerDelegate = this.delegate;
            open(sticker, stickerPath, findAnimatedEmojiEmoticon, contentPreviewViewerDelegate != null ? contentPreviewViewerDelegate.getQuery(false) : null, null, 0, stickerEmojiCell.isRecent(), stickerEmojiCell.getParentObject(), this.resourcesProvider);
            AndroidUtilities.cancelRunOnUIThread(this.showSheetRunnable);
            AndroidUtilities.runOnUIThread(this.showSheetRunnable, 16L);
            stickerEmojiCell.setScaled(true);
            return true;
        }
        return false;
    }
}
